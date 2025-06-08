package N;

import B.d;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public final class p implements Runnable {
    public ArrayList i;
    public long j;
    public long k;
    public ArrayList l;
    public static final ThreadLocal m;
    public static final d n;

    static {
        p.m = new ThreadLocal();
        p.n = new d(2);
    }

    public final void a(RecyclerView recyclerView0, int v, int v1) {
        if(recyclerView0.x && this.j == 0L) {
            this.j = 42840056594100L;
            recyclerView0.post(this);
        }
        recyclerView0.i0.a = v;
        recyclerView0.i0.b = v1;
    }

    public final void b(long v) {
        o o0;
        ArrayList arrayList0 = this.i;
        int v1 = arrayList0.size();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            RecyclerView recyclerView0 = (RecyclerView)arrayList0.get(v2);
            if(recyclerView0.getWindowVisibility() == 0) {
                recyclerView0.i0.b(recyclerView0, false);
                v3 += recyclerView0.i0.c;
            }
        }
        ArrayList arrayList1 = this.l;
        arrayList1.ensureCapacity(v3);
        int v5 = 0;
        for(int v4 = 0; v4 < v1; ++v4) {
            RecyclerView recyclerView1 = (RecyclerView)arrayList0.get(v4);
            if(recyclerView1.getWindowVisibility() == 0) {
                n n0 = recyclerView1.i0;
                int v6 = Math.abs(n0.b) + Math.abs(n0.a);
                for(int v7 = 0; v7 < n0.c * 2; v7 += 2) {
                    if(v5 >= arrayList1.size()) {
                        o0 = new o();  // 初始化器: Ljava/lang/Object;-><init>()V
                        arrayList1.add(o0);
                    }
                    else {
                        o0 = (o)arrayList1.get(v5);
                    }
                    int[] arr_v = (int[])n0.d;
                    int v8 = arr_v[v7 + 1];
                    o0.a = v8 <= v6;
                    o0.b = v6;
                    o0.c = v8;
                    o0.d = recyclerView1;
                    o0.e = arr_v[v7];
                    ++v5;
                }
            }
        }
        Collections.sort(arrayList1, p.n);
        for(int v9 = 0; v9 < arrayList1.size(); ++v9) {
            o o1 = (o)arrayList1.get(v9);
            RecyclerView recyclerView2 = o1.d;
            if(recyclerView2 == null) {
                break;
            }
            T t0 = p.c(recyclerView2, o1.e, (o1.a ? 0x7FFFFFFFFFFFFFFFL : v));
            if(t0 != null && t0.b != null && t0.e() && !t0.f()) {
                RecyclerView recyclerView3 = (RecyclerView)t0.b.get();
                if(recyclerView3 != null) {
                    if(recyclerView3.G && recyclerView3.m.v() != 0) {
                        D d0 = recyclerView3.P;
                        if(d0 != null) {
                            d0.e();
                        }
                        F f0 = recyclerView3.t;
                        M m0 = recyclerView3.j;
                        if(f0 != null) {
                            f0.a0(m0);
                            recyclerView3.t.b0(m0);
                        }
                        m0.a.clear();
                        m0.d();
                    }
                    n n1 = recyclerView3.i0;
                    n1.b(recyclerView3, true);
                    if(n1.c != 0) {
                        try {
                            Trace.beginSection("RV Nested Prefetch");
                            recyclerView3.j0.c = 1;
                            recyclerView3.j0.d = recyclerView3.s.a();
                            recyclerView3.j0.f = false;
                            recyclerView3.j0.g = false;
                            recyclerView3.j0.h = false;
                            for(int v11 = 0; v11 < n1.c * 2; v11 += 2) {
                                p.c(recyclerView3, ((int[])n1.d)[v11], v);
                            }
                        }
                        finally {
                            Trace.endSection();
                        }
                    }
                }
            }
            o1.a = false;
            o1.b = 0;
            o1.c = 0;
            o1.d = null;
            o1.e = 0;
        }
    }

    public static T c(RecyclerView recyclerView0, int v, long v1) {
        int v2 = recyclerView0.m.v();
        for(int v3 = 0; v3 < v2; ++v3) {
            T t0 = RecyclerView.G(recyclerView0.m.u(v3));
            if(t0.c == v && !t0.f()) {
                return null;
            }
        }
        try {
            M m0 = recyclerView0.j;
            recyclerView0.M();
            T t1 = m0.i(v, v1);
            if(t1 != null) {
                if(!t1.e() || t1.f()) {
                    m0.a(t1, false);
                }
                else {
                    m0.f(t1.a);
                }
            }
            return t1;
        }
        finally {
            recyclerView0.N(false);
        }
    }

    @Override
    public final void run() {
        try {
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList0 = this.i;
            if(arrayList0.isEmpty()) {
                return;
            }
            int v1 = arrayList0.size();
            long v3 = 0L;
            for(int v2 = 0; v2 < v1; ++v2) {
                RecyclerView recyclerView0 = (RecyclerView)arrayList0.get(v2);
                if(recyclerView0.getWindowVisibility() == 0) {
                    v3 = Math.max(recyclerView0.getDrawingTime(), v3);
                }
            }
            if(v3 == 0L) {
                return;
            }
            this.b(TimeUnit.MILLISECONDS.toNanos(v3) + this.k);
        }
        finally {
            this.j = 0L;
            Trace.endSection();
        }
    }
}

