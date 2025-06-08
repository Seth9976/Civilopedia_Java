package k;

import Z1.i;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View.OnKeyListener;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import l.O;
import l.S;
import l.Y;
import l.j0;
import l.y;

public final class f extends t implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public w E;
    public ViewTreeObserver F;
    public u G;
    public boolean H;
    public final Context j;
    public final int k;
    public final int l;
    public final boolean m;
    public final Handler n;
    public final ArrayList o;
    public final ArrayList p;
    public final Z1.f q;
    public final i r;
    public final d s;
    public int t;
    public int u;
    public View v;
    public View w;
    public int x;
    public boolean y;
    public boolean z;

    public f(Context context0, View view0, int v, boolean z) {
        int v1 = 0;
        super();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new Z1.f(this, 1);
        this.r = new i(this, 1);
        this.s = new d(this, 0);
        this.t = 0;
        this.u = 0;
        this.j = context0;
        this.v = view0;
        this.l = v;
        this.m = z;
        this.C = false;
        if(view0.getLayoutDirection() != 1) {
            v1 = 1;
        }
        this.x = v1;
        Resources resources0 = context0.getResources();
        this.k = Math.max(resources0.getDisplayMetrics().widthPixels / 2, resources0.getDimensionPixelSize(0x7F050017));  // dimen:abc_config_prefDialogWidth
        this.n = new Handler();
    }

    @Override  // k.x
    public final void a(l l0, boolean z) {
        ArrayList arrayList0 = this.p;
        int v = arrayList0.size();
        int v1;
        for(v1 = 0; true; ++v1) {
            if(v1 >= v) {
                v1 = -1;
                break;
            }
            if(l0 == ((e)arrayList0.get(v1)).b) {
                break;
            }
        }
        if(v1 < 0) {
            return;
        }
        if(v1 + 1 < arrayList0.size()) {
            ((e)arrayList0.get(v1 + 1)).b.c(false);
        }
        e e0 = (e)arrayList0.remove(v1);
        e0.b.r(this);
        j0 j00 = e0.a;
        if(this.H) {
            if(Build.VERSION.SDK_INT >= 23) {
                O.y(j00.G);
            }
            j00.G.setAnimationStyle(0);
        }
        j00.dismiss();
        int v2 = arrayList0.size();
        if(v2 > 0) {
            this.x = ((e)arrayList0.get(v2 - 1)).c;
        }
        else {
            this.x = this.v.getLayoutDirection() == 1 ? 0 : 1;
        }
        if(v2 == 0) {
            this.dismiss();
            w w0 = this.E;
            if(w0 != null) {
                w0.a(l0, true);
            }
            ViewTreeObserver viewTreeObserver0 = this.F;
            if(viewTreeObserver0 != null) {
                if(viewTreeObserver0.isAlive()) {
                    this.F.removeGlobalOnLayoutListener(this.q);
                }
                this.F = null;
            }
            this.w.removeOnAttachStateChangeListener(this.r);
            this.G.onDismiss();
            return;
        }
        if(z) {
            ((e)arrayList0.get(0)).b.c(false);
        }
    }

    @Override  // k.B
    public final boolean b() {
        return this.p.size() > 0 && ((e)this.p.get(0)).a.G.isShowing();
    }

    @Override  // k.x
    public final boolean d(D d0) {
        for(Object object0: this.p) {
            e e0 = (e)object0;
            if(d0 == e0.b) {
                e0.a.k.requestFocus();
                return true;
            }
            if(false) {
                break;
            }
        }
        if(d0.hasVisibleItems()) {
            this.l(d0);
            w w0 = this.E;
            if(w0 != null) {
                w0.d(d0);
            }
            return true;
        }
        return false;
    }

    @Override  // k.B
    public final void dismiss() {
        ArrayList arrayList0 = this.p;
        int v = arrayList0.size();
        if(v > 0) {
            e[] arr_e = (e[])arrayList0.toArray(new e[v]);
            for(int v1 = v - 1; v1 >= 0; --v1) {
                e e0 = arr_e[v1];
                if(e0.a.G.isShowing()) {
                    e0.a.dismiss();
                }
            }
        }
    }

    @Override  // k.B
    public final void e() {
        if(this.b()) {
            return;
        }
        ArrayList arrayList0 = this.o;
        for(Object object0: arrayList0) {
            this.v(((l)object0));
        }
        arrayList0.clear();
        View view0 = this.v;
        this.w = view0;
        if(view0 != null) {
            boolean z = this.F == null;
            ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
            this.F = viewTreeObserver0;
            if(z) {
                viewTreeObserver0.addOnGlobalLayoutListener(this.q);
            }
            this.w.addOnAttachStateChangeListener(this.r);
        }
    }

    @Override  // k.x
    public final void g() {
        for(Object object0: this.p) {
            ListAdapter listAdapter0 = ((e)object0).a.k.getAdapter();
            (listAdapter0 instanceof HeaderViewListAdapter ? ((k.i)((HeaderViewListAdapter)listAdapter0).getWrappedAdapter()) : ((k.i)listAdapter0)).notifyDataSetChanged();
        }
    }

    // 去混淆评级： 低(20)
    @Override  // k.B
    public final Y h() {
        return this.p.isEmpty() ? null : ((e)this.p.get(this.p.size() - 1)).a.k;
    }

    @Override  // k.x
    public final void i(w w0) {
        this.E = w0;
    }

    @Override  // k.x
    public final boolean k() {
        return false;
    }

    @Override  // k.t
    public final void l(l l0) {
        l0.b(this, this.j);
        if(this.b()) {
            this.v(l0);
            return;
        }
        this.o.add(l0);
    }

    @Override  // k.t
    public final void n(View view0) {
        if(this.v != view0) {
            this.v = view0;
            this.u = Gravity.getAbsoluteGravity(this.t, view0.getLayoutDirection());
        }
    }

    @Override  // k.t
    public final void o(boolean z) {
        this.C = z;
    }

    @Override  // android.widget.PopupWindow$OnDismissListener
    public final void onDismiss() {
        e e0;
        ArrayList arrayList0 = this.p;
        int v = arrayList0.size();
        for(int v1 = 0; true; ++v1) {
            e0 = null;
            if(v1 >= v) {
                break;
            }
            e e1 = (e)arrayList0.get(v1);
            if(!e1.a.G.isShowing()) {
                e0 = e1;
                break;
            }
        }
        if(e0 != null) {
            e0.b.c(false);
        }
    }

    @Override  // android.view.View$OnKeyListener
    public final boolean onKey(View view0, int v, KeyEvent keyEvent0) {
        if(keyEvent0.getAction() == 1 && v == 82) {
            this.dismiss();
            return true;
        }
        return false;
    }

    @Override  // k.t
    public final void p(int v) {
        if(this.t != v) {
            this.t = v;
            this.u = Gravity.getAbsoluteGravity(v, this.v.getLayoutDirection());
        }
    }

    @Override  // k.t
    public final void q(int v) {
        this.y = true;
        this.A = v;
    }

    @Override  // k.t
    public final void r(PopupWindow.OnDismissListener popupWindow$OnDismissListener0) {
        this.G = (u)popupWindow$OnDismissListener0;
    }

    @Override  // k.t
    public final void s(boolean z) {
        this.D = z;
    }

    @Override  // k.t
    public final void t(int v) {
        this.z = true;
        this.B = v;
    }

    public final void v(l l0) {
        int v14;
        int v11;
        int v10;
        int v9;
        View view0;
        k.i i1;
        int v3;
        e e0;
        Context context0 = this.j;
        LayoutInflater layoutInflater0 = LayoutInflater.from(context0);
        k.i i0 = new k.i(l0, layoutInflater0, this.m, 0x7F0A000B);  // layout:abc_cascading_menu_item_layout
        if(!this.b() && this.C) {
            i0.k = true;
        }
        else if(this.b()) {
            i0.k = t.u(l0);
        }
        int v = t.m(i0, context0, this.k);
        j0 j00 = new j0(context0, null, this.l);  // 初始化器: Ll/g0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
        y y0 = j00.G;
        j00.K = this.s;
        j00.x = this;
        y0.setOnDismissListener(this);
        j00.w = this.v;
        j00.t = this.u;
        j00.F = true;
        y0.setFocusable(true);
        y0.setInputMethodMode(2);
        j00.p(i0);
        j00.r(v);
        j00.t = this.u;
        ArrayList arrayList0 = this.p;
        if(arrayList0.size() > 0) {
            e0 = (e)arrayList0.get(arrayList0.size() - 1);
            l l1 = e0.b;
            int v1 = l1.f.size();
            for(int v2 = 0; true; ++v2) {
                MenuItem menuItem0 = null;
                if(v2 >= v1) {
                    break;
                }
                MenuItem menuItem1 = l1.getItem(v2);
                if(menuItem1.hasSubMenu() && l0 == menuItem1.getSubMenu()) {
                    menuItem0 = menuItem1;
                    break;
                }
            }
            if(menuItem0 == null) {
                view0 = null;
            }
            else {
                Y y1 = e0.a.k;
                ListAdapter listAdapter0 = y1.getAdapter();
                if(listAdapter0 instanceof HeaderViewListAdapter) {
                    v3 = ((HeaderViewListAdapter)listAdapter0).getHeadersCount();
                    i1 = (k.i)((HeaderViewListAdapter)listAdapter0).getWrappedAdapter();
                }
                else {
                    i1 = (k.i)listAdapter0;
                    v3 = 0;
                }
                int v4 = i1.getCount();
                int v5;
                for(v5 = 0; true; ++v5) {
                    if(v5 >= v4) {
                        v5 = -1;
                        break;
                    }
                    if(menuItem0 == i1.b(v5)) {
                        break;
                    }
                }
                if(v5 == -1) {
                    view0 = null;
                }
                else {
                    int v6 = v5 + v3 - y1.getFirstVisiblePosition();
                    view0 = v6 < 0 || v6 >= y1.getChildCount() ? null : y1.getChildAt(v6);
                }
            }
        }
        else {
            view0 = null;
            e0 = null;
        }
        if(view0 == null) {
            if(this.y) {
                j00.n = this.A;
            }
            if(this.z) {
                j00.i(this.B);
            }
            j00.E = this.i == null ? null : new Rect(this.i);
        }
        else {
            if(Build.VERSION.SDK_INT <= 28) {
                Method method0 = j0.L;
                if(method0 != null) {
                    try {
                        method0.invoke(y0, Boolean.FALSE);
                    }
                    catch(Exception unused_ex) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            }
            else {
                S.i(y0);
            }
            int v7 = Build.VERSION.SDK_INT;
            if(v7 >= 23) {
                O.v(y0);
            }
            Y y2 = ((e)arrayList0.get(arrayList0.size() - 1)).a.k;
            int[] arr_v = new int[2];
            y2.getLocationOnScreen(arr_v);
            Rect rect0 = new Rect();
            this.w.getWindowVisibleDisplayFrame(rect0);
            if(this.x == 1) {
                int v8 = arr_v[0];
                v9 = y2.getWidth() + v8 + v <= rect0.right ? 1 : 0;
            }
            else {
                v9 = arr_v[0] - v >= 0 ? 0 : 1;
            }
            this.x = v9;
            if(v7 >= 26) {
                j00.w = view0;
                v10 = 0;
                v11 = 0;
            }
            else {
                int[] arr_v1 = new int[2];
                this.v.getLocationOnScreen(arr_v1);
                int[] arr_v2 = new int[2];
                view0.getLocationOnScreen(arr_v2);
                if((this.u & 7) == 5) {
                    int v12 = arr_v1[0];
                    arr_v1[0] = this.v.getWidth() + v12;
                    int v13 = arr_v2[0];
                    arr_v2[0] = view0.getWidth() + v13;
                }
                v11 = arr_v2[0] - arr_v1[0];
                v10 = arr_v2[1] - arr_v1[1];
            }
            if((this.u & 5) != 5) {
                v14 = v9 == 1 ? v11 - v : v11 + view0.getWidth();
            }
            else if(v9 == 1) {
                v14 = v11 + v;
            }
            else {
                v14 = v11 - view0.getWidth();
            }
            j00.n = v14;
            j00.s = true;
            j00.r = true;
            j00.i(v10);
        }
        arrayList0.add(new e(j00, l0, this.x));
        j00.e();
        Y y3 = j00.k;
        y3.setOnKeyListener(this);
        if(e0 == null && this.D && l0.m != null) {
            FrameLayout frameLayout0 = (FrameLayout)layoutInflater0.inflate(0x7F0A0012, y3, false);  // layout:abc_popup_menu_header_item_layout
            TextView textView0 = (TextView)frameLayout0.findViewById(0x1020016);
            frameLayout0.setEnabled(false);
            textView0.setText(l0.m);
            y3.addHeaderView(frameLayout0, null, false);
            j00.e();
        }
    }
}

