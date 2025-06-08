package Y2;

import J2.j;
import O2.A;
import X2.G;
import X3.l;
import X3.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import v3.c;
import x2.g;
import x2.q;

public final class i implements h {
    public final int i;
    public final Object j;

    public i(List list0, int v) {
        this.i = v;
        this.j = list0;
        super();
    }

    public i(c c0) {
        this.i = 2;
        j.f(c0, "fqNameToMatch");
        super();
        this.j = c0;
    }

    public i(h[] arr_h) {
        this.i = 1;
        List list0 = g.Q(arr_h);
        super();
        this.j = list0;
    }

    @Override  // Y2.h
    public final b c(c c0) {
        switch(this.i) {
            case 0: {
                return A.t(this, c0);
            }
            case 1: {
                j.f(c0, "fqName");
                S3.b b0 = new S3.b(l.x0(x2.i.L(((List)this.j)), new G(c0, 1)));
                return !b0.hasNext() ? null : ((b)b0.next());
            }
            default: {
                j.f(c0, "fqName");
                return c0.equals(((c)this.j)) ? n3.b.a : null;
            }
        }
    }

    @Override  // Y2.h
    public final boolean e(c c0) {
        switch(this.i) {
            case 0: {
                return A.J(this, c0);
            }
            case 1: {
                j.f(c0, "fqName");
                for(Object object0: ((Iterable)x2.i.L(((List)this.j)).b)) {
                    if(((h)object0).e(c0)) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
                return false;
            }
            default: {
                return A.J(this, c0);
            }
        }
    }

    @Override  // Y2.h
    public final boolean isEmpty() {
        switch(this.i) {
            case 0: {
                return ((List)this.j).isEmpty();
            }
            case 1: {
                Iterable iterable0 = (List)this.j;
                if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                    for(Object object0: iterable0) {
                        if(!((h)object0).isEmpty()) {
                            return false;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override
    public final Iterator iterator() {
        switch(this.i) {
            case 0: {
                return ((List)this.j).iterator();
            }
            case 1: {
                return new X3.g(new X3.h(x2.i.L(((List)this.j)), k.i, p.q));
            }
            default: {
                return q.i;
            }
        }
    }

    @Override
    public String toString() {
        return this.i == 0 ? ((List)this.j).toString() : super.toString();
    }
}

