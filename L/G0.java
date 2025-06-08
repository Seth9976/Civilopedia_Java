package l;

import H.b;
import O2.A;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import e.a;
import java.lang.reflect.Method;
import k.B;

public abstract class g0 implements B {
    public final f0 A;
    public final e0 B;
    public final Handler C;
    public final Rect D;
    public Rect E;
    public boolean F;
    public final y G;
    public static final Method H;
    public static final Method I;
    public static final Method J;
    public final Context i;
    public ListAdapter j;
    public Y k;
    public final int l;
    public int m;
    public int n;
    public int o;
    public final int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public final int u;
    public b v;
    public View w;
    public AdapterView.OnItemClickListener x;
    public final e0 y;
    public final C0.b z;

    static {
        Class class0 = PopupWindow.class;
        if(Build.VERSION.SDK_INT <= 28) {
            try {
                g0.H = class0.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            }
            catch(NoSuchMethodException unused_ex) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                g0.J = class0.getDeclaredMethod("setEpicenterBounds", Rect.class);
            }
            catch(NoSuchMethodException unused_ex) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if(Build.VERSION.SDK_INT <= 23) {
            try {
                g0.I = class0.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            }
            catch(NoSuchMethodException unused_ex) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public g0(Context context0, AttributeSet attributeSet0, int v) {
        Drawable drawable0;
        this.l = -2;
        this.m = -2;
        this.p = 1002;
        this.t = 0;
        this.u = 0x7FFFFFFF;
        this.y = new e0(this, 1);
        this.z = new C0.b(this, 1);
        this.A = new f0(this);
        this.B = new e0(this, 0);
        this.D = new Rect();
        this.i = context0;
        this.C = new Handler(context0.getMainLooper());
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, a.o, v, 0);
        this.n = typedArray0.getDimensionPixelOffset(0, 0);
        int v1 = typedArray0.getDimensionPixelOffset(1, 0);
        this.o = v1;
        if(v1 != 0) {
            this.q = true;
        }
        typedArray0.recycle();
        y y0 = new y(context0, attributeSet0, v, 0);  // 初始化器: Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
        TypedArray typedArray1 = context0.obtainStyledAttributes(attributeSet0, a.s, v, 0);
        if(typedArray1.hasValue(2)) {
            A.Z(y0, typedArray1.getBoolean(2, false));
        }
        if(typedArray1.hasValue(0)) {
            int v2 = typedArray1.getResourceId(0, 0);
            drawable0 = v2 == 0 ? typedArray1.getDrawable(0) : g.b.c(context0, v2);
        }
        else {
            drawable0 = typedArray1.getDrawable(0);
        }
        y0.setBackgroundDrawable(drawable0);
        typedArray1.recycle();
        this.G = y0;
        y0.setInputMethodMode(1);
    }

    public final int a() {
        return this.n;
    }

    @Override  // k.B
    public final boolean b() {
        return this.G.isShowing();
    }

    public final Drawable d() {
        return this.G.getBackground();
    }

    @Override  // k.B
    public final void dismiss() {
        this.G.dismiss();
        this.G.setContentView(null);
        this.k = null;
        this.C.removeCallbacks(this.y);
    }

    @Override  // k.B
    public final void e() {
        int v11;
        int v8;
        int v6;
        int v4;
        int v2;
        int v = 0;
        y y0 = this.G;
        Context context0 = this.i;
        if(this.k == null) {
            Y y1 = this.q(context0, !this.F);
            this.k = y1;
            y1.setAdapter(this.j);
            this.k.setOnItemClickListener(this.x);
            this.k.setFocusable(true);
            this.k.setFocusableInTouchMode(true);
            this.k.setOnItemSelectedListener(new d0(this, 0));
            this.k.setOnScrollListener(this.A);
            y0.setContentView(this.k);
        }
        else {
            ViewGroup viewGroup0 = (ViewGroup)y0.getContentView();
        }
        Drawable drawable0 = y0.getBackground();
        Rect rect0 = this.D;
        if(drawable0 == null) {
            rect0.setEmpty();
            v2 = 0;
        }
        else {
            drawable0.getPadding(rect0);
            int v1 = rect0.top;
            v2 = rect0.bottom + v1;
            if(!this.q) {
                this.o = -v1;
            }
        }
        boolean z = y0.getInputMethodMode() == 2;
        View view0 = this.w;
        int v3 = this.o;
        if(Build.VERSION.SDK_INT <= 23) {
            Method method0 = g0.I;
            if(method0 == null) {
                v4 = y0.getMaxAvailableHeight(view0, v3);
            }
            else {
                try {
                    v4 = (int)(((Integer)method0.invoke(y0, view0, v3, Boolean.valueOf(z))));
                }
                catch(Exception unused_ex) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                    v4 = y0.getMaxAvailableHeight(view0, v3);
                }
            }
        }
        else {
            v4 = y0.getMaxAvailableHeight(view0, v3, z);
        }
        int v5 = this.l;
        if(v5 == -1) {
            v6 = v4 + v2;
        }
        else {
            int v7 = this.m;
            switch(v7) {
                case -2: {
                    v8 = View.MeasureSpec.makeMeasureSpec(context0.getResources().getDisplayMetrics().widthPixels - (rect0.left + rect0.right), 0x80000000);
                    break;
                }
                case -1: {
                    v8 = View.MeasureSpec.makeMeasureSpec(context0.getResources().getDisplayMetrics().widthPixels - (rect0.left + rect0.right), 0x40000000);
                    break;
                }
                default: {
                    v8 = View.MeasureSpec.makeMeasureSpec(v7, 0x40000000);
                }
            }
            int v9 = this.k.a(v8, v4);
            if(v9 > 0) {
                int v10 = this.k.getPaddingTop();
                v11 = this.k.getPaddingBottom() + v10 + v2;
            }
            else {
                v11 = 0;
            }
            v6 = v9 + v11;
        }
        boolean z1 = this.G.getInputMethodMode() == 2;
        A.a0(y0, this.p);
        if(y0.isShowing()) {
            if(!this.w.isAttachedToWindow()) {
                return;
            }
            int v12 = this.m;
            if(v12 == -1) {
                v12 = -1;
            }
            else if(v12 == -2) {
                v12 = this.w.getWidth();
            }
            if(v5 == -1) {
                v5 = z1 ? v6 : -1;
                if(z1) {
                    y0.setWidth((this.m == -1 ? -1 : 0));
                    y0.setHeight(0);
                }
                else {
                    if(this.m == -1) {
                        v = -1;
                    }
                    y0.setWidth(v);
                    y0.setHeight(-1);
                }
            }
            else if(v5 == -2) {
                v5 = v6;
            }
            y0.setOutsideTouchable(true);
            y0.update(this.w, this.n, this.o, (v12 >= 0 ? v12 : -1), (v5 >= 0 ? v5 : -1));
            return;
        }
        int v13 = this.m;
        if(v13 == -1) {
            v13 = -1;
        }
        else if(v13 == -2) {
            v13 = this.w.getWidth();
        }
        if(v5 == -1) {
            v5 = -1;
        }
        else if(v5 == -2) {
            v5 = v6;
        }
        y0.setWidth(v13);
        y0.setHeight(v5);
        if(Build.VERSION.SDK_INT <= 28) {
            Method method1 = g0.H;
            if(method1 != null) {
                try {
                    method1.invoke(y0, Boolean.TRUE);
                }
                catch(Exception unused_ex) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        }
        else {
            S.g(y0);
        }
        y0.setOutsideTouchable(true);
        y0.setTouchInterceptor(this.z);
        if(this.s) {
            A.Z(y0, this.r);
        }
        if(Build.VERSION.SDK_INT <= 28) {
            Method method2 = g0.J;
            if(method2 != null) {
                try {
                    method2.invoke(y0, this.E);
                }
                catch(Exception exception0) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", exception0);
                }
            }
        }
        else {
            S.h(y0, this.E);
        }
        y0.showAsDropDown(this.w, this.n, this.o, this.t);
        this.k.setSelection(-1);
        if(!this.F || this.k.isInTouchMode()) {
            Y y2 = this.k;
            if(y2 != null) {
                y2.setListSelectionHidden(true);
                y2.requestLayout();
            }
        }
        if(!this.F) {
            this.C.post(this.B);
        }
    }

    public final void g(Drawable drawable0) {
        this.G.setBackgroundDrawable(drawable0);
    }

    @Override  // k.B
    public final Y h() {
        return this.k;
    }

    public final void i(int v) {
        this.o = v;
        this.q = true;
    }

    public final void l(int v) {
        this.n = v;
    }

    public final int n() {
        return this.q ? this.o : 0;
    }

    public void p(ListAdapter listAdapter0) {
        b b0 = this.v;
        if(b0 == null) {
            this.v = new b(this, 1);
        }
        else {
            ListAdapter listAdapter1 = this.j;
            if(listAdapter1 != null) {
                listAdapter1.unregisterDataSetObserver(b0);
            }
        }
        this.j = listAdapter0;
        if(listAdapter0 != null) {
            listAdapter0.registerDataSetObserver(this.v);
        }
        Y y0 = this.k;
        if(y0 != null) {
            y0.setAdapter(this.j);
        }
    }

    public Y q(Context context0, boolean z) {
        return new Y(context0, z);
    }

    public final void r(int v) {
        Drawable drawable0 = this.G.getBackground();
        if(drawable0 != null) {
            drawable0.getPadding(this.D);
            this.m = this.D.left + this.D.right + v;
            return;
        }
        this.m = v;
    }
}

