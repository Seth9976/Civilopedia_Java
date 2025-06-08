package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

public final class zzcuj implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;

    public zzcuj(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzcud zzcud0 = (zzcud)this.a.zzb();
        zzgrc.zzb(zzcfv.zza);
        Set set0 = ((JSONObject)this.c.zzb()) == null ? Collections.emptySet() : Collections.singleton(new zzdiz(zzcud0, zzcfv.zza));
        zzgrc.zzb(set0);
        return set0;
    }
}

