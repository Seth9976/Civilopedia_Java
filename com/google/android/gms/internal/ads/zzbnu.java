package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzbnu implements zzbom {
    public final zzdjg zza;

    public zzbnu(zzdjg zzdjg0) {
        this.zza = zzdjg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        zzbol.zzd(map0, this.zza);
        String s = (String)map0.get("u");
        if(s == null) {
            zzcfi.zzj("URL missing from click GMSG.");
            return;
        }
        zzfvc.zzr(zzbol.zzb(((zzcli)object0), s), new E9(((zzcli)object0), 8), zzcfv.zza);
    }
}

