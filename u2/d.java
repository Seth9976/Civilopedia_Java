package U2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import v3.b;
import v3.c;
import x2.i;
import x2.k;

public final class d {
    public static final LinkedHashSet a;

    static {
        ArrayList arrayList0 = new ArrayList(k.E(j.m));
        for(Object object0: j.m) {
            J2.j.f(((j)object0), "primitiveType");
            arrayList0.add(n.l.c(((j)object0).i));
        }
        c c0 = m.f.g();
        J2.j.e(c0, "toSafe(...)");
        ArrayList arrayList1 = i.f0(arrayList0, c0);
        c c1 = m.h.g();
        J2.j.e(c1, "toSafe(...)");
        ArrayList arrayList2 = i.f0(arrayList1, c1);
        c c2 = m.j.g();
        J2.j.e(c2, "toSafe(...)");
        ArrayList arrayList3 = i.f0(arrayList2, c2);
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        for(Object object1: arrayList3) {
            linkedHashSet0.add(b.j(((c)object1)));
        }
        d.a = linkedHashSet0;
    }
}

