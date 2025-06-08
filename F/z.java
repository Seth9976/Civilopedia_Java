package f;

import B.c;
import X2.h0;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import f0.g;
import java.lang.ref.WeakReference;
import k.j;
import k.l;
import l.I0;

public final class z extends h0 implements j {
    public final Context l;
    public final l m;
    public c n;
    public WeakReference o;
    public final A p;

    public z(A a0, Context context0, c c0) {
        this.p = a0;
        this.l = context0;
        this.n = c0;
        l l0 = new l(context0);
        l0.l = 1;
        this.m = l0;
        l0.e = this;
    }

    @Override  // X2.h0
    public final void b() {
        A a0 = this.p;
        if(a0.l != this) {
            return;
        }
        if(a0.s) {
            a0.m = this;
            a0.n = this.n;
        }
        else {
            this.n.B(this);
        }
        this.n = null;
        a0.Y(false);
        ActionBarContextView actionBarContextView0 = a0.i;
        if(actionBarContextView0.s == null) {
            actionBarContextView0.removeAllViews();
            actionBarContextView0.t = null;
            actionBarContextView0.k = null;
        }
        ((I0)a0.h).a.sendAccessibilityEvent(0x20);
        a0.f.setHideOnContentScrollEnabled(a0.x);
        a0.l = null;
    }

    @Override  // X2.h0
    public final View c() {
        return this.o == null ? null : ((View)this.o.get());
    }

    @Override  // k.j
    public final boolean d(l l0, MenuItem menuItem0) {
        return this.n == null ? false : ((g)this.n.j).j(this, menuItem0);
    }

    @Override  // k.j
    public final void e(l l0) {
        if(this.n == null) {
            return;
        }
        this.k();
        l.j j0 = this.p.i.l;
        if(j0 != null) {
            j0.l();
        }
    }

    @Override  // X2.h0
    public final l g() {
        return this.m;
    }

    @Override  // X2.h0
    public final MenuInflater h() {
        return new j.g(this.l);
    }

    @Override  // X2.h0
    public final CharSequence i() {
        return this.p.i.getSubtitle();
    }

    @Override  // X2.h0
    public final CharSequence j() {
        return this.p.i.getTitle();
    }

    @Override  // X2.h0
    public final void k() {
        if(this.p.l != this) {
            return;
        }
        this.m.w();
        try {
            this.n.C(this, this.m);
        }
        finally {
            this.m.v();
        }
    }

    @Override  // X2.h0
    public final boolean l() {
        return this.p.i.z;
    }

    @Override  // X2.h0
    public final void n(View view0) {
        this.p.i.setCustomView(view0);
        this.o = new WeakReference(view0);
    }

    @Override  // X2.h0
    public final void o(int v) {
        this.p(this.p.d.getResources().getString(v));
    }

    @Override  // X2.h0
    public final void p(CharSequence charSequence0) {
        this.p.i.setSubtitle(charSequence0);
    }

    @Override  // X2.h0
    public final void q(int v) {
        this.r(this.p.d.getResources().getString(v));
    }

    @Override  // X2.h0
    public final void r(CharSequence charSequence0) {
        this.p.i.setTitle(charSequence0);
    }

    @Override  // X2.h0
    public final void s(boolean z) {
        this.j = z;
        this.p.i.setTitleOptional(z);
    }
}

