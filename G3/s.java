package g3;

import I2.b;
import J2.h;
import J2.j;
import O2.e;
import v3.c;

public final class s extends h implements b {
    public static final s q;

    static {
        s.q = new s(1);  // 初始化器: LJ2/h;-><init>(I)V
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        j.f(((c)object0), "p0");
        A.g.getClass();
        w2.b b0 = new w2.b(1, 7, 20);
        j.f(z.b, "configuredReportLevels");
        B b1 = (B)((L3.j)z.b.k).b(((c)object0));
        if(b1 == null) {
            q.c.getClass();
            r r0 = (r)((L3.j)q.c.k).b(((c)object0));
            if(r0 == null) {
                return B.i;
            }
            return r0.b == null || r0.b.l - b0.l > 0 ? r0.a : r0.c;
        }
        return b1;
    }

    @Override  // J2.c
    public final e g() {
        return J2.r.a.c("compiler.common.jvm", q.class);
    }

    @Override  // J2.c, O2.b
    public final String getName() {
        return "getDefaultReportLevelForAnnotation";
    }

    @Override  // J2.c
    public final String i() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }
}

