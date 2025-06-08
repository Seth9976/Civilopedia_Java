package com.google.android.gms.internal.ads;

import java.io.IOException;

public abstract class zzard implements zzary, zzarz {
    public final int a;
    public zzasa b;
    public int c;
    public int d;
    public zzaxl e;
    public long f;
    public boolean g;
    public boolean h;

    public zzard(int v) {
        this.a = v;
        this.g = true;
    }

    public final int a(zzaru zzaru0, zzato zzato0, boolean z) {
        int v = this.e.zzb(zzaru0, zzato0, z);
        if(v == -4) {
            if(zzato0.zzf()) {
                this.g = true;
                return this.h ? -4 : -3;
            }
            zzato0.zzc += this.f;
            return -4;
        }
        if(v == -5) {
            zzart zzart0 = zzaru0.zza;
            long v1 = zzart0.zzw;
            if(v1 != 0x7FFFFFFFFFFFFFFFL) {
                zzaru0.zza = new zzart(zzart0.zza, zzart0.zze, zzart0.zzf, zzart0.zzc, zzart0.zzb, zzart0.zzg, zzart0.zzj, zzart0.zzk, zzart0.zzl, zzart0.zzm, zzart0.zzn, zzart0.zzp, zzart0.zzo, zzart0.zzq, zzart0.zzr, zzart0.zzs, zzart0.zzt, zzart0.zzu, zzart0.zzv, zzart0.zzx, zzart0.zzy, zzart0.zzz, v1 + this.f, zzart0.zzh, zzart0.zzi, zzart0.zzd);
                return -5;
            }
        }
        return v;
    }

    public void b() {
        throw null;
    }

    public void c(boolean z) {
    }

    public void d(long v, boolean z) {
        throw null;
    }

    public void e() {
    }

    public void f() {
    }

    public void g(zzart[] arr_zzart, long v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzary
    public final boolean zzA() {
        return this.g;
    }

    @Override  // com.google.android.gms.internal.ads.zzary
    public final boolean zzB() {
        return this.h;
    }

    @Override  // com.google.android.gms.internal.ads.zzary
    public final int zzb() {
        return this.d;
    }

    @Override  // com.google.android.gms.internal.ads.zzary, com.google.android.gms.internal.ads.zzarz
    public final int zzc() {
        return this.a;
    }

    @Override  // com.google.android.gms.internal.ads.zzarz
    public int zze() throws zzarf {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzary
    public final zzarz zzf() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzary
    public final zzaxl zzh() {
        return this.e;
    }

    @Override  // com.google.android.gms.internal.ads.zzary
    public zzazd zzi() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzary
    public final void zzj() {
        zzayz.zze(this.d == 1);
        this.d = 0;
        this.e = null;
        this.h = false;
        this.b();
    }

    @Override  // com.google.android.gms.internal.ads.zzary
    public final void zzk(zzasa zzasa0, zzart[] arr_zzart, zzaxl zzaxl0, long v, boolean z, long v1) throws zzarf {
        zzayz.zze(this.d == 0);
        this.b = zzasa0;
        this.d = 1;
        this.c(z);
        this.zzt(arr_zzart, zzaxl0, v1);
        this.d(v, z);
    }

    @Override  // com.google.android.gms.internal.ads.zzarh
    public void zzl(int v, Object object0) throws zzarf {
    }

    @Override  // com.google.android.gms.internal.ads.zzary
    public final void zzm() throws IOException {
        this.e.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzary
    public final void zzt(zzart[] arr_zzart, zzaxl zzaxl0, long v) throws zzarf {
        zzayz.zze(!this.h);
        this.e = zzaxl0;
        this.g = false;
        this.f = v;
        this.g(arr_zzart, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzary
    public final void zzu(long v) throws zzarf {
        this.h = false;
        this.g = false;
        this.d(v, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzary
    public final void zzv() {
        this.h = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzary
    public final void zzw(int v) {
        this.c = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzary
    public final void zzy() throws zzarf {
        zzayz.zze(this.d == 1);
        this.d = 2;
        this.e();
    }

    @Override  // com.google.android.gms.internal.ads.zzary
    public final void zzz() throws zzarf {
        zzayz.zze(this.d == 2);
        this.d = 1;
        this.f();
    }
}

