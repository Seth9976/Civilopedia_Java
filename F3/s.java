package F3;

import A3.m;
import J2.j;
import M3.Q;
import M3.U;
import X2.k;
import X2.l;
import f3.b;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import o2.G;
import v3.f;
import w2.h;

public final class s implements n {
    public final n b;
    public final U c;
    public HashMap d;
    public final h e;

    public s(n n0, U u0) {
        j.f(n0, "workerScope");
        j.f(u0, "givenSubstitutor");
        super();
        this.b = n0;
        Q q0 = u0.f();
        j.e(q0, "getSubstitution(...)");
        this.c = new U(G.w(q0));
        this.e = new h(new m(this, 3));
    }

    @Override  // F3.n
    public final Collection a(f f0, b b0) {
        j.f(f0, "name");
        return this.i(this.b.a(f0, b0));
    }

    @Override  // F3.n
    public final Collection b(f f0, b b0) {
        j.f(f0, "name");
        return this.i(this.b.b(f0, b0));
    }

    @Override  // F3.n
    public final Set c() {
        return this.b.c();
    }

    @Override  // F3.n
    public final Set d() {
        return this.b.d();
    }

    @Override  // F3.n
    public final Set e() {
        return this.b.e();
    }

    @Override  // F3.p
    public final X2.h f(f f0, b b0) {
        j.f(f0, "name");
        j.f(b0, "location");
        X2.h h0 = this.b.f(f0, b0);
        return h0 == null ? null : ((X2.h)this.h(h0));
    }

    @Override  // F3.p
    public final Collection g(F3.f f0, I2.b b0) {
        j.f(f0, "kindFilter");
        return (Collection)this.e.getValue();
    }

    public final k h(k k0) {
        U u0 = this.c;
        if(u0.a.e()) {
            return k0;
        }
        if(this.d == null) {
            this.d = new HashMap();
        }
        HashMap hashMap0 = this.d;
        j.c(hashMap0);
        l l0 = hashMap0.get(k0);
        if(l0 == null) {
            if(!(k0 instanceof X2.Q)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + k0).toString());
            }
            l0 = ((X2.Q)k0).b(u0);
            if(l0 == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + k0 + " substitution fails");
            }
            hashMap0.put(k0, l0);
            return l0;
        }
        return l0;
    }

    public final Collection i(Collection collection0) {
        if(this.c.a.e()) {
            return collection0;
        }
        if(collection0.isEmpty()) {
            return collection0;
        }
        int v = collection0.size();
        Collection collection1 = new LinkedHashSet((v < 3 ? 3 : v / 3 + v + 1));
        for(Object object0: collection0) {
            ((AbstractCollection)collection1).add(this.h(((k)object0)));
        }
        return collection1;
    }
}

