package com.google.android.gms.internal.ads;

public final class zzeyd implements zzfuj {
    public final zzeyg zza;
    public final zzezb zzb;
    public final L5 zzc;
    public final zzeyz zzd;
    public final zzdbc zze;

    public zzeyd(zzeyg zzeyg0, zzezb zzezb0, L5 l50, zzeyz zzeyz0, zzdbc zzdbc0) {
        this.zza = zzeyg0;
        this.zzb = zzezb0;
        this.zzc = l50;
        this.zzd = zzeyz0;
        this.zze = zzdbc0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        zzeyg zzeyg0 = this.zza;
        zzezb zzezb0 = this.zzb;
        L5 l50 = this.zzc;
        zzeyz zzeyz0 = this.zzd;
        zzdbc zzdbc0 = this.zze;
        if(((zzeyl)object0) != null) {
            zzeyg0.getClass();
            L5 l51 = new L5(l50.a, l50.b, l50.c, l50.d, l50.e, l50.f, ((zzeyl)object0).zza);
            zzfek zzfek0 = zzeyg0.c;
            if(((zzeyl)object0).zzc != null) {
                zzeyg0.e = null;
                zzfek0.zze(l51);
                return zzeyg0.a(((zzeyl)object0).zzc, zzezb0);
            }
            zzfvl zzfvl0 = zzfek0.zza(l51);
            if(zzfvl0 != null) {
                zzeyg0.e = null;
                return zzfvc.zzn(zzfvl0, new zzeyc(zzeyg0), zzeyg0.f);
            }
            zzfek0.zze(l51);
            zzezb0 = new zzezb(zzezb0.zzb, ((zzeyl)object0).zzb);
        }
        zzfvl zzfvl1 = ((zzeyq)zzeyg0.a).zzb(zzezb0, zzeyz0, zzdbc0);
        zzeyg0.e = zzdbc0;
        return zzfvl1;
    }
}

