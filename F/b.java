package f;

import android.view.View;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AbsListView;

public final class b implements AbsListView.OnScrollListener {
    public final View a;
    public final View b;

    public b(View view0, View view1) {
        this.a = view0;
        this.b = view1;
    }

    @Override  // android.widget.AbsListView$OnScrollListener
    public final void onScroll(AbsListView absListView0, int v, int v1, int v2) {
        f.a(absListView0, this.a, this.b);
    }

    @Override  // android.widget.AbsListView$OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView0, int v) {
    }
}

