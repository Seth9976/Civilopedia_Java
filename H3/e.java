package h3;

import A3.b;
import A3.j;
import Y2.m;
import Y2.n;
import d3.t;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import v3.f;
import x2.k;
import x2.o;
import x2.w;

public abstract class e {
    public static final Object a;
    public static final Object b;

    static {
        e.a = w.s(new w2.e[]{new w2.e("PACKAGE", EnumSet.noneOf(n.class)), new w2.e("TYPE", EnumSet.of(n.w, n.I)), new w2.e("ANNOTATION_TYPE", EnumSet.of(n.x)), new w2.e("TYPE_PARAMETER", EnumSet.of(n.y)), new w2.e("FIELD", EnumSet.of(n.A)), new w2.e("LOCAL_VARIABLE", EnumSet.of(n.B)), new w2.e("PARAMETER", EnumSet.of(n.C)), new w2.e("CONSTRUCTOR", EnumSet.of(n.D)), new w2.e("METHOD", EnumSet.of(n.E, n.F, n.G)), new w2.e("TYPE_USE", EnumSet.of(n.H))});
        e.b = w.s(new w2.e[]{new w2.e("RUNTIME", m.i), new w2.e("CLASS", m.j), new w2.e("SOURCE", m.k)});
    }

    public static b a(List list0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            if(object0 instanceof t) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            String s = f.e(((t)object1).b.name()).b();
            EnumSet enumSet0 = (EnumSet)((Map)e.a).get(s);
            if(enumSet0 == null) {
                enumSet0 = x2.t.i;
            }
            o.H(enumSet0, arrayList1);
        }
        ArrayList arrayList2 = new ArrayList(k.E(arrayList1));
        for(Object object2: arrayList1) {
            arrayList2.add(new j(v3.b.j(U2.m.u), f.e(((n)object2).name())));
        }
        return new b(arrayList2, d.i);
    }
}

