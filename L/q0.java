package l;

import H.c;
import androidx.appcompat.widget.SearchView;

public final class q0 implements Runnable {
    public final int i;
    public final SearchView j;

    public q0(SearchView searchView0, int v) {
        this.i = v;
        this.j = searchView0;
        super();
    }

    @Override
    public final void run() {
        if(this.i != 0) {
            c c0 = this.j.W;
            if(c0 instanceof z0) {
                c0.b(null);
            }
            return;
        }
        this.j.t();
    }
}

