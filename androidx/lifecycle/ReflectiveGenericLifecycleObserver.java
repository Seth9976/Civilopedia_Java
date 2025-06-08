package androidx.lifecycle;

import java.util.List;

class ReflectiveGenericLifecycleObserver implements l {
    public final m i;
    public final a j;

    public ReflectiveGenericLifecycleObserver(m m0) {
        this.i = m0;
        c c0 = c.c;
        Class class0 = m0.getClass();
        a a0 = (a)c0.a.get(class0);
        if(a0 == null) {
            a0 = c0.a(class0, null);
        }
        this.j = a0;
    }

    @Override  // androidx.lifecycle.l
    public final void a(n n0, g g0) {
        a.a(((List)this.j.a.get(g0)), n0, g0, this.i);
        a.a(((List)this.j.a.get(g.ON_ANY)), n0, g0, this.i);
    }
}

