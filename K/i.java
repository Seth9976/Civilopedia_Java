package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

public final class i extends BaseAdapter {
    public final l i;
    public int j;
    public boolean k;
    public final boolean l;
    public final LayoutInflater m;
    public final int n;

    public i(l l0, LayoutInflater layoutInflater0, boolean z, int v) {
        this.j = -1;
        this.l = z;
        this.m = layoutInflater0;
        this.i = l0;
        this.n = v;
        this.a();
    }

    public final void a() {
        l l0 = this.i;
        n n0 = l0.v;
        if(n0 != null) {
            l0.i();
            ArrayList arrayList0 = l0.j;
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                if(((n)arrayList0.get(v1)) == n0) {
                    this.j = v1;
                    return;
                }
            }
        }
        this.j = -1;
    }

    public final n b(int v) {
        ArrayList arrayList0;
        l l0 = this.i;
        if(this.l) {
            l0.i();
            arrayList0 = l0.j;
        }
        else {
            arrayList0 = l0.l();
        }
        if(this.j >= 0 && v >= this.j) {
            ++v;
        }
        return (n)arrayList0.get(v);
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        l l0 = this.i;
        if(this.l) {
            l0.i();
            return this.j >= 0 ? l0.j.size() - 1 : l0.j.size();
        }
        ArrayList arrayList0 = l0.l();
        return this.j >= 0 ? arrayList0.size() - 1 : arrayList0.size();
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.b(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return (long)v;
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        boolean z = false;
        if(view0 == null) {
            view0 = this.m.inflate(this.n, viewGroup0, false);
        }
        int v1 = this.b(v).b;
        int v2 = v - 1 < 0 ? v1 : this.b(v - 1).b;
        if(this.i.m() && v1 != v2) {
            z = true;
        }
        ((ListMenuItemView)view0).setGroupDividerEnabled(z);
        if(this.k) {
            ((ListMenuItemView)view0).setForceShowIcon(true);
        }
        ((y)view0).a(this.b(v));
        return view0;
    }

    @Override  // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        this.a();
        super.notifyDataSetChanged();
    }
}

