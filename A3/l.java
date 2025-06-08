package a3;

import I2.b;
import J2.j;
import X2.I;
import X2.w;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import v3.c;
import x2.i;

public final class l implements I {
    public final List a;
    public final String b;

    public l(List list0, String s) {
        j.f(s, "debugName");
        super();
        this.a = list0;
        this.b = s;
        list0.size();
        i.s0(list0).size();
    }

    @Override  // X2.I
    public final void a(c c0, ArrayList arrayList0) {
        j.f(c0, "fqName");
        for(Object object0: this.a) {
            w.b(((I)object0), c0, arrayList0);
        }
    }

    @Override  // X2.I
    public final boolean b(c c0) {
        j.f(c0, "fqName");
        Iterable iterable0 = this.a;
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object0: iterable0) {
                if(!w.h(((I)object0), c0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    @Override  // X2.I
    public final Collection h(c c0, b b0) {
        j.f(c0, "fqName");
        Collection collection0 = new HashSet();
        for(Object object0: this.a) {
            ((AbstractCollection)collection0).addAll(((I)object0).h(c0, b0));
        }
        return collection0;
    }

    @Override
    public final String toString() {
        return this.b;
    }
}

