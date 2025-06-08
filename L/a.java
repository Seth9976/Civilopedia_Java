package l;

import E.v;
import M3.A;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;

public final class a implements v {
    public int a;
    public boolean b;
    public final Object c;

    public a(A a0, int v, boolean z) {
        this.c = a0;
        this.a = v;
        this.b = z;
    }

    public a(ActionBarContextView actionBarContextView0) {
        this.c = actionBarContextView0;
        this.b = false;
    }

    @Override  // E.v
    public void a() {
        if(this.b) {
            return;
        }
        ((ActionBarContextView)this.c).n = null;
        ((ActionBarContextView)this.c).setVisibility(this.a);
    }

    @Override  // E.v
    public void b(View view0) {
        this.b = true;
    }

    @Override  // E.v
    public void c() {
        ActionBarContextView.a(((ActionBarContextView)this.c));
        this.b = false;
    }
}

