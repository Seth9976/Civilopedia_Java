package l;

import android.widget.AbsListView.OnScrollListener;
import android.widget.AbsListView;

public final class f0 implements AbsListView.OnScrollListener {
    public final g0 a;

    public f0(g0 g00) {
        this.a = g00;
    }

    @Override  // android.widget.AbsListView$OnScrollListener
    public final void onScroll(AbsListView absListView0, int v, int v1, int v2) {
    }

    @Override  // android.widget.AbsListView$OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView0, int v) {
        if(v == 1) {
            g0 g00 = this.a;
            if(g00.G.getInputMethodMode() != 2 && g00.G.getContentView() != null) {
                g00.C.removeCallbacks(g00.y);
                g00.y.run();
            }
        }
    }
}

