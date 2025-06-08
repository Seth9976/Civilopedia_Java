package j;

import X2.h0;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import k.A;
import k.l;

public final class d extends ActionMode {
    public final Context a;
    public final h0 b;

    public d(Context context0, h0 h00) {
        this.a = context0;
        this.b = h00;
    }

    @Override  // android.view.ActionMode
    public final void finish() {
        this.b.b();
    }

    @Override  // android.view.ActionMode
    public final View getCustomView() {
        return this.b.c();
    }

    @Override  // android.view.ActionMode
    public final Menu getMenu() {
        l l0 = this.b.g();
        return new A(this.a, l0);
    }

    @Override  // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.b.h();
    }

    @Override  // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.b.i();
    }

    @Override  // android.view.ActionMode
    public final Object getTag() {
        return this.b.k;
    }

    @Override  // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.b.j();
    }

    @Override  // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.j;
    }

    @Override  // android.view.ActionMode
    public final void invalidate() {
        this.b.k();
    }

    @Override  // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.l();
    }

    @Override  // android.view.ActionMode
    public final void setCustomView(View view0) {
        this.b.n(view0);
    }

    @Override  // android.view.ActionMode
    public final void setSubtitle(int v) {
        this.b.o(v);
    }

    @Override  // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence0) {
        this.b.p(charSequence0);
    }

    @Override  // android.view.ActionMode
    public final void setTag(Object object0) {
        this.b.k = object0;
    }

    @Override  // android.view.ActionMode
    public final void setTitle(int v) {
        this.b.q(v);
    }

    @Override  // android.view.ActionMode
    public final void setTitle(CharSequence charSequence0) {
        this.b.r(charSequence0);
    }

    @Override  // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.b.s(z);
    }
}

