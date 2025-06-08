package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zaae;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.InlineMe;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;

public abstract class GoogleApi implements HasApiKey {
    @KeepForSdk
    public static class Settings {
        @KeepForSdk
        public static class Builder {
            public StatusExceptionMapper a;
            public Looper b;

            @KeepForSdk
            public Settings build() {
                if(this.a == null) {
                    this.a = new ApiExceptionMapper();
                }
                if(this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new Settings(this.a, this.b);
            }

            @KeepForSdk
            @CanIgnoreReturnValue
            public Builder setLooper(Looper looper0) {
                Preconditions.checkNotNull(looper0, "Looper must not be null.");
                this.b = looper0;
                return this;
            }

            @KeepForSdk
            @CanIgnoreReturnValue
            public Builder setMapper(StatusExceptionMapper statusExceptionMapper0) {
                Preconditions.checkNotNull(statusExceptionMapper0, "StatusExceptionMapper must not be null.");
                this.a = statusExceptionMapper0;
                return this;
            }
        }

        @KeepForSdk
        public static final Settings DEFAULT_SETTINGS;
        public final StatusExceptionMapper zaa;
        public final Looper zab;

        static {
            Settings.DEFAULT_SETTINGS = new Builder().build();
        }

        public Settings(StatusExceptionMapper statusExceptionMapper0, Looper looper0) {
            this.zaa = statusExceptionMapper0;
            this.zab = looper0;
        }
    }

    public final Context a;
    public final String b;
    public final Api c;
    public final ApiOptions d;
    public final ApiKey e;
    public final Looper f;
    public final int g;
    public final zabv h;
    public final StatusExceptionMapper i;
    public final GoogleApiManager j;

    @KeepForSdk
    public GoogleApi(Activity activity0, Api api0, ApiOptions api$ApiOptions0, Settings googleApi$Settings0) {
        this(activity0, activity0, api0, api$ApiOptions0, googleApi$Settings0);
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(Activity activity0, Api api0, ApiOptions api$ApiOptions0, StatusExceptionMapper statusExceptionMapper0) {
        Builder googleApi$Settings$Builder0 = new Builder();
        googleApi$Settings$Builder0.setMapper(statusExceptionMapper0);
        googleApi$Settings$Builder0.setLooper(activity0.getMainLooper());
        this(activity0, api0, api$ApiOptions0, googleApi$Settings$Builder0.build());
    }

    public GoogleApi(Context context0, Activity activity0, Api api0, ApiOptions api$ApiOptions0, Settings googleApi$Settings0) {
        Preconditions.checkNotNull(context0, "Null context is not permitted.");
        Preconditions.checkNotNull(api0, "Api must not be null.");
        Preconditions.checkNotNull(googleApi$Settings0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context1 = (Context)Preconditions.checkNotNull(context0.getApplicationContext(), "The provided context did not have an application context.");
        this.a = context1;
        String s = Build.VERSION.SDK_INT < 30 ? null : context0.getAttributionTag();
        this.b = s;
        this.c = api0;
        this.d = api$ApiOptions0;
        this.f = googleApi$Settings0.zab;
        ApiKey apiKey0 = ApiKey.getSharedApiKey(api0, api$ApiOptions0, s);
        this.e = apiKey0;
        this.h = new zabv(this);
        GoogleApiManager googleApiManager0 = GoogleApiManager.zak(context1);
        this.j = googleApiManager0;
        this.g = googleApiManager0.zaa();
        this.i = googleApi$Settings0.zaa;
        if(activity0 != null && !(activity0 instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            zaae.zad(activity0, googleApiManager0, apiKey0);
        }
        googleApiManager0.zaz(this);
    }

    @KeepForSdk
    @InlineMe(imports = {"com.google.android.gms.common.api.GoogleApi.Settings"}, replacement = "this(context, api, options, new Settings.Builder().setLooper(looper).setMapper(mapper).build())")
    @Deprecated
    public GoogleApi(Context context0, Api api0, ApiOptions api$ApiOptions0, Looper looper0, StatusExceptionMapper statusExceptionMapper0) {
        Builder googleApi$Settings$Builder0 = new Builder();
        googleApi$Settings$Builder0.setLooper(looper0);
        googleApi$Settings$Builder0.setMapper(statusExceptionMapper0);
        this(context0, api0, api$ApiOptions0, googleApi$Settings$Builder0.build());
    }

    @KeepForSdk
    public GoogleApi(Context context0, Api api0, ApiOptions api$ApiOptions0, Settings googleApi$Settings0) {
        this(context0, null, api0, api$ApiOptions0, googleApi$Settings0);
    }

    @KeepForSdk
    @InlineMe(imports = {"com.google.android.gms.common.api.GoogleApi.Settings"}, replacement = "this(context, api, options, new Settings.Builder().setMapper(mapper).build())")
    @Deprecated
    public GoogleApi(Context context0, Api api0, ApiOptions api$ApiOptions0, StatusExceptionMapper statusExceptionMapper0) {
        Builder googleApi$Settings$Builder0 = new Builder();
        googleApi$Settings$Builder0.setMapper(statusExceptionMapper0);
        this(context0, api0, api$ApiOptions0, googleApi$Settings$Builder0.build());
    }

    public final com.google.android.gms.common.internal.ClientSettings.Builder a() {
        Set set0;
        Account account0;
        com.google.android.gms.common.internal.ClientSettings.Builder clientSettings$Builder0 = new com.google.android.gms.common.internal.ClientSettings.Builder();
        ApiOptions api$ApiOptions0 = this.d;
        if(api$ApiOptions0 instanceof HasGoogleSignInAccountOptions) {
            GoogleSignInAccount googleSignInAccount0 = ((HasGoogleSignInAccountOptions)api$ApiOptions0).getGoogleSignInAccount();
            if(googleSignInAccount0 == null) {
                account0 = api$ApiOptions0 instanceof HasAccountOptions ? ((HasAccountOptions)api$ApiOptions0).getAccount() : null;
            }
            else {
                account0 = googleSignInAccount0.getAccount();
            }
        }
        else {
            account0 = api$ApiOptions0 instanceof HasAccountOptions ? ((HasAccountOptions)api$ApiOptions0).getAccount() : null;
        }
        clientSettings$Builder0.zab(account0);
        if(api$ApiOptions0 instanceof HasGoogleSignInAccountOptions) {
            GoogleSignInAccount googleSignInAccount1 = ((HasGoogleSignInAccountOptions)api$ApiOptions0).getGoogleSignInAccount();
            set0 = googleSignInAccount1 == null ? Collections.emptySet() : googleSignInAccount1.getRequestedScopes();
        }
        else {
            set0 = Collections.emptySet();
        }
        clientSettings$Builder0.zaa(set0);
        clientSettings$Builder0.zac(this.a.getClass().getName());
        clientSettings$Builder0.setRealClientPackageName("com.spears.civilopedia");
        return clientSettings$Builder0;
    }

    @KeepForSdk
    public GoogleApiClient asGoogleApiClient() {
        return this.h;
    }

    @KeepForSdk
    public ApiMethodImpl doBestEffortWrite(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        baseImplementation$ApiMethodImpl0.zak();
        this.j.zau(this, 2, baseImplementation$ApiMethodImpl0);
        return baseImplementation$ApiMethodImpl0;
    }

    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public Task doBestEffortWrite(TaskApiCall taskApiCall0) {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.j.zav(this, 2, taskApiCall0, taskCompletionSource0, this.i);
        return taskCompletionSource0.getTask();
    }

    @KeepForSdk
    public ApiMethodImpl doRead(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        baseImplementation$ApiMethodImpl0.zak();
        this.j.zau(this, 0, baseImplementation$ApiMethodImpl0);
        return baseImplementation$ApiMethodImpl0;
    }

    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public Task doRead(TaskApiCall taskApiCall0) {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.j.zav(this, 0, taskApiCall0, taskCompletionSource0, this.i);
        return taskCompletionSource0.getTask();
    }

    @KeepForSdk
    @ResultIgnorabilityUnspecified
    @Deprecated
    public Task doRegisterEventListener(RegisterListenerMethod registerListenerMethod0, UnregisterListenerMethod unregisterListenerMethod0) {
        Preconditions.checkNotNull(registerListenerMethod0);
        Preconditions.checkNotNull(unregisterListenerMethod0);
        Preconditions.checkNotNull(registerListenerMethod0.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(unregisterListenerMethod0.getListenerKey(), "Listener has already been released.");
        Preconditions.checkArgument(Objects.equal(registerListenerMethod0.getListenerKey(), unregisterListenerMethod0.getListenerKey()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.j.zao(this, registerListenerMethod0, unregisterListenerMethod0, zad.zaa);
    }

    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public Task doRegisterEventListener(RegistrationMethods registrationMethods0) {
        Preconditions.checkNotNull(registrationMethods0);
        Preconditions.checkNotNull(registrationMethods0.register.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(registrationMethods0.zaa.getListenerKey(), "Listener has already been released.");
        return this.j.zao(this, registrationMethods0.register, registrationMethods0.zaa, registrationMethods0.zab);
    }

    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public Task doUnregisterEventListener(ListenerKey listenerHolder$ListenerKey0) {
        return this.doUnregisterEventListener(listenerHolder$ListenerKey0, 0);
    }

    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public Task doUnregisterEventListener(ListenerKey listenerHolder$ListenerKey0, int v) {
        Preconditions.checkNotNull(listenerHolder$ListenerKey0, "Listener key cannot be null.");
        return this.j.zap(this, listenerHolder$ListenerKey0, v);
    }

    @KeepForSdk
    public ApiMethodImpl doWrite(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        baseImplementation$ApiMethodImpl0.zak();
        this.j.zau(this, 1, baseImplementation$ApiMethodImpl0);
        return baseImplementation$ApiMethodImpl0;
    }

    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public Task doWrite(TaskApiCall taskApiCall0) {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.j.zav(this, 1, taskApiCall0, taskCompletionSource0, this.i);
        return taskCompletionSource0.getTask();
    }

    @Override  // com.google.android.gms.common.api.HasApiKey
    public final ApiKey getApiKey() {
        return this.e;
    }

    @KeepForSdk
    public ApiOptions getApiOptions() {
        return this.d;
    }

    @KeepForSdk
    public Context getApplicationContext() {
        return this.a;
    }

    @KeepForSdk
    public Looper getLooper() {
        return this.f;
    }

    @KeepForSdk
    public ListenerHolder registerListener(Object object0, String s) {
        return ListenerHolders.createListenerHolder(object0, this.f, s);
    }

    public final int zaa() {
        return this.g;
    }

    public final Client zab(Looper looper0, zabq zabq0) {
        ClientSettings clientSettings0 = this.a().build();
        Client api$Client0 = ((AbstractClientBuilder)Preconditions.checkNotNull(this.c.zaa())).buildClient(this.a, looper0, clientSettings0, this.d, zabq0, zabq0);
        String s = this.b;
        if(s != null && api$Client0 instanceof BaseGmsClient) {
            ((BaseGmsClient)api$Client0).setAttributionTag(s);
        }
        return api$Client0;
    }

    public final zact zac(Context context0, Handler handler0) {
        return new zact(context0, handler0, this.a().build());
    }
}

