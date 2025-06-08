package j;

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

public final class c extends h0 implements j {
    public Context l;
    public ActionBarContextView m;
    public B.c n;
    public WeakReference o;
    public boolean p;
    public l q;

    @Override  // X2.h0
    public final void b() {
        if(this.p) {
            return;
        }
        this.p = true;
        this.m.sendAccessibilityEvent(0x20);
        this.n.B(this);
    }

    @Override  // X2.h0
    public final View c() {
        return this.o == null ? null : ((View)this.o.get());
    }

    @Override  // k.j
    public final boolean d(l l0, MenuItem menuItem0) {
        return ((g)this.n.j).j(this, menuItem0);
    }

    @Override  // k.j
    public final void e(l l0) {
        this.k();
        l.j j0 = this.m.l;
        if(j0 != null) {
            j0.l();
        }
    }

    @Override  // X2.h0
    public final l g() {
        return this.q;
    }

    @Override  // X2.h0
    public final MenuInflater h() {
        return new j.g(this.m.getContext());
    }

    @Override  // X2.h0
    public final CharSequence i() {
        return this.m.getSubtitle();
    }

    @Override  // X2.h0
    public final CharSequence j() {
        return this.m.getTitle();
    }

    @Override  // X2.h0
    public final void k() {
        this.n.C(this, this.q);
    }

    @Override  // X2.h0
    public final boolean l() {
        return this.m.z;
    }

    @Override  // X2.h0
    public final void n(View view0) {
        this.m.setCustomView(view0);
        this.o = view0 == null ? null : new WeakReference(view0);
    }

    @Override  // X2.h0
    public final void o(int v) {
        this.p(this.l.getString(v));
    }

    @Override  // X2.h0
    public final void p(CharSequence charSequence0) {
        this.m.setSubtitle(charSequence0);
    }

    @Override  // X2.h0
    public final void q(int v) {
        this.r(this.l.getString(v));
    }

    @Override  // X2.h0
    public final void r(CharSequence charSequence0) {
        this.m.setTitle(charSequence0);
    }

    @Override  // X2.h0
    public final void s(boolean z) {
        this.j = z;
        this.m.setTitleOptional(z);
    }
}

