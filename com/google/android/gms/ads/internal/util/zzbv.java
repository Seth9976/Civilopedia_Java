package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzfnw;

public final class zzbv {
    public HandlerThread a;
    public zzfnw b;
    public int c;
    public final Object d;

    public zzbv() {
        this.a = null;
        this.b = null;
        this.c = 0;
        this.d = new Object();
    }

    public final Handler zza() {
        return this.b;
    }

    public final Looper zzb() {
        synchronized(this.d) {
            if(this.c != 0) {
                Preconditions.checkNotNull(this.a, "Invalid state: mHandlerThread should already been initialized.");
            }
            else if(this.a == null) {
                zze.zza("Starting the looper thread.");
                HandlerThread handlerThread0 = new HandlerThread("LooperProvider");
                this.a = handlerThread0;
                handlerThread0.start();
                this.b = new zzfnw(this.a.getLooper());
                zze.zza("Looper thread started.");
            }
            else {
                zze.zza("Resuming the looper thread");
                this.d.notifyAll();
            }
            ++this.c;
        }
        return this.a.getLooper();
    }
}

