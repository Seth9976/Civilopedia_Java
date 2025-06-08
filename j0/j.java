package j0;

import n1.a;

public final class j extends h {
    public final boolean j(Object object0) {
        if(object0 == null) {
            object0 = h.o;
        }
        if(h.n.i(this, null, object0)) {
            h.c(this);
            return true;
        }
        return false;
    }

    public final boolean k(Throwable throwable0) {
        b b0 = new b(throwable0);
        if(h.n.i(this, null, b0)) {
            h.c(this);
            return true;
        }
        return false;
    }

    public final boolean l(a a0) {
        b b0;
        a0.getClass();
        Object object0 = this.i;
        if(object0 == null) {
            h h0 = (h)a0;
            if(h0.isDone()) {
                Object object1 = h.f(a0);
                if(h.n.i(this, null, object1)) {
                    h.c(this);
                    return true;
                }
            }
            else {
                e e0 = new e(this, a0);
                if(h.n.i(this, null, e0)) {
                    try {
                        h0.b(e0, i.i);
                    }
                    catch(Throwable throwable0) {
                        try {
                            b0 = new b(throwable0);
                        }
                        catch(Throwable unused_ex) {
                            b0 = b.b;
                        }
                        h.n.i(this, e0, b0);
                    }
                    return true;
                }
                object0 = this.i;
                goto label_20;
            }
        }
        else {
        label_20:
            if(object0 instanceof j0.a) {
                ((h)a0).cancel(((j0.a)object0).a);
            }
        }
        return false;
    }
}

