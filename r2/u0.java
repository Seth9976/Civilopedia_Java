package R2;

import J2.j;
import M3.w;
import X2.M;
import X2.c;
import X2.u;
import a3.m;
import a3.v;
import java.util.List;
import v3.f;
import x2.i;
import x3.g;

public abstract class u0 {
    public static final g a;

    static {
        u0.a = g.c;
    }

    public static void a(c c0, StringBuilder stringBuilder0) {
        v v0 = x0.g(c0);
        v v1 = c0.J();
        if(v0 != null) {
            stringBuilder0.append(u0.d(v0.getType()));
            stringBuilder0.append(".");
        }
        boolean z = v0 != null && v1 != null;
        if(z) {
            stringBuilder0.append("(");
        }
        if(v1 != null) {
            stringBuilder0.append(u0.d(v1.getType()));
            stringBuilder0.append(".");
        }
        if(z) {
            stringBuilder0.append(")");
        }
    }

    public static String b(u u0) {
        j.f(u0, "descriptor");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("fun ");
        u0.a(u0, stringBuilder0);
        f f0 = ((m)u0).getName();
        j.e(f0, "getName(...)");
        stringBuilder0.append(u0.a.L(f0, true));
        List list0 = u0.z0();
        j.e(list0, "getValueParameters(...)");
        i.X(list0, stringBuilder0, "(", ")", b.p, 0x30);
        stringBuilder0.append(": ");
        w w0 = u0.r();
        j.c(w0);
        stringBuilder0.append(u0.d(w0));
        String s = stringBuilder0.toString();
        j.e(s, "toString(...)");
        return s;
    }

    public static String c(M m0) {
        j.f(m0, "descriptor");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append((m0.G() ? "var " : "val "));
        u0.a(m0, stringBuilder0);
        f f0 = m0.getName();
        j.e(f0, "getName(...)");
        stringBuilder0.append(u0.a.L(f0, true));
        stringBuilder0.append(": ");
        w w0 = m0.getType();
        j.e(w0, "getType(...)");
        stringBuilder0.append(u0.d(w0));
        String s = stringBuilder0.toString();
        j.e(s, "toString(...)");
        return s;
    }

    public static String d(w w0) {
        j.f(w0, "type");
        return u0.a.V(w0);
    }
}

