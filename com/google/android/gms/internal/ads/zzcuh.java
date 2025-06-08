package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzcuh implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;

    public zzcuh(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        ((zzcyn)this.a).zza();
        zzcfo zzcfo0 = ((zzcnv)this.b).zza();
        Object object0 = this.c.zzb();
        Object object1 = this.d.zzb();
        return new zzbaj("ae752f78-2731-4504-9267-d2f05b36d1a6", zzcfo0, ((String)object1), ((JSONObject)object0), false, "native".equals(((String)object1)));
    }
}

