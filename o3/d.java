package o3;

import I3.i;
import I3.n;
import J2.j;
import K3.m;
import K3.u;
import X2.F;
import c3.b;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import o2.I;
import p3.a;
import q3.C;
import u3.f;
import u3.g;
import u3.h;
import w2.e;
import x2.z;

public final class d {
    public i a;
    public static final Set b;
    public static final Set c;
    public static final f d;
    public static final f e;

    static {
        d.b = I.s(a.m);
        d.c = z.y(new a[]{a.n, a.q});
        new f(new int[]{1, 1, 2}, false);
        d.d = new f(new int[]{1, 1, 11}, false);
        d.e = new f(new int[]{1, 1, 13}, false);
    }

    public final u a(F f0, b b0) {
        e e0;
        j.f(f0, "descriptor");
        j.f(b0, "kotlinClass");
        P1.a a0 = b0.b;
        String[] arr_s = (String[])a0.f;
        if(arr_s == null) {
            arr_s = (String[])a0.g;
        }
        if(arr_s == null || !d.c.contains(((a)a0.d))) {
            arr_s = null;
        }
        if(arr_s == null) {
            return null;
        }
        f f1 = (f)a0.e;
        String[] arr_s1 = (String[])a0.h;
        if(arr_s1 == null) {
            return null;
        }
        try {
            try {
                e0 = h.h(arr_s, arr_s1);
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                throw new IllegalStateException("Could not read data from " + b0.a(), invalidProtocolBufferException0);
            }
        }
        catch(Throwable throwable0) {
            this.c().c.getClass();
            j.f(this.c().c, "<this>");
            if(f1.b(f.g)) {
                throw throwable0;
            }
            e0 = null;
        }
        if(e0 == null) {
            return null;
        }
        this.d(b0);
        this.e(b0);
        m m0 = this.b(b0);
        o3.f f2 = new o3.f(b0, ((C)e0.j), ((g)e0.i), m0);
        i i0 = this.c();
        return new u(f0, ((C)e0.j), ((g)e0.i), f1, f2, i0, "scope for " + f2 + " in " + f0, o3.a.l);
    }

    public final m b(b b0) {
        this.c().c.getClass();
        int v = b0.b.c;
        if((v & 0x40) != 0 && (v & 0x20) == 0) {
            return m.j;
        }
        return (v & 16) == 0 || (v & 0x20) != 0 ? m.i : m.k;
    }

    public final i c() {
        i i0 = this.a;
        if(i0 != null) {
            return i0;
        }
        j.l("components");
        throw null;
    }

    public final n d(b b0) {
        this.c().c.getClass();
        f f0 = (f)b0.b.e;
        j.f(this.c().c, "<this>");
        f f1 = f.g;
        if(f0.b(f1)) {
            return null;
        }
        f f2 = (f)b0.b.e;
        j.f(this.c().c, "<this>");
        j.f(this.c().c, "<this>");
        f1.getClass();
        f f3 = f2.f ? f1 : f.h;
        f3.getClass();
        return f3.b <= f1.b && (f3.b < f1.b || f3.c <= f1.c) ? new n(f2, f1, f1, f1, b0.a(), d3.d.a(b0.a)) : new n(f2, f1, f1, f3, b0.a(), d3.d.a(b0.a));
    }

    public final boolean e(b b0) {
        this.c().c.getClass();
        this.c().c.getClass();
        return (b0.b.c & 2) != 0 && ((f)b0.b.e).equals(d.d);
    }

    public final I3.d f(b b0) {
        e e0;
        P1.a a0 = b0.b;
        String[] arr_s = (String[])a0.f;
        if(arr_s == null) {
            arr_s = (String[])a0.g;
        }
        if(arr_s == null || !d.b.contains(((a)a0.d))) {
            arr_s = null;
        }
        if(arr_s == null) {
            return null;
        }
        f f0 = (f)a0.e;
        String[] arr_s1 = (String[])a0.h;
        if(arr_s1 == null) {
            return null;
        }
        try {
            try {
                e0 = h.f(arr_s, arr_s1);
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                throw new IllegalStateException("Could not read data from " + b0.a(), invalidProtocolBufferException0);
            }
        }
        catch(Throwable throwable0) {
            this.c().c.getClass();
            j.f(this.c().c, "<this>");
            if(f0.b(f.g)) {
                throw throwable0;
            }
            e0 = null;
        }
        if(e0 == null) {
            return null;
        }
        this.d(b0);
        this.e(b0);
        o3.n n0 = new o3.n(b0, this.b(b0));
        return new I3.d(((g)e0.i), ((q3.j)e0.j), f0, n0);
    }
}

