package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.n;

class ComponentActivity.3 implements l {
    public final e i;

    public ComponentActivity.3(e e0) {
        this.i = e0;
    }

    @Override  // androidx.lifecycle.l
    public final void a(n n0, g g0) {
        if(g0 == g.ON_STOP) {
            Window window0 = this.i.getWindow();
            View view0 = window0 == null ? null : window0.peekDecorView();
            if(view0 != null) {
                view0.cancelPendingInputEvents();
            }
        }
    }
}

