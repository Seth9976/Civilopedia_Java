package f2;

import J2.j;
import android.view.View.OnClickListener;
import android.view.View;

public final class a implements View.OnClickListener {
    public final d i;
    public final int j;

    public a(d d0, int v) {
        this.i = d0;
        this.j = v;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        j.f(this.i, "this$0");
        this.i.r0 = this.j;
    }
}

