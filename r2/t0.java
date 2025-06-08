package R2;

import I2.b;
import J2.g;
import J2.h;
import J2.j;
import J2.l;
import J2.m;
import J2.o;
import J2.s;
import M3.w;
import O2.c;
import O2.e;
import O2.f;
import O2.i;
import O2.p;
import X2.u;
import com.google.android.gms.internal.ads.Ra;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import q3.X;
import q3.y;
import u3.a;

public class t0 extends s {
    @Override  // J2.s
    public final f a(h h0) {
        e e0 = h0.g();
        F f0 = e0 instanceof F ? ((F)e0) : d.j;
        String s = h0.getName();
        String s1 = h0.i();
        j.f(f0, "container");
        j.f(s, "name");
        j.f(s1, "signature");
        return new H(f0, s, s1, null, h0.j);
    }

    @Override  // J2.s
    public final c b(Class class0) {
        return R2.c.a(class0);
    }

    @Override  // J2.s
    public final e c(String s, Class class0) {
        j.f(class0, "jClass");
        B.c c0 = R2.c.b;
        c0.getClass();
        ConcurrentHashMap concurrentHashMap0 = (ConcurrentHashMap)c0.k;
        Object object0 = concurrentHashMap0.get(class0);
        if(object0 == null) {
            Object object1 = ((b)(((l)c0.j))).b(class0);
            Object object2 = concurrentHashMap0.putIfAbsent(class0, object1);
            if(object2 == null) {
                return (e)object1;
            }
            object0 = object2;
        }
        return (e)object0;
    }

    @Override  // J2.s
    public final i d(m m0) {
        e e0 = m0.g();
        return e0 instanceof F ? new L(((F)e0), m0.l, m0.m, m0.j) : new L(d.j, m0.l, m0.m, m0.j);
    }

    @Override  // J2.s
    public final p e(o o0) {
        e e0 = o0.g();
        return e0 instanceof F ? new d0(((F)e0), o0.l, o0.m, o0.j) : new d0(d.j, o0.l, o0.m, o0.j);
    }

    @Override  // J2.s
    public final String f(g g0) {
        Metadata metadata0 = (Metadata)g0.getClass().getAnnotation(Metadata.class);
        H h0 = null;
        if(metadata0 != null) {
            String[] arr_s = metadata0.d1();
            if(arr_s.length == 0) {
                arr_s = null;
            }
            if(arr_s != null) {
                String[] arr_s1 = metadata0.d2();
                j.f(arr_s1, "strings");
                ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(a.a(arr_s));
                u3.g g1 = u3.h.g(byteArrayInputStream0, arr_s1);
                y.D.getClass();
                Ra ra0 = new Ra(byteArrayInputStream0);
                w3.b b0 = (w3.b)y.D.a(ra0, u3.h.a);
                boolean z = false;
                try {
                    ra0.a(0);
                }
                catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                    invalidProtocolBufferException0.i = b0;
                    throw invalidProtocolBufferException0;
                }
                if(b0.b()) {
                    int[] arr_v = metadata0.mv();
                    if((metadata0.xi() & 8) != 0) {
                        z = true;
                    }
                    u3.f f0 = new u3.f(arr_v, z);
                    Class class0 = g0.getClass();
                    X x0 = ((y)b0).x;
                    j.e(x0, "getTypeTable(...)");
                    a3.L l0 = (a3.L)x0.f(class0, ((y)b0), g1, new a3.s(x0), f0, Q2.a.q);
                    h0 = new H(d.j, l0);
                    goto label_34;
                }
                InvalidProtocolBufferException invalidProtocolBufferException1 = new InvalidProtocolBufferException("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
                invalidProtocolBufferException1.i = b0;
                throw invalidProtocolBufferException1;
            }
        }
    label_34:
        if(h0 != null) {
            H h1 = x0.b(h0);
            if(h1 != null) {
                u u0 = h1.t();
                StringBuilder stringBuilder0 = new StringBuilder();
                u0.a(u0, stringBuilder0);
                List list0 = u0.z0();
                j.e(list0, "getValueParameters(...)");
                x2.i.X(list0, stringBuilder0, "(", ")", R2.b.q, 0x30);
                stringBuilder0.append(" -> ");
                w w0 = u0.r();
                j.c(w0);
                stringBuilder0.append(u0.d(w0));
                String s = stringBuilder0.toString();
                j.e(s, "toString(...)");
                return s;
            }
        }
        return super.f(g0);
    }

    @Override  // J2.s
    public final String g(l l0) {
        return this.f(l0);
    }
}

