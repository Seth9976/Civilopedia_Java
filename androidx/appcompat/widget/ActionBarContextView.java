package androidx.appcompat.widget;

import E.q;
import E.u;
import X2.h0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import g.b;
import k.l;
import k.z;
import l.O0;
import l.a;
import l.f;
import l.j;

public class ActionBarContextView extends ViewGroup {
    public final int A;
    public final a i;
    public final Context j;
    public ActionMenuView k;
    public j l;
    public int m;
    public u n;
    public boolean o;
    public boolean p;
    public CharSequence q;
    public CharSequence r;
    public View s;
    public View t;
    public LinearLayout u;
    public TextView v;
    public TextView w;
    public final int x;
    public final int y;
    public boolean z;

    public ActionBarContextView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0x7F02001B);  // attr:actionModeStyle
        Drawable drawable0;
        this.i = new a(this);
        TypedValue typedValue0 = new TypedValue();
        this.j = !context0.getTheme().resolveAttribute(0x7F020002, typedValue0, true) || typedValue0.resourceId == 0 ? context0 : new ContextThemeWrapper(context0, typedValue0.resourceId);  // attr:actionBarPopupTheme
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, e.a.d, 0x7F02001B, 0);  // attr:actionModeStyle
        if(typedArray0.hasValue(0)) {
            int v = typedArray0.getResourceId(0, 0);
            drawable0 = v == 0 ? typedArray0.getDrawable(0) : b.c(context0, v);
        }
        else {
            drawable0 = typedArray0.getDrawable(0);
        }
        this.setBackground(drawable0);
        this.x = typedArray0.getResourceId(5, 0);
        this.y = typedArray0.getResourceId(4, 0);
        this.m = typedArray0.getLayoutDimension(3, 0);
        this.A = typedArray0.getResourceId(2, 0x7F0A0005);  // layout:abc_action_mode_close_item_material
        typedArray0.recycle();
    }

    public static void a(ActionBarContextView actionBarContextView0) {
        actionBarContextView0.super.setVisibility(0);
    }

    public final void c(h0 h00) {
        View view0 = this.s;
        if(view0 == null) {
            View view1 = LayoutInflater.from(this.getContext()).inflate(this.A, this, false);
            this.s = view1;
            this.addView(view1);
        }
        else if(view0.getParent() == null) {
            this.addView(this.s);
        }
        this.s.findViewById(0x7F070037).setOnClickListener(new f.a(h00, 1));  // id:action_mode_close_button
        l l0 = h00.g();
        j j0 = this.l;
        if(j0 != null) {
            j0.e();
            f f0 = j0.B;
            if(f0 != null && f0.b()) {
                f0.i.dismiss();
            }
        }
        j j1 = new j(this.getContext());
        this.l = j1;
        j1.t = true;
        j1.u = true;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-2, -1);
        l0.b(this.l, this.j);
        j j2 = this.l;
        z z0 = j2.p;
        if(z0 == null) {
            z z1 = (z)j2.l.inflate(j2.n, this, false);
            j2.p = z1;
            z1.c(j2.k);
            j2.g();
        }
        z z2 = j2.p;
        if(z0 != z2) {
            ((ActionMenuView)z2).setPresenter(j2);
        }
        this.k = (ActionMenuView)z2;
        ((ActionMenuView)z2).setBackground(null);
        this.addView(this.k, viewGroup$LayoutParams0);
    }

    public final void d() {
        if(this.u == null) {
            LayoutInflater.from(this.getContext()).inflate(0x7F0A0000, this);  // layout:abc_action_bar_title_item
            LinearLayout linearLayout0 = (LinearLayout)this.getChildAt(this.getChildCount() - 1);
            this.u = linearLayout0;
            this.v = (TextView)linearLayout0.findViewById(0x7F07002E);  // id:action_bar_title
            this.w = (TextView)this.u.findViewById(0x7F07002D);  // id:action_bar_subtitle
            int v = this.x;
            if(v != 0) {
                this.v.setTextAppearance(this.getContext(), v);
            }
            int v1 = this.y;
            if(v1 != 0) {
                this.w.setTextAppearance(this.getContext(), v1);
            }
        }
        this.v.setText(this.q);
        this.w.setText(this.r);
        boolean z = TextUtils.isEmpty(this.q);
        boolean z1 = TextUtils.isEmpty(this.r);
        int v2 = 8;
        this.w.setVisibility((z1 ? 8 : 0));
        LinearLayout linearLayout1 = this.u;
        if(!z || !z1) {
            v2 = 0;
        }
        linearLayout1.setVisibility(v2);
        if(this.u.getParent() == null) {
            this.addView(this.u);
        }
    }

    public static int e(View view0, int v, int v1) {
        view0.measure(View.MeasureSpec.makeMeasureSpec(v, 0x80000000), v1);
        return Math.max(0, v - view0.getMeasuredWidth());
    }

    public static int f(View view0, int v, int v1, int v2, boolean z) {
        int v3 = view0.getMeasuredWidth();
        int v4 = view0.getMeasuredHeight();
        int v5 = (v2 - v4) / 2 + v1;
        if(z) {
            view0.layout(v - v3, v5, v, v4 + v5);
            return -v3;
        }
        view0.layout(v, v5, v + v3, v4 + v5);
        return v3;
    }

    public final void g(int v) {
        if(v != this.getVisibility()) {
            u u0 = this.n;
            if(u0 != null) {
                u0.b();
            }
            super.setVisibility(v);
        }
    }

    @Override  // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override  // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new ViewGroup.MarginLayoutParams(this.getContext(), attributeSet0);
    }

    public int getAnimatedVisibility() {
        return this.n == null ? this.getVisibility() : this.i.a;
    }

    public int getContentHeight() {
        return this.m;
    }

    public CharSequence getSubtitle() {
        return this.r;
    }

    public CharSequence getTitle() {
        return this.q;
    }

    public final u h(int v, long v1) {
        u u0 = this.n;
        if(u0 != null) {
            u0.b();
        }
        a a0 = this.i;
        if(v == 0) {
            if(this.getVisibility() != 0) {
                this.setAlpha(0.0f);
            }
            u u1 = q.a(this);
            u1.a(1.0f);
            u1.c(v1);
            ((ActionBarContextView)a0.c).n = u1;
            a0.a = 0;
            u1.d(a0);
            return u1;
        }
        u u2 = q.a(this);
        u2.a(0.0f);
        u2.c(v1);
        ((ActionBarContextView)a0.c).n = u2;
        a0.a = v;
        u2.d(a0);
        return u2;
    }

    @Override  // android.view.View
    public final void onConfigurationChanged(Configuration configuration0) {
        int v2;
        super.onConfigurationChanged(configuration0);
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(null, e.a.a, 0x7F020005, 0);  // attr:actionBarStyle
        this.setContentHeight(typedArray0.getLayoutDimension(13, 0));
        typedArray0.recycle();
        j j0 = this.l;
        if(j0 != null) {
            Configuration configuration1 = j0.j.getResources().getConfiguration();
            int v = configuration1.screenWidthDp;
            int v1 = configuration1.screenHeightDp;
            if(configuration1.smallestScreenWidthDp > 600 || v > 600 || v > 960 && v1 > 720 || v > 720 && v1 > 960) {
                v2 = 5;
            }
            else if(v >= 500 || v > 640 && v1 > 480 || v > 480 && v1 > 640) {
                v2 = 4;
            }
            else if(v >= 360) {
                v2 = 3;
            }
            else {
                v2 = 2;
            }
            j0.x = v2;
            l l0 = j0.k;
            if(l0 != null) {
                l0.p(true);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j j0 = this.l;
        if(j0 != null) {
            j0.e();
            f f0 = this.l.B;
            if(f0 != null && f0.b()) {
                f0.i.dismiss();
            }
        }
    }

    @Override  // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(v == 9) {
            this.p = false;
        }
        if(!this.p && (v == 9 && !super.onHoverEvent(motionEvent0))) {
            this.p = true;
        }
        if(v == 3 || v == 10) {
            this.p = false;
        }
        return true;
    }

    @Override  // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        if(accessibilityEvent0.getEventType() == 0x20) {
            accessibilityEvent0.setSource(this);
            accessibilityEvent0.setClassName(this.getClass().getName());
            accessibilityEvent0.setPackageName("com.spears.civilopedia");
            accessibilityEvent0.setContentDescription(this.q);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
    }

    @Override  // android.view.ViewGroup
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        boolean z1 = O0.a(this);
        int v4 = z1 ? v2 - v - this.getPaddingRight() : this.getPaddingLeft();
        int v5 = this.getPaddingTop();
        int v6 = v3 - v1 - this.getPaddingTop() - this.getPaddingBottom();
        if(this.s != null && this.s.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.s.getLayoutParams();
            int v7 = z1 ? viewGroup$MarginLayoutParams0.rightMargin : viewGroup$MarginLayoutParams0.leftMargin;
            int v8 = z1 ? viewGroup$MarginLayoutParams0.leftMargin : viewGroup$MarginLayoutParams0.rightMargin;
            int v9 = z1 ? v4 - v7 : v4 + v7;
            int v10 = ActionBarContextView.f(this.s, v9, v5, v6, z1) + v9;
            v4 = z1 ? v10 - v8 : v10 + v8;
        }
        if(this.u != null && this.t == null && this.u.getVisibility() != 8) {
            v4 += ActionBarContextView.f(this.u, v4, v5, v6, z1);
        }
        View view0 = this.t;
        if(view0 != null) {
            ActionBarContextView.f(view0, v4, v5, v6, z1);
        }
        int v11 = z1 ? this.getPaddingLeft() : v2 - v - this.getPaddingRight();
        ActionMenuView actionMenuView0 = this.k;
        if(actionMenuView0 != null) {
            ActionBarContextView.f(actionMenuView0, v11, v5, v6, !z1);
        }
    }

    @Override  // android.view.View
    public final void onMeasure(int v, int v1) {
        int v2 = 0x40000000;
        if(View.MeasureSpec.getMode(v) != 0x40000000) {
            throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if(View.MeasureSpec.getMode(v1) == 0) {
            throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int v3 = View.MeasureSpec.getSize(v);
        int v4 = this.m > 0 ? this.m : View.MeasureSpec.getSize(v1);
        int v5 = this.getPaddingTop();
        int v6 = this.getPaddingBottom() + v5;
        int v7 = v3 - this.getPaddingLeft() - this.getPaddingRight();
        int v8 = v4 - v6;
        int v9 = View.MeasureSpec.makeMeasureSpec(v8, 0x80000000);
        View view0 = this.s;
        if(view0 != null) {
            int v10 = ActionBarContextView.e(view0, v7, v9);
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.s.getLayoutParams();
            v7 = v10 - (viewGroup$MarginLayoutParams0.leftMargin + viewGroup$MarginLayoutParams0.rightMargin);
        }
        if(this.k != null && this.k.getParent() == this) {
            v7 = ActionBarContextView.e(this.k, v7, v9);
        }
        LinearLayout linearLayout0 = this.u;
        if(linearLayout0 != null && this.t == null) {
            if(this.z) {
                this.u.measure(0, v9);
                int v12 = this.u.getMeasuredWidth();
                boolean z = v12 <= v7;
                if(z) {
                    v7 -= v12;
                }
                this.u.setVisibility((z ? 0 : 8));
            }
            else {
                v7 = ActionBarContextView.e(linearLayout0, v7, v9);
            }
        }
        View view1 = this.t;
        if(view1 != null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
            int v13 = viewGroup$LayoutParams0.width;
            if(v13 >= 0) {
                v7 = Math.min(v13, v7);
            }
            int v14 = viewGroup$LayoutParams0.height;
            if(v14 == -2) {
                v2 = 0x80000000;
            }
            if(v14 >= 0) {
                v8 = Math.min(v14, v8);
            }
            this.t.measure(View.MeasureSpec.makeMeasureSpec(v7, (v13 == -2 ? 0x80000000 : 0x40000000)), View.MeasureSpec.makeMeasureSpec(v8, v2));
        }
        if(this.m <= 0) {
            int v15 = this.getChildCount();
            int v16 = 0;
            for(int v11 = 0; v11 < v15; ++v11) {
                int v17 = this.getChildAt(v11).getMeasuredHeight() + v6;
                if(v17 > v16) {
                    v16 = v17;
                }
            }
            this.setMeasuredDimension(v3, v16);
            return;
        }
        this.setMeasuredDimension(v3, v4);
    }

    @Override  // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(v == 0) {
            this.o = false;
        }
        if(!this.o && (v == 0 && !super.onTouchEvent(motionEvent0))) {
            this.o = true;
        }
        if(v == 1 || v == 3) {
            this.o = false;
        }
        return true;
    }

    public void setContentHeight(int v) {
        this.m = v;
    }

    public void setCustomView(View view0) {
        View view1 = this.t;
        if(view1 != null) {
            this.removeView(view1);
        }
        this.t = view0;
        if(view0 != null) {
            LinearLayout linearLayout0 = this.u;
            if(linearLayout0 != null) {
                this.removeView(linearLayout0);
                this.u = null;
            }
        }
        if(view0 != null) {
            this.addView(view0);
        }
        this.requestLayout();
    }

    public void setSubtitle(CharSequence charSequence0) {
        this.r = charSequence0;
        this.d();
    }

    public void setTitle(CharSequence charSequence0) {
        this.q = charSequence0;
        this.d();
    }

    public void setTitleOptional(boolean z) {
        if(z != this.z) {
            this.requestLayout();
        }
        this.z = z;
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        this.g(v);
    }

    @Override  // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

