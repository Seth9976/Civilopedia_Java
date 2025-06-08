package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public final class zzdvl implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;

    public zzdvl(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        Set set0;
        String s = ((zzevo)this.a).zza();
        Context context0 = ((zzcnl)this.b).zza();
        zzfvm zzfvm0 = zzcfv.zza;
        zzgrc.zzb(zzfvm0);
        Map map0 = ((zzgqy)this.d).zzd();
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzdV)).booleanValue()) {
            zzbdm zzbdm0 = new zzbdm(new zzbds(context0));
            zzbdm0.zzb(new zzdvm(s));
            set0 = Collections.singleton(new zzdiz(new zzdvo(zzbdm0, map0), zzfvm0));
        }
        else {
            set0 = Collections.emptySet();
        }
        zzgrc.zzb(set0);
        return set0;
    }
}

