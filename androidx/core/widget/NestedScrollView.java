package androidx.core.widget;

import E.g;
import E.h;
import E.q;
import G.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import i3.e;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements g {
    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR;
        public int i;

        static {
            SavedState.CREATOR = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override
        public final String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("HorizontalScrollView.SavedState{");
            stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder0.append(" scrollPosition=");
            return e.g(stringBuilder0, this.i, "}");
        }

        @Override  // android.view.View$BaseSavedState
        public final void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.i);
        }
    }

    public final int[] A;
    public int B;
    public int C;
    public SavedState D;
    public final h E;
    public final E.e F;
    public float G;
    public static final d H;
    public static final int[] I;
    public long i;
    public final Rect j;
    public final OverScroller k;
    public EdgeEffect l;
    public EdgeEffect m;
    public int n;
    public boolean o;
    public boolean p;
    public View q;
    public boolean r;
    public VelocityTracker s;
    public boolean t;
    public boolean u;
    public final int v;
    public final int w;
    public final int x;
    public int y;
    public final int[] z;

    static {
        NestedScrollView.H = new d();  // 初始化器: LE/b;-><init>()V
        NestedScrollView.I = new int[]{0x101017A};
    }

    public NestedScrollView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0x7F02010A);  // attr:nestedScrollViewStyle
        this.j = new Rect();
        this.o = true;
        this.p = false;
        this.q = null;
        this.r = false;
        this.u = true;
        this.y = -1;
        this.z = new int[2];
        this.A = new int[2];
        this.k = new OverScroller(this.getContext());
        this.setFocusable(true);
        this.setDescendantFocusability(0x40000);
        this.setWillNotDraw(false);
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(this.getContext());
        this.v = viewConfiguration0.getScaledTouchSlop();
        this.w = viewConfiguration0.getScaledMinimumFlingVelocity();
        this.x = viewConfiguration0.getScaledMaximumFlingVelocity();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, NestedScrollView.I, 0x7F02010A, 0);  // attr:nestedScrollViewStyle
        this.setFillViewport(typedArray0.getBoolean(0, false));
        typedArray0.recycle();
        this.E = new h();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.F = new E.e(this);
        this.setNestedScrollingEnabled(true);
        q.d(this, NestedScrollView.H);
    }

    @Override  // E.f
    public final void a(View view0, View view1, int v, int v1) {
        h h0 = this.E;
        if(v1 == 1) {
            h0.b = v;
        }
        else {
            h0.a = v;
        }
        this.u(2, v1);
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0) {
        if(this.getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view0);
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0, int v) {
        if(this.getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view0, v);
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(this.getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(this.getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view0, viewGroup$LayoutParams0);
    }

    @Override  // E.f
    public final void b(ViewGroup viewGroup0, int v, int v1, int v2, int v3, int v4) {
        this.p(v3, v4, null);
    }

    @Override  // E.f
    public final void c(View view0, int v) {
        h h0 = this.E;
        if(v == 1) {
            h0.b = 0;
        }
        else {
            h0.a = 0;
        }
        this.v(v);
    }

    @Override  // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override  // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override  // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override  // android.view.View
    public final void computeScroll() {
        OverScroller overScroller0 = this.k;
        if(overScroller0.isFinished()) {
            return;
        }
        overScroller0.computeScrollOffset();
        int v = overScroller0.getCurrY();
        int v1 = v - this.C;
        this.C = v;
        int[] arr_v = this.A;
        arr_v[1] = 0;
        this.F.c(0, v1, 1, arr_v, null);
        int v2 = v1 - arr_v[1];
        int v3 = this.getScrollRange();
        if(v2 != 0) {
            int v4 = this.getScrollY();
            this.r(v2, this.getScrollX(), v4, v3);
            int v5 = this.getScrollY() - v4;
            int v6 = v2 - v5;
            arr_v[1] = 0;
            this.F.d(0, v5, 0, v6, this.z, 1, arr_v);
            v2 = v6 - arr_v[1];
        }
        if(v2 != 0) {
            int v7 = this.getOverScrollMode();
            if(v7 == 0 || v7 == 1 && v3 > 0) {
                this.j();
                if(v2 >= 0) {
                    if(this.m.isFinished()) {
                        this.m.onAbsorb(((int)overScroller0.getCurrVelocity()));
                    }
                }
                else if(this.l.isFinished()) {
                    this.l.onAbsorb(((int)overScroller0.getCurrVelocity()));
                }
            }
            overScroller0.abortAnimation();
            this.v(1);
        }
        if(!overScroller0.isFinished()) {
            this.postInvalidateOnAnimation();
            return;
        }
        this.v(1);
    }

    @Override  // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override  // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override  // android.view.View
    public final int computeVerticalScrollRange() {
        int v = this.getChildCount();
        int v1 = this.getHeight() - this.getPaddingBottom() - this.getPaddingTop();
        if(v == 0) {
            return v1;
        }
        View view0 = this.getChildAt(0);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
        int v2 = view0.getBottom() + frameLayout$LayoutParams0.bottomMargin;
        int v3 = this.getScrollY();
        int v4 = Math.max(0, v2 - v1);
        if(v3 < 0) {
            return v2 - v3;
        }
        return v3 <= v4 ? v2 : v2 + (v3 - v4);
    }

    @Override  // E.f
    public final void d(int v, int v1, int[] arr_v, int v2) {
        this.F.c(v, v1, v2, arr_v, null);
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public final boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        return super.dispatchKeyEvent(keyEvent0) || this.k(keyEvent0);
    }

    @Override  // android.view.View
    public final boolean dispatchNestedFling(float f, float f1, boolean z) {
        return this.F.a(f, f1, z);
    }

    @Override  // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f1) {
        return this.F.b(f, f1);
    }

    @Override  // android.view.View
    public final boolean dispatchNestedPreScroll(int v, int v1, int[] arr_v, int[] arr_v1) {
        return this.F.c(v, v1, 0, arr_v, arr_v1);
    }

    @Override  // android.view.View
    public final boolean dispatchNestedScroll(int v, int v1, int v2, int v3, int[] arr_v) {
        return this.F.d(v, v1, v2, v3, arr_v, 0, null);
    }

    @Override  // android.view.View
    public final void draw(Canvas canvas0) {
        int v7;
        super.draw(canvas0);
        if(this.l != null) {
            int v = this.getScrollY();
            int v1 = 0;
            if(!this.l.isFinished()) {
                int v2 = canvas0.save();
                int v3 = this.getWidth();
                int v4 = this.getHeight();
                int v5 = Math.min(0, v);
                if(this.getClipToPadding()) {
                    int v6 = this.getPaddingLeft();
                    v3 -= this.getPaddingRight() + v6;
                    v7 = this.getPaddingLeft();
                }
                else {
                    v7 = 0;
                }
                if(this.getClipToPadding()) {
                    int v8 = this.getPaddingTop();
                    v4 -= this.getPaddingBottom() + v8;
                    v5 += this.getPaddingTop();
                }
                canvas0.translate(((float)v7), ((float)v5));
                this.l.setSize(v3, v4);
                if(this.l.draw(canvas0)) {
                    this.postInvalidateOnAnimation();
                }
                canvas0.restoreToCount(v2);
            }
            if(!this.m.isFinished()) {
                int v9 = canvas0.save();
                int v10 = this.getWidth();
                int v11 = this.getHeight();
                int v12 = Math.max(this.getScrollRange(), v) + v11;
                if(this.getClipToPadding()) {
                    int v13 = this.getPaddingLeft();
                    v10 -= this.getPaddingRight() + v13;
                    v1 = this.getPaddingLeft();
                }
                if(this.getClipToPadding()) {
                    int v14 = this.getPaddingTop();
                    v11 -= this.getPaddingBottom() + v14;
                    v12 -= this.getPaddingBottom();
                }
                canvas0.translate(((float)(v1 - v10)), ((float)v12));
                canvas0.rotate(180.0f, ((float)v10), 0.0f);
                this.m.setSize(v10, v11);
                if(this.m.draw(canvas0)) {
                    this.postInvalidateOnAnimation();
                }
                canvas0.restoreToCount(v9);
            }
        }
    }

    @Override  // E.g
    public final void e(ViewGroup viewGroup0, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
        this.p(v3, v4, arr_v);
    }

    @Override  // E.f
    public final boolean f(View view0, View view1, int v, int v1) {
        return (v & 2) != 0;
    }

    public final boolean g(int v) {
        View view0 = this.findFocus();
        if(view0 == this) {
            view0 = null;
        }
        View view1 = FocusFinder.getInstance().findNextFocus(this, view0, v);
        int v1 = this.getMaxScrollAmount();
        if(view1 == null || !this.o(view1, v1, this.getHeight())) {
            if(v == 33 && this.getScrollY() < v1) {
                v1 = this.getScrollY();
            }
            else if(v == 130 && this.getChildCount() > 0) {
                View view2 = this.getChildAt(0);
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view2.getLayoutParams();
                int v2 = view2.getBottom() + frameLayout$LayoutParams0.bottomMargin;
                int v3 = this.getScrollY();
                v1 = Math.min(v2 - (this.getHeight() + v3 - this.getPaddingBottom()), v1);
            }
            if(v1 == 0) {
                return false;
            }
            if(v != 130) {
                v1 = -v1;
            }
            this.i(v1);
        }
        else {
            view1.getDrawingRect(this.j);
            this.offsetDescendantRectToMyCoords(view1, this.j);
            this.i(this.h(this.j));
            view1.requestFocus(v);
        }
        if(view0 != null && view0.isFocused() && !this.o(view0, 0, this.getHeight())) {
            int v4 = this.getDescendantFocusability();
            this.setDescendantFocusability(0x20000);
            this.requestFocus();
            this.setDescendantFocusability(v4);
        }
        return true;
    }

    @Override  // android.view.View
    public float getBottomFadingEdgeStrength() {
        if(this.getChildCount() == 0) {
            return 0.0f;
        }
        View view0 = this.getChildAt(0);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
        int v = this.getVerticalFadingEdgeLength();
        int v1 = this.getHeight();
        int v2 = this.getPaddingBottom();
        int v3 = view0.getBottom() + frameLayout$LayoutParams0.bottomMargin - this.getScrollY() - (v1 - v2);
        return v3 >= v ? 1.0f : ((float)v3) / ((float)v);
    }

    public int getMaxScrollAmount() {
        return (int)(((float)this.getHeight()) * 0.5f);
    }

    @Override  // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.E.b | this.E.a;
    }

    public int getScrollRange() {
        if(this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
            return Math.max(0, view0.getHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin - (this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()));
        }
        return 0;
    }

    @Override  // android.view.View
    public float getTopFadingEdgeStrength() {
        if(this.getChildCount() == 0) {
            return 0.0f;
        }
        int v = this.getVerticalFadingEdgeLength();
        int v1 = this.getScrollY();
        return v1 >= v ? 1.0f : ((float)v1) / ((float)v);
    }

    private float getVerticalScrollFactorCompat() {
        if(this.G == 0.0f) {
            TypedValue typedValue0 = new TypedValue();
            Context context0 = this.getContext();
            if(!context0.getTheme().resolveAttribute(0x101004D, typedValue0, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.G = typedValue0.getDimension(context0.getResources().getDisplayMetrics());
            return this.G;
        }
        return this.G;
    }

    public final int h(Rect rect0) {
        if(this.getChildCount() == 0) {
            return 0;
        }
        int v = this.getHeight();
        int v1 = this.getScrollY();
        int v2 = v1 + v;
        int v3 = this.getVerticalFadingEdgeLength();
        if(rect0.top > 0) {
            v1 += v3;
        }
        View view0 = this.getChildAt(0);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
        int v4 = rect0.bottom >= view0.getHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin ? v2 : v2 - v3;
        int v5 = rect0.bottom;
        if(v5 > v4 && rect0.top > v1) {
            return rect0.height() <= v ? Math.min(rect0.bottom - v4, view0.getBottom() + frameLayout$LayoutParams0.bottomMargin - v2) : Math.min(rect0.top - v1, view0.getBottom() + frameLayout$LayoutParams0.bottomMargin - v2);
        }
        if(rect0.top < v1 && v5 < v4) {
            return rect0.height() <= v ? Math.max(-(v1 - rect0.top), -this.getScrollY()) : Math.max(-(v4 - rect0.bottom), -this.getScrollY());
        }
        return 0;
    }

    @Override  // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.F.f(0);
    }

    public final void i(int v) {
        if(v != 0) {
            if(this.u) {
                this.t(0, v, false);
                return;
            }
            this.scrollBy(0, v);
        }
    }

    @Override  // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.F.d;
    }

    public final void j() {
        if(this.getOverScrollMode() == 2) {
            this.l = null;
            this.m = null;
        }
        else if(this.l == null) {
            Context context0 = this.getContext();
            this.l = new EdgeEffect(context0);
            this.m = new EdgeEffect(context0);
        }
    }

    public final boolean k(KeyEvent keyEvent0) {
        boolean z;
        Rect rect0 = this.j;
        rect0.setEmpty();
        if(this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
            if(view0.getHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin > this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()) {
                if(keyEvent0.getAction() == 0) {
                    int v = 33;
                    switch(keyEvent0.getKeyCode()) {
                        case 19: {
                            return keyEvent0.isAltPressed() ? this.m(33) : this.g(33);
                        }
                        case 20: {
                            return keyEvent0.isAltPressed() ? this.m(130) : this.g(130);
                        }
                        case 62: {
                            if(keyEvent0.isShiftPressed()) {
                                z = false;
                            }
                            else {
                                v = 130;
                                z = true;
                            }
                            int v1 = this.getHeight();
                            if(z) {
                                rect0.top = this.getScrollY() + v1;
                                int v2 = this.getChildCount();
                                if(v2 > 0) {
                                    View view1 = this.getChildAt(v2 - 1);
                                    FrameLayout.LayoutParams frameLayout$LayoutParams1 = (FrameLayout.LayoutParams)view1.getLayoutParams();
                                    int v3 = view1.getBottom() + frameLayout$LayoutParams1.bottomMargin;
                                    int v4 = this.getPaddingBottom() + v3;
                                    if(rect0.top + v1 > v4) {
                                        rect0.top = v4 - v1;
                                    }
                                }
                            }
                            else {
                                int v5 = this.getScrollY() - v1;
                                rect0.top = v5;
                                if(v5 < 0) {
                                    rect0.top = 0;
                                }
                            }
                            int v6 = v1 + rect0.top;
                            rect0.bottom = v6;
                            this.s(v, rect0.top, v6);
                            return false;
                        }
                        default: {
                            return false;
                        }
                    }
                }
                return false;
            }
        }
        if(this.isFocused() && keyEvent0.getKeyCode() != 4) {
            View view2 = this.findFocus();
            if(view2 == this) {
                view2 = null;
            }
            View view3 = FocusFinder.getInstance().findNextFocus(this, view2, 130);
            return view3 != null && view3 != this && view3.requestFocus(130);
        }
        return false;
    }

    public final void l(int v) {
        if(this.getChildCount() > 0) {
            int v1 = this.getScrollX();
            int v2 = this.getScrollY();
            this.k.fling(v1, v2, 0, v, 0, 0, 0x80000000, 0x7FFFFFFF, 0, 0);
            this.u(2, 1);
            this.C = this.getScrollY();
            this.postInvalidateOnAnimation();
        }
    }

    public final boolean m(int v) {
        int v1 = this.getHeight();
        Rect rect0 = this.j;
        rect0.top = 0;
        rect0.bottom = v1;
        if(v == 130) {
            int v2 = this.getChildCount();
            if(v2 > 0) {
                View view0 = this.getChildAt(v2 - 1);
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
                int v3 = view0.getBottom() + frameLayout$LayoutParams0.bottomMargin;
                int v4 = this.getPaddingBottom() + v3;
                rect0.bottom = v4;
                rect0.top = v4 - v1;
            }
        }
        return this.s(v, rect0.top, rect0.bottom);
    }

    @Override  // android.view.ViewGroup
    public final void measureChild(View view0, int v, int v1) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        int v2 = this.getPaddingLeft();
        view0.measure(ViewGroup.getChildMeasureSpec(v, this.getPaddingRight() + v2, viewGroup$LayoutParams0.width), 0);
    }

    @Override  // android.view.ViewGroup
    public final void measureChildWithMargins(View view0, int v, int v1, int v2, int v3) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        int v4 = this.getPaddingLeft();
        view0.measure(ViewGroup.getChildMeasureSpec(v, this.getPaddingRight() + v4 + viewGroup$MarginLayoutParams0.leftMargin + viewGroup$MarginLayoutParams0.rightMargin + v1, viewGroup$MarginLayoutParams0.width), View.MeasureSpec.makeMeasureSpec(viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin, 0));
    }

    public static boolean n(View view0, NestedScrollView nestedScrollView0) {
        if(view0 == nestedScrollView0) {
            return true;
        }
        ViewParent viewParent0 = view0.getParent();
        return viewParent0 instanceof ViewGroup && NestedScrollView.n(((View)viewParent0), nestedScrollView0);
    }

    public final boolean o(View view0, int v, int v1) {
        view0.getDrawingRect(this.j);
        this.offsetDescendantRectToMyCoords(view0, this.j);
        return this.j.bottom + v >= this.getScrollY() && this.j.top - v <= this.getScrollY() + v1;
    }

    @Override  // android.view.ViewGroup
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p = false;
    }

    @Override  // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent0) {
        if((motionEvent0.getSource() & 2) != 0 && motionEvent0.getAction() == 8 && !this.r) {
            float f = motionEvent0.getAxisValue(9);
            if(f != 0.0f) {
                float f1 = this.getVerticalScrollFactorCompat();
                int v = this.getScrollRange();
                int v1 = this.getScrollY();
                int v2 = v1 - ((int)(f * f1));
                if(v2 < 0) {
                    v = 0;
                }
                else if(v2 <= v) {
                    v = v2;
                }
                if(v != v1) {
                    super.scrollTo(this.getScrollX(), v);
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        OverScroller overScroller0 = this.k;
        int v = motionEvent0.getAction();
        if(v == 2 && this.r) {
            return true;
        }
        if((v & 0xFF) == 0) {
            int v7 = (int)motionEvent0.getY();
            int v8 = (int)motionEvent0.getX();
            if(this.getChildCount() > 0) {
                int v9 = this.getScrollY();
                View view0 = this.getChildAt(0);
                if(v7 >= view0.getTop() - v9 && v7 < view0.getBottom() - v9 && v8 >= view0.getLeft() && v8 < view0.getRight()) {
                    this.n = v7;
                    this.y = motionEvent0.getPointerId(0);
                    VelocityTracker velocityTracker1 = this.s;
                    if(velocityTracker1 == null) {
                        this.s = VelocityTracker.obtain();
                    }
                    else {
                        velocityTracker1.clear();
                    }
                    this.s.addMovement(motionEvent0);
                    overScroller0.computeScrollOffset();
                    this.r = !overScroller0.isFinished();
                    this.u(2, 0);
                    return this.r;
                }
            }
            this.r = false;
            VelocityTracker velocityTracker2 = this.s;
            if(velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.s = null;
            }
        }
        else {
            switch(v & 0xFF) {
                case 1: {
                    goto label_8;
                }
                case 2: {
                    goto label_23;
                }
            }
            switch(v & 0xFF) {
                case 3: {
                label_8:
                    this.r = false;
                    this.y = -1;
                    VelocityTracker velocityTracker0 = this.s;
                    if(velocityTracker0 != null) {
                        velocityTracker0.recycle();
                        this.s = null;
                    }
                    int v1 = this.getScrollX();
                    int v2 = this.getScrollY();
                    int v3 = this.getScrollRange();
                    if(this.k.springBack(v1, v2, 0, 0, 0, v3)) {
                        this.postInvalidateOnAnimation();
                    }
                    this.v(0);
                    return this.r;
                }
                case 6: {
                    this.q(motionEvent0);
                    return this.r;
                }
                default: {
                    return this.r;
                }
            }
        label_23:
            int v4 = this.y;
            if(v4 != -1) {
                int v5 = motionEvent0.findPointerIndex(v4);
                if(v5 == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + v4 + " in onInterceptTouchEvent");
                    return this.r;
                }
                int v6 = (int)motionEvent0.getY(v5);
                if(Math.abs(v6 - this.n) > this.v && (this.getNestedScrollAxes() & 2) == 0) {
                    this.r = true;
                    this.n = v6;
                    if(this.s == null) {
                        this.s = VelocityTracker.obtain();
                    }
                    this.s.addMovement(motionEvent0);
                    this.B = 0;
                    ViewParent viewParent0 = this.getParent();
                    if(viewParent0 != null) {
                        viewParent0.requestDisallowInterceptTouchEvent(true);
                        return this.r;
                    }
                }
            }
        }
        return this.r;
    }

    @Override  // android.widget.FrameLayout
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v6;
        super.onLayout(z, v, v1, v2, v3);
        int v4 = 0;
        this.o = false;
        if(this.q != null && NestedScrollView.n(this.q, this)) {
            View view0 = this.q;
            view0.getDrawingRect(this.j);
            this.offsetDescendantRectToMyCoords(view0, this.j);
            int v5 = this.h(this.j);
            if(v5 != 0) {
                this.scrollBy(0, v5);
            }
        }
        this.q = null;
        if(!this.p) {
            if(this.D != null) {
                this.scrollTo(this.getScrollX(), this.D.i);
                this.D = null;
            }
            if(this.getChildCount() > 0) {
                View view1 = this.getChildAt(0);
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view1.getLayoutParams();
                v6 = view1.getMeasuredHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin;
            }
            else {
                v6 = 0;
            }
            int v7 = v3 - v1 - this.getPaddingTop() - this.getPaddingBottom();
            int v8 = this.getScrollY();
            if(v7 < v6 && v8 >= 0) {
                v4 = v7 + v8 <= v6 ? v8 : v6 - v7;
            }
            if(v4 != v8) {
                this.scrollTo(this.getScrollX(), v4);
            }
        }
        this.scrollTo(this.getScrollX(), this.getScrollY());
        this.p = true;
    }

    @Override  // android.widget.FrameLayout
    public final void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(!this.t) {
            return;
        }
        if(View.MeasureSpec.getMode(v1) == 0) {
            return;
        }
        if(this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
            int v2 = view0.getMeasuredHeight();
            int v3 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom() - frameLayout$LayoutParams0.topMargin - frameLayout$LayoutParams0.bottomMargin;
            if(v2 < v3) {
                int v4 = this.getPaddingLeft();
                view0.measure(ViewGroup.getChildMeasureSpec(v, this.getPaddingRight() + v4 + frameLayout$LayoutParams0.leftMargin + frameLayout$LayoutParams0.rightMargin, frameLayout$LayoutParams0.width), View.MeasureSpec.makeMeasureSpec(v3, 0x40000000));
            }
        }
    }

    @Override  // android.view.ViewGroup
    public final boolean onNestedFling(View view0, float f, float f1, boolean z) {
        if(!z) {
            this.dispatchNestedFling(0.0f, f1, true);
            this.l(((int)f1));
            return true;
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    public final boolean onNestedPreFling(View view0, float f, float f1) {
        return this.F.b(f, f1);
    }

    @Override  // android.view.ViewGroup
    public final void onNestedPreScroll(View view0, int v, int v1, int[] arr_v) {
        this.F.c(v, v1, 0, arr_v, null);
    }

    @Override  // android.view.ViewGroup
    public final void onNestedScroll(View view0, int v, int v1, int v2, int v3) {
        this.p(v3, 0, null);
    }

    @Override  // android.view.ViewGroup
    public final void onNestedScrollAccepted(View view0, View view1, int v) {
        this.a(view0, view1, v, 0);
    }

    @Override  // android.view.View
    public final void onOverScrolled(int v, int v1, boolean z, boolean z1) {
        super.scrollTo(v, v1);
    }

    @Override  // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int v, Rect rect0) {
        switch(v) {
            case 1: {
                v = 33;
                break;
            }
            case 2: {
                v = 130;
            }
        }
        View view0 = rect0 == null ? FocusFinder.getInstance().findNextFocus(this, null, v) : FocusFinder.getInstance().findNextFocusFromRect(this, rect0, v);
        if(view0 == null) {
            return false;
        }
        return this.o(view0, 0, this.getHeight()) ? view0.requestFocus(v, rect0) : false;
    }

    @Override  // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).getSuperState());
        this.D = (SavedState)parcelable0;
        this.requestLayout();
    }

    @Override  // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());  // 初始化器: Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V
        parcelable0.i = this.getScrollY();
        return parcelable0;
    }

    @Override  // android.view.View
    public final void onScrollChanged(int v, int v1, int v2, int v3) {
        super.onScrollChanged(v, v1, v2, v3);
    }

    @Override  // android.view.View
    public final void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        View view0 = this.findFocus();
        if(view0 != null && this != view0 && this.o(view0, 0, v3)) {
            view0.getDrawingRect(this.j);
            this.offsetDescendantRectToMyCoords(view0, this.j);
            this.i(this.h(this.j));
        }
    }

    @Override  // android.view.ViewGroup
    public final boolean onStartNestedScroll(View view0, View view1, int v) {
        return this.f(view0, view1, v, 0);
    }

    @Override  // android.view.ViewGroup
    public final void onStopNestedScroll(View view0) {
        this.c(view0, 0);
    }

    @Override  // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        OverScroller overScroller0 = this.k;
        int v = this.v;
        if(this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        int v1 = motionEvent0.getActionMasked();
        if(v1 == 0) {
            this.B = 0;
        }
        MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
        motionEvent1.offsetLocation(0.0f, ((float)this.B));
        if(v1 == 0) {
            if(this.getChildCount() == 0) {
                return false;
            }
            boolean z1 = overScroller0.isFinished();
            this.r = !z1;
            if(!z1) {
                ViewParent viewParent1 = this.getParent();
                if(viewParent1 != null) {
                    viewParent1.requestDisallowInterceptTouchEvent(true);
                }
            }
            if(!overScroller0.isFinished()) {
                overScroller0.abortAnimation();
                this.v(1);
            }
            this.n = (int)motionEvent0.getY();
            this.y = motionEvent0.getPointerId(0);
            this.u(2, 0);
        }
        else {
            E.e e0 = this.F;
            switch(v1) {
                case 1: {
                    VelocityTracker velocityTracker0 = this.s;
                    velocityTracker0.computeCurrentVelocity(1000, ((float)this.x));
                    int v2 = (int)velocityTracker0.getYVelocity(this.y);
                    if(Math.abs(v2) < this.w) {
                        int v3 = this.getScrollX();
                        int v4 = this.getScrollY();
                        int v5 = this.getScrollRange();
                        if(this.k.springBack(v3, v4, 0, 0, 0, v5)) {
                            this.postInvalidateOnAnimation();
                        }
                    }
                    else if(!e0.b(0.0f, ((float)(-v2)))) {
                        this.dispatchNestedFling(0.0f, ((float)(-v2)), true);
                        this.l(-v2);
                    }
                    this.y = -1;
                    this.r = false;
                    VelocityTracker velocityTracker1 = this.s;
                    if(velocityTracker1 != null) {
                        velocityTracker1.recycle();
                        this.s = null;
                    }
                    this.v(0);
                    EdgeEffect edgeEffect0 = this.l;
                    if(edgeEffect0 != null) {
                        edgeEffect0.onRelease();
                        this.m.onRelease();
                    }
                    break;
                }
                case 2: {
                    int v6 = motionEvent0.findPointerIndex(this.y);
                    if(v6 == -1) {
                        Log.e("NestedScrollView", "Invalid pointerId=" + this.y + " in onTouchEvent");
                    }
                    else {
                        int v7 = (int)motionEvent0.getY(v6);
                        int v8 = this.n - v7;
                        if(!this.r && Math.abs(v8) > v) {
                            ViewParent viewParent0 = this.getParent();
                            if(viewParent0 != null) {
                                viewParent0.requestDisallowInterceptTouchEvent(true);
                            }
                            this.r = true;
                            v8 = v8 <= 0 ? v8 + v : v8 - v;
                        }
                        if(this.r) {
                            boolean z = this.F.c(0, v8, 0, this.A, this.z);
                            int[] arr_v = this.A;
                            int[] arr_v1 = this.z;
                            if(z) {
                                v8 -= arr_v[1];
                                this.B += arr_v1[1];
                            }
                            this.n = v7 - arr_v1[1];
                            int v9 = this.getScrollY();
                            int v10 = this.getScrollRange();
                            int v11 = this.getOverScrollMode();
                            if(this.r(v8, 0, this.getScrollY(), v10) && !e0.f(0)) {
                                this.s.clear();
                            }
                            int v12 = this.getScrollY();
                            arr_v[1] = 0;
                            this.F.d(0, v12 - v9, 0, v8 - (v12 - v9), this.z, 0, arr_v);
                            this.n -= arr_v1[1];
                            this.B += arr_v1[1];
                            if(v11 == 0 || v11 == 1 && v10 > 0) {
                                int v13 = v8 - arr_v[1];
                                this.j();
                                int v14 = v9 + v13;
                                if(v14 < 0) {
                                    this.l.onPull(((float)v13) / ((float)this.getHeight()), motionEvent0.getX(v6) / ((float)this.getWidth()));
                                    if(!this.m.isFinished()) {
                                        this.m.onRelease();
                                    }
                                }
                                else if(v14 > v10) {
                                    this.m.onPull(((float)v13) / ((float)this.getHeight()), 1.0f - motionEvent0.getX(v6) / ((float)this.getWidth()));
                                    if(!this.l.isFinished()) {
                                        this.l.onRelease();
                                    }
                                }
                                if(this.l != null && (!this.l.isFinished() || !this.m.isFinished())) {
                                    this.postInvalidateOnAnimation();
                                }
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    if(this.r && this.getChildCount() > 0) {
                        int v15 = this.getScrollX();
                        int v16 = this.getScrollY();
                        int v17 = this.getScrollRange();
                        if(this.k.springBack(v15, v16, 0, 0, 0, v17)) {
                            this.postInvalidateOnAnimation();
                        }
                    }
                    this.y = -1;
                    this.r = false;
                    VelocityTracker velocityTracker2 = this.s;
                    if(velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.s = null;
                    }
                    this.v(0);
                    EdgeEffect edgeEffect1 = this.l;
                    if(edgeEffect1 != null) {
                        edgeEffect1.onRelease();
                        this.m.onRelease();
                    }
                    break;
                }
                case 5: {
                    int v18 = motionEvent0.getActionIndex();
                    this.n = (int)motionEvent0.getY(v18);
                    this.y = motionEvent0.getPointerId(v18);
                    break;
                }
                case 6: {
                    this.q(motionEvent0);
                    this.n = (int)motionEvent0.getY(motionEvent0.findPointerIndex(this.y));
                }
            }
        }
        VelocityTracker velocityTracker3 = this.s;
        if(velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent1);
        }
        motionEvent1.recycle();
        return true;
    }

    public final void p(int v, int v1, int[] arr_v) {
        int v2 = this.getScrollY();
        this.scrollBy(0, v);
        int v3 = this.getScrollY() - v2;
        if(arr_v != null) {
            arr_v[1] += v3;
        }
        this.F.d(0, v3, 0, v - v3, null, v1, arr_v);
    }

    public final void q(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionIndex();
        if(motionEvent0.getPointerId(v) == this.y) {
            int v1 = v == 0 ? 1 : 0;
            this.n = (int)motionEvent0.getY(v1);
            this.y = motionEvent0.getPointerId(v1);
            VelocityTracker velocityTracker0 = this.s;
            if(velocityTracker0 != null) {
                velocityTracker0.clear();
            }
        }
    }

    public final boolean r(int v, int v1, int v2, int v3) {
        boolean z1;
        boolean z;
        this.getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        this.computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int v4 = v2 + v;
        if(v1 > 0) {
            v1 = 0;
            z = true;
        }
        else if(v1 >= 0) {
            z = false;
        }
        else {
            v1 = 0;
            z = true;
        }
        if(v4 > v3) {
            z1 = true;
        }
        else if(v4 < 0) {
            z1 = true;
            v3 = 0;
        }
        else {
            v3 = v4;
            z1 = false;
        }
        if(z1 && !this.F.f(1)) {
            int v5 = this.getScrollRange();
            this.k.springBack(v1, v3, 0, 0, 0, v5);
        }
        super.scrollTo(v1, v3);
        return z || z1;
    }

    @Override  // android.view.ViewGroup
    public final void requestChildFocus(View view0, View view1) {
        if(this.o) {
            this.q = view1;
        }
        else {
            view1.getDrawingRect(this.j);
            this.offsetDescendantRectToMyCoords(view1, this.j);
            int v = this.h(this.j);
            if(v != 0) {
                this.scrollBy(0, v);
            }
        }
        super.requestChildFocus(view0, view1);
    }

    @Override  // android.view.ViewGroup
    public final boolean requestChildRectangleOnScreen(View view0, Rect rect0, boolean z) {
        rect0.offset(view0.getLeft() - view0.getScrollX(), view0.getTop() - view0.getScrollY());
        int v = this.h(rect0);
        if(v != 0) {
            if(z) {
                this.scrollBy(0, v);
                return true;
            }
            this.t(0, v, false);
        }
        return v != 0;
    }

    @Override  // android.view.ViewGroup
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if(z) {
            VelocityTracker velocityTracker0 = this.s;
            if(velocityTracker0 != null) {
                velocityTracker0.recycle();
                this.s = null;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override  // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.o = true;
        super.requestLayout();
    }

    public final boolean s(int v, int v1, int v2) {
        boolean z1;
        int v3 = this.getHeight();
        int v4 = this.getScrollY();
        int v5 = v3 + v4;
        ArrayList arrayList0 = this.getFocusables(2);
        int v6 = arrayList0.size();
        View view0 = null;
        int v8 = 0;
        for(int v7 = 0; v7 < v6; ++v7) {
            View view1 = (View)arrayList0.get(v7);
            int v9 = view1.getTop();
            int v10 = view1.getBottom();
            if(v1 < v10 && v9 < v2) {
                int v11 = v1 >= v9 || v10 >= v2 ? 0 : 1;
                if(view0 == null) {
                    view0 = view1;
                    v8 = v11;
                }
                else {
                    boolean z = v == 33 && v9 < view0.getTop() || v != 33 && v10 > view0.getBottom();
                    if(v8 == 0) {
                        if(v11 != 0) {
                            view0 = view1;
                            v8 = 1;
                        }
                        else if(z) {
                            view0 = view1;
                        }
                    }
                    else if(v11 != 0 && z) {
                        view0 = view1;
                    }
                }
            }
        }
        if(view0 == null) {
            view0 = this;
        }
        if(v1 < v4 || v2 > v5) {
            this.i((v == 33 ? v2 - v5 : v1 - v4));
            z1 = true;
        }
        else {
            z1 = false;
        }
        if(view0 != this.findFocus()) {
            view0.requestFocus(v);
        }
        return z1;
    }

    @Override  // android.view.View
    public final void scrollTo(int v, int v1) {
        if(this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
            int v2 = this.getWidth() - this.getPaddingLeft() - this.getPaddingRight();
            int v3 = view0.getWidth() + frameLayout$LayoutParams0.leftMargin + frameLayout$LayoutParams0.rightMargin;
            int v4 = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
            int v5 = view0.getHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin;
            if(v2 >= v3 || v < 0) {
                v = 0;
            }
            else if(v2 + v > v3) {
                v = v3 - v2;
            }
            if(v4 >= v5 || v1 < 0) {
                v1 = 0;
            }
            else if(v4 + v1 > v5) {
                v1 = v5 - v4;
            }
            if(v != this.getScrollX() || v1 != this.getScrollY()) {
                super.scrollTo(v, v1);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if(z != this.t) {
            this.t = z;
            this.requestLayout();
        }
    }

    @Override  // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        E.e e0 = this.F;
        if(e0.d) {
            e0.c.stopNestedScroll();
        }
        e0.d = z;
    }

    public void setOnScrollChangeListener(G.e e0) {
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.u = z;
    }

    @Override  // android.widget.FrameLayout
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override  // android.view.View
    public final boolean startNestedScroll(int v) {
        return this.F.g(v, 0);
    }

    @Override  // android.view.View
    public final void stopNestedScroll() {
        this.v(0);
    }

    public final void t(int v, int v1, boolean z) {
        OverScroller overScroller0 = this.k;
        if(this.getChildCount() == 0) {
            return;
        }
        if(AnimationUtils.currentAnimationTimeMillis() - this.i > 0xFAL) {
            View view0 = this.getChildAt(0);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
            int v2 = view0.getHeight() + frameLayout$LayoutParams0.topMargin + frameLayout$LayoutParams0.bottomMargin;
            int v3 = this.getHeight();
            int v4 = this.getPaddingTop();
            int v5 = this.getPaddingBottom();
            int v6 = this.getScrollY();
            int v7 = this.getScrollX();
            this.k.startScroll(v7, v6, 0, Math.max(0, Math.min(v1 + v6, Math.max(0, v2 - (v3 - v4 - v5)))) - v6, 0xFA);
            if(z) {
                this.u(2, 1);
            }
            else {
                this.v(1);
            }
            this.C = this.getScrollY();
            this.postInvalidateOnAnimation();
        }
        else {
            if(!overScroller0.isFinished()) {
                overScroller0.abortAnimation();
                this.v(1);
            }
            this.scrollBy(v, v1);
        }
        this.i = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void u(int v, int v1) {
        this.F.g(2, v1);
    }

    public final void v(int v) {
        this.F.h(v);
    }
}

