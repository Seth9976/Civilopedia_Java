package g3;

import X2.F;
import X2.P;
import X2.k;
import X2.n;
import X2.p;
import a3.C;
import b3.a;
import b3.b;
import b3.c;
import java.util.HashMap;
import y3.d;

public abstract class o {
    public static final X2.o a;
    public static final X2.o b;
    public static final X2.o c;
    public static final HashMap d;

    static {
        X2.o o0 = new X2.o(a.l, 9);
        o.a = o0;
        X2.o o1 = new X2.o(c.l, 10);
        o.b = o1;
        X2.o o2 = new X2.o(b.l, 11);
        o.c = o2;
        HashMap hashMap0 = new HashMap();
        o.d = hashMap0;
        hashMap0.put(a.l, o0);
        hashMap0.put(c.l, o1);
        hashMap0.put(b.l, o2);
    }

    public static void a(int v) {
        Object[] arr_object = new Object[(v == 5 || v == 6 ? 2 : 3)];
        switch(v) {
            case 1: {
                arr_object[0] = "from";
                break;
            }
            case 2: {
                arr_object[0] = "first";
                break;
            }
            case 3: {
                arr_object[0] = "second";
                break;
            }
            case 4: {
                arr_object[0] = "visibility";
                break;
            }
            case 5: 
            case 6: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            }
            default: {
                arr_object[0] = "what";
            }
        }
        arr_object[1] = v == 5 || v == 6 ? "toDescriptorVisibility" : "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        if(v == 2 || v == 3) {
            arr_object[2] = "areInSamePackage";
        }
        else {
            switch(v) {
                case 4: {
                    arr_object[2] = "toDescriptorVisibility";
                    break;
                }
                case 5: 
                case 6: {
                    break;
                }
                default: {
                    arr_object[2] = "isVisibleForProtectedAndPackage";
                }
            }
        }
        String s = String.format((v == 5 || v == 6 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 5 || v == 6 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    public static boolean b(P p0, n n0, k k0) {
        if(k0 != null) {
            if(n0 instanceof X2.c) {
                return o.c(d.u(((X2.c)n0)), k0) ? true : p.c.a(p0, n0, k0);
            }
            return o.c(n0, k0) ? true : p.c.a(p0, n0, k0);
        }
        o.a(1);
        throw null;
    }

    public static boolean c(n n0, k k0) {
        if(n0 != null) {
            if(k0 != null) {
                F f0 = (F)d.j(n0, F.class, false);
                F f1 = (F)d.j(k0, F.class, false);
                return f1 != null && f0 != null && ((C)f0).m.equals(((C)f1).m);
            }
            o.a(3);
            throw null;
        }
        o.a(2);
        throw null;
    }
}

