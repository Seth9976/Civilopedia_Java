package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import q.d;
import r.b;
import r.e;
import r.h;
import r.j;
import s.a;
import s.c;
import s.f;
import s.g;
import s.i;

public class ConstraintLayout extends ViewGroup {
    public final SparseArray i;
    public final ArrayList j;
    public final ArrayList k;
    public final e l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public final int r;
    public f s;
    public final int t;
    public HashMap u;
    public int v;
    public int w;

    public ConstraintLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        SparseArray sparseArray0 = new SparseArray();
        this.i = sparseArray0;
        this.j = new ArrayList(4);
        this.k = new ArrayList(100);
        e e0 = new e();  // 初始化器: Lr/d;-><init>()V
        e0.i0 = new ArrayList();
        e0.j0 = false;
        e0.k0 = new d();
        e0.m0 = 0;
        e0.n0 = 0;
        e0.o0 = new b[4];
        e0.p0 = new b[4];
        e0.q0 = new ArrayList();
        e0.r0 = false;
        e0.s0 = false;
        e0.t0 = false;
        e0.u0 = 0;
        e0.v0 = 0;
        e0.w0 = 7;
        e0.x0 = false;
        e0.y0 = false;
        e0.z0 = false;
        this.l = e0;
        this.m = 0;
        this.n = 0;
        this.o = 0x7FFFFFFF;
        this.p = 0x7FFFFFFF;
        this.q = true;
        this.r = 7;
        this.s = null;
        this.t = -1;
        this.u = new HashMap();
        this.v = -1;
        this.w = -1;
        e0.W = this;
        sparseArray0.put(this.getId(), this);
        this.s = null;
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, i.a);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                switch(typedArray0.getIndex(v1)) {
                    case 1: {
                        this.o = typedArray0.getDimensionPixelOffset(1, this.o);
                        break;
                    }
                    case 2: {
                        this.p = typedArray0.getDimensionPixelOffset(2, this.p);
                        break;
                    }
                    case 3: {
                        this.m = typedArray0.getDimensionPixelOffset(3, this.m);
                        break;
                    }
                    case 4: {
                        this.n = typedArray0.getDimensionPixelOffset(4, this.n);
                        break;
                    }
                    case 8: {
                        int v2 = typedArray0.getResourceId(8, 0);
                        try {
                            f f0 = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
                            f0.a = new HashMap();
                            this.s = f0;
                            f0.c(this.getContext(), v2);
                        }
                        catch(Resources.NotFoundException unused_ex) {
                            this.s = null;
                        }
                        this.t = v2;
                        break;
                    }
                    case 59: {
                        this.r = typedArray0.getInt(59, this.r);
                    }
                }
            }
            typedArray0.recycle();
        }
        e0.w0 = this.r;
    }

    public static s.d a() {
        s.d d0 = new s.d(-2, -2);  // 初始化器: Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V
        d0.a = -1;
        d0.b = -1;
        d0.c = -1.0f;
        d0.d = -1;
        d0.e = -1;
        d0.f = -1;
        d0.g = -1;
        d0.h = -1;
        d0.i = -1;
        d0.j = -1;
        d0.k = -1;
        d0.l = -1;
        d0.m = -1;
        d0.n = 0;
        d0.o = 0.0f;
        d0.p = -1;
        d0.q = -1;
        d0.r = -1;
        d0.s = -1;
        d0.t = -1;
        d0.u = -1;
        d0.v = -1;
        d0.w = -1;
        d0.x = -1;
        d0.y = -1;
        d0.z = 0.5f;
        d0.A = 0.5f;
        d0.B = null;
        d0.C = 1;
        d0.D = -1.0f;
        d0.E = -1.0f;
        d0.F = 0;
        d0.G = 0;
        d0.H = 0;
        d0.I = 0;
        d0.J = 0;
        d0.K = 0;
        d0.L = 0;
        d0.M = 0;
        d0.N = 1.0f;
        d0.O = 1.0f;
        d0.P = -1;
        d0.Q = -1;
        d0.R = -1;
        d0.S = false;
        d0.T = false;
        d0.U = true;
        d0.V = true;
        d0.W = false;
        d0.X = false;
        d0.Y = false;
        d0.Z = -1;
        d0.a0 = -1;
        d0.b0 = -1;
        d0.c0 = -1;
        d0.d0 = -1;
        d0.e0 = -1;
        d0.f0 = 0.5f;
        d0.j0 = new r.d();
        return d0;
    }

    public final r.d b(int v) {
        r.d d0 = this.l;
        if(v == 0) {
            return d0;
        }
        View view0 = (View)this.i.get(v);
        if(view0 == null) {
            view0 = this.findViewById(v);
            if(view0 != null && view0 != this && view0.getParent() == this) {
                this.onViewAdded(view0);
            }
        }
        if(view0 == this) {
            return d0;
        }
        return view0 == null ? null : ((s.d)view0.getLayoutParams()).j0;
    }

    public final r.d c(View view0) {
        if(view0 == this) {
            return this.l;
        }
        return view0 == null ? null : ((s.d)view0.getLayoutParams()).j0;
    }

    @Override  // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof s.d;
    }

    public final void d(int v, int v1) {
        e e1;
        View view2;
        int v23;
        boolean z3;
        int v21;
        int v20;
        int v18;
        int v16;
        int v2 = this.getPaddingTop();
        int v3 = this.getPaddingBottom() + v2;
        int v4 = this.getPaddingLeft();
        int v5 = this.getPaddingRight() + v4;
        int v6 = this.getChildCount();
        for(int v7 = 0; v7 < v6; ++v7) {
            View view0 = this.getChildAt(v7);
            if(view0.getVisibility() != 8) {
                s.d d0 = (s.d)view0.getLayoutParams();
                r.d d1 = d0.j0;
                if(!d0.X && !d0.Y) {
                    d1.X = view0.getVisibility();
                    int v8 = d0.width;
                    int v9 = d0.height;
                    if(v8 == 0 || v9 == 0) {
                        d1.j().c();
                        d1.i().c();
                    }
                    else {
                        view0.measure(ViewGroup.getChildMeasureSpec(v, v5, v8), ViewGroup.getChildMeasureSpec(v1, v3, v9));
                        int v10 = view0.getMeasuredWidth();
                        int v11 = view0.getMeasuredHeight();
                        d1.x(v10);
                        d1.s(v11);
                        if(v8 == -2) {
                            d1.S = v10;
                        }
                        if(v9 == -2) {
                            d1.T = v11;
                        }
                        if(d0.W) {
                            int v12 = view0.getBaseline();
                            if(v12 != -1) {
                                d1.P = v12;
                            }
                        }
                        if(d0.U && d0.V) {
                            d1.j().g(v10);
                            d1.i().g(v11);
                        }
                    }
                }
            }
        }
        e e0 = this.l;
        e0.E();
        int v13 = 0;
        while(v13 < v6) {
            View view1 = this.getChildAt(v13);
            if(view1.getVisibility() == 8) {
                e1 = e0;
                v16 = v13;
            }
            else {
                s.d d2 = (s.d)view1.getLayoutParams();
                r.d d3 = d2.j0;
                if(d2.X || d2.Y) {
                    e1 = e0;
                    v16 = v13;
                }
                else {
                    d3.X = view1.getVisibility();
                    int v14 = d2.width;
                    int v15 = d2.height;
                    if(v14 != 0 && v15 != 0) {
                        e1 = e0;
                        v16 = v13;
                    }
                    else {
                        r.i i0 = d3.f(2).a;
                        r.i i1 = d3.f(4).a;
                        boolean z = d3.f(2).d != null && d3.f(4).d != null;
                        r.i i2 = d3.f(3).a;
                        v16 = v13;
                        r.i i3 = d3.f(5).a;
                        boolean z1 = d3.f(3).d != null && d3.f(5).d != null;
                        if(v14 != 0 || v15 != 0 || !z || !z1) {
                            e1 = e0;
                            int v17 = e0.h0[0] == 2 ? 0 : 1;
                            boolean z2 = e0.h0[1] != 2;
                            if(v17 == 0) {
                                d3.j().c();
                            }
                            if(!z2) {
                                d3.i().c();
                            }
                            int[] arr_v = d3.h0;
                            if(v14 == 0) {
                                if(v17 != 0 && d3.e == 0 && d3.F == 0.0f && d3.h == 0 && d3.i == 0) {
                                    v18 = v17;
                                    if(arr_v[0] == 3 && z && i0.d() && i1.d()) {
                                        int v19 = (int)(i1.g - i0.g);
                                        d3.j().g(v19);
                                        v20 = ViewGroup.getChildMeasureSpec(v, v5, v19);
                                        v21 = 0;
                                        goto label_88;
                                    }
                                }
                                v20 = ViewGroup.getChildMeasureSpec(v, v5, -2);
                                v21 = 1;
                                v18 = 0;
                            }
                            else {
                                v18 = v17;
                                if(v14 == -1) {
                                    v20 = ViewGroup.getChildMeasureSpec(v, v5, -1);
                                    v21 = 0;
                                }
                                else {
                                    v21 = v14 == -2 ? 1 : 0;
                                    v20 = ViewGroup.getChildMeasureSpec(v, v5, v14);
                                }
                            }
                        label_88:
                            if(v15 == 0) {
                                if(!z2 || d3.f != 0 || d3.F != 0.0f || d3.k != 0 || d3.l != 0 || arr_v[1] != 3 || !z1 || !i2.d() || !i3.d()) {
                                    v23 = ViewGroup.getChildMeasureSpec(v1, v3, -2);
                                    view2 = view1;
                                    z3 = true;
                                    z2 = false;
                                    goto label_112;
                                }
                                else {
                                    int v22 = (int)(i3.g - i2.g);
                                    d3.i().g(v22);
                                    v23 = ViewGroup.getChildMeasureSpec(v1, v3, v22);
                                    view2 = view1;
                                    goto label_111;
                                }
                                goto label_100;
                            }
                            else {
                            label_100:
                                switch(v15) {
                                    case -2: {
                                        z3 = true;
                                        v23 = ViewGroup.getChildMeasureSpec(v1, v3, -2);
                                        view2 = view1;
                                        goto label_112;
                                    }
                                    case -1: {
                                        v23 = ViewGroup.getChildMeasureSpec(v1, v3, -1);
                                        view2 = view1;
                                        break;
                                    }
                                    default: {
                                        z3 = false;
                                        v23 = ViewGroup.getChildMeasureSpec(v1, v3, v15);
                                        view2 = view1;
                                        goto label_112;
                                    }
                                }
                            }
                        label_111:
                            z3 = false;
                        label_112:
                            view2.measure(v20, v23);
                            int v24 = view2.getMeasuredWidth();
                            int v25 = view2.getMeasuredHeight();
                            d3.x(v24);
                            d3.s(v25);
                            if(v21 != 0) {
                                d3.S = v24;
                            }
                            if(z3) {
                                d3.T = v25;
                            }
                            if(v18 == 0) {
                                d3.j().b = 2;
                            }
                            else {
                                d3.j().g(v24);
                            }
                            if(z2) {
                                d3.i().g(v25);
                            }
                            else {
                                d3.i().b = 2;
                            }
                            if(d2.W) {
                                int v26 = view2.getBaseline();
                                if(v26 != -1) {
                                    d3.P = v26;
                                }
                            }
                        }
                        else {
                            e1 = e0;
                        }
                    }
                }
            }
            v13 = v16 + 1;
            e0 = e1;
        }
    }

    @Override  // android.view.ViewGroup
    public final void dispatchDraw(Canvas canvas0) {
        super.dispatchDraw(canvas0);
        if(this.isInEditMode()) {
            int v = this.getChildCount();
            float f = (float)this.getWidth();
            float f1 = (float)this.getHeight();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = this.getChildAt(v1);
                if(view0.getVisibility() != 8) {
                    Object object0 = view0.getTag();
                    if(object0 != null && object0 instanceof String) {
                        String[] arr_s = ((String)object0).split(",");
                        if(arr_s.length == 4) {
                            int v2 = Integer.parseInt(arr_s[0]);
                            int v3 = Integer.parseInt(arr_s[1]);
                            int v4 = Integer.parseInt(arr_s[2]);
                            int v5 = (int)(((float)v2) / 1080.0f * f);
                            int v6 = (int)(((float)v3) / 1920.0f * f1);
                            int v7 = (int)(((float)Integer.parseInt(arr_s[3])) / 1920.0f * f1);
                            Paint paint0 = new Paint();
                            paint0.setColor(0xFFFF0000);
                            float f2 = (float)(v5 + ((int)(((float)v4) / 1080.0f * f)));
                            canvas0.drawLine(((float)v5), ((float)v6), f2, ((float)v6), paint0);
                            float f3 = (float)(v6 + v7);
                            canvas0.drawLine(f2, ((float)v6), f2, f3, paint0);
                            canvas0.drawLine(f2, f3, ((float)v5), f3, paint0);
                            canvas0.drawLine(((float)v5), f3, ((float)v5), ((float)v6), paint0);
                            paint0.setColor(0xFF00FF00);
                            canvas0.drawLine(((float)v5), ((float)v6), f2, f3, paint0);
                            canvas0.drawLine(((float)v5), f3, f2, ((float)v6), paint0);
                        }
                    }
                }
            }
        }
    }

    public final void e(String s, Integer integer0) {
        if(s instanceof String) {
            if(this.u == null) {
                this.u = new HashMap();
            }
            int v = s.indexOf("/");
            if(v != -1) {
                s = s.substring(v + 1);
            }
            this.u.put(s, integer0);
        }
    }

    @Override  // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return ConstraintLayout.a();
    }

    @Override  // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        int v21;
        Context context0 = this.getContext();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = new s.d(context0, attributeSet0);  // 初始化器: Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
        viewGroup$LayoutParams0.a = -1;
        viewGroup$LayoutParams0.b = -1;
        viewGroup$LayoutParams0.c = -1.0f;
        viewGroup$LayoutParams0.d = -1;
        viewGroup$LayoutParams0.e = -1;
        viewGroup$LayoutParams0.f = -1;
        viewGroup$LayoutParams0.g = -1;
        viewGroup$LayoutParams0.h = -1;
        viewGroup$LayoutParams0.i = -1;
        viewGroup$LayoutParams0.j = -1;
        viewGroup$LayoutParams0.k = -1;
        viewGroup$LayoutParams0.l = -1;
        viewGroup$LayoutParams0.m = -1;
        viewGroup$LayoutParams0.n = 0;
        viewGroup$LayoutParams0.o = 0.0f;
        viewGroup$LayoutParams0.p = -1;
        viewGroup$LayoutParams0.q = -1;
        viewGroup$LayoutParams0.r = -1;
        viewGroup$LayoutParams0.s = -1;
        viewGroup$LayoutParams0.t = -1;
        viewGroup$LayoutParams0.u = -1;
        viewGroup$LayoutParams0.v = -1;
        viewGroup$LayoutParams0.w = -1;
        viewGroup$LayoutParams0.x = -1;
        viewGroup$LayoutParams0.y = -1;
        viewGroup$LayoutParams0.z = 0.5f;
        viewGroup$LayoutParams0.A = 0.5f;
        viewGroup$LayoutParams0.B = null;
        viewGroup$LayoutParams0.C = 1;
        viewGroup$LayoutParams0.D = -1.0f;
        viewGroup$LayoutParams0.E = -1.0f;
        viewGroup$LayoutParams0.F = 0;
        viewGroup$LayoutParams0.G = 0;
        viewGroup$LayoutParams0.H = 0;
        viewGroup$LayoutParams0.I = 0;
        viewGroup$LayoutParams0.J = 0;
        viewGroup$LayoutParams0.K = 0;
        viewGroup$LayoutParams0.L = 0;
        viewGroup$LayoutParams0.M = 0;
        viewGroup$LayoutParams0.N = 1.0f;
        viewGroup$LayoutParams0.O = 1.0f;
        viewGroup$LayoutParams0.P = -1;
        viewGroup$LayoutParams0.Q = -1;
        viewGroup$LayoutParams0.R = -1;
        viewGroup$LayoutParams0.S = false;
        viewGroup$LayoutParams0.T = false;
        viewGroup$LayoutParams0.U = true;
        viewGroup$LayoutParams0.V = true;
        viewGroup$LayoutParams0.W = false;
        viewGroup$LayoutParams0.X = false;
        viewGroup$LayoutParams0.Y = false;
        viewGroup$LayoutParams0.Z = -1;
        viewGroup$LayoutParams0.a0 = -1;
        viewGroup$LayoutParams0.b0 = -1;
        viewGroup$LayoutParams0.c0 = -1;
        viewGroup$LayoutParams0.d0 = -1;
        viewGroup$LayoutParams0.e0 = -1;
        viewGroup$LayoutParams0.f0 = 0.5f;
        viewGroup$LayoutParams0.j0 = new r.d();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, i.a);
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            switch(c.a.get(v2)) {
                case 1: {
                    viewGroup$LayoutParams0.R = typedArray0.getInt(v2, viewGroup$LayoutParams0.R);
                    break;
                }
                case 2: {
                    int v3 = typedArray0.getResourceId(v2, viewGroup$LayoutParams0.m);
                    viewGroup$LayoutParams0.m = v3;
                    if(v3 == -1) {
                        viewGroup$LayoutParams0.m = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 3: {
                    viewGroup$LayoutParams0.n = typedArray0.getDimensionPixelSize(v2, viewGroup$LayoutParams0.n);
                    break;
                }
                case 4: {
                    float f = typedArray0.getFloat(v2, viewGroup$LayoutParams0.o) % 360.0f;
                    viewGroup$LayoutParams0.o = f;
                    if(f < 0.0f) {
                        viewGroup$LayoutParams0.o = (360.0f - f) % 360.0f;
                    }
                    break;
                }
                case 5: {
                    viewGroup$LayoutParams0.a = typedArray0.getDimensionPixelOffset(v2, viewGroup$LayoutParams0.a);
                    break;
                }
                case 6: {
                    viewGroup$LayoutParams0.b = typedArray0.getDimensionPixelOffset(v2, viewGroup$LayoutParams0.b);
                    break;
                }
                case 7: {
                    viewGroup$LayoutParams0.c = typedArray0.getFloat(v2, viewGroup$LayoutParams0.c);
                    break;
                }
                case 8: {
                    int v4 = typedArray0.getResourceId(v2, viewGroup$LayoutParams0.d);
                    viewGroup$LayoutParams0.d = v4;
                    if(v4 == -1) {
                        viewGroup$LayoutParams0.d = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 9: {
                    int v5 = typedArray0.getResourceId(v2, viewGroup$LayoutParams0.e);
                    viewGroup$LayoutParams0.e = v5;
                    if(v5 == -1) {
                        viewGroup$LayoutParams0.e = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 10: {
                    int v6 = typedArray0.getResourceId(v2, viewGroup$LayoutParams0.f);
                    viewGroup$LayoutParams0.f = v6;
                    if(v6 == -1) {
                        viewGroup$LayoutParams0.f = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 11: {
                    int v7 = typedArray0.getResourceId(v2, viewGroup$LayoutParams0.g);
                    viewGroup$LayoutParams0.g = v7;
                    if(v7 == -1) {
                        viewGroup$LayoutParams0.g = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 12: {
                    int v8 = typedArray0.getResourceId(v2, viewGroup$LayoutParams0.h);
                    viewGroup$LayoutParams0.h = v8;
                    if(v8 == -1) {
                        viewGroup$LayoutParams0.h = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 13: {
                    int v9 = typedArray0.getResourceId(v2, viewGroup$LayoutParams0.i);
                    viewGroup$LayoutParams0.i = v9;
                    if(v9 == -1) {
                        viewGroup$LayoutParams0.i = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 14: {
                    int v10 = typedArray0.getResourceId(v2, viewGroup$LayoutParams0.j);
                    viewGroup$LayoutParams0.j = v10;
                    if(v10 == -1) {
                        viewGroup$LayoutParams0.j = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 15: {
                    int v11 = typedArray0.getResourceId(v2, viewGroup$LayoutParams0.k);
                    viewGroup$LayoutParams0.k = v11;
                    if(v11 == -1) {
                        viewGroup$LayoutParams0.k = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 16: {
                    int v12 = typedArray0.getResourceId(v2, viewGroup$LayoutParams0.l);
                    viewGroup$LayoutParams0.l = v12;
                    if(v12 == -1) {
                        viewGroup$LayoutParams0.l = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 17: {
                    int v13 = typedArray0.getResourceId(v2, viewGroup$LayoutParams0.p);
                    viewGroup$LayoutParams0.p = v13;
                    if(v13 == -1) {
                        viewGroup$LayoutParams0.p = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 18: {
                    int v14 = typedArray0.getResourceId(v2, viewGroup$LayoutParams0.q);
                    viewGroup$LayoutParams0.q = v14;
                    if(v14 == -1) {
                        viewGroup$LayoutParams0.q = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 19: {
                    int v15 = typedArray0.getResourceId(v2, viewGroup$LayoutParams0.r);
                    viewGroup$LayoutParams0.r = v15;
                    if(v15 == -1) {
                        viewGroup$LayoutParams0.r = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 20: {
                    int v16 = typedArray0.getResourceId(v2, viewGroup$LayoutParams0.s);
                    viewGroup$LayoutParams0.s = v16;
                    if(v16 == -1) {
                        viewGroup$LayoutParams0.s = typedArray0.getInt(v2, -1);
                    }
                    break;
                }
                case 21: {
                    viewGroup$LayoutParams0.t = typedArray0.getDimensionPixelSize(v2, viewGroup$LayoutParams0.t);
                    break;
                }
                case 22: {
                    viewGroup$LayoutParams0.u = typedArray0.getDimensionPixelSize(v2, viewGroup$LayoutParams0.u);
                    break;
                }
                case 23: {
                    viewGroup$LayoutParams0.v = typedArray0.getDimensionPixelSize(v2, viewGroup$LayoutParams0.v);
                    break;
                }
                case 24: {
                    viewGroup$LayoutParams0.w = typedArray0.getDimensionPixelSize(v2, viewGroup$LayoutParams0.w);
                    break;
                }
                case 25: {
                    viewGroup$LayoutParams0.x = typedArray0.getDimensionPixelSize(v2, viewGroup$LayoutParams0.x);
                    break;
                }
                case 26: {
                    viewGroup$LayoutParams0.y = typedArray0.getDimensionPixelSize(v2, viewGroup$LayoutParams0.y);
                    break;
                }
                case 27: {
                    viewGroup$LayoutParams0.S = typedArray0.getBoolean(v2, viewGroup$LayoutParams0.S);
                    break;
                }
                case 28: {
                    viewGroup$LayoutParams0.T = typedArray0.getBoolean(v2, viewGroup$LayoutParams0.T);
                    break;
                }
                case 29: {
                    viewGroup$LayoutParams0.z = typedArray0.getFloat(v2, viewGroup$LayoutParams0.z);
                    break;
                }
                case 30: {
                    viewGroup$LayoutParams0.A = typedArray0.getFloat(v2, viewGroup$LayoutParams0.A);
                    break;
                }
                case 0x1F: {
                    int v17 = typedArray0.getInt(v2, 0);
                    viewGroup$LayoutParams0.H = v17;
                    if(v17 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                }
                case 0x20: {
                    int v18 = typedArray0.getInt(v2, 0);
                    viewGroup$LayoutParams0.I = v18;
                    if(v18 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                }
                case 33: {
                    try {
                        viewGroup$LayoutParams0.J = typedArray0.getDimensionPixelSize(v2, viewGroup$LayoutParams0.J);
                    }
                    catch(Exception unused_ex) {
                        if(typedArray0.getInt(v2, viewGroup$LayoutParams0.J) == -2) {
                            viewGroup$LayoutParams0.J = -2;
                        }
                    }
                    break;
                }
                case 34: {
                    try {
                        viewGroup$LayoutParams0.L = typedArray0.getDimensionPixelSize(v2, viewGroup$LayoutParams0.L);
                    }
                    catch(Exception unused_ex) {
                        if(typedArray0.getInt(v2, viewGroup$LayoutParams0.L) == -2) {
                            viewGroup$LayoutParams0.L = -2;
                        }
                    }
                    break;
                }
                case 35: {
                    viewGroup$LayoutParams0.N = Math.max(0.0f, typedArray0.getFloat(v2, viewGroup$LayoutParams0.N));
                    break;
                }
                case 36: {
                    try {
                        viewGroup$LayoutParams0.K = typedArray0.getDimensionPixelSize(v2, viewGroup$LayoutParams0.K);
                    }
                    catch(Exception unused_ex) {
                        if(typedArray0.getInt(v2, viewGroup$LayoutParams0.K) == -2) {
                            viewGroup$LayoutParams0.K = -2;
                        }
                    }
                    break;
                }
                case 37: {
                    try {
                        viewGroup$LayoutParams0.M = typedArray0.getDimensionPixelSize(v2, viewGroup$LayoutParams0.M);
                    }
                    catch(Exception unused_ex) {
                        if(typedArray0.getInt(v2, viewGroup$LayoutParams0.M) == -2) {
                            viewGroup$LayoutParams0.M = -2;
                        }
                    }
                    break;
                }
                case 38: {
                    viewGroup$LayoutParams0.O = Math.max(0.0f, typedArray0.getFloat(v2, viewGroup$LayoutParams0.O));
                    break;
                }
                case 44: {
                    String s = typedArray0.getString(v2);
                    viewGroup$LayoutParams0.B = s;
                    viewGroup$LayoutParams0.C = -1;
                    if(s != null) {
                        int v19 = s.length();
                        int v20 = viewGroup$LayoutParams0.B.indexOf(44);
                        if(v20 <= 0 || v20 >= v19 - 1) {
                            v21 = 0;
                        }
                        else {
                            String s1 = viewGroup$LayoutParams0.B.substring(0, v20);
                            if(s1.equalsIgnoreCase("W")) {
                                viewGroup$LayoutParams0.C = 0;
                            }
                            else if(s1.equalsIgnoreCase("H")) {
                                viewGroup$LayoutParams0.C = 1;
                            }
                            v21 = v20 + 1;
                        }
                        int v22 = viewGroup$LayoutParams0.B.indexOf(58);
                        if(v22 < 0 || v22 >= v19 - 1) {
                            String s4 = viewGroup$LayoutParams0.B.substring(v21);
                            if(s4.length() > 0) {
                                try {
                                    Float.parseFloat(s4);
                                }
                                catch(NumberFormatException unused_ex) {
                                }
                            }
                        }
                        else {
                            String s2 = viewGroup$LayoutParams0.B.substring(v21, v22);
                            String s3 = viewGroup$LayoutParams0.B.substring(v22 + 1);
                            if(s2.length() > 0 && s3.length() > 0) {
                                try {
                                    float f1 = Float.parseFloat(s2);
                                    float f2 = Float.parseFloat(s3);
                                    if(f1 > 0.0f && f2 > 0.0f) {
                                        if(viewGroup$LayoutParams0.C == 1) {
                                            float f3 = f2 / f1;
                                        }
                                        else {
                                            float f4 = f1 / f2;
                                        }
                                    }
                                }
                                catch(NumberFormatException unused_ex) {
                                }
                            }
                        }
                    }
                    break;
                }
                case 45: {
                    viewGroup$LayoutParams0.D = typedArray0.getFloat(v2, viewGroup$LayoutParams0.D);
                    break;
                }
                case 46: {
                    viewGroup$LayoutParams0.E = typedArray0.getFloat(v2, viewGroup$LayoutParams0.E);
                    break;
                }
                case 0x2F: {
                    viewGroup$LayoutParams0.F = typedArray0.getInt(v2, 0);
                    break;
                }
                case 0x30: {
                    viewGroup$LayoutParams0.G = typedArray0.getInt(v2, 0);
                    break;
                }
                case 49: {
                    viewGroup$LayoutParams0.P = typedArray0.getDimensionPixelOffset(v2, viewGroup$LayoutParams0.P);
                    break;
                }
                case 50: {
                    viewGroup$LayoutParams0.Q = typedArray0.getDimensionPixelOffset(v2, viewGroup$LayoutParams0.Q);
                }
            }
        }
        typedArray0.recycle();
        ((s.d)viewGroup$LayoutParams0).a();
        return viewGroup$LayoutParams0;
    }

    @Override  // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams1 = new s.d(viewGroup$LayoutParams0);  // 初始化器: Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
        viewGroup$LayoutParams1.a = -1;
        viewGroup$LayoutParams1.b = -1;
        viewGroup$LayoutParams1.c = -1.0f;
        viewGroup$LayoutParams1.d = -1;
        viewGroup$LayoutParams1.e = -1;
        viewGroup$LayoutParams1.f = -1;
        viewGroup$LayoutParams1.g = -1;
        viewGroup$LayoutParams1.h = -1;
        viewGroup$LayoutParams1.i = -1;
        viewGroup$LayoutParams1.j = -1;
        viewGroup$LayoutParams1.k = -1;
        viewGroup$LayoutParams1.l = -1;
        viewGroup$LayoutParams1.m = -1;
        viewGroup$LayoutParams1.n = 0;
        viewGroup$LayoutParams1.o = 0.0f;
        viewGroup$LayoutParams1.p = -1;
        viewGroup$LayoutParams1.q = -1;
        viewGroup$LayoutParams1.r = -1;
        viewGroup$LayoutParams1.s = -1;
        viewGroup$LayoutParams1.t = -1;
        viewGroup$LayoutParams1.u = -1;
        viewGroup$LayoutParams1.v = -1;
        viewGroup$LayoutParams1.w = -1;
        viewGroup$LayoutParams1.x = -1;
        viewGroup$LayoutParams1.y = -1;
        viewGroup$LayoutParams1.z = 0.5f;
        viewGroup$LayoutParams1.A = 0.5f;
        viewGroup$LayoutParams1.B = null;
        viewGroup$LayoutParams1.C = 1;
        viewGroup$LayoutParams1.D = -1.0f;
        viewGroup$LayoutParams1.E = -1.0f;
        viewGroup$LayoutParams1.F = 0;
        viewGroup$LayoutParams1.G = 0;
        viewGroup$LayoutParams1.H = 0;
        viewGroup$LayoutParams1.I = 0;
        viewGroup$LayoutParams1.J = 0;
        viewGroup$LayoutParams1.K = 0;
        viewGroup$LayoutParams1.L = 0;
        viewGroup$LayoutParams1.M = 0;
        viewGroup$LayoutParams1.N = 1.0f;
        viewGroup$LayoutParams1.O = 1.0f;
        viewGroup$LayoutParams1.P = -1;
        viewGroup$LayoutParams1.Q = -1;
        viewGroup$LayoutParams1.R = -1;
        viewGroup$LayoutParams1.S = false;
        viewGroup$LayoutParams1.T = false;
        viewGroup$LayoutParams1.U = true;
        viewGroup$LayoutParams1.V = true;
        viewGroup$LayoutParams1.W = false;
        viewGroup$LayoutParams1.X = false;
        viewGroup$LayoutParams1.Y = false;
        viewGroup$LayoutParams1.Z = -1;
        viewGroup$LayoutParams1.a0 = -1;
        viewGroup$LayoutParams1.b0 = -1;
        viewGroup$LayoutParams1.c0 = -1;
        viewGroup$LayoutParams1.d0 = -1;
        viewGroup$LayoutParams1.e0 = -1;
        viewGroup$LayoutParams1.f0 = 0.5f;
        viewGroup$LayoutParams1.j0 = new r.d();
        return viewGroup$LayoutParams1;
    }

    public int getMaxHeight() {
        return this.p;
    }

    public int getMaxWidth() {
        return this.o;
    }

    public int getMinHeight() {
        return this.n;
    }

    public int getMinWidth() {
        return this.m;
    }

    public int getOptimizationLevel() {
        return this.l.w0;
    }

    @Override  // android.view.ViewGroup
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4 = this.getChildCount();
        boolean z1 = this.isInEditMode();
        for(int v6 = 0; v6 < v4; ++v6) {
            View view0 = this.getChildAt(v6);
            s.d d0 = (s.d)view0.getLayoutParams();
            r.d d1 = d0.j0;
            if(view0.getVisibility() != 8 || d0.X || d0.Y || z1) {
                int v7 = d1.L + d1.N;
                int v8 = d1.M + d1.O;
                view0.layout(v7, v8, d1.k() + v7, d1.g() + v8);
            }
        }
        ArrayList arrayList0 = this.j;
        int v9 = arrayList0.size();
        if(v9 > 0) {
            for(int v5 = 0; v5 < v9; ++v5) {
                ((s.b)arrayList0.get(v5)).getClass();
            }
        }
    }

    @Override  // android.view.View
    public final void onMeasure(int v, int v1) {
        int v118;
        int v117;
        ArrayList arrayList4;
        int v109;
        int v108;
        int v99;
        int v97;
        int v96;
        int v94;
        boolean z4;
        boolean z3;
        int v86;
        int v85;
        int v84;
        int v83;
        int v81;
        int v73;
        boolean z1;
        float f8;
        int v69;
        int v68;
        s.d d8;
        float f4;
        int v59;
        int v58;
        int v57;
        int v49;
        int v41;
        int v40;
        int v39;
        int v38;
        int v32;
        int v31;
        int v30;
        int v28;
        int v27;
        Resources resources0;
        int v25;
        int v17;
        int v16;
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getSize(v);
        int v4 = View.MeasureSpec.getMode(v1);
        int v5 = View.MeasureSpec.getSize(v1);
        int v6 = this.getPaddingLeft();
        int v7 = this.getPaddingTop();
        e e0 = this.l;
        e0.H = v6;
        e0.I = v7;
        e0.q[0] = this.o;
        e0.q[1] = this.p;
        e0.j0 = this.getLayoutDirection() == 1;
        int v8 = View.MeasureSpec.getMode(v);
        int v9 = View.MeasureSpec.getSize(v);
        int v10 = View.MeasureSpec.getMode(v1);
        int v11 = View.MeasureSpec.getSize(v1);
        int v12 = this.getPaddingTop();
        int v13 = this.getPaddingBottom();
        int v14 = this.getPaddingLeft();
        int v15 = this.getPaddingRight();
        this.getLayoutParams();
        switch(v8) {
            case 0x80000000: {
                v16 = 2;
                break;
            }
            case 0: {
                v16 = 2;
                v9 = 0;
                break;
            }
            case 0x40000000: {
                v9 = Math.min(this.o, v9) - (v15 + v14);
                v16 = 1;
                break;
            }
            default: {
                v16 = 1;
                v9 = 0;
            }
        }
        switch(v10) {
            case 0x80000000: {
                v17 = 2;
                break;
            }
            case 0: {
                v17 = 2;
                v11 = 0;
                break;
            }
            case 0x40000000: {
                v11 = Math.min(this.p, v11) - (v13 + v12);
                v17 = 1;
                break;
            }
            default: {
                v17 = 1;
                v11 = 0;
            }
        }
        e0.Q = 0;
        e0.R = 0;
        e0.t(v16);
        e0.x(v9);
        e0.w(v17);
        e0.s(v11);
        int v18 = this.m - this.getPaddingLeft() - this.getPaddingRight();
        e0.Q = v18 < 0 ? 0 : v18;
        int v19 = this.n - this.getPaddingTop() - this.getPaddingBottom();
        e0.R = v19 < 0 ? 0 : v19;
        int v20 = e0.k();
        int v21 = e0.g();
        ArrayList arrayList0 = this.j;
        ArrayList arrayList1 = this.k;
        if(this.q) {
            this.q = false;
            int v22 = this.getChildCount();
            int v23 = 0;
            while(true) {
                if(v23 >= v22) {
                    v39 = v2;
                    v40 = v3;
                    v30 = v4;
                    v31 = v5;
                    v25 = v6;
                    v32 = v7;
                    v41 = v21;
                    break;
                }
                if(this.getChildAt(v23).isLayoutRequested()) {
                    arrayList1.clear();
                    boolean z = this.isInEditMode();
                    int v24 = this.getChildCount();
                    if(z) {
                        v25 = v6;
                        int v26 = 0;
                        while(v26 < v24) {
                            View view0 = this.getChildAt(v26);
                            try {
                                resources0 = this.getResources();
                                v27 = v5;
                            }
                            catch(Resources.NotFoundException unused_ex) {
                                v28 = v4;
                                v27 = v5;
                                goto label_91;
                            }
                            try {
                                String s = resources0.getResourceName(view0.getId());
                                this.e(s, view0.getId());
                                v28 = v4;
                                int v29 = s.indexOf(0x2F);
                                v28 = v4;
                                if(v29 != -1) {
                                    s = s.substring(v29 + 1);
                                }
                                this.b(view0.getId()).Y = s;
                            }
                            catch(Resources.NotFoundException unused_ex) {
                            }
                        label_91:
                            ++v26;
                            v5 = v27;
                            v4 = v28;
                        }
                        v30 = v4;
                        v31 = v5;
                    }
                    else {
                        v30 = v4;
                        v31 = v5;
                        v25 = v6;
                    }
                    v32 = v7;
                    for(int v33 = 0; v33 < v24; ++v33) {
                        r.d d0 = this.c(this.getChildAt(v33));
                        if(d0 != null) {
                            d0.o();
                        }
                    }
                    if(this.t != -1) {
                        for(int v34 = 0; v34 < v24; ++v34) {
                            this.getChildAt(v34).getId();
                        }
                    }
                    f f0 = this.s;
                    if(f0 == null) {
                        v39 = v2;
                        v40 = v3;
                        v41 = v21;
                    }
                    else {
                        int v35 = this.getChildCount();
                        HashMap hashMap0 = f0.a;
                        HashSet hashSet0 = new HashSet(hashMap0.keySet());
                        int v36 = 0;
                        while(v36 < v35) {
                            View view1 = this.getChildAt(v36);
                            int v37 = view1.getId();
                            if(v37 == -1) {
                                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                            }
                            if(hashMap0.containsKey(v37)) {
                                hashSet0.remove(v37);
                                s.e e1 = (s.e)hashMap0.get(v37);
                                if(view1 instanceof a) {
                                    e1.p0 = 1;
                                }
                                v38 = v21;
                                if(e1.p0 != -1 && e1.p0 == 1) {
                                    ((a)view1).setId(v37);
                                    ((a)view1).setType(e1.o0);
                                    ((a)view1).setAllowsGoneWidget(e1.n0);
                                    int[] arr_v = e1.q0;
                                    if(arr_v == null) {
                                        String s1 = e1.r0;
                                        if(s1 != null) {
                                            int[] arr_v1 = f.a(((a)view1), s1);
                                            e1.q0 = arr_v1;
                                            ((a)view1).setReferencedIds(arr_v1);
                                        }
                                    }
                                    else {
                                        ((a)view1).setReferencedIds(arr_v);
                                    }
                                }
                                s.d d1 = (s.d)view1.getLayoutParams();
                                e1.a(d1);
                                view1.setLayoutParams(d1);
                                view1.setVisibility(e1.J);
                                view1.setAlpha(e1.U);
                                view1.setRotation(e1.X);
                                view1.setRotationX(e1.Y);
                                view1.setRotationY(e1.Z);
                                view1.setScaleX(e1.a0);
                                view1.setScaleY(e1.b0);
                                if(!Float.isNaN(e1.c0)) {
                                    view1.setPivotX(e1.c0);
                                }
                                if(!Float.isNaN(e1.d0)) {
                                    view1.setPivotY(e1.d0);
                                }
                                view1.setTranslationX(e1.e0);
                                view1.setTranslationY(e1.f0);
                                view1.setTranslationZ(e1.g0);
                                if(e1.V) {
                                    view1.setElevation(e1.W);
                                }
                            }
                            else {
                                v38 = v21;
                            }
                            ++v36;
                            v21 = v38;
                        }
                        v39 = v2;
                        v40 = v3;
                        v41 = v21;
                        for(Object object0: hashSet0) {
                            Integer integer0 = (Integer)object0;
                            s.e e2 = (s.e)hashMap0.get(integer0);
                            if(e2.p0 != -1 && e2.p0 == 1) {
                                Context context0 = this.getContext();
                                a a0 = new a(context0);  // 初始化器: Landroid/view/View;-><init>(Landroid/content/Context;)V
                                a0.i = new int[0x20];
                                a0.k = context0;
                                r.a a1 = new r.a();  // 初始化器: Lr/d;-><init>()V
                                a1.i0 = new r.d[4];
                                a1.j0 = 0;
                                a1.k0 = 0;
                                a1.l0 = new ArrayList(4);
                                a1.m0 = true;
                                a0.o = a1;
                                a0.l = a1;
                                a0.c();
                                a0.setVisibility(8);
                                a0.setId(((int)integer0));
                                int[] arr_v2 = e2.q0;
                                if(arr_v2 == null) {
                                    String s2 = e2.r0;
                                    if(s2 != null) {
                                        int[] arr_v3 = f.a(a0, s2);
                                        e2.q0 = arr_v3;
                                        a0.setReferencedIds(arr_v3);
                                    }
                                }
                                else {
                                    a0.setReferencedIds(arr_v2);
                                }
                                a0.setType(e2.o0);
                                s.d d2 = ConstraintLayout.a();
                                a0.c();
                                e2.a(d2);
                                this.addView(a0, d2);
                            }
                            if(e2.a) {
                                g g0 = new g(this.getContext());
                                g0.setId(((int)integer0));
                                s.d d3 = ConstraintLayout.a();
                                e2.a(d3);
                                this.addView(g0, d3);
                            }
                        }
                    }
                    e0.i0.clear();
                    int v42 = arrayList0.size();
                    if(v42 > 0) {
                        for(int v43 = 0; v43 < v42; ++v43) {
                            ((s.b)arrayList0.get(v43)).b(this);
                        }
                    }
                    for(int v44 = 0; v44 < v24; ++v44) {
                        this.getChildAt(v44);
                    }
                    int v45 = 0;
                    while(v45 < v24) {
                        View view2 = this.getChildAt(v45);
                        r.d d4 = this.c(view2);
                        if(d4 == null) {
                            v49 = v24;
                        }
                        else {
                            s.d d5 = (s.d)view2.getLayoutParams();
                            d5.a();
                            if(z) {
                                try {
                                    String s3 = this.getResources().getResourceName(view2.getId());
                                    this.e(s3, view2.getId());
                                    this.b(view2.getId()).Y = s3.substring(s3.indexOf("id/") + 3);
                                }
                                catch(Resources.NotFoundException unused_ex) {
                                }
                            }
                            d4.X = view2.getVisibility();
                            d4.W = view2;
                            e0.i0.add(d4);
                            r.d d6 = d4.C;
                            if(d6 != null) {
                                ((e)d6).i0.remove(d4);
                                d4.C = null;
                            }
                            d4.C = e0;
                            if(!d5.V || !d5.U) {
                                arrayList1.add(d4);
                            }
                            if(d5.X) {
                                int v46 = d5.g0;
                                int v47 = d5.h0;
                                float f1 = d5.i0;
                                int v48 = Float.compare(f1, -1.0f);
                                if(v48 == 0) {
                                    if(v46 == -1) {
                                        if(v47 != -1 && v47 > -1) {
                                            ((r.g)d4).i0 = -1.0f;
                                            ((r.g)d4).j0 = -1;
                                            ((r.g)d4).k0 = v47;
                                        }
                                    }
                                    else if(v46 > -1) {
                                        ((r.g)d4).i0 = -1.0f;
                                        ((r.g)d4).j0 = v46;
                                        ((r.g)d4).k0 = -1;
                                    }
                                }
                                else if(v48 > 0) {
                                    ((r.g)d4).i0 = f1;
                                    ((r.g)d4).j0 = -1;
                                    ((r.g)d4).k0 = -1;
                                }
                                v49 = v24;
                            }
                            else if(d5.d == -1 && d5.e == -1 && d5.f == -1 && d5.g == -1 && d5.q == -1 && d5.p == -1 && d5.r == -1 && d5.s == -1 && d5.h == -1 && d5.i == -1 && d5.j == -1 && d5.k == -1 && d5.l == -1 && d5.P == -1 && d5.Q == -1 && d5.m == -1 && d5.width != -1 && d5.height != -1) {
                                v49 = v24;
                            }
                            else {
                                int v50 = d5.Z;
                                int v51 = d5.a0;
                                int v52 = d5.c0;
                                int v53 = d5.d0;
                                int v54 = d5.b0;
                                int v55 = d5.e0;
                                int v56 = d5.m;
                                float f2 = d5.f0;
                                if(v56 == -1) {
                                    v49 = v24;
                                    d8 = d5;
                                    if(v50 == -1) {
                                        v57 = v52;
                                        v58 = v54;
                                        v59 = v55;
                                        f4 = f2;
                                        if(v51 != -1) {
                                            r.d d10 = this.b(v51);
                                            if(d10 != null) {
                                                d4.l(2, d10, 4, d8.leftMargin, v53);
                                            }
                                        }
                                    }
                                    else {
                                        r.d d9 = this.b(v50);
                                        if(d9 == null) {
                                            v57 = v52;
                                            v58 = v54;
                                            v59 = v55;
                                            f4 = f2;
                                        }
                                        else {
                                            v57 = v52;
                                            v58 = v54;
                                            v59 = v55;
                                            f4 = f2;
                                            d4.l(2, d9, 2, d8.leftMargin, v53);
                                        }
                                    }
                                    if(v58 != -1) {
                                        r.d d11 = this.b(v58);
                                        if(d11 != null) {
                                            d4.l(4, d11, 2, d8.rightMargin, v59);
                                        }
                                    }
                                    else if(v57 != -1) {
                                        r.d d12 = this.b(v57);
                                        if(d12 != null) {
                                            d4.l(4, d12, 4, d8.rightMargin, v59);
                                        }
                                    }
                                    int v60 = d8.h;
                                    if(v60 == -1) {
                                        int v61 = d8.i;
                                        if(v61 != -1) {
                                            r.d d14 = this.b(v61);
                                            if(d14 != null) {
                                                d4.l(3, d14, 5, d8.topMargin, d8.u);
                                            }
                                        }
                                    }
                                    else {
                                        r.d d13 = this.b(v60);
                                        if(d13 != null) {
                                            d4.l(3, d13, 3, d8.topMargin, d8.u);
                                        }
                                    }
                                    int v62 = d8.j;
                                    if(v62 == -1) {
                                        int v63 = d8.k;
                                        if(v63 != -1) {
                                            r.d d16 = this.b(v63);
                                            if(d16 != null) {
                                                d4.l(5, d16, 5, d8.bottomMargin, d8.w);
                                            }
                                        }
                                    }
                                    else {
                                        r.d d15 = this.b(v62);
                                        if(d15 != null) {
                                            d4.l(5, d15, 3, d8.bottomMargin, d8.w);
                                        }
                                    }
                                    int v64 = d8.l;
                                    if(v64 != -1) {
                                        View view3 = (View)this.i.get(v64);
                                        r.d d17 = this.b(d8.l);
                                        if(d17 != null && view3 != null && view3.getLayoutParams() instanceof s.d) {
                                            s.d d18 = (s.d)view3.getLayoutParams();
                                            d8.W = true;
                                            d18.W = true;
                                            d4.f(6).a(d17.f(6), 0, -1, 2, 0, true);
                                            d4.f(3).d();
                                            d4.f(5).d();
                                        }
                                    }
                                    if(f4 >= 0.0f && f4 != 0.5f) {
                                        d4.U = f4;
                                    }
                                    float f5 = d8.A;
                                    if(f5 >= 0.0f && f5 != 0.5f) {
                                        d4.V = f5;
                                    }
                                }
                                else {
                                    r.d d7 = this.b(v56);
                                    if(d7 == null) {
                                        v49 = v24;
                                        d8 = d5;
                                    }
                                    else {
                                        float f3 = d5.o;
                                        v49 = v24;
                                        d8 = d5;
                                        d4.l(7, d7, 7, d5.n, 0);
                                        d4.r = f3;
                                    }
                                }
                                if(z) {
                                    int v65 = d8.P;
                                    if(v65 != -1 || d8.Q != -1) {
                                        d4.H = v65;
                                        d4.I = d8.Q;
                                    }
                                }
                                if(d8.U) {
                                    d4.t(1);
                                    d4.x(d8.width);
                                }
                                else if(d8.width == -1) {
                                    d4.t(4);
                                    r.c c0 = d4.f(2);
                                    c0.e = d8.leftMargin;
                                    r.c c1 = d4.f(4);
                                    c1.e = d8.rightMargin;
                                }
                                else {
                                    d4.t(3);
                                    d4.x(0);
                                }
                                if(d8.V) {
                                    d4.w(1);
                                    d4.s(d8.height);
                                }
                                else if(d8.height == -1) {
                                    d4.w(4);
                                    r.c c2 = d4.f(3);
                                    c2.e = d8.topMargin;
                                    r.c c3 = d4.f(5);
                                    c3.e = d8.bottomMargin;
                                }
                                else {
                                    d4.w(3);
                                    d4.s(0);
                                }
                                String s4 = d8.B;
                                if(s4 != null) {
                                    if(s4.length() == 0) {
                                        d4.F = 0.0f;
                                    }
                                    else {
                                        int v66 = s4.length();
                                        int v67 = s4.indexOf(44);
                                        if(v67 <= 0 || v67 >= v66 - 1) {
                                            v69 = 0;
                                            v68 = -1;
                                        }
                                        else {
                                            String s5 = s4.substring(0, v67);
                                            if(s5.equalsIgnoreCase("W")) {
                                                v68 = 0;
                                            }
                                            else {
                                                v68 = s5.equalsIgnoreCase("H") ? 1 : -1;
                                            }
                                            v69 = v67 + 1;
                                        }
                                        int v70 = s4.indexOf(58);
                                        if(v70 < 0 || v70 >= v66 - 1) {
                                            String s8 = s4.substring(v69);
                                            if(s8.length() > 0) {
                                                try {
                                                    f8 = Float.parseFloat(s8);
                                                    goto label_433;
                                                }
                                                catch(NumberFormatException unused_ex) {
                                                }
                                            }
                                        }
                                        else {
                                            String s6 = s4.substring(v69, v70);
                                            String s7 = s4.substring(v70 + 1);
                                            if(s6.length() > 0 && s7.length() > 0) {
                                                try {
                                                    float f6 = Float.parseFloat(s6);
                                                    float f7 = Float.parseFloat(s7);
                                                    if(f6 > 0.0f && f7 > 0.0f) {
                                                        f8 = v68 == 1 ? Math.abs(f7 / f6) : Math.abs(f6 / f7);
                                                        goto label_433;
                                                    }
                                                }
                                                catch(NumberFormatException unused_ex) {
                                                }
                                            }
                                        }
                                        f8 = 0.0f;
                                    label_433:
                                        if(f8 > 0.0f) {
                                            d4.F = f8;
                                            d4.G = v68;
                                        }
                                    }
                                }
                                d4.e0[0] = d8.D;
                                d4.e0[1] = d8.E;
                                d4.c0 = d8.F;
                                d4.d0 = d8.G;
                                d4.e = d8.H;
                                d4.h = d8.J;
                                d4.i = d8.L;
                                d4.j = d8.N;
                                if(d8.N < 1.0f && d8.H == 0) {
                                    d4.e = 2;
                                }
                                d4.f = d8.I;
                                d4.k = d8.K;
                                d4.l = d8.M;
                                d4.m = d8.O;
                                if(d8.O < 1.0f && d8.I == 0) {
                                    d4.f = 2;
                                }
                            }
                        }
                        ++v45;
                        v24 = v49;
                    }
                    break;
                }
                ++v23;
            }
            z1 = true;
        }
        else {
            v39 = v2;
            v40 = v3;
            v30 = v4;
            v31 = v5;
            v25 = v6;
            v32 = v7;
            v41 = v21;
            z1 = false;
        }
        boolean z2 = (this.r & 8) == 8;
        if(z2) {
            int v71 = e0.i0.size();
            e0.p();
            for(int v72 = 0; v72 < v71; ++v72) {
                ((r.d)e0.i0.get(v72)).p();
            }
            e0.c(e0.w0);
            int[] arr_v4 = e0.h0;
            if(arr_v4[0] != 2) {
                j j0 = e0.c;
                if(j0 != null) {
                    j0.g(v20);
                }
            }
            if(arr_v4[1] == 2) {
                v73 = v41;
            }
            else {
                j j1 = e0.d;
                if(j1 == null) {
                    v73 = v41;
                }
                else {
                    v73 = v41;
                    j1.g(v73);
                }
            }
            this.d(v, v1);
        }
        else {
            v73 = v41;
            int v74 = this.getPaddingTop();
            int v75 = this.getPaddingBottom() + v74;
            int v76 = this.getPaddingLeft();
            int v77 = this.getPaddingRight() + v76;
            int v78 = this.getChildCount();
            int v79 = 0;
            while(v79 < v78) {
                View view4 = this.getChildAt(v79);
                if(view4.getVisibility() == 8) {
                label_569:
                    v81 = v78;
                    v83 = v73;
                    v84 = v20;
                }
                else {
                    s.d d19 = (s.d)view4.getLayoutParams();
                    r.d d20 = d19.j0;
                    if(d19.X || d19.Y) {
                        goto label_569;
                    }
                    else {
                        d20.X = view4.getVisibility();
                        int v80 = d19.width;
                        v81 = v78;
                        int v82 = d19.height;
                        v83 = v73;
                        v84 = v20;
                        if(d19.U || d19.V || d19.H == 1 || v80 == -1 || d19.I == 1 || v82 == -1) {
                            if(v80 == 0) {
                                v85 = ViewGroup.getChildMeasureSpec(v, v77, -2);
                                z4 = true;
                            }
                            else {
                                switch(v80) {
                                    case -2: {
                                        v85 = ViewGroup.getChildMeasureSpec(v, v77, -2);
                                        z4 = true;
                                        break;
                                    }
                                    case -1: {
                                        v85 = ViewGroup.getChildMeasureSpec(v, v77, -1);
                                        z4 = false;
                                        break;
                                    }
                                    default: {
                                        v85 = ViewGroup.getChildMeasureSpec(v, v77, v80);
                                        z4 = false;
                                    }
                                }
                            }
                            if(v82 == 0) {
                                v86 = ViewGroup.getChildMeasureSpec(v1, v75, -2);
                                z3 = true;
                            }
                            else {
                                switch(v82) {
                                    case -2: {
                                        z3 = true;
                                        v86 = ViewGroup.getChildMeasureSpec(v1, v75, -2);
                                        break;
                                    }
                                    case -1: {
                                        v86 = ViewGroup.getChildMeasureSpec(v1, v75, -1);
                                        z3 = false;
                                        break;
                                    }
                                    default: {
                                        z3 = false;
                                        v86 = ViewGroup.getChildMeasureSpec(v1, v75, v82);
                                    }
                                }
                            }
                            view4.measure(v85, v86);
                            v80 = view4.getMeasuredWidth();
                            v82 = view4.getMeasuredHeight();
                        }
                        else {
                            z3 = false;
                            z4 = false;
                        }
                        d20.x(v80);
                        d20.s(v82);
                        if(z4) {
                            d20.S = v80;
                        }
                        if(z3) {
                            d20.T = v82;
                        }
                        if(d19.W) {
                            int v87 = view4.getBaseline();
                            if(v87 != -1) {
                                d20.P = v87;
                            }
                        }
                    }
                }
                ++v79;
                v78 = v81;
                v20 = v84;
                z2 = false;
                v73 = v83;
            }
        }
        int v88 = this.getChildCount();
        for(int v89 = 0; v89 < v88; ++v89) {
            this.getChildAt(v89);
        }
        int v90 = arrayList0.size();
        if(v90 > 0) {
            for(int v91 = 0; v91 < v90; ++v91) {
                ((s.b)arrayList0.get(v91)).getClass();
            }
        }
        if(this.getChildCount() > 0 && z1) {
            if((e0.w0 & 0x20) == 0x20) {
                e0.x0 = true;
                e0.r0 = false;
                e0.s0 = false;
                e0.t0 = false;
                ArrayList arrayList2 = e0.i0;
                ArrayList arrayList3 = e0.q0;
                boolean z5 = e0.h0[0] == 2;
                boolean z6 = e0.h0[1] == 2;
                arrayList3.clear();
                for(Object object1: arrayList2) {
                    ((r.d)object1).p = null;
                    ((r.d)object1).b0 = false;
                    ((r.d)object1).p();
                }
                for(Object object2: arrayList2) {
                    r.d d21 = (r.d)object2;
                    if(d21.p != null) {
                        continue;
                    }
                    r.f f9 = new r.f(new ArrayList());
                    arrayList3.add(f9);
                    if(h.j(d21, f9, arrayList3, z5 || z6)) {
                        continue;
                    }
                    e0.q0.clear();
                    e0.q0.add(0, new r.f(e0.i0));
                    e0.x0 = false;
                    goto label_646;
                }
                int v92 = 0;
                int v93 = 0;
                for(Object object3: arrayList3) {
                    v92 = Math.max(v92, h.c(((r.f)object3), 0));
                    v93 = Math.max(v93, h.c(((r.f)object3), 1));
                }
                if(z5) {
                    e0.t(1);
                    e0.x(v92);
                    e0.r0 = true;
                    e0.s0 = true;
                    e0.u0 = v92;
                }
                if(z6) {
                    e0.w(1);
                    e0.s(v93);
                    e0.r0 = true;
                    e0.t0 = true;
                    e0.v0 = v93;
                }
                h.i(arrayList3, 0, e0.k());
                h.i(arrayList3, 1, e0.g());
            }
            else {
                e0.q0.clear();
                e0.q0.add(0, new r.f(e0.i0));
            }
        }
    label_646:
        if(e0.r0) {
            if(e0.s0) {
                v94 = v39;
                if(v94 == 0x80000000) {
                    int v95 = e0.u0;
                    v96 = v40;
                    if(v95 < v96) {
                        e0.x(v95);
                    }
                    e0.t(1);
                }
                else {
                    v96 = v40;
                }
            }
            else {
                v96 = v40;
                v94 = v39;
            }
            if(e0.t0) {
                v97 = v30;
                if(v97 == 0x80000000) {
                    int v98 = e0.v0;
                    v99 = v31;
                    if(v98 < v99) {
                        e0.s(v98);
                    }
                    e0.w(1);
                }
                else {
                    v99 = v31;
                }
            }
            else {
                v99 = v31;
                v97 = v30;
            }
        }
        else {
            v99 = v31;
            v97 = v30;
            v96 = v40;
            v94 = v39;
        }
        if((this.r & 0x20) == 0x20) {
            int v100 = e0.k();
            int v101 = e0.g();
            if(this.v != v100 && v94 == 0x40000000) {
                h.i(e0.q0, 0, v100);
            }
            if(this.w != v101 && v97 == 0x40000000) {
                h.i(e0.q0, 1, v101);
            }
            if(e0.s0 && e0.u0 > v96) {
                h.i(e0.q0, 0, v96);
            }
            if(e0.t0 && e0.v0 > v99) {
                h.i(e0.q0, 1, v99);
            }
        }
        if(this.getChildCount() > 0) {
            this.l.C();
        }
        int v102 = arrayList1.size();
        int v103 = this.getPaddingBottom() + v32;
        int v104 = this.getPaddingRight() + v25;
        if(v102 > 0) {
            boolean z7 = e0.h0[0] == 2;
            boolean z8 = e0.h0[1] == 2;
            int v105 = Math.max(e0.k(), this.m);
            int v106 = Math.max(e0.g(), this.n);
            int v107 = 0;
            boolean z9 = false;
            v108 = 0;
            while(v107 < v102) {
                r.d d22 = (r.d)arrayList1.get(v107);
                View view5 = d22.W;
                if(view5 == null) {
                    v109 = v102;
                    arrayList4 = arrayList1;
                }
                else {
                    arrayList4 = arrayList1;
                    s.d d23 = (s.d)view5.getLayoutParams();
                    v109 = v102;
                    if(!d23.Y && !d23.X && view5.getVisibility() != 8 && (!z2 || !d22.j().d() || !d22.i().d())) {
                        view5.measure((d23.width != -2 || !d23.U ? View.MeasureSpec.makeMeasureSpec(d22.k(), 0x40000000) : ViewGroup.getChildMeasureSpec(v, v104, -2)), (d23.height != -2 || !d23.V ? View.MeasureSpec.makeMeasureSpec(d22.g(), 0x40000000) : ViewGroup.getChildMeasureSpec(v1, v103, -2)));
                        int v110 = view5.getMeasuredWidth();
                        int v111 = view5.getMeasuredHeight();
                        if(v110 != d22.k()) {
                            d22.x(v110);
                            if(z2) {
                                d22.j().g(v110);
                            }
                            if(z7) {
                                int v112 = d22.H;
                                int v113 = d22.D;
                                if(v112 + v113 > v105) {
                                    v105 = Math.max(v105, d22.f(4).b() + (v112 + v113));
                                }
                            }
                            z9 = true;
                        }
                        if(v111 != d22.g()) {
                            d22.s(v111);
                            if(z2) {
                                d22.i().g(v111);
                            }
                            if(z8) {
                                int v114 = d22.I;
                                int v115 = d22.E;
                                if(v114 + v115 > v106) {
                                    v106 = Math.max(v106, d22.f(5).b() + (v114 + v115));
                                }
                            }
                            z9 = true;
                        }
                        if(d23.W) {
                            int v116 = view5.getBaseline();
                            if(v116 != -1 && v116 != d22.P) {
                                d22.P = v116;
                                z9 = true;
                            }
                        }
                        v108 = View.combineMeasuredStates(v108, view5.getMeasuredState());
                    }
                }
                ++v107;
                v102 = v109;
                arrayList1 = arrayList4;
            }
            if(z9) {
                e0.x(v20);
                e0.s(v73);
                if(z2) {
                    e0.E();
                }
                this.l.C();
                if(e0.k() < v105) {
                    e0.x(v105);
                    v117 = 1;
                }
                else {
                    v117 = 0;
                }
                if(e0.g() < v106) {
                    e0.s(v106);
                    v118 = 1;
                }
                else {
                    v118 = v117;
                }
                if(v118 != 0) {
                    this.l.C();
                }
            }
            for(int v119 = 0; v119 < v102; ++v119) {
                r.d d24 = (r.d)arrayList1.get(v119);
                View view6 = d24.W;
                if(view6 != null && (view6.getMeasuredWidth() != d24.k() || view6.getMeasuredHeight() != d24.g()) && d24.X != 8) {
                    view6.measure(View.MeasureSpec.makeMeasureSpec(d24.k(), 0x40000000), View.MeasureSpec.makeMeasureSpec(d24.g(), 0x40000000));
                }
            }
        }
        else {
            v108 = 0;
        }
        int v120 = e0.k();
        int v121 = e0.g();
        int v122 = View.resolveSizeAndState(v120 + v104, v, v108);
        int v123 = View.resolveSizeAndState(v121 + v103, v1, v108 << 16);
        int v124 = Math.min(this.o, v122 & 0xFFFFFF);
        int v125 = Math.min(this.p, v123 & 0xFFFFFF);
        if(e0.y0) {
            v124 |= 0x1000000;
        }
        if(e0.z0) {
            v125 |= 0x1000000;
        }
        this.setMeasuredDimension(v124, v125);
        this.v = v124;
        this.w = v125;
    }

    @Override  // android.view.ViewGroup
    public final void onViewAdded(View view0) {
        super.onViewAdded(view0);
        if(view0 instanceof g && !(this.c(view0) instanceof r.g)) {
            s.d d0 = (s.d)view0.getLayoutParams();
            r.g g0 = new r.g();
            d0.j0 = g0;
            d0.X = true;
            g0.A(d0.R);
        }
        if(view0 instanceof s.b) {
            ((s.b)view0).c();
            ((s.d)view0.getLayoutParams()).Y = true;
            ArrayList arrayList0 = this.j;
            if(!arrayList0.contains(((s.b)view0))) {
                arrayList0.add(((s.b)view0));
            }
        }
        int v = view0.getId();
        this.i.put(v, view0);
        this.q = true;
    }

    @Override  // android.view.ViewGroup
    public final void onViewRemoved(View view0) {
        super.onViewRemoved(view0);
        int v = view0.getId();
        this.i.remove(v);
        r.d d0 = this.c(view0);
        this.l.i0.remove(d0);
        d0.C = null;
        this.j.remove(view0);
        this.k.remove(d0);
        this.q = true;
    }

    @Override  // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        this.q = true;
        this.v = -1;
        this.w = -1;
    }

    public void setConstraintSet(f f0) {
        this.s = f0;
    }

    @Override  // android.view.View
    public void setId(int v) {
        int v1 = this.getId();
        this.i.remove(v1);
        super.setId(v);
        int v2 = this.getId();
        this.i.put(v2, this);
    }

    public void setMaxHeight(int v) {
        if(v == this.p) {
            return;
        }
        this.p = v;
        this.requestLayout();
    }

    public void setMaxWidth(int v) {
        if(v == this.o) {
            return;
        }
        this.o = v;
        this.requestLayout();
    }

    public void setMinHeight(int v) {
        if(v == this.n) {
            return;
        }
        this.n = v;
        this.requestLayout();
    }

    public void setMinWidth(int v) {
        if(v == this.m) {
            return;
        }
        this.m = v;
        this.requestLayout();
    }

    public void setOptimizationLevel(int v) {
        this.l.w0 = v;
    }

    @Override  // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

