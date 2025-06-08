package com.otaliastudios.zoom;

import M1.f;
import Z1.a;
import Z1.c;
import Z1.d;
import Z1.e;
import Z1.i;
import Z1.j;
import Z1.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import c2.b;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001A\u00020\u0004H\u0096\u0001\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\u0004H\u0096\u0001\u00A2\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\t\u001A\u00020\bH\u0096\u0001\u00A2\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\bH\u0096\u0001\u00A2\u0006\u0004\b\u000B\u0010\nJ\u0018\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u0004H\u0096\u0001\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0018\u0010\u0012\u001A\u00020\r2\u0006\u0010\u0011\u001A\u00020\u0010H\u0096\u0001\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001A\u00020\r2\u0006\u0010\u0015\u001A\u00020\u0014H\u0096\u0001\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001A\u00020\r2\u0006\u0010\u0018\u001A\u00020\u0010H\u0096\u0001\u00A2\u0006\u0004\b\u0019\u0010\u0013J\u0018\u0010\u001A\u001A\u00020\r2\u0006\u0010\u0018\u001A\u00020\u0010H\u0096\u0001\u00A2\u0006\u0004\b\u001A\u0010\u0013J\u0018\u0010\u001C\u001A\u00020\r2\u0006\u0010\u001B\u001A\u00020\bH\u0096\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0018\u0010\u001F\u001A\u00020\r2\u0006\u0010\u001E\u001A\u00020\bH\u0096\u0001\u00A2\u0006\u0004\b\u001F\u0010\u001DJ\u0018\u0010 \u001A\u00020\r2\u0006\u0010\u0018\u001A\u00020\u0010H\u0096\u0001\u00A2\u0006\u0004\b \u0010\u0013J\u0018\u0010#\u001A\u00020\r2\u0006\u0010\"\u001A\u00020!H\u0096\u0001\u00A2\u0006\u0004\b#\u0010$J\u0018\u0010&\u001A\u00020\r2\u0006\u0010%\u001A\u00020\u0010H\u0096\u0001\u00A2\u0006\u0004\b&\u0010\u0013J\u0018\u0010(\u001A\u00020\r2\u0006\u0010\'\u001A\u00020\u0010H\u0096\u0001\u00A2\u0006\u0004\b(\u0010\u0013J\u0018\u0010)\u001A\u00020\r2\u0006\u0010\'\u001A\u00020\u0010H\u0096\u0001\u00A2\u0006\u0004\b)\u0010\u0013J\u0018\u0010+\u001A\u00020\r2\u0006\u0010\"\u001A\u00020*H\u0096\u0001\u00A2\u0006\u0004\b+\u0010,J\u0018\u0010-\u001A\u00020\r2\u0006\u0010\u0018\u001A\u00020\u0010H\u0096\u0001\u00A2\u0006\u0004\b-\u0010\u0013J\u0018\u0010.\u001A\u00020\r2\u0006\u0010\u0018\u001A\u00020\u0010H\u0096\u0001\u00A2\u0006\u0004\b.\u0010\u0013J\u0018\u00100\u001A\u00020\r2\u0006\u0010/\u001A\u00020\u0004H\u0096\u0001\u00A2\u0006\u0004\b0\u0010\u000FJ\u0018\u00101\u001A\u00020\r2\u0006\u0010\u0018\u001A\u00020\u0010H\u0096\u0001\u00A2\u0006\u0004\b1\u0010\u0013J\u0018\u00102\u001A\u00020\r2\u0006\u0010\u0018\u001A\u00020\u0010H\u0096\u0001\u00A2\u0006\u0004\b2\u0010\u0013J\u0018\u00103\u001A\u00020\r2\u0006\u0010\u0018\u001A\u00020\u0010H\u0096\u0001\u00A2\u0006\u0004\b3\u0010\u0013J\u0015\u00105\u001A\u00020\r2\u0006\u00104\u001A\u00020\u0010\u00A2\u0006\u0004\b5\u0010\u0013R\u0017\u0010;\u001A\u0002068\u0006\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010:R\u0014\u0010=\u001A\u00020\b8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\b<\u0010\nR\u0014\u0010?\u001A\u00020\b8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\b>\u0010\nR\u0014\u0010A\u001A\u00020\b8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\b@\u0010\nR\u0014\u0010C\u001A\u00020\b8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bB\u0010\nR\u0014\u0010E\u001A\u00020\b8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bD\u0010\nR\u0014\u0010G\u001A\u00020\b8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bF\u0010\nR\u0014\u0010K\u001A\u00020H8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bI\u0010JR\u0014\u0010O\u001A\u00020L8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bM\u0010N\u00A8\u0006P"}, d2 = {"Lcom/otaliastudios/zoom/ZoomLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "", "getMaxZoomType", "()I", "getMinZoomType", "", "getMaxZoom", "()F", "getMinZoom", "alignment", "Lw2/k;", "setAlignment", "(I)V", "", "allow", "setAllowFlingInOverscroll", "(Z)V", "", "duration", "setAnimationDuration", "(J)V", "enabled", "setFlingEnabled", "setHorizontalPanEnabled", "maxZoom", "setMaxZoom", "(F)V", "minZoom", "setMinZoom", "setOneFingerScrollEnabled", "LZ1/b;", "provider", "setOverPanRange", "(LZ1/b;)V", "overPinchable", "setOverPinchable", "overScroll", "setOverScrollHorizontal", "setOverScrollVertical", "LZ1/c;", "setOverZoomRange", "(LZ1/c;)V", "setScrollEnabled", "setThreeFingersScrollEnabled", "transformation", "setTransformation", "setTwoFingersScrollEnabled", "setVerticalPanEnabled", "setZoomEnabled", "hasClickableChildren", "setHasClickableChildren", "LZ1/j;", "i", "LZ1/j;", "getEngine", "()LZ1/j;", "engine", "getPanX", "panX", "getPanY", "panY", "getRealZoom", "realZoom", "getScaledPanX", "scaledPanX", "getScaledPanY", "scaledPanY", "getZoom", "zoom", "LZ1/a;", "getPan", "()LZ1/a;", "pan", "LZ1/e;", "getScaledPan", "()LZ1/e;", "scaledPan", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public class ZoomLayout extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public final j i;
    public boolean j;
    public static final f k;

    static {
        ZoomLayout.k = new f("ZoomLayout");
    }

    public ZoomLayout(Context context0, AttributeSet attributeSet0) {
        J2.j.f(context0, "context");
        j j0 = new j(context0);
        super(context0, attributeSet0, 0);
        this.i = j0;
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, d.a, 0, 0);
        J2.j.e(typedArray0, "context.theme.obtainStyledAttributes(attrs, R.styleable.ZoomEngine, defStyleAttr, 0)");
        boolean z = typedArray0.getBoolean(12, true);
        boolean z1 = typedArray0.getBoolean(13, true);
        boolean z2 = typedArray0.getBoolean(5, true);
        boolean z3 = typedArray0.getBoolean(19, true);
        boolean z4 = typedArray0.getBoolean(11, true);
        boolean z5 = typedArray0.getBoolean(20, true);
        boolean z6 = typedArray0.getBoolean(3, true);
        boolean z7 = typedArray0.getBoolean(14, true);
        boolean z8 = typedArray0.getBoolean(10, true);
        boolean z9 = typedArray0.getBoolean(18, true);
        boolean z10 = typedArray0.getBoolean(15, true);
        boolean z11 = typedArray0.getBoolean(1, true);
        boolean z12 = typedArray0.getBoolean(4, false);
        float f = typedArray0.getFloat(8, 0.8f);
        float f1 = typedArray0.getFloat(6, 2.5f);
        int v = typedArray0.getInteger(9, 0);
        int v1 = typedArray0.getInteger(7, 0);
        int v2 = typedArray0.getInteger(16, 0);
        int v3 = typedArray0.getInt(17, 0);
        int v4 = typedArray0.getInt(0, 51);
        long v5 = (long)typedArray0.getInt(2, 280);
        typedArray0.recycle();
        if(j0.c != null) {
            throw new IllegalStateException("container already set");
        }
        j0.c = this;
        this.addOnAttachStateChangeListener(new i(j0, 0));
        j0.b(new k(this, 0));
        j0.a = v2;
        j0.b = v3;
        this.setAlignment(v4);
        this.setOverScrollHorizontal(z);
        this.setOverScrollVertical(z1);
        this.setHorizontalPanEnabled(z2);
        this.setVerticalPanEnabled(z3);
        this.setOverPinchable(z4);
        this.setZoomEnabled(z5);
        this.setFlingEnabled(z6);
        this.setScrollEnabled(z7);
        this.setOneFingerScrollEnabled(z8);
        this.setTwoFingersScrollEnabled(z9);
        this.setThreeFingersScrollEnabled(z10);
        this.setAllowFlingInOverscroll(z11);
        this.setAnimationDuration(v5);
        j0.e(f, v);
        j0.d(f1, v1);
        this.setHasClickableChildren(z12);
        this.setWillNotDraw(false);
    }

    public final void a() {
        if(!this.j) {
            this.invalidate();
        }
        else if(this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            view0.setPivotX(0.0f);
            view0.setPivotY(0.0f);
            view0.setTranslationX(this.i.i.e.left);
            view0.setTranslationY(this.i.i.e.top);
            view0.setScaleX(this.i.i.f());
            view0.setScaleY(this.i.i.f());
        }
        if((this.isHorizontalScrollBarEnabled() || this.isVerticalScrollBarEnabled()) && !this.awakenScrollBars()) {
            this.invalidate();
        }
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        J2.j.f(view0, "child");
        J2.j.f(viewGroup$LayoutParams0, "params");
        if(this.getChildCount() > 0) {
            throw new RuntimeException("ZoomLayout accepts only a single child.");
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    @Override  // android.view.View
    public final int computeHorizontalScrollOffset() {
        return (int)(-this.i.i.e.left);
    }

    @Override  // android.view.View
    public final int computeHorizontalScrollRange() {
        return (int)this.i.i.e.width();
    }

    @Override  // android.view.View
    public final int computeVerticalScrollOffset() {
        return (int)(-this.i.i.e.top);
    }

    @Override  // android.view.View
    public final int computeVerticalScrollRange() {
        return (int)this.i.i.e.height();
    }

    @Override  // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas0, View view0, long v) {
        J2.j.f(canvas0, "canvas");
        J2.j.f(view0, "child");
        if(!this.j) {
            int v1 = canvas0.save();
            this.i.i.i.set(this.i.i.g);
            canvas0.concat(this.i.i.i);
            boolean z = super.drawChild(canvas0, view0, v);
            canvas0.restoreToCount(v1);
            return z;
        }
        return super.drawChild(canvas0, view0, v);
    }

    public final j getEngine() {
        return this.i;
    }

    public float getMaxZoom() {
        return this.i.h.n;
    }

    public int getMaxZoomType() {
        return this.i.h.o;
    }

    public float getMinZoom() {
        return this.i.h.l;
    }

    public int getMinZoomType() {
        return this.i.h.m;
    }

    public a getPan() {
        a a0 = this.i.i.c();
        return new a(a0.a, a0.b);
    }

    public float getPanX() {
        return this.i.i.d();
    }

    public float getPanY() {
        return this.i.i.e.top / this.i.i.f();
    }

    public float getRealZoom() {
        return this.i.i.f();
    }

    public e getScaledPan() {
        e e0 = this.i.i.e();
        return new e(e0.a, e0.b);
    }

    public float getScaledPanX() {
        return this.i.i.e.left;
    }

    public float getScaledPanY() {
        return this.i.i.e.top;
    }

    public float getZoom() {
        return this.i.i.f() / this.i.h.k;
    }

    @Override  // android.view.ViewGroup
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override  // android.view.ViewGroup
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if(this.getChildCount() == 0) {
            return;
        }
        View view0 = this.getChildAt(0);
        float f = (float)view0.getWidth();
        float f1 = (float)view0.getHeight();
        b b0 = this.i.i;
        b0.getClass();
        if(f > 0.0f && f1 > 0.0f) {
            RectF rectF0 = b0.f;
            if(rectF0.width() != f || rectF0.height() != f1) {
                float f2 = b0.f();
                rectF0.set(0.0f, 0.0f, f, f1);
                b0.g(f2);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        J2.j.f(motionEvent0, "ev");
        this.i.getClass();
        this.i.f.getClass();
        return this.i.f.a(motionEvent0) > 1 || this.j && super.onInterceptTouchEvent(motionEvent0);
    }

    @Override  // android.widget.FrameLayout
    public final void onMeasure(int v, int v1) {
        if(View.MeasureSpec.getMode(v) == 0 || View.MeasureSpec.getMode(v1) == 0) {
            throw new RuntimeException("ZoomLayout must be used with fixed dimensions (e.g. match_parent)");
        }
        this.setMeasuredDimension(View.MeasureSpec.getSize(v), View.MeasureSpec.getSize(v1));
        this.measureChildren(0, 0);
    }

    @Override  // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        J2.j.f(motionEvent0, "ev");
        this.i.getClass();
        this.i.f.getClass();
        return this.i.f.a(motionEvent0) > 0 || this.j && super.onTouchEvent(motionEvent0);
    }

    public void setAlignment(int v) {
        this.i.g.o = v;
    }

    public void setAllowFlingInOverscroll(boolean z) {
        this.i.j.m = z;
    }

    public void setAnimationDuration(long v) {
        this.i.i.n = v;
    }

    public void setFlingEnabled(boolean z) {
        this.i.j.h = z;
    }

    public final void setHasClickableChildren(boolean z) {
        Object[] arr_object = {"setHasClickableChildren:", "old:", Boolean.valueOf(this.j), "new:", Boolean.valueOf(z)};
        ZoomLayout.k.getClass();
        f.f(1, Arrays.copyOf(arr_object, 5));
        if(this.j && !z && this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            view0.setScaleX(1.0f);
            view0.setScaleY(1.0f);
            view0.setTranslationX(0.0f);
            view0.setTranslationY(0.0f);
        }
        this.j = z;
        if(this.getWidth() > 0 && this.getHeight() > 0) {
            if(this.j) {
                this.a();
                return;
            }
            this.invalidate();
        }
    }

    public void setHorizontalPanEnabled(boolean z) {
        this.i.g.m = z;
    }

    public void setMaxZoom(float f) {
        this.i.d(f, 0);
    }

    public void setMinZoom(float f) {
        this.i.e(f, 0);
    }

    public void setOneFingerScrollEnabled(boolean z) {
        this.i.j.j = z;
    }

    public void setOverPanRange(Z1.b b0) {
        J2.j.f(b0, "provider");
        this.i.getClass();
        this.i.g.getClass();
        this.i.g.p = b0;
    }

    public void setOverPinchable(boolean z) {
        this.i.h.r = z;
    }

    public void setOverScrollHorizontal(boolean z) {
        this.i.g.k = z;
    }

    public void setOverScrollVertical(boolean z) {
        this.i.g.l = z;
    }

    public void setOverZoomRange(c c0) {
        J2.j.f(c0, "provider");
        this.i.getClass();
        this.i.h.getClass();
        this.i.h.p = c0;
    }

    public void setScrollEnabled(boolean z) {
        this.i.j.i = z;
    }

    public void setThreeFingersScrollEnabled(boolean z) {
        this.i.j.l = z;
    }

    public void setTransformation(int v) {
        this.i.a = v;
        this.i.b = 0;
    }

    public void setTwoFingersScrollEnabled(boolean z) {
        this.i.j.k = z;
    }

    public void setVerticalPanEnabled(boolean z) {
        this.i.g.n = z;
    }

    public void setZoomEnabled(boolean z) {
        this.i.h.q = z;
    }
}

