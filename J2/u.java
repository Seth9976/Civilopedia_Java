package J2;

import com.spears.civilopedia.planning.logic.Plot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import l2.d;
import n2.j;
import n2.n;
import n2.t;
import n2.w;
import n2.y;
import o2.J;
import x2.g;

public final class u {
    public ArrayList a;

    public u(int v) {
        this.a = new ArrayList(v);
    }

    public u(t t0, float f) {
        J j0 = t0.c();
        double f1 = j0.c / 2.0 + j0.a;
        double f2 = j0.d / 2.0 + j0.b;
        Plot.Companion.getClass();
        double f3 = ((double)Plot.itemSize.getWidth()) - ((double)f) * 2.0;
        double f4 = f3 * 2.0 / 1.732051 / 4.0;
        y[] arr_y = {new y(0.0, -2.0 * f4), new y(f3 / 2.0, -f4), new y(f3 / 2.0, f4), new y(0.0, 2.0 * f4), new y(-(f3 / 2.0), f4), new y(-(f3 / 2.0), -f4)};
        ArrayList arrayList0 = new ArrayList(6);
        for(int v = 0; v < 6; ++v) {
            y y0 = arr_y[v];
            arrayList0.add(new w(f1 + y0.a, y0.b + f2));
        }
        this.a = arrayList0;
    }

    public void a(Object object0) {
        this.a.add(object0);
    }

    public void b(Object object0) {
        if(object0 == null) {
            return;
        }
        ArrayList arrayList0 = this.a;
        if(object0 instanceof Object[]) {
            if(((Object[])object0).length <= 0) {
                return;
            }
            arrayList0.ensureCapacity(arrayList0.size() + ((Object[])object0).length);
            Collections.addAll(arrayList0, ((Object[])object0));
            return;
        }
        if(object0 instanceof Collection) {
            arrayList0.addAll(((Collection)object0));
            return;
        }
        if(object0 instanceof Iterable) {
            for(Object object1: ((Iterable)object0)) {
                arrayList0.add(object1);
            }
            return;
        }
        if(!(object0 instanceof Iterator)) {
            throw new UnsupportedOperationException("Don\'t know how to spread " + object0.getClass());
        }
        while(((Iterator)object0).hasNext()) {
            Object object2 = ((Iterator)object0).next();
            arrayList0.add(object2);
        }
    }

    public n c(j j0) {
        J2.j.f(j0, "edge");
        int v = g.K(new j[]{j.j, j.k, j.l, j.m, j.n, j.i}, j0);
        ArrayList arrayList0 = this.a;
        w w0 = (w)arrayList0.get(v);
        w w1 = (w)arrayList0.get((v + 1) % arrayList0.size());
        J2.j.f(w0, "start");
        J2.j.f(w1, "end");
        n n0 = new n();  // 初始化器: Ljava/lang/Object;-><init>()V
        n0.a = w0;
        n0.b = w1;
        return n0;
    }

    public d d(t t0) {
        J2.j.f(t0, "position");
        for(Object object0: this.a) {
            if(J2.j.a(((d)object0).a().a, t0)) {
                return (d)object0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }
}

