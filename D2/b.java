package d2;

import G3.a;
import M1.f;
import Z1.e;
import Z1.h;
import Z1.j;
import t1.c;
import z1.a0;

public final class b extends a {
    public final j j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public Z1.b p;
    public final e q;

    static {
        new f(b.class.getSimpleName());
    }

    public b(j j0, h h0) {
        J2.j.f(j0, "engine");
        super(h0);
        this.j = j0;
        this.k = true;
        this.l = true;
        this.m = true;
        this.n = true;
        this.o = 51;
        this.p = Z1.b.e;
        this.q = new e();
    }

    public static float K0(int v, float f, boolean z) {
        switch((z ? v & 7 : v & 0x70)) {
            case 1: 
            case 16: {
                return f * 0.5f;
            }
            case 5: 
            case 80: {
                return f;
            }
            default: {
                return 0.0f;
            }
        }
    }

    public final float L0(boolean z, boolean z1) {
        float f5;
        float f4;
        c2.b b0 = this.I0();
        float f = z ? b0.e.left : b0.e.top;
        c2.b b1 = this.I0();
        float f1 = z ? b1.j : b1.k;
        c2.b b2 = this.I0();
        float f2 = z ? b2.e.width() : b2.e.height();
        float f3 = 0.0f;
        if(!(z ? this.k : this.l) || !z1) {
            f4 = 0.0f;
        }
        else if(z) {
            f4 = this.O0();
        }
        else {
            f4 = this.P0();
        }
        int v = 3;
        int v1 = 0x30;
        if(z) {
            int v2 = this.o & 0xF0;
            if(v2 != 16) {
                switch(v2) {
                    case 0x20: {
                        v = 5;
                        break;
                    }
                    case 0x30: {
                        v = 1;
                        break;
                    }
                    default: {
                        v = 0;
                    }
                }
            }
        }
        else {
            int v3 = this.o & 0xFFFFFF0F;
            if(v3 != 1) {
                switch(v3) {
                    case 2: {
                        v1 = 80;
                        break;
                    }
                    case 3: {
                        v1 = 16;
                        break;
                    }
                    default: {
                        v1 = 0;
                    }
                }
            }
            v = v1;
        }
        if(f2 <= f1) {
            f5 = f1 - f2;
            if(v != 0) {
                f3 = b.K0(v, f5, z);
                return a0.g(f, f3 - f4, f3 + f4) - f;
            }
        }
        else {
            f3 = f1 - f2;
            f5 = 0.0f;
        }
        return a0.g(f, f3 - f4, f5 + f4) - f;
    }

    public final void M0(boolean z, d2.a a0) {
        J2.j.f(a0, "output");
        c2.b b0 = this.I0();
        float f = z ? b0.e.left : b0.e.top;
        c2.b b1 = this.I0();
        float f1 = z ? b1.j : b1.k;
        c2.b b2 = this.I0();
        float f2 = z ? b2.e.width() : b2.e.height();
        boolean z1 = false;
        int v = (int)this.L0(z, false);
        int v1 = z ? this.o & 0xF0 : this.o & 0xFFFFFF0F;
        if(((int)f2) > ((int)f1)) {
            a0.a = -(((int)f2) - ((int)f1));
            a0.c = 0;
        }
        else if(v1 == 0 || v1 == 68 || (v1 == 4 || v1 == 0x40)) {
            a0.a = 0;
            a0.c = ((int)f1) - ((int)f2);
        }
        else {
            int v2 = ((int)f) + v;
            a0.a = v2;
            a0.c = v2;
        }
        a0.b = (int)f;
        if(v != 0) {
            z1 = true;
        }
        a0.d = z1;
    }

    public final e N0() {
        Float float0 = this.L0(true, false);
        Float float1 = this.L0(false, false);
        this.q.getClass();
        this.q.a = float0.floatValue();
        this.q.b = float1.floatValue();
        return this.q;
    }

    public final float O0() {
        float f = ((c)this.p).f(this.j, true);
        return Float.compare(f, 0.0f) >= 0 ? f : 0.0f;
    }

    public final float P0() {
        float f = ((c)this.p).f(this.j, false);
        return Float.compare(f, 0.0f) >= 0 ? f : 0.0f;
    }
}

