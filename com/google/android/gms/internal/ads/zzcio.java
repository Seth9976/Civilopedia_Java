package com.google.android.gms.internal.ads;

public final class zzcio {
    public final zzaym a;
    public long b;
    public long c;
    public long d;
    public long e;
    public int f;
    public boolean g;

    public zzcio() {
        this.a = new zzaym(true, 0x10000);
        this.b = 15000000L;
        this.c = 30000000L;
        this.d = 2500000L;
        this.e = 5000000L;
    }

    public final void zza() {
        this.f = 0;
        this.g = false;
    }

    public final void zzb() {
        this.f = 0;
        this.g = false;
        this.a.zze();
    }

    public final void zzc() {
        this.f = 0;
        this.g = false;
        this.a.zze();
    }

    public final void zzd(zzary[] arr_zzary, zzaxq zzaxq0, zzayc zzayc0) {
        this.f = 0;
        for(int v = 0; v < 2; ++v) {
            if(zzayc0.zza(v) != null) {
                int v1 = this.f;
                this.f = zzazo.zzf(arr_zzary[v].zzc()) + v1;
            }
        }
        this.a.zzf(this.f);
    }

    public final void zzf(int v) {
        synchronized(this) {
            this.d = ((long)v) * 1000L;
        }
    }

    public final void zzg(int v) {
        synchronized(this) {
            this.e = ((long)v) * 1000L;
        }
    }

    public final void zzh(int v) {
        synchronized(this) {
            this.c = ((long)v) * 1000L;
        }
    }

    public final void zzi(int v) {
        synchronized(this) {
            this.b = ((long)v) * 1000L;
        }
    }

    public final boolean zzj(long v) {
        int v2;
        boolean z = true;
        synchronized(this) {
            if(v > this.c) {
                v2 = 0;
            }
            else {
                v2 = v >= this.b ? 1 : 2;
            }
            int v3 = this.a.zza();
            if(v2 != 2 && (v2 != 1 || !this.g || v3 >= this.f)) {
                z = false;
            }
            this.g = z;
            return z;
        }
    }

    public final boolean zzk(long v, boolean z) {
        synchronized(this) {
            long v1 = z ? this.e : this.d;
            if(v1 > 0L && v < v1) {
                return false;
            }
        }
        return true;
    }

    public final zzaym zzl() {
        return this.a;
    }
}

