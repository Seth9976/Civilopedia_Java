package n2;

import I2.b;
import J2.i;
import J2.j;

public final class r extends i implements b {
    public final int q;

    public r(int v, Object object0, Class class0, String s, String s1, int v1, int v2) {
        this.q = v2;
        super(v, object0, class0, s, s1, v1);
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        if(this.q != 0) {
            j.f(((t)object0), "p0");
            ((s)this.j).getClass();
            return Boolean.valueOf(!((s)this.j).c(((t)object0)));
        }
        j.f(((t)object0), "p0");
        return Boolean.valueOf(((s)this.j).c(((t)object0)));
    }
}

