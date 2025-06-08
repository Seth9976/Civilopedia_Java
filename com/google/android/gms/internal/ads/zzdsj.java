package com.google.android.gms.internal.ads;

public final class zzdsj {
    public final zzdbr a;
    public final zzdda b;
    public final zzddn c;
    public final zzddz d;
    public final zzdgm e;
    public final zzdje f;

    public zzdsj(zzdbr zzdbr0, zzdda zzdda0, zzddn zzddn0, zzddz zzddz0, zzdgm zzdgm0, zzdje zzdje0) {
        this.a = zzdbr0;
        this.b = zzdda0;
        this.c = zzddn0;
        this.d = zzddz0;
        this.e = zzdgm0;
        this.f = zzdje0;
    }

    public final void zza(zzdsk zzdsk0) {
        this.b.getClass();
        zzdsi zzdsi0 = new zzdsi(this.b);
        synchronized(zzdsk0.a) {
            zzdsk0.a.i = this.a;
            zzdsk0.a.j = this.c;
            zzdsk0.a.k = this.d;
            zzdsk0.a.l = this.e;
            zzdsk0.a.m = zzdsi0;
            zzdsk0.a.n = this.f;
        }
    }
}

