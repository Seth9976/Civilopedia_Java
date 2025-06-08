package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

public final class zzcir implements zzayi {
    public final zzciz zza;
    public final String zzb;
    public final boolean zzc;

    public zzcir(zzciz zzciz0, String s, boolean z) {
        this.zza = zzciz0;
        this.zzb = s;
        this.zzc = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzayi
    public final zzayj zza() {
        this.zza.getClass();
        S2 s20 = new S2(this.zzb, (this.zzc ? this.zza : null), this.zza.p.zzd, this.zza.p.zzf, this.zza.p.zzi);
        WeakReference weakReference0 = new WeakReference(s20);
        this.zza.D.add(weakReference0);
        return s20;
    }
}

