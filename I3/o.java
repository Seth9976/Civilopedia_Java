package I3;

import I2.a;
import J2.j;
import J2.l;
import R2.o0;
import X2.k;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import w2.c;
import x2.g;
import x2.i;
import x2.r;

public final class o extends l implements a {
    public final int i;
    public final Object j;
    public final Object k;
    public final int l;

    public o(s s0, w3.l l0, int v, int v1) {
        this.i = v1;
        this.j = s0;
        this.k = l0;
        this.l = v;
        super(0);
    }

    public o(o0 o00, int v, c c0) {
        this.i = 2;
        this.j = o00;
        this.l = v;
        this.k = c0;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        Type type1;
        switch(this.i) {
            case 0: {
                s s0 = (s)this.j;
                v v1 = s0.a(((k)s0.a.k));
                List list0 = v1 == null ? null : i.o0(((I3.i)s0.a.i).e.d(v1, ((w3.l)this.k), this.l));
                return list0 == null ? r.i : list0;
            }
            case 1: {
                s s1 = (s)this.j;
                v v2 = s1.a(((k)s1.a.k));
                List list1 = v2 == null ? null : ((I3.i)s1.a.i).e.l(v2, ((w3.l)this.k), this.l);
                return list1 == null ? r.i : list1;
            }
            default: {
                o0 o00 = (o0)this.j;
                Type type0 = o00.b == null ? null : ((Type)o00.b.invoke());
                if(type0 instanceof Class) {
                    type1 = ((Class)type0).isArray() ? ((Class)type0).getComponentType() : Object.class;
                    j.c(type1);
                    return type1;
                }
                int v = this.l;
                if(type0 instanceof GenericArrayType) {
                    if(v != 0) {
                        throw new H2.a("Array type has been queried for a non-0th argument: " + o00, 1);
                    }
                    type1 = ((GenericArrayType)type0).getGenericComponentType();
                    j.c(type1);
                    return type1;
                }
                if(!(type0 instanceof ParameterizedType)) {
                    throw new H2.a("Non-generic type has been queried for arguments: " + o00, 1);
                }
                type1 = (Type)((List)((c)this.k).getValue()).get(v);
                if(type1 instanceof WildcardType) {
                    Type[] arr_type = ((WildcardType)type1).getLowerBounds();
                    j.e(arr_type, "getLowerBounds(...)");
                    Type type2 = (Type)g.H(arr_type);
                    if(type2 == null) {
                        Type[] arr_type1 = ((WildcardType)type1).getUpperBounds();
                        j.e(arr_type1, "getUpperBounds(...)");
                        type1 = (Type)g.G(arr_type1);
                    }
                    else {
                        type1 = type2;
                    }
                }
                j.c(type1);
                return type1;
            }
        }
    }
}

