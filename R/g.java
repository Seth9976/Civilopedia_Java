package r;

import java.util.ArrayList;
import q.b;
import q.f;

public final class g extends d {
    public float i0;
    public int j0;
    public int k0;
    public c l0;
    public int m0;

    public g() {
        this.i0 = -1.0f;
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = this.t;
        this.m0 = 0;
        this.B.clear();
        this.B.add(this.l0);
        for(int v = 0; v < this.A.length; ++v) {
            this.A[v] = this.l0;
        }
    }

    public final void A(int v) {
        if(this.m0 == v) {
            return;
        }
        this.m0 = v;
        ArrayList arrayList0 = this.B;
        arrayList0.clear();
        this.l0 = this.m0 == 1 ? this.s : this.t;
        arrayList0.add(this.l0);
        c[] arr_c = this.A;
        for(int v1 = 0; v1 < arr_c.length; ++v1) {
            arr_c[v1] = this.l0;
        }
    }

    @Override  // r.d
    public final void a(q.d d0) {
        e e0 = (e)this.C;
        if(e0 == null) {
            return;
        }
        c c0 = e0.f(2);
        c c1 = e0.f(4);
        int v = 1;
        int v1 = this.C == null || this.C.h0[0] != 2 ? 0 : 1;
        if(this.m0 == 0) {
            c0 = e0.f(3);
            c1 = e0.f(5);
            if(this.C == null || this.C.h0[1] != 2) {
                v = 0;
            }
            v1 = v;
        }
        if(this.j0 != -1) {
            f f0 = d0.j(this.l0);
            d0.e(f0, d0.j(c0), this.j0, 6);
            if(v1 != 0) {
                d0.f(d0.j(c1), f0, 0, 5);
            }
        }
        else if(this.k0 != -1) {
            f f1 = d0.j(this.l0);
            f f2 = d0.j(c1);
            d0.e(f1, f2, -this.k0, 6);
            if(v1 != 0) {
                d0.f(f1, d0.j(c0), 0, 5);
                d0.f(f2, f1, 0, 5);
            }
        }
        else if(this.i0 != -1.0f) {
            f f3 = d0.j(this.l0);
            f f4 = d0.j(c0);
            f f5 = d0.j(c1);
            float f6 = this.i0;
            b b0 = d0.k();
            b0.c.g(f3, -1.0f);
            b0.c.g(f4, 1.0f - f6);
            b0.c.g(f5, f6);
            d0.c(b0);
        }
    }

    @Override  // r.d
    public final boolean b() {
        return true;
    }

    @Override  // r.d
    public final void c(int v) {
        d d0 = this.C;
        if(d0 == null) {
            return;
        }
        c c0 = this.u;
        c c1 = this.s;
        c c2 = this.v;
        c c3 = this.t;
        int[] arr_v = d0.h0;
        c c4 = d0.s;
        c c5 = d0.t;
        if(this.m0 == 1) {
            c3.a.g(c5.a, 0);
            c2.a.g(c5.a, 0);
            int v1 = this.j0;
            if(v1 != -1) {
                c1.a.g(c4.a, v1);
                c0.a.g(c4.a, this.j0);
                return;
            }
            int v2 = this.k0;
            if(v2 != -1) {
                c1.a.g(d0.u.a, -v2);
                c0.a.g(d0.u.a, -this.k0);
                return;
            }
            float f = this.i0;
            if(f != -1.0f && arr_v[0] == 1) {
                int v3 = (int)(((float)d0.D) * f);
                c1.a.g(c4.a, v3);
                c0.a.g(c4.a, v3);
            }
        }
        else {
            c1.a.g(c4.a, 0);
            c0.a.g(c4.a, 0);
            int v4 = this.j0;
            if(v4 != -1) {
                c3.a.g(c5.a, v4);
                c2.a.g(c5.a, this.j0);
                return;
            }
            int v5 = this.k0;
            if(v5 != -1) {
                c3.a.g(d0.v.a, -v5);
                c2.a.g(d0.v.a, -this.k0);
                return;
            }
            float f1 = this.i0;
            if(f1 != -1.0f && arr_v[1] == 1) {
                int v6 = (int)(((float)d0.E) * f1);
                c3.a.g(c5.a, v6);
                c2.a.g(c5.a, v6);
            }
        }
    }

    @Override  // r.d
    public final c f(int v) {
        switch(q.e.c(v)) {
            case 1: 
            case 3: {
                if(this.m0 == 1) {
                    return this.l0;
                }
                break;
            }
            case 2: 
            case 4: {
                if(this.m0 == 0) {
                    return this.l0;
                }
                break;
            }
            case 0: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                return null;
            }
        }
        throw new AssertionError(i3.e.n(v));
    }

    @Override  // r.d
    public final void z(q.d d0) {
        if(this.C == null) {
            return;
        }
        c c0 = this.l0;
        d0.getClass();
        int v = q.d.m(c0);
        if(this.m0 == 1) {
            this.H = v;
            this.I = 0;
            this.s(this.C.g());
            this.x(0);
            return;
        }
        this.H = 0;
        this.I = v;
        this.x(this.C.k());
        this.s(0);
    }
}

