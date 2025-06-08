package com.google.android.gms.internal.ads;

public final class zzdma implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;
    public final zzgrh e;

    public zzdma(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
        this.e = zzgrh4;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzcnf zzcnf0 = (zzcnf)this.a.zzb();
        zzdbd zzdbd0 = ((zzdbl)this.b).zza();
        zzdhf zzdhf0 = ((zzdhy)this.c).zza();
        zzdlp zzdlp0 = ((zzdlr)this.d).zza();
        zzdei zzdei0 = ((zzcvu)this.e).zza();
        zzcwr zzcwr0 = zzcnf0.zze();
        zzcwr0.zzi(zzdbd0.zzg());
        zzcwr0.zzf(zzdhf0);
        zzcwr0.zzd(zzdlp0);
        zzcwr0.zze(new zzekr(null));
        zzcwr0.zzg(new zzcxp(zzdei0, null));
        zzcwr0.zzc(new zzcvs(null));
        zzcya zzcya0 = zzcwr0.zzj().zzc();
        zzgrc.zzb(zzcya0);
        return zzcya0;
    }
}

