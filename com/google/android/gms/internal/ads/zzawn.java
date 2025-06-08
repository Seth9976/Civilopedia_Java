package com.google.android.gms.internal.ads;

public final class zzawn implements zzaxn {
    public final zzaxn[] i;

    public zzawn(zzaxn[] arr_zzaxn) {
        this.i = arr_zzaxn;
    }

    @Override  // com.google.android.gms.internal.ads.zzaxn
    public final long zza() {
        zzaxn[] arr_zzaxn = this.i;
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        for(int v = 0; v < arr_zzaxn.length; ++v) {
            long v2 = arr_zzaxn[v].zza();
            if(v2 != 0x8000000000000000L) {
                v1 = Math.min(v1, v2);
            }
        }
        return v1 == 0x7FFFFFFFFFFFFFFFL ? 0x8000000000000000L : v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzbj(long v) {
        boolean z = false;
        do {
            long v1 = this.zza();
            if(v1 == 0x8000000000000000L) {
                break;
            }
            zzaxn[] arr_zzaxn = this.i;
            boolean z1 = false;
            for(int v2 = 0; v2 < arr_zzaxn.length; ++v2) {
                zzaxn zzaxn0 = arr_zzaxn[v2];
                if(zzaxn0.zza() == v1) {
                    z1 |= zzaxn0.zzbj(v);
                }
            }
            z |= z1;
        }
        while(z1);
        return z;
    }
}

