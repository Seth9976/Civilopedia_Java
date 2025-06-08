package com.google.android.gms.internal.ads;

import java.io.IOException;

public abstract class zzgk implements zzjt, zzju {
    public final int i;
    public final zziz j;
    public zzjv k;
    public int l;
    public zzmu m;
    public int n;
    public zztq o;
    public zzad[] p;
    public long q;
    public long r;
    public boolean s;
    public boolean t;

    public zzgk(int v) {
        this.i = v;
        this.j = new zziz();
        this.r = 0x8000000000000000L;
    }

    public final int a(zziz zziz0, zzgb zzgb0, int v) {
        zztq zztq0 = this.o;
        zztq0.getClass();
        int v1 = zztq0.zza(zziz0, zzgb0, v);
        if(v1 == -4) {
            if(zzgb0.zzg()) {
                this.r = 0x8000000000000000L;
                return this.s ? -4 : -3;
            }
            long v2 = zzgb0.zzd + this.q;
            zzgb0.zzd = v2;
            this.r = Math.max(this.r, v2);
            return -4;
        }
        if(v1 == -5) {
            zzad zzad0 = zziz0.zza;
            zzad0.getClass();
            long v3 = zzad0.zzq;
            if(v3 != 0x7FFFFFFFFFFFFFFFL) {
                zzab zzab0 = zzad0.zzb();
                zzab0.zzW(v3 + this.q);
                zziz0.zza = zzab0.zzY();
                return -5;
            }
        }
        return v1;
    }

    public final zzgt b(Exception exception0, zzad zzad0, boolean z, int v) {
        int v2;
        if(zzad0 != null && !this.t) {
            try {
                this.t = true;
                v2 = this.zzO(zzad0);
            }
            catch(zzgt unused_ex) {
                this.t = false;
                return zzgt.zzb(exception0, this.zzK(), this.l, zzad0, 4, z, v);
            }
            finally {
                this.t = false;
            }
            return zzgt.zzb(exception0, this.zzK(), this.l, zzad0, v2 & 7, z, v);
        }
        return zzgt.zzb(exception0, this.zzK(), this.l, zzad0, 4, z, v);
    }

    public void c() {
        throw null;
    }

    public void d(boolean z, boolean z1) {
    }

    public void e(long v, boolean z) {
        throw null;
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(long v, long v1) {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzjt
    public final void zzA() {
        zzcw.zzf(this.n == 0);
        this.j.zzb = null;
        this.j.zza = null;
        this.f();
    }

    @Override  // com.google.android.gms.internal.ads.zzjt
    public final void zzB(long v) throws zzgt {
        this.s = false;
        this.r = v;
        this.e(v, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzjt
    public final void zzC() {
        this.s = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzjt
    public void zzD(float f, float f1) {
    }

    @Override  // com.google.android.gms.internal.ads.zzjt
    public final void zzE() throws zzgt {
        zzcw.zzf(this.n == 1);
        this.n = 2;
        this.g();
    }

    @Override  // com.google.android.gms.internal.ads.zzjt
    public final void zzF() {
        zzcw.zzf(this.n == 2);
        this.n = 1;
        this.h();
    }

    @Override  // com.google.android.gms.internal.ads.zzjt
    public final boolean zzG() {
        return this.r == 0x8000000000000000L;
    }

    @Override  // com.google.android.gms.internal.ads.zzjt
    public final boolean zzH() {
        return this.s;
    }

    @Override  // com.google.android.gms.internal.ads.zzjt, com.google.android.gms.internal.ads.zzju
    public final int zzb() {
        return this.i;
    }

    @Override  // com.google.android.gms.internal.ads.zzjt
    public final int zzbe() {
        return this.n;
    }

    @Override  // com.google.android.gms.internal.ads.zzju
    public int zze() throws zzgt {
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzjt
    public final long zzf() {
        return this.r;
    }

    @Override  // com.google.android.gms.internal.ads.zzjt
    public zzjb zzi() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzjt
    public final zzju zzj() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzjt
    public final zztq zzm() {
        return this.o;
    }

    @Override  // com.google.android.gms.internal.ads.zzjt
    public final void zzn() {
        zzcw.zzf(this.n == 1);
        this.j.zzb = null;
        this.j.zza = null;
        this.n = 0;
        this.o = null;
        this.p = null;
        this.s = false;
        this.c();
    }

    @Override  // com.google.android.gms.internal.ads.zzjt
    public final void zzo(zzjv zzjv0, zzad[] arr_zzad, zztq zztq0, long v, boolean z, boolean z1, long v1, long v2) throws zzgt {
        zzcw.zzf(this.n == 0);
        this.k = zzjv0;
        this.n = 1;
        this.d(z, z1);
        this.zzz(arr_zzad, zztq0, v1, v2);
        this.s = false;
        this.r = v;
        this.e(v, z);
    }

    @Override  // com.google.android.gms.internal.ads.zzjp
    public void zzp(int v, Object object0) throws zzgt {
    }

    @Override  // com.google.android.gms.internal.ads.zzjt
    public final void zzq(int v, zzmu zzmu0) {
        this.l = v;
        this.m = zzmu0;
    }

    @Override  // com.google.android.gms.internal.ads.zzjt
    public final void zzr() throws IOException {
        zztq zztq0 = this.o;
        zztq0.getClass();
        zztq0.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzjt
    public final void zzz(zzad[] arr_zzad, zztq zztq0, long v, long v1) throws zzgt {
        zzcw.zzf(!this.s);
        this.o = zztq0;
        if(this.r == 0x8000000000000000L) {
            this.r = v;
        }
        this.p = arr_zzad;
        this.q = v1;
        this.i(v, v1);
    }
}

