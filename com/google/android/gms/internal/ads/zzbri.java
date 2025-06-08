package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;

public final class zzbri implements zzcmu {
    public final zzbrv zza;

    public zzbri(zzbrv zzbrv0, byte[] arr_b) {
        this.zza = zzbrv0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcmu
    public final void zza() {
        zzbru zzbru0 = new zzbru(this.zza.zza, this.zza.zzb, this.zza.zzc);
        zzs.zza.postDelayed(zzbru0, 10000L);
    }
}

