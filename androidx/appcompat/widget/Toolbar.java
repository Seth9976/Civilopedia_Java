package androidx.appcompat.widget;

import B.b;
import B1.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import k.d;
import k.l;
import k.n;
import l.E0;
import l.F0;
import l.G0;
import l.H0;
import l.I0;
import l.N;
import l.O0;
import l.V;
import l.j;
import l.n0;
import l.v;
import l.w;

public class Toolbar extends ViewGroup {
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR;
        public int k;
        public boolean l;

        static {
            SavedState.CREATOR = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.k = parcel0.readInt();
            this.l = parcel0.readInt() != 0;
        }

        @Override  // androidx.customview.view.AbsSavedState
        public final void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.k);
            parcel0.writeInt(((int)this.l));
        }
    }

    public int A;
    public n0 B;
    public int C;
    public int D;
    public final int E;
    public CharSequence F;
    public CharSequence G;
    public ColorStateList H;
    public ColorStateList I;
    public boolean J;
    public boolean K;
    public final ArrayList L;
    public final ArrayList M;
    public final int[] N;
    public final d O;
    public I0 P;
    public j Q;
    public E0 R;
    public boolean S;
    public final b T;
    public ActionMenuView i;
    public N j;
    public N k;
    public v l;
    public w m;
    public final Drawable n;
    public final CharSequence o;
    public v p;
    public View q;
    public Context r;
    public int s;
    public int t;
    public int u;
    public final int v;
    public final int w;
    public int x;
    public int y;
    public int z;

    public Toolbar(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0x7F02016B);  // attr:toolbarStyle
        this.E = 0x800013;
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new int[2];
        this.O = new d(this, 2);
        this.T = new b(this, 28);
        a a0 = a.A(this.getContext(), attributeSet0, e.a.x, 0x7F02016B);  // attr:toolbarStyle
        TypedArray typedArray0 = (TypedArray)a0.k;
        this.t = typedArray0.getResourceId(28, 0);
        this.u = typedArray0.getResourceId(19, 0);
        this.E = typedArray0.getInteger(0, 0x800013);
        this.v = typedArray0.getInteger(2, 0x30);
        int v = typedArray0.getDimensionPixelOffset(22, 0);
        if(typedArray0.hasValue(27)) {
            v = typedArray0.getDimensionPixelOffset(27, v);
        }
        this.A = v;
        this.z = v;
        this.y = v;
        this.x = v;
        int v1 = typedArray0.getDimensionPixelOffset(25, -1);
        if(v1 >= 0) {
            this.x = v1;
        }
        int v2 = typedArray0.getDimensionPixelOffset(24, -1);
        if(v2 >= 0) {
            this.y = v2;
        }
        int v3 = typedArray0.getDimensionPixelOffset(26, -1);
        if(v3 >= 0) {
            this.z = v3;
        }
        int v4 = typedArray0.getDimensionPixelOffset(23, -1);
        if(v4 >= 0) {
            this.A = v4;
        }
        this.w = typedArray0.getDimensionPixelSize(13, -1);
        int v5 = typedArray0.getDimensionPixelOffset(9, 0x80000000);
        int v6 = typedArray0.getDimensionPixelOffset(5, 0x80000000);
        int v7 = typedArray0.getDimensionPixelSize(7, 0);
        int v8 = typedArray0.getDimensionPixelSize(8, 0);
        this.d();
        n0 n00 = this.B;
        n00.h = false;
        if(v7 != 0x80000000) {
            n00.e = v7;
            n00.a = v7;
        }
        if(v8 != 0x80000000) {
            n00.f = v8;
            n00.b = v8;
        }
        if(v5 != 0x80000000 || v6 != 0x80000000) {
            n00.a(v5, v6);
        }
        this.C = typedArray0.getDimensionPixelOffset(10, 0x80000000);
        this.D = typedArray0.getDimensionPixelOffset(6, 0x80000000);
        this.n = a0.o(4);
        this.o = typedArray0.getText(3);
        CharSequence charSequence0 = typedArray0.getText(21);
        if(!TextUtils.isEmpty(charSequence0)) {
            this.setTitle(charSequence0);
        }
        CharSequence charSequence1 = typedArray0.getText(18);
        if(!TextUtils.isEmpty(charSequence1)) {
            this.setSubtitle(charSequence1);
        }
        this.r = this.getContext();
        this.setPopupTheme(typedArray0.getResourceId(17, 0));
        Drawable drawable0 = a0.o(16);
        if(drawable0 != null) {
            this.setNavigationIcon(drawable0);
        }
        CharSequence charSequence2 = typedArray0.getText(15);
        if(!TextUtils.isEmpty(charSequence2)) {
            this.setNavigationContentDescription(charSequence2);
        }
        Drawable drawable1 = a0.o(11);
        if(drawable1 != null) {
            this.setLogo(drawable1);
        }
        CharSequence charSequence3 = typedArray0.getText(12);
        if(!TextUtils.isEmpty(charSequence3)) {
            this.setLogoDescription(charSequence3);
        }
        if(typedArray0.hasValue(29)) {
            this.setTitleTextColor(a0.n(29));
        }
        if(typedArray0.hasValue(20)) {
            this.setSubtitleTextColor(a0.n(20));
        }
        if(typedArray0.hasValue(14)) {
            int v9 = typedArray0.getResourceId(14, 0);
            this.getMenuInflater().inflate(v9, this.getMenu());
        }
        a0.C();
    }

    public final void a(int v, ArrayList arrayList0) {
        boolean z = this.getLayoutDirection() == 1;
        int v2 = this.getChildCount();
        int v3 = Gravity.getAbsoluteGravity(v, this.getLayoutDirection());
        arrayList0.clear();
        if(z) {
            for(int v4 = v2 - 1; v4 >= 0; --v4) {
                View view0 = this.getChildAt(v4);
                F0 f00 = (F0)view0.getLayoutParams();
                if(f00.b == 0 && this.s(view0) && this.j(f00.a) == v3) {
                    arrayList0.add(view0);
                }
            }
            return;
        }
        for(int v1 = 0; v1 < v2; ++v1) {
            View view1 = this.getChildAt(v1);
            F0 f01 = (F0)view1.getLayoutParams();
            if(f01.b == 0 && this.s(view1) && this.j(f01.a) == v3) {
                arrayList0.add(view1);
            }
        }
    }

    public final void b(View view0, boolean z) {
        F0 f00;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            f00 = Toolbar.h();
        }
        else {
            f00 = this.checkLayoutParams(viewGroup$LayoutParams0) ? ((F0)viewGroup$LayoutParams0) : Toolbar.i(viewGroup$LayoutParams0);
        }
        f00.b = 1;
        if(z && this.q != null) {
            view0.setLayoutParams(f00);
            this.M.add(view0);
            return;
        }
        this.addView(view0, f00);
    }

    public final void c() {
        if(this.p == null) {
            v v0 = new v(this.getContext(), null, 0x7F02016A);  // attr:toolbarNavigationButtonStyle
            this.p = v0;
            v0.setImageDrawable(this.n);
            this.p.setContentDescription(this.o);
            F0 f00 = Toolbar.h();
            f00.a = this.v & 0x70 | 0x800003;
            f00.b = 2;
            this.p.setLayoutParams(f00);
            this.p.setOnClickListener(new f.a(this, 2));
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return super.checkLayoutParams(viewGroup$LayoutParams0) && viewGroup$LayoutParams0 instanceof F0;
    }

    public final void d() {
        if(this.B == null) {
            n0 n00 = new n0();  // 初始化器: Ljava/lang/Object;-><init>()V
            n00.a = 0;
            n00.b = 0;
            n00.c = 0x80000000;
            n00.d = 0x80000000;
            n00.e = 0;
            n00.f = 0;
            n00.g = false;
            n00.h = false;
            this.B = n00;
        }
    }

    public final void e() {
        this.f();
        ActionMenuView actionMenuView0 = this.i;
        if(actionMenuView0.x == null) {
            l l0 = (l)actionMenuView0.getMenu();
            if(this.R == null) {
                this.R = new E0(this);
            }
            this.i.setExpandedActionViewsExclusive(true);
            l0.b(this.R, this.r);
        }
    }

    public final void f() {
        if(this.i == null) {
            ActionMenuView actionMenuView0 = new ActionMenuView(this.getContext(), null);
            this.i = actionMenuView0;
            actionMenuView0.setPopupTheme(this.s);
            this.i.setOnMenuItemClickListener(this.O);
            this.i.getClass();
            F0 f00 = Toolbar.h();
            f00.a = this.v & 0x70 | 0x800005;
            this.i.setLayoutParams(f00);
            this.b(this.i, false);
        }
    }

    public final void g() {
        if(this.l == null) {
            this.l = new v(this.getContext(), null, 0x7F02016A);  // attr:toolbarNavigationButtonStyle
            F0 f00 = Toolbar.h();
            f00.a = this.v & 0x70 | 0x800003;
            this.l.setLayoutParams(f00);
        }
    }

    @Override  // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return Toolbar.h();
    }

    @Override  // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        Context context0 = this.getContext();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = new F0(context0, attributeSet0);  // 初始化器: Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
        viewGroup$LayoutParams0.a = 0;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, e.a.b);
        viewGroup$LayoutParams0.a = typedArray0.getInt(0, 0);
        typedArray0.recycle();
        viewGroup$LayoutParams0.b = 0;
        return viewGroup$LayoutParams0;
    }

    @Override  // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return Toolbar.i(viewGroup$LayoutParams0);
    }

    public CharSequence getCollapseContentDescription() {
        return this.p == null ? null : this.p.getContentDescription();
    }

    public Drawable getCollapseIcon() {
        return this.p == null ? null : this.p.getDrawable();
    }

    public int getContentInsetEnd() {
        n0 n00 = this.B;
        if(n00 != null) {
            return n00.g ? n00.a : n00.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        return this.D == 0x80000000 ? this.getContentInsetEnd() : this.D;
    }

    public int getContentInsetLeft() {
        return this.B == null ? 0 : this.B.a;
    }

    public int getContentInsetRight() {
        return this.B == null ? 0 : this.B.b;
    }

    public int getContentInsetStart() {
        n0 n00 = this.B;
        if(n00 != null) {
            return n00.g ? n00.b : n00.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        return this.C == 0x80000000 ? this.getContentInsetStart() : this.C;
    }

    public int getCurrentContentInsetEnd() {
        return this.i == null || (this.i.x == null || !this.i.x.hasVisibleItems()) ? this.getContentInsetEnd() : Math.max(this.getContentInsetEnd(), Math.max(this.D, 0));
    }

    public int getCurrentContentInsetLeft() {
        return this.getLayoutDirection() == 1 ? this.getCurrentContentInsetEnd() : this.getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return this.getLayoutDirection() == 1 ? this.getCurrentContentInsetStart() : this.getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return this.getNavigationIcon() == null ? this.getContentInsetStart() : Math.max(this.getContentInsetStart(), Math.max(this.C, 0));
    }

    public Drawable getLogo() {
        return this.m == null ? null : this.m.getDrawable();
    }

    public CharSequence getLogoDescription() {
        return this.m == null ? null : this.m.getContentDescription();
    }

    public Menu getMenu() {
        this.e();
        return this.i.getMenu();
    }

    private MenuInflater getMenuInflater() {
        return new j.g(this.getContext());
    }

    public CharSequence getNavigationContentDescription() {
        return this.l == null ? null : this.l.getContentDescription();
    }

    public Drawable getNavigationIcon() {
        return this.l == null ? null : this.l.getDrawable();
    }

    public j getOuterActionMenuPresenter() {
        return this.Q;
    }

    public Drawable getOverflowIcon() {
        this.e();
        return this.i.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.r;
    }

    public int getPopupTheme() {
        return this.s;
    }

    public CharSequence getSubtitle() {
        return this.G;
    }

    public final TextView getSubtitleTextView() {
        return this.k;
    }

    public CharSequence getTitle() {
        return this.F;
    }

    public int getTitleMarginBottom() {
        return this.A;
    }

    public int getTitleMarginEnd() {
        return this.y;
    }

    public int getTitleMarginStart() {
        return this.x;
    }

    public int getTitleMarginTop() {
        return this.z;
    }

    public final TextView getTitleTextView() {
        return this.j;
    }

    public V getWrapper() {
        if(this.P == null) {
            I0 i00 = new I0();  // 初始化器: Ljava/lang/Object;-><init>()V
            i00.n = 0;
            i00.a = this;
            i00.h = this.getTitle();
            i00.i = this.getSubtitle();
            i00.g = i00.h != null;
            i00.f = this.getNavigationIcon();
            String s = null;
            a a0 = a.A(this.getContext(), null, e.a.a, 0x7F020005);  // attr:actionBarStyle
            i00.o = a0.o(15);
            TypedArray typedArray0 = (TypedArray)a0.k;
            CharSequence charSequence0 = typedArray0.getText(27);
            if(!TextUtils.isEmpty(charSequence0)) {
                i00.g = true;
                i00.h = charSequence0;
                if((i00.b & 8) != 0) {
                    i00.a.setTitle(charSequence0);
                }
            }
            CharSequence charSequence1 = typedArray0.getText(25);
            if(!TextUtils.isEmpty(charSequence1)) {
                i00.i = charSequence1;
                if((i00.b & 8) != 0) {
                    this.setSubtitle(charSequence1);
                }
            }
            Drawable drawable0 = a0.o(20);
            if(drawable0 != null) {
                i00.e = drawable0;
                i00.c();
            }
            Drawable drawable1 = a0.o(17);
            if(drawable1 != null) {
                i00.d = drawable1;
                i00.c();
            }
            if(i00.f == null) {
                Drawable drawable2 = i00.o;
                if(drawable2 != null) {
                    i00.f = drawable2;
                    Toolbar toolbar0 = i00.a;
                    if((i00.b & 4) == 0) {
                        toolbar0.setNavigationIcon(null);
                    }
                    else {
                        toolbar0.setNavigationIcon(drawable2);
                    }
                }
            }
            i00.a(typedArray0.getInt(10, 0));
            int v = typedArray0.getResourceId(9, 0);
            if(v != 0) {
                View view0 = LayoutInflater.from(this.getContext()).inflate(v, this, false);
                View view1 = i00.c;
                if(view1 != null && (i00.b & 16) != 0) {
                    this.removeView(view1);
                }
                i00.c = view0;
                if(view0 != null && (i00.b & 16) != 0) {
                    this.addView(view0);
                }
                i00.a(i00.b | 16);
            }
            int v1 = typedArray0.getLayoutDimension(13, 0);
            if(v1 > 0) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
                viewGroup$LayoutParams0.height = v1;
                this.setLayoutParams(viewGroup$LayoutParams0);
            }
            int v2 = typedArray0.getDimensionPixelOffset(7, -1);
            int v3 = typedArray0.getDimensionPixelOffset(3, -1);
            if(v2 >= 0 || v3 >= 0) {
                this.d();
                this.B.a(Math.max(v2, 0), Math.max(v3, 0));
            }
            int v4 = typedArray0.getResourceId(28, 0);
            if(v4 != 0) {
                Context context0 = this.getContext();
                this.t = v4;
                N n0 = this.j;
                if(n0 != null) {
                    n0.setTextAppearance(context0, v4);
                }
            }
            int v5 = typedArray0.getResourceId(26, 0);
            if(v5 != 0) {
                Context context1 = this.getContext();
                this.u = v5;
                N n1 = this.k;
                if(n1 != null) {
                    n1.setTextAppearance(context1, v5);
                }
            }
            int v6 = typedArray0.getResourceId(22, 0);
            if(v6 != 0) {
                this.setPopupTheme(v6);
            }
            a0.C();
            if(0x7F0E0024 != i00.n) {  // string:abc_action_bar_up_description "Navigate up"
                i00.n = 0x7F0E0024;  // string:abc_action_bar_up_description "Navigate up"
                if(TextUtils.isEmpty(this.getNavigationContentDescription())) {
                    int v7 = i00.n;
                    if(v7 != 0) {
                        s = this.getContext().getString(v7);
                    }
                    i00.j = s;
                    i00.b();
                }
            }
            i00.j = this.getNavigationContentDescription();
            this.setNavigationOnClickListener(new H0(i00));
            this.P = i00;
        }
        return this.P;
    }

    public static F0 h() {
        F0 f00 = new F0(-2, -2);  // 初始化器: Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V
        f00.b = 0;
        f00.a = 0x800013;
        return f00;
    }

    public static F0 i(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 instanceof F0) {
            F0 f00 = new F0(((F0)viewGroup$LayoutParams0));
            f00.b = ((F0)viewGroup$LayoutParams0).b;
            return f00;
        }
        if(viewGroup$LayoutParams0 instanceof F0) {
            F0 f01 = new F0(((F0)viewGroup$LayoutParams0));
            f01.b = 0;
            return f01;
        }
        if(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
            F0 f02 = new F0(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0));
            f02.b = 0;
            f02.leftMargin = ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).leftMargin;
            f02.topMargin = ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin;
            f02.rightMargin = ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin;
            f02.bottomMargin = ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin;
            return f02;
        }
        F0 f03 = new F0(viewGroup$LayoutParams0);
        f03.b = 0;
        return f03;
    }

    public final int j(int v) {
        int v1 = this.getLayoutDirection();
        int v2 = Gravity.getAbsoluteGravity(v, v1);
        if((v2 & 7) != 1 && (v2 & 7) != 3 && (v2 & 7) != 5) {
            return v1 == 1 ? 5 : 3;
        }
        return v2 & 7;
    }

    public final int k(View view0, int v) {
        F0 f00 = (F0)view0.getLayoutParams();
        int v1 = view0.getMeasuredHeight();
        int v2 = v <= 0 ? 0 : (v1 - v) / 2;
        int v3 = f00.a & 0x70;
        switch((v3 == 16 || v3 == 0x30 || v3 == 80 ? f00.a & 0x70 : this.E & 0x70)) {
            case 0x30: {
                return this.getPaddingTop() - v2;
            }
            case 80: {
                return this.getHeight() - this.getPaddingBottom() - v1 - f00.bottomMargin - v2;
            }
            default: {
                int v4 = this.getPaddingTop();
                int v5 = this.getPaddingBottom();
                int v6 = this.getHeight();
                int v7 = (v6 - v4 - v5 - v1) / 2;
                int v8 = f00.topMargin;
                if(v7 < v8) {
                    return v4 + v8;
                }
                int v9 = v6 - v5 - v1 - v7 - v4;
                int v10 = f00.bottomMargin;
                if(v9 < v10) {
                    v7 = Math.max(0, v7 - (v10 - v9));
                }
                return v4 + v7;
            }
        }
    }

    public static int l(View view0) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        int v = viewGroup$MarginLayoutParams0.getMarginStart();
        return viewGroup$MarginLayoutParams0.getMarginEnd() + v;
    }

    public static int m(View view0) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        return viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin;
    }

    public final boolean n(View view0) {
        return view0.getParent() == this || this.M.contains(view0);
    }

    public final int o(View view0, int v, int v1, int[] arr_v) {
        F0 f00 = (F0)view0.getLayoutParams();
        int v2 = f00.leftMargin - arr_v[0];
        int v3 = Math.max(0, v2) + v;
        arr_v[0] = Math.max(0, -v2);
        int v4 = this.k(view0, v1);
        int v5 = view0.getMeasuredWidth();
        view0.layout(v3, v4, v3 + v5, view0.getMeasuredHeight() + v4);
        return v5 + f00.rightMargin + v3;
    }

    @Override  // android.view.ViewGroup
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.removeCallbacks(this.T);
    }

    @Override  // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(v == 9) {
            this.K = false;
        }
        if(!this.K && (v == 9 && !super.onHoverEvent(motionEvent0))) {
            this.K = true;
        }
        if(v == 3 || v == 10) {
            this.K = false;
        }
        return true;
    }

    @Override  // android.view.ViewGroup
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v26;
        int v25;
        int v49;
        int v45;
        int v40;
        int v36;
        int v32;
        int v28;
        boolean z4;
        int v24;
        int v22;
        int v20;
        int v14;
        int v13;
        boolean z1 = this.getLayoutDirection() == 1;
        int v4 = this.getWidth();
        int v5 = this.getHeight();
        int v6 = this.getPaddingLeft();
        int v7 = this.getPaddingRight();
        int v8 = this.getPaddingTop();
        int v9 = this.getPaddingBottom();
        int v10 = v4 - v7;
        int[] arr_v = this.N;
        arr_v[1] = 0;
        arr_v[0] = 0;
        int v11 = this.getMinimumHeight();
        int v12 = v11 < 0 ? 0 : Math.min(v11, v3 - v1);
        if(!this.s(this.l)) {
            v14 = v6;
            v13 = v10;
        }
        else if(z1) {
            v13 = this.p(this.l, v10, v12, arr_v);
            v14 = v6;
        }
        else {
            v14 = this.o(this.l, v6, v12, arr_v);
            v13 = v10;
        }
        if(this.s(this.p)) {
            if(z1) {
                v13 = this.p(this.p, v13, v12, arr_v);
            }
            else {
                v14 = this.o(this.p, v14, v12, arr_v);
            }
        }
        if(this.s(this.i)) {
            if(z1) {
                v14 = this.o(this.i, v14, v12, arr_v);
            }
            else {
                v13 = this.p(this.i, v13, v12, arr_v);
            }
        }
        int v15 = this.getCurrentContentInsetLeft();
        int v16 = this.getCurrentContentInsetRight();
        arr_v[0] = Math.max(0, v15 - v14);
        arr_v[1] = Math.max(0, v16 - (v10 - v13));
        int v17 = Math.max(v14, v15);
        int v18 = Math.min(v13, v10 - v16);
        if(this.s(this.q)) {
            if(z1) {
                v18 = this.p(this.q, v18, v12, arr_v);
            }
            else {
                v17 = this.o(this.q, v17, v12, arr_v);
            }
        }
        if(this.s(this.m)) {
            if(z1) {
                v18 = this.p(this.m, v18, v12, arr_v);
            }
            else {
                v17 = this.o(this.m, v17, v12, arr_v);
            }
        }
        boolean z2 = this.s(this.j);
        boolean z3 = this.s(this.k);
        if(z2) {
            F0 f00 = (F0)this.j.getLayoutParams();
            int v19 = f00.topMargin;
            v20 = v7;
            int v21 = this.j.getMeasuredHeight();
            v22 = f00.bottomMargin + (v21 + v19);
        }
        else {
            v20 = v7;
            v22 = 0;
        }
        if(z3) {
            F0 f01 = (F0)this.k.getLayoutParams();
            int v23 = f01.topMargin;
            v24 = v4;
            v22 += this.k.getMeasuredHeight() + v23 + f01.bottomMargin;
        }
        else {
            v24 = v4;
        }
        if(z2 || z3) {
            N n0 = z3 ? this.k : this.j;
            F0 f02 = (F0)(z2 ? this.j : this.k).getLayoutParams();
            F0 f03 = (F0)n0.getLayoutParams();
            if((!z2 || this.j.getMeasuredWidth() <= 0) && (!z3 || this.k.getMeasuredWidth() <= 0)) {
                v25 = v6;
                z4 = false;
            }
            else {
                v25 = v6;
                z4 = true;
            }
            v26 = v12;
            switch(this.E & 0x70) {
                case 0x30: {
                    v28 = v17;
                    v32 = this.getPaddingTop() + f02.topMargin + this.z;
                    break;
                }
                case 80: {
                    v28 = v17;
                    v32 = v5 - v9 - f03.bottomMargin - this.A - v22;
                    break;
                }
                default: {
                    int v27 = (v5 - v8 - v9 - v22) / 2;
                    v28 = v17;
                    int v29 = f02.topMargin + this.z;
                    if(v27 < v29) {
                        v27 = v29;
                    }
                    else {
                        int v30 = v5 - v9 - v22 - v27 - v8;
                        int v31 = this.A;
                        if(v30 < f02.bottomMargin + v31) {
                            v27 = Math.max(0, v27 - (f03.bottomMargin + v31 - v30));
                        }
                    }
                    v32 = v8 + v27;
                }
            }
            if(z1) {
                int v33 = (z4 ? this.x : 0) - arr_v[1];
                v18 -= Math.max(0, v33);
                arr_v[1] = Math.max(0, -v33);
                if(z2) {
                    F0 f04 = (F0)this.j.getLayoutParams();
                    int v34 = v18 - this.j.getMeasuredWidth();
                    int v35 = this.j.getMeasuredHeight() + v32;
                    this.j.layout(v34, v32, v18, v35);
                    v36 = v34 - this.y;
                    v32 = v35 + f04.bottomMargin;
                }
                else {
                    v36 = v18;
                }
                if(z3) {
                    int v37 = v32 + ((F0)this.k.getLayoutParams()).topMargin;
                    int v38 = this.k.getMeasuredWidth();
                    int v39 = this.k.getMeasuredHeight();
                    this.k.layout(v18 - v38, v37, v18, v39 + v37);
                    v40 = v18 - this.y;
                }
                else {
                    v40 = v18;
                }
                if(z4) {
                    v18 = Math.min(v36, v40);
                }
                v17 = v28;
            }
            else {
                int v41 = (z4 ? this.x : 0) - arr_v[0];
                int v42 = Math.max(0, v41) + v28;
                arr_v[0] = Math.max(0, -v41);
                if(z2) {
                    F0 f05 = (F0)this.j.getLayoutParams();
                    int v43 = this.j.getMeasuredWidth() + v42;
                    int v44 = this.j.getMeasuredHeight() + v32;
                    this.j.layout(v42, v32, v43, v44);
                    v45 = v43 + this.y;
                    v32 = v44 + f05.bottomMargin;
                }
                else {
                    v45 = v42;
                }
                if(z3) {
                    int v46 = v32 + ((F0)this.k.getLayoutParams()).topMargin;
                    int v47 = this.k.getMeasuredWidth() + v42;
                    int v48 = this.k.getMeasuredHeight();
                    this.k.layout(v42, v46, v47, v48 + v46);
                    v49 = v47 + this.y;
                }
                else {
                    v49 = v42;
                }
                v17 = z4 ? Math.max(v45, v49) : v42;
            }
        }
        else {
            v25 = v6;
            v26 = v12;
        }
        ArrayList arrayList0 = this.L;
        this.a(3, arrayList0);
        int v50 = arrayList0.size();
        int v51 = v17;
        for(int v52 = 0; v52 < v50; ++v52) {
            v51 = this.o(((View)arrayList0.get(v52)), v51, v26, arr_v);
        }
        this.a(5, arrayList0);
        int v53 = arrayList0.size();
        for(int v54 = 0; v54 < v53; ++v54) {
            v18 = this.p(((View)arrayList0.get(v54)), v18, v26, arr_v);
        }
        this.a(1, arrayList0);
        int v55 = arr_v[0];
        int v56 = arrayList0.size();
        int v57 = arr_v[1];
        int v58 = v55;
        int v59 = 0;
        int v60 = 0;
        while(v59 < v56) {
            View view0 = (View)arrayList0.get(v59);
            F0 f06 = (F0)view0.getLayoutParams();
            int v61 = f06.leftMargin - v58;
            int v62 = f06.rightMargin - v57;
            v60 += view0.getMeasuredWidth() + Math.max(0, v61) + Math.max(0, v62);
            ++v59;
            v57 = Math.max(0, -v62);
            v58 = Math.max(0, -v61);
        }
        int v63 = (v24 - v25 - v20) / 2 + v25 - v60 / 2;
        int v64 = v60 + v63;
        if(v63 >= v51) {
            v51 = v64 <= v18 ? v63 : v63 - (v64 - v18);
        }
        int v65 = arrayList0.size();
        for(int v66 = 0; v66 < v65; ++v66) {
            v51 = this.o(((View)arrayList0.get(v66)), v51, v26, arr_v);
        }
        arrayList0.clear();
    }

    @Override  // android.view.View
    public final void onMeasure(int v, int v1) {
        int v29;
        int v28;
        int v27;
        int v13;
        int v7;
        int v6;
        int v4;
        boolean z = O0.a(this);
        int v2 = 0;
        if(this.s(this.l)) {
            this.r(this.l, v, 0, v1, this.w);
            int v3 = this.l.getMeasuredWidth();
            v4 = Toolbar.l(this.l) + v3;
            int v5 = this.l.getMeasuredHeight();
            v6 = Math.max(0, Toolbar.m(this.l) + v5);
            v7 = View.combineMeasuredStates(0, this.l.getMeasuredState());
        }
        else {
            v4 = 0;
            v6 = 0;
            v7 = 0;
        }
        if(this.s(this.p)) {
            this.r(this.p, v, 0, v1, this.w);
            int v8 = this.p.getMeasuredWidth();
            v4 = Toolbar.l(this.p) + v8;
            int v9 = this.p.getMeasuredHeight();
            v6 = Math.max(v6, Toolbar.m(this.p) + v9);
            v7 = View.combineMeasuredStates(v7, this.p.getMeasuredState());
        }
        int v10 = this.getCurrentContentInsetStart();
        int v11 = Math.max(v10, v4);
        int[] arr_v = this.N;
        arr_v[z] = Math.max(0, v10 - v4);
        if(this.s(this.i)) {
            this.r(this.i, v, v11, v1, this.w);
            int v12 = this.i.getMeasuredWidth();
            v13 = Toolbar.l(this.i) + v12;
            int v14 = this.i.getMeasuredHeight();
            v6 = Math.max(v6, Toolbar.m(this.i) + v14);
            v7 = View.combineMeasuredStates(v7, this.i.getMeasuredState());
        }
        else {
            v13 = 0;
        }
        int v15 = this.getCurrentContentInsetEnd();
        int v16 = v11 + Math.max(v15, v13);
        arr_v[!z] = Math.max(0, v15 - v13);
        if(this.s(this.q)) {
            v16 += this.q(this.q, v, v16, v1, 0, arr_v);
            int v17 = this.q.getMeasuredHeight();
            v6 = Math.max(v6, Toolbar.m(this.q) + v17);
            v7 = View.combineMeasuredStates(v7, this.q.getMeasuredState());
        }
        if(this.s(this.m)) {
            v16 += this.q(this.m, v, v16, v1, 0, arr_v);
            int v18 = this.m.getMeasuredHeight();
            v6 = Math.max(v6, Toolbar.m(this.m) + v18);
            v7 = View.combineMeasuredStates(v7, this.m.getMeasuredState());
        }
        int v19 = this.getChildCount();
        for(int v20 = 0; v20 < v19; ++v20) {
            View view0 = this.getChildAt(v20);
            if(((F0)view0.getLayoutParams()).b == 0 && this.s(view0)) {
                v16 += this.q(view0, v, v16, v1, 0, arr_v);
                int v21 = view0.getMeasuredHeight();
                v6 = Math.max(v6, Toolbar.m(view0) + v21);
                v7 = View.combineMeasuredStates(v7, view0.getMeasuredState());
            }
        }
        int v22 = this.z + this.A;
        int v23 = this.x + this.y;
        if(this.s(this.j)) {
            this.q(this.j, v, v16 + v23, v1, v22, arr_v);
            int v24 = this.j.getMeasuredWidth();
            int v25 = Toolbar.l(this.j);
            int v26 = this.j.getMeasuredHeight();
            v27 = Toolbar.m(this.j) + v26;
            v28 = View.combineMeasuredStates(v7, this.j.getMeasuredState());
            v29 = v25 + v24;
        }
        else {
            v28 = v7;
            v29 = 0;
            v27 = 0;
        }
        if(this.s(this.k)) {
            v29 = Math.max(v29, this.q(this.k, v, v16 + v23, v1, v27 + v22, arr_v));
            int v30 = this.k.getMeasuredHeight();
            v27 += Toolbar.m(this.k) + v30;
            v28 = View.combineMeasuredStates(v28, this.k.getMeasuredState());
        }
        int v31 = this.getPaddingLeft();
        int v32 = this.getPaddingRight();
        int v33 = this.getPaddingTop();
        int v34 = this.getPaddingBottom();
        int v35 = View.resolveSizeAndState(Math.max(v32 + v31 + (v16 + v29), this.getSuggestedMinimumWidth()), v, 0xFF000000 & v28);
        int v36 = View.resolveSizeAndState(Math.max(v34 + v33 + Math.max(v6, v27), this.getSuggestedMinimumHeight()), v1, v28 << 16);
        if(this.S) {
            int v37 = this.getChildCount();
            for(int v38 = 0; v38 < v37; ++v38) {
                View view1 = this.getChildAt(v38);
                if(this.s(view1) && view1.getMeasuredWidth() > 0 && view1.getMeasuredHeight() > 0) {
                    v2 = v36;
                    this.setMeasuredDimension(v35, v2);
                    return;
                }
            }
        }
        else {
            v2 = v36;
        }
        this.setMeasuredDimension(v35, v2);
    }

    @Override  // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).i);
        l l0 = this.i == null ? null : this.i.x;
        int v = ((SavedState)parcelable0).k;
        if(v != 0 && this.R != null && l0 != null) {
            MenuItem menuItem0 = l0.findItem(v);
            if(menuItem0 != null) {
                menuItem0.expandActionView();
            }
        }
        if(((SavedState)parcelable0).l) {
            this.removeCallbacks(this.T);
            this.post(this.T);
        }
    }

    @Override  // android.view.View
    public final void onRtlPropertiesChanged(int v) {
        super.onRtlPropertiesChanged(v);
        this.d();
        n0 n00 = this.B;
        if(v == 1 != n00.g) {
            n00.g = v == 1;
            if(n00.h) {
                if(v == 1) {
                    n00.a = n00.d == 0x80000000 ? n00.e : n00.d;
                    n00.b = n00.c == 0x80000000 ? n00.f : n00.c;
                    return;
                }
                n00.a = n00.c == 0x80000000 ? n00.e : n00.c;
                n00.b = n00.d == 0x80000000 ? n00.f : n00.d;
                return;
            }
            n00.a = n00.e;
            n00.b = n00.f;
        }
    }

    @Override  // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());  // 初始化器: Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V
        E0 e00 = this.R;
        if(e00 != null) {
            n n0 = e00.j;
            if(n0 != null) {
                parcelable0.k = n0.a;
            }
        }
        parcelable0.l = this.i != null && (this.i.B != null && this.i.B.h());
        return parcelable0;
    }

    @Override  // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(v == 0) {
            this.J = false;
        }
        if(!this.J && (v == 0 && !super.onTouchEvent(motionEvent0))) {
            this.J = true;
        }
        if(v == 1 || v == 3) {
            this.J = false;
        }
        return true;
    }

    public final int p(View view0, int v, int v1, int[] arr_v) {
        F0 f00 = (F0)view0.getLayoutParams();
        int v2 = f00.rightMargin - arr_v[1];
        int v3 = v - Math.max(0, v2);
        arr_v[1] = Math.max(0, -v2);
        int v4 = this.k(view0, v1);
        int v5 = view0.getMeasuredWidth();
        view0.layout(v3 - v5, v4, v3, view0.getMeasuredHeight() + v4);
        return v3 - (v5 + f00.leftMargin);
    }

    public final int q(View view0, int v, int v1, int v2, int v3, int[] arr_v) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        int v4 = viewGroup$MarginLayoutParams0.leftMargin - arr_v[0];
        int v5 = viewGroup$MarginLayoutParams0.rightMargin - arr_v[1];
        int v6 = Math.max(0, v5) + Math.max(0, v4);
        arr_v[0] = Math.max(0, -v4);
        arr_v[1] = Math.max(0, -v5);
        int v7 = this.getPaddingLeft();
        int v8 = ViewGroup.getChildMeasureSpec(v, this.getPaddingRight() + v7 + v6 + v1, viewGroup$MarginLayoutParams0.width);
        int v9 = this.getPaddingTop();
        view0.measure(v8, ViewGroup.getChildMeasureSpec(v2, this.getPaddingBottom() + v9 + viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin + v3, viewGroup$MarginLayoutParams0.height));
        return view0.getMeasuredWidth() + v6;
    }

    public final void r(View view0, int v, int v1, int v2, int v3) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        int v4 = this.getPaddingLeft();
        int v5 = ViewGroup.getChildMeasureSpec(v, this.getPaddingRight() + v4 + viewGroup$MarginLayoutParams0.leftMargin + viewGroup$MarginLayoutParams0.rightMargin + v1, viewGroup$MarginLayoutParams0.width);
        int v6 = this.getPaddingTop();
        int v7 = ViewGroup.getChildMeasureSpec(v2, this.getPaddingBottom() + v6 + viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin, viewGroup$MarginLayoutParams0.height);
        int v8 = View.MeasureSpec.getMode(v7);
        if(v8 != 0x40000000 && v3 >= 0) {
            if(v8 != 0) {
                v3 = Math.min(View.MeasureSpec.getSize(v7), v3);
            }
            v7 = View.MeasureSpec.makeMeasureSpec(v3, 0x40000000);
        }
        view0.measure(v5, v7);
    }

    public final boolean s(View view0) {
        return view0 != null && view0.getParent() == this && view0.getVisibility() != 8;
    }

    public void setCollapseContentDescription(int v) {
        this.setCollapseContentDescription((v == 0 ? null : this.getContext().getText(v)));
    }

    public void setCollapseContentDescription(CharSequence charSequence0) {
        if(!TextUtils.isEmpty(charSequence0)) {
            this.c();
        }
        v v0 = this.p;
        if(v0 != null) {
            v0.setContentDescription(charSequence0);
        }
    }

    public void setCollapseIcon(int v) {
        this.setCollapseIcon(g.b.c(this.getContext(), v));
    }

    public void setCollapseIcon(Drawable drawable0) {
        if(drawable0 != null) {
            this.c();
            this.p.setImageDrawable(drawable0);
            return;
        }
        v v0 = this.p;
        if(v0 != null) {
            v0.setImageDrawable(this.n);
        }
    }

    public void setCollapsible(boolean z) {
        this.S = z;
        this.requestLayout();
    }

    public void setContentInsetEndWithActions(int v) {
        if(v < 0) {
            v = 0x80000000;
        }
        if(v != this.D) {
            this.D = v;
            if(this.getNavigationIcon() != null) {
                this.requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int v) {
        if(v < 0) {
            v = 0x80000000;
        }
        if(v != this.C) {
            this.C = v;
            if(this.getNavigationIcon() != null) {
                this.requestLayout();
            }
        }
    }

    public void setLogo(int v) {
        this.setLogo(g.b.c(this.getContext(), v));
    }

    public void setLogo(Drawable drawable0) {
        if(drawable0 != null) {
            if(this.m == null) {
                this.m = new w(this.getContext(), null, 0);
            }
            if(!this.n(this.m)) {
                this.b(this.m, true);
            }
        }
        else if(this.m != null && this.n(this.m)) {
            this.removeView(this.m);
            this.M.remove(this.m);
        }
        w w0 = this.m;
        if(w0 != null) {
            w0.setImageDrawable(drawable0);
        }
    }

    public void setLogoDescription(int v) {
        this.setLogoDescription(this.getContext().getText(v));
    }

    public void setLogoDescription(CharSequence charSequence0) {
        if(!TextUtils.isEmpty(charSequence0) && this.m == null) {
            this.m = new w(this.getContext(), null, 0);
        }
        w w0 = this.m;
        if(w0 != null) {
            w0.setContentDescription(charSequence0);
        }
    }

    public void setNavigationContentDescription(int v) {
        this.setNavigationContentDescription((v == 0 ? null : this.getContext().getText(v)));
    }

    public void setNavigationContentDescription(CharSequence charSequence0) {
        if(!TextUtils.isEmpty(charSequence0)) {
            this.g();
        }
        v v0 = this.l;
        if(v0 != null) {
            v0.setContentDescription(charSequence0);
        }
    }

    public void setNavigationIcon(int v) {
        this.setNavigationIcon(g.b.c(this.getContext(), v));
    }

    public void setNavigationIcon(Drawable drawable0) {
        if(drawable0 != null) {
            this.g();
            if(!this.n(this.l)) {
                this.b(this.l, true);
            }
        }
        else if(this.l != null && this.n(this.l)) {
            this.removeView(this.l);
            this.M.remove(this.l);
        }
        v v0 = this.l;
        if(v0 != null) {
            v0.setImageDrawable(drawable0);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener view$OnClickListener0) {
        this.g();
        this.l.setOnClickListener(view$OnClickListener0);
    }

    public void setOnMenuItemClickListener(G0 g00) {
    }

    public void setOverflowIcon(Drawable drawable0) {
        this.e();
        this.i.setOverflowIcon(drawable0);
    }

    public void setPopupTheme(int v) {
        if(this.s != v) {
            this.s = v;
            if(v == 0) {
                this.r = this.getContext();
                return;
            }
            this.r = new ContextThemeWrapper(this.getContext(), v);
        }
    }

    public void setSubtitle(int v) {
        this.setSubtitle(this.getContext().getText(v));
    }

    public void setSubtitle(CharSequence charSequence0) {
        if(!TextUtils.isEmpty(charSequence0)) {
            if(this.k == null) {
                Context context0 = this.getContext();
                N n0 = new N(context0, null);
                this.k = n0;
                n0.setSingleLine();
                this.k.setEllipsize(TextUtils.TruncateAt.END);
                int v = this.u;
                if(v != 0) {
                    this.k.setTextAppearance(context0, v);
                }
                ColorStateList colorStateList0 = this.I;
                if(colorStateList0 != null) {
                    this.k.setTextColor(colorStateList0);
                }
            }
            if(!this.n(this.k)) {
                this.b(this.k, true);
            }
        }
        else if(this.k != null && this.n(this.k)) {
            this.removeView(this.k);
            this.M.remove(this.k);
        }
        N n1 = this.k;
        if(n1 != null) {
            n1.setText(charSequence0);
        }
        this.G = charSequence0;
    }

    public void setSubtitleTextColor(int v) {
        this.setSubtitleTextColor(ColorStateList.valueOf(v));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList0) {
        this.I = colorStateList0;
        N n0 = this.k;
        if(n0 != null) {
            n0.setTextColor(colorStateList0);
        }
    }

    public void setTitle(int v) {
        this.setTitle(this.getContext().getText(v));
    }

    public void setTitle(CharSequence charSequence0) {
        if(!TextUtils.isEmpty(charSequence0)) {
            if(this.j == null) {
                Context context0 = this.getContext();
                N n0 = new N(context0, null);
                this.j = n0;
                n0.setSingleLine();
                this.j.setEllipsize(TextUtils.TruncateAt.END);
                int v = this.t;
                if(v != 0) {
                    this.j.setTextAppearance(context0, v);
                }
                ColorStateList colorStateList0 = this.H;
                if(colorStateList0 != null) {
                    this.j.setTextColor(colorStateList0);
                }
            }
            if(!this.n(this.j)) {
                this.b(this.j, true);
            }
        }
        else if(this.j != null && this.n(this.j)) {
            this.removeView(this.j);
            this.M.remove(this.j);
        }
        N n1 = this.j;
        if(n1 != null) {
            n1.setText(charSequence0);
        }
        this.F = charSequence0;
    }

    public void setTitleMarginBottom(int v) {
        this.A = v;
        this.requestLayout();
    }

    public void setTitleMarginEnd(int v) {
        this.y = v;
        this.requestLayout();
    }

    public void setTitleMarginStart(int v) {
        this.x = v;
        this.requestLayout();
    }

    public void setTitleMarginTop(int v) {
        this.z = v;
        this.requestLayout();
    }

    public void setTitleTextColor(int v) {
        this.setTitleTextColor(ColorStateList.valueOf(v));
    }

    public void setTitleTextColor(ColorStateList colorStateList0) {
        this.H = colorStateList0;
        N n0 = this.j;
        if(n0 != null) {
            n0.setTextColor(colorStateList0);
        }
    }
}

