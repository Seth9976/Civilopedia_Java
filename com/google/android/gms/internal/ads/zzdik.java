package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzdik extends zzdhc implements zzdim {
    public zzdik(Set set0) {
        super(set0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdim
    public final void zza(String s) {
        this.a(new zzdij("MalformedJson"));
    }

    @Override  // com.google.android.gms.internal.ads.zzdim
    public final void zzb(String s, String s1) {
        this.a(new zzdih(s, s1));
    }

    @Override  // com.google.android.gms.internal.ads.zzdim
    public final void zzc(String s) {
        this.a(new zzdig(s));
    }

    @Override  // com.google.android.gms.internal.ads.zzdim
    public final void zzd(String s) {
        this.a(new zzdii(s));
    }

    @Override  // com.google.android.gms.internal.ads.zzdim
    public final void zze() {
        this.a(zzdif.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzdim
    public final void zzf() {
        this.a(zzdie.zza);
    }
}

