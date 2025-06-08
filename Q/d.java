package q;

import B1.a;
import java.util.Arrays;

public final class d {
    public int a;
    public final c b;
    public int c;
    public int d;
    public b[] e;
    public boolean f;
    public boolean[] g;
    public int h;
    public int i;
    public int j;
    public final a k;
    public f[] l;
    public int m;
    public final b n;
    public static int o = 1000;

    public d() {
        this.a = 0;
        this.c = 0x20;
        this.d = 0x20;
        this.e = null;
        this.f = false;
        this.g = new boolean[0x20];
        this.h = 1;
        this.i = 0;
        this.j = 0x20;
        this.l = new f[d.o];
        this.m = 0;
        this.e = new b[0x20];
        for(int v = 0; true; ++v) {
            b[] arr_b = this.e;
            if(v >= arr_b.length) {
                break;
            }
            b b0 = arr_b[v];
            if(b0 != null) {
                D.c c0 = (D.c)this.k.j;
                int v1 = c0.b;
                Object[] arr_object = c0.a;
                if(v1 < arr_object.length) {
                    arr_object[v1] = b0;
                    c0.b = v1 + 1;
                }
            }
            arr_b[v] = null;
        }
        a a0 = new a(27);
        a0.j = new D.c();
        a0.k = new D.c();
        a0.l = new f[0x20];
        this.k = a0;
        this.b = new c(a0);  // 初始化器: Lq/b;-><init>(LB1/a;)V
        this.n = new b(a0);
    }

    public final f a(int v) {
        D.c c0 = (D.c)this.k.k;
        int v1 = c0.b;
        Object object0 = null;
        if(v1 > 0) {
            Object object1 = c0.a[v1 - 1];
            c0.a[v1 - 1] = null;
            c0.b = v1 - 1;
            object0 = object1;
        }
        f f0 = (f)object0;
        if(f0 == null) {
            f0 = new f(v);
        }
        else {
            f0.c();
        }
        f0.f = v;
        int v2 = d.o;
        if(this.m >= v2) {
            d.o = v2 * 2;
            this.l = (f[])Arrays.copyOf(this.l, v2 * 2);
        }
        int v3 = this.m;
        this.m = v3 + 1;
        this.l[v3] = f0;
        return f0;
    }

    public final void b(f f0, f f1, int v, float f2, f f3, f f4, int v1, int v2) {
        b b0 = this.k();
        q.a a0 = b0.c;
        if(f1 == f3) {
            a0.g(f0, 1.0f);
            a0.g(f4, 1.0f);
            a0.g(f1, -2.0f);
        }
        else if(f2 == 0.5f) {
            a0.g(f0, 1.0f);
            a0.g(f1, -1.0f);
            a0.g(f3, -1.0f);
            a0.g(f4, 1.0f);
            if(v > 0 || v1 > 0) {
                b0.b = (float)(v1 - v);
            }
        }
        else if(f2 <= 0.0f) {
            a0.g(f0, -1.0f);
            a0.g(f1, 1.0f);
            b0.b = (float)v;
        }
        else if(f2 >= 1.0f) {
            a0.g(f3, -1.0f);
            a0.g(f4, 1.0f);
            b0.b = (float)v1;
        }
        else {
            a0.g(f0, (1.0f - f2) * 1.0f);
            a0.g(f1, (1.0f - f2) * -1.0f);
            a0.g(f3, -1.0f * f2);
            a0.g(f4, 1.0f * f2);
            if(v > 0 || v1 > 0) {
                b0.b = ((float)v1) * f2 + ((float)(-v)) * (1.0f - f2);
            }
        }
        if(v2 != 6) {
            b0.a(this, v2);
        }
        this.c(b0);
    }

    public final void c(b b0) {
        boolean z3;
        boolean z2;
        if(this.i + 1 >= this.j || this.h + 1 >= this.d) {
            this.n();
        }
        if(b0.d) {
            z3 = false;
        }
        else {
            this.r(b0);
            q.a a0 = b0.c;
            if(b0.a == null && b0.b == 0.0f && a0.a == 0) {
                return;
            }
            float f = b0.b;
            if(f < 0.0f) {
                b0.b = f * -1.0f;
                int v = a0.h;
                for(int v1 = 0; v != -1 && v1 < a0.a; ++v1) {
                    a0.g[v] *= -1.0f;
                    v = a0.f[v];
                }
            }
            int v2 = a0.h;
            int v3 = 0;
            f f1 = null;
            f f2 = null;
            float f3 = 0.0f;
            boolean z = false;
            float f4 = 0.0f;
            boolean z1 = false;
            while(v2 != -1 && v3 < a0.a) {
                float[] arr_f = a0.g;
                float f5 = arr_f[v2];
                f f6 = ((f[])a0.c.l)[a0.e[v2]];
                b b1 = a0.b;
                if(f5 >= 0.0f) {
                    if(f5 < 0.001f) {
                        arr_f[v2] = 0.0f;
                        f6.b(b1);
                        f5 = 0.0f;
                    }
                }
                else if(f5 > -0.001f) {
                    arr_f[v2] = 0.0f;
                    f6.b(b1);
                    f5 = 0.0f;
                }
                if(f5 != 0.0f) {
                    if(f6.f != 1) {
                        if(f2 == null && f5 < 0.0f) {
                            if(f1 == null) {
                                z1 = f6.i <= 1;
                                goto label_67;
                            }
                            else if(f4 > f5) {
                                z1 = f6.i <= 1;
                            label_67:
                                f1 = f6;
                                f4 = f5;
                            }
                            else if(!z1 && f6.i <= 1) {
                                f1 = f6;
                                f4 = f5;
                                z1 = true;
                            }
                        }
                    }
                    else if(f2 == null) {
                        z = f6.i <= 1;
                        goto label_50;
                    }
                    else if(f3 > f5) {
                        z = f6.i <= 1;
                    label_50:
                        f2 = f6;
                        f3 = f5;
                    }
                    else if(!z && f6.i <= 1) {
                        f2 = f6;
                        f3 = f5;
                        z = true;
                    }
                }
                v2 = a0.f[v2];
                ++v3;
            }
            if(f2 != null) {
                f1 = f2;
            }
            if(f1 == null) {
                z2 = true;
            }
            else {
                b0.e(f1);
                z2 = false;
            }
            if(a0.a == 0) {
                b0.d = true;
            }
            if(z2) {
                if(this.h + 1 >= this.d) {
                    this.n();
                }
                f f7 = this.a(3);
                int v4 = this.a + 1;
                this.a = v4;
                ++this.h;
                f7.a = v4;
                ((f[])this.k.l)[v4] = f7;
                b0.a = f7;
                this.h(b0);
                b b2 = this.n;
                b2.getClass();
                b2.a = null;
                q.a a1 = b2.c;
                a1.b();
                for(int v5 = 0; v5 < a0.a; ++v5) {
                    a1.a(a0.e(v5), a0.f(v5), true);
                }
                this.p(b2);
                if(f7.b == -1) {
                    if(b0.a == f7) {
                        f f8 = a0.d(null, f7);
                        if(f8 != null) {
                            b0.e(f8);
                        }
                    }
                    if(!b0.d) {
                        b0.a.d(b0);
                    }
                    --this.i;
                }
                z3 = true;
            }
            else {
                z3 = false;
            }
            if(b0.a == null || b0.a.f != 1 && b0.b < 0.0f) {
                return;
            }
        }
        if(!z3) {
            this.h(b0);
        }
    }

    public final void d(f f0, int v) {
        int v1 = f0.b;
        if(v1 != -1) {
            b b0 = this.e[v1];
            if(b0.d) {
                b0.b = (float)v;
                return;
            }
            if(b0.c.a == 0) {
                b0.d = true;
                b0.b = (float)v;
                return;
            }
            b b1 = this.k();
            q.a a0 = b1.c;
            if(v < 0) {
                b1.b = (float)(-v);
                a0.g(f0, 1.0f);
            }
            else {
                b1.b = (float)v;
                a0.g(f0, -1.0f);
            }
            this.c(b1);
            return;
        }
        b b2 = this.k();
        b2.a = f0;
        f0.d = (float)v;
        b2.b = (float)v;
        b2.d = true;
        this.c(b2);
    }

    public final void e(f f0, f f1, int v, int v1) {
        b b0 = this.k();
        boolean z = false;
        if(v != 0) {
            if(v < 0) {
                v = -v;
                z = true;
            }
            b0.b = (float)v;
        }
        q.a a0 = b0.c;
        if(z) {
            a0.g(f0, 1.0f);
            a0.g(f1, -1.0f);
        }
        else {
            a0.g(f0, -1.0f);
            a0.g(f1, 1.0f);
        }
        if(v1 != 6) {
            b0.a(this, v1);
        }
        this.c(b0);
    }

    public final void f(f f0, f f1, int v, int v1) {
        b b0 = this.k();
        f f2 = this.l();
        f2.c = 0;
        b0.c(f0, f1, f2, v);
        if(v1 != 6) {
            float f3 = b0.c.c(f2);
            f f4 = this.i(v1);
            b0.c.g(f4, ((float)(((int)(f3 * -1.0f)))));
        }
        this.c(b0);
    }

    public final void g(f f0, f f1, int v, int v1) {
        b b0 = this.k();
        f f2 = this.l();
        f2.c = 0;
        b0.d(f0, f1, f2, v);
        if(v1 != 6) {
            float f3 = b0.c.c(f2);
            f f4 = this.i(v1);
            b0.c.g(f4, ((float)(((int)(f3 * -1.0f)))));
        }
        this.c(b0);
    }

    public final void h(b b0) {
        b[] arr_b = this.e;
        int v = this.i;
        b b1 = arr_b[v];
        if(b1 != null) {
            D.c c0 = (D.c)this.k.j;
            int v1 = c0.b;
            Object[] arr_object = c0.a;
            if(v1 < arr_object.length) {
                arr_object[v1] = b1;
                c0.b = v1 + 1;
            }
        }
        arr_b[v] = b0;
        b0.a.b = v;
        this.i = v + 1;
        b0.a.d(b0);
    }

    public final f i(int v) {
        if(this.h + 1 >= this.d) {
            this.n();
        }
        f f0 = this.a(4);
        int v1 = this.a + 1;
        this.a = v1;
        ++this.h;
        f0.a = v1;
        f0.c = v;
        ((f[])this.k.l)[v1] = f0;
        this.b.b(f0);
        return f0;
    }

    public final f j(Object object0) {
        f f0 = null;
        if(object0 == null) {
            return null;
        }
        if(this.h + 1 >= this.d) {
            this.n();
        }
        if(object0 instanceof r.c) {
            f0 = ((r.c)object0).i;
            if(f0 == null) {
                ((r.c)object0).e();
                f0 = ((r.c)object0).i;
            }
            int v = f0.a;
            a a0 = this.k;
            if(v == -1 || v > this.a || ((f[])a0.l)[v] == null) {
                if(v != -1) {
                    f0.c();
                }
                int v1 = this.a + 1;
                this.a = v1;
                ++this.h;
                f0.a = v1;
                f0.f = 1;
                ((f[])a0.l)[v1] = f0;
            }
        }
        return f0;
    }

    public final b k() {
        Object object0;
        a a0 = this.k;
        D.c c0 = (D.c)a0.j;
        int v = c0.b;
        if(v > 0) {
            object0 = c0.a[v - 1];
            c0.a[v - 1] = null;
            c0.b = v - 1;
        }
        else {
            object0 = null;
        }
        if(((b)object0) == null) {
            return new b(a0);
        }
        ((b)object0).a = null;
        ((b)object0).c.b();
        ((b)object0).b = 0.0f;
        ((b)object0).d = false;
        return (b)object0;
    }

    public final f l() {
        if(this.h + 1 >= this.d) {
            this.n();
        }
        f f0 = this.a(3);
        int v = this.a + 1;
        this.a = v;
        ++this.h;
        f0.a = v;
        ((f[])this.k.l)[v] = f0;
        return f0;
    }

    public static int m(Object object0) {
        f f0 = ((r.c)object0).i;
        return f0 == null ? 0 : ((int)(f0.d + 0.5f));
    }

    public final void n() {
        int v = this.c * 2;
        this.c = v;
        this.e = (b[])Arrays.copyOf(this.e, v);
        this.k.l = (f[])Arrays.copyOf(((f[])this.k.l), this.c);
        int v1 = this.c;
        this.g = new boolean[v1];
        this.d = v1;
        this.j = v1;
    }

    public final void o(c c0) {
        int v8;
        a a0;
        this.r(c0);
        int v = 0;
        while(v < this.i) {
            b b0 = this.e[v];
            if(b0.a.f != 1 && b0.b < 0.0f) {
                int v1 = 0;
                boolean z = false;
                while(!z) {
                    ++v1;
                    float f = 3.402823E+38f;
                    int v3 = -1;
                    int v4 = -1;
                    int v5 = 0;
                    for(int v2 = 0; true; ++v2) {
                        a0 = this.k;
                        if(v2 >= this.i) {
                            break;
                        }
                        b b1 = this.e[v2];
                        if(b1.a.f != 1 && !b1.d && b1.b < 0.0f) {
                            for(int v6 = 1; v6 < this.h; ++v6) {
                                f f1 = ((f[])a0.l)[v6];
                                float f2 = b1.c.c(f1);
                                if(f2 > 0.0f) {
                                    for(int v7 = 0; v7 < 7; ++v7) {
                                        float f3 = f1.e[v7] / f2;
                                        if(f3 < f && v7 == v5 || v7 > v5) {
                                            v5 = v7;
                                            f = f3;
                                            v3 = v2;
                                            v4 = v6;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if(v3 == -1) {
                        z = true;
                    }
                    else {
                        b b2 = this.e[v3];
                        b2.a.b = -1;
                        b2.e(((f[])a0.l)[v4]);
                        b2.a.b = v3;
                        b2.a.d(b2);
                    }
                    if(v1 > this.h / 2) {
                        z = true;
                    }
                }
                this.p(c0);
                v8 = 0;
                goto label_55;
            }
            ++v;
        }
        this.p(c0);
        v8 = 0;
    label_55:
        while(v8 < this.i) {
            b b3 = this.e[v8];
            b3.a.d = b3.b;
            ++v8;
        }
    }

    public final void p(b b0) {
        for(int v = 0; v < this.h; ++v) {
            this.g[v] = false;
        }
        int v1 = 0;
        boolean z = false;
        while(!z) {
            ++v1;
            if(v1 >= this.h * 2) {
                return;
            }
            f f0 = b0.a;
            if(f0 != null) {
                this.g[f0.a] = true;
            }
            f f1 = b0.c.d(this.g, null);
            if(f1 != null) {
                boolean[] arr_z = this.g;
                int v2 = f1.a;
                if(arr_z[v2]) {
                    return;
                }
                arr_z[v2] = true;
            }
            if(f1 != null) {
                float f2 = 3.402823E+38f;
                int v4 = -1;
                for(int v3 = 0; v3 < this.i; ++v3) {
                    b b1 = this.e[v3];
                    if(b1.a.f != 1 && !b1.d) {
                        q.a a0 = b1.c;
                        int v5 = a0.h;
                        if(v5 != -1) {
                            for(int v6 = 0; v5 != -1 && v6 < a0.a; ++v6) {
                                if(a0.e[v5] == f1.a) {
                                    float f3 = a0.c(f1);
                                    if(f3 < 0.0f) {
                                        float f4 = -b1.b / f3;
                                        if(f4 < f2) {
                                            v4 = v3;
                                            f2 = f4;
                                        }
                                    }
                                    break;
                                }
                                v5 = a0.f[v5];
                            }
                        }
                    }
                }
                if(v4 > -1) {
                    b b2 = this.e[v4];
                    b2.a.b = -1;
                    b2.e(f1);
                    b2.a.b = v4;
                    b2.a.d(b2);
                    continue;
                }
            }
            z = true;
        }
    }

    public final void q() {
        a a0;
        for(int v = 0; true; ++v) {
            a0 = this.k;
            f[] arr_f = (f[])a0.l;
            if(v >= arr_f.length) {
                break;
            }
            f f0 = arr_f[v];
            if(f0 != null) {
                f0.c();
            }
        }
        D.c c0 = (D.c)a0.k;
        f[] arr_f1 = this.l;
        int v1 = this.m;
        c0.getClass();
        if(v1 > arr_f1.length) {
            v1 = arr_f1.length;
        }
        for(int v2 = 0; v2 < v1; ++v2) {
            f f1 = arr_f1[v2];
            int v3 = c0.b;
            Object[] arr_object = c0.a;
            if(v3 < arr_object.length) {
                arr_object[v3] = f1;
                c0.b = v3 + 1;
            }
        }
        this.m = 0;
        Arrays.fill(((f[])a0.l), null);
        this.a = 0;
        this.b.c.b();
        this.b.a = null;
        this.b.b = 0.0f;
        this.h = 1;
        for(int v4 = 0; v4 < this.i; ++v4) {
            this.e[v4].getClass();
        }
        for(int v5 = 0; true; ++v5) {
            b[] arr_b = this.e;
            if(v5 >= arr_b.length) {
                break;
            }
            b b0 = arr_b[v5];
            if(b0 != null) {
                D.c c1 = (D.c)a0.j;
                int v6 = c1.b;
                Object[] arr_object1 = c1.a;
                if(v6 < arr_object1.length) {
                    arr_object1[v6] = b0;
                    c1.b = v6 + 1;
                }
            }
            arr_b[v5] = null;
        }
        this.i = 0;
    }

    public final void r(b b0) {
        if(this.i > 0) {
            q.a a0 = b0.c;
            b[] arr_b = this.e;
            int v = a0.h;
        alab1:
            while(true) {
                for(int v1 = 0; true; ++v1) {
                    if(v == -1 || v1 >= a0.a) {
                        break alab1;
                    }
                    a a1 = a0.c;
                    f f0 = ((f[])a1.l)[a0.e[v]];
                    if(f0.b != -1) {
                        float f1 = a0.g[v];
                        a0.h(f0, true);
                        b b1 = arr_b[f0.b];
                        if(!b1.d) {
                            q.a a2 = b1.c;
                            int v2 = a2.h;
                            for(int v3 = 0; v2 != -1 && v3 < a2.a; ++v3) {
                                a0.a(((f[])a1.l)[a2.e[v2]], a2.g[v2] * f1, true);
                                v2 = a2.f[v2];
                            }
                        }
                        b0.b = b1.b * f1 + b0.b;
                        b1.a.b(b0);
                        v = a0.h;
                        break;
                    }
                    v = a0.f[v];
                }
            }
            if(b0.c.a == 0) {
                b0.d = true;
            }
        }
    }
}

