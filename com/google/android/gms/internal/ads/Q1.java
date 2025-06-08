package com.google.android.gms.internal.ads;

public final class q1 {
    public int a;
    public int[] b;
    public long[] c;
    public int[] d;
    public int[] e;
    public long[] f;
    public zzaue[] g;
    public zzart[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;
    public zzart q;

    public final void a(long v, int v1, long v2, int v3, zzaue zzaue0) {
        synchronized(this) {
            if(this.o) {
                if((v1 & 1) == 0) {
                    return;
                }
                this.o = false;
            }
            zzayz.zze(!this.p);
            this.b(v);
            int v5 = this.l;
            this.f[v5] = v;
            long[] arr_v = this.c;
            arr_v[v5] = v2;
            this.d[v5] = v3;
            this.e[v5] = v1;
            this.g[v5] = zzaue0;
            this.h[v5] = this.q;
            this.b[v5] = 0;
            int v6 = this.i + 1;
            this.i = v6;
            int v7 = this.a;
            if(v6 == v7) {
                int[] arr_v1 = new int[v7 + 1000];
                long[] arr_v2 = new long[v7 + 1000];
                long[] arr_v3 = new long[v7 + 1000];
                int[] arr_v4 = new int[v7 + 1000];
                int[] arr_v5 = new int[v7 + 1000];
                zzaue[] arr_zzaue = new zzaue[v7 + 1000];
                zzart[] arr_zzart = new zzart[v7 + 1000];
                int v8 = v7 - this.k;
                System.arraycopy(arr_v, this.k, arr_v2, 0, v8);
                System.arraycopy(this.f, this.k, arr_v3, 0, v8);
                System.arraycopy(this.e, this.k, arr_v4, 0, v8);
                System.arraycopy(this.d, this.k, arr_v5, 0, v8);
                System.arraycopy(this.g, this.k, arr_zzaue, 0, v8);
                System.arraycopy(this.h, this.k, arr_zzart, 0, v8);
                System.arraycopy(this.b, this.k, arr_v1, 0, v8);
                int v9 = this.k;
                System.arraycopy(this.c, 0, arr_v2, v8, v9);
                System.arraycopy(this.f, 0, arr_v3, v8, v9);
                System.arraycopy(this.e, 0, arr_v4, v8, v9);
                System.arraycopy(this.d, 0, arr_v5, v8, v9);
                System.arraycopy(this.g, 0, arr_zzaue, v8, v9);
                System.arraycopy(this.h, 0, arr_zzart, v8, v9);
                System.arraycopy(this.b, 0, arr_v1, v8, v9);
                this.c = arr_v2;
                this.f = arr_v3;
                this.e = arr_v4;
                this.d = arr_v5;
                this.g = arr_zzaue;
                this.h = arr_zzart;
                this.b = arr_v1;
                this.k = 0;
                this.l = this.a;
                this.i = this.a;
                this.a = v7 + 1000;
                return;
            }
            this.l = v5 + 1;
            if(v5 + 1 == v7) {
                this.l = 0;
            }
        }
    }

    public final void b(long v) {
        synchronized(this) {
            this.n = Math.max(this.n, v);
        }
    }

    public final boolean c() {
        synchronized(this) {
        }
        return this.i != 0;
    }
}

