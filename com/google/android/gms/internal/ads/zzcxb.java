package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

public final class zzcxb implements Runnable {
    public final AtomicReference zza;

    public zzcxb(AtomicReference atomicReference0) {
        this.zza = atomicReference0;
    }

    @Override
    public final void run() {
        Runnable runnable0 = (Runnable)this.zza.getAndSet(null);
        if(runnable0 != null) {
            runnable0.run();
        }
    }
}

