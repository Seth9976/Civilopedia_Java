package androidx.activity;

import androidx.fragment.app.m;

public final class f implements a {
    public final m i;
    public final g j;

    public f(g g0, m m0) {
        this.j = g0;
        this.i = m0;
    }

    @Override  // androidx.activity.a
    public final void cancel() {
        this.j.b.remove(this.i);
        this.i.b.remove(this);
    }
}

