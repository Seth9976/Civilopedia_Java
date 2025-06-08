package E;

import android.graphics.Insets;
import android.view.WindowInsets.Builder;
import android.view.WindowInsets;
import x.b;

public class y extends A {
    public final WindowInsets.Builder a;

    public y() {
        this.a = k.e();
    }

    public y(H h0) {
        super(h0);
        WindowInsets windowInsets0 = h0.a();
        this.a = windowInsets0 == null ? k.e() : k.f(windowInsets0);
    }

    @Override  // E.A
    public H b() {
        H h0 = H.b(this.a.build(), null);
        h0.a.j(null);
        return h0;
    }

    @Override  // E.A
    public void c(b b0) {
        Insets insets0 = b0.b();
        this.a.setStableInsets(insets0);
    }

    @Override  // E.A
    public void d(b b0) {
        Insets insets0 = b0.b();
        this.a.setSystemWindowInsets(insets0);
    }
}

