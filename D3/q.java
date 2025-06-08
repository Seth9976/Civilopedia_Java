package d3;

import J2.j;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import m3.d;
import v3.c;
import x2.k;
import x2.r;

public final class q extends B implements d {
    public final Type a;
    public final s b;

    public q(Type type0) {
        j.f(type0, "reflectType");
        o o0;
        super();
        this.a = type0;
        if(type0 instanceof Class) {
            o0 = new o(((Class)type0));
        }
        else if(type0 instanceof TypeVariable) {
            o0 = new C(((TypeVariable)type0));
        }
        else if(type0 instanceof ParameterizedType) {
            Type type1 = ((ParameterizedType)type0).getRawType();
            j.d(type1, "null cannot be cast to non-null type java.lang.Class<*>");
            o0 = new o(((Class)type1));
        }
        else {
            throw new IllegalStateException("Not a classifier type (" + type0.getClass() + "): " + type0);
        }
        this.b = o0;
    }

    @Override  // d3.B, m3.b
    public final e a(c c0) {
        j.f(c0, "fqName");
        return null;
    }

    @Override  // d3.B
    public final Type b() {
        return this.a;
    }

    public final ArrayList c() {
        z z1;
        i i0;
        Iterable iterable0 = d3.d.c(this.a);
        ArrayList arrayList0 = new ArrayList(k.E(iterable0));
        for(Object object0: iterable0) {
            Type type0 = (Type)object0;
            j.f(type0, "type");
            boolean z = type0 instanceof Class;
            if(!z || !((Class)type0).isPrimitive()) {
                if(type0 instanceof GenericArrayType || z && ((Class)type0).isArray()) {
                    i0 = new i(type0);
                }
                else if(type0 instanceof WildcardType) {
                    i0 = new E(((WildcardType)type0));
                }
                else {
                    i0 = new q(type0);
                }
                z1 = i0;
            }
            else {
                z1 = new z(((Class)type0));
            }
            arrayList0.add(z1);
        }
        return arrayList0;
    }

    public final boolean d() {
        Type type0 = this.a;
        if(type0 instanceof Class) {
            TypeVariable[] arr_typeVariable = ((Class)type0).getTypeParameters();
            j.e(arr_typeVariable, "getTypeParameters(...)");
            return arr_typeVariable.length != 0;
        }
        return false;
    }

    @Override  // m3.b
    public final Collection l() {
        return r.i;
    }
}

