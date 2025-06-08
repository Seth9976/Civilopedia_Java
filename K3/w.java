package k3;

import F3.f;
import F3.k;
import F3.n;
import I2.a;
import J2.j;
import J2.l;
import f3.b;
import java.util.LinkedHashSet;
import java.util.List;
import x2.i;

public final class w extends l implements a {
    public final int i;
    public final y j;

    public w(y y0, int v) {
        this.i = v;
        this.j = y0;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        switch(this.i) {
            case 0: {
                f f0 = f.m;
                n.a.getClass();
                k k0 = k.j;
                y y0 = this.j;
                y0.getClass();
                j.f(f0, "kindFilter");
                b b0 = b.l;
                LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                if(f0.a(f.l)) {
                    for(Object object0: y0.h(f0, k0)) {
                        k0.b(((v3.f)object0));
                        V3.k.a(linkedHashSet0, y0.f(((v3.f)object0), b0));
                    }
                }
                List list0 = f0.a;
                if(f0.a(f.i) && !list0.contains(F3.b.a)) {
                    for(Object object1: y0.i(f0, k0)) {
                        k0.b(((v3.f)object1));
                        linkedHashSet0.addAll(y0.b(((v3.f)object1), b0));
                    }
                }
                if(f0.a(f.j) && !list0.contains(F3.b.a)) {
                    for(Object object2: y0.o(f0)) {
                        k0.b(((v3.f)object2));
                        linkedHashSet0.addAll(y0.a(((v3.f)object2), b0));
                    }
                }
                return i.o0(linkedHashSet0);
            }
            case 1: {
                return this.j.h(f.o, null);
            }
            case 2: {
                return this.j.k();
            }
            case 3: {
                return this.j.i(f.p, null);
            }
            default: {
                return this.j.o(f.q);
            }
        }
    }
}

