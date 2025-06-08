package N;

import E.h;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public final class x {
    public final RecyclerView a;

    public x(RecyclerView recyclerView0) {
        this.a = recyclerView0;
        super();
    }

    public void a(a a0) {
        RecyclerView recyclerView0 = this.a;
        switch(a0.a) {
            case 1: {
                recyclerView0.t.Q(a0.b, a0.c);
                return;
            }
            case 2: {
                recyclerView0.t.T(a0.b, a0.c);
                return;
            }
            case 4: {
                recyclerView0.t.U(a0.b, a0.c);
                return;
            }
            case 8: {
                recyclerView0.t.S(a0.b, a0.c);
            }
        }
    }

    public T b(int v) {
        RecyclerView recyclerView0 = this.a;
        int v1 = recyclerView0.m.v();
        T t0 = null;
        for(int v2 = 0; v2 < v1; ++v2) {
            T t1 = RecyclerView.G(recyclerView0.m.u(v2));
            if(t1 != null && !t1.h() && t1.c == v) {
                if(((ArrayList)recyclerView0.m.l).contains(t1.a)) {
                    t0 = t1;
                    continue;
                }
                t0 = t1;
                break;
            }
        }
        if(t0 == null) {
            return null;
        }
        return ((ArrayList)recyclerView0.m.l).contains(t0.a) ? null : t0;
    }

    public void c(int v, int v1) {
        RecyclerView recyclerView0 = this.a;
        int v2 = recyclerView0.m.v();
        int v3 = v1 + v;
        for(int v4 = 0; v4 < v2; ++v4) {
            View view0 = recyclerView0.m.u(v4);
            T t0 = RecyclerView.G(view0);
            if(t0 != null && !t0.o() && (t0.c >= v && t0.c < v3)) {
                t0.a(2);
                t0.a(0x400);
                ((G)view0.getLayoutParams()).c = true;
            }
        }
        M m0 = recyclerView0.j;
        ArrayList arrayList0 = m0.c;
        for(int v5 = arrayList0.size() - 1; v5 >= 0; --v5) {
            T t1 = (T)arrayList0.get(v5);
            if(t1 != null && (t1.c >= v && t1.c < v3)) {
                t1.a(2);
                m0.e(v5);
            }
        }
        recyclerView0.n0 = true;
    }

    public void d(int v, int v1) {
        RecyclerView recyclerView0 = this.a;
        int v2 = recyclerView0.m.v();
        for(int v4 = 0; v4 < v2; ++v4) {
            T t0 = RecyclerView.G(recyclerView0.m.u(v4));
            if(t0 != null && !t0.o() && t0.c >= v) {
                t0.l(v1, false);
                recyclerView0.j0.e = true;
            }
        }
        ArrayList arrayList0 = recyclerView0.j.c;
        int v5 = arrayList0.size();
        for(int v3 = 0; v3 < v5; ++v3) {
            T t1 = (T)arrayList0.get(v3);
            if(t1 != null && t1.c >= v) {
                t1.l(v1, true);
            }
        }
        recyclerView0.requestLayout();
        recyclerView0.m0 = true;
    }

    public void e(int v, int v1) {
        int v10;
        int v9;
        int v6;
        int v5;
        int v4;
        RecyclerView recyclerView0 = this.a;
        int v2 = recyclerView0.m.v();
        int v3 = -1;
        if(v < v1) {
            v4 = v;
            v5 = v1;
            v6 = -1;
        }
        else {
            v5 = v;
            v4 = v1;
            v6 = 1;
        }
        for(int v7 = 0; v7 < v2; ++v7) {
            T t0 = RecyclerView.G(recyclerView0.m.u(v7));
            if(t0 != null) {
                int v8 = t0.c;
                if(v8 >= v4 && v8 <= v5) {
                    if(v8 == v) {
                        t0.l(v1 - v, false);
                    }
                    else {
                        t0.l(v6, false);
                    }
                    recyclerView0.j0.e = true;
                }
            }
        }
        M m0 = recyclerView0.j;
        m0.getClass();
        if(v < v1) {
            v9 = v;
            v10 = v1;
        }
        else {
            v10 = v;
            v9 = v1;
            v3 = 1;
        }
        ArrayList arrayList0 = m0.c;
        int v11 = arrayList0.size();
        for(int v12 = 0; v12 < v11; ++v12) {
            T t1 = (T)arrayList0.get(v12);
            if(t1 != null) {
                int v13 = t1.c;
                if(v13 >= v9 && v13 <= v10) {
                    if(v13 == v) {
                        t1.l(v1 - v, false);
                    }
                    else {
                        t1.l(v3, false);
                    }
                }
            }
        }
        recyclerView0.requestLayout();
        recyclerView0.m0 = true;
    }

    public void f(T t0, h h0, h h1) {
        boolean z;
        RecyclerView recyclerView0 = this.a;
        recyclerView0.getClass();
        t0.n(false);
        i i0 = (i)recyclerView0.P;
        if(h0 == null) {
        label_11:
            i0.l(t0);
            t0.a.setAlpha(0.0f);
            i0.i.add(t0);
            z = true;
        }
        else {
            i0.getClass();
            int v = h0.a;
            int v1 = h1.a;
            if(v != v1 || h0.b != h1.b) {
                z = i0.g(t0, v, h0.b, v1, h1.b);
                goto label_15;
            }
            goto label_11;
        }
    label_15:
        if(z) {
            recyclerView0.P();
        }
    }

    public void g(T t0, h h0, h h1) {
        boolean z;
        RecyclerView recyclerView0 = this.a;
        recyclerView0.j.j(t0);
        recyclerView0.e(t0);
        t0.n(false);
        i i0 = (i)recyclerView0.P;
        i0.getClass();
        int v = h0.a;
        int v1 = h0.b;
        View view0 = t0.a;
        int v2 = h1 == null ? view0.getLeft() : h1.a;
        int v3 = h1 == null ? view0.getTop() : h1.b;
        if(t0.h() || v == v2 && v1 == v3) {
            i0.l(t0);
            i0.h.add(t0);
            z = true;
        }
        else {
            view0.layout(v2, v3, view0.getWidth() + v2, view0.getHeight() + v3);
            z = i0.g(t0, v, v1, v2, v3);
        }
        if(z) {
            recyclerView0.P();
        }
    }
}

