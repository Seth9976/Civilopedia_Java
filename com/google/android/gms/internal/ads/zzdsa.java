package com.google.android.gms.internal.ads;

public final class zzdsa {
    public final zzdbr a;
    public final zzdda b;
    public final zzddn c;
    public final zzddz d;
    public final zzdgm e;
    public final zzfbl f;
    public final zzfbo g;

    public zzdsa(zzdbr zzdbr0, zzdda zzdda0, zzddn zzddn0, zzddz zzddz0, zzdgm zzdgm0, zzfbl zzfbl0, zzfbo zzfbo0) {
        this.a = zzdbr0;
        this.b = zzdda0;
        this.c = zzddn0;
        this.d = zzddz0;
        this.e = zzdgm0;
        this.f = zzfbl0;
        this.g = zzfbo0;
    }

    public final void zza(zzdse zzdse0) {
        this.b.getClass();
        zzdrz zzdrz0 = new zzdrz(this.b);
        synchronized(zzdse0.a) {
            zzdse0.a.i = this.a;
            zzdse0.a.j = this.c;
            zzdse0.a.k = this.d;
            zzdse0.a.l = this.e;
            zzdse0.a.m = zzdrz0;
        }
        zzdse0.zze(this.f, this.g);
    }
}

