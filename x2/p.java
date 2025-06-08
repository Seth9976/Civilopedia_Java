package X2;

import a3.N;
import a3.O;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import x2.z;
import y3.d;

public abstract class p {
    public static final o a;
    public static final o b;
    public static final o c;
    public static final o d;
    public static final o e;
    public static final o f;
    public static final o g;
    public static final o h;
    public static final o i;
    public static final o j;
    public static final P k;
    public static final P l;
    public static final P m;
    public static final S3.o n;
    public static final HashMap o;

    static {
        S3.o o9;
        Iterator iterator0;
        b0 b00 = b0.l;
        o o0 = new o(b00, 0);
        p.a = o0;
        c0 c00 = c0.l;
        o o1 = new o(c00, 1);
        p.b = o1;
        d0 d00 = d0.l;
        o o2 = new o(d00, 2);
        p.c = o2;
        Y y0 = Y.l;
        o o3 = new o(y0, 3);
        p.d = o3;
        e0 e00 = e0.l;
        o o4 = new o(e00, 4);
        p.e = o4;
        a0 a00 = a0.l;
        o o5 = new o(a00, 5);
        p.f = o5;
        X x0 = X.l;
        o o6 = new o(x0, 6);
        p.g = o6;
        o o7 = new o(Z.l, 7);
        p.h = o7;
        Z z0 = Z.l;
        o o8 = new o(f0.l, 8);
        p.i = o8;
        f0 f00 = f0.l;
        Collections.unmodifiableSet(z.y(new o[]{o0, o1, o3, o5}));
        HashMap hashMap0 = new HashMap(6);
        hashMap0.put(o1, 0);
        hashMap0.put(o0, 0);
        hashMap0.put(o3, 1);
        hashMap0.put(o2, 1);
        hashMap0.put(o4, 2);
        Collections.unmodifiableMap(hashMap0);
        p.j = o4;
        p.k = new P(2);
        p.l = new P(3);
        p.m = new P(4);
        try {
            iterator0 = Arrays.asList(new S3.o[0]).iterator();
        }
        catch(Throwable throwable0) {
            throw new ServiceConfigurationError(throwable0.getMessage(), throwable0);
        }
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            o9 = (S3.o)object0;
        }
        else {
            o9 = S3.o.a;
        }
        p.n = o9;
        HashMap hashMap1 = new HashMap();
        p.o = hashMap1;
        hashMap1.put(b00, o0);
        hashMap1.put(c00, o1);
        hashMap1.put(d00, o2);
        hashMap1.put(y0, o3);
        hashMap1.put(e00, o4);
        hashMap1.put(a00, o5);
        hashMap1.put(x0, o6);
        hashMap1.put(z0, o7);
        hashMap1.put(f00, o8);
    }

    public static void a(int v) {
        Object[] arr_object = new Object[(v == 16 ? 2 : 3)];
        if(v == 1 || v == 3 || (v == 5 || v == 7)) {
            arr_object[0] = "from";
        }
        else {
            switch(v) {
                case 9: {
                    arr_object[0] = "from";
                    break;
                }
                case 10: 
                case 12: {
                    arr_object[0] = "first";
                    break;
                }
                case 11: 
                case 13: {
                    arr_object[0] = "second";
                    break;
                }
                case 14: 
                case 15: {
                    arr_object[0] = "visibility";
                    break;
                }
                case 16: {
                    arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                }
                default: {
                    arr_object[0] = "what";
                }
            }
        }
        arr_object[1] = v == 16 ? "toDescriptorVisibility" : "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        switch(v) {
            case 2: 
            case 3: {
                arr_object[2] = "isVisibleIgnoringReceiver";
                break;
            }
            case 4: 
            case 5: {
                arr_object[2] = "isVisibleWithAnyReceiver";
                break;
            }
            case 6: 
            case 7: {
                arr_object[2] = "inSameFile";
                break;
            }
            case 8: 
            case 9: {
                arr_object[2] = "findInvisibleMember";
                break;
            }
            case 10: 
            case 11: {
                arr_object[2] = "compareLocal";
                break;
            }
            case 12: 
            case 13: {
                arr_object[2] = "compare";
                break;
            }
            case 14: {
                arr_object[2] = "isPrivate";
                break;
            }
            case 15: {
                arr_object[2] = "toDescriptorVisibility";
                break;
            }
            case 16: {
                break;
            }
            default: {
                arr_object[2] = "isVisible";
            }
        }
        String s = String.format((v == 16 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalArgumentException illegalArgumentException0 = v == 16 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalArgumentException0;
    }

    public static Integer b(o o0, o o1) {
        if(o0 != null) {
            if(o1 != null) {
                h0 h00 = o0.a;
                h0 h01 = o1.a;
                Integer integer0 = h00.a(h01);
                if(integer0 != null) {
                    return integer0;
                }
                Integer integer1 = h01.a(h00);
                return integer1 == null ? null : ((int)(-((int)integer1)));
            }
            p.a(13);
            throw null;
        }
        p.a(12);
        throw null;
    }

    public static n c(P p0, c c0, k k0) {
        if(c0 != null) {
            if(k0 != null) {
                for(n n0 = (n)c0.a(); n0 != null && n0.c() != p.f; n0 = (n)d.j(n0, n.class, true)) {
                    if(!n0.c().a(p0, n0, k0)) {
                        return n0;
                    }
                }
                if(c0 instanceof N) {
                    n n1 = p.c(p0, ((O)(((N)c0))).N, k0);
                    return n1 == null ? null : n1;
                }
                return null;
            }
            p.a(9);
            throw null;
        }
        p.a(8);
        throw null;
    }

    public static boolean d(n n0, k k0) {
        if(k0 != null) {
            P p0 = d.f(k0);
            return p0 == P.j ? false : p0.equals(d.f(n0));
        }
        p.a(7);
        throw null;
    }

    public static boolean e(o o0) {
        if(o0 != null) {
            return o0 == p.a || o0 == p.b;
        }
        p.a(14);
        throw null;
    }

    public static o f(h0 h00) {
        if(h00 != null) {
            o o0 = (o)p.o.get(h00);
            if(o0 == null) {
                throw new IllegalArgumentException("Inapplicable visibility: " + h00);
            }
            return o0;
        }
        p.a(15);
        throw null;
    }
}

