package O2;

import J2.j;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

public final class a implements GenericArrayType, Type {
    public final Type i;

    public a(Type type0) {
        j.f(type0, "elementType");
        super();
        this.i = type0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof GenericArrayType) {
            Type type0 = ((GenericArrayType)object0).getGenericComponentType();
            return j.a(this.i, type0);
        }
        return false;
    }

    @Override
    public final Type getGenericComponentType() {
        return this.i;
    }

    @Override
    public final String getTypeName() {
        return A.a(this.i) + "[]";
    }

    @Override
    public final int hashCode() {
        return this.i.hashCode();
    }

    @Override
    public final String toString() {
        return this.getTypeName();
    }
}

