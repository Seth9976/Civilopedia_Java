package F3;

import I2.a;
import L3.i;
import L3.m;
import L3.p;
import X2.h;
import f3.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import v3.f;
import y3.l;

public final class j implements n {
    public final int b;
    public final Object c;

    public j(n n0) {
        this.b = 1;
        super();
        this.c = n0;
    }

    public j(p p0, a a0) {
        this.b = 0;
        J2.j.f(p0, "storageManager");
        super();
        this.c = new i(((m)p0), new A3.m(a0, 2));  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
    }

    @Override  // F3.n
    public Collection a(f f0, b b0) {
        if(this.b != 1) {
            return this.k(f0, b0);
        }
        J2.j.f(f0, "name");
        return l.o(this.k(f0, b0), k.m);
    }

    @Override  // F3.n
    public Collection b(f f0, b b0) {
        if(this.b != 1) {
            return this.j(f0, b0);
        }
        J2.j.f(f0, "name");
        return l.o(this.j(f0, b0), k.l);
    }

    @Override  // F3.n
    public final Set c() {
        return this.l().c();
    }

    @Override  // F3.n
    public final Set d() {
        return this.l().d();
    }

    @Override  // F3.n
    public final Set e() {
        return this.l().e();
    }

    @Override  // F3.p
    public final h f(f f0, b b0) {
        J2.j.f(f0, "name");
        J2.j.f(b0, "location");
        return this.l().f(f0, b0);
    }

    @Override  // F3.p
    public Collection g(F3.f f0, I2.b b0) {
        if(this.b != 1) {
            return this.i(f0, b0);
        }
        J2.j.f(f0, "kindFilter");
        Iterable iterable0 = this.i(f0, b0);
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: iterable0) {
            if(((X2.k)object0) instanceof X2.b) {
                arrayList0.add(object0);
            }
            else {
                arrayList1.add(object0);
            }
        }
        return x2.i.e0(arrayList1, l.o(arrayList0, k.k));
    }

    public final n h() {
        if(this.l() instanceof j) {
            n n0 = this.l();
            J2.j.d(n0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
            return ((j)n0).h();
        }
        return this.l();
    }

    public final Collection i(F3.f f0, I2.b b0) {
        J2.j.f(f0, "kindFilter");
        return this.l().g(f0, b0);
    }

    public final Collection j(f f0, b b0) {
        J2.j.f(f0, "name");
        return this.l().b(f0, b0);
    }

    public final Collection k(f f0, b b0) {
        J2.j.f(f0, "name");
        return this.l().a(f0, b0);
    }

    public final n l() {
        return this.b == 0 ? ((n)((i)this.c).invoke()) : ((n)this.c);
    }
}

