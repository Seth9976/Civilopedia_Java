package S2;

import J2.j;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import o1.a;
import o2.G;
import x2.g;
import x2.r;

public final class u extends q implements f {
    public final Object[] g;

    public u(Method method0, Object[] arr_object) {
        j.f(method0, "method");
        List list0;
        j.f(arr_object, "boundReceiverComponents");
        Type[] arr_type = method0.getGenericParameterTypes();
        j.e(arr_type, "getGenericParameterTypes(...)");
        if(arr_object.length < 0) {
            throw new IllegalArgumentException(A.f.e(arr_object.length, "Requested element count ", " is less than zero.").toString());
        }
        int v = arr_type.length - arr_object.length >= 0 ? arr_type.length - arr_object.length : 0;
        if(v == 0) {
            list0 = r.i;
        }
        else if(v >= arr_type.length) {
            list0 = g.Q(arr_type);
        }
        else if(v == 1) {
            list0 = G.p(arr_type[arr_type.length - 1]);
        }
        else {
            ArrayList arrayList0 = new ArrayList(v);
            for(int v1 = arr_type.length - v; v1 < arr_type.length; ++v1) {
                arrayList0.add(arr_type[v1]);
            }
            list0 = arrayList0;
        }
        super(method0, false, ((Type[])list0.toArray(new Type[0])));
        this.g = arr_object;
    }

    @Override  // S2.q
    public final Object u(Object[] arr_object) {
        j.f(arr_object, "args");
        a.b(this, arr_object);
        J2.u u0 = new J2.u(2);
        u0.b(this.g);
        u0.b(arr_object);
        return this.c(u0.a.toArray(new Object[u0.a.size()]), null);
    }
}

