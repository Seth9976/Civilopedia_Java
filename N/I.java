package N;

import E.h;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

public final class i extends D {
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;
    public static TimeInterpolator s;

    @Override  // N.D
    public final boolean a(T t0, T t1, h h0, h h1) {
        int v3;
        int v2;
        int v = h0.a;
        int v1 = h0.b;
        if(t1.o()) {
            v2 = h0.b;
            v3 = h0.a;
        }
        else {
            v3 = h1.a;
            v2 = h1.b;
        }
        if(t0 == t1) {
            return this.g(t0, v, v1, v3, v2);
        }
        float f = t0.a.getTranslationX();
        float f1 = t0.a.getTranslationY();
        float f2 = t0.a.getAlpha();
        this.l(t0);
        t0.a.setTranslationX(f);
        t0.a.setTranslationY(f1);
        t0.a.setAlpha(f2);
        this.l(t1);
        t1.a.setTranslationX(((float)(-((int)(((float)(v3 - v)) - f)))));
        t1.a.setTranslationY(((float)(-((int)(((float)(v2 - v1)) - f1)))));
        t1.a.setAlpha(0.0f);
        ArrayList arrayList0 = this.k;
        g g0 = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
        g0.a = t0;
        g0.b = t1;
        g0.c = v;
        g0.d = v1;
        g0.e = v3;
        g0.f = v2;
        arrayList0.add(g0);
        return true;
    }

    @Override  // N.D
    public final void d(T t0) {
        View view0 = t0.a;
        view0.animate().cancel();
        ArrayList arrayList0 = this.j;
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            if(((N.h)arrayList0.get(v)).a == t0) {
                view0.setTranslationY(0.0f);
                view0.setTranslationX(0.0f);
                this.c(t0);
                arrayList0.remove(v);
            }
        }
        this.j(this.k, t0);
        if(this.h.remove(t0)) {
            view0.setAlpha(1.0f);
            this.c(t0);
        }
        if(this.i.remove(t0)) {
            view0.setAlpha(1.0f);
            this.c(t0);
        }
        ArrayList arrayList1 = this.n;
        for(int v1 = arrayList1.size() - 1; v1 >= 0; --v1) {
            ArrayList arrayList2 = (ArrayList)arrayList1.get(v1);
            this.j(arrayList2, t0);
            if(arrayList2.isEmpty()) {
                arrayList1.remove(v1);
            }
        }
        ArrayList arrayList3 = this.m;
        for(int v2 = arrayList3.size() - 1; v2 >= 0; --v2) {
            ArrayList arrayList4 = (ArrayList)arrayList3.get(v2);
            for(int v3 = arrayList4.size() - 1; v3 >= 0; --v3) {
                if(((N.h)arrayList4.get(v3)).a == t0) {
                    view0.setTranslationY(0.0f);
                    view0.setTranslationX(0.0f);
                    this.c(t0);
                    arrayList4.remove(v3);
                    if(arrayList4.isEmpty()) {
                        arrayList3.remove(v2);
                    }
                    break;
                }
            }
        }
        ArrayList arrayList5 = this.l;
        for(int v4 = arrayList5.size() - 1; v4 >= 0; --v4) {
            ArrayList arrayList6 = (ArrayList)arrayList5.get(v4);
            if(arrayList6.remove(t0)) {
                view0.setAlpha(1.0f);
                this.c(t0);
                if(arrayList6.isEmpty()) {
                    arrayList5.remove(v4);
                }
            }
        }
        this.q.remove(t0);
        this.o.remove(t0);
        this.r.remove(t0);
        this.p.remove(t0);
        this.i();
    }

    @Override  // N.D
    public final void e() {
        ArrayList arrayList0 = this.j;
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            N.h h0 = (N.h)arrayList0.get(v);
            View view0 = h0.a.a;
            view0.setTranslationY(0.0f);
            view0.setTranslationX(0.0f);
            this.c(h0.a);
            arrayList0.remove(v);
        }
        ArrayList arrayList1 = this.h;
        for(int v1 = arrayList1.size() - 1; v1 >= 0; --v1) {
            this.c(((T)arrayList1.get(v1)));
            arrayList1.remove(v1);
        }
        ArrayList arrayList2 = this.i;
        for(int v2 = arrayList2.size() - 1; v2 >= 0; --v2) {
            T t0 = (T)arrayList2.get(v2);
            t0.a.setAlpha(1.0f);
            this.c(t0);
            arrayList2.remove(v2);
        }
        ArrayList arrayList3 = this.k;
        for(int v3 = arrayList3.size() - 1; v3 >= 0; --v3) {
            g g0 = (g)arrayList3.get(v3);
            T t1 = g0.a;
            if(t1 != null) {
                this.k(g0, t1);
            }
            T t2 = g0.b;
            if(t2 != null) {
                this.k(g0, t2);
            }
        }
        arrayList3.clear();
        if(!this.f()) {
            return;
        }
        ArrayList arrayList4 = this.m;
        for(int v4 = arrayList4.size() - 1; v4 >= 0; --v4) {
            ArrayList arrayList5 = (ArrayList)arrayList4.get(v4);
            for(int v5 = arrayList5.size() - 1; v5 >= 0; --v5) {
                N.h h1 = (N.h)arrayList5.get(v5);
                View view1 = h1.a.a;
                view1.setTranslationY(0.0f);
                view1.setTranslationX(0.0f);
                this.c(h1.a);
                arrayList5.remove(v5);
                if(arrayList5.isEmpty()) {
                    arrayList4.remove(arrayList5);
                }
            }
        }
        ArrayList arrayList6 = this.l;
        for(int v6 = arrayList6.size() - 1; v6 >= 0; --v6) {
            ArrayList arrayList7 = (ArrayList)arrayList6.get(v6);
            for(int v7 = arrayList7.size() - 1; v7 >= 0; --v7) {
                T t3 = (T)arrayList7.get(v7);
                t3.a.setAlpha(1.0f);
                this.c(t3);
                arrayList7.remove(v7);
                if(arrayList7.isEmpty()) {
                    arrayList6.remove(arrayList7);
                }
            }
        }
        ArrayList arrayList8 = this.n;
        for(int v8 = arrayList8.size() - 1; v8 >= 0; --v8) {
            ArrayList arrayList9 = (ArrayList)arrayList8.get(v8);
            for(int v9 = arrayList9.size() - 1; v9 >= 0; --v9) {
                g g1 = (g)arrayList9.get(v9);
                T t4 = g1.a;
                if(t4 != null) {
                    this.k(g1, t4);
                }
                T t5 = g1.b;
                if(t5 != null) {
                    this.k(g1, t5);
                }
                if(arrayList9.isEmpty()) {
                    arrayList8.remove(arrayList9);
                }
            }
        }
        i.h(this.q);
        i.h(this.p);
        i.h(this.o);
        i.h(this.r);
        ArrayList arrayList10 = this.b;
        if(arrayList10.size() <= 0) {
            arrayList10.clear();
            return;
        }
        arrayList10.get(0).getClass();
        throw new ClassCastException();
    }

    // 去混淆评级： 中等(110)
    @Override  // N.D
    public final boolean f() {
        return !this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty();
    }

    public final boolean g(T t0, int v, int v1, int v2, int v3) {
        View view0 = t0.a;
        int v4 = v + ((int)view0.getTranslationX());
        int v5 = v1 + ((int)t0.a.getTranslationY());
        this.l(t0);
        int v6 = v2 - v4;
        int v7 = v3 - v5;
        if(v6 == 0 && v7 == 0) {
            this.c(t0);
            return false;
        }
        if(v6 != 0) {
            view0.setTranslationX(((float)(-v6)));
        }
        if(v7 != 0) {
            view0.setTranslationY(((float)(-v7)));
        }
        ArrayList arrayList0 = this.j;
        N.h h0 = new N.h();  // 初始化器: Ljava/lang/Object;-><init>()V
        h0.a = t0;
        h0.b = v4;
        h0.c = v5;
        h0.d = v2;
        h0.e = v3;
        arrayList0.add(h0);
        return true;
    }

    public static void h(ArrayList arrayList0) {
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            ((T)arrayList0.get(v)).a.animate().cancel();
        }
    }

    public final void i() {
        if(!this.f()) {
            ArrayList arrayList0 = this.b;
            if(arrayList0.size() <= 0) {
                arrayList0.clear();
                return;
            }
            arrayList0.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList0, T t0) {
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            g g0 = (g)arrayList0.get(v);
            if(this.k(g0, t0) && g0.a == null && g0.b == null) {
                arrayList0.remove(g0);
            }
        }
    }

    public final boolean k(g g0, T t0) {
        if(g0.b == t0) {
            g0.b = null;
        }
        else if(g0.a == t0) {
            g0.a = null;
        }
        else {
            return false;
        }
        t0.a.setAlpha(1.0f);
        t0.a.setTranslationX(0.0f);
        t0.a.setTranslationY(0.0f);
        this.c(t0);
        return true;
    }

    public final void l(T t0) {
        if(i.s == null) {
            i.s = new ValueAnimator().getInterpolator();
        }
        t0.a.animate().setInterpolator(i.s);
        this.d(t0);
    }
}

