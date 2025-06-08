package j;

import E.u;
import android.support.v4.media.session.a;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

public final class i {
    public final ArrayList a;
    public long b;
    public Interpolator c;
    public a d;
    public boolean e;
    public final h f;

    public i() {
        this.b = -1L;
        this.f = new h(this);
        this.a = new ArrayList();
    }

    public final void a() {
        if(!this.e) {
            return;
        }
        for(Object object0: this.a) {
            ((u)object0).b();
        }
        this.e = false;
    }

    public final void b() {
        if(this.e) {
            return;
        }
        for(Object object0: this.a) {
            u u0 = (u)object0;
            long v = this.b;
            if(v >= 0L) {
                u0.c(v);
            }
            Interpolator interpolator0 = this.c;
            if(interpolator0 != null) {
                View view0 = (View)u0.a.get();
                if(view0 != null) {
                    view0.animate().setInterpolator(interpolator0);
                }
            }
            if(this.d != null) {
                u0.d(this.f);
            }
            View view1 = (View)u0.a.get();
            if(view1 != null) {
                view1.animate().start();
            }
        }
        this.e = true;
    }
}

