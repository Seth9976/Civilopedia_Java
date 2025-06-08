package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzfck implements zzbom {
    public final zzdjg zza;
    public final zzfii zzb;
    public final zzees zzc;

    public zzfck(zzdjg zzdjg0, zzfii zzfii0, zzees zzees0) {
        this.zza = zzdjg0;
        this.zzb = zzfii0;
        this.zzc = zzees0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        zzfii zzfii0 = this.zzb;
        zzees zzees0 = this.zzc;
        zzbol.zzd(map0, this.zza);
        String s = (String)map0.get("u");
        if(s == null) {
            zzcfi.zzj("URL missing from click GMSG.");
            return;
        }
        zzfvc.zzr(zzbol.zzb(((zzcli)object0), s), new S8(((zzcli)object0), zzfii0, zzees0), zzcfv.zza);
    }
}

