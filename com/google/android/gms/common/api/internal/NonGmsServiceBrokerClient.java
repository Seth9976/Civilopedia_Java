package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zau;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

@KeepForSdk
public final class NonGmsServiceBrokerClient implements ServiceConnection, Client {
    public final String i;
    public final String j;
    public final ComponentName k;
    public final Context l;
    public final ConnectionCallbacks m;
    public final zau n;
    public final OnConnectionFailedListener o;
    public IBinder p;
    public boolean q;
    public String r;

    @KeepForSdk
    public NonGmsServiceBrokerClient(Context context0, Looper looper0, ComponentName componentName0, ConnectionCallbacks connectionCallbacks0, OnConnectionFailedListener onConnectionFailedListener0) {
        this(context0, looper0, null, null, componentName0, connectionCallbacks0, onConnectionFailedListener0);
    }

    public NonGmsServiceBrokerClient(Context context0, Looper looper0, String s, String s1, ComponentName componentName0, ConnectionCallbacks connectionCallbacks0, OnConnectionFailedListener onConnectionFailedListener0) {
        this.q = false;
        this.r = null;
        this.l = context0;
        this.n = new zau(looper0);
        this.m = connectionCallbacks0;
        this.o = onConnectionFailedListener0;
        if(s == null || s1 == null) {
            if(componentName0 != null) {
                this.i = s;
                this.j = s1;
                this.k = componentName0;
                return;
            }
        }
        else if(componentName0 == null) {
            componentName0 = null;
            this.i = s;
            this.j = s1;
            this.k = componentName0;
            return;
        }
        throw new AssertionError("Must specify either package or component, but not both");
    }

    @KeepForSdk
    public NonGmsServiceBrokerClient(Context context0, Looper looper0, String s, String s1, ConnectionCallbacks connectionCallbacks0, OnConnectionFailedListener onConnectionFailedListener0) {
        this(context0, looper0, s, s1, null, connectionCallbacks0, onConnectionFailedListener0);
    }

    public final void a() {
        if(Thread.currentThread() != this.n.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient\'s handler thread.");
        }
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final void connect(ConnectionProgressReportCallbacks baseGmsClient$ConnectionProgressReportCallbacks0) {
        this.a();
        if(this.isConnected()) {
            try {
                this.disconnect("connect() called when already connected");
            }
            catch(Exception unused_ex) {
            }
        }
        try {
            Intent intent0 = new Intent();
            ComponentName componentName0 = this.k;
            if(componentName0 == null) {
                intent0.setPackage(this.i).setAction(this.j);
            }
            else {
                intent0.setComponent(componentName0);
            }
            boolean z = this.l.bindService(intent0, this, 0x1081);
            this.q = z;
        }
        catch(SecurityException securityException0) {
            this.q = false;
            this.p = null;
            throw securityException0;
        }
        if(!z) {
            this.p = null;
            ConnectionResult connectionResult0 = new ConnectionResult(16);
            this.o.onConnectionFailed(connectionResult0);
        }
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final void disconnect() {
        this.a();
        try {
            this.l.unbindService(this);
        }
        catch(IllegalArgumentException unused_ex) {
        }
        this.q = false;
        this.p = null;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final void disconnect(String s) {
        this.a();
        this.r = s;
        this.disconnect();
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final Feature[] getAvailableFeatures() {
        return new Feature[0];
    }

    @KeepForSdk
    public IBinder getBinder() {
        this.a();
        return this.p;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final String getEndpointPackageName() {
        String s = this.i;
        if(s != null) {
            return s;
        }
        Preconditions.checkNotNull(this.k);
        return this.k.getPackageName();
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final String getLastDisconnectMessage() {
        return this.r;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final int getMinApkVersion() {
        return 0;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final void getRemoteService(IAccountAccessor iAccountAccessor0, Set set0) {
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final Set getScopesForConnectionlessNonSignIn() {
        return Collections.emptySet();
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final IBinder getServiceBrokerBinder() {
        return null;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final Intent getSignInIntent() {
        return new Intent();
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final boolean isConnected() {
        this.a();
        return this.p != null;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final boolean isConnecting() {
        this.a();
        return this.q;
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        zacg zacg0 = new zacg(this, iBinder0);
        this.n.post(zacg0);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        zacf zacf0 = new zacf(this);
        this.n.post(zacf0);
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final void onUserSignOut(SignOutCallbacks baseGmsClient$SignOutCallbacks0) {
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final boolean providesSignIn() {
        return false;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final boolean requiresAccount() {
        return false;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final boolean requiresSignIn() {
        return false;
    }

    public final void zac(String s) {
    }
}

