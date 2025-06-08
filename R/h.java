package r;

import java.util.ArrayList;
import java.util.HashSet;
import q.a;
import q.d;
import q.f;

public abstract class h {
    public static final boolean[] a;

    static {
        h.a = new boolean[3];
    }

    public static void a(e e0, d d0, int v) {
        r.d d18;
        float f5;
        r.d d13;
        d d12;
        int v11;
        b[] arr_b1;
        int v10;
        int v9;
        boolean z2;
        boolean z1;
        r.d d6;
        int v2;
        b[] arr_b;
        int v1;
        d d1 = d0;
        if(v == 0) {
            v1 = e0.m0;
            arr_b = e0.p0;
            v2 = 0;
        }
        else {
            v1 = e0.n0;
            arr_b = e0.o0;
            v2 = 2;
        }
        int v3 = 0;
        while(v3 < v1) {
            b b0 = arr_b[v3];
            r.d d2 = b0.a;
            if(!b0.q) {
                int v4 = b0.l;
                int v5 = v4 * 2;
                r.d d3 = d2;
                r.d d4 = d3;
                boolean z = false;
                while(!z) {
                    ++b0.i;
                    d3.g0[v4] = null;
                    d3.f0[v4] = null;
                    int v6 = d3.X;
                    if(v6 != 8) {
                        if(b0.b == null) {
                            b0.b = d3;
                        }
                        b0.d = d3;
                        if(d3.h0[v4] == 3) {
                            int v7 = d3.g[v4];
                            if(v7 == 0 || v7 == 2 || v7 == 3) {
                                ++b0.j;
                                float f = d3.e0[v4];
                                if(f > 0.0f) {
                                    b0.k += f;
                                }
                                if(v6 != 8 && (v7 == 0 || v7 == 3)) {
                                    if(f < 0.0f) {
                                        b0.n = true;
                                    }
                                    else {
                                        b0.o = true;
                                    }
                                    if(b0.h == null) {
                                        b0.h = new ArrayList();
                                    }
                                    b0.h.add(d3);
                                }
                                if(b0.f == null) {
                                    b0.f = d3;
                                }
                                r.d d5 = b0.g;
                                if(d5 != null) {
                                    d5.f0[v4] = d3;
                                }
                                b0.g = d3;
                            }
                        }
                    }
                    if(d4 != d3) {
                        d4.g0[v4] = d3;
                    }
                    c c0 = d3.A[v5 + 1].d;
                    if(c0 == null) {
                        d6 = null;
                    }
                    else {
                        d6 = c0.b;
                        c c1 = d6.A[v5].d;
                        if(c1 == null || c1.b != d3) {
                            d6 = null;
                        }
                    }
                    if(d6 == null) {
                        d6 = d3;
                        z = true;
                    }
                    d4 = d3;
                    d3 = d6;
                }
                b0.c = d3;
                b0.e = v4 != 0 || !b0.m ? d2 : d3;
                b0.p = b0.o && b0.n;
            }
            b0.q = true;
            if(e0.D(4)) {
                r.d d7 = b0.c;
                r.d d8 = b0.b;
                r.d d9 = b0.d;
                r.d d10 = b0.e;
                float f1 = b0.k;
                int v8 = e0.h0[v];
                if(v == 0) {
                    z1 = d10.c0 == 1;
                    z2 = d10.c0 == 2;
                    v9 = d10.c0 == 0 ? 1 : 0;
                }
                else {
                    v9 = d10.d0 == 0 ? 1 : 0;
                    z1 = d10.d0 == 1;
                    z2 = d10.d0 == 2;
                }
                v10 = v1;
                arr_b1 = arr_b;
                v11 = v3;
                r.d d11 = d2;
                int v12 = 0;
                int v13 = 0;
                float f2 = 0.0f;
                float f3 = 0.0f;
                boolean z3 = false;
                while(!z3) {
                    c[] arr_c = d11.A;
                    if(d11.X != 8) {
                        ++v12;
                        int v14 = v == 0 ? d11.k() : d11.g();
                        f2 += (float)v14;
                        f2 = d11 == d8 ? f2 + ((float)v14) : f2 + ((float)arr_c[v2].b());
                        if(d11 != d9) {
                            f2 += (float)arr_c[v2 + 1].b();
                        }
                        f3 = f3 + ((float)arr_c[v2].b()) + ((float)arr_c[v2 + 1].b());
                    }
                    c c2 = arr_c[v2];
                    if(d11.X != 8 && d11.h0[v] == 3) {
                        ++v13;
                        if((v == 0 ? d11.e != 0 || (d11.h != 0 || d11.i != 0) : d11.f != 0 || d11.k != 0 || d11.l != 0)) {
                            d12 = d0;
                            h.b(e0, d12, v, v2, b0);
                            goto label_256;
                        }
                        else if(d11.F != 0.0f) {
                            d12 = d0;
                            h.b(e0, d12, v, v2, b0);
                            goto label_256;
                        }
                    }
                    c c3 = arr_c[v2 + 1].d;
                    if(c3 == null) {
                        d13 = null;
                    }
                    else {
                        d13 = c3.b;
                        c c4 = d13.A[v2].d;
                        if(c4 == null || c4.b != d11) {
                            d13 = null;
                        }
                    }
                    if(d13 == null) {
                        z3 = true;
                    }
                    else {
                        d11 = d13;
                    }
                }
                i i0 = d2.A[v2].a;
                i i1 = d7.A[v2 + 1].a;
                i i2 = i0.d;
                if(i2 == null) {
                    d12 = d0;
                    h.b(e0, d12, v, v2, b0);
                }
                else {
                    float f4 = f1;
                    i i3 = i1.d;
                    if(i3 == null) {
                        d12 = d0;
                        h.b(e0, d12, v, v2, b0);
                    }
                    else {
                        r.d d14 = d7;
                        if(i2.b != 1 || i3.b != 1) {
                            d12 = d0;
                            h.b(e0, d12, v, v2, b0);
                        }
                        else if(v13 <= 0 || v13 == v12) {
                            if(z2 || v9 != 0 || z1) {
                                f5 = d8 == null ? 0.0f : ((float)d8.A[v2].b());
                                if(d9 != null) {
                                    f5 += (float)d9.A[v2 + 1].b();
                                }
                            }
                            else {
                                f5 = 0.0f;
                            }
                            float f6 = i0.d.g;
                            float f7 = i1.d.g;
                            float f8 = -1.0f;
                            float f9 = (f6 < f7 ? f7 - f6 : f6 - f7) - f2;
                            if(v13 <= 0 || v13 != v12) {
                                d12 = d0;
                                r.d d17 = d14;
                                if(f9 < 0.0f) {
                                    z1 = false;
                                    v9 = 0;
                                    z2 = true;
                                }
                                if(z2) {
                                    if(v == 0) {
                                        d18 = d2;
                                        f8 = d18.U;
                                    }
                                    else {
                                        d18 = d2;
                                        if(v == 1) {
                                            f8 = d18.V;
                                        }
                                    }
                                    float f15 = (f9 - f5) * f8 + f6;
                                    for(r.d d19 = d18; d19 != null; d19 = d20) {
                                        r.d d20 = d19.g0[v];
                                        if(d20 != null || d19 == d17) {
                                            int v15 = v == 0 ? d19.k() : d19.g();
                                            float f16 = f15 + ((float)d19.A[v2].b());
                                            d19.A[v2].a.k(i0.f, f16);
                                            float f17 = f16 + ((float)v15);
                                            d19.A[v2 + 1].a.k(i0.f, f17);
                                            d19.A[v2].a.f(d12);
                                            d19.A[v2 + 1].a.f(d12);
                                            f15 = f17 + ((float)d19.A[v2 + 1].b());
                                        }
                                    }
                                }
                                else if(v9 != 0 || z1) {
                                    if(v9 != 0) {
                                        f9 -= f5;
                                    }
                                    else if(z1) {
                                        f9 -= f5;
                                    }
                                    float f18 = f9 / ((float)(v12 + 1));
                                    if(z1) {
                                        f18 = f9 / (v12 <= 1 ? 2.0f : ((float)(v12 - 1)));
                                    }
                                    float f19 = d2.X == 8 ? f6 : f6 + f18;
                                    if(z1 && v12 > 1) {
                                        f19 = ((float)d8.A[v2].b()) + f6;
                                    }
                                    if(v9 != 0 && d8 != null) {
                                        f19 += (float)d8.A[v2].b();
                                    }
                                    for(r.d d21 = d2; d21 != null; d21 = d22) {
                                        r.d d22 = d21.g0[v];
                                        if(d22 != null || d21 == d17) {
                                            int v16 = v == 0 ? d21.k() : d21.g();
                                            c[] arr_c1 = d21.A;
                                            if(d21 != d8) {
                                                f19 += (float)arr_c1[v2].b();
                                            }
                                            arr_c1[v2].a.k(i0.f, f19);
                                            arr_c1[v2 + 1].a.k(i0.f, f19 + ((float)v16));
                                            arr_c1[v2].a.f(d12);
                                            arr_c1[v2 + 1].a.f(d12);
                                            float f20 = ((float)v16) + ((float)arr_c1[v2 + 1].b()) + f19;
                                            if(d22 != null && d22.X != 8) {
                                                f20 += f18;
                                            }
                                            f19 = f20;
                                        }
                                    }
                                }
                            }
                            else if(d11.C != null && d11.C.h0[v] == 2) {
                                d12 = d0;
                                h.b(e0, d12, v, v2, b0);
                            }
                            else {
                                float f10 = f9 + f2 - f3;
                                for(r.d d15 = d2; d15 != null; d15 = d16) {
                                    r.d d16 = d15.g0[v];
                                    if(d16 != null || d15 == d14) {
                                        float f11 = f10 / ((float)v13);
                                        if(f4 > 0.0f) {
                                            float f12 = d15.e0[v];
                                            f11 = f12 == -1.0f ? 0.0f : f12 * f10 / f4;
                                        }
                                        if(d15.X == 8) {
                                            f11 = 0.0f;
                                        }
                                        float f13 = f6 + ((float)d15.A[v2].b());
                                        d15.A[v2].a.k(i0.f, f13);
                                        float f14 = f13 + f11;
                                        d15.A[v2 + 1].a.k(i0.f, f14);
                                        d15.A[v2].a.f(d0);
                                        d15.A[v2 + 1].a.f(d0);
                                        f6 = f14 + ((float)d15.A[v2 + 1].b());
                                    }
                                }
                                d12 = d0;
                            }
                        }
                        else {
                            d12 = d0;
                            h.b(e0, d12, v, v2, b0);
                        }
                    }
                }
            }
            else {
                d12 = d1;
                v10 = v1;
                arr_b1 = arr_b;
                v11 = v3;
                h.b(e0, d12, v, v2, b0);
            }
        label_256:
            v3 = v11 + 1;
            d1 = d12;
            v1 = v10;
            arr_b = arr_b1;
        }
    }

    // This method was un-flattened
    public static void b(e e0, d d0, int v, int v1, b b0) {
        r.d d23;
        r.d d22;
        f f17;
        f f16;
        c c12;
        r.d d17;
        f f13;
        f f12;
        c c10;
        r.d d13;
        r.d d12;
        r.d d11;
        int v6;
        int v5;
        boolean z2;
        boolean z1;
        int v2;
        r.d d1 = b0.a;
        r.d d2 = b0.c;
        r.d d3 = b0.b;
        r.d d4 = b0.d;
        r.d d5 = b0.e;
        float f = b0.k;
        boolean z = e0.h0[v] == 2;
        if(v == 0) {
            v2 = d5.c0 == 0 ? 1 : 0;
            z1 = d5.c0 == 1;
            z2 = d5.c0 == 2;
        }
        else {
            v2 = d5.d0 == 0 ? 1 : 0;
            z1 = d5.d0 == 1;
            z2 = d5.d0 == 2;
        }
        int v3 = v2;
        r.d d6 = d1;
        c[] arr_c = e0.A;
        r.d d7;
        for(d7 = null; true; d7 = null) {
            c c0 = d6.A[v1];
            int v4 = c0.b();
            c c1 = c0.d;
            if(c1 != null && d6 != d1) {
                v4 = c1.b() + v4;
            }
            if(!z2 || d6 == d1 || d6 == d3) {
                v5 = v3 == 0 || !z ? (z || z2 ? 1 : 4) : 4;
            }
            else {
                v5 = 6;
            }
            c c2 = c0.d;
            if(c2 == null) {
                v6 = v3;
            }
            else {
                if(d6 == d3) {
                    v6 = v3;
                    d0.f(c0.i, c2.i, v4, 5);
                }
                else {
                    v6 = v3;
                    d0.f(c0.i, c2.i, v4, 6);
                }
                d0.e(c0.i, c0.d.i, v4, v5);
            }
            c[] arr_c1 = d6.A;
            if(z) {
                if(d6.X != 8 && d6.h0[v] == 3) {
                    d0.f(arr_c1[v1 + 1].i, arr_c1[v1].i, 0, 5);
                }
                d0.f(arr_c1[v1].i, arr_c[v1].i, 0, 6);
            }
            c c3 = arr_c1[v1 + 1].d;
            if(c3 != null) {
                r.d d8 = c3.b;
                c c4 = d8.A[v1].d;
                if(c4 != null && c4.b == d6) {
                    d7 = d8;
                }
            }
            if(d7 == null) {
                break;
            }
            d6 = d7;
            v3 = v6;
            arr_c = e0.A;
        }
        arr_c = e0.A;
        d7 = null;
        if(d4 != null) {
            c c5 = d2.A[v1 + 1].d;
            if(c5 != null) {
                c c6 = d4.A[v1 + 1];
                d0.g(c6.i, c5.i, -c6.b(), 5);
            }
        }
        if(z) {
            f f1 = arr_c[v1 + 1].i;
            c c7 = d2.A[v1 + 1];
            d0.f(f1, c7.i, c7.b(), 6);
        }
        ArrayList arrayList0 = b0.h;
        if(arrayList0 != null) {
            int v7 = arrayList0.size();
            if(v7 > 1) {
                float f2 = !b0.n || b0.p ? f : ((float)b0.j);
                r.d d9 = null;
                int v8 = 0;
                float f3 = 0.0f;
                while(v8 < v7) {
                    r.d d10 = (r.d)arrayList0.get(v8);
                    float f4 = d10.e0[v];
                    c[] arr_c2 = d10.A;
                    if(f4 < 0.0f) {
                        if(b0.p) {
                            d0.e(arr_c2[v1 + 1].i, arr_c2[v1].i, 0, 4);
                            d11 = d2;
                            goto label_123;
                        }
                        else {
                            f4 = 1.0f;
                        }
                    }
                    if(Float.compare(f4, 0.0f) == 0) {
                        d0.e(arr_c2[v1 + 1].i, arr_c2[v1].i, 0, 6);
                        d11 = d2;
                    }
                    else {
                        if(d9 == null) {
                            d11 = d2;
                            d12 = d10;
                        }
                        else {
                            f f5 = d9.A[v1].i;
                            f f6 = d9.A[v1 + 1].i;
                            f f7 = arr_c2[v1].i;
                            f f8 = arr_c2[v1 + 1].i;
                            d12 = d10;
                            q.b b1 = d0.k();
                            b1.b = 0.0f;
                            d11 = d2;
                            a a0 = b1.c;
                            if(f2 == 0.0f || f3 == f4) {
                                a0.g(f5, 1.0f);
                                a0.g(f6, -1.0f);
                                a0.g(f8, 1.0f);
                                a0.g(f7, -1.0f);
                            }
                            else if(f3 == 0.0f) {
                                a0.g(f5, 1.0f);
                                a0.g(f6, -1.0f);
                            }
                            else {
                                float f9 = f3 / f2 / (f4 / f2);
                                a0.g(f5, 1.0f);
                                a0.g(f6, -1.0f);
                                a0.g(f8, f9);
                                a0.g(f7, -f9);
                            }
                            d0.c(b1);
                        }
                        f3 = f4;
                        d9 = d12;
                    }
                label_123:
                    ++v8;
                    d2 = d11;
                }
            }
        }
        boolean z3 = false;
        if(d3 != null && (d3 == d4 || z2)) {
            c c19 = d1.A[v1];
            d13 = d2;
            c c20 = d13.A[v1 + 1];
            f f18 = c19.d == null ? null : c19.d.i;
            f f19 = c20.d == null ? null : c20.d.i;
            if(d3 == d4) {
                c c21 = d3.A[v1];
                c20 = d3.A[v1 + 1];
                c19 = c21;
            }
            if(f18 != null && f19 != null) {
                float f20 = v == 0 ? d5.U : d5.V;
                int v15 = c19.b();
                int v16 = c20.b();
                d0.b(c19.i, f18, v15, f20, f19, c20.i, v16, 5);
            }
        }
        else {
            d13 = d2;
            if(v6 != 0 && d3 != null) {
                if(b0.j > 0 && b0.i == b0.j) {
                    z3 = true;
                }
                r.d d14 = d3;
                r.d d15 = d14;
                while(d14 != null) {
                    r.d d16;
                    for(d16 = d14.g0[v]; d16 != null && d16.X == 8; d16 = d16.g0[v]) {
                    }
                    if(d16 == null && d14 != d4) {
                        d17 = d16;
                    }
                    else {
                        c[] arr_c3 = d14.A;
                        c c8 = arr_c3[v1];
                        f f10 = c8.i;
                        f f11 = c8.d == null ? null : c8.d.i;
                        if(d15 != d14) {
                            f11 = d15.A[v1 + 1].i;
                        }
                        else if(d14 == d3 && d15 == d14) {
                            c c9 = d1.A[v1].d;
                            f11 = c9 == null ? null : c9.i;
                        }
                        int v9 = c8.b();
                        int v10 = arr_c3[v1 + 1].b();
                        if(d16 == null) {
                            c10 = d13.A[v1 + 1].d;
                            f12 = c10 == null ? null : c10.i;
                        }
                        else {
                            c10 = d16.A[v1];
                            f12 = c10.i;
                        }
                        f13 = arr_c3[v1 + 1].i;
                        if(c10 != null) {
                            v10 += c10.b();
                        }
                        if(d15 != null) {
                            v9 += d15.A[v1 + 1].b();
                        }
                        if(f10 != null && f11 != null && f12 != null && f13 != null) {
                            d17 = d16;
                            d0.b(f10, f11, (d14 == d3 ? d3.A[v1].b() : v9), 0.5f, f12, f13, (d14 == d4 ? d4.A[v1 + 1].b() : v10), (z3 ? 6 : 4));
                        }
                    }
                    if(d14.X != 8) {
                        d15 = d14;
                    }
                    d14 = d17;
                }
            }
            else if(z1 && d3 != null) {
                if(b0.j > 0 && b0.i == b0.j) {
                    z3 = true;
                }
                r.d d18 = d3;
                r.d d19 = d18;
                while(d18 != null) {
                    r.d d20;
                    for(d20 = d18.g0[v]; d20 != null && d20.X == 8; d20 = d20.g0[v]) {
                    }
                    if(d18 == d3 || d18 == d4 || d20 == null) {
                        d23 = d19;
                    }
                    else {
                        r.d d21 = d20 == d4 ? null : d20;
                        c[] arr_c4 = d18.A;
                        c c11 = arr_c4[v1];
                        f f14 = c11.i;
                        f f15 = d19.A[v1 + 1].i;
                        int v11 = c11.b();
                        int v12 = arr_c4[v1 + 1].b();
                        if(d21 == null) {
                            c c14 = arr_c4[v1 + 1];
                            f17 = c14.i;
                            c12 = c14.d;
                            f16 = c14.d == null ? null : c14.d.i;
                        }
                        else {
                            c12 = d21.A[v1];
                            f16 = c12.i;
                            c c13 = c12.d;
                            f17 = c13 == null ? null : c13.i;
                        }
                        int v13 = c12 == null ? v12 : c12.b() + v12;
                        int v14 = d19.A[v1 + 1].b() + v11;
                        if(f14 == null || f15 == null || f16 == null || f17 == null) {
                            d22 = d21;
                            d23 = d19;
                        }
                        else {
                            d22 = d21;
                            d23 = d19;
                            d0.b(f14, f15, v14, 0.5f, f16, f17, v13, (z3 ? 6 : 4));
                        }
                        d20 = d22;
                    }
                    if(d18.X == 8) {
                        d18 = d23;
                    }
                    d19 = d18;
                    d18 = d20;
                }
                c c15 = d3.A[v1];
                c c16 = d1.A[v1].d;
                c c17 = d4.A[v1 + 1];
                c c18 = d13.A[v1 + 1].d;
                if(c16 != null) {
                    if(d3 != d4) {
                        d0.e(c15.i, c16.i, c15.b(), 5);
                    }
                    else if(c18 != null) {
                        d0.b(c15.i, c16.i, c15.b(), 0.5f, c17.i, c18.i, c17.b(), 5);
                    }
                }
                if(c18 != null && d3 != d4) {
                    d0.e(c17.i, c18.i, -c17.b(), 5);
                }
            }
        }
        if((v6 != 0 || z1) && d3 != null) {
            c[] arr_c5 = d3.A;
            c c22 = arr_c5[v1];
            c c23 = d4.A[v1 + 1];
            f f21 = c22.d == null ? null : c22.d.i;
            f f22 = c23.d == null ? null : c23.d.i;
            if(d13 != d4) {
                c c24 = d13.A[v1 + 1].d;
                if(c24 != null) {
                    d7 = c24.i;
                }
                f22 = d7;
            }
            if(d3 == d4) {
                c23 = arr_c5[v1 + 1];
            }
            if(f21 != null && f22 != null) {
                int v17 = c22.b();
                int v18 = d4.A[v1 + 1].b();
                d0.b(c22.i, f21, v17, 0.5f, f22, c23.i, v18, 5);
            }
        }
    }

    public static int c(r.f f0, int v) {
        ArrayList arrayList0;
        switch(v) {
            case 0: {
                arrayList0 = f0.d;
                break;
            }
            case 1: {
                arrayList0 = f0.e;
                break;
            }
            default: {
                f0.getClass();
                arrayList0 = null;
            }
        }
        int v1 = arrayList0.size();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            r.d d0 = (r.d)arrayList0.get(v2);
            v3 = Math.max(v3, h.d(d0, v, d0.A[v * 2 + 1].d == null || d0.A[v * 2].d != null, 0));
        }
        f0.c[v] = v3;
        return v3;
    }

    public static int d(r.d d0, int v, boolean z, int v1) {
        int v23;
        int v17;
        int v16;
        int v15;
        int v13;
        int v6;
        int v5;
        int v4;
        int v3;
        int v2;
        if(!d0.Z) {
            return 0;
        }
        c c0 = d0.w;
        boolean z1 = c0.d != null && v == 1;
        if(z) {
            v2 = d0.P;
            v3 = d0.g() - d0.P;
            v4 = v * 2;
            v5 = v4 + 1;
        }
        else {
            v3 = d0.P;
            v2 = d0.g() - v3;
            v5 = v * 2;
            v4 = v5 + 1;
        }
        c[] arr_c = d0.A;
        if(arr_c[v5].d == null || arr_c[v4].d != null) {
            v6 = 1;
        }
        else {
            v6 = -1;
            int v7 = v5;
            v5 = v4;
            v4 = v7;
        }
        int v8 = h.e(d0, v) + arr_c[v4].b() * v6;
        int v9 = v8 + (z1 ? v1 - v2 : v1);
        int v10 = (v == 0 ? d0.k() : d0.g()) * v6;
        int v11 = 0;
        for(Object object0: arr_c[v4].a.a) {
            v11 = Math.max(v11, h.d(((i)(((k)object0))).c.b, v, z, v9));
        }
        int v12 = 0;
        for(Object object1: arr_c[v5].a.a) {
            v12 = Math.max(v12, h.d(((i)(((k)object1))).c.b, v, z, v10 + v9));
        }
        if(z1) {
            v11 -= v2;
            v13 = v12 + v3;
        }
        else {
            v13 = v12 + (v == 0 ? d0.k() : d0.g()) * v6;
        }
        if(v == 1) {
            int v14 = 0;
            for(Object object2: c0.a.a) {
                i i0 = (i)(((k)object2));
                if(v6 == 1) {
                    v14 = Math.max(v14, h.d(i0.c.b, 1, z, v2 + v9));
                    v15 = v4;
                }
                else {
                    v15 = v4;
                    v14 = Math.max(v14, h.d(i0.c.b, 1, z, v3 * v6 + v9));
                }
                v4 = v15;
            }
            v16 = v4;
            v17 = v14;
            if(c0.a.a.size() > 0 && !z1) {
                v17 = v6 == 1 ? v17 + v2 : v17 - v3;
            }
        }
        else {
            v16 = v4;
            v17 = 0;
        }
        int v18 = Math.max(v11, Math.max(v13, v17));
        int v19 = v10 + v9;
        if(v6 == -1) {
            int v20 = v19;
            v19 = v9;
            v9 = v20;
        }
        if(z) {
            h.h(d0, v, v9);
            if(v == 0) {
                d0.H = v9;
                int v21 = v19 - v9;
                d0.D = v21;
                int v22 = d0.Q;
                if(v21 < v22) {
                    d0.D = v22;
                }
            }
            else if(v == 1) {
                d0.v(v9, v19);
            }
            d0.a0 = true;
        }
        else {
            d0.p.a(d0, v);
            if(v == 0) {
                d0.J = v9;
            }
            else if(v == 1) {
                d0.K = v9;
            }
        }
        int[] arr_v = d0.h0;
        if(v == 0) {
            v23 = arr_v[0];
        }
        else {
            v23 = v == 1 ? arr_v[1] : 0;
        }
        if(v23 == 3 && d0.F != 0.0f) {
            d0.p.a(d0, v);
        }
        c c1 = arr_c[v16].d;
        if(c1 != null) {
            c c2 = arr_c[v5].d;
            if(c2 != null && (c1.b == d0.C && c2.b == d0.C)) {
                d0.p.a(d0, v);
            }
        }
        return v18 + v8;
    }

    public static int e(r.d d0, int v) {
        c c0 = d0.A[v * 2];
        c c1 = d0.A[v * 2 + 1];
        c c2 = c0.d;
        if(c2 != null) {
            r.d d1 = d0.C;
            if(c2.b == d1 && (c1.d != null && c1.d.b == d1)) {
                int v1 = d1.h(v);
                return v == 0 ? ((int)(((float)(v1 - c0.b() - c1.b() - d0.h(0))) * d0.U)) : ((int)(((float)(v1 - c0.b() - c1.b() - d0.h(v))) * d0.V));
            }
        }
        return 0;
    }

    public static boolean f(r.d d0, int v) {
        int v1 = 1;
        int[] arr_v = d0.h0;
        if(arr_v[v] != 3) {
            return false;
        }
        if(d0.F != 0.0f) {
            if(v != 0) {
                v1 = 0;
            }
            int v2 = arr_v[v1];
            return false;
        }
        if(v == 0) {
            return d0.e == 0 ? d0.h == 0 && d0.i == 0 : false;
        }
        return d0.f == 0 ? d0.k == 0 && d0.l == 0 : false;
    }

    public static int g(r.d d0) {
        int[] arr_v = d0.h0;
        if(arr_v[0] == 3) {
            float f = d0.G == 0 ? ((float)d0.g()) * d0.F : ((float)d0.g()) / d0.F;
            d0.x(((int)f));
            return (int)f;
        }
        if(arr_v[1] == 3) {
            float f1 = d0.G == 1 ? ((float)d0.k()) * d0.F : ((float)d0.k()) / d0.F;
            d0.s(((int)f1));
            return (int)f1;
        }
        return -1;
    }

    public static void h(r.d d0, int v, int v1) {
        int v2 = v * 2 + 1;
        i i0 = d0.A[v * 2].a;
        i0.f = d0.C.s.a;
        i0.g = (float)v1;
        i0.b = 1;
        i i1 = d0.A[v2].a;
        i1.f = i0;
        i1.g = (float)d0.h(v);
        d0.A[v2].a.b = 1;
    }

    public static void i(ArrayList arrayList0, int v, int v1) {
        int v10;
        int v4;
        HashSet hashSet0;
        int v2 = arrayList0.size();
        int v3 = 0;
        while(v3 < v2) {
            r.f f0 = (r.f)arrayList0.get(v3);
            if(v == 0) {
                hashSet0 = f0.f;
            }
            else if(v == 1) {
                hashSet0 = f0.g;
            }
            else {
                f0.getClass();
                hashSet0 = null;
            }
            for(Object object0: hashSet0) {
                r.d d0 = (r.d)object0;
                if(d0.Z) {
                    c[] arr_c = d0.A;
                    c c0 = arr_c[v * 2];
                    c c1 = arr_c[v * 2 + 1];
                    if(c0.d != null && c1.d != null) {
                        h.h(d0, v, c0.b() + h.e(d0, v));
                    }
                    else {
                        if(d0.F != 0.0f) {
                            int[] arr_v = d0.h0;
                            if(v == 0) {
                                v4 = arr_v[0];
                            }
                            else {
                                v4 = v == 1 ? arr_v[1] : 0;
                            }
                            if(v4 == 3) {
                                int v5 = h.g(d0);
                                int v6 = (int)arr_c[v * 2].a.g;
                                int v7 = v6 + v5;
                                c1.a.f = c0.a;
                                c1.a.g = (float)v5;
                                c1.a.b = 1;
                                if(v == 0) {
                                    d0.H = v6;
                                    int v8 = v7 - v6;
                                    d0.D = v8;
                                    int v9 = d0.Q;
                                    if(v8 < v9) {
                                        d0.D = v9;
                                    }
                                }
                                else if(v == 1) {
                                    d0.v(v6, v7);
                                }
                                d0.a0 = true;
                                continue;
                            }
                        }
                        if(v == 0) {
                            v10 = d0.J;
                        }
                        else {
                            v10 = v == 1 ? d0.K : 0;
                        }
                        int v11 = v1 - v10;
                        int v12 = v11 - d0.h(v);
                        if(v == 0) {
                            d0.H = v12;
                            int v13 = v11 - v12;
                            d0.D = v13;
                            int v14 = d0.Q;
                            if(v13 < v14) {
                                d0.D = v14;
                            }
                        }
                        else if(v == 1) {
                            d0.v(v12, v11);
                        }
                        d0.a0 = true;
                        h.h(d0, v, v12);
                    }
                }
            }
            ++v3;
        }
    }

    public static boolean j(r.d d0, r.f f0, ArrayList arrayList0, boolean z) {
        if(d0 == null) {
            return true;
        }
        d0.a0 = false;
        e e0 = (e)d0.C;
        r.f f1 = d0.p;
        if(f1 == null) {
            d0.Z = true;
            f0.a.add(d0);
            d0.p = f0;
            c c0 = d0.s;
            c c1 = c0.d;
            c c2 = d0.w;
            c c3 = d0.z;
            c c4 = d0.t;
            c c5 = d0.v;
            c c6 = d0.u;
            if(c1 == null && c6.d == null && c4.d == null && c5.d == null && c2.d == null && c3.d == null) {
                f0.b = false;
                e0.x0 = false;
                d0.Z = false;
                if(z) {
                    return false;
                }
            }
            c c7 = c4.d;
            if(c7 != null) {
                c c8 = c5.d;
                if(c8 != null) {
                    int v = e0.h0[1];
                    if(z) {
                        f0.b = false;
                        e0.x0 = false;
                        d0.Z = false;
                        return false;
                    }
                    if(c7.b != d0.C || c8.b != d0.C) {
                        f0.b = false;
                        e0.x0 = false;
                        d0.Z = false;
                    }
                }
            }
            if(c1 != null) {
                c c9 = c6.d;
                if(c9 != null) {
                    int v1 = e0.h0[0];
                    if(z) {
                        f0.b = false;
                        e0.x0 = false;
                        d0.Z = false;
                        return false;
                    }
                    if(c1.b != d0.C || c9.b != d0.C) {
                        f0.b = false;
                        e0.x0 = false;
                        d0.Z = false;
                    }
                }
            }
            int v2 = d0.h0[0];
            int v3 = d0.h0[1];
            if(((v2 == 3 ? 1 : 0) ^ (v3 == 3 ? 1 : 0)) != 0 && d0.F != 0.0f) {
                h.g(d0);
            }
            else if(v2 == 3 || v3 == 3) {
                f0.b = false;
                e0.x0 = false;
                d0.Z = false;
                if(z) {
                    return false;
                }
            }
            if((c0.d == null && c6.d == null || c0.d != null && c0.d.b == d0.C && c6.d == null || (c6.d != null && c6.d.b == d0.C && c0.d == null || c0.d != null && (c0.d.b == d0.C && c6.d != null && c6.d.b == d0.C))) && (c3.d == null && !(d0 instanceof g) && !(d0 instanceof r.a))) {
                f0.d.add(d0);
            }
            if((c4.d == null && c5.d == null || c4.d != null && c4.d.b == d0.C && c5.d == null || (c5.d != null && c5.d.b == d0.C && c4.d == null || c4.d != null && (c4.d.b == d0.C && c5.d != null && c5.d.b == d0.C))) && (c3.d == null && c2.d == null && !(d0 instanceof g) && !(d0 instanceof r.a))) {
                f0.e.add(d0);
            }
            if(d0 instanceof r.a) {
                f0.b = false;
                e0.x0 = false;
                d0.Z = false;
                if(z) {
                    return false;
                }
                for(int v4 = 0; v4 < ((r.a)d0).j0; ++v4) {
                    if(!h.j(((r.a)d0).i0[v4], f0, arrayList0, false)) {
                        return false;
                    }
                }
            }
            c[] arr_c = d0.A;
            for(int v5 = 0; v5 < arr_c.length; ++v5) {
                c c10 = arr_c[v5];
                c c11 = c10.d;
                if(c11 != null && c11.b != d0.C) {
                    if(c10.c == 7) {
                        f0.b = false;
                        e0.x0 = false;
                        d0.Z = false;
                        if(z) {
                            return false;
                        }
                    }
                    else if(c11.d != c10) {
                        c11.a.a(c10.a);
                    }
                    if(!h.j(c10.d.b, f0, arrayList0, z)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if(f1 != f0) {
            f0.a.addAll(f1.a);
            f0.d.addAll(d0.p.d);
            f0.e.addAll(d0.p.e);
            r.f f2 = d0.p;
            if(!f2.b) {
                f0.b = false;
            }
            arrayList0.remove(f2);
            for(Object object0: d0.p.a) {
                ((r.d)object0).p = f0;
            }
        }
        return true;
    }
}

