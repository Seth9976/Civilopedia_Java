package J2;

import A.f;
import K2.a;
import K2.c;
import java.util.Set;

public abstract class v {
    public static Set a(Object object0) {
        if(object0 instanceof a && !(object0 instanceof c)) {
            v.b(object0, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set)object0;
        }
        catch(ClassCastException classCastException0) {
            j.j(classCastException0, "J2.v");
            throw classCastException0;
        }
    }

    public static void b(Object object0, String s) {
        ClassCastException classCastException0 = new ClassCastException(f.i((object0 == null ? "null" : object0.getClass().getName()), " cannot be cast to ", s));
        j.j(classCastException0, "J2.v");
        throw classCastException0;
    }
}

