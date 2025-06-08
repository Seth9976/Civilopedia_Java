package androidx.appcompat.widget;

import D3.b;
import J3.d;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import k.k;
import k.l;
import k.n;
import k.z;
import l.O0;
import l.c0;
import l.f;
import l.i;
import l.j;
import l.m;

public class ActionMenuView extends LinearLayoutCompat implements k, z {
    public boolean A;
    public j B;
    public boolean C;
    public int D;
    public final int E;
    public final int F;
    public m G;
    public l x;
    public Context y;
    public int z;

    public ActionMenuView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.setBaselineAligned(false);
        DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
        this.E = (int)(56.0f * displayMetrics0.density);
        this.F = (int)(displayMetrics0.density * 4.0f);
        this.y = context0;
        this.z = 0;
    }

    @Override  // k.k
    public final boolean a(n n0) {
        return this.x.q(n0, null, 0);
    }

    @Override  // k.z
    public final void c(l l0) {
        this.x = l0;
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public final boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof l.l;
    }

    @Override  // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        return false;
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public final c0 g() {
        return ActionMenuView.k();
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return ActionMenuView.k();
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new l.l(this.getContext(), attributeSet0);  // 初始化器: Ll/c0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return ActionMenuView.l(viewGroup$LayoutParams0);
    }

    public Menu getMenu() {
        if(this.x == null) {
            Context context0 = this.getContext();
            l l0 = new l(context0);
            this.x = l0;
            l0.e = new b(this, 26);
            j j0 = new j(context0);
            this.B = j0;
            j0.t = true;
            j0.u = true;
            j0.m = new d(15);
            this.x.b(j0, this.y);
            this.B.p = this;
            this.x = this.B.k;
        }
        return this.x;
    }

    public Drawable getOverflowIcon() {
        this.getMenu();
        j j0 = this.B;
        i i0 = j0.q;
        if(i0 != null) {
            return i0.getDrawable();
        }
        return j0.s ? j0.r : null;
    }

    public int getPopupTheme() {
        return this.z;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public final c0 h(AttributeSet attributeSet0) {
        return new l.l(this.getContext(), attributeSet0);  // 初始化器: Ll/c0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public final c0 i(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return ActionMenuView.l(viewGroup$LayoutParams0);
    }

    public static l.l k() {
        l.l l0 = new l.l(-2);  // 初始化器: Ll/c0;-><init>(I)V
        l0.c = false;
        l0.b = 16;
        return l0;
    }

    public static l.l l(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        l.l l0;
        if(viewGroup$LayoutParams0 != null) {
            if(viewGroup$LayoutParams0 instanceof l.l) {
                l0 = new l.l(((l.l)viewGroup$LayoutParams0));  // 初始化器: Ll/c0;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
                l0.c = ((l.l)viewGroup$LayoutParams0).c;
            }
            else {
                l0 = new l.l(viewGroup$LayoutParams0);  // 初始化器: Ll/c0;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
            }
            if(l0.b <= 0) {
                l0.b = 16;
            }
            return l0;
        }
        return ActionMenuView.k();
    }

    public final boolean m(int v) {
        boolean z = false;
        if(v == 0) {
            return false;
        }
        View view0 = this.getChildAt(v - 1);
        View view1 = this.getChildAt(v);
        if(v < this.getChildCount() && view0 instanceof l.k) {
            z = ((l.k)view0).b();
        }
        return v > 0 && view1 instanceof l.k ? z | ((l.k)view1).c() : z;
    }

    @Override  // android.view.View
    public final void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        j j0 = this.B;
        if(j0 != null) {
            j0.g();
            if(this.B.h()) {
                this.B.e();
                this.B.l();
            }
        }
    }

    @Override  // android.view.ViewGroup
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j j0 = this.B;
        if(j0 != null) {
            j0.e();
            f f0 = j0.B;
            if(f0 != null && f0.b()) {
                f0.i.dismiss();
            }
        }
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v15;
        int v14;
        if(!this.C) {
            super.onLayout(z, v, v1, v2, v3);
            return;
        }
        int v4 = this.getChildCount();
        int v5 = (v3 - v1) / 2;
        int v6 = this.getDividerWidth();
        int v7 = v2 - v;
        int v8 = v7 - this.getPaddingRight() - this.getPaddingLeft();
        boolean z1 = O0.a(this);
        int v10 = 0;
        int v11 = 0;
        for(int v9 = 0; v9 < v4; ++v9) {
            View view0 = this.getChildAt(v9);
            if(view0.getVisibility() != 8) {
                l.l l0 = (l.l)view0.getLayoutParams();
                if(l0.c) {
                    int v12 = view0.getMeasuredWidth();
                    if(this.m(v9)) {
                        v12 += v6;
                    }
                    int v13 = view0.getMeasuredHeight();
                    if(z1) {
                        v14 = this.getPaddingLeft() + l0.leftMargin;
                        v15 = v14 + v12;
                    }
                    else {
                        v15 = this.getWidth() - this.getPaddingRight() - l0.rightMargin;
                        v14 = v15 - v12;
                    }
                    int v16 = v5 - v13 / 2;
                    view0.layout(v14, v16, v15, v13 + v16);
                    v8 -= v12;
                    v10 = 1;
                }
                else {
                    v8 -= view0.getMeasuredWidth() + l0.leftMargin + l0.rightMargin;
                    this.m(v9);
                    ++v11;
                }
            }
        }
        if(v4 == 1 && v10 == 0) {
            View view1 = this.getChildAt(0);
            int v17 = view1.getMeasuredWidth();
            int v18 = view1.getMeasuredHeight();
            int v19 = v7 / 2 - v17 / 2;
            int v20 = v5 - v18 / 2;
            view1.layout(v19, v20, v17 + v19, v18 + v20);
            return;
        }
        int v21 = v11 - (v10 ^ 1);
        int v22 = Math.max(0, (v21 <= 0 ? 0 : v8 / v21));
        if(z1) {
            int v23 = this.getWidth() - this.getPaddingRight();
            for(int v24 = 0; v24 < v4; ++v24) {
                View view2 = this.getChildAt(v24);
                l.l l1 = (l.l)view2.getLayoutParams();
                if(view2.getVisibility() != 8 && !l1.c) {
                    int v25 = v23 - l1.rightMargin;
                    int v26 = view2.getMeasuredWidth();
                    int v27 = view2.getMeasuredHeight();
                    int v28 = v5 - v27 / 2;
                    view2.layout(v25 - v26, v28, v25, v27 + v28);
                    v23 = v25 - (v26 + l1.leftMargin + v22);
                }
            }
            return;
        }
        int v29 = this.getPaddingLeft();
        for(int v30 = 0; v30 < v4; ++v30) {
            View view3 = this.getChildAt(v30);
            l.l l2 = (l.l)view3.getLayoutParams();
            if(view3.getVisibility() != 8 && !l2.c) {
                int v31 = v29 + l2.leftMargin;
                int v32 = view3.getMeasuredWidth();
                int v33 = view3.getMeasuredHeight();
                int v34 = v5 - v33 / 2;
                view3.layout(v31, v34, v31 + v32, v33 + v34);
                v29 = v32 + l2.rightMargin + v22 + v31;
            }
        }
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public final void onMeasure(int v, int v1) {
        int v48;
        int v47;
        int v46;
        int v41;
        int v40;
        int v36;
        int v29;
        int v25;
        int v24;
        int v23;
        boolean z = this.C;
        boolean z1 = View.MeasureSpec.getMode(v) == 0x40000000;
        this.C = z1;
        if(z != z1) {
            this.D = 0;
        }
        int v2 = View.MeasureSpec.getSize(v);
        if(this.C) {
            l l0 = this.x;
            if(l0 != null && v2 != this.D) {
                this.D = v2;
                l0.p(true);
            }
        }
        int v3 = this.getChildCount();
        if(this.C && v3 > 0) {
            int v4 = View.MeasureSpec.getMode(v1);
            int v5 = View.MeasureSpec.getSize(v);
            int v6 = View.MeasureSpec.getSize(v1);
            int v7 = this.getPaddingLeft();
            int v8 = this.getPaddingRight();
            int v9 = this.getPaddingTop();
            int v10 = this.getPaddingBottom() + v9;
            int v11 = ViewGroup.getChildMeasureSpec(v1, v10, -2);
            int v12 = v5 - (v8 + v7);
            int v13 = this.E;
            int v14 = v12 / v13;
            if(v14 == 0) {
                this.setMeasuredDimension(v12, 0);
                return;
            }
            int v15 = v12 % v13 / v14 + v13;
            int v16 = this.getChildCount();
            int v17 = 0;
            int v18 = 0;
            int v19 = 0;
            int v20 = 0;
            boolean z2 = false;
            long v21 = 0L;
            int v22 = 0;
            while(true) {
                v23 = this.F;
                if(v20 >= v16) {
                    break;
                }
                View view0 = this.getChildAt(v20);
                if(view0.getVisibility() == 8) {
                    v24 = v4;
                    v25 = v10;
                }
                else {
                    if(view0 instanceof ActionMenuItemView) {
                        view0.setPadding(v23, 0, v23, 0);
                    }
                    l.l l1 = (l.l)view0.getLayoutParams();
                    l1.h = false;
                    l1.e = 0;
                    l1.d = 0;
                    l1.f = false;
                    l1.leftMargin = 0;
                    l1.rightMargin = 0;
                    l1.g = view0 instanceof ActionMenuItemView && !TextUtils.isEmpty(((ActionMenuItemView)view0).getText());
                    int v26 = l1.c ? 1 : v14;
                    ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                    v24 = v4;
                    v25 = v10;
                    int v27 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(v11) - v10, View.MeasureSpec.getMode(v11));
                    ActionMenuItemView actionMenuItemView0 = view0 instanceof ActionMenuItemView ? ((ActionMenuItemView)view0) : null;
                    boolean z3 = actionMenuItemView0 != null && !TextUtils.isEmpty(actionMenuItemView0.getText());
                    if(v26 <= 0 || z3 && v26 < 2) {
                        v29 = 0;
                    }
                    else {
                        view0.measure(View.MeasureSpec.makeMeasureSpec(v26 * v15, 0x80000000), v27);
                        int v28 = view0.getMeasuredWidth();
                        v29 = v28 / v15;
                        if(v28 % v15 != 0) {
                            ++v29;
                        }
                        if(z3 && v29 < 2) {
                            v29 = 2;
                        }
                    }
                    ((l.l)viewGroup$LayoutParams0).f = !((l.l)viewGroup$LayoutParams0).c && z3;
                    ((l.l)viewGroup$LayoutParams0).d = v29;
                    view0.measure(View.MeasureSpec.makeMeasureSpec(v29 * v15, 0x40000000), v27);
                    v19 = Math.max(v19, v29);
                    if(l1.f) {
                        ++v22;
                    }
                    if(l1.c) {
                        z2 = true;
                    }
                    v14 -= v29;
                    v17 = Math.max(v17, view0.getMeasuredHeight());
                    if(v29 == 1) {
                        v21 |= (long)(1 << v20);
                    }
                    ++v18;
                }
                ++v20;
                v10 = v25;
                v4 = v24;
            }
            int v30 = 0;
            while(true) {
                if(v22 <= 0 || v14 <= 0) {
                    goto label_128;
                }
                int v31 = 0x7FFFFFFF;
                int v32 = 0;
                long v34 = 0L;
                for(int v33 = 0; v33 < v16; ++v33) {
                    l.l l2 = (l.l)this.getChildAt(v33).getLayoutParams();
                    if(l2.f) {
                        int v35 = l2.d;
                        if(v35 < v31) {
                            v34 = 1L << v33;
                            v31 = v35;
                            v32 = 1;
                        }
                        else if(v35 == v31) {
                            v34 |= 1L << v33;
                            ++v32;
                        }
                    }
                }
                v36 = v30;
                v21 |= v34;
                if(v32 <= v14) {
                    int v37 = v31 + 1;
                    for(int v38 = 0; v38 < v16; ++v38) {
                        View view1 = this.getChildAt(v38);
                        l.l l3 = (l.l)view1.getLayoutParams();
                        if((v34 & ((long)(1 << v38))) != 0L) {
                            if(z2 && v18 == 2 && l3.g && v14 == 1) {
                                view1.setPadding(v23 + v15, 0, v23, 0);
                            }
                            ++l3.d;
                            l3.h = true;
                            --v14;
                        }
                        else if(l3.d == v37) {
                            v21 |= (long)(1 << v38);
                        }
                    }
                    v30 = 1;
                    continue;
                label_128:
                    v36 = v30;
                }
                break;
            }
            int v39 = v11;
            boolean z4 = !z2 && v18 == 1;
            if(v14 > 0 && v21 != 0L && (v14 < v18 - 1 || z4 || v19 > 1)) {
                float f = (float)Long.bitCount(v21);
                if(!z4) {
                    if((v21 & 1L) != 0L && !((l.l)this.getChildAt(0).getLayoutParams()).g) {
                        f -= 0.5f;
                    }
                    if((v21 & ((long)(1 << v16 - 1))) != 0L && !((l.l)this.getChildAt(v16 - 1).getLayoutParams()).g) {
                        f -= 0.5f;
                    }
                }
                int v42 = f > 0.0f ? ((int)(((float)(v14 * v15)) / f)) : 0;
                int v43 = v36;
                v40 = v16;
                for(int v44 = 0; v44 < v40; ++v44) {
                    if((v21 & ((long)(1 << v44))) != 0L) {
                        View view2 = this.getChildAt(v44);
                        l.l l4 = (l.l)view2.getLayoutParams();
                        if(view2 instanceof ActionMenuItemView) {
                            l4.e = v42;
                            l4.h = true;
                            if(v44 == 0 && !l4.g) {
                                l4.leftMargin = -v42 / 2;
                            }
                            v43 = 1;
                        }
                        else if(l4.c) {
                            l4.e = v42;
                            l4.h = true;
                            l4.rightMargin = -v42 / 2;
                            v43 = 1;
                        }
                        else {
                            if(v44 != 0) {
                                l4.leftMargin = v42 / 2;
                            }
                            if(v44 != v40 - 1) {
                                l4.rightMargin = v42 / 2;
                            }
                        }
                    }
                }
                v41 = v43;
            }
            else {
                v40 = v16;
                v41 = v36;
            }
            if(v41 != 0) {
                int v45 = 0;
                while(v45 < v40) {
                    View view3 = this.getChildAt(v45);
                    l.l l5 = (l.l)view3.getLayoutParams();
                    if(l5.h) {
                        v46 = v39;
                        view3.measure(View.MeasureSpec.makeMeasureSpec(l5.d * v15 + l5.e, 0x40000000), v46);
                    }
                    else {
                        v46 = v39;
                    }
                    ++v45;
                    v39 = v46;
                }
            }
            if(v4 == 0x40000000) {
                v48 = v6;
                v47 = v12;
            }
            else {
                v47 = v12;
                v48 = v17;
            }
            this.setMeasuredDimension(v47, v48);
            return;
        }
        for(int v49 = 0; v49 < v3; ++v49) {
            l.l l6 = (l.l)this.getChildAt(v49).getLayoutParams();
            l6.rightMargin = 0;
            l6.leftMargin = 0;
        }
        super.onMeasure(v, v1);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.B.y = z;
    }

    public void setOnMenuItemClickListener(m m0) {
        this.G = m0;
    }

    public void setOverflowIcon(Drawable drawable0) {
        this.getMenu();
        j j0 = this.B;
        i i0 = j0.q;
        if(i0 != null) {
            i0.setImageDrawable(drawable0);
            return;
        }
        j0.s = true;
        j0.r = drawable0;
    }

    public void setOverflowReserved(boolean z) {
        this.A = z;
    }

    public void setPopupTheme(int v) {
        if(this.z != v) {
            this.z = v;
            if(v == 0) {
                this.y = this.getContext();
                return;
            }
            this.y = new ContextThemeWrapper(this.getContext(), v);
        }
    }

    public void setPresenter(j j0) {
        this.B = j0;
        j0.p = this;
        this.x = j0.k;
    }
}

