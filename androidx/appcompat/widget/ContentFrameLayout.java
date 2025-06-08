package androidx.appcompat.widget;

import E.u;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import f.m;
import f.t;
import k.l;
import l.I0;
import l.T;
import l.U;
import l.f;
import l.j;

public class ContentFrameLayout extends FrameLayout {
    public TypedValue i;
    public TypedValue j;
    public TypedValue k;
    public TypedValue l;
    public TypedValue m;
    public TypedValue n;
    public final Rect o;
    public T p;

    public ContentFrameLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0);
        this.o = new Rect();
    }

    public final void a(Rect rect0) {
        this.fitSystemWindows(rect0);
    }

    public TypedValue getFixedHeightMajor() {
        if(this.m == null) {
            this.m = new TypedValue();
        }
        return this.m;
    }

    public TypedValue getFixedHeightMinor() {
        if(this.n == null) {
            this.n = new TypedValue();
        }
        return this.n;
    }

    public TypedValue getFixedWidthMajor() {
        if(this.k == null) {
            this.k = new TypedValue();
        }
        return this.k;
    }

    public TypedValue getFixedWidthMinor() {
        if(this.l == null) {
            this.l = new TypedValue();
        }
        return this.l;
    }

    public TypedValue getMinWidthMajor() {
        if(this.i == null) {
            this.i = new TypedValue();
        }
        return this.i;
    }

    public TypedValue getMinWidthMinor() {
        if(this.j == null) {
            this.j = new TypedValue();
        }
        return this.j;
    }

    @Override  // android.view.ViewGroup
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        T t0 = this.p;
        if(t0 != null) {
            t0.getClass();
        }
    }

    @Override  // android.view.ViewGroup
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        T t0 = this.p;
        if(t0 != null) {
            t t1 = ((m)t0).i;
            U u0 = t1.s;
            if(u0 != null) {
                ((ActionBarOverlayLayout)u0).k();
                ActionMenuView actionMenuView0 = ((I0)((ActionBarOverlayLayout)u0).m).a.i;
                if(actionMenuView0 != null) {
                    j j0 = actionMenuView0.B;
                    if(j0 != null) {
                        j0.e();
                        f f0 = j0.B;
                        if(f0 != null && f0.b()) {
                            f0.i.dismiss();
                        }
                    }
                }
            }
            if(t1.x != null) {
                t1.m.getDecorView().removeCallbacks(t1.y);
                if(t1.x.isShowing()) {
                    try {
                        t1.x.dismiss();
                    }
                    catch(IllegalArgumentException unused_ex) {
                    }
                }
                t1.x = null;
            }
            u u1 = t1.z;
            if(u1 != null) {
                u1.b();
            }
            l l0 = t1.s(0).h;
            if(l0 != null) {
                l0.c(true);
            }
        }
    }

    @Override  // android.widget.FrameLayout
    public final void onMeasure(int v, int v1) {
        int v10;
        int v6;
        int v7;
        int v4;
        boolean z2;
        int v5;
        DisplayMetrics displayMetrics0 = this.getContext().getResources().getDisplayMetrics();
        boolean z = true;
        boolean z1 = displayMetrics0.widthPixels < displayMetrics0.heightPixels;
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getMode(v1);
        Rect rect0 = this.o;
        if(v2 == 0x80000000) {
            TypedValue typedValue0 = z1 ? this.l : this.k;
            if(typedValue0 == null) {
                v5 = v;
                z2 = false;
            }
            else {
                switch(typedValue0.type) {
                    case 0: {
                        v5 = v;
                        z2 = false;
                        break;
                    }
                    case 5: {
                        v4 = (int)typedValue0.getDimension(displayMetrics0);
                        goto label_18;
                    }
                    case 6: {
                        v4 = (int)typedValue0.getFraction(((float)displayMetrics0.widthPixels), ((float)displayMetrics0.widthPixels));
                    label_18:
                        if(v4 > 0) {
                            v5 = View.MeasureSpec.makeMeasureSpec(Math.min(v4 - (rect0.left + rect0.right), View.MeasureSpec.getSize(v)), 0x40000000);
                            z2 = true;
                        }
                        else {
                            v5 = v;
                            z2 = false;
                        }
                        break;
                    }
                    default: {
                        v4 = 0;
                        goto label_18;
                    }
                }
            }
        }
        else {
            v5 = v;
            z2 = false;
        }
        if(v3 == 0x80000000) {
            TypedValue typedValue1 = z1 ? this.m : this.n;
            if(typedValue1 == null) {
                v7 = v1;
            }
            else {
                switch(typedValue1.type) {
                    case 0: {
                        v7 = v1;
                        break;
                    }
                    case 5: {
                        v6 = (int)typedValue1.getDimension(displayMetrics0);
                        v7 = v6 > 0 ? View.MeasureSpec.makeMeasureSpec(Math.min(v6 - (rect0.top + rect0.bottom), View.MeasureSpec.getSize(v1)), 0x40000000) : v1;
                        break;
                    }
                    case 6: {
                        v6 = (int)typedValue1.getFraction(((float)displayMetrics0.heightPixels), ((float)displayMetrics0.heightPixels));
                        v7 = v6 > 0 ? View.MeasureSpec.makeMeasureSpec(Math.min(v6 - (rect0.top + rect0.bottom), View.MeasureSpec.getSize(v1)), 0x40000000) : v1;
                        break;
                    }
                    default: {
                        v6 = 0;
                        v7 = v6 > 0 ? View.MeasureSpec.makeMeasureSpec(Math.min(v6 - (rect0.top + rect0.bottom), View.MeasureSpec.getSize(v1)), 0x40000000) : v1;
                        break;
                    }
                }
            }
        }
        else {
            v7 = v1;
        }
        super.onMeasure(v5, v7);
        int v8 = this.getMeasuredWidth();
        int v9 = View.MeasureSpec.makeMeasureSpec(v8, 0x40000000);
        if(z2 || v2 != 0x80000000) {
            z = false;
        }
        else {
            TypedValue typedValue2 = z1 ? this.j : this.i;
            if(typedValue2 == null) {
                z = false;
            }
            else {
                switch(typedValue2.type) {
                    case 0: {
                        z = false;
                        goto label_73;
                    }
                    case 5: {
                        v10 = (int)typedValue2.getDimension(displayMetrics0);
                        break;
                    }
                    case 6: {
                        v10 = (int)typedValue2.getFraction(((float)displayMetrics0.widthPixels), ((float)displayMetrics0.widthPixels));
                        break;
                    }
                    default: {
                        v10 = 0;
                    }
                }
                if(v10 > 0) {
                    v10 -= rect0.left + rect0.right;
                }
                if(v8 < v10) {
                    v9 = View.MeasureSpec.makeMeasureSpec(v10, 0x40000000);
                }
                else {
                    z = false;
                }
            }
        }
    label_73:
        if(z) {
            super.onMeasure(v9, v7);
        }
    }

    public void setAttachListener(T t0) {
        this.p = t0;
    }
}

