package E;

import android.view.View;
import java.lang.ref.WeakReference;

public final class u {
    public WeakReference a;

    public final void a(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().alpha(f);
        }
    }

    public final void b() {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().cancel();
        }
    }

    public final void c(long v) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().setDuration(v);
        }
    }

    public final void d(v v0) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            if(v0 != null) {
                view0.animate().setListener(new s(v0, view0));
                return;
            }
            view0.animate().setListener(null);
        }
    }

    public final void e(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().translationY(f);
        }
    }
}

