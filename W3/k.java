package w3;

import J2.j;
import J2.r;
import M3.A;
import M3.F;
import M3.K;
import M3.N;
import M3.Z;
import M3.a0;
import M3.m;
import M3.q;
import N3.b;
import N3.c;
import N3.g;
import N3.i;
import N3.t;
import P3.d;
import P3.e;
import P3.h;
import X2.T;
import android.support.v4.media.session.a;
import android.util.Log;
import com.google.android.gms.internal.ads.aa;
import com.google.android.gms.internal.ads.w;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import i1.y;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import x1.f;

public final class k implements b, SuccessContinuation, s0.b {
    public final int i;
    public final Object j;
    public Object k;

    public k() {
        this.i = 6;
        super();
        this.j = new AtomicInteger();
        this.k = new AtomicInteger();
    }

    public k(int v, Object object0, Object object1) {
        this.i = v;
        this.j = object0;
        this.k = object1;
        super();
    }

    public k(Object object0, Object object1, int v, boolean z) {
        this.i = v;
        this.k = object0;
        this.j = object1;
        super();
    }

    public k(HashMap hashMap0, c c0) {
        this.i = 7;
        j.f(c0, "equalityAxioms");
        super();
        this.j = hashMap0;
        this.k = c0;
    }

    public k(l l0) {
        this.i = 0;
        super();
        l0.i.getClass();
        Iterator iterator0 = ((aa)l0.i.a.entrySet()).iterator();
        this.j = iterator0;
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            this.k = (Map.Entry)object0;
        }
    }

    public k(f f0, ExecutorService executorService0, String s) {
        this.i = 2;
        super();
        this.k = f0;
        this.j = executorService0;
    }

    @Override  // N3.b
    public F A(d d0) {
        return g.i(d0);
    }

    @Override  // N3.b
    public boolean B(e e0) {
        return g.B(e0);
    }

    @Override  // N3.b
    public Collection C(P3.g g0) {
        return g.V(g0);
    }

    @Override  // N3.b
    public boolean D(e e0) {
        return g.F(e0);
    }

    @Override  // N3.b
    public A E(d d0) {
        return g.h(d0);
    }

    @Override  // N3.b
    public Z F(e e0, e e1) {
        return g.m(this, e0, e1);
    }

    @Override  // N3.b
    public boolean G(e e0, e e1) {
        return g.w(e0, e1);
    }

    @Override  // N3.b
    public boolean H(P3.c c0) {
        return g.J(c0);
    }

    @Override  // N3.b
    public P3.b I(P3.c c0) {
        return g.k(c0);
    }

    @Override  // N3.b
    public K J(e e0) {
        return g.W(e0);
    }

    @Override  // N3.b
    public boolean K(P3.g g0) {
        return g.y(g0);
    }

    @Override  // N3.b
    public A L(e e0) {
        return g.j(e0);
    }

    @Override  // N3.b
    public A M(d d0) {
        A a0;
        j.f(d0, "<this>");
        q q0 = g.g(d0);
        if(q0 == null) {
            a0 = g.h(d0);
            j.c(a0);
        }
        else {
            a0 = g.Y(q0);
            if(a0 == null) {
                a0 = g.h(d0);
                j.c(a0);
                return a0;
            }
        }
        return a0;
    }

    @Override  // N3.b
    public P3.c N(e e0) {
        return g.e(this, e0);
    }

    @Override  // N3.b
    public boolean O(e e0) {
        j.f(e0, "<this>");
        A a0 = g.h(e0);
        return (a0 == null ? null : g.e(this, a0)) != null;
    }

    @Override  // N3.b
    public P3.f P(e e0) {
        return g.d(e0);
    }

    @Override  // N3.b
    public int Q(d d0) {
        return g.c(d0);
    }

    @Override  // N3.b
    public void R(e e0) {
        g.M(e0);
    }

    @Override  // N3.b
    public h S(T t0) {
        j.f(t0, "$receiver");
        a0 a00 = t0.b0();
        j.e(a00, "getVariance(...)");
        return a.l(a00);
    }

    @Override  // N3.b
    public void T(d d0) {
        j.f(d0, "<this>");
        g.g(d0);
    }

    @Override  // N3.b
    public void U(e e0, P3.g g0) {
    }

    @Override  // N3.b
    public int V(P3.g g0) {
        return g.R(g0);
    }

    @Override  // N3.b
    public boolean W(e e0) {
        j.f(e0, "<this>");
        return g.G(this.k(e0)) && !g.H(e0);
    }

    @Override  // N3.b
    public Z X(N n0) {
        return g.r(n0);
    }

    @Override  // N3.b
    public A Y(e e0, boolean z) {
        return g.Z(e0, z);
    }

    @Override  // N3.b
    public boolean Z(P3.c c0) {
        j.f(c0, "$receiver");
        return c0 instanceof z3.a;
    }

    @Override  // N3.b
    public void a(e e0) {
        g.L(e0);
    }

    @Override  // N3.b
    public N3.a a0(e e0) {
        return g.U(this, e0);
    }

    @Override  // N3.b
    public boolean b(P3.g g0) {
        return g.A(g0);
    }

    @Override  // N3.b
    public boolean b0(P3.g g0) {
        return g.E(g0);
    }

    @Override  // N3.b
    public boolean c(d d0) {
        j.f(d0, "$receiver");
        return d0 instanceof n3.f;
    }

    @Override  // N3.b
    public boolean c0(P3.g g0) {
        return g.z(g0);
    }

    @Override  // N3.b
    public A d(q q0) {
        return g.N(q0);
    }

    @Override  // N3.b
    public A d0(m m0) {
        return g.Q(m0);
    }

    @Override  // N3.b
    public boolean e(P3.g g0) {
        return g.G(g0);
    }

    @Override  // N3.b
    public boolean e0(d d0) {
        j.f(d0, "<this>");
        A a0 = g.h(d0);
        return (a0 == null ? null : g.f(a0)) != null;
    }

    @Override  // N3.b
    public T f(P3.g g0, int v) {
        return g.q(g0, v);
    }

    @Override  // N3.b
    public i f0(P3.c c0) {
        return g.X(c0);
    }

    @Override  // N3.b
    public A g(q q0) {
        return g.Y(q0);
    }

    @Override  // N3.b
    public m g0(e e0) {
        return g.f(e0);
    }

    @Override  // v2.a
    public Object get() {
        t1.c c0 = new t1.c(21);
        M1.f f0 = new M1.f(21);
        Object object0 = ((k.d)this.j).get();
        return new x0.h(c0, f0, x0.a.f, ((x0.j)object0), ((v2.a)this.k));
    }

    @Override  // N3.b
    public N h(e e0, int v) {
        j.f(e0, "<this>");
        return v < 0 || v >= g.c(e0) ? null : g.p(e0, v);
    }

    @Override  // N3.b
    public boolean h0(e e0) {
        j.f(e0, "<this>");
        return g.D(g.W(e0));
    }

    @Override  // N3.b
    public boolean i(P3.g g0) {
        return g.D(g0);
    }

    @Override  // N3.b
    public d i0(d d0) {
        return g.a0(this, d0);
    }

    @Override  // N3.b
    public boolean j(e e0) {
        j.f(e0, "<this>");
        return g.y(g.W(e0));
    }

    @Override  // N3.b
    public N j0(d d0, int v) {
        return g.p(d0, v);
    }

    @Override  // N3.b
    public K k(d d0) {
        j.f(d0, "<this>");
        A a0 = g.h(d0);
        if(a0 == null) {
            a0 = this.s(d0);
        }
        return g.W(a0);
    }

    @Override  // N3.b
    public Z k0(d d0) {
        return g.P(d0);
    }

    @Override  // N3.b
    public Collection l(e e0) {
        return g.S(this, e0);
    }

    public void l0() {
        String s = (String)this.j;
        try {
            C1.d d0 = (C1.d)this.k;
            d0.getClass();
            new File(((File)d0.j), s).createNewFile();
        }
        catch(IOException iOException0) {
            Log.e("FirebaseCrashlytics", "Error creating marker: " + s, iOException0);
        }
    }

    @Override  // N3.b
    public boolean m(Z z0) {
        j.f(z0, "<this>");
        return g.F(this.s(z0)) != g.F(this.M(z0));
    }

    public void m0(int v, w w0) {
        while(true) {
            Map.Entry map$Entry0 = (Map.Entry)this.k;
            if(map$Entry0 == null || ((w3.m)map$Entry0.getKey()).i >= v) {
                break;
            }
            w3.m m0 = (w3.m)((Map.Entry)this.k).getKey();
            Object object0 = ((Map.Entry)this.k).getValue();
            L l0 = m0.j;
            int v1 = m0.i;
            if(m0.k) {
                for(Object object1: ((List)object0)) {
                    if(l0 == L.m) {
                        w0.x(v1, 3);
                        ((w3.b)object1).f(w0);
                        w0.x(v1, 4);
                    }
                    else {
                        w0.x(v1, l0.j);
                        w3.h.k(w0, l0, object1);
                    }
                }
            }
            else if(l0 == L.m) {
                w0.x(v1, 3);
                ((w3.b)object0).f(w0);
                w0.x(v1, 4);
            }
            else {
                w0.x(v1, l0.j);
                w3.h.k(w0, l0, object0);
            }
            Iterator iterator1 = (Iterator)this.j;
            if(iterator1.hasNext()) {
                Object object2 = iterator1.next();
                this.k = (Map.Entry)object2;
            }
            else {
                this.k = null;
            }
        }
    }

    @Override  // N3.b
    public N n(z3.b b0) {
        return g.T(b0);
    }

    @Override  // N3.b
    public int o(P3.f f0) {
        j.f(f0, "<this>");
        if(f0 instanceof e) {
            return g.c(((d)f0));
        }
        if(f0 instanceof P3.a) {
            return ((P3.a)f0).size();
        }
        Class class0 = f0.getClass();
        throw new IllegalStateException(("unknown type argument list type: " + f0 + ", " + r.a.b(class0)).toString());
    }

    @Override  // N3.b
    public e p(e e0) {
        j.f(e0, "<this>");
        m m0 = g.f(e0);
        if(m0 != null) {
            A a0 = g.Q(m0);
            if(a0 != null) {
                return a0;
            }
        }
        return e0;
    }

    @Override  // N3.b
    public boolean q(T t0, P3.g g0) {
        return g.v(t0, g0);
    }

    @Override  // N3.b
    public h r(N n0) {
        return g.t(n0);
    }

    @Override  // N3.b
    public A s(d d0) {
        A a0;
        j.f(d0, "<this>");
        q q0 = g.g(d0);
        if(q0 == null) {
            a0 = g.h(d0);
            j.c(a0);
        }
        else {
            a0 = g.N(q0);
            if(a0 == null) {
                a0 = g.h(d0);
                j.c(a0);
                return a0;
            }
        }
        return a0;
    }

    @Override  // N3.b
    public N t(P3.f f0, int v) {
        j.f(f0, "<this>");
        if(f0 instanceof e) {
            return g.p(((d)f0), v);
        }
        if(f0 instanceof P3.a) {
            Object object0 = ((P3.a)f0).get(v);
            j.e(object0, "get(...)");
            return (N)object0;
        }
        Class class0 = f0.getClass();
        throw new IllegalStateException(("unknown type argument list type: " + f0 + ", " + r.a.b(class0)).toString());
    }

    @Override  // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object object0) {
        Object object1 = this.j;
        switch(this.i) {
            case 2: {
                if(((E1.c)object0) == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                x1.i i0 = ((f)this.k).e;
                return Tasks.whenAll(new Task[]{x1.i.b(i0), i0.k.w(((ExecutorService)object1), null)});
            }
            case 3: {
                if(((E1.c)object0) == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
                    return Tasks.forResult(null);
                }
                k k0 = (k)((y)this.k).c;
                x1.i.b(((x1.i)k0.k));
                x1.i i1 = (x1.i)k0.k;
                i1.k.w(((ExecutorService)object1), null);
                i1.o.trySetResult(null);
                return Tasks.forResult(null);
            }
            default: {
                return ((x1.i)this.k).d.r(new y(3, this, ((Boolean)object0)));
            }
        }
    }

    @Override  // N3.b
    public boolean u(P3.g g0, P3.g g1) {
        j.f(g0, "c1");
        j.f(g1, "c2");
        if(!(g0 instanceof K) || !(g1 instanceof K)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(!g.b(g0, g1) && !((c)this.k).a(((K)g0), ((K)g1))) {
            HashMap hashMap0 = (HashMap)this.j;
            if(hashMap0 != null) {
                K k0 = (K)hashMap0.get(((K)g0));
                K k1 = (K)hashMap0.get(((K)g1));
                return k0 != null && k0.equals(((K)g1)) || k1 != null && k1.equals(((K)g0));
            }
            return false;
        }
        return true;
    }

    @Override  // N3.b
    public q v(d d0) {
        return g.g(d0);
    }

    @Override  // N3.b
    public Z w(ArrayList arrayList0) {
        A a0;
        switch(arrayList0.size()) {
            case 0: {
                throw new IllegalStateException("Expected some types");
            }
            case 1: {
                return (Z)x2.i.i0(arrayList0);
            }
            default: {
                ArrayList arrayList1 = new ArrayList(x2.k.E(arrayList0));
                boolean z = false;
                boolean z1 = false;
                for(Object object0: arrayList0) {
                    Z z2 = (Z)object0;
                    z = z || M3.c.i(z2);
                    if(z2 instanceof A) {
                        a0 = (A)z2;
                    }
                    else {
                        if(!(z2 instanceof q)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        j.f(z2, "<this>");
                        a0 = ((q)z2).j;
                        z1 = true;
                    }
                    arrayList1.add(a0);
                }
                if(z) {
                    return O3.l.c(O3.k.F, new String[]{arrayList0.toString()});
                }
                t t0 = t.a;
                if(!z1) {
                    return t0.b(arrayList1);
                }
                ArrayList arrayList2 = new ArrayList(x2.k.E(arrayList0));
                for(Object object1: arrayList0) {
                    arrayList2.add(M3.c.y(((Z)object1)));
                }
                return M3.d.j(t0.b(arrayList1), t0.b(arrayList2));
            }
        }
    }

    @Override  // N3.b
    public boolean x(N n0) {
        return g.K(n0);
    }

    @Override  // N3.b
    public boolean y(P3.g g0) {
        return g.x(g0);
    }

    @Override  // N3.b
    public Z z(P3.c c0) {
        return g.O(c0);
    }
}

