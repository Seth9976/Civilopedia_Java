package u3;

import J2.j;
import a3.s;
import com.google.android.gms.internal.ads.Ra;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import o2.C;
import o2.I;
import q3.G;
import q3.Q;
import q3.Z;
import q3.l;
import q3.y;
import s3.f;
import t3.b;
import t3.c;
import t3.k;
import w3.g;
import x2.i;

public final class h {
    public static final g a;

    static {
        g g0 = new g();
        g0.a(k.a);
        g0.a(k.b);
        g0.a(k.c);
        g0.a(k.d);
        g0.a(k.e);
        g0.a(k.f);
        g0.a(k.g);
        g0.a(k.h);
        g0.a(k.i);
        g0.a(k.j);
        g0.a(k.k);
        g0.a(k.l);
        g0.a(k.m);
        g0.a(k.n);
        h.a = g0;
    }

    public static e a(l l0, f f0, s s0) {
        j.f(l0, "proto");
        j.f(f0, "nameResolver");
        j.f(s0, "typeTable");
        j.e(k.a, "constructorSignature");
        c c0 = (c)I.k(l0, k.a);
        String s1 = c0 == null || (c0.j & 1) != 1 ? "<init>" : f0.getString(c0.k);
        if(c0 != null && (c0.j & 2) == 2) {
            return new e(s1, f0.getString(c0.l));
        }
        List list0 = l0.m;
        j.e(list0, "getValueParameterList(...)");
        ArrayList arrayList0 = new ArrayList(x2.k.E(list0));
        for(Object object0: list0) {
            j.c(((Z)object0));
            String s2 = h.e(C.y(((Z)object0), s0), f0);
            if(s2 == null) {
                return null;
            }
            arrayList0.add(s2);
        }
        return new e(s1, i.Y(arrayList0, "", "(", ")V", null, 56));
    }

    public static d b(G g0, f f0, s s0, boolean z) {
        String s1;
        j.f(g0, "proto");
        j.f(f0, "nameResolver");
        j.f(s0, "typeTable");
        j.e(k.d, "propertySignature");
        t3.e e0 = (t3.e)I.k(g0, k.d);
        if(e0 == null) {
            return null;
        }
        b b0 = (e0.j & 1) == 1 ? e0.k : null;
        if(b0 == null && z) {
            return null;
        }
        int v = b0 == null || (b0.j & 1) != 1 ? g0.n : b0.k;
        if(b0 != null && (b0.j & 2) == 2) {
            s1 = f0.getString(b0.l);
            return new d(f0.getString(v), s1);
        }
        s1 = h.e(C.w(g0, s0), f0);
        return s1 == null ? null : new d(f0.getString(v), s1);
    }

    public static e c(y y0, f f0, s s0) {
        String s1;
        j.f(y0, "proto");
        j.f(f0, "nameResolver");
        j.f(s0, "typeTable");
        j.e(k.b, "methodSignature");
        c c0 = (c)I.k(y0, k.b);
        int v = c0 == null || (c0.j & 1) != 1 ? y0.n : c0.k;
        if(c0 != null && (c0.j & 2) == 2) {
            s1 = f0.getString(c0.l);
            return new e(f0.getString(v), s1);
        }
        Collection collection0 = x2.j.A(C.u(y0, s0));
        List list0 = y0.w;
        j.e(list0, "getValueParameterList(...)");
        ArrayList arrayList0 = new ArrayList(x2.k.E(list0));
        for(Object object0: list0) {
            j.c(((Z)object0));
            arrayList0.add(C.y(((Z)object0), s0));
        }
        ArrayList arrayList1 = i.e0(arrayList0, collection0);
        ArrayList arrayList2 = new ArrayList(x2.k.E(arrayList1));
        for(Object object1: arrayList1) {
            String s2 = h.e(((Q)object1), f0);
            if(s2 == null) {
                return null;
            }
            arrayList2.add(s2);
        }
        String s3 = h.e(C.v(y0, s0), f0);
        if(s3 == null) {
            return null;
        }
        s1 = i.Y(arrayList2, "", "(", ")", null, 56) + s3;
        return new e(f0.getString(v), s1);
    }

    public static final boolean d(G g0) {
        j.f(g0, "proto");
        Object object0 = g0.k(k.e);
        j.e(object0, "getExtension(...)");
        return u3.c.a.c(((Number)object0).intValue()).booleanValue();
    }

    // 去混淆评级： 低(20)
    public static String e(Q q0, f f0) {
        return q0.p() ? u3.b.b(f0.b(q0.q)) : null;
    }

    public static final w2.e f(String[] arr_s, String[] arr_s1) {
        j.f(arr_s1, "strings");
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(a.a(arr_s));
        u3.g g0 = h.g(byteArrayInputStream0, arr_s1);
        q3.j.S.getClass();
        Ra ra0 = new Ra(byteArrayInputStream0);
        w3.b b0 = (w3.b)q3.j.S.a(ra0, h.a);
        try {
            ra0.a(0);
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
            invalidProtocolBufferException0.i = b0;
            throw invalidProtocolBufferException0;
        }
        if(b0.b()) {
            return new w2.e(g0, ((q3.j)b0));
        }
        InvalidProtocolBufferException invalidProtocolBufferException1 = new InvalidProtocolBufferException("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        invalidProtocolBufferException1.i = b0;
        throw invalidProtocolBufferException1;
    }

    public static u3.g g(ByteArrayInputStream byteArrayInputStream0, String[] arr_s) {
        t3.j j0 = (t3.j)t3.j.p.b(byteArrayInputStream0, h.a);
        j.e(j0, "parseDelimitedFrom(...)");
        return new u3.g(j0, arr_s);
    }

    public static final w2.e h(String[] arr_s, String[] arr_s1) {
        j.f(arr_s, "data");
        j.f(arr_s1, "strings");
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(a.a(arr_s));
        u3.g g0 = h.g(byteArrayInputStream0, arr_s1);
        q3.C.t.getClass();
        Ra ra0 = new Ra(byteArrayInputStream0);
        w3.b b0 = (w3.b)q3.C.t.a(ra0, h.a);
        try {
            ra0.a(0);
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
            invalidProtocolBufferException0.i = b0;
            throw invalidProtocolBufferException0;
        }
        if(b0.b()) {
            return new w2.e(g0, ((q3.C)b0));
        }
        InvalidProtocolBufferException invalidProtocolBufferException1 = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        invalidProtocolBufferException1.i = b0;
        throw invalidProtocolBufferException1;
    }
}

