package l;

import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

public final class d0 implements AdapterView.OnItemSelectedListener {
    public final int i;
    public final Object j;

    public d0(Object object0, int v) {
        this.i = v;
        this.j = object0;
        super();
    }

    private final void a(AdapterView adapterView0) {
    }

    private final void b(AdapterView adapterView0) {
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView0, View view0, int v, long v1) {
        if(this.i != 0) {
            ((SearchView)this.j).p(v);
            return;
        }
        if(v != -1) {
            Y y0 = ((g0)this.j).k;
            if(y0 != null) {
                y0.setListSelectionHidden(false);
            }
        }
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView0) {
    }
}

