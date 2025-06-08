package com.google.android.gms.internal.ads;

public final class zzio implements Runnable {
    public final xa zza;
    public final zzjq zzb;

    public zzio(xa xa0, zzjq zzjq0) {
        this.zza = xa0;
        this.zzb = zzjq0;
    }

    @Override
    public final void run() {
        try {
            xa.C(this.zzb);
        }
        catch(zzgt zzgt0) {
            zzdn.zza("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", zzgt0);
            throw new RuntimeException(zzgt0);
        }
    }
}

