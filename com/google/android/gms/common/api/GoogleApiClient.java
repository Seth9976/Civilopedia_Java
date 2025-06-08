package com.google.android.gms.common.api;

import A.f;
import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.j;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zada;
import com.google.android.gms.common.api.internal.zak;
import com.google.android.gms.common.api.internal.zat;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import p.b;
import p.h;

@Deprecated
public abstract class GoogleApiClient {
    @Deprecated
    public static final class Builder {
        public Account a;
        public final HashSet b;
        public final HashSet c;
        public int d;
        public View e;
        public final String f;
        public final String g;
        public final b h;
        public final Context i;
        public final b j;
        public LifecycleActivity k;
        public int l;
        public OnConnectionFailedListener m;
        public Looper n;
        public final GoogleApiAvailability o;
        public final AbstractClientBuilder p;
        public final ArrayList q;
        public final ArrayList r;

        public Builder(Context context0) {
            this.b = new HashSet();
            this.c = new HashSet();
            this.h = new b();  // 初始化器: Lp/k;-><init>()V
            this.j = new b();  // 初始化器: Lp/k;-><init>()V
            this.l = -1;
            this.o = GoogleApiAvailability.getInstance();
            this.p = zad.zac;
            this.q = new ArrayList();
            this.r = new ArrayList();
            this.i = context0;
            this.n = context0.getMainLooper();
            this.f = "com.spears.civilopedia";
            this.g = context0.getClass().getName();
        }

        public Builder(Context context0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
            this(context0);
            Preconditions.checkNotNull(googleApiClient$ConnectionCallbacks0, "Must provide a connected listener");
            this.q.add(googleApiClient$ConnectionCallbacks0);
            Preconditions.checkNotNull(googleApiClient$OnConnectionFailedListener0, "Must provide a connection failed listener");
            this.r.add(googleApiClient$OnConnectionFailedListener0);
        }

        public final void a(Api api0, HasOptions api$ApiOptions$HasOptions0, Scope[] arr_scope) {
            HashSet hashSet0 = new HashSet(((BaseClientBuilder)Preconditions.checkNotNull(api0.zac(), "Base client builder must not be null")).getImpliedScopes(api$ApiOptions$HasOptions0));
            for(int v = 0; v < arr_scope.length; ++v) {
                hashSet0.add(arr_scope[v]);
            }
            zab zab0 = new zab(hashSet0);
            this.h.put(api0, zab0);
        }

        @CanIgnoreReturnValue
        public Builder addApi(Api api0) {
            Preconditions.checkNotNull(api0, "Api must not be null");
            this.j.put(api0, null);
            List list0 = ((BaseClientBuilder)Preconditions.checkNotNull(api0.zac(), "Base client builder must not be null")).getImpliedScopes(null);
            this.c.addAll(list0);
            this.b.addAll(list0);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addApi(Api api0, HasOptions api$ApiOptions$HasOptions0) {
            Preconditions.checkNotNull(api0, "Api must not be null");
            Preconditions.checkNotNull(api$ApiOptions$HasOptions0, "Null options are not permitted for this Api");
            this.j.put(api0, api$ApiOptions$HasOptions0);
            List list0 = ((BaseClientBuilder)Preconditions.checkNotNull(api0.zac(), "Base client builder must not be null")).getImpliedScopes(api$ApiOptions$HasOptions0);
            this.c.addAll(list0);
            this.b.addAll(list0);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addApiIfAvailable(Api api0, HasOptions api$ApiOptions$HasOptions0, Scope[] arr_scope) {
            Preconditions.checkNotNull(api0, "Api must not be null");
            Preconditions.checkNotNull(api$ApiOptions$HasOptions0, "Null options are not permitted for this Api");
            this.j.put(api0, api$ApiOptions$HasOptions0);
            this.a(api0, api$ApiOptions$HasOptions0, arr_scope);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addApiIfAvailable(Api api0, Scope[] arr_scope) {
            Preconditions.checkNotNull(api0, "Api must not be null");
            this.j.put(api0, null);
            this.a(api0, null, arr_scope);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addConnectionCallbacks(ConnectionCallbacks googleApiClient$ConnectionCallbacks0) {
            Preconditions.checkNotNull(googleApiClient$ConnectionCallbacks0, "Listener must not be null");
            this.q.add(googleApiClient$ConnectionCallbacks0);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addOnConnectionFailedListener(OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
            Preconditions.checkNotNull(googleApiClient$OnConnectionFailedListener0, "Listener must not be null");
            this.r.add(googleApiClient$OnConnectionFailedListener0);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addScope(Scope scope0) {
            Preconditions.checkNotNull(scope0, "Scope must not be null");
            this.b.add(scope0);
            return this;
        }

        @ResultIgnorabilityUnspecified
        public GoogleApiClient build() {
            Preconditions.checkArgument(!this.j.isEmpty(), "must call addApi() to add at least one API");
            ClientSettings clientSettings0 = this.zaa();
            Map map0 = clientSettings0.zad();
            b b0 = new b();  // 初始化器: Lp/k;-><init>()V
            b b1 = new b();  // 初始化器: Lp/k;-><init>()V
            ArrayList arrayList0 = new ArrayList();
            Api api0 = null;
            for(Object object0: ((h)this.j.keySet())) {
                Object object1 = this.j.getOrDefault(((Api)object0), null);
                boolean z = map0.get(((Api)object0)) != null;
                b0.put(((Api)object0), Boolean.valueOf(z));
                zat zat0 = new zat(((Api)object0), z);
                arrayList0.add(zat0);
                Client api$Client0 = ((AbstractClientBuilder)Preconditions.checkNotNull(((Api)object0).zaa())).buildClient(this.i, this.n, clientSettings0, object1, zat0, zat0);
                b1.put(((Api)object0).zab(), api$Client0);
                if(api$Client0.providesSignIn()) {
                    if(api0 != null) {
                        throw new IllegalStateException(f.i(((Api)object0).zad(), " cannot be used with ", api0.zad()));
                    }
                    api0 = (Api)object0;
                }
            }
            if(api0 != null) {
                Preconditions.checkState(this.a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", new Object[]{api0.zad()});
                Preconditions.checkState(this.b.equals(this.c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", new Object[]{api0.zad()});
            }
            int v = zabe.zad(b1.values(), true);
            ReentrantLock reentrantLock0 = new ReentrantLock();
            zabe zabe0 = new zabe(this.i, reentrantLock0, this.n, clientSettings0, this.o, this.p, b0, this.q, this.r, b1, this.l, v, arrayList0);
            synchronized(GoogleApiClient.i) {
                GoogleApiClient.i.add(zabe0);
            }
            if(this.l >= 0) {
                zak.zaa(this.k).zad(this.l, zabe0, this.m);
            }
            return zabe0;
        }

        @CanIgnoreReturnValue
        public Builder enableAutoManage(j j0, int v, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
            LifecycleActivity lifecycleActivity0 = new LifecycleActivity(j0);
            Preconditions.checkArgument(v >= 0, "clientId must be non-negative");
            this.l = v;
            this.m = googleApiClient$OnConnectionFailedListener0;
            this.k = lifecycleActivity0;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder enableAutoManage(j j0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
            this.enableAutoManage(j0, 0, googleApiClient$OnConnectionFailedListener0);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setAccountName(String s) {
            this.a = s == null ? null : new Account(s, "com.google");
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setGravityForPopups(int v) {
            this.d = v;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHandler(Handler handler0) {
            Preconditions.checkNotNull(handler0, "Handler must not be null");
            this.n = handler0.getLooper();
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setViewForPopups(View view0) {
            Preconditions.checkNotNull(view0, "View must not be null");
            this.e = view0;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder useDefaultAccount() {
            this.setAccountName("<<default account>>");
            return this;
        }

        public final ClientSettings zaa() {
            SignInOptions signInOptions0 = SignInOptions.zaa;
            Api api0 = zad.zag;
            b b0 = this.j;
            if(b0.containsKey(api0)) {
                signInOptions0 = (SignInOptions)b0.getOrDefault(api0, null);
            }
            return new ClientSettings(this.a, this.b, this.h, this.d, this.e, this.f, this.g, signInOptions0, false);
        }
    }

    @Deprecated
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

    }

    @Deprecated
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;
    public static final Set i;

    static {
        GoogleApiClient.i = Collections.newSetFromMap(new WeakHashMap());
    }

    @ResultIgnorabilityUnspecified
    public abstract ConnectionResult blockingConnect();

    @ResultIgnorabilityUnspecified
    public abstract ConnectionResult blockingConnect(long arg1, TimeUnit arg2);

    public abstract PendingResult clearDefaultAccountAndReconnect();

    public abstract void connect();

    public void connect(int v) {
        throw new UnsupportedOperationException();
    }

    public abstract void disconnect();

    public abstract void dump(String arg1, FileDescriptor arg2, PrintWriter arg3, String[] arg4);

    public static void dumpAll(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        Set set0 = GoogleApiClient.i;
        synchronized(set0) {
            int v1 = 0;
            for(Object object0: set0) {
                printWriter0.append(s).append("GoogleApiClient#").println(v1);
                ((GoogleApiClient)object0).dump(s + "  ", fileDescriptor0, printWriter0, arr_s);
                ++v1;
            }
        }
    }

    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public ApiMethodImpl enqueue(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public ApiMethodImpl execute(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public static Set getAllClients() {
        synchronized(GoogleApiClient.i) {
        }
        return GoogleApiClient.i;
    }

    @KeepForSdk
    public Client getClient(AnyClientKey api$AnyClientKey0) {
        throw new UnsupportedOperationException();
    }

    public abstract ConnectionResult getConnectionResult(Api arg1);

    @KeepForSdk
    public Context getContext() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public boolean hasApi(Api api0) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean hasConnectedApi(Api arg1);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(ConnectionCallbacks arg1);

    public abstract boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener arg1);

    @KeepForSdk
    public boolean maybeSignIn(SignInConnectionListener signInConnectionListener0) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public void maybeSignOut() {
        throw new UnsupportedOperationException();
    }

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(ConnectionCallbacks arg1);

    public abstract void registerConnectionFailedListener(OnConnectionFailedListener arg1);

    @KeepForSdk
    public ListenerHolder registerListener(Object object0) {
        throw new UnsupportedOperationException();
    }

    public abstract void stopAutoManage(j arg1);

    public abstract void unregisterConnectionCallbacks(ConnectionCallbacks arg1);

    public abstract void unregisterConnectionFailedListener(OnConnectionFailedListener arg1);

    public void zao(zada zada0) {
        throw new UnsupportedOperationException();
    }

    public void zap(zada zada0) {
        throw new UnsupportedOperationException();
    }
}

