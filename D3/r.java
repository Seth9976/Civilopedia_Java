package d3;

import J2.j;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import m3.e;

public final class r extends w implements e {
    public final Constructor a;

    public r(Constructor constructor0) {
        j.f(constructor0, "member");
        super();
        this.a = constructor0;
    }

    @Override  // d3.w
    public final Member b() {
        return this.a;
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

