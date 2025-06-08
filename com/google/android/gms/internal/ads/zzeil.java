package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzeil extends zzeii {
    public final zzcnf a;
    public final zzdbd b;
    public final zzekr c;
    public final zzdhf d;

    public zzeil(zzcnf zzcnf0, zzdbd zzdbd0, zzekr zzekr0, zzdhf zzdhf0) {
        this.a = zzcnf0;
        this.b = zzdbd0;
        this.c = zzekr0;
        this.d = zzdhf0;
    }

    @Override  // com.google.android.gms.internal.ads.zzeii
    public final zzfvl a(zzfcd zzfcd0, Bundle bundle0) {
        zzdkx zzdkx0 = this.a.zzg();
        this.b.zzf(zzfcd0);
        this.b.zzd(bundle0);
        zzdkx0.zze(this.b.zzg());
        zzdkx0.zzd(this.d);
        zzdkx0.zzc(this.c);
        zzcza zzcza0 = zzdkx0.zzf().zza();
        return zzcza0.zzh(zzcza0.zzi());
    }
}

