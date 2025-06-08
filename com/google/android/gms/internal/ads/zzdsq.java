package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

public final class zzdsq implements zzbpb {
    public final zzdda i;
    public final zzcax j;
    public final String k;
    public final String l;

    public zzdsq(zzdda zzdda0, zzfbl zzfbl0) {
        this.i = zzdda0;
        this.j = zzfbl0.zzm;
        this.k = zzfbl0.zzk;
        this.l = zzfbl0.zzl;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpb
    @ParametersAreNonnullByDefault
    public final void zza(zzcax zzcax0) {
        int v;
        String s;
        zzcax zzcax1 = this.j;
        if(zzcax1 != null) {
            zzcax0 = zzcax1;
        }
        if(zzcax0 == null) {
            s = "";
            v = 1;
        }
        else {
            s = zzcax0.zza;
            v = zzcax0.zzb;
        }
        zzcai zzcai0 = new zzcai(s, v);
        this.i.zzd(zzcai0, this.k, this.l);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpb
    public final void zzb() {
        this.i.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzbpb
    public final void zzc() {
        this.i.zzf();
    }
}

