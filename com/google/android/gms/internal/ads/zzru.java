package com.google.android.gms.internal.ads;

public final class zzru extends zzci {
    public final zzbb a;

    public zzru(zzbb zzbb0) {
        this.a = zzbb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final int zza(Object object0) {
        return object0 == nb.d ? 0 : -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final int zzb() {
        return 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final int zzc() {
        return 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final zzcf zzd(int v, zzcf zzcf0, boolean z) {
        Object object0 = null;
        Integer integer0 = z ? 0 : null;
        if(z) {
            object0 = nb.d;
        }
        zzcf0.zzk(integer0, object0, 0, 0x8000000000000001L, 0L, zzd.zza, true);
        return zzcf0;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final zzch zze(int v, zzch zzch0, long v1) {
        zzch0.zza(zzch.zza, this.a, null, 0x8000000000000001L, 0x8000000000000001L, 0x8000000000000001L, false, true, null, 0L, 0x8000000000000001L, 0, 0, 0L);
        zzch0.zzl = true;
        return zzch0;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final Object zzf(int v) {
        return nb.d;
    }
}

