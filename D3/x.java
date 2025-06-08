package d3;

import J2.j;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import m3.e;

public final class x extends w implements e {
    public final Method a;

    public x(Method method0) {
        j.f(method0, "member");
        super();
        this.a = method0;
    }

    @Override  // d3.w
    public final Member b() {
        return this.a;
    }

    public final B f() {
        Type type0 = this.a.getGenericReturnType();
        j.e(type0, "getGenericReturnType(...)");
        if(type0 instanceof Class && ((Class)type0).isPrimitive()) {
            return new z(((Class)type0));
        }
        if(!(type0 instanceof GenericArrayType) && (!(type0 instanceof Class) || !((Class)type0).isArray())) {
            return type0 instanceof WildcardType ? new E(((WildcardType)type0)) : new q(type0);
        }
        return new i(type0);
    }

    public final List g() {
        Type[] arr_type = this.a.getGenericParameterTypes();
        j.e(arr_type, "getGenericParameterTypes(...)");
        Annotation[][] arr2_annotation = this.a.getParameterAnnotations();
        j.e(arr2_annotation, "getParameterAnnotations(...)");
        return this.d(arr_type, arr2_annotation, this.a.isVarArgs());
    }

    @Override  // m3.e
    public final ArrayList u() {
        TypeVariable[] arr_typeVariable = this.a.getTypeParameters();
        j.e(arr_typeVariable, "getTypeParameters(...)");
        ArrayList arrayList0 = new ArrayList(arr_typeVariable.length);
        for(int v = 0; v < arr_typeVariable.length; ++v) {
            arrayList0.add(new C(arr_typeVariable[v]));
        }
        return arrayList0;
    }
}

