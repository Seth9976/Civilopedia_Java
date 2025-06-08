package G;

import B.b;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import l.Y;

public final class c implements View.OnTouchListener {
    public final a i;
    public final AccelerateInterpolator j;
    public final ListView k;
    public b l;
    public final float[] m;
    public final float[] n;
    public final int o;
    public final int p;
    public final float[] q;
    public final float[] r;
    public final float[] s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final Y y;
    public static final int z;

    static {
        c.z = 100;
    }

    public c(Y y0) {
        a a0 = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        a0.e = 0x8000000000000000L;
        a0.g = -1L;
        a0.f = 0L;
        this.i = a0;
        this.j = new AccelerateInterpolator();
        float[] arr_f = {0.0f, 0.0f};
        this.m = arr_f;
        float[] arr_f1 = {3.402823E+38f, 3.402823E+38f};
        this.n = arr_f1;
        float[] arr_f2 = {0.0f, 0.0f};
        this.q = arr_f2;
        float[] arr_f3 = {0.0f, 0.0f};
        this.r = arr_f3;
        float[] arr_f4 = {3.402823E+38f, 3.402823E+38f};
        this.s = arr_f4;
        this.k = y0;
        DisplayMetrics displayMetrics0 = Resources.getSystem().getDisplayMetrics();
        int v = (int)(displayMetrics0.density * 315.0f + 0.5f);
        float f = ((float)(((int)(1575.0f * displayMetrics0.density + 0.5f)))) / 1000.0f;
        arr_f4[0] = f;
        arr_f4[1] = f;
        arr_f3[0] = ((float)v) / 1000.0f;
        arr_f3[1] = ((float)v) / 1000.0f;
        this.o = 1;
        arr_f1[0] = 3.402823E+38f;
        arr_f1[1] = 3.402823E+38f;
        arr_f[0] = 0.2f;
        arr_f[1] = 0.2f;
        arr_f2[0] = 0.001f;
        arr_f2[1] = 0.001f;
        this.p = c.z;
        a0.a = 500;
        a0.b = 500;
        this.y = y0;
    }

    public final float a(int v, float f, float f1, float f2) {
        float f5;
        float f3 = c.b(this.m[v] * f1, 0.0f, this.n[v]);
        float f4 = this.c(f1 - f, f3) - this.c(f, f3);
        AccelerateInterpolator accelerateInterpolator0 = this.j;
        if(f4 < 0.0f) {
            f5 = c.b(-accelerateInterpolator0.getInterpolation(-f4), -1.0f, 1.0f);
        }
        else {
            f5 = f4 > 0.0f ? c.b(accelerateInterpolator0.getInterpolation(f4), -1.0f, 1.0f) : 0.0f;
        }
        int v1 = Float.compare(f5, 0.0f);
        if(v1 == 0) {
            return 0.0f;
        }
        float f6 = this.q[v];
        float f7 = this.r[v];
        float f8 = this.s[v];
        float f9 = f6 * f2;
        return v1 <= 0 ? -c.b(-f5 * f9, f7, f8) : c.b(f5 * f9, f7, f8);
    }

    public static float b(float f, float f1, float f2) {
        if(f > f2) {
            return f2;
        }
        return f < f1 ? f1 : f;
    }

    public final float c(float f, float f1) {
        if(f1 == 0.0f) {
            return 0.0f;
        }
        int v = this.o;
        if(v != 0 && v != 1) {
            return v != 2 || f >= 0.0f ? 0.0f : f / -f1;
        }
        if(f < f1) {
            if(f >= 0.0f) {
                return 1.0f - f / f1;
            }
            return !this.w || v != 1 ? 0.0f : 1.0f;
        }
        return 0.0f;
    }

    public final void d() {
        int v = 0;
        if(this.u) {
            this.w = false;
            return;
        }
        a a0 = this.i;
        long v1 = AnimationUtils.currentAnimationTimeMillis();
        int v2 = (int)(v1 - a0.e);
        int v3 = a0.b;
        if(v2 > v3) {
            v = v3;
        }
        else if(v2 >= 0) {
            v = v2;
        }
        a0.i = v;
        a0.h = a0.a(v1);
        a0.g = v1;
    }

    public final boolean e() {
        int v = (int)(this.i.d / Math.abs(this.i.d));
        if(v != 0) {
            Y y0 = this.y;
            int v1 = y0.getCount();
            if(v1 != 0) {
                int v2 = y0.getChildCount();
                int v3 = y0.getFirstVisiblePosition();
                return v <= 0 ? v < 0 && (v3 > 0 || y0.getChildAt(0).getTop() < 0) : v3 + v2 < v1 || y0.getChildAt(v2 - 1).getBottom() > y0.getHeight();
            }
        }
        return false;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        if(!this.x) {
            return false;
        }
        switch(motionEvent0.getActionMasked()) {
            case 0: {
                this.v = true;
                this.t = false;
                break;
            }
            case 2: {
                break;
            }
            case 1: 
            case 3: {
                this.d();
                return false;
            }
            default: {
                return false;
            }
        }
        float f = motionEvent0.getX();
        float f1 = (float)view0.getWidth();
        ListView listView0 = this.k;
        float f2 = this.a(0, f, f1, ((float)listView0.getWidth()));
        float f3 = this.a(1, motionEvent0.getY(), ((float)view0.getHeight()), ((float)listView0.getHeight()));
        this.i.c = f2;
        this.i.d = f3;
        if(!this.w && this.e()) {
            if(this.l == null) {
                this.l = new b(this, 4);
            }
            this.w = true;
            this.u = true;
            if(this.t) {
                this.l.run();
            }
            else {
                int v = this.p;
                if(v > 0) {
                    listView0.postOnAnimationDelayed(this.l, ((long)v));
                }
                else {
                    this.l.run();
                }
            }
            this.t = true;
        }
        return false;
    }
}

