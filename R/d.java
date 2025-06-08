package r;

import android.view.View;
import java.util.ArrayList;
import q.b;

public class d {
    public final c[] A;
    public final ArrayList B;
    public d C;
    public int D;
    public int E;
    public float F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public float U;
    public float V;
    public View W;
    public int X;
    public String Y;
    public boolean Z;
    public int a;
    public boolean a0;
    public int b;
    public boolean b0;
    public j c;
    public int c0;
    public j d;
    public int d0;
    public int e;
    public final float[] e0;
    public int f;
    public final d[] f0;
    public final int[] g;
    public final d[] g0;
    public int h;
    public final int[] h0;
    public int i;
    public float j;
    public int k;
    public int l;
    public float m;
    public int n;
    public float o;
    public f p;
    public final int[] q;
    public float r;
    public final c s;
    public final c t;
    public final c u;
    public final c v;
    public final c w;
    public final c x;
    public final c y;
    public final c z;

    public d() {
        this.a = -1;
        this.b = -1;
        this.e = 0;
        this.f = 0;
        this.g = new int[2];
        this.h = 0;
        this.i = 0;
        this.j = 1.0f;
        this.k = 0;
        this.l = 0;
        this.m = 1.0f;
        this.n = -1;
        this.o = 1.0f;
        this.p = null;
        this.q = new int[]{0x7FFFFFFF, 0x7FFFFFFF};
        this.r = 0.0f;
        c c0 = new c(this, 2);
        this.s = c0;
        c c1 = new c(this, 3);
        this.t = c1;
        c c2 = new c(this, 4);
        this.u = c2;
        c c3 = new c(this, 5);
        this.v = c3;
        c c4 = new c(this, 6);
        this.w = c4;
        c c5 = new c(this, 8);
        this.x = c5;
        c c6 = new c(this, 9);
        this.y = c6;
        c c7 = new c(this, 7);
        this.z = c7;
        this.A = new c[]{c0, c2, c1, c3, c4, c7};
        ArrayList arrayList0 = new ArrayList();
        this.B = arrayList0;
        this.h0 = new int[]{1, 1};
        this.C = null;
        this.D = 0;
        this.E = 0;
        this.F = 0.0f;
        this.G = -1;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.U = 0.5f;
        this.V = 0.5f;
        this.X = 0;
        this.Y = null;
        this.Z = false;
        this.a0 = false;
        this.b0 = false;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = new float[]{-1.0f, -1.0f};
        this.f0 = new d[]{null, null};
        this.g0 = new d[]{null, null};
        arrayList0.add(c0);
        arrayList0.add(c1);
        arrayList0.add(c2);
        arrayList0.add(c3);
        arrayList0.add(c5);
        arrayList0.add(c6);
        arrayList0.add(c7);
        arrayList0.add(c4);
    }

    public void a(q.d d0) {
        int v15;
        q.f f15;
        q.f f14;
        q.f f13;
        q.f f12;
        c c7;
        int[] arr_v3;
        q.f f11;
        c c6;
        q.f f10;
        boolean z9;
        int v13;
        int v12;
        int v11;
        int[] arr_v1;
        boolean z8;
        boolean z7;
        boolean z6;
        boolean z5;
        q.f f6;
        boolean z4;
        boolean z3;
        q.f f5;
        boolean z2;
        c c0 = this.s;
        q.f f0 = d0.j(c0);
        c c1 = this.u;
        q.f f1 = d0.j(c1);
        c c2 = this.t;
        q.f f2 = d0.j(c2);
        c c3 = this.v;
        q.f f3 = d0.j(c3);
        c c4 = this.w;
        q.f f4 = d0.j(c4);
        d d1 = this.C;
        if(d1 == null) {
            f5 = f2;
            f6 = f0;
            z5 = false;
            z8 = false;
            z6 = false;
            z7 = false;
        }
        else {
            boolean z = d1.h0[0] == 2;
            boolean z1 = d1.h0[1] == 2;
            if(this.m(0)) {
                ((e)this.C).A(this, 0);
                z2 = true;
            }
            else {
                z2 = c0.d != null && c0.d.d == c0 || c1.d != null && c1.d.d == c1;
            }
            if(this.m(1)) {
                f5 = f2;
                ((e)this.C).A(this, 1);
                z3 = true;
            }
            else {
                f5 = f2;
                z3 = c2.d != null && c2.d.d == c2 || c3.d != null && c3.d.d == c3;
            }
            if(z) {
                z4 = z3;
                if(this.X == 8 || c0.d != null || c1.d != null) {
                    f6 = f0;
                }
                else {
                    f6 = f0;
                    d0.f(d0.j(this.C.u), f1, 0, 1);
                }
            }
            else {
                z4 = z3;
                f6 = f0;
            }
            if(z1 && this.X != 8 && c2.d == null && c3.d == null && c4 == null) {
                d0.f(d0.j(this.C.v), f3, 0, 1);
            }
            z5 = z;
            z6 = z2;
            z7 = z4;
            z8 = z1;
        }
        int v = this.D;
        int v1 = v < this.Q ? this.Q : v;
        int v2 = this.E;
        int v3 = v2 < this.R ? this.R : v2;
        int[] arr_v = this.h0;
        int v4 = arr_v[0];
        int v5 = arr_v[1];
        int v6 = this.G;
        this.n = v6;
        float f7 = this.F;
        this.o = f7;
        int v7 = v3;
        int v8 = this.e;
        int v9 = this.f;
        if(f7 > 0.0f) {
            arr_v1 = arr_v;
            if(this.X == 8) {
                goto label_145;
            }
            else {
                if(v4 == 3 && v8 == 0) {
                    v8 = 3;
                }
                if(v5 == 3 && v9 == 0) {
                    v9 = 3;
                }
                if(v4 == 3 && v5 == 3 && v8 == 3 && v9 == 3) {
                    if(v6 == -1) {
                        if(v4 != 3 && v5 == 3) {
                            this.n = 0;
                        }
                        else if(v4 == 3 && v5 != 3) {
                            this.n = 1;
                            this.o = 1.0f / f7;
                        }
                    }
                    if(this.n == 0 && (!c2.c() || !c3.c())) {
                        this.n = 1;
                    }
                    else if(this.n == 1 && (!c0.c() || !c1.c())) {
                        this.n = 0;
                    }
                    if(this.n == -1 && (!c2.c() || !c3.c() || !c0.c() || !c1.c())) {
                        if(c2.c() && c3.c()) {
                            this.n = 0;
                        }
                        else if(c0.c() && c1.c()) {
                            this.o = 1.0f / this.o;
                            this.n = 1;
                        }
                    }
                    if(this.n == -1) {
                        if(z5 && !z8) {
                            this.n = 0;
                        }
                        else if(!z5 && z8) {
                            this.o = 1.0f / this.o;
                            this.n = 1;
                        }
                    }
                    if(this.n == -1) {
                        int v10 = this.h;
                        if(v10 > 0 && this.k == 0) {
                            this.n = 0;
                        }
                        else if(v10 == 0 && this.k > 0) {
                            this.o = 1.0f / this.o;
                            this.n = 1;
                        }
                    }
                    if(this.n == -1 && z5 && z8) {
                        this.o = 1.0f / this.o;
                        this.n = 1;
                    }
                    v11 = v8;
                    v12 = v9;
                    v13 = v1;
                    z9 = true;
                }
                else if(v4 == 3 && v8 == 3) {
                    this.n = 0;
                    v13 = (int)(f7 * ((float)v2));
                    if(v5 == 3) {
                        v11 = 3;
                        v12 = v9;
                        z9 = true;
                    }
                    else {
                        v12 = v9;
                        v11 = 4;
                        z9 = false;
                    }
                }
                else if(v5 != 3 || v9 != 3) {
                    v11 = v8;
                    v12 = v9;
                    v13 = v1;
                    z9 = true;
                }
                else {
                    this.n = 1;
                    if(v6 == -1) {
                        this.o = 1.0f / f7;
                    }
                    v7 = (int)(this.o * ((float)v));
                    v11 = v8;
                    if(v4 == 3) {
                        v12 = v9;
                        v13 = v1;
                        z9 = true;
                    }
                    else {
                        v13 = v1;
                        v12 = 4;
                        goto label_148;
                    }
                }
            }
        }
        else {
            arr_v1 = arr_v;
        label_145:
            v11 = v8;
            v12 = v9;
            v13 = v1;
        label_148:
            z9 = false;
        }
        this.g[0] = v11;
        this.g[1] = v12;
        boolean z10 = z9 && (this.n == -1 || this.n == 0);
        boolean z11 = arr_v1[0] == 2 && this instanceof e;
        c c5 = this.z;
        boolean z12 = c5.c();
        int[] arr_v2 = this.q;
        q.f f8 = null;
        if(this.a == 2) {
            f12 = f5;
            f14 = f6;
            f13 = f1;
            f11 = f3;
            c6 = c4;
            f10 = f4;
            c7 = c5;
            arr_v3 = arr_v2;
        }
        else {
            q.f f9 = this.C == null ? null : d0.j(this.C.u);
            f10 = f4;
            c6 = c4;
            f11 = f3;
            arr_v3 = arr_v2;
            c7 = c5;
            f12 = f5;
            f13 = f1;
            f14 = f6;
            this.d(d0, z5, (this.C == null ? null : d0.j(this.C.s)), f9, arr_v1[0], z11, this.s, this.u, this.H, v13, this.Q, arr_v2[0], this.U, z10, z6, v11, this.h, this.i, this.j, !z12);
        }
        if(this.b == 2) {
            return;
        }
        boolean z13 = arr_v1[1] == 2 && this instanceof e;
        boolean z14 = z9 && (this.n == -1 || this.n == 1);
        int v14 = this.P;
        if(v14 > 0) {
            i i0 = c6.a;
            if(i0.b == 1) {
                i0.f(d0);
                f15 = f12;
                v15 = !z12;
            }
            else {
                f15 = f12;
                d0.e(f10, f15, v14, 6);
                c c8 = c6.d;
                if(c8 == null) {
                    v15 = !z12;
                }
                else {
                    d0.e(f10, d0.j(c8), 0, 6);
                    v15 = 0;
                }
            }
        }
        else {
            f15 = f12;
            v15 = !z12;
        }
        q.f f16 = this.C == null ? null : d0.j(this.C.v);
        d d2 = this.C;
        if(d2 != null) {
            f8 = d0.j(d2.t);
        }
        this.d(d0, z8, f8, f16, arr_v1[1], z13, this.t, this.v, this.I, v7, this.R, arr_v3[1], this.V, z14, z7, v12, this.k, this.l, this.m, ((boolean)v15));
        if(z9) {
            if(this.n == 1) {
                float f17 = this.o;
                b b0 = d0.k();
                b0.c.g(f11, -1.0f);
                b0.c.g(f15, 1.0f);
                b0.c.g(f13, f17);
                b0.c.g(f14, -f17);
                d0.c(b0);
            }
            else {
                float f18 = this.o;
                b b1 = d0.k();
                b1.c.g(f13, -1.0f);
                b1.c.g(f14, 1.0f);
                b1.c.g(f11, f18);
                b1.c.g(f15, -f18);
                d0.c(b1);
            }
        }
        if(c7.c()) {
            d d3 = c7.d.b;
            float f19 = (float)Math.toRadians(this.r + 90.0f);
            int v16 = c7.b();
            q.f f20 = d0.j(this.f(2));
            q.f f21 = d0.j(this.f(3));
            q.f f22 = d0.j(this.f(4));
            q.f f23 = d0.j(this.f(5));
            q.f f24 = d0.j(d3.f(2));
            q.f f25 = d0.j(d3.f(3));
            q.f f26 = d0.j(d3.f(4));
            q.f f27 = d0.j(d3.f(5));
            b b2 = d0.k();
            b2.c.g(f25, 0.5f);
            b2.c.g(f27, 0.5f);
            b2.c.g(f21, -0.5f);
            b2.c.g(f23, -0.5f);
            b2.b = -((float)(Math.sin(f19) * ((double)v16)));
            d0.c(b2);
            b b3 = d0.k();
            b3.c.g(f24, 0.5f);
            b3.c.g(f26, 0.5f);
            b3.c.g(f20, -0.5f);
            b3.c.g(f22, -0.5f);
            b3.b = -((float)(Math.cos(f19) * ((double)v16)));
            d0.c(b3);
        }
    }

    public boolean b() {
        return this.X != 8;
    }

    public void c(int v) {
        for(int v1 = 0; v1 < 6; ++v1) {
            i i0 = this.A[v1].a;
            c c0 = i0.c;
            c c1 = c0.d;
            if(c1 != null) {
                i i1 = c1.a;
                if(c1.d == c0) {
                    i0.h = 4;
                    i1.h = 4;
                }
                int v2 = c0.b();
                if(c0.c == 4 || c0.c == 5) {
                    v2 = -v2;
                }
                i0.i(i1, v2);
            }
        }
        c c2 = this.s;
        i i2 = c2.a;
        c c3 = this.t;
        i i3 = c3.a;
        c c4 = this.u;
        i i4 = c4.a;
        c c5 = this.v;
        i i5 = c5.a;
        boolean z = (v & 8) == 8;
        int[] arr_v = this.h0;
        boolean z1 = arr_v[0] == 3 && h.f(this, 0);
        if(i2.h != 4 && i4.h != 4) {
            if(arr_v[0] == 1 || z1 && this.X == 8) {
                c c7 = c2.d;
                if(c7 == null && c4.d == null) {
                    i2.h = 1;
                    i4.h = 1;
                    if(z) {
                        i4.h(i2, 1, this.j());
                    }
                    else {
                        i4.i(i2, this.k());
                    }
                }
                else if(c7 != null && c4.d == null) {
                    i2.h = 1;
                    i4.h = 1;
                    if(z) {
                        i4.h(i2, 1, this.j());
                    }
                    else {
                        i4.i(i2, this.k());
                    }
                }
                else if(c7 == null && c4.d != null) {
                    i2.h = 1;
                    i4.h = 1;
                    i2.i(i4, -this.k());
                    if(z) {
                        i2.h(i4, -1, this.j());
                    }
                    else {
                        i2.i(i4, -this.k());
                    }
                }
                else if(c7 != null && c4.d != null) {
                    i2.h = 2;
                    i4.h = 2;
                    if(z) {
                        this.j().a(i2);
                        this.j().a(i4);
                        j j0 = this.j();
                        i2.i = i4;
                        i2.l = j0;
                        j j1 = this.j();
                        i4.i = i2;
                        i4.l = j1;
                    }
                    else {
                        i2.i = i4;
                        i4.i = i2;
                    }
                }
            }
            else if(z1) {
                int v3 = this.k();
                i2.h = 1;
                i4.h = 1;
                c c6 = c2.d;
                if(c6 != null || c4.d != null) {
                    if(c6 == null || c4.d != null) {
                        if(c6 != null || c4.d == null) {
                            if(c6 != null && c4.d != null) {
                                if(z) {
                                    this.j().a(i2);
                                    this.j().a(i4);
                                }
                                if(this.F == 0.0f) {
                                    i2.h = 3;
                                    i4.h = 3;
                                    i2.i = i4;
                                    i4.i = i2;
                                }
                                else {
                                    i2.h = 2;
                                    i4.h = 2;
                                    i2.i = i4;
                                    i4.i = i2;
                                    this.x(v3);
                                }
                            }
                        }
                        else if(z) {
                            i2.h(i4, -1, this.j());
                        }
                        else {
                            i2.i(i4, -v3);
                        }
                    }
                    else if(z) {
                        i4.h(i2, 1, this.j());
                    }
                    else {
                        i4.i(i2, v3);
                    }
                }
                else if(z) {
                    i4.h(i2, 1, this.j());
                }
                else {
                    i4.i(i2, v3);
                }
            }
        }
        boolean z2 = arr_v[1] == 3 && h.f(this, 1);
        if(i3.h != 4 && i5.h != 4) {
            c c8 = this.w;
            if(arr_v[1] == 1 || z2 && this.X == 8) {
                c c10 = c3.d;
                if(c10 == null && c5.d == null) {
                    i3.h = 1;
                    i5.h = 1;
                    if(z) {
                        i5.h(i3, 1, this.i());
                    }
                    else {
                        i5.i(i3, this.g());
                    }
                    if(c8.d != null) {
                        c8.a.h = 1;
                        i3.g(c8.a, -this.P);
                    }
                }
                else if(c10 != null && c5.d == null) {
                    i3.h = 1;
                    i5.h = 1;
                    if(z) {
                        i5.h(i3, 1, this.i());
                    }
                    else {
                        i5.i(i3, this.g());
                    }
                    int v6 = this.P;
                    if(v6 > 0) {
                        c8.a.g(i3, v6);
                    }
                }
                else if(c10 == null && c5.d != null) {
                    i3.h = 1;
                    i5.h = 1;
                    if(z) {
                        i3.h(i5, -1, this.i());
                    }
                    else {
                        i3.i(i5, -this.g());
                    }
                    int v7 = this.P;
                    if(v7 > 0) {
                        c8.a.g(i3, v7);
                    }
                }
                else if(c10 != null && c5.d != null) {
                    i3.h = 2;
                    i5.h = 2;
                    if(z) {
                        j j2 = this.i();
                        i3.i = i5;
                        i3.l = j2;
                        j j3 = this.i();
                        i5.i = i3;
                        i5.l = j3;
                        this.i().a(i3);
                        this.j().a(i5);
                    }
                    else {
                        i3.i = i5;
                        i5.i = i3;
                    }
                    int v8 = this.P;
                    if(v8 > 0) {
                        c8.a.g(i3, v8);
                    }
                }
            }
            else if(z2) {
                int v4 = this.g();
                i3.h = 1;
                i5.h = 1;
                c c9 = c3.d;
                if(c9 == null && c5.d == null) {
                    if(z) {
                        i5.h(i3, 1, this.i());
                        return;
                    }
                    i5.i(i3, v4);
                    return;
                }
                if(c9 != null && c5.d == null) {
                    if(z) {
                        i5.h(i3, 1, this.i());
                        return;
                    }
                    i5.i(i3, v4);
                    return;
                }
                if(c9 == null && c5.d != null) {
                    if(z) {
                        i3.h(i5, -1, this.i());
                        return;
                    }
                    i3.i(i5, -v4);
                    return;
                }
                if(c9 != null && c5.d != null) {
                    if(z) {
                        this.i().a(i3);
                        this.j().a(i5);
                    }
                    if(this.F == 0.0f) {
                        i3.h = 3;
                        i5.h = 3;
                        i3.i = i5;
                        i5.i = i3;
                        return;
                    }
                    i3.h = 2;
                    i5.h = 2;
                    i3.i = i5;
                    i5.i = i3;
                    this.s(v4);
                    int v5 = this.P;
                    if(v5 > 0) {
                        c8.a.g(i3, v5);
                    }
                }
            }
        }
    }

    public final void d(q.d d0, boolean z, q.f f0, q.f f1, int v, boolean z1, c c0, c c1, int v1, int v2, int v3, int v4, float f2, boolean z2, boolean z3, int v5, int v6, int v7, float f3, boolean z4) {
        int v25;
        int v24;
        boolean z10;
        q.f f14;
        q.f f13;
        boolean z7;
        int v22;
        int v21;
        int v20;
        q.f f12;
        int v19;
        int v18;
        q.f f11;
        q.f f10;
        q.f f9;
        int v17;
        q.f f8;
        int v16;
        int v15;
        int v14;
        int v13;
        int v11;
        q.f f4 = d0.j(c0);
        q.f f5 = d0.j(c1);
        q.f f6 = d0.j(c0.d);
        q.f f7 = d0.j(c1.d);
        if(d0.f) {
            i i0 = c0.a;
            if(i0.b == 1) {
                i i1 = c1.a;
                if(i1.b == 1) {
                    i0.f(d0);
                    i1.f(d0);
                    if(!z3 && z) {
                        d0.f(f1, f5, 0, 6);
                    }
                    return;
                }
            }
        }
        int v8 = c0.c();
        boolean z5 = c1.c();
        boolean z6 = this.z.c();
        int v9 = z5 ? v8 + 1 : v8;
        if(z6) {
            ++v9;
        }
        int v10 = z2 ? 3 : v5;
        if(q.e.c(v) != 2) {
            v11 = 0;
        }
        else if(v10 != 4) {
            v11 = 1;
        }
        else {
            v11 = 0;
        }
        int v12 = v11;
        if(this.X == 8) {
            v13 = 0;
            v12 = 0;
        }
        else {
            v13 = v2;
        }
        if(z4) {
            if(v8 == 0 && !z5 && !z6) {
                d0.d(f4, v1);
            }
            else if(v8 != 0 && !z5) {
                d0.e(f4, f6, c0.b(), 6);
            }
        }
        if(v12 == 0) {
            if(z1) {
                d0.e(f5, f4, 0, 3);
                if(v3 > 0) {
                    d0.f(f5, f4, v3, 6);
                }
                if(v4 < 0x7FFFFFFF) {
                    d0.g(f5, f4, v4, 6);
                }
            }
            else {
                d0.e(f5, f4, v13, 6);
            }
            v14 = v6;
            v15 = v7;
            v16 = v10;
            f8 = f6;
            v17 = v9;
        }
        else {
            v14 = v6;
            v15 = v7;
            if(v14 == -2) {
                v14 = v13;
            }
            if(v15 == -2) {
                v15 = v13;
            }
            if(v14 > 0) {
                d0.f(f5, f4, v14, 6);
                v13 = Math.max(v13, v14);
            }
            if(v15 > 0) {
                d0.g(f5, f4, v15, 6);
                v13 = Math.min(v13, v15);
            }
            switch(v10) {
                case 1: {
                    if(z) {
                        d0.e(f5, f4, v13, 6);
                    }
                    else if(z3) {
                        d0.e(f5, f4, v13, 4);
                    }
                    else {
                        d0.e(f5, f4, v13, 1);
                    }
                    v16 = 1;
                    f8 = f6;
                    break;
                }
                case 2: {
                    if(c0.c == 3 || c0.c == 5) {
                        f9 = d0.j(this.C.f(3));
                        f10 = d0.j(this.C.f(5));
                    }
                    else {
                        f9 = d0.j(this.C.f(2));
                        f10 = d0.j(this.C.f(4));
                    }
                    b b0 = d0.k();
                    f8 = f6;
                    v16 = 2;
                    b0.c.g(f5, -1.0f);
                    b0.c.g(f4, 1.0f);
                    b0.c.g(f10, f3);
                    b0.c.g(f9, -f3);
                    d0.c(b0);
                    v12 = 0;
                    break;
                }
                default: {
                    v16 = v10;
                    f8 = f6;
                }
            }
            v17 = v9;
            if(v12 != 0 && v17 != 2 && !z2) {
                d0.e(f5, f4, (v15 <= 0 ? Math.max(v14, v13) : Math.min(v15, Math.max(v14, v13))), 6);
                v12 = 0;
            }
        }
        if(z4 && !z3) {
            if(v8 == 0 && !z5 && !z6) {
                if(z) {
                    d0.f(f1, f5, 0, 5);
                }
                f11 = f5;
            }
            else if(v8 != 0 && !z5) {
                if(z) {
                    d0.f(f1, f5, 0, 5);
                }
                f11 = f5;
            }
            else if(v8 == 0 && z5) {
                d0.e(f5, f7, -c1.b(), 6);
                if(z) {
                    d0.f(f4, f0, 0, 5);
                }
                f11 = f5;
            }
            else if(v8 == 0 || !z5) {
                f11 = f5;
            }
            else {
                if(v12 == 0) {
                    f12 = f8;
                    v20 = 0;
                    v22 = 5;
                    v21 = 1;
                }
                else {
                    if(z && v3 == 0) {
                        d0.f(f5, f4, 0, 6);
                    }
                    if(v16 == 0) {
                        if(v15 > 0 || v14 > 0) {
                            v18 = 1;
                            v19 = 4;
                        }
                        else {
                            v18 = 0;
                            v19 = 6;
                        }
                        f12 = f8;
                        d0.e(f4, f12, c0.b(), v19);
                        d0.e(f5, f7, -c1.b(), v19);
                        v20 = v18;
                        v21 = v15 > 0 || v14 > 0 ? 1 : 0;
                        v22 = 5;
                    }
                    else {
                        f12 = f8;
                        if(v16 == 1) {
                            v21 = 1;
                            v20 = 1;
                            v22 = 6;
                        }
                        else {
                            if(v16 == 3) {
                                int v23 = z2 || this.n == -1 || v15 > 0 ? 4 : 6;
                                d0.e(f4, f12, c0.b(), v23);
                                d0.e(f5, f7, -c1.b(), v23);
                                v21 = 1;
                                v20 = 1;
                            }
                            else {
                                v21 = 0;
                                v20 = 0;
                            }
                            v22 = 5;
                        }
                    }
                }
                if(v21 == 0) {
                    f14 = f12;
                    f13 = f7;
                    f11 = f5;
                    z10 = z;
                    z7 = z10;
                    v24 = 5;
                    v25 = 5;
                }
                else {
                    z7 = true;
                    f13 = f7;
                    f14 = f12;
                    f11 = f5;
                    d0.b(f4, f12, c0.b(), f2, f7, f5, c1.b(), v22);
                    boolean z8 = c0.d.b instanceof a;
                    boolean z9 = c1.d.b instanceof a;
                    if(z8 && !z9) {
                        z10 = z;
                        v24 = 6;
                        v25 = 5;
                    }
                    else if(z8 || !z9) {
                        z10 = z;
                        z7 = z10;
                        v24 = 5;
                        v25 = 5;
                    }
                    else {
                        z7 = z;
                        v24 = 5;
                        v25 = 6;
                        z10 = true;
                    }
                }
                if(v20 != 0) {
                    v24 = 6;
                    v25 = 6;
                }
                if(v12 == 0 && z10 || v20 != 0) {
                    d0.f(f4, f14, c0.b(), v25);
                }
                if(v12 == 0 && z7 || v20 != 0) {
                    d0.g(f11, f13, -c1.b(), v24);
                }
                if(z) {
                    d0.f(f4, f0, 0, 6);
                }
            }
            if(z) {
                d0.f(f1, f11, 0, 6);
            }
            return;
        }
        if(v17 < 2 && z) {
            d0.f(f4, f0, 0, 6);
            d0.f(f1, f5, 0, 6);
        }
    }

    public final void e(q.d d0) {
        d0.j(this.s);
        d0.j(this.t);
        d0.j(this.u);
        d0.j(this.v);
        if(this.P > 0) {
            d0.j(this.w);
        }
    }

    public c f(int v) {
        switch(q.e.c(v)) {
            case 0: {
                return null;
            }
            case 1: {
                return this.s;
            }
            case 2: {
                return this.t;
            }
            case 3: {
                return this.u;
            }
            case 4: {
                return this.v;
            }
            case 5: {
                return this.w;
            }
            case 6: {
                return this.z;
            }
            case 7: {
                return this.x;
            }
            case 8: {
                return this.y;
            }
            default: {
                throw new AssertionError(i3.e.n(v));
            }
        }
    }

    public final int g() {
        return this.X == 8 ? 0 : this.E;
    }

    public final int h(int v) {
        if(v == 0) {
            return this.k();
        }
        return v == 1 ? this.g() : 0;
    }

    public final j i() {
        if(this.d == null) {
            this.d = new j();
        }
        return this.d;
    }

    public final j j() {
        if(this.c == null) {
            this.c = new j();
        }
        return this.c;
    }

    public final int k() {
        return this.X == 8 ? 0 : this.D;
    }

    public final void l(int v, d d0, int v1, int v2, int v3) {
        this.f(v).a(d0.f(v1), v2, v3, 2, 0, true);
    }

    public final boolean m(int v) {
        c[] arr_c = this.A;
        c c0 = arr_c[v * 2];
        if(c0.d != null && c0.d.d != c0) {
            c c1 = arr_c[v * 2 + 1];
            return c1.d != null && c1.d.d == c1;
        }
        return false;
    }

    public final boolean n() {
        return this.s.a.b == 1 && this.u.a.b == 1 && this.t.a.b == 1 && this.v.a.b == 1;
    }

    public void o() {
        this.s.d();
        this.t.d();
        this.u.d();
        this.v.d();
        this.w.d();
        this.x.d();
        this.y.d();
        this.z.d();
        this.C = null;
        this.r = 0.0f;
        this.D = 0;
        this.E = 0;
        this.F = 0.0f;
        this.G = -1;
        this.H = 0;
        this.I = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0.5f;
        this.V = 0.5f;
        this.h0[0] = 1;
        this.h0[1] = 1;
        this.W = null;
        this.X = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0[0] = -1.0f;
        this.e0[1] = -1.0f;
        this.a = -1;
        this.b = -1;
        this.q[0] = 0x7FFFFFFF;
        this.q[1] = 0x7FFFFFFF;
        this.e = 0;
        this.f = 0;
        this.j = 1.0f;
        this.m = 1.0f;
        this.i = 0x7FFFFFFF;
        this.l = 0x7FFFFFFF;
        this.h = 0;
        this.k = 0;
        this.n = -1;
        this.o = 1.0f;
        j j0 = this.c;
        if(j0 != null) {
            j0.f();
        }
        j j1 = this.d;
        if(j1 != null) {
            j1.f();
        }
        this.p = null;
        this.Z = false;
        this.a0 = false;
        this.b0 = false;
    }

    public void p() {
        for(int v = 0; v < 6; ++v) {
            this.A[v].a.j();
        }
    }

    public void q(B1.a a0) {
        this.s.e();
        this.t.e();
        this.u.e();
        this.v.e();
        this.w.e();
        this.z.e();
        this.x.e();
        this.y.e();
    }

    public void r() {
    }

    public final void s(int v) {
        this.E = v;
        int v1 = this.R;
        if(v < v1) {
            this.E = v1;
        }
    }

    public final void t(int v) {
        this.h0[0] = v;
        if(v == 2) {
            this.x(this.S);
        }
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        String s = "";
        stringBuilder0.append("");
        if(this.Y != null) {
            s = i3.e.h(new StringBuilder("id: "), this.Y, " ");
        }
        stringBuilder0.append(s);
        stringBuilder0.append("(");
        stringBuilder0.append(this.H);
        stringBuilder0.append(", ");
        stringBuilder0.append(this.I);
        stringBuilder0.append(") - (");
        stringBuilder0.append(this.D);
        stringBuilder0.append(" x ");
        stringBuilder0.append(this.E);
        stringBuilder0.append(") wrap: (");
        stringBuilder0.append(this.S);
        stringBuilder0.append(" x ");
        return i3.e.g(stringBuilder0, this.T, ")");
    }

    public void u(int v, int v1) {
        this.N = v;
        this.O = v1;
    }

    public final void v(int v, int v1) {
        this.I = v;
        int v2 = v1 - v;
        this.E = v2;
        int v3 = this.R;
        if(v2 < v3) {
            this.E = v3;
        }
    }

    public final void w(int v) {
        this.h0[1] = v;
        if(v == 2) {
            this.s(this.T);
        }
    }

    public final void x(int v) {
        this.D = v;
        int v1 = this.Q;
        if(v < v1) {
            this.D = v1;
        }
    }

    public void y() {
        this.L = this.H;
        this.M = this.I;
    }

    public void z(q.d d0) {
        d0.getClass();
        int v = q.d.m(this.s);
        int v1 = q.d.m(this.t);
        int v2 = q.d.m(this.u);
        int v3 = q.d.m(this.v);
        if(v2 - v < 0 || v3 - v1 < 0 || (v == 0x80000000 || v == 0x7FFFFFFF) || (v1 == 0x80000000 || v1 == 0x7FFFFFFF) || (v2 == 0x80000000 || v2 == 0x7FFFFFFF) || (v3 == 0x80000000 || v3 == 0x7FFFFFFF)) {
            v = 0;
            v1 = 0;
            v2 = 0;
            v3 = 0;
        }
        int v4 = v2 - v;
        int v5 = v3 - v1;
        this.H = v;
        this.I = v1;
        if(this.X == 8) {
            this.D = 0;
            this.E = 0;
            return;
        }
        int[] arr_v = this.h0;
        if(arr_v[0] == 1) {
            int v6 = this.D;
            if(v4 < v6) {
                v4 = v6;
            }
        }
        if(arr_v[1] == 1) {
            int v7 = this.E;
            if(v5 < v7) {
                v5 = v7;
            }
        }
        this.D = v4;
        this.E = v5;
        int v8 = this.R;
        if(v5 < v8) {
            this.E = v8;
        }
        int v9 = this.Q;
        if(v4 < v9) {
            this.D = v9;
        }
        this.a0 = true;
    }
}

