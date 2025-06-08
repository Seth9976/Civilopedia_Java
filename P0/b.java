package p0;

import H1.c;
import H1.d;

public final class b implements c {
    public static final b a;
    public static final H1.b b;
    public static final H1.b c;
    public static final H1.b d;
    public static final H1.b e;
    public static final H1.b f;
    public static final H1.b g;
    public static final H1.b h;
    public static final H1.b i;
    public static final H1.b j;
    public static final H1.b k;
    public static final H1.b l;
    public static final H1.b m;

    static {
        b.a = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
        b.b = H1.b.a("sdkVersion");
        b.c = H1.b.a("model");
        b.d = H1.b.a("hardware");
        b.e = H1.b.a("device");
        b.f = H1.b.a("product");
        b.g = H1.b.a("osBuild");
        b.h = H1.b.a("manufacturer");
        b.i = H1.b.a("fingerprint");
        b.j = H1.b.a("locale");
        b.k = H1.b.a("country");
        b.l = H1.b.a("mccMnc");
        b.m = H1.b.a("applicationBuild");
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((d)object1).f(b.b, ((h)(((a)object0))).a);
        ((d)object1).f(b.c, ((h)(((a)object0))).b);
        ((d)object1).f(b.d, ((h)(((a)object0))).c);
        ((d)object1).f(b.e, ((h)(((a)object0))).d);
        ((d)object1).f(b.f, ((h)(((a)object0))).e);
        ((d)object1).f(b.g, ((h)(((a)object0))).f);
        ((d)object1).f(b.h, ((h)(((a)object0))).g);
        ((d)object1).f(b.i, ((h)(((a)object0))).h);
        ((d)object1).f(b.j, ((h)(((a)object0))).i);
        ((d)object1).f(b.k, ((h)(((a)object0))).j);
        ((d)object1).f(b.l, ((h)(((a)object0))).k);
        ((d)object1).f(b.m, ((h)(((a)object0))).l);
    }
}

