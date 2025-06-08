package a0;

import A.f;
import Y.m;
import Z.a;
import Z.c;
import Z.k;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import h0.i;
import i0.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class b implements a, c, d0.b {
    public final Context i;
    public final k j;
    public final d0.c k;
    public final HashSet l;
    public final a0.a m;
    public boolean n;
    public final Object o;
    public Boolean p;
    public static final String q;

    static {
        b.q = "WM-GreedyScheduler";
    }

    public b(Context context0, Y.b b0, B1.a a0, k k0) {
        this.l = new HashSet();
        this.i = context0;
        this.j = k0;
        this.k = new d0.c(context0, a0, this);
        this.m = new a0.a(this, b0.e);
        this.o = new Object();
    }

    @Override  // Z.a
    public final void a(String s, boolean z) {
        synchronized(this.o) {
            for(Object object1: this.l) {
                i i0 = (i)object1;
                if(i0.a.equals(s)) {
                    m.d().a("WM-GreedyScheduler", "Stopping tracking for " + s, new Throwable[0]);
                    this.l.remove(i0);
                    this.k.c(this.l);
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
    }

    @Override  // Z.c
    public final void b(String s) {
        k k0 = this.j;
        if(this.p == null) {
            this.p = Boolean.valueOf(g.a(this.i, k0.l));
        }
        if(!this.p.booleanValue()) {
            m.d().e("WM-GreedyScheduler", "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if(!this.n) {
            k0.p.b(this);
            this.n = true;
        }
        m.d().a("WM-GreedyScheduler", "Cancelling work ID " + s, new Throwable[0]);
        a0.a a0 = this.m;
        if(a0 != null) {
            Runnable runnable0 = (Runnable)a0.c.remove(s);
            if(runnable0 != null) {
                ((Handler)a0.b.j).removeCallbacks(runnable0);
            }
        }
        k0.Z(s);
    }

    @Override  // d0.b
    public final void c(ArrayList arrayList0) {
        for(Object object0: arrayList0) {
            m.d().a("WM-GreedyScheduler", f.h("Constraints not met: Cancelling work ID ", ((String)object0)), new Throwable[0]);
            this.j.Z(((String)object0));
        }
    }

    @Override  // Z.c
    public final void d(i[] arr_i) {
        if(this.p == null) {
            this.p = Boolean.valueOf(g.a(this.i, this.j.l));
        }
        if(!this.p.booleanValue()) {
            m.d().e("WM-GreedyScheduler", "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if(!this.n) {
            this.j.p.b(this);
            this.n = true;
        }
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        for(int v = 0; v < arr_i.length; ++v) {
            i i0 = arr_i[v];
            long v1 = i0.a();
            long v2 = System.currentTimeMillis();
            if(i0.b == 1) {
                if(v2 < v1) {
                    a0.a a0 = this.m;
                    if(a0 != null) {
                        HashMap hashMap0 = a0.c;
                        Runnable runnable0 = (Runnable)hashMap0.remove(i0.a);
                        T1.c c0 = a0.b;
                        if(runnable0 != null) {
                            ((Handler)c0.j).removeCallbacks(runnable0);
                        }
                        B.a a1 = new B.a(a0, i0, 5, false);
                        hashMap0.put(i0.a, a1);
                        long v3 = i0.a();
                        ((Handler)c0.j).postDelayed(a1, v3 - System.currentTimeMillis());
                    }
                }
                else if(i0.b()) {
                    int v4 = Build.VERSION.SDK_INT;
                    if(v4 >= 23 && i0.j.c) {
                        m.d().a("WM-GreedyScheduler", "Ignoring WorkSpec " + i0 + ", Requires device idle.", new Throwable[0]);
                    }
                    else if(v4 < 24 || i0.j.h.a.size() <= 0) {
                        hashSet0.add(i0);
                        hashSet1.add(i0.a);
                    }
                    else {
                        m.d().a("WM-GreedyScheduler", "Ignoring WorkSpec " + i0 + ", Requires ContentUri triggers.", new Throwable[0]);
                    }
                }
                else {
                    m.d().a("WM-GreedyScheduler", "Starting work for " + i0.a, new Throwable[0]);
                    this.j.Y(i0.a, null);
                }
            }
        }
        synchronized(this.o) {
            if(!hashSet0.isEmpty()) {
                m.d().a("WM-GreedyScheduler", "Starting tracking for [" + TextUtils.join(",", hashSet1) + "]", new Throwable[0]);
                this.l.addAll(hashSet0);
                this.k.c(this.l);
            }
        }
    }

    @Override  // d0.b
    public final void e(List list0) {
        for(Object object0: ((ArrayList)list0)) {
            m.d().a("WM-GreedyScheduler", f.h("Constraints met: Scheduling work ID ", ((String)object0)), new Throwable[0]);
            this.j.Y(((String)object0), null);
        }
    }

    @Override  // Z.c
    public final boolean f() {
        return false;
    }
}

