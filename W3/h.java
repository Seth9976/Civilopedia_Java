package w3;

import com.google.android.gms.internal.ads.Ra;
import com.google.android.gms.internal.ads.w;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public final class h {
    public final A a;
    public boolean b;
    public static final h c;

    static {
        h.c = new h(0);
    }

    public h() {
        this.a = new A(16);
    }

    public h(int v) {
        this.a = new A(0);
        this.f();
    }

    public final void a(m m0, Object object0) {
        List list0;
        if(!m0.k) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        h.j(m0.j, object0);
        A a0 = this.a;
        Object object1 = a0.get(m0);
        if(object1 == null) {
            list0 = new ArrayList();
            a0.f(m0, list0);
        }
        else {
            list0 = (List)object1;
        }
        list0.add(object0);
    }

    public final h b() {
        h h0 = new h();
        for(int v = 0; true; ++v) {
            A a0 = this.a;
            if(v >= a0.j.size()) {
                break;
            }
            Map.Entry map$Entry0 = (Map.Entry)a0.j.get(v);
            h0.i(((m)map$Entry0.getKey()), map$Entry0.getValue());
        }
        for(Object object0: a0.d()) {
            h0.i(((m)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
        return h0;
    }

    public static int c(L l0, Object object0) {
        switch(l0.ordinal()) {
            case 0: {
                ((Double)object0).getClass();
                return 8;
            }
            case 1: {
                ((Float)object0).getClass();
                return 4;
            }
            case 2: {
                return w.g(((long)(((Long)object0))));
            }
            case 3: {
                return w.g(((long)(((Long)object0))));
            }
            case 4: {
                return w.c(((int)(((Integer)object0))));
            }
            case 5: {
                ((Long)object0).getClass();
                return 8;
            }
            case 6: {
                ((Integer)object0).getClass();
                return 4;
            }
            case 7: {
                ((Boolean)object0).getClass();
                return 1;
            }
            case 8: {
                String s = (String)object0;
                try {
                    byte[] arr_b = s.getBytes("UTF-8");
                    return w.f(arr_b.length) + arr_b.length;
                }
                catch(UnsupportedEncodingException unsupportedEncodingException0) {
                    throw new RuntimeException("UTF-8 not supported.", unsupportedEncodingException0);
                }
            }
            case 9: {
                return ((b)object0).c();
            }
            case 10: {
                return w.e(((b)object0));
            }
            case 11: {
                return object0 instanceof e ? ((e)object0).size() + w.f(((e)object0).size()) : w.f(((byte[])object0).length) + ((byte[])object0).length;
            }
            case 12: {
                return w.f(((int)(((Integer)object0))));
            }
            case 13: {
                return object0 instanceof p ? w.c(((p)object0).a()) : w.c(((int)(((Integer)object0))));
            }
            case 14: {
                ((Integer)object0).getClass();
                return 4;
            }
            case 15: {
                ((Long)object0).getClass();
                return 8;
            }
            case 16: {
                int v = (int)(((Integer)object0));
                return w.f(v >> 0x1F ^ v << 1);
            }
            case 17: {
                long v1 = (long)(((Long)object0));
                return w.g(v1 >> 0x3F ^ v1 << 1);
            }
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
    }

    @Override
    public final Object clone() {
        return this.b();
    }

    public static int d(m m0, Object object0) {
        L l0 = m0.j;
        int v = m0.i;
        if(m0.k) {
            int v1 = 0;
            for(Object object1: ((List)object0)) {
                v1 += h.c(l0, object1) + (l0 == L.m ? w.h(v) * 2 : w.h(v));
            }
            return v1;
        }
        return h.c(l0, object0) + (l0 == L.m ? w.h(v) * 2 : w.h(v));
    }

    public static boolean e(Map.Entry map$Entry0) {
        m m0 = (m)map$Entry0.getKey();
        if(m0.j.i == M.r) {
            if(m0.k) {
                Iterator iterator0 = ((List)map$Entry0.getValue()).iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        return true;
                    }
                    Object object0 = iterator0.next();
                    if(((b)object0).b()) {
                        continue;
                    }
                    return false;
                }
            }
            Object object1 = map$Entry0.getValue();
            if(!(object1 instanceof b)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            return ((b)object1).b();
        }
        return true;
    }

    public final void f() {
        if(this.b) {
            return;
        }
        A a0 = this.a;
        if(!a0.l) {
            for(int v = 0; v < a0.j.size(); ++v) {
                Map.Entry map$Entry0 = (Map.Entry)a0.j.get(v);
                if(((m)map$Entry0.getKey()).k) {
                    map$Entry0.setValue(Collections.unmodifiableList(((List)map$Entry0.getValue())));
                }
            }
            for(Object object0: a0.d()) {
                Map.Entry map$Entry1 = (Map.Entry)object0;
                if(((m)map$Entry1.getKey()).k) {
                    map$Entry1.setValue(Collections.unmodifiableList(((List)map$Entry1.getValue())));
                }
            }
        }
        if(!a0.l) {
            a0.k = a0.k.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(a0.k);
            a0.l = true;
        }
        this.b = true;
    }

    public final void g(Map.Entry map$Entry0) {
        m m0 = (m)map$Entry0.getKey();
        byte[] arr_b = map$Entry0.getValue();
        A a0 = this.a;
        if(m0.k) {
            ArrayList arrayList0 = a0.get(m0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
            }
            for(byte[] arr_b1: ((List)arr_b)) {
                if(arr_b1 instanceof byte[]) {
                    byte[] arr_b2 = new byte[arr_b1.length];
                    System.arraycopy(arr_b1, 0, arr_b2, 0, arr_b1.length);
                    arr_b1 = arr_b2;
                }
                arrayList0.add(arr_b1);
            }
            a0.f(m0, arrayList0);
            return;
        }
        if(m0.j.i == M.r) {
            Object object0 = a0.get(m0);
            if(object0 == null) {
                if(arr_b instanceof byte[]) {
                    byte[] arr_b3 = new byte[arr_b.length];
                    System.arraycopy(arr_b, 0, arr_b3, 0, arr_b.length);
                    arr_b = arr_b3;
                }
                a0.f(m0, arr_b);
                return;
            }
            a0.f(m0, ((b)object0).e().e(((o)(((b)arr_b)))).c());
            return;
        }
        if(arr_b instanceof byte[]) {
            byte[] arr_b4 = new byte[arr_b.length];
            System.arraycopy(arr_b, 0, arr_b4, 0, arr_b.length);
            arr_b = arr_b4;
        }
        a0.f(m0, arr_b);
    }

    public static Object h(Ra ra0, L l0) {
        boolean z = true;
        switch(l0.ordinal()) {
            case 0: {
                return Double.longBitsToDouble(ra0.j());
            }
            case 1: {
                return Float.intBitsToFloat(ra0.i());
            }
            case 2: {
                return ra0.l();
            }
            case 3: {
                return ra0.l();
            }
            case 4: {
                return ra0.k();
            }
            case 5: {
                return ra0.j();
            }
            case 6: {
                return ra0.i();
            }
            case 7: {
                if(ra0.l() == 0L) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            case 8: {
                int v = ra0.k();
                int v1 = ra0.c;
                if(v <= ra0.a - v1 && v > 0) {
                    String s = new String(((byte[])ra0.h), v1, v, "UTF-8");
                    ra0.c += v;
                    return s;
                }
                return v == 0 ? "" : new String(ra0.h(v), "UTF-8");
            }
            case 9: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            }
            case 10: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            }
            case 11: {
                return ra0.e();
            }
            case 12: {
                return ra0.k();
            }
            case 13: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            }
            case 14: {
                return ra0.i();
            }
            case 15: {
                return ra0.j();
            }
            case 16: {
                int v2 = ra0.k();
                return (int)(-(v2 & 1) ^ v2 >>> 1);
            }
            case 17: {
                long v3 = ra0.l();
                return (long)(-(v3 & 1L) ^ v3 >>> 1);
            }
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
    }

    public final void i(m m0, Object object0) {
        L l0 = m0.j;
        if(m0.k) {
            if(!(object0 instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList0 = new ArrayList();
            arrayList0.addAll(((List)object0));
            for(Object object1: arrayList0) {
                h.j(l0, object1);
            }
            object0 = arrayList0;
        }
        else {
            h.j(l0, object0);
        }
        this.a.f(m0, object0);
    }

    public static void j(L l0, Object object0) {
        object0.getClass();
        boolean z = true;
        boolean z1 = false;
        switch(l0.i.ordinal()) {
            case 0: {
                z1 = object0 instanceof Integer;
                break;
            }
            case 1: {
                z1 = object0 instanceof Long;
                break;
            }
            case 2: {
                z1 = object0 instanceof Float;
                break;
            }
            case 3: {
                z1 = object0 instanceof Double;
                break;
            }
            case 4: {
                z1 = object0 instanceof Boolean;
                break;
            }
            case 5: {
                z1 = object0 instanceof String;
                break;
            }
            case 6: {
                if(!(object0 instanceof e) && !(object0 instanceof byte[])) {
                    z = false;
                }
                z1 = z;
                break;
            }
            case 7: {
                if(!(object0 instanceof Integer) && !(object0 instanceof p)) {
                    z = false;
                }
                z1 = z;
                break;
            }
            case 8: {
                z1 = object0 instanceof b;
            }
        }
        if(!z1) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public static void k(w w0, L l0, Object object0) {
        switch(l0.ordinal()) {
            case 0: {
                w0.getClass();
                w0.u(Double.doubleToRawLongBits(((double)(((Double)object0)))));
                return;
            }
            case 1: {
                w0.getClass();
                w0.t(Float.floatToRawIntBits(((float)(((Float)object0)))));
                return;
            }
            case 2: {
                w0.w(((long)(((Long)object0))));
                return;
            }
            case 3: {
                w0.w(((long)(((Long)object0))));
                return;
            }
            case 4: {
                w0.n(((int)(((Integer)object0))));
                return;
            }
            case 5: {
                w0.u(((long)(((Long)object0))));
                return;
            }
            case 6: {
                w0.t(((int)(((Integer)object0))));
                return;
            }
            case 7: {
                w0.q(((int)((Boolean)object0).booleanValue()));
                return;
            }
            case 8: {
                w0.getClass();
                byte[] arr_b = ((String)object0).getBytes("UTF-8");
                w0.v(arr_b.length);
                w0.s(arr_b);
                return;
            }
            case 9: {
                w0.getClass();
                ((b)object0).f(w0);
                return;
            }
            case 10: {
                w0.p(((b)object0));
                return;
            }
            case 11: {
                if(object0 instanceof e) {
                    w0.getClass();
                    w0.v(((e)object0).size());
                    w0.r(((e)object0));
                    return;
                }
                w0.getClass();
                w0.v(((byte[])object0).length);
                w0.s(((byte[])object0));
                return;
            }
            case 12: {
                w0.v(((int)(((Integer)object0))));
                return;
            }
            case 13: {
                if(object0 instanceof p) {
                    w0.n(((p)object0).a());
                    return;
                }
                w0.n(((int)(((Integer)object0))));
                return;
            }
            case 14: {
                w0.t(((int)(((Integer)object0))));
                return;
            }
            case 15: {
                w0.u(((long)(((Long)object0))));
                return;
            }
            case 16: {
                int v = (int)(((Integer)object0));
                w0.v(v >> 0x1F ^ v << 1);
                return;
            }
            case 17: {
                long v1 = (long)(((Long)object0));
                w0.w(v1 >> 0x3F ^ v1 << 1);
            }
        }
    }
}

