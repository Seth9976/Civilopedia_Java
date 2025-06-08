package R2;

import F3.n;
import I2.a;
import J2.j;
import J2.l;
import O2.q;
import X2.e;
import X2.k;
import java.util.ArrayList;
import java.util.Collection;
import x2.i;
import y3.d;

public final class s extends l implements a {
    public final int i;
    public final w j;

    public s(w w0, int v) {
        this.i = v;
        this.j = w0;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        switch(this.i) {
            case 0: {
                this.j.getClass();
                q q0 = w.l[13];
                Object object1 = this.j.j.invoke();
                j.e(object1, "getValue(...)");
                q q1 = w.l[14];
                Object object2 = this.j.k.invoke();
                j.e(object2, "getValue(...)");
                return i.e0(((Collection)object2), ((Collection)object1));
            }
            case 1: {
                this.j.getClass();
                q q2 = w.l[9];
                Object object3 = this.j.f.invoke();
                j.e(object3, "getValue(...)");
                q q3 = w.l[11];
                Object object4 = this.j.h.invoke();
                j.e(object4, "getValue(...)");
                return i.e0(((Collection)object4), ((Collection)object3));
            }
            case 2: {
                this.j.getClass();
                q q4 = w.l[10];
                Object object5 = this.j.g.invoke();
                j.e(object5, "getValue(...)");
                q q5 = w.l[12];
                Object object6 = this.j.i.invoke();
                j.e(object6, "getValue(...)");
                return i.e0(((Collection)object6), ((Collection)object5));
            }
            case 3: {
                return x0.d(this.j.a());
            }
            case 4: {
                this.j.getClass();
                q q6 = w.l[9];
                Object object7 = this.j.f.invoke();
                j.e(object7, "getValue(...)");
                q q7 = w.l[10];
                Object object8 = this.j.g.invoke();
                j.e(object8, "getValue(...)");
                return i.e0(((Collection)object8), ((Collection)object7));
            }
            case 5: {
                n n0 = this.j.a().k0();
                j.e(n0, "getUnsubstitutedInnerClassesScope(...)");
                Iterable iterable0 = android.support.v4.media.session.a.s(n0, null, 3);
                ArrayList arrayList1 = new ArrayList();
                for(Object object9: iterable0) {
                    if(!d.n(((k)object9))) {
                        arrayList1.add(object9);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for(Object object10: arrayList1) {
                    k k0 = (k)object10;
                    e e0 = k0 instanceof e ? ((e)k0) : null;
                    Class class1 = e0 == null ? null : x0.k(e0);
                    A a1 = class1 == null ? null : new A(class1);
                    if(a1 != null) {
                        arrayList2.add(a1);
                    }
                }
                return arrayList2;
            }
            default: {
                Collection collection0 = this.j.a().V();
                j.e(collection0, "getSealedSubclasses(...)");
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: collection0) {
                    j.d(((e)object0), "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class class0 = x0.k(((e)object0));
                    A a0 = class0 == null ? null : new A(class0);
                    if(a0 != null) {
                        arrayList0.add(a0);
                    }
                }
                return arrayList0;
            }
        }
    }
}

