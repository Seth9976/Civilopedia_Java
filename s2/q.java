package S2;

import J2.j;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import o1.a;
import w2.k;
import x2.g;

public abstract class q extends w {
    public final int e;
    public final boolean f;

    public q(Field field0, boolean z, boolean z1) {
        this.e = 0;
        Class class0 = Void.TYPE;
        j.e(class0, "TYPE");
        Class class1 = z1 ? field0.getDeclaringClass() : null;
        Type type0 = field0.getGenericType();
        j.e(type0, "getGenericType(...)");
        super(field0, class0, class1, new Type[]{type0});
        this.f = z;
    }

    public q(Method method0, boolean z, int v) {
        this.e = 1;
        if((v & 2) != 0) {
            z = !Modifier.isStatic(method0.getModifiers());
        }
        Type[] arr_type = method0.getGenericParameterTypes();
        j.e(arr_type, "getGenericParameterTypes(...)");
        this(method0, z, arr_type);
    }

    public q(Method method0, boolean z, Type[] arr_type) {
        this.e = 1;
        Type type0 = method0.getGenericReturnType();
        j.e(type0, "getGenericReturnType(...)");
        super(method0, type0, (z ? method0.getDeclaringClass() : null), arr_type);
        this.f = type0.equals(Void.TYPE);
    }

    @Override  // S2.w
    public void a(Object[] arr_object) {
        if(this.e != 0) {
            super.a(arr_object);
            return;
        }
        j.f(arr_object, "args");
        a.b(this, arr_object);
        if(this.f && g.N(arr_object) == null) {
            throw new IllegalArgumentException("null is not allowed as a value for this property.");
        }
    }

    public Object c(Object[] arr_object, Object object0) {
        j.f(arr_object, "args");
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        k k0 = ((Method)this.a).invoke(object0, arr_object1);
        return this.f ? k.a : k0;
    }

    @Override  // S2.g
    public Object u(Object[] arr_object) {
        j.f(arr_object, "args");
        this.a(arr_object);
        Object object0 = this.c == null ? null : g.G(arr_object);
        ((Field)this.a).set(object0, g.N(arr_object));
        return k.a;
    }
}

