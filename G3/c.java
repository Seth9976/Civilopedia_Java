package g3;

import A3.g;
import J2.j;
import Y2.b;
import Y2.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o2.G;
import v3.f;
import w2.e;
import x2.i;
import x2.o;
import x2.r;
import x2.w;
import x2.z;

public final class c {
    public final t a;
    public final ConcurrentHashMap b;
    public static final LinkedHashMap c;

    static {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        a[] arr_a = a.values();
        for(int v = 0; v < arr_a.length; ++v) {
            a a0 = arr_a[v];
            String s = a0.i;
            if(linkedHashMap0.get(s) == null) {
                linkedHashMap0.put(s, a0);
            }
        }
        c.c = linkedHashMap0;
    }

    public c(t t0) {
        j.f(t0, "javaTypeEnhancementState");
        super();
        this.a = t0;
        this.b = new ConcurrentHashMap();
    }

    public static ArrayList a(Object object0, boolean z) {
        j.f(((b)object0), "<this>");
        Map map0 = ((b)object0).b();
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: map0.entrySet()) {
            f f0 = (f)((Map.Entry)object1).getKey();
            g g0 = (g)((Map.Entry)object1).getValue();
            List list0 = !z || j.a(f0, x.b) ? c.j(g0) : r.i;
            o.H(list0, arrayList0);
        }
        return arrayList0;
    }

    public final u b(u u0, h h0) {
        n n2;
        n3.h h3;
        boolean z2;
        e e0;
        boolean z1;
        n n1;
        B b2;
        j.f(h0, "annotations");
        t t0 = this.a;
        if(t0.b) {
            return u0;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: h0) {
            B b0 = B.i;
            B b1 = B.j;
            if(t0.b) {
                n1 = null;
            }
            else {
                v3.c c0 = c.d(object0);
                n n0 = (n)g3.b.g.get(c0);
                if(n0 != null) {
                    v3.c c1 = c.d(object0);
                    if(c1 == null || !((Map)g3.b.f).containsKey(c1)) {
                        B b3 = this.h(object0);
                        b2 = b3 == null ? t0.a.a : b3;
                    }
                    else {
                        b2 = (B)s.q.b(c1);
                    }
                    if(b2 == b0) {
                        b2 = null;
                    }
                    if(b2 != null) {
                        n3.h h1 = n3.h.a(n0.a, null, b2 == b1, 1);
                        j.f(n0.b, "qualifierApplicabilityTypes");
                        n1 = new n(h1, n0.b, n0.c);
                    }
                }
            }
            if(n1 == null) {
                if(t0.a.d) {
                    e0 = null;
                }
                else {
                    Object object1 = c.c(object0, g3.b.c);
                    if(object1 != null) {
                        for(Object object2: c.e(object0)) {
                            if(this.i(object2) == null) {
                                continue;
                            }
                            goto label_40;
                        }
                        object2 = null;
                    label_40:
                        if(object2 != null) {
                            ArrayList arrayList1 = c.a(object1, true);
                            LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                            for(Object object3: arrayList1) {
                                a a0 = (a)c.c.get(((String)object3));
                                if(a0 != null) {
                                    linkedHashSet0.add(a0);
                                }
                            }
                            if(linkedHashSet0.contains(a.m)) {
                                Set set0 = x2.g.R(a.values());
                                a a1 = a.n;
                                LinkedHashSet linkedHashSet1 = new LinkedHashSet(w.q(set0.size()));
                                boolean z = false;
                                for(Object object4: set0) {
                                    if(z || !j.a(object4, a1)) {
                                        z1 = true;
                                    }
                                    else {
                                        z = true;
                                        z1 = false;
                                    }
                                    if(z1) {
                                        linkedHashSet1.add(object4);
                                    }
                                }
                                linkedHashSet0 = z.w(linkedHashSet1, linkedHashSet0);
                            }
                            e0 = new e(object2, linkedHashSet0);
                        }
                    }
                }
                if(e0 != null) {
                    Set set1 = (Set)e0.j;
                    B b4 = this.h(object0);
                    Object object5 = e0.i;
                    if(b4 == null) {
                        B b5 = this.h(object5);
                        b4 = b5 == null ? t0.a.a : b5;
                    }
                    if(b4 != b0) {
                        j.f(object5, "$this$extractNullability");
                        n3.h h2 = this.g(object5, false);
                        if(h2 == null) {
                            Object object6 = this.i(object5);
                            if(object6 != null) {
                                B b6 = this.h(object5);
                                if(b6 == null) {
                                    b6 = t0.a.a;
                                }
                                if(b6 != b0) {
                                    z2 = false;
                                    n3.h h4 = this.g(object6, false);
                                    h3 = h4 == null ? null : n3.h.a(h4, null, b6 == b1, 1);
                                    goto label_98;
                                }
                            }
                            h3 = null;
                        }
                        else {
                            h3 = h2;
                        }
                        z2 = false;
                    label_98:
                        if(h3 == null) {
                            n2 = null;
                        }
                        else {
                            if(b4 == b1) {
                                z2 = true;
                            }
                            n2 = new n(n3.h.a(h3, null, z2, 1), set1);
                        }
                        goto label_106;
                    }
                }
                n2 = null;
            }
            else {
                n2 = n1;
            }
        label_106:
            if(n2 != null) {
                arrayList0.add(n2);
            }
        }
        if(arrayList0.isEmpty()) {
            return u0;
        }
        EnumMap enumMap0 = u0 == null ? new EnumMap(a.class) : new EnumMap(u0.a);
        boolean z3 = false;
        for(Object object7: arrayList0) {
            n n3 = (n)object7;
            for(Object object8: n3.b) {
                enumMap0.put(((a)object8), n3);
                z3 = true;
            }
        }
        return z3 ? new u(enumMap0) : u0;
    }

    public static Object c(Object object0, v3.c c0) {
        for(Object object1: c.e(object0)) {
            if(j.a(c.d(object1), c0)) {
                return object1;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public static v3.c d(Object object0) {
        j.f(((b)object0), "<this>");
        return ((b)object0).a();
    }

    public static Iterable e(Object object0) {
        j.f(((b)object0), "<this>");
        X2.e e0 = C3.e.d(((b)object0));
        if(e0 != null) {
            Iterable iterable0 = e0.l();
            if(iterable0 != null) {
                return iterable0;
            }
        }
        return r.i;
    }

    public static boolean f(Object object0, v3.c c0) {
        Iterable iterable0 = c.e(object0);
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object1: iterable0) {
                if(j.a(c.d(object1), c0)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public final n3.h g(Object object0, boolean z) {
        v3.c c0 = c.d(object0);
        if(c0 == null) {
            return null;
        }
        this.a.getClass();
        B b0 = (B)s.q.b(c0);
        b0.getClass();
        if(b0 == B.i) {
            return null;
        }
        boolean z1 = y.g.contains(c0);
        boolean z2 = true;
        n3.g g0 = n3.g.j;
        if(!z1) {
            boolean z3 = y.j.contains(c0);
            n3.g g1 = n3.g.k;
            if(z3) {
                g0 = g1;
            }
            else if(!(c0.equals(y.a) ? true : c0.equals(y.d))) {
                n3.g g2 = n3.g.i;
                if((c0.equals(y.b) ? true : c0.equals(y.e))) {
                    g0 = g2;
                }
                else if(c0.equals(y.h)) {
                    String s = (String)i.T(c.a(object0, false));
                    if(s == null) {
                        g0 = g1;
                    }
                    else {
                        switch(s.hashCode()) {
                            case 0x45BF448: {
                                if(!s.equals("MAYBE")) {
                                    return null;
                                }
                                break;
                            }
                            case 74175084: {
                                if(!s.equals("NEVER")) {
                                    return null;
                                }
                                break;
                            }
                            case 433141802: {
                                if(!s.equals("UNKNOWN")) {
                                    return null;
                                }
                                g0 = g2;
                                break;
                            }
                            case 0x7342860F: {
                                if(!s.equals("ALWAYS")) {
                                    return null;
                                }
                                g0 = g1;
                                break;
                            }
                            default: {
                                return null;
                            }
                        }
                    }
                }
                else if(!c0.equals(y.k)) {
                    if(c0.equals(y.l) || c0.equals(y.n)) {
                        g0 = g1;
                    }
                    else if(!c0.equals(y.m)) {
                        return null;
                    }
                }
            }
        }
        if(b0 != B.j && !z) {
            z2 = false;
        }
        return new n3.h(g0, z2);
    }

    public final B h(Object object0) {
        t t0 = this.a;
        v3.c c0 = c.d(object0);
        B b0 = (B)t0.a.c.get(c0);
        if(b0 != null) {
            return b0;
        }
        Object object1 = c.c(object0, g3.b.d);
        if(object1 != null) {
            String s = (String)i.T(c.a(object1, false));
            if(s != null) {
                B b1 = t0.a.b;
                if(b1 == null) {
                    switch(s.hashCode()) {
                        case 0x809EF1D2: {
                            return s.equals("IGNORE") ? B.i : null;
                        }
                        case 0x926852C9: {
                            return s.equals("STRICT") ? B.k : null;
                        }
                        case 2656902: {
                            return s.equals("WARN") ? B.j : null;
                        }
                        default: {
                            return null;
                        }
                    }
                }
                return b1;
            }
        }
        return null;
    }

    public final Object i(Object object0) {
        j.f(object0, "annotation");
        if(this.a.a.d) {
            return null;
        }
        v3.c c0 = c.d(object0);
        if(!i.M(g3.b.h, c0) && !c.f(object0, g3.b.b)) {
            if(!c.f(object0, g3.b.a)) {
                return null;
            }
            ConcurrentHashMap concurrentHashMap0 = this.b;
            X2.e e0 = C3.e.d(((b)object0));
            j.c(e0);
            Object object1 = concurrentHashMap0.get(e0);
            if(object1 == null) {
                object1 = null;
                for(Object object2: c.e(object0)) {
                    Object object3 = this.i(object2);
                    if(object3 != null) {
                        object1 = object3;
                        break;
                    }
                }
                if(object1 == null) {
                    return null;
                }
                Object object4 = concurrentHashMap0.putIfAbsent(e0, object1);
                return object4 == null ? object1 : object4;
            }
            return object1;
        }
        return object0;
    }

    public static List j(g g0) {
        if(g0 instanceof A3.b) {
            List list0 = new ArrayList();
            for(Object object0: ((Iterable)((A3.b)g0).a)) {
                o.H(c.j(((g)object0)), list0);
            }
            return list0;
        }
        return g0 instanceof A3.j ? G.p(((A3.j)g0).c.c()) : r.i;
    }
}

