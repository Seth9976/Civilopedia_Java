package Y2;

import J2.j;
import M3.S;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import v3.c;

public final class l implements h {
    public final h i;
    public final S j;

    public l(h h0, S s0) {
        this.i = h0;
        this.j = s0;
    }

    @Override  // Y2.h
    public final b c(c c0) {
        j.f(c0, "fqName");
        return ((Boolean)this.j.b(c0)).booleanValue() ? this.i.c(c0) : null;
    }

    @Override  // Y2.h
    public final boolean e(c c0) {
        j.f(c0, "fqName");
        return ((Boolean)this.j.b(c0)).booleanValue() ? this.i.e(c0) : false;
    }

    @Override  // Y2.h
    public final boolean isEmpty() {
        h h0 = this.i;
        if(!(h0 instanceof Collection) || !((Collection)h0).isEmpty()) {
            for(Object object0: h0) {
                c c0 = ((b)object0).a();
                if(c0 != null && ((Boolean)this.j.b(c0)).booleanValue()) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.i) {
            c c0 = ((b)object0).a();
            if(c0 != null && ((Boolean)this.j.b(c0)).booleanValue()) {
                arrayList0.add(object0);
            }
        }
        return arrayList0.iterator();
    }
}

