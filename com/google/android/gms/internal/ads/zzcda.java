package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

public final class zzcda implements Runnable {
    public final zzcdn zza;
    public final x2 zzb;
    public final String zzc;

    public zzcda(zzcdn zzcdn0, x2 x20, String s) {
        this.zza = zzcdn0;
        this.zzb = x20;
        this.zzc = s;
    }

    @Override
    public final void run() {
        zzcdn zzcdn0 = this.zza;
        x2 x20 = this.zzb;
        String s = this.zzc;
        AtomicReference atomicReference0 = zzcdn0.j;
        if(((zzcmz)atomicReference0.get()) != null) {
            try {
                x20.zza(((zzcmz)atomicReference0.get()));
            }
            catch(Exception unused_ex) {
                zzcdn0.c(s, false);
            }
        }
    }
}

