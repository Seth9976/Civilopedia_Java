package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import jeb.synthetic.FIN;

public final class t6 implements BaseConnectionCallbacks, BaseOnConnectionFailedListener {
    public final zzfmb i;
    public final zzflv j;
    public final Object k;
    public boolean l;
    public boolean m;

    public t6(Context context0, Looper looper0, zzflv zzflv0) {
        this.k = new Object();
        this.l = false;
        this.m = false;
        this.j = zzflv0;
        this.i = new zzfmb(context0, looper0, this, this, 12800000);
    }

    public final void a() {
        synchronized(this.k) {
            if(this.i.isConnected() || this.i.isConnecting()) {
                this.i.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        Object object0 = this.k;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        if(this.m) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            return;
        }
        try {
            this.m = true;
            this.i.zzp().zzg(new zzflz(this.j.zzaw()));
        }
        catch(Exception unused_ex) {
        }
        finally {
            this.a();
            FIN.finallyExec$NT(v);
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnectionSuspended(int v) {
    }
}

