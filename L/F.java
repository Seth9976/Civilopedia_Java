package l;

import android.content.Context;
import android.view.View;
import k.D;
import k.d;
import k.l;
import k.t;
import k.v;

public final class f extends v {
    public final int l;
    public final j m;

    public f(j j0, Context context0, D d0, View view0) {
        this.l = 0;
        this.m = j0;
        super(0x7F02001E, context0, view0, d0, false);  // attr:actionOverflowMenuStyle
        if(!d0.A.f()) {
            View view1 = j0.q;
            if(view1 == null) {
                view1 = (View)j0.p;
            }
            this.e = view1;
        }
        d d1 = j0.E;
        this.h = d1;
        t t0 = this.i;
        if(t0 != null) {
            t0.i(d1);
        }
    }

    public f(j j0, Context context0, l l0, View view0) {
        this.l = 1;
        this.m = j0;
        super(0x7F02001E, context0, view0, l0, true);  // attr:actionOverflowMenuStyle
        this.f = 0x800005;
        d d0 = j0.E;
        this.h = d0;
        t t0 = this.i;
        if(t0 != null) {
            t0.i(d0);
        }
    }

    @Override  // k.v
    public final void c() {
        if(this.l != 0) {
            j j0 = this.m;
            l l0 = j0.k;
            if(l0 != null) {
                l0.c(true);
            }
            j0.A = null;
            super.c();
            return;
        }
        this.m.B = null;
        this.m.getClass();
        super.c();
    }
}

