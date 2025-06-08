package I3;

import B.c;
import L3.m;
import N3.k;
import X2.A;
import X2.F;
import X2.I;
import Z2.b;
import Z2.d;
import a3.s;
import f0.g;
import java.util.List;
import o2.G;
import s3.f;
import x2.r;

public final class i {
    public final m a;
    public final A b;
    public final j c;
    public final e d;
    public final a e;
    public final I f;
    public final j g;
    public final l h;
    public final f3.a i;
    public final I3.m j;
    public final Iterable k;
    public final g l;
    public final j m;
    public final b n;
    public final d o;
    public final w3.g p;
    public final k q;
    public final List r;
    public final I3.k s;
    public final I3.g t;

    public i(m m0, A a0, D3.b b0, c c0, I i0, Iterable iterable0, g g0, b b1, d d0, w3.g g1, N3.l l0, J3.d d1, int v) {
        N3.l l1;
        j j0 = l.a;
        j j1 = j.e;
        j j2 = j.f;
        if((v & 0x10000) == 0) {
            l1 = l0;
        }
        else {
            k.b.getClass();
            l1 = N3.j.b;
        }
        List list0 = G.p(M3.l.a);
        if((v & 0x80000) != 0) {
            j2 = j.d;
        }
        this(m0, a0, b0, c0, i0, j0, j1, iterable0, g0, b1, d0, g1, l1, d1, list0, j2);
    }

    public i(m m0, A a0, e e0, a a1, I i0, l l0, I3.m m1, Iterable iterable0, g g0, b b0, d d0, w3.g g1, k k0, J3.d d1, List list0, I3.k k1) {
        J2.j.f(a0, "moduleDescriptor");
        J2.j.f(g1, "extensionRegistryLite");
        J2.j.f(k0, "kotlinTypeChecker");
        J2.j.f(k1, "enumEntriesDeserializationSupport");
        super();
        this.a = m0;
        this.b = a0;
        this.c = j.c;
        this.d = e0;
        this.e = a1;
        this.f = i0;
        this.g = j.g;
        this.h = l0;
        this.i = f3.a.a;
        this.j = m1;
        this.k = iterable0;
        this.l = g0;
        this.m = h.a;
        this.n = b0;
        this.o = d0;
        this.p = g1;
        this.q = k0;
        this.r = list0;
        this.s = k1;
        this.t = new I3.g(this);
    }

    public final E1.d a(F f0, f f1, s s0, s3.g g0, s3.a a0, o3.f f2) {
        J2.j.f(f0, "descriptor");
        J2.j.f(f1, "nameResolver");
        J2.j.f(a0, "metadataVersion");
        return new E1.d(this, f1, f0, s0, g0, a0, f2, null, r.i);
    }

    public final X2.e b(v3.b b0) {
        J2.j.f(b0, "classId");
        return this.t.a(b0, null);
    }
}

