package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

public final class zzeij extends zzeii {
    public final zzcnf a;
    public final zzdbd b;
    public final zzekr c;
    public final zzdhf d;
    public final zzdlp e;
    public final zzdei f;
    public final ViewGroup g;
    public final zzdgo h;

    public zzeij(zzcnf zzcnf0, zzdbd zzdbd0, zzekr zzekr0, zzdhf zzdhf0, zzdlp zzdlp0, zzdei zzdei0, ViewGroup viewGroup0, zzdgo zzdgo0) {
        this.a = zzcnf0;
        this.b = zzdbd0;
        this.c = zzekr0;
        this.d = zzdhf0;
        this.e = zzdlp0;
        this.f = zzdei0;
        this.g = viewGroup0;
        this.h = zzdgo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzeii
    public final zzfvl a(zzfcd zzfcd0, Bundle bundle0) {
        zzcwr zzcwr0 = this.a.zze();
        this.b.zzf(zzfcd0);
        this.b.zzd(bundle0);
        zzcwr0.zzi(this.b.zzg());
        zzcwr0.zzf(this.d);
        zzcwr0.zze(this.c);
        zzcwr0.zzd(this.e);
        zzcwr0.zzg(new zzcxp(this.f, this.h));
        zzcwr0.zzc(new zzcvs(this.g));
        zzcza zzcza0 = zzcwr0.zzj().zzd();
        return zzcza0.zzh(zzcza0.zzi());
    }
}

