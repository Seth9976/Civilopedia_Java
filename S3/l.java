package S3;

import J2.j;
import M3.A;
import M3.F;
import M3.H;
import M3.X;
import M3.Z;
import M3.d;
import U2.m;
import X2.T;
import X2.w;
import a3.S;
import i3.f;
import java.util.Collection;
import java.util.List;
import o1.a;
import o2.G;
import x2.i;

public final class l implements e {
    public final int a;
    public static final l b;
    public static final l c;

    static {
        l.b = new l(0);
        l.c = new l(1);
    }

    public l(int v) {
        this.a = v;
        super();
    }

    @Override  // S3.e
    public final String a(f f0) {
        return a.E(this, f0);
    }

    @Override  // S3.e
    public final boolean b(f f0) {
        A a1;
        if(this.a != 0) {
            List list0 = f0.z0();
            j.e(list0, "getValueParameters(...)");
            if(!(list0 instanceof Collection) || !list0.isEmpty()) {
                for(Object object0: list0) {
                    j.c(((S)object0));
                    if(C3.e.a(((S)object0)) || ((S)object0).r != null) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return true;
        }
        S s0 = (S)f0.z0().get(1);
        j.c(s0);
        X2.A a0 = C3.e.j(s0);
        U2.l.d.getClass();
        X2.e e0 = w.d(a0, m.Q);
        if(e0 == null) {
            a1 = null;
        }
        else {
            H.j.getClass();
            List list1 = e0.B().o();
            j.e(list1, "getParameters(...)");
            Object object1 = i.i0(list1);
            j.e(object1, "single(...)");
            List list2 = G.p(new F(((T)object1)));
            a1 = d.q(H.k, e0, list2);
        }
        if(a1 != null) {
            M3.w w0 = s0.getType();
            j.e(w0, "getType(...)");
            Z z0 = X.g(w0, false);
            return N3.d.a.b(a1, z0);
        }
        return false;
    }

    @Override  // S3.e
    public final String getDescription() {
        return this.a == 0 ? "second parameter must be of type KProperty<*> or its supertype" : "should not have varargs or parameters with default values";
    }
}

