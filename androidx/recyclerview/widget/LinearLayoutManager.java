package androidx.recyclerview.widget;

import N.E;
import N.F;
import N.G;
import N.M;
import N.P;
import N.T;
import N.n;
import N.s;
import N.t;
import N.u;
import N.v;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

public class LinearLayoutManager extends F {
    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR;
        public int i;
        public int j;
        public boolean k;

        static {
            SavedState.CREATOR = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeInt(this.i);
            parcel0.writeInt(this.j);
            parcel0.writeInt(((int)this.k));
        }
    }

    public final t A;
    public final int B;
    public final int[] C;
    public int o;
    public u p;
    public v q;
    public boolean r;
    public final boolean s;
    public boolean t;
    public boolean u;
    public final boolean v;
    public int w;
    public int x;
    public SavedState y;
    public final s z;

    public LinearLayoutManager() {
        this.o = 1;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = true;
        this.w = -1;
        this.x = 0x80000000;
        this.y = null;
        this.z = new s();
        this.A = new t();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.B = 2;
        this.C = new int[2];
        this.O0(1);
        this.b(null);
        if(this.s) {
            this.s = false;
            this.f0();
        }
    }

    public LinearLayoutManager(Context context0, AttributeSet attributeSet0, int v, int v1) {
        this.o = 1;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = true;
        this.w = -1;
        this.x = 0x80000000;
        this.y = null;
        this.z = new s();
        this.A = new t();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.B = 2;
        this.C = new int[2];
        E e0 = F.D(context0, attributeSet0, v, v1);
        this.O0(e0.a);
        boolean z = e0.c;
        this.b(null);
        if(z != this.s) {
            this.s = z;
            this.f0();
        }
        this.P0(e0.d);
    }

    public final View A0(int v, int v1) {
        this.w0();
        if(v1 > v || v1 < v) {
            if(this.q.e(this.t(v)) < this.q.j()) {
                return this.o == 0 ? this.c.t(v, v1, 0x4104, 0x4004) : this.d.t(v, v1, 0x4104, 0x4004);
            }
            return this.o == 0 ? this.c.t(v, v1, 0x1041, 0x1001) : this.d.t(v, v1, 0x1041, 0x1001);
        }
        return this.t(v);
    }

    public final View B0(int v, int v1, boolean z) {
        this.w0();
        int v2 = z ? 0x6003 : 320;
        return this.o == 0 ? this.c.t(v, v1, v2, 320) : this.d.t(v, v1, v2, 320);
    }

    public View C0(M m0, P p0, int v, int v1, int v2) {
        this.w0();
        int v3 = this.q.j();
        int v4 = this.q.g();
        int v5 = v1 <= v ? -1 : 1;
        View view0 = null;
        View view1 = null;
        while(v != v1) {
            View view2 = this.t(v);
            int v6 = F.C(view2);
            if(v6 >= 0 && v6 < v2) {
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

    public final int D0(int v, M m0, P p0, boolean z) {
        int v1 = this.q.g() - v;
        if(v1 > 0) {
            int v2 = this.N0(-v1, m0, p0);
            if(z) {
                int v3 = this.q.g() - (v - v2);
                if(v3 > 0) {
                    this.q.o(v3);
                    return v3 - v2;
                }
            }
            return -v2;
        }
        return 0;
    }

    public final int E0(int v, M m0, P p0, boolean z) {
        int v1 = v - this.q.j();
        if(v1 > 0) {
            int v2 = -this.N0(v1, m0, p0);
            if(z) {
                int v3 = v + v2 - this.q.j();
                if(v3 > 0) {
                    this.q.o(-v3);
                    return v2 - v3;
                }
            }
            return v2;
        }
        return 0;
    }

    // 去混淆评级： 低(20)
    public final View F0() {
        return this.t ? this.t(0) : this.t(this.u() - 1);
    }

    @Override  // N.F
    public final boolean G() {
        return true;
    }

    // 去混淆评级： 低(20)
    public final View G0() {
        return this.t ? this.t(this.u() - 1) : this.t(0);
    }

    public final boolean H0() {
        return this.b.getLayoutDirection() == 1;
    }

    public void I0(M m0, P p0, u u0, t t0) {
        int v13;
        int v12;
        int v11;
        int v10;
        View view0 = u0.b(m0);
        if(view0 == null) {
            t0.b = true;
            return;
        }
        G g0 = (G)view0.getLayoutParams();
        if(u0.k != null) {
            if(this.t == (u0.f == -1)) {
                this.a(view0, -1, true);
            }
            else {
                this.a(view0, 0, true);
            }
        }
        else if(this.t == (u0.f == -1)) {
            this.a(view0, -1, false);
        }
        else {
            this.a(view0, 0, false);
        }
        G g1 = (G)view0.getLayoutParams();
        Rect rect0 = this.b.H(view0);
        int v = rect0.left + rect0.right;
        int v1 = rect0.top + rect0.bottom;
        int v2 = this.m;
        int v3 = this.k;
        int v4 = this.z();
        int v5 = F.v(this.c(), v2, v3, this.A() + v4 + g1.leftMargin + g1.rightMargin + v, g1.width);
        int v6 = this.n;
        int v7 = this.l;
        int v8 = this.B();
        int v9 = F.v(this.d(), v6, v7, this.y() + v8 + g1.topMargin + g1.bottomMargin + v1, g1.height);
        if(this.n0(view0, v5, v9, g1)) {
            view0.measure(v5, v9);
        }
        t0.a = this.q.c(view0);
        if(this.o == 1) {
            if(this.H0()) {
                v10 = this.m - this.A();
                v11 = v10 - this.q.d(view0);
            }
            else {
                v11 = this.z();
                v10 = this.q.d(view0) + v11;
            }
            if(u0.f == -1) {
                v12 = u0.b;
                v13 = v12 - t0.a;
            }
            else {
                v13 = u0.b;
                v12 = t0.a + v13;
            }
        }
        else {
            int v14 = this.B();
            int v15 = this.q.d(view0) + v14;
            if(u0.f == -1) {
                v10 = u0.b;
                v12 = v15;
                v11 = u0.b - t0.a;
                v13 = v14;
            }
            else {
                v11 = u0.b;
                v12 = v15;
                v13 = v14;
                v10 = t0.a + u0.b;
            }
        }
        F.I(view0, v11, v13, v10, v12);
        if(g0.a.h() || g0.a.k()) {
            t0.c = true;
        }
        t0.d = view0.hasFocusable();
    }

    public void J0(M m0, P p0, s s0, int v) {
    }

    public final void K0(M m0, u u0) {
        if(u0.a && !u0.l) {
            int v = u0.g;
            int v1 = u0.i;
            if(u0.f == -1) {
                int v2 = this.u();
                if(v >= 0) {
                    int v3 = this.q.f() - v + v1;
                    if(this.t) {
                        int v4 = 0;
                        while(v4 < v2) {
                            View view0 = this.t(v4);
                            if(this.q.e(view0) >= v3 && this.q.n(view0) >= v3) {
                                ++v4;
                                continue;
                            }
                            this.L0(m0, 0, v4);
                            return;
                        }
                    }
                    else {
                        int v5 = v2 - 1;
                        while(v5 >= 0) {
                            View view1 = this.t(v5);
                            if(this.q.e(view1) >= v3 && this.q.n(view1) >= v3) {
                                --v5;
                                continue;
                            }
                            this.L0(m0, v2 - 1, v5);
                            return;
                        }
                    }
                }
            }
            else if(v >= 0) {
                int v6 = v - v1;
                int v7 = this.u();
                if(this.t) {
                    int v8 = v7 - 1;
                    while(v8 >= 0) {
                        View view2 = this.t(v8);
                        if(this.q.b(view2) <= v6 && this.q.m(view2) <= v6) {
                            --v8;
                            continue;
                        }
                        this.L0(m0, v7 - 1, v8);
                        return;
                    }
                }
                else {
                    int v9 = 0;
                    while(v9 < v7) {
                        View view3 = this.t(v9);
                        if(this.q.b(view3) <= v6 && this.q.m(view3) <= v6) {
                            ++v9;
                        }
                        else {
                            this.L0(m0, 0, v9);
                            if(true) {
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override  // N.F
    public final void L(RecyclerView recyclerView0) {
    }

    public final void L0(M m0, int v, int v1) {
        if(v == v1) {
            return;
        }
        if(v1 > v) {
            for(int v2 = v1 - 1; v2 >= v; --v2) {
                View view0 = this.t(v2);
                this.d0(v2);
                m0.f(view0);
            }
            return;
        }
        while(v > v1) {
            View view1 = this.t(v);
            this.d0(v);
            m0.f(view1);
            --v;
        }
    }

    @Override  // N.F
    public View M(View view0, int v, M m0, P p0) {
        View view1;
        this.M0();
        if(this.u() == 0) {
            return null;
        }
        int v1 = this.v0(v);
        if(v1 == 0x80000000) {
            return null;
        }
        this.w0();
        this.Q0(v1, ((int)(((float)this.q.k()) * 0.333333f)), false, p0);
        this.p.g = 0x80000000;
        this.p.a = false;
        this.x0(m0, this.p, p0, true);
        if(v1 != -1) {
            view1 = this.t ? this.A0(0, this.u()) : this.A0(this.u() - 1, -1);
        }
        else if(this.t) {
            view1 = this.A0(this.u() - 1, -1);
        }
        else {
            view1 = this.A0(0, this.u());
        }
        View view2 = v1 == -1 ? this.G0() : this.F0();
        if(view2.hasFocusable()) {
            return view1 == null ? null : view2;
        }
        return view1;
    }

    public final void M0() {
        if(this.o != 1 && this.H0()) {
            this.t = !this.s;
            return;
        }
        this.t = this.s;
    }

    @Override  // N.F
    public final void N(AccessibilityEvent accessibilityEvent0) {
        super.N(accessibilityEvent0);
        if(this.u() > 0) {
            View view0 = this.B0(0, this.u(), false);
            int v = -1;
            accessibilityEvent0.setFromIndex((view0 == null ? -1 : F.C(view0)));
            View view1 = this.B0(this.u() - 1, -1, false);
            if(view1 != null) {
                v = F.C(view1);
            }
            accessibilityEvent0.setToIndex(v);
        }
    }

    public final int N0(int v, M m0, P p0) {
        if(this.u() != 0 && v != 0) {
            this.w0();
            this.p.a = true;
            int v1 = v <= 0 ? -1 : 1;
            int v2 = Math.abs(v);
            this.Q0(v1, v2, true, p0);
            int v3 = this.p.g;
            int v4 = this.x0(m0, this.p, p0, false) + v3;
            if(v4 < 0) {
                return 0;
            }
            if(v2 > v4) {
                v = v1 * v4;
            }
            this.q.o(-v);
            this.p.j = v;
            return v;
        }
        return 0;
    }

    public final void O0(int v) {
        if(v != 0 && v != 1) {
            throw new IllegalArgumentException("invalid orientation:" + v);
        }
        this.b(null);
        if(v != this.o || this.q == null) {
            v v1 = v.a(this, v);
            this.q = v1;
            this.z.f = v1;
            this.o = v;
            this.f0();
        }
    }

    public void P0(boolean z) {
        this.b(null);
        if(this.u == z) {
            return;
        }
        this.u = z;
        this.f0();
    }

    public final void Q0(int v, int v1, boolean z, P p0) {
        int v7;
        boolean z1 = false;
        int v2 = 1;
        this.p.l = this.q.i() == 0 && this.q.f() == 0;
        this.p.f = v;
        this.C[0] = 0;
        this.C[1] = 0;
        p0.getClass();
        this.C[0] = 0;
        this.C[1] = 0;
        int v3 = 0;
        int v4 = Math.max(0, this.C[1]);
        if(v == 1) {
            z1 = true;
        }
        u u0 = this.p;
        int v5 = z1 ? v4 : 0;
        u0.h = v5;
        if(!z1) {
            v3 = v4;
        }
        u0.i = v3;
        if(z1) {
            u0.h = this.q.h() + v5;
            View view0 = this.F0();
            u u1 = this.p;
            if(this.t) {
                v2 = -1;
            }
            u1.e = v2;
            int v6 = F.C(view0);
            u u2 = this.p;
            u1.d = v6 + u2.e;
            u2.b = this.q.b(view0);
            v7 = this.q.b(view0) - this.q.g();
        }
        else {
            View view1 = this.G0();
            u u3 = this.p;
            int v8 = u3.h;
            u3.h = this.q.j() + v8;
            u u4 = this.p;
            if(!this.t) {
                v2 = -1;
            }
            u4.e = v2;
            int v9 = F.C(view1);
            u u5 = this.p;
            u4.d = v9 + u5.e;
            u5.b = this.q.e(view1);
            v7 = -this.q.e(view1) + this.q.j();
        }
        u u6 = this.p;
        u6.c = v1;
        if(z) {
            u6.c = v1 - v7;
        }
        u6.g = v7;
    }

    public final void R0(int v, int v1) {
        u u0 = this.p;
        u0.c = this.q.g() - v1;
        this.p.e = this.t ? -1 : 1;
        this.p.d = v;
        this.p.f = 1;
        this.p.b = v1;
        this.p.g = 0x80000000;
    }

    public final void S0(int v, int v1) {
        u u0 = this.p;
        u0.c = v1 - this.q.j();
        this.p.d = v;
        this.p.e = this.t ? 1 : -1;
        this.p.f = -1;
        this.p.b = v1;
        this.p.g = 0x80000000;
    }

    @Override  // N.F
    public void V(M m0, P p0) {
        int v25;
        int v24;
        int v23;
        int v17;
        int v14;
        int v12;
        int v11;
        int v5;
        View view3;
        View view2;
        View view0;
        int v = -1;
        if((this.y != null || this.w != -1) && p0.b() == 0) {
            this.a0(m0);
            return;
        }
        SavedState linearLayoutManager$SavedState0 = this.y;
        if(linearLayoutManager$SavedState0 != null) {
            int v1 = linearLayoutManager$SavedState0.i;
            if(v1 >= 0) {
                this.w = v1;
            }
        }
        this.w0();
        this.p.a = false;
        this.M0();
        RecyclerView recyclerView0 = this.b;
        if(recyclerView0 == null) {
            view0 = null;
        }
        else {
            view0 = recyclerView0.getFocusedChild();
            if(view0 == null || ((ArrayList)this.a.l).contains(view0)) {
                view0 = null;
            }
        }
        s s0 = this.z;
        if(!s0.d || this.w != -1 || this.y != null) {
            s0.d();
            s0.c = this.t ^ this.u;
            if(p0.f) {
            label_74:
                if(this.u() == 0) {
                    s0.a();
                    s0.b = this.u ? p0.b() - 1 : 0;
                }
                else {
                    RecyclerView recyclerView1 = this.b;
                    if(recyclerView1 == null) {
                        view2 = null;
                    }
                    else {
                        view2 = recyclerView1.getFocusedChild();
                        if(view2 == null || ((ArrayList)this.a.l).contains(view2)) {
                            view2 = null;
                        }
                    }
                    if(view2 == null) {
                    label_87:
                        if(this.r == this.u) {
                            if(!s0.c) {
                                view3 = this.t ? this.C0(m0, p0, this.u() - 1, -1, p0.b()) : this.C0(m0, p0, 0, this.u(), p0.b());
                            }
                            else if(this.t) {
                                view3 = this.C0(m0, p0, 0, this.u(), p0.b());
                            }
                            else {
                                view3 = this.C0(m0, p0, this.u() - 1, -1, p0.b());
                            }
                            if(view3 == null) {
                                s0.a();
                                s0.b = this.u ? p0.b() - 1 : 0;
                            }
                            else {
                                s0.b(view3, F.C(view3));
                                if(!p0.f && this.q0() && (this.q.e(view3) >= this.q.g() || this.q.b(view3) < this.q.j())) {
                                    s0.e = s0.c ? this.q.g() : this.q.j();
                                }
                            }
                        }
                        else {
                            s0.a();
                            s0.b = this.u ? p0.b() - 1 : 0;
                        }
                    }
                    else {
                        G g0 = (G)view2.getLayoutParams();
                        if(!g0.a.h() && g0.a.b() >= 0 && g0.a.b() < p0.b()) {
                            s0.c(view2, F.C(view2));
                            goto label_108;
                        }
                        goto label_87;
                    }
                }
            }
            else {
                int v2 = this.w;
                if(v2 == -1) {
                    goto label_74;
                }
                else if(v2 >= 0 && v2 < p0.b()) {
                    int v3 = this.w;
                    s0.b = v3;
                    SavedState linearLayoutManager$SavedState1 = this.y;
                    if(linearLayoutManager$SavedState1 != null && linearLayoutManager$SavedState1.i >= 0) {
                        s0.c = linearLayoutManager$SavedState1.k;
                        s0.e = linearLayoutManager$SavedState1.k ? this.q.g() - this.y.j : this.q.j() + this.y.j;
                    }
                    else if(this.x == 0x80000000) {
                        View view1 = this.p(v3);
                        if(view1 == null) {
                            if(this.u() > 0) {
                                int v6 = F.C(this.t(0));
                                s0.c = this.w < v6 == this.t;
                            }
                            s0.a();
                        }
                        else if(this.q.c(view1) > this.q.k()) {
                            s0.a();
                        }
                        else if(this.q.e(view1) - this.q.j() < 0) {
                            s0.e = this.q.j();
                            s0.c = false;
                        }
                        else if(this.q.g() - this.q.b(view1) < 0) {
                            s0.e = this.q.g();
                            s0.c = true;
                        }
                        else {
                            if(s0.c) {
                                int v4 = this.q.b(view1);
                                v5 = this.q.l() + v4;
                            }
                            else {
                                v5 = this.q.e(view1);
                            }
                            s0.e = v5;
                        }
                    }
                    else {
                        s0.c = this.t;
                        s0.e = this.t ? this.q.g() - this.x : this.q.j() + this.x;
                    }
                }
                else {
                    this.w = -1;
                    this.x = 0x80000000;
                    goto label_74;
                }
            }
        label_108:
            s0.d = true;
        }
        else if(view0 != null && (this.q.e(view0) >= this.q.g() || this.q.b(view0) <= this.q.j())) {
            s0.c(view0, F.C(view0));
        }
        this.p.f = this.p.j < 0 ? -1 : 1;
        this.C[0] = 0;
        this.C[1] = 0;
        p0.getClass();
        this.C[0] = 0;
        this.C[1] = 0;
        int v7 = this.q.j();
        int v8 = Math.max(0, this.C[1]);
        int v9 = this.q.h() + v8;
        if(p0.f) {
            int v10 = this.w;
            if(v10 != -1 && this.x != 0x80000000) {
                View view4 = this.p(v10);
                if(view4 != null) {
                    if(this.t) {
                        v11 = this.q.g() - this.q.b(view4);
                        v12 = this.x;
                    }
                    else {
                        v12 = this.q.e(view4) - this.q.j();
                        v11 = this.x;
                    }
                    int v13 = v11 - v12;
                    if(v13 > 0) {
                        v7 += v13;
                    }
                    else {
                        v9 -= v13;
                    }
                }
            }
        }
        if(!s0.c) {
            if(!this.t) {
                v = 1;
            }
        }
        else if(this.t) {
            v = 1;
        }
        this.J0(m0, p0, s0, v);
        this.o(m0);
        this.p.l = this.q.i() == 0 && this.q.f() == 0;
        this.p.getClass();
        this.p.i = 0;
        if(s0.c) {
            this.S0(s0.b, s0.e);
            this.p.h = v7;
            this.x0(m0, this.p, p0, false);
            v14 = this.p.b;
            int v15 = this.p.d;
            int v16 = this.p.c;
            if(v16 > 0) {
                v9 += v16;
            }
            this.R0(s0.b, s0.e);
            this.p.h = v9;
            this.p.d += this.p.e;
            this.x0(m0, this.p, p0, false);
            v17 = this.p.b;
            int v18 = this.p.c;
            if(v18 > 0) {
                this.S0(v15, v14);
                this.p.h = v18;
                this.x0(m0, this.p, p0, false);
                v14 = this.p.b;
            }
        }
        else {
            this.R0(s0.b, s0.e);
            this.p.h = v9;
            this.x0(m0, this.p, p0, false);
            v17 = this.p.b;
            int v19 = this.p.d;
            int v20 = this.p.c;
            if(v20 > 0) {
                v7 += v20;
            }
            this.S0(s0.b, s0.e);
            this.p.h = v7;
            this.p.d += this.p.e;
            this.x0(m0, this.p, p0, false);
            v14 = this.p.b;
            int v21 = this.p.c;
            if(v21 > 0) {
                this.R0(v19, v17);
                this.p.h = v21;
                this.x0(m0, this.p, p0, false);
                v17 = this.p.b;
            }
        }
        if(this.u() > 0) {
            if((this.t ^ this.u) == 0) {
                int v26 = this.E0(v14, m0, p0, true);
                v23 = v14 + v26;
                v24 = v17 + v26;
                v25 = this.D0(v24, m0, p0, false);
            }
            else {
                int v22 = this.D0(v17, m0, p0, true);
                v23 = v14 + v22;
                v24 = v17 + v22;
                v25 = this.E0(v23, m0, p0, false);
            }
            v14 = v23 + v25;
            v17 = v24 + v25;
        }
        if(p0.j && this.u() != 0 && !p0.f && this.q0()) {
            List list0 = m0.d;
            int v27 = list0.size();
            int v28 = F.C(this.t(0));
            int v30 = 0;
            int v31 = 0;
            for(int v29 = 0; v29 < v27; ++v29) {
                T t0 = (T)list0.get(v29);
                if(!t0.h()) {
                    View view5 = t0.a;
                    if(t0.b() < v28 == this.t) {
                        v31 += this.q.c(view5);
                    }
                    else {
                        v30 += this.q.c(view5);
                    }
                }
            }
            this.p.k = list0;
            if(v30 > 0) {
                this.S0(F.C(this.G0()), v14);
                this.p.h = v30;
                this.p.c = 0;
                this.p.a(null);
                this.x0(m0, this.p, p0, false);
            }
            if(v31 > 0) {
                this.R0(F.C(this.F0()), v17);
                this.p.h = v31;
                this.p.c = 0;
                this.p.a(null);
                this.x0(m0, this.p, p0, false);
            }
            this.p.k = null;
        }
        if(p0.f) {
            s0.d();
        }
        else {
            v v32 = this.q;
            v32.b = v32.k();
        }
        this.r = this.u;
    }

    @Override  // N.F
    public void W(P p0) {
        this.y = null;
        this.w = -1;
        this.x = 0x80000000;
        this.z.d();
    }

    @Override  // N.F
    public final void X(Parcelable parcelable0) {
        if(parcelable0 instanceof SavedState) {
            this.y = (SavedState)parcelable0;
            this.f0();
        }
    }

    @Override  // N.F
    public final Parcelable Y() {
        SavedState linearLayoutManager$SavedState0 = this.y;
        if(linearLayoutManager$SavedState0 != null) {
            Parcelable parcelable0 = new SavedState();  // 初始化器: Ljava/lang/Object;-><init>()V
            parcelable0.i = linearLayoutManager$SavedState0.i;
            parcelable0.j = linearLayoutManager$SavedState0.j;
            parcelable0.k = linearLayoutManager$SavedState0.k;
            return parcelable0;
        }
        Parcelable parcelable1 = new SavedState();  // 初始化器: Ljava/lang/Object;-><init>()V
        if(this.u() > 0) {
            this.w0();
            int v = this.r ^ this.t;
            parcelable1.k = v;
            if(v != 0) {
                View view0 = this.F0();
                parcelable1.j = this.q.g() - this.q.b(view0);
                parcelable1.i = F.C(view0);
                return parcelable1;
            }
            View view1 = this.G0();
            parcelable1.i = F.C(view1);
            parcelable1.j = this.q.e(view1) - this.q.j();
            return parcelable1;
        }
        parcelable1.i = -1;
        return parcelable1;
    }

    @Override  // N.F
    public final void b(String s) {
        if(this.y == null) {
            RecyclerView recyclerView0 = this.b;
            if(recyclerView0 != null) {
                recyclerView0.g(s);
            }
        }
    }

    @Override  // N.F
    public final boolean c() {
        return this.o == 0;
    }

    @Override  // N.F
    public final boolean d() {
        return this.o == 1;
    }

    @Override  // N.F
    public final void g(int v, int v1, P p0, n n0) {
        if(this.o != 0) {
            v = v1;
        }
        if(this.u() != 0 && v != 0) {
            this.w0();
            this.Q0((v <= 0 ? -1 : 1), Math.abs(v), true, p0);
            this.r0(p0, this.p, n0);
        }
    }

    @Override  // N.F
    public int g0(int v, M m0, P p0) {
        return this.o == 1 ? 0 : this.N0(v, m0, p0);
    }

    @Override  // N.F
    public final void h(int v, n n0) {
        boolean z;
        int v2;
        SavedState linearLayoutManager$SavedState0 = this.y;
        int v1 = -1;
        if(linearLayoutManager$SavedState0 == null) {
        label_7:
            this.M0();
            z = this.t;
            v2 = this.w;
            if(v2 == -1) {
                v2 = z ? v - 1 : 0;
            }
        }
        else {
            v2 = linearLayoutManager$SavedState0.i;
            if(v2 >= 0) {
                z = linearLayoutManager$SavedState0.k;
                goto label_12;
            }
            goto label_7;
        }
    label_12:
        if(!z) {
            v1 = 1;
        }
        for(int v3 = 0; v3 < this.B && v2 >= 0 && v2 < v; ++v3) {
            n0.a(v2, 0);
            v2 += v1;
        }
    }

    @Override  // N.F
    public int h0(int v, M m0, P p0) {
        return this.o == 0 ? 0 : this.N0(v, m0, p0);
    }

    @Override  // N.F
    public final int i(P p0) {
        return this.s0(p0);
    }

    @Override  // N.F
    public int j(P p0) {
        return this.t0(p0);
    }

    @Override  // N.F
    public int k(P p0) {
        return this.u0(p0);
    }

    @Override  // N.F
    public final int l(P p0) {
        return this.s0(p0);
    }

    @Override  // N.F
    public int m(P p0) {
        return this.t0(p0);
    }

    @Override  // N.F
    public int n(P p0) {
        return this.u0(p0);
    }

    @Override  // N.F
    public final boolean o0() {
        if(this.l != 0x40000000 && this.k != 0x40000000) {
            int v = this.u();
            for(int v1 = 0; v1 < v; ++v1) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.t(v1).getLayoutParams();
                if(viewGroup$LayoutParams0.width < 0 && viewGroup$LayoutParams0.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // N.F
    public final View p(int v) {
        int v1 = this.u();
        if(v1 == 0) {
            return null;
        }
        int v2 = v - F.C(this.t(0));
        if(v2 >= 0 && v2 < v1) {
            View view0 = this.t(v2);
            return F.C(view0) == v ? view0 : super.p(v);
        }
        return super.p(v);
    }

    @Override  // N.F
    public G q() {
        return new G(-2, -2);
    }

    @Override  // N.F
    public boolean q0() {
        return this.y == null && this.r == this.u;
    }

    public void r0(P p0, u u0, n n0) {
        int v = u0.d;
        if(v >= 0 && v < p0.b()) {
            n0.a(v, Math.max(0, u0.g));
        }
    }

    public final int s0(P p0) {
        if(this.u() == 0) {
            return 0;
        }
        this.w0();
        return o1.a.f(p0, this.q, this.z0(!this.v), this.y0(!this.v), this, this.v);
    }

    public final int t0(P p0) {
        if(this.u() == 0) {
            return 0;
        }
        this.w0();
        return o1.a.g(p0, this.q, this.z0(!this.v), this.y0(!this.v), this, this.v, this.t);
    }

    public final int u0(P p0) {
        if(this.u() == 0) {
            return 0;
        }
        this.w0();
        return o1.a.h(p0, this.q, this.z0(!this.v), this.y0(!this.v), this, this.v);
    }

    public final int v0(int v) {
        switch(v) {
            case 1: {
                if(this.o == 1) {
                    return -1;
                }
                return this.H0() ? 1 : -1;
            }
            case 2: {
                if(this.o == 1) {
                    return 1;
                }
                return this.H0() ? -1 : 1;
            }
            case 17: {
                return this.o == 0 ? -1 : 0x80000000;
            }
            case 33: {
                return this.o == 1 ? -1 : 0x80000000;
            }
            case 66: {
                return this.o == 0 ? 1 : 0x80000000;
            }
            case 130: {
                return this.o == 1 ? 1 : 0x80000000;
            }
            default: {
                return 0x80000000;
            }
        }
    }

    public final void w0() {
        if(this.p == null) {
            u u0 = new u();  // 初始化器: Ljava/lang/Object;-><init>()V
            u0.a = true;
            u0.h = 0;
            u0.i = 0;
            u0.k = null;
            this.p = u0;
        }
    }

    public final int x0(M m0, u u0, P p0, boolean z) {
        int v = u0.c;
        int v1 = u0.g;
        if(v1 != 0x80000000) {
            if(v < 0) {
                u0.g = v1 + v;
            }
            this.K0(m0, u0);
        }
        int v2 = u0.c + u0.h;
        while((u0.l || v2 > 0) && (u0.d >= 0 && u0.d < p0.b())) {
            t t0 = this.A;
            t0.a = 0;
            t0.b = false;
            t0.c = false;
            t0.d = false;
            this.I0(m0, p0, u0, t0);
            if(t0.b) {
                break;
            }
            int v3 = t0.a;
            u0.b = u0.f * v3 + u0.b;
            if(!t0.c || u0.k != null || !p0.f) {
                u0.c -= v3;
                v2 -= v3;
            }
            int v4 = u0.g;
            if(v4 != 0x80000000) {
                int v5 = v4 + v3;
                u0.g = v5;
                int v6 = u0.c;
                if(v6 < 0) {
                    u0.g = v5 + v6;
                }
                this.K0(m0, u0);
            }
            if(z && t0.d) {
                break;
            }
        }
        return v - u0.c;
    }

    // 去混淆评级： 低(20)
    public final View y0(boolean z) {
        return this.t ? this.B0(0, this.u(), z) : this.B0(this.u() - 1, -1, z);
    }

    // 去混淆评级： 低(20)
    public final View z0(boolean z) {
        return this.t ? this.B0(this.u() - 1, -1, z) : this.B0(0, this.u(), z);
    }
}

