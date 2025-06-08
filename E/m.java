package E;

import android.os.Build.VERSION;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View;
import android.view.WindowInsets;
import f.l;

public final class m implements View.OnApplyWindowInsetsListener {
    public H a;
    public final View b;
    public final i c;

    public m(View view0, i i0) {
        this.b = view0;
        this.c = i0;
        super();
        this.a = null;
    }

    @Override  // android.view.View$OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view0, WindowInsets windowInsets0) {
        H h0 = H.b(windowInsets0, view0);
        int v = Build.VERSION.SDK_INT;
        i i0 = this.c;
        if(v < 30) {
            n.a(windowInsets0, this.b);
            if(h0.equals(this.a)) {
                return ((l)i0).b(view0, h0).a();
            }
        }
        this.a = h0;
        H h1 = ((l)i0).b(view0, h0);
        if(v >= 30) {
            return h1.a();
        }
        view0.requestApplyInsets();
        return h1.a();
    }
}

