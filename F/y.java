package f;

import B.c;
import android.support.v4.media.session.a;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;

public final class y extends a {
    public final int d;
    public final A e;

    public y(A a0, int v) {
        this.d = v;
        this.e = a0;
        super();
    }

    @Override  // E.v
    public final void a() {
        A a0 = this.e;
        if(this.d != 0) {
            a0.v = null;
            a0.g.requestLayout();
            return;
        }
        if(a0.r) {
            View view0 = a0.j;
            if(view0 != null) {
                view0.setTranslationY(0.0f);
                a0.g.setTranslationY(0.0f);
            }
        }
        a0.g.setVisibility(8);
        a0.g.setTransitioning(false);
        a0.v = null;
        c c0 = a0.n;
        if(c0 != null) {
            c0.B(a0.m);
            a0.m = null;
            a0.n = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout0 = a0.f;
        if(actionBarOverlayLayout0 != null) {
            actionBarOverlayLayout0.requestApplyInsets();
        }
    }
}

