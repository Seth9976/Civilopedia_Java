package Y2;

import A3.m;
import U2.h;
import X2.O;
import java.util.Map;
import v3.c;
import w2.d;
import x2.w;

public final class j implements b {
    public final h a;
    public final c b;
    public final Map c;
    public final Object d;

    public j(h h0, c c0, Map map0) {
        J2.j.f(h0, "builtIns");
        J2.j.f(c0, "fqName");
        super();
        this.a = h0;
        this.b = c0;
        this.c = map0;
        m m0 = new m(this, 22);
        this.d = w.p(d.i, m0);
    }

    @Override  // Y2.b
    public final c a() {
        return this.b;
    }

    @Override  // Y2.b
    public final Map b() {
        return this.c;
    }

    @Override  // Y2.b
    public final M3.w getType() {
        Object object0 = ((w2.c)this.d).getValue();
        J2.j.e(object0, "getValue(...)");
        return (M3.w)object0;
    }

    @Override  // Y2.b
    public final O q() {
        return O.b;
    }
}

