package p;

import I3.v;
import java.util.Map;

public final class a extends v {
    public final int e;
    public final Object f;

    public a(Object object0, int v) {
        this.e = v;
        super();
        this.f = object0;
    }

    @Override  // I3.v
    public final void a() {
        if(this.e != 0) {
            ((c)this.f).clear();
            return;
        }
        ((b)this.f).clear();
    }

    @Override  // I3.v
    public final Object b(int v, int v1) {
        return this.e == 0 ? ((b)this.f).j[(v << 1) + v1] : ((c)this.f).j[v];
    }

    @Override  // I3.v
    public final Map c() {
        if(this.e != 0) {
            throw new UnsupportedOperationException("not a map");
        }
        return (b)this.f;
    }

    @Override  // I3.v
    public final int d() {
        return this.e == 0 ? ((b)this.f).k : ((c)this.f).k;
    }

    @Override  // I3.v
    public final int e(Object object0) {
        return this.e == 0 ? ((b)this.f).f(object0) : ((c)this.f).indexOf(object0);
    }

    @Override  // I3.v
    public final int f(Object object0) {
        return this.e == 0 ? ((b)this.f).h(object0) : ((c)this.f).indexOf(object0);
    }

    @Override  // I3.v
    public final void g(Object object0, Object object1) {
        if(this.e != 0) {
            ((c)this.f).add(object0);
            return;
        }
        ((b)this.f).put(object0, object1);
    }

    @Override  // I3.v
    public final void h(int v) {
        if(this.e != 0) {
            ((c)this.f).k(v);
            return;
        }
        ((b)this.f).j(v);
    }

    @Override  // I3.v
    public final Object i(int v, Object object0) {
        if(this.e != 0) {
            throw new UnsupportedOperationException("not a map");
        }
        int v1 = (v << 1) + 1;
        Object[] arr_object = ((b)this.f).j;
        Object object1 = arr_object[v1];
        arr_object[v1] = object0;
        return object1;
    }
}

