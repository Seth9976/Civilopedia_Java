package com.google.android.gms.internal.ads;

import p.k;

public final class zzdnq {
    public zzbmc a;
    public zzblz b;
    public zzbmp c;
    public zzbmm d;
    public zzbrb e;
    public final k f;
    public final k g;

    public zzdnq() {
        this.f = new k();
        this.g = new k();
    }

    public final zzdnq zza(zzblz zzblz0) {
        this.b = zzblz0;
        return this;
    }

    public final zzdnq zzb(zzbmc zzbmc0) {
        this.a = zzbmc0;
        return this;
    }

    public final zzdnq zzc(String s, zzbmi zzbmi0, zzbmf zzbmf0) {
        this.f.put(s, zzbmi0);
        if(zzbmf0 != null) {
            this.g.put(s, zzbmf0);
        }
        return this;
    }

    public final zzdnq zzd(zzbrb zzbrb0) {
        this.e = zzbrb0;
        return this;
    }

    public final zzdnq zze(zzbmm zzbmm0) {
        this.d = zzbmm0;
        return this;
    }

    public final zzdnq zzf(zzbmp zzbmp0) {
        this.c = zzbmp0;
        return this;
    }

    public final zzdns zzg() {
        return new zzdns(this);
    }
}

