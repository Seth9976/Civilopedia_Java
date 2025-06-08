package e0;

import Y.m;
import d0.c;
import f0.d;
import h0.i;
import java.util.ArrayList;
import java.util.Collection;

public abstract class b {
    public final ArrayList a;
    public Object b;
    public final d c;
    public c d;

    public b(d d0) {
        this.a = new ArrayList();
        this.c = d0;
    }

    public abstract boolean a(i arg1);

    public abstract boolean b(Object arg1);

    public final void c(Collection collection0) {
        this.a.clear();
        for(Object object0: collection0) {
            i i0 = (i)object0;
            if(this.a(i0)) {
                this.a.add(i0.a);
            }
        }
        if(this.a.isEmpty()) {
            this.c.b(this);
        }
        else {
            d d0 = this.c;
            synchronized(d0.c) {
                if(d0.d.add(this)) {
                    if(d0.d.size() == 1) {
                        d0.e = d0.a();
                        m.d().a("WM-ConstraintTracker", String.format("%s: initial state = %s", d0.getClass().getSimpleName(), d0.e), new Throwable[0]);
                        d0.d();
                    }
                    this.b = d0.e;
                    this.d(this.d, d0.e);
                }
            }
        }
        this.d(this.d, this.b);
    }

    public final void d(c c0, Object object0) {
        if(!this.a.isEmpty() && c0 != null) {
            if(object0 != null && !this.b(object0)) {
                Object object1 = c0.c;
                synchronized(object1) {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object2: this.a) {
                        String s = (String)object2;
                        if(c0.a(s)) {
                            m.d().a(c.d, "Constraints met for " + s, new Throwable[0]);
                            arrayList0.add(s);
                        }
                    }
                    d0.b b0 = c0.a;
                    if(b0 != null) {
                        b0.e(arrayList0);
                    }
                }
                return;
            }
            c0.b(this.a);
        }
    }
}

