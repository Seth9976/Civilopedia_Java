package k;

import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem;

public final class q implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final s b;

    public q(s s0, MenuItem.OnActionExpandListener menuItem$OnActionExpandListener0) {
        this.b = s0;
        this.a = menuItem$OnActionExpandListener0;
    }

    @Override  // android.view.MenuItem$OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem0) {
        MenuItem menuItem1 = this.b.f(menuItem0);
        return this.a.onMenuItemActionCollapse(menuItem1);
    }

    @Override  // android.view.MenuItem$OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem0) {
        MenuItem menuItem1 = this.b.f(menuItem0);
        return this.a.onMenuItemActionExpand(menuItem1);
    }
}

