package j3;

import B.f;
import I3.A;
import J2.j;
import L3.e;
import L3.g;
import V3.k;
import X2.I;
import d3.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import k3.p;
import v3.c;
import x2.r;

public final class d implements I {
    public final f a;
    public final e b;

    public d(a a0) {
        w2.a a1 = new w2.a();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.a = new f(a0, b.j, a1);
        a0.a.getClass();
        ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap(3, 1.0f, 2);
        L3.f f0 = new L3.f();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.b = new e(a0.a, concurrentHashMap0, f0, 0);
    }

    @Override  // X2.I
    public final void a(c c0, ArrayList arrayList0) {
        j.f(c0, "fqName");
        k.a(arrayList0, this.c(c0));
    }

    @Override  // X2.I
    public final boolean b(c c0) {
        j.f(c0, "fqName");
        ((a)this.a.j).b.getClass();
        return false;
    }

    public final p c(c c0) {
        ((a)this.a.j).b.getClass();
        j.f(c0, "fqName");
        A a0 = new A(16, this, new y(c0));
        this.b.getClass();
        g g0 = new g(c0, a0);
        Object object0 = this.b.b(g0);
        if(object0 != null) {
            return (p)object0;
        }
        e.a(3);
        throw null;
    }

    @Override  // X2.I
    public final Collection h(c c0, I2.b b0) {
        j.f(c0, "fqName");
        List list0 = (List)this.c(c0).s.invoke();
        return list0 == null ? r.i : list0;
    }

    @Override
    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((a)this.a.j).o;
    }
}

