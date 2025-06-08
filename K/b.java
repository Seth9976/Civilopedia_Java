package k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.b0;
import l.f;
import l.g;
import l.i;
import l.j;

public final class b extends b0 {
    public final int r;
    public final View s;

    public b(ActionMenuItemView actionMenuItemView0) {
        this.r = 0;
        this.s = actionMenuItemView0;
        super(actionMenuItemView0);
    }

    public b(i i0, i i1) {
        this.r = 1;
        this.s = i0;
        super(i1);
    }

    @Override  // l.b0
    public final B b() {
        if(this.r != 0) {
            f f0 = ((i)this.s).k.A;
            return f0 == null ? null : f0.a();
        }
        c c0 = ((ActionMenuItemView)this.s).r;
        if(c0 != null) {
            f f1 = ((g)c0).a.B;
            if(f1 != null) {
                return f1.a();
            }
        }
        return null;
    }

    @Override  // l.b0
    public final boolean c() {
        if(this.r != 0) {
            ((i)this.s).k.l();
            return true;
        }
        k k0 = ((ActionMenuItemView)this.s).p;
        if(k0 != null && k0.a(((ActionMenuItemView)this.s).m)) {
            B b0 = this.b();
            return b0 != null && b0.b();
        }
        return false;
    }

    @Override  // l.b0
    public boolean d() {
        if(this.r != 1) {
            return super.d();
        }
        j j0 = ((i)this.s).k;
        if(j0.C != null) {
            return false;
        }
        j0.e();
        return true;
    }
}

