package g3;

import I2.b;
import J2.j;
import J2.l;
import U2.h;
import X2.c;
import X2.u;
import a3.L;
import a3.S;
import android.support.v4.media.session.a;
import o2.I;
import v3.f;
import x2.i;
import x2.w;

public final class e extends l implements b {
    public final int i;
    public static final e j;
    public static final e k;
    public static final e l;
    public static final e m;
    public static final e n;
    public static final e o;
    public static final e p;

    static {
        e.j = new e(1, 0);
        e.k = new e(1, 1);
        e.l = new e(1, 2);
        e.m = new e(1, 3);
        e.n = new e(1, 4);
        e.o = new e(1, 5);
        e.p = new e(1, 6);
    }

    public e(int v, int v1) {
        this.i = v1;
        super(v);
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        D d1;
        boolean z = false;
        switch(this.i) {
            case 0: {
                j.f(((c)object0), "it");
                String s1 = I.i(((c)object0));
                return Boolean.valueOf(i.M(G.f, s1));
            }
            case 1: {
                j.f(((c)object0), "it");
                if(((c)object0) instanceof u) {
                    String s2 = I.i(((c)object0));
                    if(i.M(G.f, s2)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
            case 2: {
                j.f(((c)object0), "it");
                return Boolean.valueOf(a.B(((c)object0)));
            }
            case 3: {
                return ((S)object0).getType();
            }
            case 4: {
                j.f(((c)object0), "it");
                return Boolean.valueOf(a.B(C3.e.k(((c)object0))));
            }
            case 5: {
                j.f(((c)object0), "it");
                if(h.z(((L)(((c)object0)))) && C3.e.b(((L)(((c)object0))), new A3.h(((L)(((c)object0))), 14)) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            default: {
                j.f(((c)object0), "it");
                if(h.z(((c)object0))) {
                    f f0 = ((c)object0).getName();
                    D d0 = null;
                    if(G.e.contains(f0)) {
                        c c0 = C3.e.b(((c)object0), e.k);
                        if(c0 != null) {
                            String s = I.i(c0);
                            if(s != null) {
                                if(G.b.contains(s)) {
                                    d1 = D.i;
                                }
                                else {
                                    d1 = ((F)w.n(G.d, s)) == F.j ? D.k : D.j;
                                }
                                d0 = d1;
                            }
                        }
                    }
                    if(d0 != null) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        }
    }
}

