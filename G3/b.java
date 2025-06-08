package g3;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n3.g;
import n3.h;
import o2.G;
import v3.c;
import w2.e;
import x2.j;
import x2.w;
import x2.z;

public abstract class b {
    public static final c a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final List e;
    public static final Object f;
    public static final LinkedHashMap g;
    public static final Set h;

    static {
        b.a = new c("javax.annotation.meta.TypeQualifierNickname");
        b.b = new c("javax.annotation.meta.TypeQualifier");
        b.c = new c("javax.annotation.meta.TypeQualifierDefault");
        b.d = new c("kotlin.annotations.jvm.UnderMigration");
        List list0 = j.z(new a[]{a.l, a.j, a.k, a.n, a.m});
        b.e = list0;
        n n0 = new n(new h(g.k), list0, false);
        e e0 = new e(y.c, n0);
        n n1 = new n(new h(g.k), list0, false);
        Map map0 = w.s(new e[]{e0, new e(y.f, n1)});
        b.f = map0;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(w.s(new e[]{new e(new c("javax.annotation.ParametersAreNullableByDefault"), new n(new h(g.j), G.p(a.k))), new e(new c("javax.annotation.ParametersAreNonnullByDefault"), new n(new h(g.k), G.p(a.k)))}));
        linkedHashMap0.putAll(map0);
        b.g = linkedHashMap0;
        b.h = z.y(new c[]{y.h, y.i});
    }
}

