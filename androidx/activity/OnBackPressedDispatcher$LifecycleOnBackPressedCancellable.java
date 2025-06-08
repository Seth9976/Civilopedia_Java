package androidx.activity;

import androidx.fragment.app.m;
import androidx.lifecycle.i;
import androidx.lifecycle.l;
import androidx.lifecycle.n;

class OnBackPressedDispatcher.LifecycleOnBackPressedCancellable implements a, l {
    public final i i;
    public final m j;
    public f k;
    public final g l;

    public OnBackPressedDispatcher.LifecycleOnBackPressedCancellable(g g0, i i0, m m0) {
        this.l = g0;
        this.i = i0;
        this.j = m0;
        i0.a(this);
    }

    @Override  // androidx.lifecycle.l
    public final void a(n n0, androidx.lifecycle.g g0) {
        if(g0 == androidx.lifecycle.g.ON_START) {
            this.l.b.add(this.j);
            f f0 = new f(this.l, this.j);
            this.j.b.add(f0);
            this.k = f0;
            return;
        }
        if(g0 == androidx.lifecycle.g.ON_STOP) {
            f f1 = this.k;
            if(f1 != null) {
                f1.cancel();
            }
        }
        else if(g0 == androidx.lifecycle.g.ON_DESTROY) {
            this.cancel();
        }
    }

    @Override  // androidx.activity.a
    public final void cancel() {
        this.i.b(this);
        this.j.b.remove(this);
        f f0 = this.k;
        if(f0 != null) {
            f0.cancel();
            this.k = null;
        }
    }
}

