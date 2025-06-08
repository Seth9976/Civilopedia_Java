package O2;

import J2.j;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import x2.g;

public final class w implements ParameterizedType, Type {
    public final Class i;
    public final Type j;
    public final Type[] k;

    public w(Class class0, Type type0, ArrayList arrayList0) {
        this.i = class0;
        this.j = type0;
        this.k = (Type[])arrayList0.toArray(new Type[0]);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof ParameterizedType) {
            Type type0 = ((ParameterizedType)object0).getRawType();
            if(j.a(this.i, type0)) {
                Type type1 = ((ParameterizedType)object0).getOwnerType();
                if(j.a(this.j, type1)) {
                    Type[] arr_type = ((ParameterizedType)object0).getActualTypeArguments();
                    return Arrays.equals(this.k, arr_type);
                }
            }
        }
        return false;
    }

    @Override
    public final Type[] getActualTypeArguments() {
        return this.k;
    }

    @Override
    public final Type getOwnerType() {
        return this.j;
    }

    @Override
    public final Type getRawType() {
        return this.i;
    }

    @Override
    public final String getTypeName() {
        StringBuilder stringBuilder0 = new StringBuilder();
        Class class0 = this.i;
        Type type0 = this.j;
        if(type0 == null) {
            stringBuilder0.append(A.a(class0));
        }
        else {
            stringBuilder0.append(A.a(type0));
            stringBuilder0.append("$");
            stringBuilder0.append(class0.getSimpleName());
        }
        Type[] arr_type = this.k;
        if(arr_type.length != 0) {
            g.L(arr_type, stringBuilder0, ", ", "<", ">", "...", v.q);
        }
        String s = stringBuilder0.toString();
        j.e(s, "toString(...)");
        return s;
    }

    @Override
    public final int hashCode() {
        int v = this.i.hashCode();
        return this.j == null ? v ^ Arrays.hashCode(this.k) : v ^ this.j.hashCode() ^ Arrays.hashCode(this.k);
    }

    @Override
    public final String toString() {
        return this.getTypeName();
    }
}

