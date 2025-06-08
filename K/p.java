package k;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import j.a;

public final class p extends FrameLayout implements a {
    public final CollapsibleActionView i;

    public p(View view0) {
        super(view0.getContext());
        this.i = (CollapsibleActionView)view0;
        this.addView(view0);
    }

    @Override  // j.a
    public final void b() {
        this.i.onActionViewExpanded();
    }

    @Override  // j.a
    public final void d() {
        this.i.onActionViewCollapsed();
    }
}

