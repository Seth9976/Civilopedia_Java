package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import java.util.concurrent.LinkedBlockingQueue;

public final class r6 implements BaseConnectionCallbacks, BaseOnConnectionFailedListener {
    public final zzfmb i;
    public final String j;
    public final String k;
    public final LinkedBlockingQueue l;
    public final HandlerThread m;

    public r6(Context context0, String s, String s1) {
        this.j = s;
        this.k = s1;
        HandlerThread handlerThread0 = new HandlerThread("GassClient");
        this.m = handlerThread0;
        handlerThread0.start();
        zzfmb zzfmb0 = new zzfmb(context0, handlerThread0.getLooper(), this, this, 9200000);
        this.i = zzfmb0;
        this.l = new LinkedBlockingQueue();
        zzfmb0.checkAvailabilityAndConnect();
    }

    public static zzaly a() {
        zzali zzali0 = zzaly.zza();
        zzali0.zzC(0x8000L);
        return (zzaly)zzali0.zzal();
    }

    public final void b() {
        zzfmb zzfmb0 = this.i;
        if(zzfmb0 != null && (zzfmb0.isConnected() || zzfmb0.isConnecting())) {
            zzfmb0.disconnect();
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        zzfmg zzfmg0;
        HandlerThread handlerThread0;
        LinkedBlockingQueue linkedBlockingQueue0;
        try {
            linkedBlockingQueue0 = this.l;
            handlerThread0 = this.m;
            zzfmg0 = this.i.zzp();
        }
        catch(IllegalStateException | DeadObjectException unused_ex) {
            zzfmg0 = null;
        }
        if(zzfmg0 != null) {
            try {
                linkedBlockingQueue0.put(zzfmg0.zze(new zzfmc(this.j, this.k)).zza());
            }
            catch(Throwable unused_ex) {
                try {
                    linkedBlockingQueue0.put(r6.a());
                }
                catch(InterruptedException unused_ex) {
                }
            }
            finally {
                this.b();
                handlerThread0.quit();
            }
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        try {
            zzaly zzaly0 = r6.a();
            this.l.put(zzaly0);
        }
        catch(InterruptedException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnectionSuspended(int v) {
        try {
            zzaly zzaly0 = r6.a();
            this.l.put(zzaly0);
        }
        catch(InterruptedException unused_ex) {
        }
    }
}

