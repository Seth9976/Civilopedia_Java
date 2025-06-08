package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import k.D;
import k.d;
import k.l;
import k.n;
import k.t;
import k.w;
import k.x;
import k.y;
import k.z;

public final class j implements x {
    public f A;
    public f B;
    public h C;
    public g D;
    public final d E;
    public final Context i;
    public Context j;
    public l k;
    public final LayoutInflater l;
    public w m;
    public final int n;
    public final int o;
    public z p;
    public i q;
    public Drawable r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public final SparseBooleanArray z;

    public j(Context context0) {
        this.i = context0;
        this.l = LayoutInflater.from(context0);
        this.n = 0x7F0A0003;  // layout:abc_action_menu_layout
        this.o = 0x7F0A0002;  // layout:abc_action_menu_item_layout
        this.z = new SparseBooleanArray();
        this.E = new d(this, 1);
    }

    @Override  // k.x
    public final void a(l l0, boolean z) {
        this.e();
        f f0 = this.B;
        if(f0 != null && f0.b()) {
            f0.i.dismiss();
        }
        w w0 = this.m;
        if(w0 != null) {
            w0.a(l0, z);
        }
    }

    public final View b(n n0, View view0, ViewGroup viewGroup0) {
        View view1 = n0.getActionView();
        int v = 0;
        if(view1 == null || n0.e()) {
            y y0 = view0 instanceof y ? ((y)view0) : ((y)this.l.inflate(this.o, viewGroup0, false));
            y0.a(n0);
            ((ActionMenuItemView)y0).setItemInvoker(((ActionMenuView)this.p));
            if(this.D == null) {
                this.D = new g(this);
            }
            ((ActionMenuItemView)y0).setPopupCallback(this.D);
            view1 = (View)y0;
        }
        if(n0.C) {
            v = 8;
        }
        view1.setVisibility(v);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
        ((ActionMenuView)viewGroup0).getClass();
        if(!(viewGroup$LayoutParams0 instanceof l.l)) {
            view1.setLayoutParams(ActionMenuView.l(viewGroup$LayoutParams0));
        }
        return view1;
    }

    @Override  // k.x
    public final boolean c(n n0) {
        return false;
    }

    @Override  // k.x
    public final boolean d(D d0) {
        boolean z;
        if(!d0.hasVisibleItems()) {
            return false;
        }
        D d1 = d0;
        l l0;
        while((l0 = d1.z) != this.k) {
            d1 = (D)l0;
        }
        ViewGroup viewGroup0 = (ViewGroup)this.p;
        View view0 = null;
        if(viewGroup0 != null) {
            int v = viewGroup0.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view1 = viewGroup0.getChildAt(v1);
                if(view1 instanceof y && ((y)view1).getItemData() == d1.A) {
                    view0 = view1;
                    break;
                }
            }
        }
        if(view0 == null) {
            return false;
        }
        d0.A.getClass();
        int v2 = d0.f.size();
        for(int v3 = 0; true; ++v3) {
            z = false;
            if(v3 >= v2) {
                break;
            }
            MenuItem menuItem0 = d0.getItem(v3);
            if(menuItem0.isVisible() && menuItem0.getIcon() != null) {
                z = true;
                break;
            }
        }
        f f0 = new f(this, this.j, d0, view0);
        this.B = f0;
        f0.g = z;
        t t0 = f0.i;
        if(t0 != null) {
            t0.o(z);
        }
        f f1 = this.B;
        if(!f1.b()) {
            if(f1.e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            f1.d(0, 0, false, false);
        }
        w w0 = this.m;
        if(w0 != null) {
            w0.d(d0);
        }
        return true;
    }

    public final boolean e() {
        h h0 = this.C;
        if(h0 != null) {
            z z0 = this.p;
            if(z0 != null) {
                ((View)z0).removeCallbacks(h0);
                this.C = null;
                return true;
            }
        }
        f f0 = this.A;
        if(f0 != null) {
            if(f0.b()) {
                f0.i.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override  // k.x
    public final boolean f(n n0) {
        return false;
    }

    @Override  // k.x
    public final void g() {
        int v3;
        ViewGroup viewGroup0 = (ViewGroup)this.p;
        ArrayList arrayList0 = null;
        int v = 0;
        if(viewGroup0 != null) {
            l l0 = this.k;
            if(l0 == null) {
                v3 = 0;
            }
            else {
                l0.i();
                ArrayList arrayList1 = this.k.l();
                int v1 = arrayList1.size();
                v3 = 0;
                for(int v2 = 0; v2 < v1; ++v2) {
                    n n0 = (n)arrayList1.get(v2);
                    if(n0.f()) {
                        View view0 = viewGroup0.getChildAt(v3);
                        n n1 = view0 instanceof y ? ((y)view0).getItemData() : null;
                        View view1 = this.b(n0, view0, viewGroup0);
                        if(n0 != n1) {
                            view1.setPressed(false);
                            view1.jumpDrawablesToCurrentState();
                        }
                        if(view1 != view0) {
                            ViewGroup viewGroup1 = (ViewGroup)view1.getParent();
                            if(viewGroup1 != null) {
                                viewGroup1.removeView(view1);
                            }
                            ((ViewGroup)this.p).addView(view1, v3);
                        }
                        ++v3;
                    }
                }
            }
            while(v3 < viewGroup0.getChildCount()) {
                if(viewGroup0.getChildAt(v3) == this.q) {
                    ++v3;
                }
                else {
                    viewGroup0.removeViewAt(v3);
                }
            }
        }
        ((View)this.p).requestLayout();
        l l1 = this.k;
        if(l1 != null) {
            l1.i();
            ArrayList arrayList2 = l1.i;
            int v4 = arrayList2.size();
            for(int v5 = 0; v5 < v4; ++v5) {
                n n2 = (n)arrayList2.get(v5);
            }
        }
        l l2 = this.k;
        if(l2 != null) {
            l2.i();
            arrayList0 = l2.j;
        }
        if(this.t && arrayList0 != null) {
            int v6 = arrayList0.size();
            if(v6 == 1) {
                v = !((n)arrayList0.get(0)).C;
            }
            else if(v6 > 0) {
                v = 1;
            }
        }
        if(v == 0) {
            i i1 = this.q;
            if(i1 != null) {
                ViewParent viewParent0 = i1.getParent();
                z z0 = this.p;
                if(viewParent0 == z0) {
                    ((ViewGroup)z0).removeView(this.q);
                }
            }
        }
        else {
            if(this.q == null) {
                this.q = new i(this, this.i);
            }
            ViewGroup viewGroup2 = (ViewGroup)this.q.getParent();
            if(viewGroup2 != this.p) {
                if(viewGroup2 != null) {
                    viewGroup2.removeView(this.q);
                }
                ActionMenuView actionMenuView0 = (ActionMenuView)this.p;
                i i0 = this.q;
                actionMenuView0.getClass();
                l.l l3 = ActionMenuView.k();
                l3.c = true;
                actionMenuView0.addView(i0, l3);
            }
        }
        ((ActionMenuView)this.p).setOverflowReserved(this.t);
    }

    public final boolean h() {
        return this.A != null && this.A.b();
    }

    @Override  // k.x
    public final void i(w w0) {
        throw null;
    }

    @Override  // k.x
    public final void j(Context context0, l l0) {
        this.j = context0;
        LayoutInflater.from(context0);
        this.k = l0;
        Resources resources0 = context0.getResources();
        if(!this.u) {
            this.t = true;
        }
        int v = 2;
        this.v = context0.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration0 = context0.getResources().getConfiguration();
        int v1 = configuration0.screenWidthDp;
        int v2 = configuration0.screenHeightDp;
        if(configuration0.smallestScreenWidthDp > 600 || v1 > 600 || v1 > 960 && v2 > 720 || v1 > 720 && v2 > 960) {
            v = 5;
        }
        else if(v1 >= 500 || v1 > 640 && v2 > 480 || v1 > 480 && v2 > 640) {
            v = 4;
        }
        else if(v1 >= 360) {
            v = 3;
        }
        this.x = v;
        int v3 = this.v;
        if(this.t) {
            if(this.q == null) {
                i i0 = new i(this, this.i);
                this.q = i0;
                if(this.s) {
                    i0.setImageDrawable(this.r);
                    this.r = null;
                    this.s = false;
                }
                this.q.measure(0, 0);
            }
            v3 -= this.q.getMeasuredWidth();
        }
        else {
            this.q = null;
        }
        this.w = v3;
        resources0.getDisplayMetrics();
    }

    @Override  // k.x
    public final boolean k() {
        int v;
        ArrayList arrayList0;
        l l0 = this.k;
        if(l0 == null) {
            arrayList0 = null;
            v = 0;
        }
        else {
            arrayList0 = l0.l();
            v = arrayList0.size();
        }
        int v1 = this.x;
        int v2 = this.w;
        ViewGroup viewGroup0 = (ViewGroup)this.p;
        boolean z = false;
        int v4 = 0;
        int v5 = 0;
        for(int v3 = 0; v3 < v; ++v3) {
            n n0 = (n)arrayList0.get(v3);
            int v6 = n0.y;
            if((v6 & 2) == 2) {
                ++v4;
            }
            else if((v6 & 1) == 1) {
                ++v5;
            }
            else {
                z = true;
            }
            if(this.y && n0.C) {
                v1 = 0;
            }
        }
        if(this.t && (z || v5 + v4 > v1)) {
            --v1;
        }
        int v7 = v1 - v4;
        SparseBooleanArray sparseBooleanArray0 = this.z;
        sparseBooleanArray0.clear();
        int v9 = 0;
        for(int v8 = 0; v8 < v; ++v8) {
            n n1 = (n)arrayList0.get(v8);
            int v10 = n1.y;
            int v11 = n1.b;
            if((v10 & 2) == 2) {
                View view0 = this.b(n1, null, viewGroup0);
                view0.measure(0, 0);
                int v12 = view0.getMeasuredWidth();
                v2 -= v12;
                if(v9 == 0) {
                    v9 = v12;
                }
                if(v11 != 0) {
                    sparseBooleanArray0.put(v11, true);
                }
                n1.g(true);
            }
            else if((v10 & 1) == 1) {
                boolean z1 = sparseBooleanArray0.get(v11);
                int v13 = v7 <= 0 && !z1 || v2 <= 0 ? 0 : 1;
                if(v13 != 0) {
                    View view1 = this.b(n1, null, viewGroup0);
                    view1.measure(0, 0);
                    int v14 = view1.getMeasuredWidth();
                    v2 -= v14;
                    if(v9 == 0) {
                        v9 = v14;
                    }
                    v13 &= (v2 + v9 <= 0 ? 0 : 1);
                }
                if(v13 != 0 && v11 != 0) {
                    sparseBooleanArray0.put(v11, true);
                }
                else if(z1) {
                    sparseBooleanArray0.put(v11, false);
                    for(int v15 = 0; v15 < v8; ++v15) {
                        n n2 = (n)arrayList0.get(v15);
                        if(n2.b == v11) {
                            if(n2.f()) {
                                ++v7;
                            }
                            n2.g(false);
                        }
                    }
                }
                if(v13 != 0) {
                    --v7;
                }
                n1.g(((boolean)v13));
            }
            else {
                n1.g(false);
            }
        }
        return true;
    }

    public final boolean l() {
        if(this.t && !this.h()) {
            l l0 = this.k;
            if(l0 != null && this.p != null && this.C == null) {
                l0.i();
                if(!l0.j.isEmpty()) {
                    h h0 = new h(this, new f(this, this.j, this.k, this.q));
                    this.C = h0;
                    ((View)this.p).post(h0);
                    w w0 = this.m;
                    if(w0 != null) {
                        w0.d(null);
                    }
                    return true;
                }
            }
        }
        return false;
    }
}

