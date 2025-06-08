package com.google.android.gms.internal.ads;

public final class zzrk implements zzts {
    public final zzts[] i;

    public zzrk(zzts[] arr_zzts) {
        this.i = arr_zzts;
    }

    @Override  // com.google.android.gms.internal.ads.zzts
    public final long zzb() {
        zzts[] arr_zzts = this.i;
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        for(int v = 0; v < arr_zzts.length; ++v) {
            long v2 = arr_zzts[v].zzb();
            if(v2 != 0x8000000000000000L) {
                v1 = Math.min(v1, v2);
            }
        }
        return v1 == 0x7FFFFFFFFFFFFFFFL ? 0x8000000000000000L : v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzts
    public final long zzc() {
        zzts[] arr_zzts = this.i;
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        for(int v = 0; v < arr_zzts.length; ++v) {
            long v2 = arr_zzts[v].zzc();
            if(v2 != 0x8000000000000000L) {
                v1 = Math.min(v1, v2);
            }
        }
        return v1 == 0x7FFFFFFFFFFFFFFFL ? 0x8000000000000000L : v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzts
    public final void zzm(long v) {
        zzts[] arr_zzts = this.i;
        for(int v1 = 0; v1 < arr_zzts.length; ++v1) {
            arr_zzts[v1].zzm(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzts
    public final boolean zzo(long v) {
        boolean z = false;
        do {
            long v1 = this.zzc();
            if(v1 == 0x8000000000000000L) {
                break;
            }
            zzts[] arr_zzts = this.i;
            boolean z1 = false;
            for(int v2 = 0; v2 < arr_zzts.length; ++v2) {
                zzts zzts0 = arr_zzts[v2];
                long v3 = zzts0.zzc();
                if(v3 == v1 || v3 != 0x8000000000000000L && v3 <= v) {
                    z1 |= zzts0.zzo(v);
                }
            }
            z |= z1;
        }
        while(z1);
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzts
    public final boolean zzp() {
        zzts[] arr_zzts = this.i;
        for(int v = 0; v < arr_zzts.length; ++v) {
            if(arr_zzts[v].zzp()) {
                return true;
            }
        }
        return false;
    }
}

