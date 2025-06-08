package androidx.activity;

import androidx.lifecycle.B;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.n;

class ComponentActivity.5 implements l {
    public final e i;

    public ComponentActivity.5(e e0) {
        this.i = e0;
    }

    @Override  // androidx.lifecycle.l
    public final void a(n n0, g g0) {
        e e0 = this.i;
        if(e0.m == null) {
            d d0 = (d)e0.getLastNonConfigurationInstance();
            if(d0 != null) {
                e0.m = d0.a;
            }
            if(e0.m == null) {
                e0.m = new B();
            }
        }
        e0.k.b(this);
    }
}

