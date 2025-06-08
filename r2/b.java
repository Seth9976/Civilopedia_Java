package R2;

import J2.j;
import J2.l;
import M3.w;
import X2.M;
import X2.u;
import a3.S;
import d3.d;
import java.lang.reflect.Method;
import x3.g;

public final class b extends l implements I2.b {
    public final int i;
    public static final b j;
    public static final b k;
    public static final b l;
    public static final b m;
    public static final b n;
    public static final b o;
    public static final b p;
    public static final b q;
    public static final b r;

    static {
        b.j = new b(1, 0);
        b.k = new b(1, 1);
        b.l = new b(1, 2);
        b.m = new b(1, 3);
        b.n = new b(1, 4);
        b.o = new b(1, 5);
        b.p = new b(1, 6);
        b.q = new b(1, 7);
        b.r = new b(1, 8);
    }

    public b(int v, int v1) {
        this.i = v1;
        super(v);
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        switch(this.i) {
            case 0: {
                j.f(((Class)object0), "it");
                return new A(((Class)object0));
            }
            case 1: {
                j.f(((Class)object0), "it");
                return new U(((Class)object0));
            }
            case 2: {
                Class class0 = ((Method)object0).getReturnType();
                j.e(class0, "getReturnType(...)");
                return d.b(class0);
            }
            case 3: {
                j.c(((Class)object0));
                return d.b(((Class)object0));
            }
            case 4: {
                j.f(((u)object0), "descriptor");
                return g.e.u(((u)object0)) + " | " + v0.c(((u)object0)).c();
            }
            case 5: {
                j.f(((M)object0), "descriptor");
                return g.e.u(((M)object0)) + " | " + v0.b(((M)object0)).d();
            }
            case 6: {
                w w0 = ((S)object0).getType();
                j.e(w0, "getType(...)");
                return u0.d(w0);
            }
            case 7: {
                w w1 = ((S)object0).getType();
                j.e(w1, "getType(...)");
                return u0.d(w1);
            }
            default: {
                j.c(((Class)object0));
                return d.b(((Class)object0));
            }
        }
    }
}

