package A2;

import J2.j;
import java.io.Serializable;

public final class c implements h, Serializable {
    public final h i;
    public final f j;

    public c(h h0, f f0) {
        j.f(h0, "left");
        j.f(f0, "element");
        super();
        this.i = h0;
        this.j = f0;
    }

    @Override
    public final boolean equals(Object object0) {
        h h0;
        if(this != object0) {
            if(object0 instanceof c) {
                ((c)object0).getClass();
                int v = 2;
                c c0 = (c)object0;
                int v1;
                for(v1 = 2; true; ++v1) {
                    c0 = c0.i instanceof c ? ((c)c0.i) : null;
                    if(c0 == null) {
                        break;
                    }
                }
                c c1 = this;
                while(true) {
                    c1 = c1.i instanceof c ? ((c)c1.i) : null;
                    if(c1 == null) {
                        break;
                    }
                    ++v;
                }
                if(v1 == v) {
                    for(c c2 = this; true; c2 = (c)h0) {
                        if(!j.a(((c)object0).get(c2.j.getKey()), c2.j)) {
                            return false;
                        }
                        h0 = c2.i;
                        if(!(h0 instanceof c)) {
                            break;
                        }
                    }
                    j.d(h0, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    return j.a(((c)object0).get(((f)h0).getKey()), ((f)h0));
                }
            }
            return false;
        }
        return true;
    }

    @Override  // A2.h
    public final Object fold(Object object0, I2.c c0) {
        return c0.a(this.i.fold(object0, c0), this.j);
    }

    @Override  // A2.h
    public final f get(g g0) {
        h h0;
        j.f(g0, "key");
        for(c c0 = this; true; c0 = (c)h0) {
            f f0 = c0.j.get(g0);
            if(f0 != null) {
                return f0;
            }
            h0 = c0.i;
            if(!(h0 instanceof c)) {
                break;
            }
        }
        return h0.get(g0);
    }

    @Override
    public final int hashCode() {
        return this.j.hashCode() + this.i.hashCode();
    }

    @Override  // A2.h
    public final h minusKey(g g0) {
        j.f(g0, "key");
        h h0 = this.j;
        f f0 = h0.get(g0);
        h h1 = this.i;
        if(f0 != null) {
            return h1;
        }
        h h2 = h1.minusKey(g0);
        if(h2 == h1) {
            return this;
        }
        return h2 != i.i ? new c(h2, ((f)h0)) : h0;
    }

    @Override
    public final String toString() {
        return "[" + ((String)this.fold("", b.j)) + ']';
    }
}

