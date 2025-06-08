package com.google.android.gms.internal.ads;

public final class zzcif implements Runnable {
    public final zzcij zza;
    public final int zzb;

    public zzcif(zzcij zzcij0, int v) {
        this.zza = zzcij0;
        this.zzb = v;
    }

    @Override
    public final void run() {
        int v = this.zzb;
        zzcgw zzcgw0 = this.zza.n;
        if(zzcgw0 != null) {
            zzcgw0.onWindowVisibilityChanged(v);
        }
    }
}

