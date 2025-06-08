package androidx.recyclerview.widget;

import A.f;
import B.c;
import N.F;
import N.G;
import N.M;
import N.P;
import N.n;
import N.q;
import N.s;
import N.t;
import N.u;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import android.view.accessibility.AccessibilityNodeInfo;
import i3.e;
import java.util.ArrayList;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {
    public boolean D;
    public final int E;
    public int[] F;
    public View[] G;
    public final SparseIntArray H;
    public final SparseIntArray I;
    public final c J;
    public final Rect K;

    public GridLayoutManager(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.D = false;
        this.E = -1;
        this.H = new SparseIntArray();
        this.I = new SparseIntArray();
        c c0 = new c(13);
        this.J = c0;
        this.K = new Rect();
        int v2 = F.D(context0, attributeSet0, v, v1).b;
        if(v2 != this.E) {
            this.D = true;
            if(v2 < 1) {
                throw new IllegalArgumentException("Span count should be at least 1. Provided " + v2);
            }
            this.E = v2;
            c0.z();
            this.f0();
        }
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final View C0(M m0, P p0, int v, int v1, int v2) {
        this.w0();
        int v3 = this.q.j();
        int v4 = this.q.g();
        int v5 = v1 <= v ? -1 : 1;
        View view0 = null;
        View view1 = null;
        while(v != v1) {
            View view2 = this.t(v);
            int v6 = F.C(view2);
            if(v6 >= 0 && v6 < v2 && this.X0(v6, m0, p0) == 0) {
                if(!((G)view2.getLayoutParams()).a.h()) {
                    if(this.q.e(view2) < v4 && this.q.b(view2) >= v3) {
                        return view2;
                    }
                    if(view0 == null) {
                        view0 = view2;
                    }
                }
                else if(view1 == null) {
                    view1 = view2;
                }
            }
            v += v5;
        }
        return view0 == null ? view1 : view0;
    }

    @Override  // N.F
    public final int E(M m0, P p0) {
        if(this.o == 0) {
            return this.E;
        }
        return p0.b() >= 1 ? this.W0(p0.b() - 1, m0, p0) + 1 : 0;
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final void I0(M m0, P p0, u u0, t t0) {
        int v26;
        int v25;
        int v24;
        int v23;
        int v21;
        int v20;
        int v8;
        int v7;
        int v6;
        int v = this.q.d == 0 ? this.q.a.l : this.q.a.k;
        int v1 = this.u() <= 0 ? 0 : this.F[this.E];
        if(v != 0x40000000) {
            this.a1();
        }
        boolean z = u0.e == 1;
        int v2 = z ? this.E : this.X0(u0.d, m0, p0) + this.Y0(u0.d, m0, p0);
        int v3;
        for(v3 = 0; v3 < this.E && (u0.d >= 0 && u0.d < p0.b() && v2 > 0); ++v3) {
            int v4 = u0.d;
            int v5 = this.Y0(v4, m0, p0);
            if(v5 > this.E) {
                throw new IllegalArgumentException(e.g(f.n("Item at position ", v4, " requires ", v5, " spans but GridLayoutManager has only "), this.E, " spans."));
            }
            v2 -= v5;
            if(v2 < 0) {
                break;
            }
            View view0 = u0.b(m0);
            if(view0 == null) {
                break;
            }
            this.G[v3] = view0;
        }
        if(v3 == 0) {
            t0.b = true;
            return;
        }
        if(z) {
            v6 = v3;
            v7 = 0;
            v8 = 1;
        }
        else {
            v7 = v3 - 1;
            v6 = -1;
            v8 = -1;
        }
        int v9 = 0;
        while(v7 != v6) {
            View view1 = this.G[v7];
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
            int v10 = this.Y0(F.C(view1), m0, p0);
            ((q)viewGroup$LayoutParams0).f = v10;
            ((q)viewGroup$LayoutParams0).e = v9;
            v9 += v10;
            v7 += v8;
        }
        float f = 0.0f;
        int v12 = 0;
        for(int v11 = 0; v11 < v3; ++v11) {
            View view2 = this.G[v11];
            if(u0.k == null) {
                if(z) {
                    this.a(view2, -1, false);
                }
                else {
                    this.a(view2, 0, false);
                }
            }
            else if(z) {
                this.a(view2, -1, true);
            }
            else {
                this.a(view2, 0, true);
            }
            RecyclerView recyclerView0 = this.b;
            Rect rect0 = this.K;
            if(recyclerView0 == null) {
                rect0.set(0, 0, 0, 0);
            }
            else {
                rect0.set(recyclerView0.H(view2));
            }
            this.Z0(view2, v, false);
            int v13 = this.q.c(view2);
            if(v13 > v12) {
                v12 = v13;
            }
            q q0 = (q)view2.getLayoutParams();
            float f1 = ((float)this.q.d(view2)) * 1.0f / ((float)q0.f);
            if(f1 > f) {
                f = f1;
            }
        }
        if(v != 0x40000000) {
            this.T0(Math.max(Math.round(f * ((float)this.E)), v1));
            v12 = 0;
            for(int v14 = 0; v14 < v3; ++v14) {
                View view3 = this.G[v14];
                this.Z0(view3, 0x40000000, true);
                int v15 = this.q.c(view3);
                if(v15 > v12) {
                    v12 = v15;
                }
            }
        }
        for(int v16 = 0; v16 < v3; ++v16) {
            View view4 = this.G[v16];
            if(this.q.c(view4) != v12) {
                q q1 = (q)view4.getLayoutParams();
                int v17 = q1.b.top + q1.b.bottom + q1.topMargin + q1.bottomMargin;
                int v18 = q1.b.left + q1.b.right + q1.leftMargin + q1.rightMargin;
                int v19 = this.V0(q1.e, q1.f);
                if(this.o == 1) {
                    v20 = F.v(false, v19, 0x40000000, v18, q1.width);
                    v21 = View.MeasureSpec.makeMeasureSpec(v12 - v17, 0x40000000);
                }
                else {
                    int v22 = View.MeasureSpec.makeMeasureSpec(v12 - v18, 0x40000000);
                    v21 = F.v(false, v19, 0x40000000, v17, q1.height);
                    v20 = v22;
                }
                if(this.p0(view4, v20, v21, ((G)view4.getLayoutParams()))) {
                    view4.measure(v20, v21);
                }
            }
        }
        t0.a = v12;
        if(this.o != 1) {
            if(u0.f == -1) {
                v23 = u0.b - v12;
                v24 = u0.b;
            }
            else {
                v24 = u0.b + v12;
                v23 = u0.b;
            }
            v26 = 0;
            v25 = 0;
        }
        else if(u0.f == -1) {
            v23 = 0;
            v24 = 0;
            v25 = u0.b - v12;
            v26 = u0.b;
        }
        else {
            v25 = u0.b;
            v26 = v25 + v12;
            v23 = 0;
            v24 = 0;
        }
        for(int v27 = 0; v27 < v3; ++v27) {
            View view5 = this.G[v27];
            q q2 = (q)view5.getLayoutParams();
            if(this.o != 1) {
                int v29 = this.B() + this.F[q2.e];
                v25 = v29;
                v26 = this.q.d(view5) + v29;
            }
            else if(this.H0()) {
                int v28 = this.z() + this.F[this.E - q2.e];
                v24 = v28;
                v23 = v28 - this.q.d(view5);
            }
            else {
                v23 = this.z() + this.F[q2.e];
                v24 = this.q.d(view5) + v23;
            }
            F.I(view5, v23, v25, v24, v26);
            if(q2.a.h() || q2.a.k()) {
                t0.c = true;
            }
            boolean z1 = t0.d;
            t0.d = view5.hasFocusable() | z1;
        }
        Arrays.fill(this.G, null);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final void J0(M m0, P p0, s s0, int v) {
        this.a1();
        if(p0.b() > 0 && !p0.f) {
            int v1 = this.X0(s0.b, m0, p0);
            if(v == 1) {
                while(v1 > 0) {
                    int v2 = s0.b;
                    if(v2 <= 0) {
                        break;
                    }
                    s0.b = v2 - 1;
                    v1 = this.X0(v2 - 1, m0, p0);
                }
            }
            else {
                int v3 = p0.b();
                int v4 = s0.b;
                while(v4 < v3 - 1) {
                    int v5 = this.X0(v4 + 1, m0, p0);
                    if(v5 <= v1) {
                        break;
                    }
                    ++v4;
                    v1 = v5;
                }
                s0.b = v4;
            }
        }
        this.U0();
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final View M(View view0, int v, M m0, P p0) {
        int v14;
        View view6;
        View view5;
        int v5;
        int v4;
        int v3;
        View view2;
        RecyclerView recyclerView0 = this.b;
        View view1 = null;
        if(recyclerView0 == null) {
            view2 = null;
        }
        else {
            view2 = recyclerView0.z(view0);
            if(view2 == null || ((ArrayList)this.a.l).contains(view2)) {
                view2 = null;
            }
        }
        if(view2 == null) {
            return null;
        }
        q q0 = (q)view2.getLayoutParams();
        int v1 = q0.e;
        int v2 = q0.f + v1;
        if(super.M(view0, v, m0, p0) == null) {
            return null;
        }
        if(this.v0(v) == 1 == this.t) {
            v4 = this.u();
            v3 = 0;
            v5 = 1;
        }
        else {
            v3 = this.u() - 1;
            v4 = -1;
            v5 = -1;
        }
        int v6 = this.o != 1 || !this.H0() ? 0 : 1;
        int v7 = this.W0(v3, m0, p0);
        int v8 = v3;
        int v9 = -1;
        int v10 = 0;
        int v11 = 0;
        int v12 = -1;
        View view3 = null;
        while(v8 != v4) {
            int v13 = this.W0(v8, m0, p0);
            View view4 = this.t(v8);
            if(view4 == view2) {
                break;
            }
            if(!view4.hasFocusable() || v13 == v7) {
                q q1 = (q)view4.getLayoutParams();
                int v15 = q1.e;
                view5 = view2;
                int v16 = q1.f + v15;
                if(view4.hasFocusable() && v15 == v1 && v16 == v2) {
                    return view4;
                }
                if((!view4.hasFocusable() || view1 != null) && (view4.hasFocusable() || view3 != null)) {
                    view6 = view3;
                    int v17 = Math.min(v16, v2) - Math.max(v15, v1);
                    if(view4.hasFocusable()) {
                        if(v17 <= v10 && (v17 != v10 || v6 != (v15 <= v12 ? 0 : 1))) {
                            v14 = v10;
                            goto label_74;
                        }
                        else {
                            v14 = v10;
                            goto label_62;
                        }
                        goto label_59;
                    }
                    else {
                    label_59:
                        if(view1 == null) {
                            v14 = v10;
                            if((!this.c.A(view4) || !this.d.A(view4)) && (v17 > v11 || v17 == v11 && v6 == (v15 <= v9 ? 0 : 1))) {
                            label_62:
                                if(view4.hasFocusable()) {
                                    v10 = Math.min(v16, v2) - Math.max(v15, v1);
                                    v12 = q1.e;
                                    view3 = view6;
                                    view1 = view4;
                                }
                                else {
                                    v11 = Math.min(v16, v2) - Math.max(v15, v1);
                                    v9 = q1.e;
                                    v10 = v14;
                                    view3 = view4;
                                }
                                goto label_76;
                            }
                        }
                        else {
                            v14 = v10;
                        }
                    }
                }
                else {
                    view6 = view3;
                    v14 = v10;
                    goto label_62;
                }
            }
            else {
                if(view1 != null) {
                    break;
                }
                view5 = view2;
                view6 = view3;
                v14 = v10;
            }
        label_74:
            v10 = v14;
            view3 = view6;
        label_76:
            v8 += v5;
            view2 = view5;
        }
        return view1 == null ? view3 : view1;
    }

    @Override  // N.F
    public final void O(M m0, P p0, View view0, F.c c0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(!(viewGroup$LayoutParams0 instanceof q)) {
            this.P(view0, c0);
            return;
        }
        int v = this.W0(((q)viewGroup$LayoutParams0).a.b(), m0, p0);
        AccessibilityNodeInfo accessibilityNodeInfo0 = c0.a;
        if(this.o == 0) {
            accessibilityNodeInfo0.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((q)viewGroup$LayoutParams0).e, ((q)viewGroup$LayoutParams0).f, v, 1, false, false));
            return;
        }
        accessibilityNodeInfo0.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(v, 1, ((q)viewGroup$LayoutParams0).e, ((q)viewGroup$LayoutParams0).f, false, false));
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final void P0(boolean z) {
        if(z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.P0(false);
    }

    @Override  // N.F
    public final void Q(int v, int v1) {
        this.J.z();
        ((SparseIntArray)this.J.k).clear();
    }

    @Override  // N.F
    public final void R() {
        this.J.z();
        ((SparseIntArray)this.J.k).clear();
    }

    @Override  // N.F
    public final void S(int v, int v1) {
        this.J.z();
        ((SparseIntArray)this.J.k).clear();
    }

    @Override  // N.F
    public final void T(int v, int v1) {
        this.J.z();
        ((SparseIntArray)this.J.k).clear();
    }

    public final void T0(int v) {
        int v7;
        int[] arr_v = this.F;
        int v1 = this.E;
        if(arr_v == null || arr_v.length != v1 + 1 || arr_v[arr_v.length - 1] != v) {
            arr_v = new int[v1 + 1];
        }
        int v3 = 0;
        arr_v[0] = 0;
        int v4 = v / v1;
        int v5 = v % v1;
        int v6 = 0;
        for(int v2 = 1; v2 <= v1; ++v2) {
            v3 += v5;
            if(v3 <= 0 || v1 - v3 >= v5) {
                v7 = v4;
            }
            else {
                v7 = v4 + 1;
                v3 -= v1;
            }
            v6 += v7;
            arr_v[v2] = v6;
        }
        this.F = arr_v;
    }

    @Override  // N.F
    public final void U(int v, int v1) {
        this.J.z();
        ((SparseIntArray)this.J.k).clear();
    }

    public final void U0() {
        if(this.G == null || this.G.length != this.E) {
            this.G = new View[this.E];
        }
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final void V(M m0, P p0) {
        SparseIntArray sparseIntArray0 = this.I;
        SparseIntArray sparseIntArray1 = this.H;
        if(p0.f) {
            int v = this.u();
            for(int v1 = 0; v1 < v; ++v1) {
                q q0 = (q)this.t(v1).getLayoutParams();
                int v2 = q0.a.b();
                sparseIntArray1.put(v2, q0.f);
                sparseIntArray0.put(v2, q0.e);
            }
        }
        super.V(m0, p0);
        sparseIntArray1.clear();
        sparseIntArray0.clear();
    }

    public final int V0(int v, int v1) {
        return this.o != 1 || !this.H0() ? this.F[v1 + v] - this.F[v] : this.F[this.E - v] - this.F[this.E - v - v1];
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final void W(P p0) {
        super.W(p0);
        this.D = false;
    }

    public final int W0(int v, M m0, P p0) {
        c c0 = this.J;
        if(!p0.f) {
            c0.getClass();
            return c.y(v, this.E);
        }
        int v1 = m0.b(v);
        if(v1 == -1) {
            f.p(v, "Cannot find span size for pre layout position. ", "GridLayoutManager");
            return 0;
        }
        c0.getClass();
        return c.y(v1, this.E);
    }

    public final int X0(int v, M m0, P p0) {
        c c0 = this.J;
        if(!p0.f) {
            c0.getClass();
            return v % this.E;
        }
        int v1 = this.I.get(v, -1);
        if(v1 != -1) {
            return v1;
        }
        int v2 = m0.b(v);
        if(v2 == -1) {
            f.p(v, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", "GridLayoutManager");
            return 0;
        }
        c0.getClass();
        return v2 % this.E;
    }

    public final int Y0(int v, M m0, P p0) {
        c c0 = this.J;
        if(!p0.f) {
            c0.getClass();
            return 1;
        }
        int v1 = this.H.get(v, -1);
        if(v1 != -1) {
            return v1;
        }
        if(m0.b(v) == -1) {
            f.p(v, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", "GridLayoutManager");
            return 1;
        }
        c0.getClass();
        return 1;
    }

    public final void Z0(View view0, int v, boolean z) {
        int v5;
        int v4;
        q q0 = (q)view0.getLayoutParams();
        int v1 = q0.b.top + q0.b.bottom + q0.topMargin + q0.bottomMargin;
        int v2 = q0.b.left + q0.b.right + q0.leftMargin + q0.rightMargin;
        int v3 = this.V0(q0.e, q0.f);
        if(this.o == 1) {
            v4 = F.v(false, v3, v, v2, q0.width);
            v5 = F.v(true, this.q.k(), this.l, v1, q0.height);
        }
        else {
            v5 = F.v(false, v3, v, v1, q0.height);
            v4 = F.v(true, this.q.k(), this.k, v2, q0.width);
        }
        G g0 = (G)view0.getLayoutParams();
        if((z ? this.p0(view0, v4, v5, g0) : this.n0(view0, v4, v5, g0))) {
            view0.measure(v4, v5);
        }
    }

    public final void a1() {
        int v1;
        int v;
        if(this.o == 1) {
            v = this.m - this.A();
            v1 = this.z();
        }
        else {
            v = this.n - this.y();
            v1 = this.B();
        }
        this.T0(v - v1);
    }

    @Override  // N.F
    public final boolean e(G g0) {
        return g0 instanceof q;
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final int g0(int v, M m0, P p0) {
        this.a1();
        this.U0();
        return super.g0(v, m0, p0);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final int h0(int v, M m0, P p0) {
        this.a1();
        this.U0();
        return super.h0(v, m0, p0);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final int j(P p0) {
        return this.t0(p0);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final int k(P p0) {
        return this.u0(p0);
    }

    @Override  // N.F
    public final void k0(Rect rect0, int v, int v1) {
        int v7;
        int v6;
        if(this.F == null) {
            super.k0(rect0, v, v1);
        }
        int v2 = this.z();
        int v3 = this.A() + v2;
        int v4 = this.B();
        int v5 = this.y() + v4;
        if(this.o == 1) {
            v6 = F.f(v1, rect0.height() + v5, this.b.getMinimumHeight());
            v7 = F.f(v, this.F[this.F.length - 1] + v3, this.b.getMinimumWidth());
        }
        else {
            v7 = F.f(v, rect0.width() + v3, this.b.getMinimumWidth());
            v6 = F.f(v1, this.F[this.F.length - 1] + v5, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(v7, v6);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final int m(P p0) {
        return this.t0(p0);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final int n(P p0) {
        return this.u0(p0);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final G q() {
        return this.o == 0 ? new q(-2, -1) : new q(-1, -2);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final boolean q0() {
        return this.y == null && !this.D;
    }

    @Override  // N.F
    public final G r(Context context0, AttributeSet attributeSet0) {
        G g0 = new q(context0, attributeSet0);  // 初始化器: LN/G;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
        g0.e = -1;
        g0.f = 0;
        return g0;
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final void r0(P p0, u u0, n n0) {
        int v = this.E;
        for(int v1 = 0; v1 < this.E && (u0.d >= 0 && u0.d < p0.b() && v > 0); ++v1) {
            n0.a(u0.d, Math.max(0, u0.g));
            this.J.getClass();
            --v;
            u0.d += u0.e;
        }
    }

    @Override  // N.F
    public final G s(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
            G g0 = new q(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0));  // 初始化器: LN/G;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
            g0.e = -1;
            g0.f = 0;
            return g0;
        }
        G g1 = new q(viewGroup$LayoutParams0);  // 初始化器: LN/G;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
        g1.e = -1;
        g1.f = 0;
        return g1;
    }

    @Override  // N.F
    public final int w(M m0, P p0) {
        if(this.o == 1) {
            return this.E;
        }
        return p0.b() >= 1 ? this.W0(p0.b() - 1, m0, p0) + 1 : 0;
    }
}

