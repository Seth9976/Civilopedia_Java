package d3;

import J2.j;
import O2.A;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import v3.f;

public final class e extends s {
    public final Annotation a;

    public e(Annotation annotation0) {
        j.f(annotation0, "annotation");
        super();
        this.a = annotation0;
    }

    public final ArrayList b() {
        t t0;
        Annotation annotation0 = this.a;
        Method[] arr_method = A.y(A.v(annotation0)).getDeclaredMethods();
        j.e(arr_method, "getDeclaredMethods(...)");
        ArrayList arrayList0 = new ArrayList(arr_method.length);
        for(int v = 0; v < arr_method.length; ++v) {
            Method method0 = arr_method[v];
            Object object0 = method0.invoke(annotation0, null);
            j.e(object0, "invoke(...)");
            f f0 = f.e(method0.getName());
            Class class0 = object0.getClass();
            if(Enum.class.isAssignableFrom(class0)) {
                t0 = new t(f0, ((Enum)object0));
            }
            else if(object0 instanceof Annotation) {
                t0 = new g(f0, ((Annotation)object0));
            }
            else if(object0 instanceof Object[]) {
                t0 = new h(f0, ((Object[])object0));
            }
            else if(object0 instanceof Class) {
                t0 = new p(f0, ((Class)object0));
            }
            else {
                t0 = new v(f0, object0);
            }
            arrayList0.add(t0);
        }
        return arrayList0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof e && this.a == ((e)object0).a;
    }

    @Override
    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    @Override
    public final String toString() {
        return e.class.getName() + ": " + this.a;
    }
}

