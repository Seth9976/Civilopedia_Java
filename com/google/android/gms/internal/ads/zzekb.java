package com.google.android.gms.internal.ads;

public final class zzekb implements zzffi {
    public final zzekd zza;
    public final zzfbx zzb;
    public final zzfbl zzc;
    public final zzefg zzd;

    public zzekb(zzekd zzekd0, zzfbx zzfbx0, zzfbl zzfbl0, zzefg zzefg0) {
        this.zza = zzekd0;
        this.zzb = zzfbx0;
        this.zzc = zzfbl0;
        this.zzd = zzefg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzffi
    public final Object zza(Object object0) {
        Void void0 = (Void)object0;
        return this.zza.b.zza(this.zzb, this.zzc, this.zzd);
    }
}

