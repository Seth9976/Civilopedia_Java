package com.google.android.gms.internal.ads;

public final class zzeds {
    public long a;
    public int b;
    public long c;
    public long d;
    public long e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    public zzeds() {
        this.a = 0L;
        this.b = 0;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = new Object();
        this.g = new Object();
        this.h = new Object();
        this.i = new Object();
        this.j = new Object();
    }

    public final int zza() {
        synchronized(this.g) {
        }
        return this.b;
    }

    public final long zzb() {
        synchronized(this) {
        }
        return this.e;
    }

    public final long zzc() {
        synchronized(this) {
        }
        return this.d;
    }

    public final long zzd() {
        synchronized(this) {
        }
        return this.a;
    }

    public final long zze() {
        synchronized(this.h) {
        }
        return this.c;
    }

    public final void zzf(long v) {
        synchronized(this) {
            synchronized(this.j) {
                this.e = v;
            }
        }
    }

    public final void zzg(long v) {
        synchronized(this) {
            synchronized(this.i) {
                this.d = v;
            }
        }
    }

    public final void zzh(long v) {
        synchronized(this) {
            synchronized(this.f) {
                this.a = v;
            }
        }
    }

    public final void zzi(int v) {
        synchronized(this.g) {
            this.b = v;
        }
    }

    public final void zzj(long v) {
        synchronized(this.h) {
            this.c = v;
        }
    }
}

