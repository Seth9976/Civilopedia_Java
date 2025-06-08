package N;

import android.graphics.Rect;
import android.view.View;

public final class v {
    public final F a;
    public int b;
    public final Rect c;
    public final int d;

    public v(F f0, int v) {
        this.d = v;
        super();
        this.b = 0x80000000;
        this.c = new Rect();
        this.a = f0;
    }

    public static v a(F f0, int v) {
        switch(v) {
            case 0: {
                return new v(f0, 0);
            }
            case 1: {
                return new v(f0, 1);
            }
            default: {
                throw new IllegalArgumentException("invalid orientation");
            }
        }
    }

    public final int b(View view0) {
        if(this.d != 0) {
            G g0 = (G)view0.getLayoutParams();
            this.a.getClass();
            return view0.getBottom() + ((G)view0.getLayoutParams()).b.bottom + g0.bottomMargin;
        }
        G g1 = (G)view0.getLayoutParams();
        this.a.getClass();
        return view0.getRight() + ((G)view0.getLayoutParams()).b.right + g1.rightMargin;
    }

    public final int c(View view0) {
        if(this.d != 0) {
            G g0 = (G)view0.getLayoutParams();
            this.a.getClass();
            Rect rect0 = ((G)view0.getLayoutParams()).b;
            return view0.getMeasuredHeight() + rect0.top + rect0.bottom + g0.topMargin + g0.bottomMargin;
        }
        G g1 = (G)view0.getLayoutParams();
        this.a.getClass();
        Rect rect1 = ((G)view0.getLayoutParams()).b;
        return view0.getMeasuredWidth() + rect1.left + rect1.right + g1.leftMargin + g1.rightMargin;
    }

    public final int d(View view0) {
        if(this.d != 0) {
            G g0 = (G)view0.getLayoutParams();
            this.a.getClass();
            Rect rect0 = ((G)view0.getLayoutParams()).b;
            return view0.getMeasuredWidth() + rect0.left + rect0.right + g0.leftMargin + g0.rightMargin;
        }
        G g1 = (G)view0.getLayoutParams();
        this.a.getClass();
        Rect rect1 = ((G)view0.getLayoutParams()).b;
        return view0.getMeasuredHeight() + rect1.top + rect1.bottom + g1.topMargin + g1.bottomMargin;
    }

    public final int e(View view0) {
        if(this.d != 0) {
            G g0 = (G)view0.getLayoutParams();
            this.a.getClass();
            return view0.getTop() - ((G)view0.getLayoutParams()).b.top - g0.topMargin;
        }
        G g1 = (G)view0.getLayoutParams();
        this.a.getClass();
        return view0.getLeft() - ((G)view0.getLayoutParams()).b.left - g1.leftMargin;
    }

    public final int f() {
        return this.d == 0 ? this.a.m : this.a.n;
    }

    public final int g() {
        return this.d == 0 ? this.a.m - this.a.A() : this.a.n - this.a.y();
    }

    public final int h() {
        return this.d == 0 ? this.a.A() : this.a.y();
    }

    public final int i() {
        return this.d == 0 ? this.a.k : this.a.l;
    }

    public final int j() {
        return this.d == 0 ? this.a.z() : this.a.B();
    }

    public final int k() {
        return this.d == 0 ? this.a.m - this.a.z() - this.a.A() : this.a.n - this.a.B() - this.a.y();
    }

    public final int l() {
        return 0x80000000 == this.b ? 0 : this.k() - this.b;
    }

    public final int m(View view0) {
        if(this.d != 0) {
            this.a.F(view0, this.c);
            return this.c.bottom;
        }
        this.a.F(view0, this.c);
        return this.c.right;
    }

    public final int n(View view0) {
        if(this.d != 0) {
            this.a.F(view0, this.c);
            return this.c.top;
        }
        this.a.F(view0, this.c);
        return this.c.left;
    }

    public final void o(int v) {
        if(this.d != 0) {
            this.a.K(v);
            return;
        }
        this.a.J(v);
    }
}

