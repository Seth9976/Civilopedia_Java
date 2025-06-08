package androidx.recyclerview.widget;

import B.b;
import F.c;
import N.E;
import N.F;
import N.G;
import N.M;
import N.P;
import N.W;
import N.X;
import N.Y;
import N.n;
import N.r;
import N.v;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import o1.a;

public class StaggeredGridLayoutManager extends F {
    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR;
        public int i;
        public int j;
        public int k;
        public int[] l;
        public int m;
        public int[] n;
        public ArrayList o;
        public boolean p;
        public boolean q;
        public boolean r;

        static {
            SavedState.CREATOR = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeInt(this.i);
            parcel0.writeInt(this.j);
            parcel0.writeInt(this.k);
            if(this.k > 0) {
                parcel0.writeIntArray(this.l);
            }
            parcel0.writeInt(this.m);
            if(this.m > 0) {
                parcel0.writeIntArray(this.n);
            }
            parcel0.writeInt(((int)this.p));
            parcel0.writeInt(((int)this.q));
            parcel0.writeInt(((int)this.r));
            parcel0.writeList(this.o);
        }
    }

    public final d A;
    public final int B;
    public boolean C;
    public boolean D;
    public SavedState E;
    public final Rect F;
    public final W G;
    public final boolean H;
    public int[] I;
    public final b J;
    public final int o;
    public final Y[] p;
    public final v q;
    public final v r;
    public final int s;
    public int t;
    public final r u;
    public boolean v;
    public boolean w;
    public final BitSet x;
    public int y;
    public int z;

    public StaggeredGridLayoutManager(Context context0, AttributeSet attributeSet0, int v, int v1) {
        this.o = -1;
        this.v = false;
        this.w = false;
        this.y = -1;
        this.z = 0x80000000;
        d d0 = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.A = d0;
        this.B = 2;
        this.F = new Rect();
        this.G = new W(this);
        this.H = true;
        this.J = new b(this, 11);
        E e0 = F.D(context0, attributeSet0, v, v1);
        int v2 = e0.a;
        if(v2 != 0 && v2 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        this.b(null);
        if(v2 != this.s) {
            this.s = v2;
            this.q = this.r;
            this.r = this.q;
            this.f0();
        }
        int v3 = e0.b;
        this.b(null);
        if(v3 != this.o) {
            int[] arr_v = d0.a;
            if(arr_v != null) {
                Arrays.fill(arr_v, -1);
            }
            d0.b = null;
            this.f0();
            this.o = v3;
            this.x = new BitSet(this.o);
            this.p = new Y[this.o];
            for(int v4 = 0; v4 < this.o; ++v4) {
                this.p[v4] = new Y(this, v4);
            }
            this.f0();
        }
        boolean z = e0.c;
        this.b(null);
        SavedState staggeredGridLayoutManager$SavedState0 = this.E;
        if(staggeredGridLayoutManager$SavedState0 != null && staggeredGridLayoutManager$SavedState0.p != z) {
            staggeredGridLayoutManager$SavedState0.p = z;
        }
        this.v = z;
        this.f0();
        r r0 = new r();  // 初始化器: Ljava/lang/Object;-><init>()V
        r0.a = true;
        r0.f = 0;
        r0.g = 0;
        this.u = r0;
        this.q = v.a(this, this.s);
        this.r = v.a(this, 1 - this.s);
    }

    public final int A0() {
        return this.u() == 0 ? 0 : F.C(this.t(0));
    }

    public final int B0() {
        int v = this.u();
        return v == 0 ? 0 : F.C(this.t(v - 1));
    }

    public final int C0(int v) {
        int v1 = this.p[0].f(v);
        for(int v2 = 1; v2 < this.o; ++v2) {
            int v3 = this.p[v2].f(v);
            if(v3 > v1) {
                v1 = v3;
            }
        }
        return v1;
    }

    public final int D0(int v) {
        int v1 = this.p[0].h(v);
        for(int v2 = 1; v2 < this.o; ++v2) {
            int v3 = this.p[v2].h(v);
            if(v3 < v1) {
                v1 = v3;
            }
        }
        return v1;
    }

    @Override  // N.F
    public final int E(M m0, P p0) {
        return this.s == 0 ? this.o : super.E(m0, p0);
    }

    public final void E0(int v, int v1, int v2) {
        int v9;
        int v5;
        int v4;
        int v3 = this.w ? this.B0() : this.A0();
        if(v2 != 8) {
            v4 = v + v1;
            v5 = v;
        }
        else if(v < v1) {
            v4 = v1 + 1;
            v5 = v;
        }
        else {
            v4 = v + 1;
            v5 = v1;
        }
        d d0 = this.A;
        if(d0.a != null && v5 < d0.a.length) {
            StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = null;
            ArrayList arrayList0 = d0.b;
            if(arrayList0 == null) {
                v9 = -1;
            }
            else {
                for(int v6 = arrayList0.size() - 1; v6 >= 0; --v6) {
                    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1 = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)d0.b.get(v6);
                    if(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1.i == v5) {
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem1;
                        break;
                    }
                }
                if(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 != null) {
                    d0.b.remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0);
                }
                int v7 = d0.b.size();
                int v8;
                for(v8 = 0; true; ++v8) {
                    if(v8 >= v7) {
                        v8 = -1;
                        break;
                    }
                    if(((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)d0.b.get(v8)).i >= v5) {
                        break;
                    }
                }
                if(v8 == -1) {
                    v9 = -1;
                }
                else {
                    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)d0.b.get(v8);
                    d0.b.remove(v8);
                    v9 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.i;
                }
            }
            if(v9 == -1) {
                Arrays.fill(d0.a, v5, d0.a.length, -1);
            }
            else {
                Arrays.fill(d0.a, v5, v9 + 1, -1);
            }
        }
        if(v2 == 1) {
            d0.b(v, v1);
        }
        else {
            switch(v2) {
                case 2: {
                    d0.c(v, v1);
                    break;
                }
                case 8: {
                    d0.c(v, 1);
                    d0.b(v1, 1);
                }
            }
        }
        if(v4 <= v3) {
            return;
        }
        if(v5 <= (this.w ? this.A0() : this.B0())) {
            this.f0();
        }
    }

    public final View F0() {
        int v = this.u();
        int v1 = v - 1;
        BitSet bitSet0 = new BitSet(this.o);
        bitSet0.set(0, this.o, true);
        int v2 = -1;
        int v3 = this.s != 1 || !this.G0() ? -1 : 1;
        if(this.w) {
            v = -1;
        }
        else {
            v1 = 0;
        }
        if(v1 < v) {
            v2 = 1;
        }
        while(v1 != v) {
            View view0 = this.t(v1);
            X x0 = (X)view0.getLayoutParams();
            if(bitSet0.get(x0.e.e)) {
                Y y0 = x0.e;
                if(this.w) {
                    int v4 = y0.c;
                    if(v4 == 0x80000000) {
                        y0.a();
                        v4 = y0.c;
                    }
                    if(v4 < this.q.g()) {
                        ((X)((View)y0.a.get(y0.a.size() - 1)).getLayoutParams()).getClass();
                        return view0;
                    }
                }
                else {
                    int v5 = y0.b;
                    if(v5 == 0x80000000) {
                        View view1 = (View)y0.a.get(0);
                        X x1 = (X)view1.getLayoutParams();
                        y0.b = y0.f.q.e(view1);
                        x1.getClass();
                        v5 = y0.b;
                    }
                    if(v5 > this.q.j()) {
                        ((X)((View)y0.a.get(0)).getLayoutParams()).getClass();
                        return view0;
                    }
                }
                bitSet0.clear(x0.e.e);
            }
            v1 += v2;
            if(v1 != v) {
                View view2 = this.t(v1);
                if(this.w) {
                    int v6 = this.q.b(view0);
                    int v7 = this.q.b(view2);
                    if(v6 < v7) {
                        return view0;
                    }
                    if(v6 != v7) {
                        continue;
                    }
                }
                else {
                    int v8 = this.q.e(view0);
                    int v9 = this.q.e(view2);
                    if(v8 > v9) {
                        return view0;
                    }
                    if(v8 == v9) {
                        goto label_51;
                    }
                    continue;
                }
            label_51:
                X x2 = (X)view2.getLayoutParams();
                if((x0.e.e - x2.e.e >= 0 ? 0 : 1) != (v3 >= 0 ? 0 : 1)) {
                    return view0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    @Override  // N.F
    public final boolean G() {
        return this.B != 0;
    }

    public final boolean G0() {
        return this.b.getLayoutDirection() == 1;
    }

    public final void H0(View view0, int v, int v1) {
        RecyclerView recyclerView0 = this.b;
        Rect rect0 = this.F;
        if(recyclerView0 == null) {
            rect0.set(0, 0, 0, 0);
        }
        else {
            rect0.set(recyclerView0.H(view0));
        }
        X x0 = (X)view0.getLayoutParams();
        int v2 = StaggeredGridLayoutManager.T0(v, x0.leftMargin + rect0.left, x0.rightMargin + rect0.right);
        int v3 = StaggeredGridLayoutManager.T0(v1, x0.topMargin + rect0.top, x0.bottomMargin + rect0.bottom);
        if(this.n0(view0, v2, v3, x0)) {
            view0.measure(v2, v3);
        }
    }

    public final void I0(M m0, P p0, boolean z) {
        boolean z4;
        boolean z1 = true;
        W w0 = this.G;
        if((this.E != null || this.y != -1) && p0.b() == 0) {
            this.a0(m0);
            w0.a();
            return;
        }
        boolean z2 = !w0.e || this.y != -1 || this.E != null;
        d d0 = this.A;
        StaggeredGridLayoutManager staggeredGridLayoutManager0 = w0.g;
        if(z2) {
            w0.a();
            SavedState staggeredGridLayoutManager$SavedState0 = this.E;
            if(staggeredGridLayoutManager$SavedState0 == null) {
                this.O0();
                w0.c = this.w;
            }
            else {
                int v = staggeredGridLayoutManager$SavedState0.k;
                if(v > 0) {
                    if(v == this.o) {
                        for(int v1 = 0; v1 < this.o; ++v1) {
                            this.p[v1].b();
                            SavedState staggeredGridLayoutManager$SavedState1 = this.E;
                            int v2 = staggeredGridLayoutManager$SavedState1.l[v1];
                            if(v2 != 0x80000000) {
                                v2 += (staggeredGridLayoutManager$SavedState1.q ? this.q.g() : this.q.j());
                            }
                            Y y0 = this.p[v1];
                            y0.b = v2;
                            y0.c = v2;
                        }
                    }
                    else {
                        staggeredGridLayoutManager$SavedState0.l = null;
                        staggeredGridLayoutManager$SavedState0.k = 0;
                        staggeredGridLayoutManager$SavedState0.m = 0;
                        staggeredGridLayoutManager$SavedState0.n = null;
                        staggeredGridLayoutManager$SavedState0.o = null;
                        staggeredGridLayoutManager$SavedState0.i = staggeredGridLayoutManager$SavedState0.j;
                    }
                }
                this.D = this.E.r;
                boolean z3 = this.E.p;
                this.b(null);
                SavedState staggeredGridLayoutManager$SavedState2 = this.E;
                if(staggeredGridLayoutManager$SavedState2 != null && staggeredGridLayoutManager$SavedState2.p != z3) {
                    staggeredGridLayoutManager$SavedState2.p = z3;
                }
                this.v = z3;
                this.f0();
                this.O0();
                SavedState staggeredGridLayoutManager$SavedState3 = this.E;
                int v3 = staggeredGridLayoutManager$SavedState3.i;
                if(v3 == -1) {
                    w0.c = this.w;
                }
                else {
                    this.y = v3;
                    w0.c = staggeredGridLayoutManager$SavedState3.q;
                }
                if(staggeredGridLayoutManager$SavedState3.m > 1) {
                    d0.a = staggeredGridLayoutManager$SavedState3.n;
                    d0.b = staggeredGridLayoutManager$SavedState3.o;
                }
            }
            if(p0.f) {
            label_109:
                int v9 = 0;
                if(this.C) {
                    int v10 = p0.b();
                    for(int v11 = this.u() - 1; v11 >= 0; --v11) {
                        int v12 = F.C(this.t(v11));
                        if(v12 >= 0 && v12 < v10) {
                            v9 = v12;
                            break;
                        }
                    }
                }
                else {
                    int v13 = p0.b();
                    int v14 = this.u();
                    for(int v15 = 0; v15 < v14; ++v15) {
                        int v16 = F.C(this.t(v15));
                        if(v16 >= 0 && v16 < v13) {
                            v9 = v16;
                            break;
                        }
                    }
                }
                w0.a = v9;
                w0.b = 0x80000000;
            }
            else {
                int v4 = this.y;
                if(v4 == -1) {
                    goto label_109;
                }
                else if(v4 < 0 || v4 >= p0.b()) {
                    this.y = -1;
                    this.z = 0x80000000;
                    goto label_109;
                }
                else if(this.E != null && this.E.i != -1 && this.E.k >= 1) {
                    w0.b = 0x80000000;
                    w0.a = this.y;
                }
                else {
                    View view0 = this.p(this.y);
                    if(view0 == null) {
                        int v7 = this.y;
                        w0.a = v7;
                        int v8 = this.z;
                        if(v8 == 0x80000000) {
                            if(this.u() != 0) {
                                z4 = v7 < this.A0() == this.w;
                            }
                            else if(!this.w) {
                                z4 = false;
                            }
                            else {
                                z4 = true;
                            }
                            w0.c = z4;
                            w0.b = z4 ? staggeredGridLayoutManager0.q.g() : staggeredGridLayoutManager0.q.j();
                        }
                        else if(w0.c) {
                            w0.b = staggeredGridLayoutManager0.q.g() - v8;
                        }
                        else {
                            w0.b = staggeredGridLayoutManager0.q.j() + v8;
                        }
                        w0.d = true;
                    }
                    else {
                        w0.a = this.w ? this.B0() : this.A0();
                        if(this.z == 0x80000000) {
                            if(this.q.c(view0) > this.q.k()) {
                                w0.b = w0.c ? this.q.g() : this.q.j();
                            }
                            else {
                                int v5 = this.q.e(view0) - this.q.j();
                                if(v5 < 0) {
                                    w0.b = -v5;
                                }
                                else {
                                    int v6 = this.q.g() - this.q.b(view0);
                                    w0.b = v6 < 0 ? v6 : 0x80000000;
                                }
                            }
                        }
                        else if(w0.c) {
                            w0.b = this.q.g() - this.z - this.q.b(view0);
                        }
                        else {
                            w0.b = this.q.j() + this.z - this.q.e(view0);
                        }
                    }
                }
            }
            w0.e = true;
        }
        if(this.E == null && this.y == -1 && (w0.c != this.C || this.G0() != this.D)) {
            int[] arr_v = d0.a;
            if(arr_v != null) {
                Arrays.fill(arr_v, -1);
            }
            d0.b = null;
            w0.d = true;
        }
        if(this.u() > 0 && (this.E == null || this.E.k < 1)) {
            if(w0.d) {
                for(int v17 = 0; v17 < this.o; ++v17) {
                    this.p[v17].b();
                    int v18 = w0.b;
                    if(v18 != 0x80000000) {
                        Y y1 = this.p[v17];
                        y1.b = v18;
                        y1.c = v18;
                    }
                }
            }
            else if(z2 || w0.f == null) {
                for(int v21 = 0; v21 < this.o; ++v21) {
                    Y y3 = this.p[v21];
                    boolean z5 = this.w;
                    int v22 = w0.b;
                    int v23 = z5 ? y3.f(0x80000000) : y3.h(0x80000000);
                    y3.b();
                    if(v23 != 0x80000000 && ((!z5 || v23 >= y3.f.q.g()) && (z5 || v23 <= y3.f.q.j()))) {
                        if(v22 != 0x80000000) {
                            v23 += v22;
                        }
                        y3.c = v23;
                        y3.b = v23;
                    }
                }
                Y[] arr_y = this.p;
                if(w0.f == null || w0.f.length < arr_y.length) {
                    w0.f = new int[staggeredGridLayoutManager0.p.length];
                }
                for(int v24 = 0; v24 < arr_y.length; ++v24) {
                    int[] arr_v1 = w0.f;
                    arr_v1[v24] = arr_y[v24].h(0x80000000);
                }
            }
            else {
                for(int v19 = 0; v19 < this.o; ++v19) {
                    Y y2 = this.p[v19];
                    y2.b();
                    int v20 = w0.f[v19];
                    y2.b = v20;
                    y2.c = v20;
                }
            }
        }
        this.o(m0);
        r r0 = this.u;
        r0.a = false;
        int v25 = this.r.k();
        this.t = v25 / this.o;
        View.MeasureSpec.makeMeasureSpec(v25, this.r.i());
        this.R0(w0.a);
        if(w0.c) {
            this.Q0(-1);
            this.v0(m0, r0, p0);
            this.Q0(1);
        }
        else {
            this.Q0(1);
            this.v0(m0, r0, p0);
            this.Q0(-1);
        }
        r0.c = w0.a + r0.d;
        this.v0(m0, r0, p0);
        if(this.r.i() != 0x40000000) {
            int v26 = this.u();
            float f = 0.0f;
            for(int v27 = 0; v27 < v26; ++v27) {
                View view1 = this.t(v27);
                float f1 = (float)this.r.c(view1);
                if(f1 >= f) {
                    ((X)view1.getLayoutParams()).getClass();
                    f = Math.max(f, f1);
                }
            }
            int v28 = this.t;
            int v29 = this.r.i() == 0x80000000 ? Math.min(Math.round(f * ((float)this.o)), this.r.k()) : Math.round(f * ((float)this.o));
            this.t = v29 / this.o;
            View.MeasureSpec.makeMeasureSpec(v29, this.r.i());
            if(this.t != v28) {
                for(int v30 = 0; v30 < v26; ++v30) {
                    View view2 = this.t(v30);
                    X x0 = (X)view2.getLayoutParams();
                    x0.getClass();
                    if(!this.G0() || this.s != 1) {
                        int v32 = this.t * x0.e.e;
                        int v33 = x0.e.e * v28;
                        if(this.s == 1) {
                            view2.offsetLeftAndRight(v32 - v33);
                        }
                        else {
                            view2.offsetTopAndBottom(v32 - v33);
                        }
                    }
                    else {
                        int v31 = -(this.o - 1 - x0.e.e);
                        view2.offsetLeftAndRight(this.t * v31 - v31 * v28);
                    }
                }
            }
        }
        if(this.u() > 0) {
            if(this.w) {
                this.y0(m0, p0, true);
                this.z0(m0, p0, false);
            }
            else {
                this.z0(m0, p0, true);
                this.y0(m0, p0, false);
            }
        }
        if(!z || p0.f || this.B == 0 || this.u() <= 0 || this.F0() == null) {
            z1 = false;
        }
        else {
            RecyclerView recyclerView0 = this.b;
            if(recyclerView0 != null) {
                recyclerView0.removeCallbacks(this.J);
            }
            if(!this.r0()) {
                z1 = false;
            }
        }
        if(p0.f) {
            w0.a();
        }
        this.C = w0.c;
        this.D = this.G0();
        if(z1) {
            w0.a();
            this.I0(m0, p0, false);
        }
    }

    @Override  // N.F
    public final void J(int v) {
        super.J(v);
        for(int v1 = 0; v1 < this.o; ++v1) {
            Y y0 = this.p[v1];
            int v2 = y0.b;
            if(v2 != 0x80000000) {
                y0.b = v2 + v;
            }
            int v3 = y0.c;
            if(v3 != 0x80000000) {
                y0.c = v3 + v;
            }
        }
    }

    public final boolean J0(int v) {
        return this.s == 0 ? v == -1 != this.w : v == -1 == this.w == this.G0();
    }

    @Override  // N.F
    public final void K(int v) {
        super.K(v);
        for(int v1 = 0; v1 < this.o; ++v1) {
            Y y0 = this.p[v1];
            int v2 = y0.b;
            if(v2 != 0x80000000) {
                y0.b = v2 + v;
            }
            int v3 = y0.c;
            if(v3 != 0x80000000) {
                y0.c = v3 + v;
            }
        }
    }

    public final void K0(int v) {
        int v2;
        int v1;
        if(v > 0) {
            v1 = this.B0();
            v2 = 1;
        }
        else {
            v1 = this.A0();
            v2 = -1;
        }
        this.u.a = true;
        this.R0(v1);
        this.Q0(v2);
        this.u.c = v1 + this.u.d;
        this.u.b = Math.abs(v);
    }

    @Override  // N.F
    public final void L(RecyclerView recyclerView0) {
        RecyclerView recyclerView1 = this.b;
        if(recyclerView1 != null) {
            recyclerView1.removeCallbacks(this.J);
        }
        for(int v = 0; v < this.o; ++v) {
            this.p[v].b();
        }
        recyclerView0.requestLayout();
    }

    public final void L0(M m0, r r0) {
        int v = 1;
        if(r0.a && !r0.i) {
            if(r0.b == 0) {
                if(r0.e == -1) {
                    this.M0(m0, r0.g);
                    return;
                }
                this.N0(m0, r0.f);
                return;
            }
            if(r0.e == -1) {
                int v1 = r0.f;
                int v2 = this.p[0].h(v1);
                while(v < this.o) {
                    int v3 = this.p[v].h(v1);
                    if(v3 > v2) {
                        v2 = v3;
                    }
                    ++v;
                }
                int v4 = v1 - v2;
                this.M0(m0, (v4 >= 0 ? r0.g - Math.min(v4, r0.b) : r0.g));
                return;
            }
            int v5 = r0.g;
            int v6 = this.p[0].f(v5);
            while(v < this.o) {
                int v7 = this.p[v].f(v5);
                if(v7 < v6) {
                    v6 = v7;
                }
                ++v;
            }
            int v8 = v6 - r0.g;
            this.N0(m0, (v8 >= 0 ? Math.min(v8, r0.b) + r0.f : r0.f));
        }
    }

    @Override  // N.F
    public final View M(View view0, int v, M m0, P p0) {
        int v1;
        View view1;
        if(this.u() == 0) {
            return null;
        }
        RecyclerView recyclerView0 = this.b;
        if(recyclerView0 == null) {
            view1 = null;
        }
        else {
            view1 = recyclerView0.z(view0);
            if(view1 == null || ((ArrayList)this.a.l).contains(view1)) {
                view1 = null;
            }
        }
        if(view1 == null) {
            return null;
        }
        this.O0();
        switch(v) {
            case 1: {
                v1 = this.s == 1 || !this.G0() ? -1 : 1;
                break;
            }
            case 2: {
                if(this.s == 1) {
                    v1 = 1;
                }
                else if(this.G0()) {
                    v1 = -1;
                }
                else {
                    v1 = 1;
                }
                break;
            }
            case 17: {
                v1 = this.s == 0 ? -1 : 0x80000000;
                break;
            }
            case 33: {
                v1 = this.s == 1 ? -1 : 0x80000000;
                break;
            }
            case 66: {
                v1 = this.s == 0 ? 1 : 0x80000000;
                break;
            }
            case 130: {
                v1 = this.s == 1 ? 1 : 0x80000000;
                break;
            }
            default: {
                v1 = 0x80000000;
            }
        }
        if(v1 == 0x80000000) {
            return null;
        }
        X x0 = (X)view1.getLayoutParams();
        x0.getClass();
        Y y0 = x0.e;
        int v2 = v1 == 1 ? this.B0() : this.A0();
        this.R0(v2);
        this.Q0(v1);
        this.u.c = this.u.d + v2;
        this.u.b = (int)(((float)this.q.k()) * 0.333333f);
        this.u.h = true;
        this.u.a = false;
        this.v0(m0, this.u, p0);
        this.C = this.w;
        View view2 = y0.g(v2, v1);
        if(view2 != null && view2 != view1) {
            return view2;
        }
        if(this.J0(v1)) {
            for(int v4 = this.o - 1; v4 >= 0; --v4) {
                View view3 = this.p[v4].g(v2, v1);
                if(view3 != null && view3 != view1) {
                    return view3;
                }
            }
        }
        else {
            for(int v5 = 0; v5 < this.o; ++v5) {
                View view4 = this.p[v5].g(v2, v1);
                if(view4 != null && view4 != view1) {
                    return view4;
                }
            }
        }
        boolean z = !this.v == (v1 == -1 ? 1 : 0);
        View view5 = this.p((z ? y0.c() : y0.d()));
        if(view5 != null && view5 != view1) {
            return view5;
        }
        if(this.J0(v1)) {
            for(int v6 = this.o - 1; v6 >= 0; --v6) {
                if(v6 != y0.e) {
                    View view6 = this.p((z ? this.p[v6].c() : this.p[v6].d()));
                    if(view6 != null && view6 != view1) {
                        return view6;
                    }
                }
            }
            return null;
        }
        for(int v3 = 0; v3 < this.o; ++v3) {
            View view7 = this.p((z ? this.p[v3].c() : this.p[v3].d()));
            if(view7 != null && view7 != view1) {
                return view7;
            }
        }
        return null;
    }

    public final void M0(M m0, int v) {
        for(int v1 = this.u() - 1; v1 >= 0; --v1) {
            View view0 = this.t(v1);
            if(this.q.e(view0) < v || this.q.n(view0) < v) {
                break;
            }
            X x0 = (X)view0.getLayoutParams();
            x0.getClass();
            if(x0.e.a.size() == 1) {
                return;
            }
            Y y0 = x0.e;
            int v2 = y0.a.size();
            View view1 = (View)y0.a.remove(v2 - 1);
            X x1 = (X)view1.getLayoutParams();
            x1.e = null;
            if(x1.a.h() || x1.a.k()) {
                y0.d -= y0.f.q.c(view1);
            }
            if(v2 == 1) {
                y0.b = 0x80000000;
            }
            y0.c = 0x80000000;
            this.c0(view0, m0);
        }
    }

    @Override  // N.F
    public final void N(AccessibilityEvent accessibilityEvent0) {
        super.N(accessibilityEvent0);
        if(this.u() > 0) {
            View view0 = this.x0(false);
            View view1 = this.w0(false);
            if(view0 != null && view1 != null) {
                int v = F.C(view0);
                int v1 = F.C(view1);
                if(v < v1) {
                    accessibilityEvent0.setFromIndex(v);
                    accessibilityEvent0.setToIndex(v1);
                    return;
                }
                accessibilityEvent0.setFromIndex(v1);
                accessibilityEvent0.setToIndex(v);
            }
        }
    }

    public final void N0(M m0, int v) {
        while(this.u() > 0) {
            View view0 = this.t(0);
            if(this.q.b(view0) > v || this.q.m(view0) > v) {
                break;
            }
            X x0 = (X)view0.getLayoutParams();
            x0.getClass();
            if(x0.e.a.size() == 1) {
                return;
            }
            Y y0 = x0.e;
            View view1 = (View)y0.a.remove(0);
            X x1 = (X)view1.getLayoutParams();
            x1.e = null;
            if(y0.a.size() == 0) {
                y0.c = 0x80000000;
            }
            if(x1.a.h() || x1.a.k()) {
                y0.d -= y0.f.q.c(view1);
            }
            y0.b = 0x80000000;
            this.c0(view0, m0);
        }
    }

    @Override  // N.F
    public final void O(M m0, P p0, View view0, c c0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(!(viewGroup$LayoutParams0 instanceof X)) {
            this.P(view0, c0);
            return;
        }
        AccessibilityNodeInfo accessibilityNodeInfo0 = c0.a;
        if(this.s == 0) {
            Y y0 = ((X)viewGroup$LayoutParams0).e;
            accessibilityNodeInfo0.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain((y0 == null ? -1 : y0.e), 1, -1, -1, false, false));
            return;
        }
        Y y1 = ((X)viewGroup$LayoutParams0).e;
        accessibilityNodeInfo0.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(-1, -1, (y1 == null ? -1 : y1.e), 1, false, false));
    }

    public final void O0() {
        if(this.s != 1 && this.G0()) {
            this.w = !this.v;
            return;
        }
        this.w = this.v;
    }

    public final int P0(int v, M m0, P p0) {
        if(this.u() != 0 && v != 0) {
            this.K0(v);
            r r0 = this.u;
            int v1 = this.v0(m0, r0, p0);
            if(r0.b >= v1) {
                v = v >= 0 ? v1 : -v1;
            }
            this.q.o(-v);
            this.C = this.w;
            r0.b = 0;
            this.L0(m0, r0);
            return v;
        }
        return 0;
    }

    @Override  // N.F
    public final void Q(int v, int v1) {
        this.E0(v, v1, 1);
    }

    public final void Q0(int v) {
        this.u.e = v;
        this.u.d = this.w == (v == -1) ? 1 : -1;
    }

    @Override  // N.F
    public final void R() {
        d d0 = this.A;
        int[] arr_v = d0.a;
        if(arr_v != null) {
            Arrays.fill(arr_v, -1);
        }
        d0.b = null;
        this.f0();
    }

    public final void R0(int v) {
        r r0 = this.u;
        boolean z = false;
        r0.b = 0;
        r0.c = v;
        if(this.b == null || !this.b.o) {
            r0.g = this.q.f();
            r0.f = 0;
        }
        else {
            r0.f = this.q.j();
            r0.g = this.q.g();
        }
        r0.h = false;
        r0.a = true;
        if(this.q.i() == 0 && this.q.f() == 0) {
            z = true;
        }
        r0.i = z;
    }

    @Override  // N.F
    public final void S(int v, int v1) {
        this.E0(v, v1, 8);
    }

    public final void S0(Y y0, int v, int v1) {
        int v2 = y0.d;
        int v3 = y0.e;
        if(v == -1) {
            int v4 = y0.b;
            if(v4 == 0x80000000) {
                View view0 = (View)y0.a.get(0);
                X x0 = (X)view0.getLayoutParams();
                y0.b = y0.f.q.e(view0);
                x0.getClass();
                v4 = y0.b;
            }
            if(v4 + v2 <= v1) {
                this.x.set(v3, false);
            }
        }
        else {
            int v5 = y0.c;
            if(v5 == 0x80000000) {
                y0.a();
                v5 = y0.c;
            }
            if(v5 - v2 >= v1) {
                this.x.set(v3, false);
            }
        }
    }

    @Override  // N.F
    public final void T(int v, int v1) {
        this.E0(v, v1, 2);
    }

    public static int T0(int v, int v1, int v2) {
        if(v1 == 0 && v2 == 0) {
            return v;
        }
        int v3 = View.MeasureSpec.getMode(v);
        return v3 == 0x80000000 || v3 == 0x40000000 ? View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(v) - v1 - v2), v3) : v;
    }

    @Override  // N.F
    public final void U(int v, int v1) {
        this.E0(v, v1, 4);
    }

    @Override  // N.F
    public final void V(M m0, P p0) {
        this.I0(m0, p0, true);
    }

    @Override  // N.F
    public final void W(P p0) {
        this.y = -1;
        this.z = 0x80000000;
        this.E = null;
        this.G.a();
    }

    @Override  // N.F
    public final void X(Parcelable parcelable0) {
        if(parcelable0 instanceof SavedState) {
            this.E = (SavedState)parcelable0;
            this.f0();
        }
    }

    @Override  // N.F
    public final Parcelable Y() {
        int v2;
        SavedState staggeredGridLayoutManager$SavedState0 = this.E;
        if(staggeredGridLayoutManager$SavedState0 != null) {
            Parcelable parcelable0 = new SavedState();  // 初始化器: Ljava/lang/Object;-><init>()V
            parcelable0.k = staggeredGridLayoutManager$SavedState0.k;
            parcelable0.i = staggeredGridLayoutManager$SavedState0.i;
            parcelable0.j = staggeredGridLayoutManager$SavedState0.j;
            parcelable0.l = staggeredGridLayoutManager$SavedState0.l;
            parcelable0.m = staggeredGridLayoutManager$SavedState0.m;
            parcelable0.n = staggeredGridLayoutManager$SavedState0.n;
            parcelable0.p = staggeredGridLayoutManager$SavedState0.p;
            parcelable0.q = staggeredGridLayoutManager$SavedState0.q;
            parcelable0.r = staggeredGridLayoutManager$SavedState0.r;
            parcelable0.o = staggeredGridLayoutManager$SavedState0.o;
            return parcelable0;
        }
        Parcelable parcelable1 = new SavedState();  // 初始化器: Ljava/lang/Object;-><init>()V
        parcelable1.p = this.v;
        parcelable1.q = this.C;
        parcelable1.r = this.D;
        d d0 = this.A;
        if(d0 == null) {
            parcelable1.m = 0;
        }
        else {
            int[] arr_v = d0.a;
            if(arr_v == null) {
                parcelable1.m = 0;
            }
            else {
                parcelable1.n = arr_v;
                parcelable1.m = arr_v.length;
                parcelable1.o = d0.b;
            }
        }
        int v1 = -1;
        if(this.u() > 0) {
            parcelable1.i = this.C ? this.B0() : this.A0();
            View view0 = this.w ? this.w0(true) : this.x0(true);
            if(view0 != null) {
                v1 = F.C(view0);
            }
            parcelable1.j = v1;
            parcelable1.k = this.o;
            parcelable1.l = new int[this.o];
            for(int v = 0; v < this.o; ++v) {
                if(this.C) {
                    v2 = this.p[v].f(0x80000000);
                    if(v2 != 0x80000000) {
                        v2 -= this.q.g();
                    }
                }
                else {
                    v2 = this.p[v].h(0x80000000);
                    if(v2 != 0x80000000) {
                        v2 -= this.q.j();
                    }
                }
                parcelable1.l[v] = v2;
            }
            return parcelable1;
        }
        parcelable1.i = -1;
        parcelable1.j = -1;
        parcelable1.k = 0;
        return parcelable1;
    }

    @Override  // N.F
    public final void Z(int v) {
        if(v == 0) {
            this.r0();
        }
    }

    @Override  // N.F
    public final void b(String s) {
        if(this.E == null) {
            RecyclerView recyclerView0 = this.b;
            if(recyclerView0 != null) {
                recyclerView0.g(s);
            }
        }
    }

    @Override  // N.F
    public final boolean c() {
        return this.s == 0;
    }

    @Override  // N.F
    public final boolean d() {
        return this.s == 1;
    }

    @Override  // N.F
    public final boolean e(G g0) {
        return g0 instanceof X;
    }

    @Override  // N.F
    public final void g(int v, int v1, P p0, n n0) {
        int v6;
        int v5;
        r r0;
        if(this.s != 0) {
            v = v1;
        }
        if(this.u() != 0 && v != 0) {
            this.K0(v);
            if(this.I == null || this.I.length < this.o) {
                this.I = new int[this.o];
            }
            int v4 = 0;
            for(int v3 = 0; true; ++v3) {
                r0 = this.u;
                if(v3 >= this.o) {
                    break;
                }
                if(r0.d == -1) {
                    v5 = r0.f;
                    v6 = this.p[v3].h(v5);
                }
                else {
                    v5 = this.p[v3].f(r0.g);
                    v6 = r0.g;
                }
                int v7 = v5 - v6;
                if(v7 >= 0) {
                    this.I[v4] = v7;
                    ++v4;
                }
            }
            Arrays.sort(this.I, 0, v4);
            for(int v2 = 0; v2 < v4 && (r0.c >= 0 && r0.c < p0.b()); ++v2) {
                n0.a(r0.c, this.I[v2]);
                r0.c += r0.d;
            }
        }
    }

    @Override  // N.F
    public final int g0(int v, M m0, P p0) {
        return this.P0(v, m0, p0);
    }

    @Override  // N.F
    public final int h0(int v, M m0, P p0) {
        return this.P0(v, m0, p0);
    }

    @Override  // N.F
    public final int i(P p0) {
        return this.s0(p0);
    }

    @Override  // N.F
    public final int j(P p0) {
        return this.t0(p0);
    }

    @Override  // N.F
    public final int k(P p0) {
        return this.u0(p0);
    }

    @Override  // N.F
    public final void k0(Rect rect0, int v, int v1) {
        int v8;
        int v7;
        int v2 = this.o;
        int v3 = this.z();
        int v4 = this.A() + v3;
        int v5 = this.B();
        int v6 = this.y() + v5;
        if(this.s == 1) {
            v7 = F.f(v1, rect0.height() + v6, this.b.getMinimumHeight());
            v8 = F.f(v, this.t * v2 + v4, this.b.getMinimumWidth());
        }
        else {
            v8 = F.f(v, rect0.width() + v4, this.b.getMinimumWidth());
            v7 = F.f(v1, this.t * v2 + v6, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(v8, v7);
    }

    @Override  // N.F
    public final int l(P p0) {
        return this.s0(p0);
    }

    @Override  // N.F
    public final int m(P p0) {
        return this.t0(p0);
    }

    @Override  // N.F
    public final int n(P p0) {
        return this.u0(p0);
    }

    @Override  // N.F
    public final G q() {
        return this.s == 0 ? new X(-2, -1) : new X(-1, -2);  // 初始化器: LN/G;-><init>(II)V / 初始化器: LN/G;-><init>(II)V
    }

    @Override  // N.F
    public final boolean q0() {
        return this.E == null;
    }

    @Override  // N.F
    public final G r(Context context0, AttributeSet attributeSet0) {
        return new X(context0, attributeSet0);  // 初始化器: LN/G;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    }

    public final boolean r0() {
        int v;
        if(this.u() != 0 && this.B != 0 && this.f) {
            if(this.w) {
                v = this.B0();
                this.A0();
            }
            else {
                v = this.A0();
                this.B0();
            }
            d d0 = this.A;
            if(v == 0 && this.F0() != null) {
                int[] arr_v = d0.a;
                if(arr_v != null) {
                    Arrays.fill(arr_v, -1);
                }
                d0.b = null;
                this.e = true;
                this.f0();
                return true;
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    @Override  // N.F
    public final G s(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new X(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new X(viewGroup$LayoutParams0);  // 初始化器: LN/G;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V / 初始化器: LN/G;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
    }

    public final int s0(P p0) {
        if(this.u() == 0) {
            return 0;
        }
        View view0 = this.x0(!this.H);
        View view1 = this.w0(!this.H);
        return a.f(p0, this.q, view0, view1, this, this.H);
    }

    public final int t0(P p0) {
        if(this.u() == 0) {
            return 0;
        }
        View view0 = this.x0(!this.H);
        View view1 = this.w0(!this.H);
        return a.g(p0, this.q, view0, view1, this, this.H, this.w);
    }

    public final int u0(P p0) {
        if(this.u() == 0) {
            return 0;
        }
        View view0 = this.x0(!this.H);
        View view1 = this.w0(!this.H);
        return a.h(p0, this.q, view0, view1, this, this.H);
    }

    public final int v0(M m0, r r0, P p0) {
        int v30;
        int v27;
        int v26;
        int v23;
        int v22;
        Y y3;
        int v8;
        int v7;
        int v6;
        int v;
        this.x.set(0, this.o, true);
        r r1 = this.u;
        if(!r1.i) {
            v = r0.e == 1 ? r0.g + r0.b : r0.f - r0.b;
        }
        else if(r0.e == 1) {
            v = 0x7FFFFFFF;
        }
        else {
            v = 0x80000000;
        }
        int v1 = r0.e;
        for(int v2 = 0; v2 < this.o; ++v2) {
            if(!this.p[v2].a.isEmpty()) {
                this.S0(this.p[v2], v1, v);
            }
        }
        int v3 = this.w ? this.q.g() : this.q.j();
        boolean z;
        for(z = false; r0.c >= 0 && r0.c < p0.b() && (r1.i || !this.x.isEmpty()); z = true) {
            View view0 = m0.i(r0.c, 0x7FFFFFFFFFFFFFFFL).a;
            r0.c += r0.d;
            X x0 = (X)view0.getLayoutParams();
            int v4 = x0.a.b();
            d d0 = this.A;
            int v5 = d0.a == null || v4 >= d0.a.length ? -1 : d0.a[v4];
            if(v5 == -1) {
                if(this.J0(r0.e)) {
                    v6 = this.o - 1;
                    v7 = -1;
                    v8 = -1;
                }
                else {
                    v7 = this.o;
                    v6 = 0;
                    v8 = 1;
                }
                Y y0 = null;
                if(r0.e == 1) {
                    int v9 = this.q.j();
                    int v10 = 0x7FFFFFFF;
                    while(v6 != v7) {
                        Y y1 = this.p[v6];
                        int v11 = y1.f(v9);
                        if(v11 < v10) {
                            v10 = v11;
                            y0 = y1;
                        }
                        v6 += v8;
                    }
                }
                else {
                    int v12 = this.q.g();
                    int v13 = 0x80000000;
                    while(v6 != v7) {
                        Y y2 = this.p[v6];
                        int v14 = y2.h(v12);
                        if(v14 > v13) {
                            y0 = y2;
                            v13 = v14;
                        }
                        v6 += v8;
                    }
                }
                y3 = y0;
                d0.a(v4);
                d0.a[v4] = y3.e;
            }
            else {
                y3 = this.p[v5];
            }
            x0.e = y3;
            if(r0.e == 1) {
                this.a(view0, -1, false);
            }
            else {
                this.a(view0, 0, false);
            }
            if(this.s == 1) {
                int v15 = F.v(false, this.t, this.k, 0, x0.width);
                int v16 = this.n;
                int v17 = this.l;
                int v18 = this.B();
                this.H0(view0, v15, F.v(true, v16, v17, this.y() + v18, x0.height));
            }
            else {
                int v19 = this.m;
                int v20 = this.k;
                int v21 = this.z();
                this.H0(view0, F.v(true, v19, v20, this.A() + v21, x0.width), F.v(false, this.t, this.l, 0, x0.height));
            }
            if(r0.e == 1) {
                v22 = y3.f(v3);
                v23 = this.q.c(view0) + v22;
            }
            else {
                v23 = y3.h(v3);
                v22 = v23 - this.q.c(view0);
            }
            if(r0.e == 1) {
                Y y4 = x0.e;
                y4.getClass();
                X x1 = (X)view0.getLayoutParams();
                x1.e = y4;
                y4.a.add(view0);
                y4.c = 0x80000000;
                if(y4.a.size() == 1) {
                    y4.b = 0x80000000;
                }
                if(x1.a.h() || x1.a.k()) {
                    int v24 = y4.d;
                    y4.d = y4.f.q.c(view0) + v24;
                }
            }
            else {
                Y y5 = x0.e;
                y5.getClass();
                X x2 = (X)view0.getLayoutParams();
                x2.e = y5;
                y5.a.add(0, view0);
                y5.b = 0x80000000;
                if(y5.a.size() == 1) {
                    y5.c = 0x80000000;
                }
                if(x2.a.h() || x2.a.k()) {
                    int v25 = y5.d;
                    y5.d = y5.f.q.c(view0) + v25;
                }
            }
            if(!this.G0() || this.s != 1) {
                int v28 = y3.e * this.t;
                v27 = this.r.j() + v28;
                v26 = this.r.c(view0) + v27;
            }
            else {
                v26 = this.r.g() - (this.o - 1 - y3.e) * this.t;
                v27 = v26 - this.r.c(view0);
            }
            if(this.s == 1) {
                F.I(view0, v27, v22, v26, v23);
            }
            else {
                F.I(view0, v22, v27, v23, v26);
            }
            this.S0(y3, r1.e, v);
            this.L0(m0, r1);
            if(r1.h && view0.hasFocusable()) {
                this.x.set(y3.e, false);
            }
        }
        if(!z) {
            this.L0(m0, r1);
        }
        if(r1.e == -1) {
            int v29 = this.D0(this.q.j());
            v30 = this.q.j() - v29;
            return v30 <= 0 ? 0 : Math.min(r0.b, v30);
        }
        v30 = this.C0(this.q.g()) - this.q.g();
        return v30 <= 0 ? 0 : Math.min(r0.b, v30);
    }

    @Override  // N.F
    public final int w(M m0, P p0) {
        return this.s == 1 ? this.o : super.w(m0, p0);
    }

    public final View w0(boolean z) {
        int v = this.q.j();
        int v1 = this.q.g();
        int v2 = this.u() - 1;
        View view0 = null;
        while(v2 >= 0) {
            View view1 = this.t(v2);
            int v3 = this.q.e(view1);
            int v4 = this.q.b(view1);
            if(v4 > v && v3 < v1) {
                if(v4 <= v1 || !z) {
                    return view1;
                }
                if(view0 == null) {
                    view0 = view1;
                }
            }
            --v2;
        }
        return view0;
    }

    public final View x0(boolean z) {
        int v = this.q.j();
        int v1 = this.q.g();
        int v2 = this.u();
        View view0 = null;
        for(int v3 = 0; v3 < v2; ++v3) {
            View view1 = this.t(v3);
            int v4 = this.q.e(view1);
            if(this.q.b(view1) > v && v4 < v1) {
                if(v4 >= v || !z) {
                    return view1;
                }
                if(view0 == null) {
                    view0 = view1;
                }
            }
        }
        return view0;
    }

    public final void y0(M m0, P p0, boolean z) {
        int v = this.C0(0x80000000);
        if(v == 0x80000000) {
            return;
        }
        int v1 = this.q.g() - v;
        if(v1 > 0) {
            int v2 = v1 - -this.P0(-v1, m0, p0);
            if(z && v2 > 0) {
                this.q.o(v2);
            }
        }
    }

    public final void z0(M m0, P p0, boolean z) {
        int v = this.D0(0x7FFFFFFF);
        if(v == 0x7FFFFFFF) {
            return;
        }
        int v1 = v - this.q.j();
        if(v1 > 0) {
            int v2 = v1 - this.P0(v1, m0, p0);
            if(z && v2 > 0) {
                this.q.o(-v2);
            }
        }
    }
}

