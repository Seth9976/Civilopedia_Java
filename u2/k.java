package U2;

import D3.b;
import I2.a;
import J2.j;
import J2.l;
import W2.h;
import X2.I;
import a3.A;
import a3.x;
import java.util.ArrayList;
import java.util.List;
import v3.f;

public final class k extends l implements a {
    public final int i;
    public final A j;

    public k(A a0, int v) {
        this.i = v;
        this.j = a0;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        switch(this.i) {
            case 0: {
                return ((x)this.j.m0(n.i)).o;
            }
            case 1: {
                return new h(this.j);
            }
            default: {
                A a0 = this.j;
                b b0 = a0.o;
                if(b0 != null) {
                    a0.L0();
                    List list0 = (List)b0.j;
                    list0.contains(a0);
                    for(Object object0: list0) {
                        ((A)object0).getClass();
                    }
                    ArrayList arrayList0 = new ArrayList(x2.k.E(list0));
                    for(Object object1: list0) {
                        I i0 = ((A)object1).p;
                        j.c(i0);
                        arrayList0.add(i0);
                    }
                    return new a3.l(arrayList0, "CompositeProvider@ModuleDescriptor for " + a0.getName());
                }
                f f0 = a0.getName();
                j.e(f0.i, "toString(...)");
                throw new AssertionError("Dependencies of module " + f0.i + " were not set before querying module content");
            }
        }
    }
}

