package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbf;

public final class zzemu {
    public final zzdns a;
    public final zzemh b;
    public final zzemt c;

    public zzemu(zzdns zzdns0, zzfgp zzfgp0) {
        this.a = zzdns0;
        zzemh zzemh0 = new zzemh(zzfgp0);
        this.b = zzemh0;
        this.c = new zzemt(zzemh0, zzdns0.zzg());
    }

    public final zzdbw zza() {
        return this.c;
    }

    public final zzddh zzb() {
        return this.b;
    }

    public final zzdlp zzc() {
        zzbf zzbf0 = this.b.zzc();
        return new zzdlp(this.a, zzbf0);
    }

    public final zzemh zzd() {
        return this.b;
    }

    public final void zze(zzbf zzbf0) {
        this.b.zze(zzbf0);
    }
}

