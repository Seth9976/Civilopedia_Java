package androidx.fragment.app;

import android.view.View;

public final class e extends r {
    public final h j;

    public e(h h0) {
        this.j = h0;
    }

    @Override  // androidx.fragment.app.r
    public final View a(int v) {
        View view0 = this.j.O;
        if(view0 == null) {
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }
        return view0.findViewById(v);
    }

    @Override  // androidx.fragment.app.r
    public final boolean b() {
        return this.j.O != null;
    }
}

