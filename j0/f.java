package j0;

import O2.A;

public final class f extends A {
    @Override  // O2.A
    public final void V(g g0, g g1) {
        g0.b = g1;
    }

    @Override  // O2.A
    public final void W(g g0, Thread thread0) {
        g0.a = thread0;
    }

    @Override  // O2.A
    public final boolean h(h h0, c c0, c c1) {
        synchronized(h0) {
            if(h0.j == c0) {
                h0.j = c1;
                return true;
            }
        }
        return false;
    }

    @Override  // O2.A
    public final boolean i(h h0, Object object0, Object object1) {
        synchronized(h0) {
            if(h0.i == object0) {
                h0.i = object1;
                return true;
            }
        }
        return false;
    }

    @Override  // O2.A
    public final boolean j(h h0, g g0, g g1) {
        synchronized(h0) {
            if(h0.k == g0) {
                h0.k = g1;
                return true;
            }
        }
        return false;
    }
}

