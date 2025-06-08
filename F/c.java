package f;

import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;

public final class c implements AdapterView.OnItemClickListener {
    public final f i;
    public final d j;

    public c(d d0, f f0) {
        this.j = d0;
        this.i = f0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        f f0 = this.i;
        this.j.h.onClick(f0.b, v);
        if(!this.j.i) {
            f0.b.dismiss();
        }
    }
}

