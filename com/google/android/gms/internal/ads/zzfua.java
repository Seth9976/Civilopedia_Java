package com.google.android.gms.internal.ads;

public final class zzfua implements Runnable {
    public final b8 zza;
    public final zzfvl zzb;
    public final int zzc;

    public zzfua(b8 b80, zzfvl zzfvl0, int v) {
        this.zza = b80;
        this.zzb = zzfvl0;
        this.zzc = v;
    }

    @Override
    public final void run() {
        b8 b80 = this.zza;
        zzfvl zzfvl0 = this.zzb;
        int v = this.zzc;
        b80.getClass();
        try {
            if(zzfvl0.isCancelled()) {
                b80.t = null;
                b80.cancel(false);
            }
            else {
                b80.o(v, zzfvl0);
            }
        }
        finally {
            b80.p(null);
        }
    }
}

