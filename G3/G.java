package g3;

import J2.j;
import U2.m;
import U2.n;
import W2.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import v3.b;
import v3.c;
import v3.f;
import w2.e;
import x2.i;
import x2.k;
import x2.w;

public abstract class g {
    public static final Object a;
    public static final LinkedHashMap b;
    public static final Set c;
    public static final Set d;

    static {
        f f0 = f.e("name");
        c c0 = m.j.b(f0).g();
        j.e(c0, "toSafe(...)");
        e e0 = new e(c0, n.d);
        f f1 = f.e("ordinal");
        c c1 = m.j.b(f1).g();
        j.e(c1, "toSafe(...)");
        e e1 = new e(c1, f.e("ordinal"));
        f f2 = f.e("size");
        e e2 = new e(m.B.c(f2), f.e("size"));
        f f3 = f.e("size");
        e e3 = new e(m.F.c(f3), f.e("size"));
        f f4 = f.e("length");
        c c2 = m.e.b(f4).g();
        j.e(c2, "toSafe(...)");
        e e4 = new e(c2, f.e("length"));
        f f5 = f.e("keys");
        e e5 = new e(m.F.c(f5), f.e("keySet"));
        f f6 = f.e("values");
        e e6 = new e(m.F.c(f6), f.e("values"));
        f f7 = f.e("entries");
        Map map0 = w.s(new e[]{e0, e1, e2, e3, e4, e5, e6, new e(m.F.c(f7), f.e("entrySet"))});
        g.a = map0;
        Iterable iterable0 = map0.entrySet();
        ArrayList arrayList0 = new ArrayList(k.E(iterable0));
        for(Object object0: iterable0) {
            arrayList0.add(new e(((c)((Map.Entry)object0).getKey()).f(), ((Map.Entry)object0).getValue()));
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object1: arrayList0) {
            f f8 = (f)((e)object1).j;
            ArrayList arrayList1 = linkedHashMap0.get(f8);
            if(arrayList1 == null) {
                arrayList1 = new ArrayList();
                linkedHashMap0.put(f8, arrayList1);
            }
            arrayList1.add(((f)((e)object1).i));
        }
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(w.q(linkedHashMap0.size()));
        for(Object object2: linkedHashMap0.entrySet()) {
            linkedHashMap1.put(((Map.Entry)object2).getKey(), i.N(((Iterable)((Map.Entry)object2).getValue())));
        }
        g.b = linkedHashMap1;
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        for(Object object3: ((Map)g.a).entrySet()) {
            v3.e e7 = ((c)((Map.Entry)object3).getKey()).e().i();
            j.e(e7, "toUnsafe(...)");
            b b0 = d.f(e7);
            j.c(b0);
            linkedHashSet0.add(b0.b().c(((f)((Map.Entry)object3).getValue())));
        }
        Set set0 = ((Map)g.a).keySet();
        g.c = set0;
        ArrayList arrayList2 = new ArrayList(k.E(set0));
        for(Object object4: set0) {
            arrayList2.add(((c)object4).f());
        }
        g.d = i.s0(arrayList2);
    }
}

