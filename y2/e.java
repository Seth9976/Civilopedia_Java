package Y2;

import A3.a;
import A3.b;
import A3.x;
import U2.h;
import U2.m;
import java.util.Map;
import v3.f;
import x2.r;
import x2.w;

public abstract class e {
    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;

    static {
        e.a = f.e("message");
        e.b = f.e("replaceWith");
        e.c = f.e("level");
        e.d = f.e("expression");
        e.e = f.e("imports");
    }

    public static j a(h h0, String s, String s1, int v) {
        if((v & 2) != 0) {
            s1 = "";
        }
        J2.j.f(h0, "<this>");
        J2.j.f(s, "message");
        J2.j.f(s1, "replaceWith");
        x x0 = new x(s1);  // 初始化器: LA3/g;-><init>(Ljava/lang/Object;)V
        w2.e e0 = new w2.e(e.d, x0);
        A3.h h1 = new A3.h(h0, 10);
        b b0 = new b(r.i, h1);
        Map map0 = w.s(new w2.e[]{e0, new w2.e(e.e, b0)});
        j j0 = new j(h0, m.o, map0);
        x x1 = new x(s);  // 初始化器: LA3/g;-><init>(Ljava/lang/Object;)V
        w2.e e1 = new w2.e(e.a, x1);
        a a0 = new a(j0);  // 初始化器: LA3/g;-><init>(Ljava/lang/Object;)V
        w2.e e2 = new w2.e(e.b, a0);
        A3.j j1 = new A3.j(v3.b.j(m.n), f.e("WARNING"));
        Map map1 = w.s(new w2.e[]{e1, e2, new w2.e(e.c, j1)});
        return new j(h0, m.m, map1);
    }
}

