package androidx.activity;

import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.n;

class ComponentActivity.4 implements l {
    public final e i;

    public ComponentActivity.4(e e0) {
        this.i = e0;
    }

    @Override  // androidx.lifecycle.l
    public final void a(n n0, g g0) {
        if(g0 == g.ON_DESTROY) {
            e e0 = this.i;
            e0.j.getClass();
            if(!e0.isChangingConfigurations()) {
                e0.getViewModelStore().a();
            }
        }
    }
}

