package N3;

import A3.o;
import I2.c;
import J2.j;
import M3.A;
import M3.H;
import M3.K;
import M3.Z;
import M3.d;
import M3.v;
import M3.w;
import O3.l;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import x2.i;
import x2.k;

public final class t {
    public static final t a;

    static {
        t.a = new t();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static ArrayList a(AbstractCollection abstractCollection0, c c0) {
        ArrayList arrayList0 = new ArrayList(abstractCollection0);
        Iterator iterator0 = arrayList0.iterator();
        j.e(iterator0, "iterator(...)");
    label_3:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            A a0 = (A)object0;
            if(!arrayList0.isEmpty()) {
                Iterator iterator1 = arrayList0.iterator();
                while(true) {
                    if(!iterator1.hasNext()) {
                        continue label_3;
                    }
                    Object object1 = iterator1.next();
                    A a1 = (A)object1;
                    if(a1 != a0) {
                        j.c(a1);
                        j.c(a0);
                        if(((Boolean)c0.a(a1, a0)).booleanValue()) {
                            break;
                        }
                    }
                }
                iterator0.remove();
            }
        }
        return arrayList0;
    }

    public final A b(ArrayList arrayList0) {
        A a5;
        arrayList0.size();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            A a0 = (A)object0;
            if(a0.H0() instanceof v) {
                Collection collection0 = a0.H0().r();
                j.e(collection0, "getSupertypes(...)");
                ArrayList arrayList2 = new ArrayList(k.E(collection0));
                for(Object object1: collection0) {
                    j.c(((w)object1));
                    A a1 = M3.c.y(((w)object1));
                    if(a0.I0()) {
                        a1 = a1.O0(true);
                    }
                    arrayList2.add(a1);
                }
                arrayList1.addAll(arrayList2);
            }
            else {
                arrayList1.add(a0);
            }
        }
        r r0 = r.i;
        for(Object object2: arrayList1) {
            r0 = r0.a(((Z)object2));
        }
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        for(Object object3: arrayList1) {
            A a2 = (A)object3;
            if(r0 == r.l) {
                if(a2 instanceof h) {
                    j.f(((h)a2), "<this>");
                    a2 = new h(((h)a2).j, ((h)a2).k, ((h)a2).l, ((h)a2).m, ((h)a2).n, true);
                }
                j.f(a2, "<this>");
                A a3 = d.p(a2, false);
                if(a3 == null) {
                    A a4 = M3.c.m(a2);
                    a2 = a4 == null ? a2.O0(false) : a4;
                }
                else {
                    a2 = a3;
                }
            }
            linkedHashSet0.add(a2);
        }
        ArrayList arrayList3 = new ArrayList(k.E(arrayList0));
        for(Object object4: arrayList0) {
            arrayList3.add(((A)object4).G0());
        }
        Iterator iterator5 = arrayList3.iterator();
        if(!iterator5.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can\'t be reduced.");
        }
        H h0 = iterator5.next();
        while(true) {
            a5 = null;
            if(!iterator5.hasNext()) {
                break;
            }
            Object object5 = iterator5.next();
            H h1 = (H)object5;
            h0.getClass();
            j.f(h1, "other");
            if(!h0.isEmpty() || !h1.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                Collection collection1 = ((ConcurrentHashMap)H.j.j).values();
                j.e(collection1, "<get-values>(...)");
                for(Object object6: collection1) {
                    int v = ((Number)object6).intValue();
                    M3.h h2 = (M3.h)h0.i.get(v);
                    M3.h h3 = (M3.h)h1.i.get(v);
                    if(h2 != null) {
                        if(!j.a(h3, h2)) {
                            h2 = null;
                        }
                        h3 = h2;
                    }
                    else if(h3 == null || !j.a(null, h3)) {
                        h3 = null;
                    }
                    V3.k.a(arrayList4, h3);
                }
                h0 = B.c.p(arrayList4);
            }
        }
        if(linkedHashSet0.size() == 1) {
            return ((A)i.h0(linkedHashSet0)).P0(h0);
        }
        ArrayList arrayList5 = t.a(linkedHashSet0, new s(2, 0, this));
        arrayList5.isEmpty();
        if(!arrayList5.isEmpty()) {
            Iterator iterator7 = arrayList5.iterator();
            if(!iterator7.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can\'t be reduced.");
            }
            A a6 = iterator7.next();
            while(iterator7.hasNext()) {
                Object object7 = iterator7.next();
                A a7 = (A)object7;
                if(a6 != null && a7 != null) {
                    K k0 = a6.H0();
                    K k1 = a7.H0();
                    boolean z = k0 instanceof o;
                    if(z && k1 instanceof o) {
                        o o0 = new o(i.t0(((o)k0).a, ((o)k1).a));
                        H.j.getClass();
                        j.f(H.k, "attributes");
                        a6 = d.s(l.a(O3.h.k, true, new String[]{"unknown integer literal type"}), H.k, o0, x2.r.i, false);
                    }
                    else if(z) {
                        if(!((o)k0).a.contains(a7)) {
                            a7 = null;
                        }
                        a6 = a7;
                    }
                    else if(!(k1 instanceof o) || !((o)k1).a.contains(a6)) {
                        a6 = null;
                    }
                }
                else {
                    a6 = null;
                }
            }
            a5 = a6;
        }
        if(a5 != null) {
            return a5.P0(h0);
        }
        N3.k.b.getClass();
        ArrayList arrayList6 = t.a(arrayList5, new s(2, 1, N3.j.b));
        arrayList6.isEmpty();
        return arrayList6.size() >= 2 ? new v(linkedHashSet0).b().P0(h0) : ((A)i.h0(arrayList6)).P0(h0);
    }
}

