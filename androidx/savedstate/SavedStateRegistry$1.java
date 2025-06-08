package androidx.savedstate;

import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.n;

class SavedStateRegistry.1 implements l {
    public final c i;

    public SavedStateRegistry.1(c c0) {
        this.i = c0;
    }

    @Override  // androidx.lifecycle.l
    public final void a(n n0, g g0) {
        c c0 = this.i;
        if(g0 == g.ON_START) {
            c0.e = true;
            return;
        }
        if(g0 == g.ON_STOP) {
            c0.e = false;
        }
    }
}

