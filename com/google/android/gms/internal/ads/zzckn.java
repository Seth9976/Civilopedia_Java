package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

public final class zzckn implements zzep {
    public final zzckv zza;
    public final String zzb;
    public final boolean zzc;

    public zzckn(zzckv zzckv0, String s, boolean z) {
        this.zza = zzckv0;
        this.zzb = s;
        this.zzc = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzep
    public final zzeq zza() {
        this.zza.getClass();
        e3 e30 = new e3(this.zzb, (this.zzc ? this.zza : null), this.zza.n.zzd, this.zza.n.zzf, this.zza.n.zzi);
        WeakReference weakReference0 = new WeakReference(e30);
        this.zza.C.add(weakReference0);
        return e30;
    }
}

