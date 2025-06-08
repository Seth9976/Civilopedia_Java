package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import p.k;

public final class zzdns {
    public final zzbmc a;
    public final zzblz b;
    public final zzbmp c;
    public final zzbmm d;
    public final zzbrb e;
    public final k f;
    public final k g;
    public static final zzdns zza;

    static {
        zzdns.zza = new zzdns(new zzdnq());
    }

    public zzdns(zzdnq zzdnq0) {
        this.a = zzdnq0.a;
        this.b = zzdnq0.b;
        this.c = zzdnq0.c;
        this.f = new k(zzdnq0.f);
        this.g = new k(zzdnq0.g);
        this.d = zzdnq0.d;
        this.e = zzdnq0.e;
    }

    public final zzblz zza() {
        return this.b;
    }

    public final zzbmc zzb() {
        return this.a;
    }

    public final zzbmf zzc(String s) {
        return (zzbmf)this.g.getOrDefault(s, null);
    }

    public final zzbmi zzd(String s) {
        return (zzbmi)this.f.getOrDefault(s, null);
    }

    public final zzbmm zze() {
        return this.d;
    }

    public final zzbmp zzf() {
        return this.c;
    }

    public final zzbrb zzg() {
        return this.e;
    }

    public final ArrayList zzh() {
        k k0 = this.f;
        ArrayList arrayList0 = new ArrayList(k0.k);
        for(int v = 0; v < k0.k; ++v) {
            arrayList0.add(((String)k0.i(v)));
        }
        return arrayList0;
    }

    public final ArrayList zzi() {
        ArrayList arrayList0 = new ArrayList();
        if(this.c != null) {
            arrayList0.add("6");
        }
        if(this.a != null) {
            arrayList0.add("1");
        }
        if(this.b != null) {
            arrayList0.add("2");
        }
        if(!this.f.isEmpty()) {
            arrayList0.add("3");
        }
        if(this.e != null) {
            arrayList0.add("7");
        }
        return arrayList0;
    }
}

