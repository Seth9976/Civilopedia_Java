package l;

import android.graphics.Typeface;
import android.view.View;
import java.lang.ref.WeakReference;
import k.l;

public final class h implements Runnable {
    public final int i;
    public final Object j;
    public final Object k;

    public h(WeakReference weakReference0, Typeface typeface0) {
        this.i = 1;
        super();
        this.j = weakReference0;
        this.k = typeface0;
    }

    public h(j j0, f f0) {
        this.i = 0;
        super();
        this.k = j0;
        this.j = f0;
    }

    @Override
    public final void run() {
        if(this.i != 0) {
            M m0 = (M)((WeakReference)this.j).get();
            if(m0 != null && m0.m) {
                m0.a.setTypeface(((Typeface)this.k));
                m0.l = (Typeface)this.k;
            }
            return;
        }
        j j0 = (j)this.k;
        l l0 = j0.k;
        if(l0 != null) {
            k.j j1 = l0.e;
            if(j1 != null) {
                j1.e(l0);
            }
        }
        View view0 = (View)j0.p;
        if(view0 != null && view0.getWindowToken() != null) {
            f f0 = (f)this.j;
            if(f0.b()) {
                j0.A = f0;
            }
            else if(f0.e != null) {
                f0.d(0, 0, false, false);
                j0.A = f0;
            }
        }
        j0.C = null;
    }
}

