package E;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View;
import android.view.WindowInsets;
import x.b;

public abstract class n {
    public static void a(WindowInsets windowInsets0, View view0) {
        View.OnApplyWindowInsetsListener view$OnApplyWindowInsetsListener0 = (View.OnApplyWindowInsetsListener)view0.getTag(0x7F07010C);  // id:tag_window_insets_animation_callback
        if(view$OnApplyWindowInsetsListener0 != null) {
            view$OnApplyWindowInsetsListener0.onApplyWindowInsets(view0, windowInsets0);
        }
    }

    public static H b(View view0) {
        y y0;
        if(w.d && view0.isAttachedToWindow()) {
            View view1 = view0.getRootView();
            try {
                Object object0 = w.a.get(view1);
                if(object0 != null) {
                    Rect rect0 = (Rect)w.b.get(object0);
                    Rect rect1 = (Rect)w.c.get(object0);
                    if(rect0 != null && rect1 != null) {
                        int v = Build.VERSION.SDK_INT;
                        if(v >= 30) {
                            y0 = new z();
                        }
                        else if(v >= 29) {
                            y0 = new y();
                        }
                        else {
                            y0 = new x();
                        }
                        y0.c(b.a(rect0.left, rect0.top, rect0.right, rect0.bottom));
                        y0.d(b.a(rect1.left, rect1.top, rect1.right, rect1.bottom));
                        H h0 = y0.b();
                        h0.a.k(h0);
                        View view2 = view0.getRootView();
                        h0.a.d(view2);
                        return h0;
                    }
                }
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + illegalAccessException0.getMessage(), illegalAccessException0);
            }
        }
        return null;
    }

    public static void c(View view0, i i0) {
        if(Build.VERSION.SDK_INT < 30) {
            view0.setTag(0x7F070104, i0);  // id:tag_on_apply_window_listener
        }
        if(i0 == null) {
            view0.setOnApplyWindowInsetsListener(((View.OnApplyWindowInsetsListener)view0.getTag(0x7F07010C)));  // id:tag_window_insets_animation_callback
            return;
        }
        view0.setOnApplyWindowInsetsListener(new m(view0, i0));
    }
}

