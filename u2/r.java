package U2;

import J2.j;
import M3.X;
import X2.F;
import X2.h;
import X2.k;
import a3.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import v3.f;
import w2.e;
import x2.i;
import x2.w;

public abstract class r {
    public static final Set a;
    public static final HashMap b;
    public static final HashMap c;
    public static final LinkedHashSet d;

    static {
        q[] arr_q = q.values();
        ArrayList arrayList0 = new ArrayList(arr_q.length);
        for(int v1 = 0; v1 < arr_q.length; ++v1) {
            arrayList0.add(arr_q[v1].j);
        }
        r.a = i.s0(arrayList0);
        p[] arr_p = p.values();
        ArrayList arrayList1 = new ArrayList(arr_p.length);
        for(int v2 = 0; v2 < arr_p.length; ++v2) {
            arrayList1.add(arr_p[v2].i);
        }
        i.s0(arrayList1);
        r.b = new HashMap();
        r.c = new HashMap();
        f f0 = f.e("ubyteArrayOf");
        e e0 = new e(p.j, f0);
        f f1 = f.e("ushortArrayOf");
        e e1 = new e(p.k, f1);
        f f2 = f.e("uintArrayOf");
        e e2 = new e(p.l, f2);
        f f3 = f.e("ulongArrayOf");
        w.o(new e[]{e0, e1, e2, new e(p.m, f3)});
        q[] arr_q1 = q.values();
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        for(int v3 = 0; v3 < arr_q1.length; ++v3) {
            linkedHashSet0.add(arr_q1[v3].k.i());
        }
        r.d = linkedHashSet0;
        q[] arr_q2 = q.values();
        for(int v = 0; v < arr_q2.length; ++v) {
            q q0 = arr_q2[v];
            r.b.put(q0.k, q0.i);
            r.c.put(q0.i, q0.k);
        }
    }

    public static final boolean a(M3.w w0) {
        if(X.l(w0)) {
            return false;
        }
        h h0 = w0.H0().q();
        if(h0 == null) {
            return false;
        }
        k k0 = h0.p();
        if(k0 instanceof F && j.a(((C)(((F)k0))).m, n.l)) {
            f f0 = h0.getName();
            return r.a.contains(f0);
        }
        return false;
    }
}

