package d2;

import G3.a;
import J3.d;
import M1.f;
import Z1.h;
import Z1.j;
import z1.a0;

public final class c extends a {
    public final j j;
    public float k;
    public float l;
    public int m;
    public float n;
    public int o;
    public Z1.c p;
    public boolean q;
    public boolean r;

    static {
        new f(c.class.getSimpleName());
    }

    public c(j j0, h h0) {
        J2.j.f(j0, "engine");
        super(h0);
        this.j = j0;
        this.l = 0.8f;
        this.n = 2.5f;
        this.p = Z1.c.f;
        this.q = true;
        this.r = true;
    }

    public final float K0(float f, boolean z) {
        float f1 = this.M0();
        float f2 = this.L0();
        if(z && this.r) {
            ((d)this.p).getClass();
            J2.j.f(this.j, "engine");
            c c0 = this.j.h;
            f1 -= (Float.compare((c0.n - c0.l) * 0.1f, 0.0f) >= 0 ? (c0.n - c0.l) * 0.1f : 0.0f);
            ((d)this.p).getClass();
            f2 += (Float.compare((c0.n - c0.l) * 0.1f, 0.0f) >= 0 ? (c0.n - c0.l) * 0.1f : 0.0f);
        }
        if(f2 < f1) {
            int v = this.o;
            if(v == this.m) {
                throw new IllegalStateException("maxZoom is less than minZoom: " + f2 + " < " + f1);
            }
            return v == 0 ? a0.g(f, f2, f2) : a0.g(f, f1, f1);
        }
        return a0.g(f, f1, f2);
    }

    public final float L0() {
        switch(this.o) {
            case 0: {
                return this.n * this.k;
            }
            case 1: {
                return this.n;
            }
            default: {
                throw new IllegalArgumentException("Unknown ZoomType " + this.o);
            }
        }
    }

    public final float M0() {
        switch(this.m) {
            case 0: {
                return this.l * this.k;
            }
            case 1: {
                return this.l;
            }
            default: {
                throw new IllegalArgumentException("Unknown ZoomType " + this.m);
            }
        }
    }
}

