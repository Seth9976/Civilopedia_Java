package com.google.android.gms.internal.ads;

public final class zzsw implements Runnable {
    public final xb zza;
    public final zzzu zzb;

    public zzsw(xb xb0, zzzu zzzu0) {
        this.zza = xb0;
        this.zzb = zzzu0;
    }

    @Override
    public final void run() {
        xb xb0 = this.zza;
        zzzu zzzu0 = this.zzb;
        zzzu zzzu1 = xb0.v == null ? zzzu0 : new zzzt(0x8000000000000001L, 0L);
        xb0.C = zzzu1;
        xb0.D = zzzu0.zze();
        boolean z = false;
        int v = 1;
        if(xb0.J == -1L && zzzu0.zze() == 0x8000000000000001L) {
            z = true;
        }
        xb0.E = z;
        if(z) {
            v = 7;
        }
        xb0.F = v;
        long v1 = xb0.D;
        boolean z1 = zzzu0.zzh();
        xb0.m.zza(v1, z1, xb0.E);
        if(!xb0.z) {
            xb0.e();
        }
    }
}

