package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

public final class c implements Runnable {
    public final int i;
    public final ActionBarOverlayLayout j;

    public c(ActionBarOverlayLayout actionBarOverlayLayout0, int v) {
        this.i = v;
        this.j = actionBarOverlayLayout0;
        super();
    }

    @Override
    public final void run() {
        if(this.i != 0) {
            this.j.h();
            this.j.E = this.j.l.animate().translationY(((float)(-this.j.l.getHeight()))).setListener(this.j.F);
            return;
        }
        this.j.h();
        this.j.E = this.j.l.animate().translationY(0.0f).setListener(this.j.F);
    }
}

