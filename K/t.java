package k;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

public abstract class t implements AdapterView.OnItemClickListener, B, x {
    public Rect i;

    @Override  // k.x
    public final boolean c(n n0) {
        return false;
    }

    @Override  // k.x
    public final boolean f(n n0) {
        return false;
    }

    @Override  // k.x
    public final void j(Context context0, l l0) {
    }

    public abstract void l(l arg1);

    public static int m(ListAdapter listAdapter0, Context context0, int v) {
        int v2 = listAdapter0.getCount();
        FrameLayout frameLayout0 = null;
        View view0 = null;
        int v3 = 0;
        int v4 = 0;
        for(int v1 = 0; v1 < v2; ++v1) {
            int v5 = listAdapter0.getItemViewType(v1);
            if(v5 != v4) {
                view0 = null;
                v4 = v5;
            }
            if(frameLayout0 == null) {
                frameLayout0 = new FrameLayout(context0);
            }
            view0 = listAdapter0.getView(v1, view0, frameLayout0);
            view0.measure(0, 0);
            int v6 = view0.getMeasuredWidth();
            if(v6 >= v) {
                return v;
            }
            if(v6 > v3) {
                v3 = v6;
            }
        }
        return v3;
    }

    public abstract void n(View arg1);

    public abstract void o(boolean arg1);

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        ListAdapter listAdapter0 = (ListAdapter)adapterView0.getAdapter();
        (listAdapter0 instanceof HeaderViewListAdapter ? ((i)((HeaderViewListAdapter)listAdapter0).getWrappedAdapter()) : ((i)listAdapter0)).i.q(((MenuItem)listAdapter0.getItem(v)), this, (this instanceof f ? 4 : 0));
    }

    public abstract void p(int arg1);

    public abstract void q(int arg1);

    public abstract void r(PopupWindow.OnDismissListener arg1);

    public abstract void s(boolean arg1);

    public abstract void t(int arg1);

    public static boolean u(l l0) {
        int v = l0.f.size();
        for(int v1 = 0; v1 < v; ++v1) {
            MenuItem menuItem0 = l0.getItem(v1);
            if(menuItem0.isVisible() && menuItem0.getIcon() != null) {
                return true;
            }
        }
        return false;
    }
}

