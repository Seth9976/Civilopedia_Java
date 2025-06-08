package l;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import k.d;
import k.l;
import k.n;

public final class j0 extends g0 implements h0 {
    public d K;
    public static final Method L;

    static {
        if(Build.VERSION.SDK_INT <= 28) {
            try {
                j0.L = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
            catch(NoSuchMethodException unused_ex) {
                Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override  // l.h0
    public final void c(l l0, n n0) {
        d d0 = this.K;
        if(d0 != null) {
            d0.c(l0, n0);
        }
    }

    @Override  // l.h0
    public final void j(l l0, n n0) {
        d d0 = this.K;
        if(d0 != null) {
            d0.j(l0, n0);
        }
    }

    @Override  // l.g0
    public final Y q(Context context0, boolean z) {
        Y y0 = new i0(context0, z);
        ((i0)y0).setHoverListener(this);
        return y0;
    }
}

