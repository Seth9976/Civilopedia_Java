package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;

public abstract class zzeay implements BaseConnectionCallbacks, BaseOnConnectionFailedListener {
    public final zzcga i;
    public final Object j;
    public boolean k;
    public boolean l;
    public zzbzv m;
    public zzbzg n;

    public zzeay() {
        this.i = new zzcga();
        this.j = new Object();
        this.k = false;
        this.l = false;
    }

    public final void a() {
        synchronized(this.j) {
            this.l = true;
            if(this.n.isConnected() || this.n.isConnecting()) {
                this.n.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public void onConnectionFailed(ConnectionResult connectionResult0) {
        zzcfi.zze("Disconnected from remote ad request service.");
        zzebn zzebn0 = new zzebn(1);
        this.i.zze(zzebn0);
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnectionSuspended(int v) {
        zzcfi.zze("Cannot connect to remote service, fallback to local instance.");
    }
}

