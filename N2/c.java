package n2;

import J2.j;
import java.util.ArrayList;
import x2.i;

public final class c {
    public final ArrayList a;

    public c(int v, ArrayList arrayList0) {
        if(v != 1) {
            super();
            this.a = new ArrayList();
            this.a = i.p0(arrayList0);
            return;
        }
        super();
        this.a = arrayList0;
    }

    public b a(t t0) {
        j.f(t0, "at");
        for(Object object0: this.a) {
            if(((b)object0).c.contains(t0)) {
                return (b)object0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public void b(t t0) {
        for(Object object0: this.a) {
            ((b)object0).getClass();
            ((b)object0).c.remove(t0);
        }
    }
}

