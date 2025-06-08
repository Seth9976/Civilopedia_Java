package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.n;

class Fragment.2 implements l {
    public final h i;

    public Fragment.2(h h0) {
        this.i = h0;
    }

    @Override  // androidx.lifecycle.l
    public final void a(n n0, g g0) {
        if(g0 == g.ON_STOP) {
            View view0 = this.i.O;
            if(view0 != null) {
                view0.cancelPendingInputEvents();
            }
        }
    }
}

