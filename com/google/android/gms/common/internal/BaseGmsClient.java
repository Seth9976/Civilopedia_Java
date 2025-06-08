package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
public abstract class BaseGmsClient {
    @KeepForSdk
    public interface BaseConnectionCallbacks {
        @KeepForSdk
        public static final int CAUSE_DEAD_OBJECT_EXCEPTION = 3;
        @KeepForSdk
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        @KeepForSdk
        void onConnected(Bundle arg1);

        @KeepForSdk
        void onConnectionSuspended(int arg1);
    }

    @KeepForSdk
    public interface BaseOnConnectionFailedListener {
        @KeepForSdk
        void onConnectionFailed(ConnectionResult arg1);
    }

    @KeepForSdk
    public interface ConnectionProgressReportCallbacks {
        @KeepForSdk
        void onReportServiceBinding(ConnectionResult arg1);
    }

    public class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {
        public final BaseGmsClient a;

        @Override  // com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks
        public final void onReportServiceBinding(ConnectionResult connectionResult0) {
            BaseGmsClient baseGmsClient0 = BaseGmsClient.this;
            if(connectionResult0.isSuccess()) {
                baseGmsClient0.getRemoteService(null, baseGmsClient0.c());
                return;
            }
            BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener0 = baseGmsClient0.D;
            if(baseGmsClient$BaseOnConnectionFailedListener0 != null) {
                baseGmsClient$BaseOnConnectionFailedListener0.onConnectionFailed(connectionResult0);
            }
        }
    }

    @KeepForSdk
    public interface SignOutCallbacks {
        @KeepForSdk
        void onSignOutComplete();
    }

    public zze A;
    public int B;
    public final BaseConnectionCallbacks C;
    @KeepForSdk
    public static final int CONNECT_STATE_CONNECTED = 4;
    @KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    @KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public final BaseOnConnectionFailedListener D;
    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public final int E;
    public final String F;
    public volatile String G;
    @KeepForSdk
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = null;
    public ConnectionResult H;
    public boolean I;
    public volatile zzk J;
    public final AtomicInteger K;
    @KeepForSdk
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    public static final Feature[] L;
    public int i;
    public long j;
    public long k;
    public int l;
    public long m;
    public volatile String n;
    public zzv o;
    public final Context p;
    public final Looper q;
    public final GmsClientSupervisor r;
    public final GoogleApiAvailabilityLight s;
    public final g t;
    public final Object u;
    public final Object v;
    public IGmsServiceBroker w;
    public ConnectionProgressReportCallbacks x;
    public IInterface y;
    public final ArrayList z;

    static {
        BaseGmsClient.L = new Feature[0];
        BaseGmsClient.GOOGLE_PLUS_REQUIRED_FEATURES = new String[]{"service_esmobile", "service_googleme"};
    }

    public BaseGmsClient(Context context0, Looper looper0, BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks0, BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener0, int v) {
        GmsClientSupervisor gmsClientSupervisor0 = GmsClientSupervisor.getInstance(context0);
        Preconditions.checkNotNull(baseGmsClient$BaseConnectionCallbacks0);
        Preconditions.checkNotNull(baseGmsClient$BaseOnConnectionFailedListener0);
        this(context0, looper0, gmsClientSupervisor0, GoogleApiAvailabilityLight.getInstance(), v, baseGmsClient$BaseConnectionCallbacks0, baseGmsClient$BaseOnConnectionFailedListener0, null);
    }

    public BaseGmsClient(Context context0, Looper looper0, GmsClientSupervisor gmsClientSupervisor0, GoogleApiAvailabilityLight googleApiAvailabilityLight0, int v, BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks0, BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener0, String s) {
        this.n = null;
        this.u = new Object();
        this.v = new Object();
        this.z = new ArrayList();
        this.B = 1;
        this.H = null;
        this.I = false;
        this.J = null;
        this.K = new AtomicInteger(0);
        Preconditions.checkNotNull(context0, "Context must not be null");
        this.p = context0;
        Preconditions.checkNotNull(looper0, "Looper must not be null");
        this.q = looper0;
        Preconditions.checkNotNull(gmsClientSupervisor0, "Supervisor must not be null");
        this.r = gmsClientSupervisor0;
        Preconditions.checkNotNull(googleApiAvailabilityLight0, "API availability must not be null");
        this.s = googleApiAvailabilityLight0;
        this.t = new g(this, looper0);
        this.E = v;
        this.C = baseGmsClient$BaseConnectionCallbacks0;
        this.D = baseGmsClient$BaseOnConnectionFailedListener0;
        this.F = s;
    }

    public final void a() {
        if(!this.isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public Bundle b() {
        return new Bundle();
    }

    public Set c() {
        return Collections.emptySet();
    }

    @KeepForSdk
    public void checkAvailabilityAndConnect() {
        int v = this.getMinApkVersion();
        int v1 = this.s.isGooglePlayServicesAvailable(this.p, v);
        if(v1 != 0) {
            this.i(1, null);
            LegacyClientCallbackAdapter baseGmsClient$LegacyClientCallbackAdapter0 = new LegacyClientCallbackAdapter(this);
            Preconditions.checkNotNull(baseGmsClient$LegacyClientCallbackAdapter0, "Connection progress callbacks cannot be null.");
            this.x = baseGmsClient$LegacyClientCallbackAdapter0;
            int v2 = this.K.get();
            Message message0 = this.t.obtainMessage(3, v2, v1, null);
            this.t.sendMessage(message0);
            return;
        }
        this.connect(new LegacyClientCallbackAdapter(this));
    }

    @KeepForSdk
    public void connect(ConnectionProgressReportCallbacks baseGmsClient$ConnectionProgressReportCallbacks0) {
        Preconditions.checkNotNull(baseGmsClient$ConnectionProgressReportCallbacks0, "Connection progress callbacks cannot be null.");
        this.x = baseGmsClient$ConnectionProgressReportCallbacks0;
        this.i(2, null);
    }

    public abstract IInterface createServiceInterface(IBinder arg1);

    public abstract String d();

    @KeepForSdk
    public void disconnect() {
        this.K.incrementAndGet();
        synchronized(this.z) {
            int v1 = this.z.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                ((zzc)this.z.get(v2)).zzf();
            }
            this.z.clear();
        }
        synchronized(this.v) {
            this.w = null;
        }
        this.i(1, null);
    }

    @KeepForSdk
    public void disconnect(String s) {
        this.n = s;
        this.disconnect();
    }

    @KeepForSdk
    public void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        IGmsServiceBroker iGmsServiceBroker0;
        IInterface iInterface0;
        synchronized(this.u) {
            int v = this.B;
            iInterface0 = this.y;
        }
        synchronized(this.v) {
            iGmsServiceBroker0 = this.w;
        }
        printWriter0.append(s).append("mConnectState=");
        switch(v) {
            case 1: {
                printWriter0.print("DISCONNECTED");
                break;
            }
            case 2: {
                printWriter0.print("REMOTE_CONNECTING");
                break;
            }
            case 3: {
                printWriter0.print("LOCAL_CONNECTING");
                break;
            }
            case 4: {
                printWriter0.print("CONNECTED");
                break;
            }
            case 5: {
                printWriter0.print("DISCONNECTING");
                break;
            }
            default: {
                printWriter0.print("UNKNOWN");
            }
        }
        printWriter0.append(" mService=");
        if(iInterface0 == null) {
            printWriter0.append("null");
        }
        else {
            printWriter0.append(this.d()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface0.asBinder())));
        }
        printWriter0.append(" mServiceBroker=");
        if(iGmsServiceBroker0 == null) {
            printWriter0.println("null");
        }
        else {
            printWriter0.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker0.asBinder())));
        }
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if(this.k > 0L) {
            printWriter0.append(s).append("lastConnectedTime=").println(this.k + " " + simpleDateFormat0.format(new Date(this.k)));
        }
        if(this.j > 0L) {
            printWriter0.append(s).append("lastSuspendedCause=");
            int v1 = this.i;
            switch(v1) {
                case 1: {
                    printWriter0.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                }
                case 2: {
                    printWriter0.append("CAUSE_NETWORK_LOST");
                    break;
                }
                case 3: {
                    printWriter0.append("CAUSE_DEAD_OBJECT_EXCEPTION");
                    break;
                }
                default: {
                    printWriter0.append(String.valueOf(v1));
                }
            }
            printWriter0.append(" lastSuspendedTime=").println(this.j + " " + simpleDateFormat0.format(new Date(this.j)));
        }
        if(this.m > 0L) {
            printWriter0.append(s).append("lastFailedStatus=").append(CommonStatusCodes.getStatusCodeString(this.l));
            printWriter0.append(" lastFailedTime=").println(this.m + " " + simpleDateFormat0.format(new Date(this.m)));
        }
    }

    public boolean e() {
        return this.getMinApkVersion() >= 211700000;
    }

    public final void f(ConnectionResult connectionResult0) {
        this.l = connectionResult0.getErrorCode();
        this.m = System.currentTimeMillis();
    }

    public static void g(BaseGmsClient baseGmsClient0) {
        int v;
        synchronized(baseGmsClient0.u) {
        }
        if(baseGmsClient0.B == 3) {
            baseGmsClient0.I = true;
            v = 5;
        }
        else {
            v = 4;
        }
        int v1 = baseGmsClient0.K.get();
        Message message0 = baseGmsClient0.t.obtainMessage(v, v1, 16);
        baseGmsClient0.t.sendMessage(message0);
    }

    @KeepForSdk
    public Account getAccount() {
        return null;
    }

    @KeepForSdk
    public Feature[] getApiFeatures() {
        return BaseGmsClient.L;
    }

    @KeepForSdk
    public final Feature[] getAvailableFeatures() {
        return this.J == null ? null : this.J.j;
    }

    @KeepForSdk
    public Bundle getConnectionHint() [...] // Inlined contents

    @KeepForSdk
    public final Context getContext() {
        return this.p;
    }

    @KeepForSdk
    public String getEndpointPackageName() {
        if(this.isConnected()) {
            zzv zzv0 = this.o;
            if(zzv0 != null) {
                return zzv0.b;
            }
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    @KeepForSdk
    public int getGCoreServiceId() {
        return this.E;
    }

    @KeepForSdk
    public String getLastDisconnectMessage() {
        return this.n;
    }

    @KeepForSdk
    public final Looper getLooper() {
        return this.q;
    }

    @KeepForSdk
    public int getMinApkVersion() {
        return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @KeepForSdk
    public void getRemoteService(IAccountAccessor iAccountAccessor0, Set set0) {
        Bundle bundle0 = this.b();
        String s = this.G;
        Bundle bundle1 = new Bundle();
        GetServiceRequest getServiceRequest0 = new GetServiceRequest(6, this.E, GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE, null, null, GetServiceRequest.w, bundle1, null, GetServiceRequest.x, GetServiceRequest.x, true, 0, false, s);
        getServiceRequest0.l = "com.spears.civilopedia";
        getServiceRequest0.o = bundle0;
        if(set0 != null) {
            getServiceRequest0.n = (Scope[])set0.toArray(new Scope[0]);
        }
        if(this.requiresSignIn()) {
            Account account0 = this.getAccount();
            if(account0 == null) {
                account0 = new Account("<<default account>>", "com.google");
            }
            getServiceRequest0.p = account0;
            if(iAccountAccessor0 != null) {
                getServiceRequest0.m = iAccountAccessor0.asBinder();
            }
        }
        else if(this.requiresAccount()) {
            getServiceRequest0.p = this.getAccount();
        }
        getServiceRequest0.q = BaseGmsClient.L;
        getServiceRequest0.r = this.getApiFeatures();
        if(this.usesClientTelemetry()) {
            getServiceRequest0.u = true;
        }
        try {
            synchronized(this.v) {
                IGmsServiceBroker iGmsServiceBroker0 = this.w;
                if(iGmsServiceBroker0 == null) {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
                else {
                    iGmsServiceBroker0.getService(new zzd(this, this.K.get()), getServiceRequest0);
                }
            }
        }
        catch(DeadObjectException deadObjectException0) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", deadObjectException0);
            this.triggerConnectionSuspended(3);
        }
        catch(SecurityException securityException0) {
            throw securityException0;
        }
        catch(RemoteException | RuntimeException remoteException0) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", remoteException0);
            int v1 = this.K.get();
            zzf zzf0 = new zzf(this, 8, null, null);
            Message message0 = this.t.obtainMessage(1, v1, -1, zzf0);
            this.t.sendMessage(message0);
        }
    }

    @KeepForSdk
    public final IInterface getService() throws DeadObjectException {
        synchronized(this.u) {
            if(this.B != 5) {
                this.a();
                IInterface iInterface0 = this.y;
                Preconditions.checkNotNull(iInterface0, "Client is connected but service is null");
                return iInterface0;
            }
        }
        throw new DeadObjectException();
    }

    @KeepForSdk
    public IBinder getServiceBrokerBinder() {
        IGmsServiceBroker iGmsServiceBroker0;
        synchronized(this.v) {
            iGmsServiceBroker0 = this.w;
            if(iGmsServiceBroker0 == null) {
                return null;
            }
        }
        return iGmsServiceBroker0.asBinder();
    }

    @KeepForSdk
    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    @KeepForSdk
    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        return this.J == null ? null : this.J.l;
    }

    public static boolean h(BaseGmsClient baseGmsClient0, int v, int v1, IInterface iInterface0) {
        synchronized(baseGmsClient0.u) {
            if(baseGmsClient0.B != v) {
                return false;
            }
            baseGmsClient0.i(v1, iInterface0);
            return true;
        }
    }

    @KeepForSdk
    public boolean hasConnectionInfo() {
        return this.J != null;
    }

    public final void i(int v, IInterface iInterface0) {
        Preconditions.checkArgument((v == 4 ? 1 : 0) == (iInterface0 == null ? 0 : 1));
        synchronized(this.u) {
            this.B = v;
            this.y = iInterface0;
            switch(v) {
                case 1: {
                    zze zze0 = this.A;
                    if(zze0 != null) {
                        String s = this.o.a;
                        Preconditions.checkNotNull(s);
                        String s1 = this.o.b;
                        String s2 = this.F == null ? this.p.getClass().getName() : this.F;
                        this.r.zzb(s, s1, 0x1081, zze0, s2, this.o.c);
                        this.A = null;
                    }
                    break;
                }
                case 2: 
                case 3: {
                    zze zze1 = this.A;
                    if(zze1 != null) {
                        zzv zzv0 = this.o;
                        if(zzv0 != null) {
                            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + zzv0.a + " on " + zzv0.b);
                            String s3 = this.o.a;
                            Preconditions.checkNotNull(s3);
                            String s4 = this.o.b;
                            String s5 = this.F == null ? this.p.getClass().getName() : this.F;
                            this.r.zzb(s3, s4, 0x1081, zze1, s5, this.o.c);
                            this.K.incrementAndGet();
                        }
                    }
                    zze zze2 = new zze(this, this.K.get());
                    this.A = zze2;
                    zzv zzv1 = new zzv("com.google.android.gms", this.getStartServiceAction(), false, 0x1081, this.e());
                    this.o = zzv1;
                    if(zzv1.c && this.getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: " + this.o.a);
                    }
                    String s6 = this.o.a;
                    Preconditions.checkNotNull(s6);
                    String s7 = this.o.b;
                    String s8 = this.F == null ? this.p.getClass().getName() : this.F;
                    if(!this.r.b(new zzo(s6, s7, 0x1081, this.o.c), zze2, s8, null)) {
                        Log.w("GmsClient", "unable to connect to service: " + this.o.a + " on " + this.o.b);
                        int v2 = this.K.get();
                        zzg zzg0 = new zzg(this, 16, null);
                        Message message0 = this.t.obtainMessage(7, v2, -1, zzg0);
                        this.t.sendMessage(message0);
                    }
                    break;
                }
                case 4: {
                    Preconditions.checkNotNull(iInterface0);
                    this.k = System.currentTimeMillis();
                }
            }
        }
    }

    @KeepForSdk
    public boolean isConnected() {
        synchronized(this.u) {
        }
        return this.B == 4;
    }

    @KeepForSdk
    public boolean isConnecting() {
        boolean z = true;
        synchronized(this.u) {
            if(this.B != 2 && this.B != 3) {
                z = false;
            }
        }
        return z;
    }

    @KeepForSdk
    public void onUserSignOut(SignOutCallbacks baseGmsClient$SignOutCallbacks0) {
        baseGmsClient$SignOutCallbacks0.onSignOutComplete();
    }

    @KeepForSdk
    public boolean providesSignIn() {
        return false;
    }

    @KeepForSdk
    public boolean requiresAccount() {
        return false;
    }

    @KeepForSdk
    public boolean requiresGooglePlayServices() {
        return true;
    }

    @KeepForSdk
    public boolean requiresSignIn() {
        return false;
    }

    @KeepForSdk
    public void setAttributionTag(String s) {
        this.G = s;
    }

    @KeepForSdk
    public void triggerConnectionSuspended(int v) {
        int v1 = this.K.get();
        Message message0 = this.t.obtainMessage(6, v1, v);
        this.t.sendMessage(message0);
    }

    @KeepForSdk
    public boolean usesClientTelemetry() {
        return false;
    }
}

