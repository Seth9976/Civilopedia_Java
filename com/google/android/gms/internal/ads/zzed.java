package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzed {
    public long[] a;
    public Object[] b;
    public int c;
    public int d;

    public zzed() {
        this(10);
    }

    public zzed(int v) {
        this.a = new long[10];
        this.b = new Object[10];
    }

    public final Object a() {
        zzcw.zzf(this.d > 0);
        Object[] arr_object = this.b;
        int v = this.c;
        Object object0 = arr_object[v];
        arr_object[v] = null;
        this.c = (v + 1) % arr_object.length;
        --this.d;
        return object0;
    }

    public final int zza() {
        synchronized(this) {
        }
        return this.d;
    }

    public final Object zzb() {
        synchronized(this) {
            return this.d == 0 ? null : this.a();
        }
    }

    public final Object zzc(long v) {
        synchronized(this) {
            Object object0;
            for(object0 = null; this.d > 0 && v - this.a[this.c] >= 0L; object0 = this.a()) {
            }
            return object0;
        }
    }

    public final void zzd(long v, Object object0) {
        synchronized(this) {
            if(this.d > 0 && v <= this.a[(this.c + this.d - 1) % this.b.length]) {
                this.zze();
            }
            int v2 = this.b.length;
            if(this.d >= v2) {
                int v3 = v2 + v2;
                long[] arr_v = new long[v3];
                Object[] arr_object = new Object[v3];
                int v4 = v2 - this.c;
                System.arraycopy(this.a, this.c, arr_v, 0, v4);
                System.arraycopy(this.b, this.c, arr_object, 0, v4);
                int v5 = this.c;
                if(v5 > 0) {
                    System.arraycopy(this.a, 0, arr_v, v4, v5);
                    System.arraycopy(this.b, 0, arr_object, v4, this.c);
                }
                this.a = arr_v;
                this.b = arr_object;
                this.c = 0;
            }
            int v6 = this.d;
            Object[] arr_object1 = this.b;
            int v7 = (this.c + v6) % arr_object1.length;
            this.a[v7] = v;
            arr_object1[v7] = object0;
            this.d = v6 + 1;
        }
    }

    public final void zze() {
        synchronized(this) {
            this.c = 0;
            this.d = 0;
            Arrays.fill(this.b, null);
        }
    }
}

