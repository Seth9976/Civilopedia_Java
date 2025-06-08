package com.google.android.gms.internal.ads;

public final class zzbtm implements zzfuj {
    public final zzbss a;
    public final zzbst b;
    public final zzfvl c;

    public zzbtm(zzfvl zzfvl0, zzbst zzbst0, zzbss zzbss0) {
        this.c = zzfvl0;
        this.b = zzbst0;
        this.a = zzbss0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) throws Exception {
        return this.zzb(object0);
    }

    public final zzfvl zzb(Object object0) {
        zzbtk zzbtk0 = new zzbtk(this, object0);
        return zzfvc.zzn(this.c, zzbtk0, zzcfv.zzf);
    }
}

