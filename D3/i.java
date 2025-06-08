package d3;

import J2.j;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import m3.d;
import x2.r;

public final class i extends B implements d {
    public final Type a;
    public final B b;
    public final r c;

    public i(Type type0) {
        i i0;
        z z0;
        this.a = type0;
        if(type0 instanceof GenericArrayType) {
            Type type1 = ((GenericArrayType)type0).getGenericComponentType();
            j.e(type1, "getGenericComponentType(...)");
            if(type1 instanceof Class && ((Class)type1).isPrimitive()) {
                z0 = new z(((Class)type1));
                this.b = z0;
                this.c = r.i;
                return;
            }
            if(!(type1 instanceof GenericArrayType) && (!(type1 instanceof Class) || !((Class)type1).isArray())) {
                if(type1 instanceof WildcardType) {
                    i0 = new E(((WildcardType)type1));
                    z0 = i0;
                    this.b = z0;
                    this.c = r.i;
                    return;
                }
                i0 = new q(type1);
                z0 = i0;
                this.b = z0;
                this.c = r.i;
                return;
            }
            i0 = new i(type1);
        }
        else if(type0 instanceof Class && ((Class)type0).isArray()) {
            Class class0 = ((Class)type0).getComponentType();
            j.e(class0, "getComponentType(...)");
            if(class0.isPrimitive()) {
                i0 = new z(class0);
            }
            else if(class0 instanceof GenericArrayType || class0.isArray()) {
                i0 = new i(class0);
            }
            else if(class0 instanceof WildcardType) {
                i0 = new E(((WildcardType)class0));
            }
            else {
                i0 = new q(class0);
            }
        }
        else {
            throw new IllegalArgumentException("Not an array type (" + type0.getClass() + "): " + type0);
        }
        z0 = i0;
        this.b = z0;
        this.c = r.i;
    }

    @Override  // d3.B
    public final Type b() {
        return this.a;
    }

    @Override  // m3.b
    public final Collection l() {
        return this.c;
    }
}

