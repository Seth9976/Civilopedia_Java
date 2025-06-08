package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import k.i;
import k.l;
import k.n;

public final class i0 extends Y {
    public final int v;
    public final int w;
    public h0 x;
    public n y;

    public i0(Context context0, boolean z) {
        super(context0, z);
        if(1 == context0.getResources().getConfiguration().getLayoutDirection()) {
            this.v = 21;
            this.w = 22;
            return;
        }
        this.v = 22;
        this.w = 21;
    }

    @Override  // l.Y
    public final boolean onHoverEvent(MotionEvent motionEvent0) {
        n n0;
        i i0;
        int v;
        if(this.x != null) {
            ListAdapter listAdapter0 = this.getAdapter();
            if(listAdapter0 instanceof HeaderViewListAdapter) {
                v = ((HeaderViewListAdapter)listAdapter0).getHeadersCount();
                i0 = (i)((HeaderViewListAdapter)listAdapter0).getWrappedAdapter();
            }
            else {
                i0 = (i)listAdapter0;
                v = 0;
            }
            if(motionEvent0.getAction() == 10) {
                n0 = null;
            }
            else {
                int v1 = this.pointToPosition(((int)motionEvent0.getX()), ((int)motionEvent0.getY()));
                if(v1 == -1) {
                    n0 = null;
                }
                else {
                    int v2 = v1 - v;
                    n0 = v2 < 0 || v2 >= i0.getCount() ? null : i0.b(v2);
                }
            }
            n n1 = this.y;
            if(n1 != n0) {
                l l0 = i0.i;
                if(n1 != null) {
                    this.x.j(l0, n1);
                }
                this.y = n0;
                if(n0 != null) {
                    this.x.c(l0, n0);
                }
            }
        }
        return super.onHoverEvent(motionEvent0);
    }

    @Override  // android.widget.ListView
    public final boolean onKeyDown(int v, KeyEvent keyEvent0) {
        ListMenuItemView listMenuItemView0 = (ListMenuItemView)this.getSelectedView();
        if(listMenuItemView0 != null && v == this.v) {
            if(listMenuItemView0.isEnabled() && listMenuItemView0.getItemData().hasSubMenu()) {
                this.performItemClick(listMenuItemView0, this.getSelectedItemPosition(), this.getSelectedItemId());
            }
            return true;
        }
        if(listMenuItemView0 != null && v == this.w) {
            this.setSelection(-1);
            ((i)this.getAdapter()).i.c(false);
            return true;
        }
        return super.onKeyDown(v, keyEvent0);
    }

    public void setHoverListener(h0 h00) {
        this.x = h00;
    }

    @Override  // l.Y
    public void setSelector(Drawable drawable0) {
        super.setSelector(drawable0);
    }
}

