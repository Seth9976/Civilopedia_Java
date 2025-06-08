package W2;

import A.f;
import I2.b;
import J2.j;
import J2.l;
import X2.c;
import X2.k;
import Y2.g;
import Y2.i;
import java.util.List;
import o2.G;
import v3.e;
import y3.d;

public final class m extends l implements b {
    public final int i;
    public final o j;

    public m(o o0, int v) {
        this.i = v;
        this.j = o0;
        super(1);
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        boolean z = false;
        o o0 = this.j;
        if(this.i != 0) {
            if(((c)object0).j() == 1) {
                o0.getClass();
                k k0 = ((c)object0).p();
                j.d(k0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                e e0 = d.g(((X2.e)k0));
                if(W2.d.j.containsKey(e0)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        j.f(((w2.e)object0), "<name for destructuring parameter 0>");
        String s = q.e.b(((String)((w2.e)object0).j), "()");
        List list0 = G.p(Y2.e.a(o0.a.l, f.k("\'", ((String)((w2.e)object0).i), "()\' member of List is redundant in Kotlin and might be removed soon. Please use \'", ((String)((w2.e)object0).j), "()\' stdlib extension instead"), s, 4));
        return list0.isEmpty() ? g.a : new i(list0, 0);
    }
}

