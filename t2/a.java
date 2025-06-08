package T2;

import g3.x;
import java.util.LinkedHashSet;
import v3.b;
import v3.c;
import x2.j;

public abstract class a {
    public static final LinkedHashSet a;
    public static final b b;

    static {
        Iterable iterable0 = j.z(new c[]{x.a, x.h, x.i, x.c, x.d, x.f});
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        for(Object object0: iterable0) {
            linkedHashSet0.add(b.j(((c)object0)));
        }
        a.a = linkedHashSet0;
        a.b = b.j(x.g);
    }
}

