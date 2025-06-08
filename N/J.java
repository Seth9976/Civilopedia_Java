package N;

import androidx.recyclerview.widget.RecyclerView;

public final class j extends J {
    public final m a;

    public j(m m0) {
        this.a = m0;
    }

    @Override  // N.J
    public final void a(RecyclerView recyclerView0) {
        int v = recyclerView0.computeHorizontalScrollOffset();
        int v1 = recyclerView0.computeVerticalScrollOffset();
        m m0 = this.a;
        int v2 = m0.s.computeVerticalScrollRange();
        int v3 = m0.r;
        m0.t = v2 - v3 > 0 && v3 >= m0.a;
        int v4 = m0.s.computeHorizontalScrollRange();
        int v5 = m0.q;
        boolean z = v4 - v5 > 0 && v5 >= m0.a;
        m0.u = z;
        boolean z1 = m0.t;
        if(z1 || z) {
            if(z1) {
                m0.l = (int)((((float)v3) / 2.0f + ((float)v1)) * ((float)v3) / ((float)v2));
                m0.k = Math.min(v3, v3 * v3 / v2);
            }
            if(m0.u) {
                m0.o = (int)((((float)v5) / 2.0f + ((float)v)) * ((float)v5) / ((float)v4));
                m0.n = Math.min(v5, v5 * v5 / v4);
            }
            if(m0.v == 0 || m0.v == 1) {
                m0.f(1);
            }
        }
        else if(m0.v != 0) {
            m0.f(0);
        }
    }
}

