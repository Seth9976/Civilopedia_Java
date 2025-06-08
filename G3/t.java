package g3;

import J2.j;
import w2.b;

public final class t {
    public final v a;
    public final boolean b;
    public static final t c;

    static {
        j.f(b.m, "configuredKotlinVersion");
        B b0 = q.d.b == null || q.d.b.l - b.m.l > 0 ? q.d.a : q.d.c;
        j.f(b0, "globalReportLevel");
        t.c = new t(new v(b0, (b0 == B.j ? null : b0)));
    }

    public t(v v0) {
        this.a = v0;
        this.b = v0.d || s.q.b(q.a) == B.i;
    }

    @Override
    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.a + ", getReportLevelForAnnotation=" + s.q + ')';
    }
}

