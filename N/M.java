package N;

import B.b;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public final class m implements I {
    public int A;
    public final b B;
    public static final int[] C;
    public static final int[] D;
    public final int a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public int q;
    public int r;
    public final RecyclerView s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public final int[] x;
    public final int[] y;
    public final ValueAnimator z;

    static {
        m.C = new int[]{0x10100A7};
        m.D = new int[0];
    }

    public m(RecyclerView recyclerView0, StateListDrawable stateListDrawable0, Drawable drawable0, StateListDrawable stateListDrawable1, Drawable drawable1, int v, int v1, int v2) {
        this.q = 0;
        this.r = 0;
        this.t = false;
        this.u = false;
        this.v = 0;
        this.w = 0;
        this.x = new int[2];
        this.y = new int[2];
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.z = valueAnimator0;
        this.A = 0;
        b b0 = new b(this, 9);
        this.B = b0;
        j j0 = new j(this);
        this.c = stateListDrawable0;
        this.d = drawable0;
        this.g = stateListDrawable1;
        this.h = drawable1;
        this.e = Math.max(v, stateListDrawable0.getIntrinsicWidth());
        this.f = Math.max(v, drawable0.getIntrinsicWidth());
        this.i = Math.max(v, stateListDrawable1.getIntrinsicWidth());
        this.j = Math.max(v, drawable1.getIntrinsicWidth());
        this.a = v1;
        this.b = v2;
        stateListDrawable0.setAlpha(0xFF);
        drawable0.setAlpha(0xFF);
        valueAnimator0.addListener(new k(this));
        valueAnimator0.addUpdateListener(new l(this));
        RecyclerView recyclerView1 = this.s;
        if(recyclerView1 != recyclerView0) {
            if(recyclerView1 != null) {
                F f0 = recyclerView1.t;
                if(f0 != null) {
                    f0.b("Cannot remove item decoration during a scroll  or layout");
                }
                recyclerView1.u.remove(this);
                if(recyclerView1.u.isEmpty()) {
                    recyclerView1.setWillNotDraw(recyclerView1.getOverScrollMode() == 2);
                }
                recyclerView1.K();
                recyclerView1.requestLayout();
                RecyclerView recyclerView2 = this.s;
                recyclerView2.v.remove(this);
                if(recyclerView2.w == this) {
                    recyclerView2.w = null;
                }
                ArrayList arrayList0 = this.s.l0;
                if(arrayList0 != null) {
                    arrayList0.remove(j0);
                }
                this.s.removeCallbacks(b0);
            }
            this.s = recyclerView0;
            F f1 = recyclerView0.t;
            if(f1 != null) {
                f1.b("Cannot add item decoration during a scroll  or layout");
            }
            ArrayList arrayList1 = recyclerView0.u;
            if(arrayList1.isEmpty()) {
                recyclerView0.setWillNotDraw(false);
            }
            arrayList1.add(this);
            recyclerView0.K();
            recyclerView0.requestLayout();
            this.s.f(this);
            RecyclerView recyclerView3 = this.s;
            if(recyclerView3.l0 == null) {
                recyclerView3.l0 = new ArrayList();
            }
            recyclerView3.l0.add(j0);
        }
    }

    @Override  // N.I
    public final boolean a(RecyclerView recyclerView0, MotionEvent motionEvent0) {
        int v = this.v;
        if(v == 1) {
            boolean z = this.d(motionEvent0.getX(), motionEvent0.getY());
            boolean z1 = this.c(motionEvent0.getX(), motionEvent0.getY());
            if(motionEvent0.getAction() == 0 && (z || z1)) {
                if(z1) {
                    this.w = 1;
                    this.p = (float)(((int)motionEvent0.getX()));
                }
                else if(z) {
                    this.w = 2;
                    this.m = (float)(((int)motionEvent0.getY()));
                }
                this.f(2);
                return true;
            }
            return false;
        }
        return v == 2;
    }

    @Override  // N.I
    public final void b(MotionEvent motionEvent0) {
        if(this.v == 0) {
            return;
        }
        switch(motionEvent0.getAction()) {
            case 0: {
                boolean z = this.d(motionEvent0.getX(), motionEvent0.getY());
                boolean z1 = this.c(motionEvent0.getX(), motionEvent0.getY());
                if(z || z1) {
                    if(z1) {
                        this.w = 1;
                        this.p = (float)(((int)motionEvent0.getX()));
                    }
                    else if(z) {
                        this.w = 2;
                        this.m = (float)(((int)motionEvent0.getY()));
                    }
                    this.f(2);
                    return;
                }
                break;
            }
            case 1: {
                if(this.v == 2) {
                    this.m = 0.0f;
                    this.p = 0.0f;
                    this.f(1);
                    this.w = 0;
                    return;
                }
            label_22:
                if(motionEvent0.getAction() == 2 && this.v == 2) {
                    this.g();
                    int v = this.b;
                    if(this.w == 1) {
                        float f = motionEvent0.getX();
                        int[] arr_v = this.y;
                        arr_v[0] = v;
                        int v1 = this.q - v;
                        arr_v[1] = v1;
                        float f1 = Math.max(v, Math.min(v1, f));
                        if(Math.abs(((float)this.o) - f1) >= 2.0f) {
                            int v2 = m.e(this.p, f1, arr_v, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
                            if(v2 != 0) {
                                this.s.scrollBy(v2, 0);
                            }
                            this.p = f1;
                        }
                    }
                    if(this.w == 2) {
                        float f2 = motionEvent0.getY();
                        int[] arr_v1 = this.x;
                        arr_v1[0] = v;
                        int v3 = this.r - v;
                        arr_v1[1] = v3;
                        float f3 = Math.max(v, Math.min(v3, f2));
                        if(Math.abs(((float)this.l) - f3) >= 2.0f) {
                            int v4 = m.e(this.m, f3, arr_v1, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
                            if(v4 != 0) {
                                this.s.scrollBy(0, v4);
                            }
                            this.m = f3;
                        }
                    }
                }
                break;
            }
            default: {
                goto label_22;
            }
        }
    }

    public final boolean c(float f, float f1) {
        return f1 >= ((float)(this.r - this.i)) && (f >= ((float)(this.o - this.n / 2)) && f <= ((float)(this.n / 2 + this.o)));
    }

    public final boolean d(float f, float f1) {
        boolean z = this.s.getLayoutDirection() == 1;
        int v = this.e;
        if(!z) {
            if(f >= ((float)(this.q - v))) {
            label_6:
                int v1 = this.k / 2;
                return f1 >= ((float)(this.l - v1)) && f1 <= ((float)(v1 + this.l));
            }
        }
        else if(f <= ((float)(v / 2))) {
            goto label_6;
        }
        return false;
    }

    public static int e(float f, float f1, int[] arr_v, int v, int v1, int v2) {
        int v3 = arr_v[1] - arr_v[0];
        if(v3 == 0) {
            return 0;
        }
        int v4 = v - v2;
        int v5 = (int)((f1 - f) / ((float)v3) * ((float)v4));
        return v1 + v5 >= v4 || v1 + v5 < 0 ? 0 : v5;
    }

    public final void f(int v) {
        b b0 = this.B;
        StateListDrawable stateListDrawable0 = this.c;
        if(v == 2 && this.v != 2) {
            stateListDrawable0.setState(m.C);
            this.s.removeCallbacks(b0);
        }
        if(v == 0) {
            this.s.invalidate();
        }
        else {
            this.g();
        }
        if(this.v == 2 && v != 2) {
            stateListDrawable0.setState(m.D);
            this.s.removeCallbacks(b0);
            this.s.postDelayed(b0, 1200L);
        }
        else if(v == 1) {
            this.s.removeCallbacks(b0);
            this.s.postDelayed(b0, 1500L);
        }
        this.v = v;
    }

    public final void g() {
        int v = this.A;
        ValueAnimator valueAnimator0 = this.z;
        if(v == 0) {
        label_5:
            this.A = 1;
            valueAnimator0.setFloatValues(new float[]{((float)(((Float)valueAnimator0.getAnimatedValue()))), 1.0f});
            valueAnimator0.setDuration(500L);
            valueAnimator0.setStartDelay(0L);
            valueAnimator0.start();
        }
        else if(v == 3) {
            valueAnimator0.cancel();
            goto label_5;
        }
    }
}

