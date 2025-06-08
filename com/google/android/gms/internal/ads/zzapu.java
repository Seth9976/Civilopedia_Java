package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class zzapu implements Callable {
    public final zzapc a;
    public final zzali b;

    public zzapu(zzapc zzapc0, zzali zzali0) {
        this.a = zzapc0;
        this.b = zzali0;
    }

    @Override
    public final Object call() throws Exception {
        if(this.a.zzl() != null) {
            this.a.zzl().get();
        }
        zzaly zzaly0 = this.a.zzc();
        if(zzaly0 != null) {
            try {
                synchronized(this.b) {
                    byte[] arr_b = zzaly0.zzaw();
                    zzgkc zzgkc0 = zzgkc.zza();
                    this.b.zzak(arr_b, 0, arr_b.length, zzgkc0);
                    return null;
                }
            }
            catch(zzglc | NullPointerException unused_ex) {
            }
        }
        return null;
    }
}

