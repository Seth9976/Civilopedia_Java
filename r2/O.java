package R2;

import B.d;
import I2.a;
import J2.j;
import J2.l;
import M3.w;
import O2.A;
import O2.k;
import X2.T;
import X2.h;
import a3.v;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import w2.c;
import x2.g;
import x2.i;
import x2.n;
import y3.f;

public final class o extends l implements a {
    public final int i;
    public final r j;

    public o(r r0, int v) {
        this.i = v;
        this.j = r0;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        int v6;
        int v1;
        k k0 = k.k;
        Type type0 = null;
        r r0 = this.j;
        switch(this.i) {
            case 0: {
                List list0 = r0.o();
                int v = r0.n() + list0.size();
                if(((Boolean)((c)r0.k).getValue()).booleanValue()) {
                    v1 = 0;
                    for(Object object1: list0) {
                        O2.l l0 = (O2.l)object1;
                        v1 += (((X)l0).c == k0 ? r0.m(l0) : 0);
                    }
                }
                else if(!(list0 instanceof Collection) || !list0.isEmpty()) {
                    v1 = 0;
                    for(Object object2: list0) {
                        if(((X)(((O2.l)object2))).c == k0) {
                            ++v1;
                            if(v1 < 0) {
                                throw new ArithmeticException("Count overflow has happened.");
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                }
                else {
                    v1 = 0;
                }
                int v2 = (v1 + 0x1F) / 0x20;
                Object[] arr_object = new Object[v + v2 + 1];
                for(Object object3: list0) {
                    X x0 = (X)(((O2.l)object3));
                    boolean z = x0.e();
                    int v3 = x0.b;
                    if(z) {
                        w w0 = x0.d().a;
                        if(w0 == null) {
                        label_49:
                            o0 o00 = x0.d();
                            s0 s00 = o00.b;
                            Type type1 = s00 == null ? null : ((Type)s00.invoke());
                            if(type1 == null) {
                                Type type2 = s00 == null ? null : ((Type)s00.invoke());
                                type1 = type2 == null ? A.l(o00, false) : type2;
                            }
                            arr_object[v3] = x0.e(type1);
                            continue;
                        }
                        else {
                            h h0 = w0.H0().q();
                            if(!(h0 == null ? false : f.b(h0))) {
                                goto label_49;
                            }
                        }
                    }
                    if(x0.f()) {
                        arr_object[v3] = r.h(x0.d());
                    }
                }
                for(int v4 = 0; v4 < v2; ++v4) {
                    arr_object[v + v4] = 0;
                }
                return arr_object;
            }
            case 1: {
                return x0.d(r0.l());
            }
            case 2: {
                X2.c c0 = r0.l();
                ArrayList arrayList0 = new ArrayList();
                if(r0.r()) {
                    v6 = 0;
                }
                else {
                    v v5 = x0.g(c0);
                    if(v5 == null) {
                        v6 = 0;
                    }
                    else {
                        p p0 = new p(v5, 0);
                        arrayList0.add(new X(r0, 0, k.i, p0));
                        v6 = 1;
                    }
                    v v7 = c0.J();
                    if(v7 != null) {
                        p p1 = new p(v7, 1);
                        arrayList0.add(new X(r0, v6, k.j, p1));
                        ++v6;
                    }
                }
                int v8 = c0.z0().size();
                int v9 = 0;
                while(v9 < v8) {
                    arrayList0.add(new X(r0, v6, k0, new q(v9, 0, c0)));
                    ++v9;
                    ++v6;
                }
                if(r0.q() && c0 instanceof i3.a && arrayList0.size() > 1) {
                    n.G(arrayList0, new d(4));
                }
                arrayList0.trimToSize();
                return arrayList0;
            }
            case 3: {
                if(r0.n()) {
                    Object object4 = i.b0(r0.i().s());
                    ParameterizedType parameterizedType0 = object4 instanceof ParameterizedType ? ((ParameterizedType)object4) : null;
                    if(j.a((parameterizedType0 == null ? null : parameterizedType0.getRawType()), A2.d.class)) {
                        Type[] arr_type = parameterizedType0.getActualTypeArguments();
                        j.e(arr_type, "getActualTypeArguments(...)");
                        Object object5 = g.O(arr_type);
                        WildcardType wildcardType0 = object5 instanceof WildcardType ? ((WildcardType)object5) : null;
                        if(wildcardType0 != null) {
                            Type[] arr_type1 = wildcardType0.getLowerBounds();
                            if(arr_type1 != null) {
                                type0 = (Type)g.G(arr_type1);
                            }
                        }
                    }
                }
                return type0 == null ? r0.i().r() : type0;
            }
            case 4: {
                w w1 = r0.l().r();
                j.c(w1);
                return new o0(w1, new o(r0, 3));
            }
            case 5: {
                List list1 = r0.l().u();
                j.e(list1, "getTypeParameters(...)");
                ArrayList arrayList1 = new ArrayList(x2.k.E(list1));
                for(Object object6: list1) {
                    j.c(((T)object6));
                    arrayList1.add(new p0(r0, ((T)object6)));
                }
                return arrayList1;
            }
            default: {
                Iterable iterable0 = r0.o();
                if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                    for(Object object0: iterable0) {
                        if(x0.h(((X)(((O2.l)object0))).d())) {
                            return true;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                return false;
            }
        }
    }
}

