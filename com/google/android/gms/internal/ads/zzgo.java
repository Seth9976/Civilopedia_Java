package com.google.android.gms.internal.ads;

import android.os.SystemClock;

public final class zzgo {
    public final long a;
    public final long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public float i;
    public long j;
    public long k;
    public long l;

    public zzgo(long v, long v1) {
        this.a = v;
        this.b = v1;
        this.c = 0x8000000000000001L;
        this.d = 0x8000000000000001L;
        this.f = 0x8000000000000001L;
        this.g = 0x8000000000000001L;
        this.i = 1.0f;
        this.j = 0x8000000000000001L;
        this.e = 0x8000000000000001L;
        this.h = 0x8000000000000001L;
        this.k = 0x8000000000000001L;
        this.l = 0x8000000000000001L;
    }

    public final void a() {
        long v = this.c;
        if(v == 0x8000000000000001L) {
            v = 0x8000000000000001L;
        }
        else {
            long v1 = this.d;
            if(v1 != 0x8000000000000001L) {
                v = v1;
            }
            long v2 = this.f;
            if(v2 != 0x8000000000000001L && v < v2) {
                v = v2;
            }
            long v3 = this.g;
            if(v3 != 0x8000000000000001L && v > v3) {
                v = v3;
            }
        }
        if(this.e == v) {
            return;
        }
        this.e = v;
        this.h = v;
        this.k = 0x8000000000000001L;
        this.l = 0x8000000000000001L;
        this.j = 0x8000000000000001L;
    }

    public final float zza(long v, long v1) {
        long v6;
        if(this.c != 0x8000000000000001L) {
            long v2 = v - v1;
            long v3 = this.k;
            if(v3 == 0x8000000000000001L) {
                this.k = v2;
                this.l = 0L;
            }
            else {
                long v4 = Math.max(v2, ((long)(((float)v2) * 0.001f + ((float)v3) * 0.999f)));
                this.k = v4;
                this.l = (long)(((float)Math.abs(v2 - v4)) * 0.001f + ((float)this.l) * 0.999f);
            }
            if(this.j != 0x8000000000000001L && SystemClock.elapsedRealtime() - this.j < 1000L) {
                return this.i;
            }
            this.j = SystemClock.elapsedRealtime();
            long v5 = this.l * 3L + this.k;
            if(this.h > v5) {
                float f = (float)zzeg.zzv(1000L);
                long[] arr_v = {v5, this.e, this.h - (((long)((this.i - 1.0f) * f)) + ((long)(0.03f * f)))};
                v6 = arr_v[0];
                for(int v7 = 1; v7 < 3; ++v7) {
                    long v8 = arr_v[v7];
                    if(v8 > v6) {
                        v6 = v8;
                    }
                }
                this.h = v6;
            }
            else {
                long v9 = zzeg.zzr(v - ((long)(Math.max(0.0f, this.i - 1.0f) / 1.000000E-07f)), this.h, v5);
                this.h = v9;
                long v10 = this.g;
                if(v10 == 0x8000000000000001L || v9 <= v10) {
                    v6 = v9;
                }
                else {
                    this.h = v10;
                    v6 = v10;
                }
            }
            long v11 = v - v6;
            if(Long.compare(Math.abs(v11), this.a) < 0) {
                this.i = 1.0f;
                return 1.0f;
            }
            float f1 = zzeg.zza(((float)v11) * 1.000000E-07f + 1.0f, 0.97f, 1.03f);
            this.i = f1;
            return f1;
        }
        return 1.0f;
    }

    public final long zzb() {
        return this.h;
    }

    public final void zzc() {
        long v = this.h;
        if(v == 0x8000000000000001L) {
            return;
        }
        long v1 = v + this.b;
        this.h = v1;
        long v2 = this.g;
        if(v2 != 0x8000000000000001L && v1 > v2) {
            this.h = v2;
        }
        this.j = 0x8000000000000001L;
    }

    public final void zzd(zzau zzau0) {
        this.c = zzeg.zzv(0x8000000000000001L);
        this.f = zzeg.zzv(0x8000000000000001L);
        this.g = zzeg.zzv(0x8000000000000001L);
        this.a();
    }

    public final void zze(long v) {
        this.d = v;
        this.a();
    }
}

