package k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;

public class v {
    public final Context a;
    public final l b;
    public final boolean c;
    public final int d;
    public View e;
    public int f;
    public boolean g;
    public w h;
    public t i;
    public u j;
    public final u k;

    public v(int v, Context context0, View view0, l l0, boolean z) {
        this.f = 0x800003;
        this.k = () -> {
            this.i = null;
            u u0 = this.j;
            if(u0 != null) {
                u0.onDismiss();
            }
        };
        this.a = context0;
        this.b = l0;
        this.e = view0;
        this.c = z;
        this.d = v;
    }

    public final t a() {
        if(this.i == null) {
            Context context0 = this.a;
            Display display0 = ((WindowManager)context0.getSystemService("window")).getDefaultDisplay();
            Point point0 = new Point();
            display0.getRealSize(point0);
            f f0 = Math.min(point0.x, point0.y) >= context0.getResources().getDimensionPixelSize(0x7F050016) ? new f(context0, this.e, this.d, this.c) : new C(this.d, this.a, this.e, this.b, this.c);  // dimen:abc_cascading_menus_min_smallest_width
            f0.l(this.b);
            f0.r(this.k);
            f0.n(this.e);
            f0.i(this.h);
            f0.o(this.g);
            f0.p(this.f);
            this.i = f0;
        }
        return this.i;
    }

    public final boolean b() {
        return this.i != null && this.i.b();
    }

    // 检测为 lambda 实现。
    public void c() {
        this.i = null;
        u u0 = this.j;
        if(u0 != null) {
            u0.onDismiss();
        }
    }

    public final void d(int v, int v1, boolean z, boolean z1) {
        t t0 = this.a();
        t0.s(z1);
        if(z) {
            if((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                v -= this.e.getWidth();
            }
            t0.q(v);
            t0.t(v1);
            int v2 = (int)(this.a.getResources().getDisplayMetrics().density * 48.0f / 2.0f);
            t0.i = new Rect(v - v2, v1 - v2, v + v2, v1 + v2);
        }
        t0.e();
    }
}

