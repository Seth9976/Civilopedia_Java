package k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public final class g extends BaseAdapter {
    public int i;
    public final h j;

    public g(h h0) {
        this.j = h0;
        super();
        this.i = -1;
        this.a();
    }

    public final void a() {
        l l0 = this.j.k;
        n n0 = l0.v;
        if(n0 != null) {
            l0.i();
            ArrayList arrayList0 = l0.j;
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                if(((n)arrayList0.get(v1)) == n0) {
                    this.i = v1;
                    return;
                }
            }
        }
        this.i = -1;
    }

    public final n b(int v) {
        l l0 = this.j.k;
        l0.i();
        ArrayList arrayList0 = l0.j;
        this.j.getClass();
        if(this.i >= 0 && v >= this.i) {
            ++v;
        }
        return (n)arrayList0.get(v);
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        l l0 = this.j.k;
        l0.i();
        int v = l0.j.size();
        this.j.getClass();
        return this.i >= 0 ? v - 1 : v;
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
        if(view0 == null) {
            view0 = this.j.j.inflate(0x7F0A0010, viewGroup0, false);  // layout:abc_list_menu_item_layout
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

