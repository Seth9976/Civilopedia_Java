package com.google.android.gms.internal.ads;

public final class zzckg implements zzja {
    public final zzvv a;
    public long b;
    public long c;
    public long d;
    public long e;
    public int f;
    public boolean g;

    public zzckg() {
        this.a = new zzvv(true, 0x10000);
        this.b = 15000000L;
        this.c = 30000000L;
        this.d = 2500000L;
        this.e = 5000000L;
    }

    @Override  // com.google.android.gms.internal.ads.zzja
    public final long zza() {
        return 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzja
    public final void zzb() {
        this.f = 0;
        this.g = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzja
    public final void zzc() {
        this.f = 0;
        this.g = false;
        this.a.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzja
    public final void zzd() {
        this.f = 0;
        this.g = false;
        this.a.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzja
    public final void zze(zzjt[] arr_zzjt, zzty zzty0, zzvg[] arr_zzvg) {
        this.f = 0;
        for(int v = 0; v < 2; ++v) {
            if(arr_zzvg[v] != null) {
                this.f += (arr_zzjt[v].zzb() == 1 ? 0xC80000 : 0x7D00000);
            }
        }
        this.a.zzf(this.f);
    }

    @Override  // com.google.android.gms.internal.ads.zzja
    public final boolean zzf() {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzja
    public final boolean zzg(long v, long v1, float f) {
        int v2;
        boolean z = true;
        if(v1 > this.c) {
            v2 = 0;
        }
        else {
            v2 = v1 >= this.b ? 1 : 2;
        }
        int v3 = this.a.zza();
        if(v2 != 2 && (v2 != 1 || !this.g || v3 >= this.f)) {
            z = false;
        }
        this.g = z;
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzja
    public final boolean zzh(long v, float f, boolean z, long v1) {
        long v2 = z ? this.e : this.d;
        return v2 <= 0L || v >= v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzja
    public final zzvv zzi() {
        return this.a;
    }

    public final void zzk(int v) {
        synchronized(this) {
            this.d = ((long)v) * 1000L;
        }
    }

    public final void zzl(int v) {
        synchronized(this) {
            this.e = ((long)v) * 1000L;
        }
    }

    public final void zzm(int v) {
        synchronized(this) {
            this.c = ((long)v) * 1000L;
        }
    }

    public final void zzn(int v) {
        synchronized(this) {
            this.b = ((long)v) * 1000L;
        }
    }
}

