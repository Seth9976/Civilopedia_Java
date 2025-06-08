package R2;

import F3.n;
import I2.a;
import I3.i;
import J2.l;
import O2.q;
import X2.j;
import c3.e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import v3.b;
import w2.c;
import x2.k;

public final class t extends l implements a {
    public final int i;
    public final A j;

    public t(A a0, int v) {
        this.i = v;
        this.j = a0;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        D d0 = D.i;
        D d1 = D.j;
        p3.a a0 = null;
        A a1 = this.j;
        switch(this.i) {
            case 0: {
                Iterable iterable0 = a1.e();
                ArrayList arrayList0 = new ArrayList(k.E(iterable0));
                for(Object object0: iterable0) {
                    arrayList0.add(new H(a1, ((j)object0)));
                }
                return arrayList0;
            }
            case 1: {
                return a1.j(a1.t().k().x0(), d0);
            }
            case 2: {
                n n0 = a1.t().p0();
                J2.j.e(n0, "getStaticScope(...)");
                return a1.j(n0, d0);
            }
            case 3: {
                b b0 = a1.s();
                w w0 = (w)((c)a1.k).getValue();
                w0.getClass();
                q q0 = C.b[0];
                Object object1 = w0.a.invoke();
                J2.j.e(object1, "getValue(...)");
                i i0 = ((e)object1).a;
                Class class0 = a1.j;
                X2.e e0 = !b0.c || !class0.isAnnotationPresent(Metadata.class) ? X2.w.d(i0.b, b0) : i0.b(b0);
                if(e0 == null) {
                    if(class0.isSynthetic()) {
                        return A.r(b0, ((e)object1));
                    }
                    c3.b b1 = O2.A.n(class0);
                    if(b1 != null) {
                        a0 = (p3.a)b1.b.d;
                    }
                    switch((a0 == null ? -1 : x.a[a0.ordinal()])) {
                        case 1: 
                        case 2: 
                        case 3: 
                        case 4: {
                            return A.r(b0, ((e)object1));
                        }
                        case 5: {
                            throw new H2.a("Unknown class: " + class0 + " (kind = " + a0 + ')', 1);
                        }
                        case -1: 
                        case 6: {
                            throw new H2.a("Unresolved class: " + class0 + " (kind = " + a0 + ')', 1);
                        }
                        default: {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                return e0;
            }
            case 4: {
                return a1.j(a1.t().k().x0(), d1);
            }
            case 5: {
                n n1 = a1.t().p0();
                J2.j.e(n1, "getStaticScope(...)");
                return a1.j(n1, d1);
            }
            case 6: {
                if(!a1.j.isAnonymousClass()) {
                    b b2 = a1.s();
                    if(!b2.c) {
                        return b2.b().b();
                    }
                }
                return null;
            }
            default: {
                return new w(a1);
            }
        }
    }
}

