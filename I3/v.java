package I3;

import X2.O;
import a3.s;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import s3.f;
import v3.c;

public abstract class v {
    public final int a;
    public Object b;
    public Object c;
    public Object d;

    public v() {
        this.a = 1;
        super();
    }

    public v(f f0, s s0, O o0) {
        this.a = 0;
        super();
        this.b = f0;
        this.c = s0;
        this.d = o0;
    }

    public abstract void a();

    public abstract Object b(int arg1, int arg2);

    public abstract Map c();

    public abstract int d();

    public abstract int e(Object arg1);

    public abstract int f(Object arg1);

    public abstract void g(Object arg1, Object arg2);

    public abstract void h(int arg1);

    public abstract Object i(int arg1, Object arg2);

    public abstract c j();

    public static boolean k(Set set0, Object object0) {
        if(set0 == object0) {
            return true;
        }
        if(object0 instanceof Set) {
            Set set1 = (Set)object0;
            try {
                return set0.size() != set1.size() || !set0.containsAll(set1) ? false : true;
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
        }
        return false;
    }

    public static boolean l(Map map0, Collection collection0) {
        int v = map0.size();
        Iterator iterator0 = map0.keySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(!collection0.contains(object0)) {
                iterator0.remove();
            }
        }
        return v != map0.size();
    }

    public Object[] m(int v, Object[] arr_object) {
        int v1 = this.d();
        if(arr_object.length < v1) {
            arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v1);
        }
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_object[v2] = this.b(v2, v);
        }
        if(arr_object.length > v1) {
            arr_object[v1] = null;
        }
        return arr_object;
    }

    @Override
    public String toString() {
        return this.a == 0 ? this.getClass().getSimpleName() + ": " + this.j() : super.toString();
    }
}

