package d3;

import J2.j;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import m3.a;

public final class h extends f implements a {
    public final Object[] b;

    public h(v3.f f0, Object[] arr_object) {
        super(f0);
        this.b = arr_object;
    }

    public final ArrayList a() {
        t t0;
        Object[] arr_object = this.b;
        ArrayList arrayList0 = new ArrayList(arr_object.length);
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            j.c(object0);
            Class class0 = object0.getClass();
            if(Enum.class.isAssignableFrom(class0)) {
                t0 = new t(null, ((Enum)object0));
            }
            else if(object0 instanceof Annotation) {
                t0 = new g(null, ((Annotation)object0));
            }
            else if(object0 instanceof Object[]) {
                t0 = new h(null, ((Object[])object0));
            }
            else if(object0 instanceof Class) {
                t0 = new p(null, ((Class)object0));
            }
            else {
                t0 = new v(null, object0);
            }
            arrayList0.add(t0);
        }
        return arrayList0;
    }
}

