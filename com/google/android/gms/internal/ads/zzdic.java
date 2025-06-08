package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzdic implements zzgqu {
    public final zzdhf a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;
    public final zzgrh e;

    public zzdic(zzdhf zzdhf0, zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3) {
        this.a = zzdhf0;
        this.b = zzgrh0;
        this.c = zzgrh1;
        this.d = zzgrh2;
        this.e = zzgrh3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        Clock clock0 = (Clock)this.b.zzb();
        zzeir zzeir0 = ((zzeis)this.c).zza();
        zzefi zzefi0 = (zzefi)this.d.zzb();
        zzfii zzfii0 = (zzfii)this.e.zzb();
        zzeiq zzeiq0 = this.a.zzb(clock0, zzeir0, zzefi0, zzfii0);
        zzgrc.zzb(zzeiq0);
        return zzeiq0;
    }
}

