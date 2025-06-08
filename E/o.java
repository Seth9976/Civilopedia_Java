package E;

import android.view.View;
import android.view.WindowInsets;

public abstract class o {
    public static H a(View view0) {
        WindowInsets windowInsets0 = view0.getRootWindowInsets();
        if(windowInsets0 == null) {
            return null;
        }
        H h0 = H.b(windowInsets0, null);
        h0.a.k(h0);
        View view1 = view0.getRootView();
        h0.a.d(view1);
        return h0;
    }
}

