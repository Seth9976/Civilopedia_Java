package f;

import E.G;
import E.H;
import E.i;
import E.x;
import E.y;
import E.z;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.Window.Callback;
import android.view.WindowInsets;
import java.lang.reflect.Method;
import k.D;
import k.w;
import l.O0;
import x.b;

public final class l implements i, w {
    public final t i;

    public l(t t0) {
        this.i = t0;
        super();
    }

    @Override  // k.w
    public void a(k.l l0, boolean z) {
        this.i.l(l0);
    }

    public H b(View view0, H h0) {
        y y0;
        int v5;
        int v4;
        int v3;
        int v = 1;
        int v1 = 0;
        G g0 = h0.a;
        int v2 = g0.g().b;
        t t0 = this.i;
        if(t0.w == null || !(t0.w.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            v4 = v2;
            v5 = 0;
        }
        else {
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)t0.w.getLayoutParams();
            if(t0.w.isShown()) {
                if(t0.c0 == null) {
                    t0.c0 = new Rect();
                    t0.d0 = new Rect();
                }
                Rect rect0 = t0.c0;
                Rect rect1 = t0.d0;
                rect0.set(0, v2, 0, 0);
                ViewGroup viewGroup0 = t0.B;
                Method method0 = O0.a;
                if(method0 != null) {
                    try {
                        method0.invoke(viewGroup0, rect0, rect1);
                    }
                    catch(Exception exception0) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", exception0);
                    }
                }
                if(viewGroup$MarginLayoutParams0.topMargin == (rect1.top == 0 ? v2 : 0)) {
                    v3 = 0;
                }
                else {
                    viewGroup$MarginLayoutParams0.topMargin = v2;
                    View view1 = t0.D;
                    if(view1 == null) {
                        View view2 = new View(t0.l);
                        t0.D = view2;
                        view2.setBackgroundColor(t0.l.getResources().getColor(0x7F040007));  // color:abc_input_method_navigation_guard
                        t0.B.addView(t0.D, -1, new ViewGroup.LayoutParams(-1, v2));
                    }
                    else {
                        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
                        if(viewGroup$LayoutParams0.height != v2) {
                            viewGroup$LayoutParams0.height = v2;
                            t0.D.setLayoutParams(viewGroup$LayoutParams0);
                        }
                    }
                    v3 = 1;
                }
                if(t0.D == null) {
                    v = 0;
                }
                v4 = t0.I || v == 0 ? v2 : 0;
                v5 = v;
                v = v3;
            }
            else {
                if(viewGroup$MarginLayoutParams0.topMargin == 0) {
                    v4 = v2;
                    v = 0;
                }
                else {
                    viewGroup$MarginLayoutParams0.topMargin = 0;
                    v4 = v2;
                }
                v5 = 0;
            }
            if(v != 0) {
                t0.w.setLayoutParams(viewGroup$MarginLayoutParams0);
            }
        }
        View view3 = t0.D;
        if(view3 != null) {
            if(v5 == 0) {
                v1 = 8;
            }
            view3.setVisibility(v1);
        }
        if(v2 != v4) {
            int v6 = g0.g().a;
            int v7 = g0.g().c;
            int v8 = g0.g().d;
            int v9 = Build.VERSION.SDK_INT;
            if(v9 >= 30) {
                y0 = new z(h0);
            }
            else if(v9 >= 29) {
                y0 = new y(h0);
            }
            else {
                y0 = new x(h0);
            }
            y0.d(b.a(v6, v4, v7, v8));
            h0 = y0.b();
        }
        WindowInsets windowInsets0 = h0.a();
        if(windowInsets0 != null) {
            WindowInsets windowInsets1 = view0.onApplyWindowInsets(windowInsets0);
            return windowInsets1.equals(windowInsets0) ? h0 : H.b(windowInsets1, view0);
        }
        return h0;
    }

    @Override  // k.w
    public boolean d(D d0) {
        Window.Callback window$Callback0 = this.i.m.getCallback();
        if(window$Callback0 != null) {
            window$Callback0.onMenuOpened(108, d0);
        }
        return true;
    }
}

