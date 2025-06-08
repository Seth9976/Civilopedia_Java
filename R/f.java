package r;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class f {
    public final List a;
    public boolean b;
    public final int[] c;
    public final ArrayList d;
    public final ArrayList e;
    public final HashSet f;
    public final HashSet g;
    public final ArrayList h;
    public final ArrayList i;

    public f(ArrayList arrayList0) {
        this.b = false;
        this.c = new int[]{-1, -1};
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new HashSet();
        this.g = new HashSet();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.a = arrayList0;
        this.b = true;
    }

    public f(List list0) {
        this.b = false;
        this.c = new int[]{-1, -1};
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new HashSet();
        this.g = new HashSet();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.a = list0;
    }

    public final void a(d d0, int v) {
        if(v == 0) {
            this.f.add(d0);
            return;
        }
        if(v == 1) {
            this.g.add(d0);
        }
    }

    public static void b(ArrayList arrayList0, d d0) {
        if(d0.b0) {
            return;
        }
        arrayList0.add(d0);
        d0.b0 = true;
        if(d0.n()) {
            return;
        }
        if(d0 instanceof a) {
            int v1 = ((a)d0).j0;
            for(int v2 = 0; v2 < v1; ++v2) {
                f.b(arrayList0, ((a)d0).i0[v2]);
            }
        }
        c[] arr_c = d0.A;
        for(int v = 0; v < arr_c.length; ++v) {
            c c0 = arr_c[v].d;
            if(c0 != null) {
                d d1 = c0.b;
                if(d1 != d0.C) {
                    f.b(arrayList0, d1);
                }
            }
        }
    }

    public static void c(d d0) {
        int v1;
        if(!d0.Z || d0.n()) {
            return;
        }
        c c0 = d0.u;
        c c1 = c0.d;
        boolean z = false;
        boolean z1 = c1 != null;
        c c2 = d0.s;
        if(!z1) {
            c1 = c2.d;
        }
        if(c1 == null) {
            v1 = 0;
        }
        else {
            d d1 = c1.b;
            if(!d1.a0) {
                f.c(d1);
            }
            int v = c1.c;
            if(v == 4) {
                v1 = d1.k() + d1.H;
            }
            else if(v == 2) {
                v1 = d1.H;
            }
            else {
                v1 = 0;
            }
        }
        int v2 = z1 ? v1 - c0.b() : v1 + (d0.k() + c2.b());
        int v3 = v2 - d0.k();
        d0.H = v3;
        int v4 = v2 - v3;
        d0.D = v4;
        int v5 = d0.Q;
        if(v4 < v5) {
            d0.D = v5;
        }
        c c3 = d0.w.d;
        if(c3 != null) {
            d d2 = c3.b;
            if(!d2.a0) {
                f.c(d2);
            }
            int v6 = d2.I + d2.P - d0.P;
            d0.v(v6, d0.E + v6);
            d0.a0 = true;
            return;
        }
        c c4 = d0.v;
        c c5 = c4.d;
        if(c5 != null) {
            z = true;
        }
        c c6 = d0.t;
        if(!z) {
            c5 = c6.d;
        }
        if(c5 != null) {
            d d3 = c5.b;
            if(!d3.a0) {
                f.c(d3);
            }
            int v7 = c5.c;
            if(v7 == 5) {
                v2 = d3.g() + d3.I;
            }
            else if(v7 == 3) {
                v2 = d3.I;
            }
        }
        int v8 = z ? v2 - c4.b() : v2 + (d0.g() + c6.b());
        d0.v(v8 - d0.g(), v8);
        d0.a0 = true;
    }
}

