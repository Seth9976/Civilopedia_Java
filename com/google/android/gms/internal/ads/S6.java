package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import java.util.concurrent.LinkedBlockingQueue;

public final class s6 implements BaseConnectionCallbacks, BaseOnConnectionFailedListener {
    public final zzfmb i;
    public final String j;
    public final String k;
    public final LinkedBlockingQueue l;
    public final HandlerThread m;
    public final zzfku n;
    public final long o;
    public final int p;

    public s6(Context context0, int v, String s, String s1, zzfku zzfku0) {
        this.j = s;
        this.p = v;
        this.k = s1;
        this.n = zzfku0;
        HandlerThread handlerThread0 = new HandlerThread("GassDGClient");
        this.m = handlerThread0;
        handlerThread0.start();
        this.o = System.currentTimeMillis();
        zzfmb zzfmb0 = new zzfmb(context0, handlerThread0.getLooper(), this, this, 19621000);
        this.i = zzfmb0;
        this.l = new LinkedBlockingQueue();
        zzfmb0.checkAvailabilityAndConnect();
    }

    public final void a() {
        zzfmb zzfmb0 = this.i;
        if(zzfmb0 != null && (zzfmb0.isConnected() || zzfmb0.isConnecting())) {
            zzfmb0.disconnect();
        }
    }

    public final void b(int v, long v1, Exception exception0) {
        this.n.zzc(v, System.currentTimeMillis() - v1, exception0);
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        zzfmg zzfmg0;
        HandlerThread handlerThread0;
        long v;
        try {
            v = this.o;
            handlerThread0 = this.m;
            zzfmg0 = this.i.zzp();
        }
        catch(IllegalStateException | DeadObjectException unused_ex) {
            zzfmg0 = null;
        }
        if(zzfmg0 != null) {
            try {
                zzfmn zzfmn0 = zzfmg0.zzf(new zzfml(1, this.p, this.j, this.k));
                this.b(5011, v, null);
                this.l.put(zzfmn0);
            }
            catch(Throwable throwable0) {
                this.b(2010, v, new Exception(throwable0));
            }
            finally {
                this.a();
                handlerThread0.quit();
            }
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        try {
            this.b(0xFAC, this.o, null);
            zzfmn zzfmn0 = new zzfmn(null, 1);
            this.l.put(zzfmn0);
        }
        catch(InterruptedException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnectionSuspended(int v) {
        try {
            this.b(0xFAB, this.o, null);
            zzfmn zzfmn0 = new zzfmn(null, 1);
            this.l.put(zzfmn0);
        }
        catch(InterruptedException unused_ex) {
        }
    }
}

