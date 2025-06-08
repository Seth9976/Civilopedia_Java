package f;

import X2.h0;
import android.view.View.OnClickListener;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import k.n;
import l.E0;

public final class a implements View.OnClickListener {
    public final int i;
    public final Object j;

    public a(Object object0, int v) {
        this.i = v;
        this.j = object0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        switch(this.i) {
            case 0: {
                ((f)this.j).v.obtainMessage(1, ((f)this.j).b).sendToTarget();
                return;
            }
            case 1: {
                ((h0)this.j).b();
                return;
            }
            default: {
                E0 e00 = ((Toolbar)this.j).R;
                n n0 = e00 == null ? null : e00.j;
                if(n0 != null) {
                    n0.collapseActionView();
                }
            }
        }
    }
}

