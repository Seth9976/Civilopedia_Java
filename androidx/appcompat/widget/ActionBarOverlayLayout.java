package androidx.appcompat.widget;

import E.f;
import E.g;
import E.h;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.widget.OverScroller;
import f.A;
import g.b;
import j.i;
import java.lang.reflect.Method;
import k.l;
import k.w;
import l.E0;
import l.I0;
import l.O0;
import l.U;
import l.V;
import l.c;
import l.d;
import l.e;
import l.j;

public class ActionBarOverlayLayout extends ViewGroup implements f, g, U {
    public final Rect A;
    public final Rect B;
    public d C;
    public OverScroller D;
    public ViewPropertyAnimator E;
    public final E0.d F;
    public final c G;
    public final c H;
    public final h I;
    public static final int[] J;
    public int i;
    public int j;
    public ContentFrameLayout k;
    public ActionBarContainer l;
    public V m;
    public Drawable n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public final Rect v;
    public final Rect w;
    public final Rect x;
    public final Rect y;
    public final Rect z;

    static {
        ActionBarOverlayLayout.J = new int[]{0x7F020003, 0x1010059};  // attr:actionBarSize
    }

    public ActionBarOverlayLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.j = 0;
        this.v = new Rect();
        this.w = new Rect();
        this.x = new Rect();
        this.y = new Rect();
        this.z = new Rect();
        this.A = new Rect();
        this.B = new Rect();
        this.F = new E0.d(this, 2);
        this.G = new c(this, 0);
        this.H = new c(this, 1);
        this.i(context0);
        this.I = new h();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // E.f
    public final void a(View view0, View view1, int v, int v1) {
        if(v1 == 0) {
            this.onNestedScrollAccepted(view0, view1, v);
        }
    }

    @Override  // E.f
    public final void b(ViewGroup viewGroup0, int v, int v1, int v2, int v3, int v4) {
        if(v4 == 0) {
            this.onNestedScroll(viewGroup0, v, v1, v2, v3);
        }
    }

    @Override  // E.f
    public final void c(View view0, int v) {
        if(v == 0) {
            this.onStopNestedScroll(view0);
        }
    }

    @Override  // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof e;
    }

    @Override  // E.f
    public final void d(int v, int v1, int[] arr_v, int v2) {
    }

    @Override  // android.view.View
    public final void draw(Canvas canvas0) {
        int v;
        super.draw(canvas0);
        if(this.n != null && !this.o) {
            if(this.l.getVisibility() == 0) {
                float f = (float)this.l.getBottom();
                v = (int)(this.l.getTranslationY() + f + 0.5f);
            }
            else {
                v = 0;
            }
            this.n.setBounds(0, v, this.getWidth(), this.n.getIntrinsicHeight() + v);
            this.n.draw(canvas0);
        }
    }

    @Override  // E.g
    public final void e(ViewGroup viewGroup0, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
        this.b(viewGroup0, v, v1, v2, v3, v4);
    }

    @Override  // E.f
    public final boolean f(View view0, View view1, int v, int v1) {
        return v1 == 0 && this.onStartNestedScroll(view0, view1, v);
    }

    @Override  // android.view.View
    public final boolean fitSystemWindows(Rect rect0) {
        this.k();
        this.getWindowSystemUiVisibility();
        boolean z = ActionBarOverlayLayout.g(this.l, rect0, false);
        Rect rect1 = this.y;
        rect1.set(rect0);
        Method method0 = O0.a;
        Rect rect2 = this.v;
        if(method0 != null) {
            try {
                method0.invoke(this, rect1, rect2);
            }
            catch(Exception exception0) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", exception0);
            }
        }
        Rect rect3 = this.z;
        if(!rect3.equals(rect1)) {
            rect3.set(rect1);
            z = true;
        }
        Rect rect4 = this.w;
        if(!rect4.equals(rect2)) {
            rect4.set(rect2);
            z = true;
        }
        if(z) {
            this.requestLayout();
        }
        return true;
    }

    public static boolean g(View view0, Rect rect0, boolean z) {
        boolean z1;
        e e0 = (e)view0.getLayoutParams();
        int v = rect0.left;
        if(e0.leftMargin == v) {
            z1 = false;
        }
        else {
            e0.leftMargin = v;
            z1 = true;
        }
        int v1 = rect0.top;
        if(e0.topMargin != v1) {
            e0.topMargin = v1;
            z1 = true;
        }
        int v2 = rect0.right;
        if(e0.rightMargin != v2) {
            e0.rightMargin = v2;
            z1 = true;
        }
        if(z) {
            int v3 = rect0.bottom;
            if(e0.bottomMargin != v3) {
                e0.bottomMargin = v3;
                return true;
            }
        }
        return z1;
    }

    @Override  // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);  // 初始化器: Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V
    }

    @Override  // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new e(this.getContext(), attributeSet0);  // 初始化器: Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    }

    @Override  // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return new e(viewGroup$LayoutParams0);  // 初始化器: Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
    }

    public int getActionBarHideOffset() {
        return this.l == null ? 0 : -((int)this.l.getTranslationY());
    }

    @Override  // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.I.b | this.I.a;
    }

    public CharSequence getTitle() {
        this.k();
        return ((I0)this.m).a.getTitle();
    }

    public final void h() {
        this.removeCallbacks(this.G);
        this.removeCallbacks(this.H);
        ViewPropertyAnimator viewPropertyAnimator0 = this.E;
        if(viewPropertyAnimator0 != null) {
            viewPropertyAnimator0.cancel();
        }
    }

    public final void i(Context context0) {
        TypedArray typedArray0 = this.getContext().getTheme().obtainStyledAttributes(ActionBarOverlayLayout.J);
        this.i = typedArray0.getDimensionPixelSize(0, 0);
        Drawable drawable0 = typedArray0.getDrawable(1);
        this.n = drawable0;
        this.setWillNotDraw(drawable0 == null);
        typedArray0.recycle();
        this.o = false;
        this.D = new OverScroller(context0);
    }

    public final void j(int v) {
        this.k();
        switch(v) {
            case 2: {
                ((I0)this.m).getClass();
                Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
                return;
            }
            case 5: {
                ((I0)this.m).getClass();
                Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
                return;
            }
            case 109: {
                this.setOverlayMode(true);
            }
        }
    }

    public final void k() {
        V v0;
        if(this.k == null) {
            this.k = (ContentFrameLayout)this.findViewById(0x7F070029);  // id:action_bar_activity_content
            this.l = (ActionBarContainer)this.findViewById(0x7F07002A);  // id:action_bar_container
            View view0 = this.findViewById(0x7F070028);  // id:action_bar
            if(view0 instanceof V) {
                v0 = (V)view0;
            }
            else if(view0 instanceof Toolbar) {
                v0 = ((Toolbar)view0).getWrapper();
            }
            else {
                throw new IllegalStateException("Can\'t make a decor toolbar out of " + view0.getClass().getSimpleName());
            }
            this.m = v0;
        }
    }

    public final void l(l l0, w w0) {
        this.k();
        I0 i00 = (I0)this.m;
        Toolbar toolbar0 = i00.a;
        if(i00.m == null) {
            i00.m = new j(toolbar0.getContext());
        }
        j j0 = i00.m;
        j0.m = w0;
        if(l0 != null || toolbar0.i != null) {
            toolbar0.f();
            l l1 = toolbar0.i.x;
            if(l1 != l0) {
                if(l1 != null) {
                    l1.r(toolbar0.Q);
                    l1.r(toolbar0.R);
                }
                if(toolbar0.R == null) {
                    toolbar0.R = new E0(toolbar0);
                }
                j0.y = true;
                if(l0 == null) {
                    j0.j(toolbar0.r, null);
                    toolbar0.R.j(toolbar0.r, null);
                    j0.g();
                    toolbar0.R.g();
                }
                else {
                    l0.b(j0, toolbar0.r);
                    l0.b(toolbar0.R, toolbar0.r);
                }
                toolbar0.i.setPopupTheme(toolbar0.s);
                toolbar0.i.setPresenter(j0);
                toolbar0.Q = j0;
            }
        }
    }

    @Override  // android.view.View
    public final void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.i(this.getContext());
        this.requestApplyInsets();
    }

    @Override  // android.view.ViewGroup
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h();
    }

    @Override  // android.view.ViewGroup
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4 = this.getChildCount();
        int v5 = this.getPaddingLeft();
        this.getPaddingRight();
        int v6 = this.getPaddingTop();
        this.getPaddingBottom();
        for(int v7 = 0; v7 < v4; ++v7) {
            View view0 = this.getChildAt(v7);
            if(view0.getVisibility() != 8) {
                e e0 = (e)view0.getLayoutParams();
                int v8 = view0.getMeasuredWidth();
                int v9 = view0.getMeasuredHeight();
                int v10 = e0.leftMargin + v5;
                int v11 = e0.topMargin + v6;
                view0.layout(v10, v11, v8 + v10, v9 + v11);
            }
        }
    }

    @Override  // android.view.View
    public final void onMeasure(int v, int v1) {
        this.k();
        this.measureChildWithMargins(this.l, v, 0, v1, 0);
        e e0 = (e)this.l.getLayoutParams();
        int v2 = 0;
        int v3 = Math.max(0, this.l.getMeasuredWidth() + e0.leftMargin + e0.rightMargin);
        int v4 = Math.max(0, this.l.getMeasuredHeight() + e0.topMargin + e0.bottomMargin);
        int v5 = View.combineMeasuredStates(0, this.l.getMeasuredState());
        boolean z = (this.getWindowSystemUiVisibility() & 0x100) != 0;
        if(z) {
            v2 = this.i;
        }
        else if(this.l.getVisibility() != 8) {
            v2 = this.l.getMeasuredHeight();
        }
        Rect rect0 = this.x;
        rect0.set(this.v);
        Rect rect1 = this.A;
        rect1.set(this.y);
        if(this.p || z) {
            rect1.top += v2;
            rect1.bottom = rect1.bottom;
        }
        else {
            rect0.top += v2;
            rect0.bottom = rect0.bottom;
        }
        ActionBarOverlayLayout.g(this.k, rect0, true);
        Rect rect2 = this.B;
        if(!rect2.equals(rect1)) {
            rect2.set(rect1);
            this.k.a(rect1);
        }
        this.measureChildWithMargins(this.k, v, 0, v1, 0);
        e e1 = (e)this.k.getLayoutParams();
        int v6 = Math.max(v3, this.k.getMeasuredWidth() + e1.leftMargin + e1.rightMargin);
        int v7 = Math.max(v4, this.k.getMeasuredHeight() + e1.topMargin + e1.bottomMargin);
        int v8 = View.combineMeasuredStates(v5, this.k.getMeasuredState());
        int v9 = this.getPaddingLeft();
        int v10 = this.getPaddingRight();
        int v11 = this.getPaddingTop();
        int v12 = Math.max(this.getPaddingBottom() + v11 + v7, this.getSuggestedMinimumHeight());
        this.setMeasuredDimension(View.resolveSizeAndState(Math.max(v10 + v9 + v6, this.getSuggestedMinimumWidth()), v, v8), View.resolveSizeAndState(v12, v1, v8 << 16));
    }

    @Override  // android.view.ViewGroup
    public final boolean onNestedFling(View view0, float f, float f1, boolean z) {
        if(this.r && z) {
            this.D.fling(0, 0, 0, ((int)f1), 0, 0, 0x80000000, 0x7FFFFFFF);
            if(this.D.getFinalY() > this.l.getHeight()) {
                this.h();
                this.H.run();
            }
            else {
                this.h();
                this.G.run();
            }
            this.s = true;
            return true;
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    public final boolean onNestedPreFling(View view0, float f, float f1) {
        return false;
    }

    @Override  // android.view.ViewGroup
    public final void onNestedPreScroll(View view0, int v, int v1, int[] arr_v) {
    }

    @Override  // android.view.ViewGroup
    public final void onNestedScroll(View view0, int v, int v1, int v2, int v3) {
        int v4 = this.t + v1;
        this.t = v4;
        this.setActionBarHideOffset(v4);
    }

    @Override  // android.view.ViewGroup
    public final void onNestedScrollAccepted(View view0, View view1, int v) {
        this.I.a = v;
        this.t = this.getActionBarHideOffset();
        this.h();
        d d0 = this.C;
        if(d0 != null) {
            i i0 = ((A)d0).v;
            if(i0 != null) {
                i0.a();
                ((A)d0).v = null;
            }
        }
    }

    @Override  // android.view.ViewGroup
    public final boolean onStartNestedScroll(View view0, View view1, int v) {
        return (v & 2) == 0 || this.l.getVisibility() != 0 ? false : this.r;
    }

    @Override  // android.view.ViewGroup
    public final void onStopNestedScroll(View view0) {
        if(this.r && !this.s) {
            if(this.t <= this.l.getHeight()) {
                this.h();
                this.postDelayed(this.G, 600L);
                return;
            }
            this.h();
            this.postDelayed(this.H, 600L);
        }
    }

    @Override  // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int v) {
        super.onWindowSystemUiVisibilityChanged(v);
        this.k();
        int v1 = this.u ^ v;
        this.u = v;
        int v2 = (v & 0x100) == 0 ? 0 : 1;
        d d0 = this.C;
        if(d0 != null) {
            ((A)d0).r = v2 ^ 1;
            if((v & 4) == 0 || v2 == 0) {
                if(((A)d0).s) {
                    ((A)d0).s = false;
                    ((A)d0).c0(true);
                }
            }
            else if(!((A)d0).s) {
                ((A)d0).s = true;
                ((A)d0).c0(true);
            }
        }
        if((v1 & 0x100) != 0 && this.C != null) {
            this.requestApplyInsets();
        }
    }

    @Override  // android.view.View
    public final void onWindowVisibilityChanged(int v) {
        super.onWindowVisibilityChanged(v);
        this.j = v;
        d d0 = this.C;
        if(d0 != null) {
            ((A)d0).q = v;
        }
    }

    public void setActionBarHideOffset(int v) {
        this.h();
        int v1 = Math.max(0, Math.min(v, this.l.getHeight()));
        this.l.setTranslationY(((float)(-v1)));
    }

    public void setActionBarVisibilityCallback(d d0) {
        this.C = d0;
        if(this.getWindowToken() != null) {
            ((A)this.C).q = this.j;
            int v = this.u;
            if(v != 0) {
                this.onWindowSystemUiVisibilityChanged(v);
                this.requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.q = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if(z != this.r) {
            this.r = z;
            if(!z) {
                this.h();
                this.setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int v) {
        this.k();
        I0 i00 = (I0)this.m;
        i00.d = v == 0 ? null : b.c(i00.a.getContext(), v);
        i00.c();
    }

    public void setIcon(Drawable drawable0) {
        this.k();
        ((I0)this.m).d = drawable0;
        ((I0)this.m).c();
    }

    public void setLogo(int v) {
        this.k();
        I0 i00 = (I0)this.m;
        i00.e = v == 0 ? null : b.c(i00.a.getContext(), v);
        i00.c();
    }

    public void setOverlayMode(boolean z) {
        this.p = z;
        this.o = false;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int v) {
    }

    @Override  // l.U
    public void setWindowCallback(Window.Callback window$Callback0) {
        this.k();
        ((I0)this.m).k = window$Callback0;
    }

    @Override  // l.U
    public void setWindowTitle(CharSequence charSequence0) {
        this.k();
        I0 i00 = (I0)this.m;
        if(!i00.g) {
            i00.h = charSequence0;
            if((i00.b & 8) != 0) {
                i00.a.setTitle(charSequence0);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

