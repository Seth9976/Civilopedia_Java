package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.WindowManager;

@TargetApi(16)
public final class zzazz {
    public final v1 a;
    public final boolean b;
    public final long c;
    public final long d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public long i;
    public long j;
    public long k;

    public zzazz() {
        this(-1.0);
    }

    public zzazz(double f) {
        long v;
        this.b = ((long)f) != 0xBFF0000000000000L;
        if(((long)f) == 0xBFF0000000000000L) {
            this.a = null;
            v = -1L;
            this.c = -1L;
        }
        else {
            this.a = v1.m;
            this.c = (long)(0x41CDCD6500000000L / ((long)f));
            v = ((long)(0x41CDCD6500000000L / ((long)f))) * 80L / 100L;
        }
        this.d = v;
    }

    public zzazz(Context context0) {
        WindowManager windowManager0 = (WindowManager)context0.getSystemService("window");
        this((windowManager0.getDefaultDisplay() == null ? -1.0 : ((double)windowManager0.getDefaultDisplay().getRefreshRate())));
    }

    public final long zza(long v, long v1) {
        long v9;
        long v5;
        long v4;
        if(this.h) {
            if(v != this.e) {
                ++this.k;
                this.f = this.g;
            }
            long v2 = this.k;
            if(v2 >= 6L) {
                long v3 = this.j;
                v4 = this.f + (1000L * v - v3) / v2;
                if(Math.abs(v1 - this.i - (v4 - v3)) > 20000000L) {
                    this.h = false;
                    v5 = v1;
                    v4 = 1000L * v;
                }
                else {
                    v5 = this.i + v4 - this.j;
                }
            }
            else {
                if(Math.abs(v1 - this.i - (1000L * v - this.j)) > 20000000L) {
                    this.h = false;
                }
                v5 = v1;
                v4 = 1000L * v;
            }
        }
        else {
            v5 = v1;
            v4 = 1000L * v;
        }
        if(!this.h) {
            this.j = 1000L * v;
            this.i = v1;
            this.k = 0L;
            this.h = true;
        }
        this.e = v;
        this.g = v4;
        if(this.a != null && this.a.i != 0L) {
            long v6 = this.a.i;
            long v7 = this.c;
            long v8 = (v5 - v6) / v7 * v7 + v6;
            if(v5 <= v8) {
                v9 = v8 - v7;
            }
            else {
                v9 = v8;
                v8 = v7 + v8;
            }
            if(v8 - v5 >= v5 - v9) {
                v8 = v9;
            }
            return v8 - this.d;
        }
        return v5;
    }

    public final void zzb() {
        if(this.b) {
            this.a.j.sendEmptyMessage(2);
        }
    }

    public final void zzc() {
        this.h = false;
        if(this.b) {
            this.a.j.sendEmptyMessage(1);
        }
    }
}

