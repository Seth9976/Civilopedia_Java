package n3;

import J2.j;
import X3.b;
import X3.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import q2.a;
import w2.e;
import x2.k;
import x2.u;
import x2.w;

public final class n {
    public final String a;
    public final ArrayList b;
    public e c;

    public n(g1.n n0, String s) {
        this.a = s;
        this.b = new ArrayList();
        this.c = new e("V", null);
    }

    public final void a(String s, d[] arr_d) {
        p p0;
        j.f(s, "type");
        ArrayList arrayList0 = this.b;
        if(arr_d.length == 0) {
            p0 = null;
        }
        else {
            o o0 = new o(new a(arr_d, 1));
            int v = w.q(k.E(o0));
            if(v < 16) {
                v = 16;
            }
            LinkedHashMap linkedHashMap0 = new LinkedHashMap(v);
            Iterator iterator0 = o0.iterator();
            while(((b)iterator0).j.hasNext()) {
                u u0 = (u)((b)iterator0).next();
                linkedHashMap0.put(u0.a, ((d)u0.b));
            }
            p0 = new p(linkedHashMap0);
        }
        arrayList0.add(new e(s, p0));
    }

    public final void b(D3.d d0) {
        j.f(d0, "type");
        String s = d0.c();
        j.e(s, "getDesc(...)");
        this.c = new e(s, null);
    }

    public final void c(String s, d[] arr_d) {
        j.f(s, "type");
        o o0 = new o(new a(arr_d, 1));
        int v = w.q(k.E(o0));
        if(v < 16) {
            v = 16;
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(v);
        Iterator iterator0 = o0.iterator();
        while(((b)iterator0).j.hasNext()) {
            u u0 = (u)((b)iterator0).next();
            linkedHashMap0.put(u0.a, ((d)u0.b));
        }
        this.c = new e(s, new p(linkedHashMap0));
    }
}

