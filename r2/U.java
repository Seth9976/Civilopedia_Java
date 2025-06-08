package R2;

import I2.a;
import J2.j;
import J2.l;
import K3.p;
import U2.h;
import U2.m;
import V3.k;
import X2.T;
import X2.e;
import X2.f;
import Y3.n;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import v3.b;
import y3.d;

public final class u extends l implements a {
    public final int i;
    public final A j;
    public final w k;

    public u(A a0, w w0) {
        this.i = 1;
        this.j = a0;
        this.k = w0;
        super(0);
    }

    public u(w w0, A a0, int v) {
        this.i = v;
        this.k = w0;
        this.j = a0;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        Field field0;
        String s = null;
        A a0 = this.j;
        w w0 = this.k;
        switch(this.i) {
            case 0: {
                e e0 = w0.a();
                if(e0.j() == f.n) {
                    if(!e0.D() || o1.a.F(e0)) {
                        field0 = a0.j.getDeclaredField("INSTANCE");
                    }
                    else {
                        String s1 = e0.getName().b();
                        field0 = a0.j.getEnclosingClass().getDeclaredField(s1);
                    }
                    s = field0.get(null);
                    j.d(s, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                }
                return s;
            }
            case 1: {
                if(!a0.j.isAnonymousClass()) {
                    b b0 = a0.s();
                    if(b0.c) {
                        w0.getClass();
                        Class class0 = a0.j;
                        String s2 = class0.getSimpleName();
                        Method method0 = class0.getEnclosingMethod();
                        if(method0 != null) {
                            return n.I0(s2, method0.getName() + '$', s2);
                        }
                        Constructor constructor0 = class0.getEnclosingConstructor();
                        if(constructor0 != null) {
                            return n.I0(s2, constructor0.getName() + '$', s2);
                        }
                        int v = n.y0(s2, '$', 0, 6);
                        if(v != -1) {
                            s2 = s2.substring(v + 1, s2.length());
                            j.e(s2, "substring(...)");
                        }
                        return s2;
                    }
                    s = b0.i().b();
                    j.e(s, "asString(...)");
                }
                return s;
            }
            case 2: {
                Collection collection0 = w0.a().B().r();
                j.e(collection0, "getSupertypes(...)");
                ArrayList arrayList1 = new ArrayList(collection0.size());
                for(Object object1: collection0) {
                    j.c(((M3.w)object1));
                    arrayList1.add(new o0(((M3.w)object1), new p(((M3.w)object1), w0, a0, 1)));
                }
                e e1 = w0.a();
                if(!h.b(e1, m.a) && !h.b(e1, m.b)) {
                    if(!arrayList1.isEmpty()) {
                        for(Object object2: arrayList1) {
                            f f0 = d.c(((o0)object2).a).j();
                            j.e(f0, "getKind(...)");
                            if(f0 != f.j && f0 != f.m) {
                                return k.d(arrayList1);
                            }
                        }
                    }
                    arrayList1.add(new o0(C3.e.e(w0.a()).e(), v.i));
                }
                return k.d(arrayList1);
            }
            default: {
                List list0 = w0.a().t();
                j.e(list0, "getDeclaredTypeParameters(...)");
                ArrayList arrayList0 = new ArrayList(x2.k.E(list0));
                for(Object object0: list0) {
                    j.c(((T)object0));
                    arrayList0.add(new p0(a0, ((T)object0)));
                }
                return arrayList0;
            }
        }
    }
}

