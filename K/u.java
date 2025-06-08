package k;

import android.widget.PopupWindow.OnDismissListener;

public final class u implements PopupWindow.OnDismissListener {
    public final v i;

    public u(v v0) {
        this.i = v0;
    }

    @Override  // android.widget.PopupWindow$OnDismissListener
    public final void onDismiss() {
        this.i.c();
    }
}

