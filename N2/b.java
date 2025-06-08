package n2;

import J2.j;
import java.util.ArrayList;
import java.util.Iterator;
import x2.k;

public final class b {
    public final int a;
    public final String b;
    public final ArrayList c;

    public b(int v, String s) {
        this(v, s, new ArrayList());
    }

    public b(int v, String s, ArrayList arrayList0) {
        j.f(s, "name");
        super();
        this.a = v;
        this.b = s;
        this.c = arrayList0;
    }

    public final int a(t t0) {
        Comparable comparable0;
        j.f(t0, "to");
        ArrayList arrayList0 = new ArrayList(k.E(this.c));
        for(Object object0: this.c) {
            arrayList0.add(((t)object0).b(t0));
        }
        Iterator iterator1 = arrayList0.iterator();
        if(iterator1.hasNext()) {
            Object object1 = iterator1.next();
            Comparable comparable1 = (Comparable)object1;
            while(iterator1.hasNext()) {
                Object object2 = iterator1.next();
                Comparable comparable2 = (Comparable)object2;
                if(comparable1.compareTo(comparable2) > 0) {
                    comparable1 = comparable2;
                }
            }
            comparable0 = comparable1;
        }
        else {
            comparable0 = null;
        }
        j.c(comparable0);
        return ((Number)comparable0).intValue();
    }
}

