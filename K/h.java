package k;

import B.k;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import f.d;

public final class h implements AdapterView.OnItemClickListener, x {
    public Context i;
    public LayoutInflater j;
    public l k;
    public ExpandedMenuView l;
    public w m;
    public g n;

    public h(ContextWrapper contextWrapper0) {
        this.i = contextWrapper0;
        this.j = LayoutInflater.from(contextWrapper0);
    }

    @Override  // k.x
    public final void a(l l0, boolean z) {
        w w0 = this.m;
        if(w0 != null) {
            w0.a(l0, z);
        }
    }

    @Override  // k.x
    public final boolean c(n n0) {
        return false;
    }

    @Override  // k.x
    public final boolean d(D d0) {
        if(!d0.hasVisibleItems()) {
            return false;
        }
        m m0 = new m();  // 初始化器: Ljava/lang/Object;-><init>()V
        m0.i = d0;
        k k0 = new k(d0.a);
        d d1 = (d)k0.j;
        h h0 = new h(d1.a);
        m0.k = h0;
        h0.m = m0;
        d0.b(h0, d0.a);
        h h1 = m0.k;
        if(h1.n == null) {
            h1.n = new g(h1);
        }
        d1.g = h1.n;
        d1.h = m0;
        View view0 = d0.o;
        if(view0 == null) {
            d1.c = d0.n;
            d1.d = d0.m;
        }
        else {
            d1.e = view0;
        }
        d1.f = m0;
        f.g g0 = k0.a();
        m0.j = g0;
        g0.setOnDismissListener(m0);
        WindowManager.LayoutParams windowManager$LayoutParams0 = m0.j.getWindow().getAttributes();
        windowManager$LayoutParams0.type = 1003;
        windowManager$LayoutParams0.flags |= 0x20000;
        m0.j.show();
        w w0 = this.m;
        if(w0 != null) {
            w0.d(d0);
        }
        return true;
    }

    @Override  // k.x
    public final boolean f(n n0) {
        return false;
    }

    @Override  // k.x
    public final void g() {
        g g0 = this.n;
        if(g0 != null) {
            g0.notifyDataSetChanged();
        }
    }

    @Override  // k.x
    public final void i(w w0) {
        throw null;
    }

    @Override  // k.x
    public final void j(Context context0, l l0) {
        if(this.i != null) {
            this.i = context0;
            if(this.j == null) {
                this.j = LayoutInflater.from(context0);
            }
        }
        this.k = l0;
        g g0 = this.n;
        if(g0 != null) {
            g0.notifyDataSetChanged();
        }
    }

    @Override  // k.x
    public final boolean k() {
        return false;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        this.k.q(this.n.b(v), this, 0);
    }
}

