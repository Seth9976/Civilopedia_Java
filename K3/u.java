package k3;

import B.f;
import I3.A;
import L3.h;
import L3.j;
import L3.m;
import X2.e;
import X2.k;
import d3.o;
import d3.y;
import f3.b;
import j3.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import x2.r;
import x2.t;

public final class u extends C {
    public final y n;
    public final p o;
    public final h p;
    public final j q;

    public u(f f0, y y0, p p0) {
        J2.j.f(p0, "ownerDescriptor");
        super(f0, null);
        this.n = y0;
        this.o = p0;
        m m0 = ((a)f0.j).a;
        A a0 = new A(17, f0, this);
        m0.getClass();
        this.p = new h(m0, a0);
        this.q = m0.c(new K3.j(4, this, f0));
    }

    @Override  // k3.y
    public final Collection a(v3.f f0, b b0) {
        J2.j.f(f0, "name");
        return r.i;
    }

    @Override  // F3.o
    public final X2.h f(v3.f f0, b b0) {
        J2.j.f(f0, "name");
        J2.j.f(b0, "location");
        return this.v(f0, null);
    }

    @Override  // k3.y
    public final Collection g(F3.f f0, I2.b b0) {
        J2.j.f(f0, "kindFilter");
        if(!f0.a(F3.f.l | F3.f.e)) {
            return r.i;
        }
        Iterable iterable0 = (Iterable)this.d.invoke();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            k k0 = (k)object0;
            if(k0 instanceof e) {
                v3.f f1 = ((e)k0).getName();
                J2.j.e(f1, "getName(...)");
                if(((Boolean)b0.b(f1)).booleanValue()) {
                    arrayList0.add(object0);
                }
            }
        }
        return arrayList0;
    }

    @Override  // k3.y
    public final Set h(F3.f f0, F3.k k0) {
        J2.j.f(f0, "kindFilter");
        if(!f0.a(F3.f.e)) {
            return t.i;
        }
        Set set0 = (Set)this.p.invoke();
        if(set0 != null) {
            Set set1 = new HashSet();
            for(Object object0: set0) {
                ((HashSet)set1).add(v3.f.e(((String)object0)));
            }
            return set1;
        }
        this.n.getClass();
        return new LinkedHashSet();
    }

    @Override  // k3.y
    public final Set i(F3.f f0, F3.k k0) {
        J2.j.f(f0, "kindFilter");
        return t.i;
    }

    @Override  // k3.y
    public final c k() {
        return k3.b.a;
    }

    @Override  // k3.y
    public final void m(LinkedHashSet linkedHashSet0, v3.f f0) {
        J2.j.f(f0, "name");
    }

    @Override  // k3.y
    public final Set o(F3.f f0) {
        J2.j.f(f0, "kindFilter");
        return t.i;
    }

    @Override  // k3.y
    public final k q() {
        return this.o;
    }

    public final e v(v3.f f0, o o0) {
        J2.j.f(f0, "name");
        String s = f0.b();
        J2.j.e(s, "asString(...)");
        if(s.length() > 0 && !f0.j) {
            Set set0 = (Set)this.p.invoke();
            if(o0 == null && set0 != null && !set0.contains(f0.b())) {
                return null;
            }
            q q0 = new q(f0, o0);
            return (e)this.q.b(q0);
        }
        return null;
    }
}

