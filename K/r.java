package k;

import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;

public final class r implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener a;
    public final s b;

    public r(s s0, MenuItem.OnMenuItemClickListener menuItem$OnMenuItemClickListener0) {
        this.b = s0;
        this.a = menuItem$OnMenuItemClickListener0;
    }

    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        MenuItem menuItem1 = this.b.f(menuItem0);
        return this.a.onMenuItemClick(menuItem1);
    }
}

