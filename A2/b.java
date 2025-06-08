package A2;

import I2.c;
import J2.j;
import J2.l;

public final class b extends l implements c {
    public final int i;
    public static final b j;
    public static final b k;

    static {
        b.j = new b(2, 0);
        b.k = new b(2, 1);
    }

    public b(int v, int v1) {
        this.i = v1;
        super(v);
    }

    @Override  // I2.c
    public final Object a(Object object0, Object object1) {
        if(this.i != 0) {
            j.f(((h)object0), "acc");
            j.f(((f)object1), "element");
            h h0 = ((h)object0).minusKey(((f)object1).getKey());
            if(h0 != i.i) {
                if(h0.get(e.a) != null) {
                    throw new ClassCastException();
                }
                return new A2.c(h0, ((f)object1));
            }
            return (f)object1;
        }
        j.f(((String)object0), "acc");
        j.f(((f)object1), "element");
        return ((String)object0).length() == 0 ? ((f)object1).toString() : ((String)object0) + ", " + ((f)object1);
    }
}

