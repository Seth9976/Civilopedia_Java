package u;

import E.d;
import O2.A;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.h;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import androidx.lifecycle.y;

public abstract class f extends Activity implements d, n {
    public p i;

    @Override  // E.d
    public final boolean a(KeyEvent keyEvent0) {
        return super.dispatchKeyEvent(keyEvent0);
    }

    @Override  // android.app.Activity
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        View view0 = this.getWindow().getDecorView();
        return view0 == null || !A.r(view0, keyEvent0) ? A.s(this, view0, this, keyEvent0) : true;
    }

    @Override  // android.app.Activity
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent0) {
        View view0 = this.getWindow().getDecorView();
        return view0 == null || !A.r(view0, keyEvent0) ? super.dispatchKeyShortcutEvent(keyEvent0) : true;
    }

    @Override  // android.app.Activity
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        y.c(this);
    }

    @Override  // android.app.Activity
    public void onSaveInstanceState(Bundle bundle0) {
        p p0 = this.i;
        p0.d("markState");
        p0.d("setCurrentState");
        p0.f(h.k);
        super.onSaveInstanceState(bundle0);
    }
}

