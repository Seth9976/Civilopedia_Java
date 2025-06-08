package x3;

import J2.j;
import X2.F;
import X2.T;
import X2.h;
import X2.k;
import a3.C;
import java.util.ArrayList;
import o2.G;
import v3.e;
import v3.f;
import x2.y;
import y3.d;

public final class b implements c {
    public final int a;
    public static final b b;
    public static final b c;
    public static final b d;

    static {
        b.b = new b(0);
        b.c = new b(1);
        b.d = new b(2);
    }

    public b(int v) {
        this.a = v;
        super();
    }

    @Override  // x3.c
    public final String a(h h0, g g0) {
        switch(this.a) {
            case 0: {
                j.f(g0, "renderer");
                if(h0 instanceof T) {
                    f f0 = ((T)h0).getName();
                    j.e(f0, "getName(...)");
                    return g0.L(f0, false);
                }
                e e0 = d.g(h0);
                j.e(e0, "getFqName(...)");
                return g0.m(G.t(e0.e()));
            }
            case 1: {
                j.f(g0, "renderer");
                if(h0 instanceof T) {
                    f f1 = ((T)h0).getName();
                    j.e(f1, "getName(...)");
                    return g0.L(f1, false);
                }
                ArrayList arrayList0 = new ArrayList();
                do {
                    arrayList0.add(h0.getName());
                    h0 = h0.p();
                }
                while(h0 instanceof X2.e);
                return G.t(new y(arrayList0));
            }
            default: {
                j.f(g0, "renderer");
                return b.b(h0);
            }
        }
    }

    public static String b(h h0) {
        String s1;
        f f0 = h0.getName();
        j.e(f0, "getName(...)");
        String s = G.s(f0);
        if(h0 instanceof T) {
            return s;
        }
        k k0 = h0.p();
        j.e(k0, "getContainingDeclaration(...)");
        if(k0 instanceof X2.e) {
            s1 = b.b(((h)k0));
            return s1 == null || s1.equals("") ? s : s1 + '.' + s;
        }
        if(k0 instanceof F) {
            e e0 = ((C)(((F)k0))).m.i();
            j.e(e0, "toUnsafe(...)");
            s1 = G.t(e0.e());
            return s1 == null || s1.equals("") ? s : s1 + '.' + s;
        }
        return s;
    }
}

