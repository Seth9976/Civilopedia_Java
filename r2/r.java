package R2;

import J2.j;
import O2.A;
import O2.b;
import O2.l;
import S2.g;
import X2.c;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.reflect.full.IllegalCallableAccessException;
import o1.a;
import w2.d;
import x2.k;
import x2.w;

public abstract class r implements b, q0 {
    public final s0 i;
    public final s0 j;
    public final Object k;

    public r() {
        a.H(null, new o(this, 1));
        this.i = a.H(null, new o(this, 2));
        a.H(null, new o(this, 4));
        a.H(null, new o(this, 5));
        this.j = a.H(null, new o(this, 0));
        o o0 = new o(this, 6);
        this.k = w.p(d.i, o0);
    }

    public final Object g(Object[] arr_object) {
        try {
            return this.i().u(arr_object);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new IllegalCallableAccessException(illegalAccessException0);  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V
        }
    }

    public static Object h(o0 o00) {
        Class class0 = A.y(A.C(o00));
        if(!class0.isArray()) {
            throw new H2.a("Cannot instantiate the default empty array of type " + class0.getSimpleName() + ", because it is not an array type", 1);
        }
        Object object0 = Array.newInstance(class0.getComponentType(), 0);
        j.e(object0, "run(...)");
        return object0;
    }

    public abstract g i();

    public abstract F j();

    public abstract g k();

    public abstract c l();

    public final int m(l l0) {
        if(!((Boolean)((w2.c)this.k).getValue()).booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        if(x0.h(((X)l0).d())) {
            ArrayList arrayList0 = A.G(M3.c.b(((X)l0).d().a));
            j.c(arrayList0);
            return arrayList0.size();
        }
        return 1;
    }

    @Override  // O2.b
    public final List o() {
        Object object0 = this.i.invoke();
        j.e(object0, "invoke(...)");
        return (List)object0;
    }

    @Override  // O2.b
    public final Object p(HashMap hashMap0) {
        Object object1;
        boolean z = false;
        if(this.q()) {
            Iterable iterable0 = this.o();
            ArrayList arrayList0 = new ArrayList(k.E(iterable0));
            for(Object object0: iterable0) {
                l l0 = (l)object0;
                if(hashMap0.containsKey(l0)) {
                    object1 = hashMap0.get(l0);
                    if(object1 == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + l0 + ')');
                    }
                }
                else if(((X)l0).e()) {
                    object1 = null;
                }
                else {
                    if(!((X)l0).f()) {
                        throw new IllegalArgumentException("No argument provided for a required parameter: " + ((X)l0));
                    }
                    object1 = r.h(((X)l0).d());
                }
                arrayList0.add(object1);
            }
            g g0 = this.k();
            if(g0 != null) {
                try {
                    return g0.u(arrayList0.toArray(new Object[0]));
                }
                catch(IllegalAccessException illegalAccessException0) {
                    throw new IllegalCallableAccessException(illegalAccessException0);  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V
                }
            }
            throw new H2.a("This callable does not support a default call: " + this.l(), 1);
        }
        List list0 = this.o();
        if(list0.isEmpty()) {
            try {
                return this.i().u((this.n() ? new A2.d[]{null} : new A2.d[0]));
            }
            catch(IllegalAccessException illegalAccessException1) {
                throw new IllegalCallableAccessException(illegalAccessException1);  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V
            }
        }
        int v = this.n() + list0.size();
        Object[] arr_object = (Object[])((Object[])this.j.invoke()).clone();
        if(this.n()) {
            arr_object[list0.size()] = null;
        }
        boolean z1 = ((Boolean)((w2.c)this.k).getValue()).booleanValue();
        int v1 = 0;
        for(Object object2: list0) {
            l l1 = (l)object2;
            int v2 = z1 ? this.m(l1) : 1;
            if(hashMap0.containsKey(l1)) {
                arr_object[((X)l1).b] = hashMap0.get(l1);
            }
            else if(((X)l1).e()) {
                if(z1) {
                    int v3 = v1 + v2;
                    for(int v4 = v1; v4 < v3; ++v4) {
                        int v5 = v4 / 0x20 + v;
                        Object object3 = arr_object[v5];
                        j.d(object3, "null cannot be cast to non-null type kotlin.Int");
                        arr_object[v5] = (int)(((int)(((Integer)object3))) | 1 << v4 % 0x20);
                    }
                }
                else {
                    int v6 = v1 / 0x20 + v;
                    Object object4 = arr_object[v6];
                    j.d(object4, "null cannot be cast to non-null type kotlin.Int");
                    arr_object[v6] = (int)(((int)(((Integer)object4))) | 1 << v1 % 0x20);
                }
                z = true;
            }
            else if(!((X)l1).f()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + ((X)l1));
            }
            if(((X)l1).c == O2.k.k) {
                v1 += v2;
            }
        }
        if(!z) {
            try {
                g g1 = this.i();
                Object[] arr_object1 = Arrays.copyOf(arr_object, v);
                j.e(arr_object1, "copyOf(...)");
                return g1.u(arr_object1);
            }
            catch(IllegalAccessException illegalAccessException2) {
                throw new IllegalCallableAccessException(illegalAccessException2);  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V
            }
        }
        g g2 = this.k();
        if(g2 != null) {
            try {
                return g2.u(arr_object);
            }
            catch(IllegalAccessException illegalAccessException3) {
                throw new IllegalCallableAccessException(illegalAccessException3);  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V
            }
        }
        throw new H2.a("This callable does not support a default call: " + this.l(), 1);
    }

    // 去混淆评级： 低(20)
    public final boolean q() {
        return j.a(this.getName(), "<init>") && this.j().a().isAnnotation();
    }

    public abstract boolean r();
}

