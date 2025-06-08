package com.google.android.gms.internal.ads;

public final class zzcgm implements Runnable {
    public final zzcgv zza;
    public final int zzb;

    public zzcgm(zzcgv zzcgv0, int v) {
        this.zza = zzcgv0;
        this.zzb = v;
    }

    @Override
    public final void run() {
        int v = this.zzb;
        zzcgw zzcgw0 = this.zza.x;
        if(zzcgw0 != null) {
            zzcgw0.onWindowVisibilityChanged(v);
        }
    }
}

