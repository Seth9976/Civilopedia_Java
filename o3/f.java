package o3;

import D3.c;
import J2.j;
import K3.m;
import K3.n;
import c3.b;
import d3.d;
import o2.I;
import p3.a;
import q3.C;
import t3.k;
import u3.g;

public final class f implements n {
    public final c i;
    public final c j;
    public final b k;

    public f(b b0, C c0, g g0, m m0) {
        j.f(b0, "kotlinClass");
        j.f(c0, "packageProto");
        j.f(g0, "nameResolver");
        c c1 = c.b(d.a(b0.a));
        c c2 = null;
        String s = ((a)b0.b.d) == a.q ? b0.b.b : null;
        if(s != null && s.length() > 0) {
            c2 = c.d(s);
        }
        super();
        this.i = c1;
        this.j = c2;
        this.k = b0;
        j.e(k.m, "packageModuleName");
        Integer integer0 = (Integer)I.k(c0, k.m);
        if(integer0 != null) {
            g0.getString(integer0.intValue());
        }
    }

    public final v3.b a() {
        v3.c c1;
        c c0 = this.i;
        String s = c0.a;
        int v = s.lastIndexOf("/");
        if(v == -1) {
            c1 = v3.c.c;
            if(c1 == null) {
                c.a(7);
                throw null;
            }
        }
        else {
            c1 = new v3.c(s.substring(0, v).replace('/', '.'));
        }
        String s1 = c0.e();
        j.e(s1, "getInternalName(...)");
        return new v3.b(c1, v3.f.e(Y3.n.J0(s1, '/')));
    }

    @Override
    public final String toString() {
        return f.class.getSimpleName() + ": " + this.i;
    }
}

