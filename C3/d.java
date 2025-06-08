package c3;

import I3.l;
import J2.j;
import X2.e;
import d3.s;
import java.util.ArrayList;
import m3.c;

public final class d implements l {
    public static final d b;
    public static final d c;

    static {
        d.b = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        d.c = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public f a(c c0) {
        j.f(c0, "javaElement");
        return new f(((s)c0));
    }

    @Override  // I3.l
    public void b(X2.c c0) {
        j.f(c0, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + c0);
    }

    @Override  // I3.l
    public void c(e e0, ArrayList arrayList0) {
        j.f(e0, "descriptor");
        throw new IllegalStateException("Incomplete hierarchy for class " + e0.getName() + ", unresolved classes " + arrayList0);
    }
}

