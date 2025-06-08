package y3;

import J2.j;
import M3.K;
import N3.c;
import X2.F;
import X2.O;
import X2.T;
import X2.e;
import X2.k;
import X2.x;
import a3.C;
import java.util.Collection;
import l1.g;
import x2.i;

public final class b implements c {
    public static final b a;

    static {
        b.a = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // N3.c
    public boolean a(K k0, K k1) {
        if(k0 != null) {
            if(k1 != null) {
                return k0.equals(k1);
            }
            b.b(1);
            throw null;
        }
        b.b(0);
        throw null;
    }

    public static void b(int v) {
        Object[] arr_object = new Object[3];
        arr_object[0] = v == 1 ? "b" : "a";
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        arr_object[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    public boolean c(k k0, k k1, boolean z) {
        if(k0 instanceof e && k1 instanceof e) {
            return j.a(((e)k0).B(), ((e)k1).B());
        }
        if(k0 instanceof T && k1 instanceof T) {
            return this.d(((T)k0), ((T)k1), z, a.k);
        }
        if(k0 instanceof X2.b && k1 instanceof X2.b) {
            j.f(((X2.b)k0), "a");
            j.f(((X2.b)k1), "b");
            if(((X2.b)k0).equals(((X2.b)k1))) {
                return true;
            }
            if(j.a(((X2.b)k0).getName(), ((X2.b)k1).getName()) && ((!(((X2.b)k0) instanceof x) || !(((X2.b)k1) instanceof x) || ((x)(((X2.b)k0))).Z() == ((x)(((X2.b)k1))).Z()) && (!j.a(((X2.b)k0).p(), ((X2.b)k1).p()) || z && j.a(b.f(((X2.b)k0)), b.f(((X2.b)k1)))) && !d.p(((X2.b)k0)) && !d.p(((X2.b)k1)) && this.e(((X2.b)k0), ((X2.b)k1), a.j, z))) {
                y3.k k2 = new y3.k(new g(((X2.b)k0), ((X2.b)k1), z));
                return k2.m(((X2.b)k0), ((X2.b)k1), null, true).c() == 1 && k2.m(((X2.b)k1), ((X2.b)k0), null, true).c() == 1;
            }
            return false;
        }
        return !(k0 instanceof F) || !(k1 instanceof F) ? j.a(k0, k1) : j.a(((C)(((F)k0))).m, ((C)(((F)k1))).m);
    }

    public boolean d(T t0, T t1, boolean z, I2.c c0) {
        j.f(t0, "a");
        j.f(t1, "b");
        if(t0.equals(t1)) {
            return true;
        }
        if(j.a(t0.p(), t1.p())) {
            return false;
        }
        return this.e(t0, t1, c0, z) ? t0.U() == t1.U() : false;
    }

    public boolean e(k k0, k k1, I2.c c0, boolean z) {
        k k2 = k0.p();
        k k3 = k1.p();
        return k2 instanceof X2.c || k3 instanceof X2.c ? ((Boolean)c0.a(k2, k3)).booleanValue() : this.c(k2, k3, z);
    }

    public static O f(X2.b b0) {
        while(b0 instanceof X2.c && ((X2.c)b0).j() == 2) {
            Collection collection0 = ((X2.c)b0).s();
            j.e(collection0, "getOverriddenDescriptors(...)");
            b0 = (X2.c)i.j0(collection0);
            if(b0 == null) {
                return null;
            }
            if(false) {
                break;
            }
        }
        return b0.q();
    }
}

