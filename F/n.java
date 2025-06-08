package f;

import B.c;
import android.support.v4.media.session.a;
import android.view.View;
import android.widget.PopupWindow;

public final class n extends a {
    public final int d;
    public final Object e;

    public n(Object object0, int v) {
        this.d = v;
        this.e = object0;
        super();
    }

    @Override  // E.v
    public final void a() {
        Object object0 = this.e;
        switch(this.d) {
            case 0: {
                ((k)object0).j.w.setAlpha(1.0f);
                ((k)object0).j.z.d(null);
                ((k)object0).j.z = null;
                return;
            }
            case 1: {
                ((t)object0).w.setAlpha(1.0f);
                ((t)object0).z.d(null);
                ((t)object0).z = null;
                return;
            }
            default: {
                ((t)((c)object0).k).w.setVisibility(8);
                t t0 = (t)((c)object0).k;
                PopupWindow popupWindow0 = t0.x;
                if(popupWindow0 != null) {
                    popupWindow0.dismiss();
                }
                else if(t0.w.getParent() instanceof View) {
                    ((View)t0.w.getParent()).requestApplyInsets();
                }
                t0.w.removeAllViews();
                t0.z.d(null);
                t0.z = null;
            }
        }
    }

    @Override  // android.support.v4.media.session.a
    public void c() {
        Object object0 = this.e;
        switch(this.d) {
            case 0: {
                ((k)object0).j.w.setVisibility(0);
                return;
            }
            case 1: {
                ((t)object0).w.setVisibility(0);
                ((t)object0).w.sendAccessibilityEvent(0x20);
                if(((t)object0).w.getParent() instanceof View) {
                    ((View)((t)object0).w.getParent()).requestApplyInsets();
                }
            }
        }
    }
}

