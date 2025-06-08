package F3;

import J2.j;
import J2.r;
import L3.i;
import L3.m;
import O2.q;
import X2.M;
import a3.L;
import a3.b;
import android.support.v4.media.session.a;
import java.util.Collection;
import java.util.List;
import v3.f;

public abstract class h extends o {
    public final b b;
    public final i c;
    public static final q[] d;

    static {
        J2.o o0 = new J2.o(r.a.b(h.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;");
        h.d = new q[]{r.a.e(o0)};
    }

    public h(m m0, b b0) {
        j.f(m0, "storageManager");
        super();
        this.b = b0;
        this.c = new i(m0, new A3.m(this, 1));  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
    }

    @Override  // F3.o
    public final Collection a(f f0, f3.b b0) {
        j.f(f0, "name");
        Collection collection0 = (List)a.A(this.c, h.d[0]);
        if(collection0.isEmpty()) {
            return x2.r.i;
        }
        V3.f f1 = new V3.f();
        for(Object object0: collection0) {
            if(object0 instanceof M && j.a(((M)object0).getName(), f0)) {
                f1.add(object0);
            }
        }
        return f1;
    }

    @Override  // F3.o
    public final Collection b(f f0, f3.b b0) {
        j.f(f0, "name");
        Collection collection0 = (List)a.A(this.c, h.d[0]);
        if(collection0.isEmpty()) {
            return x2.r.i;
        }
        V3.f f1 = new V3.f();
        for(Object object0: collection0) {
            if(object0 instanceof L && j.a(((L)object0).getName(), f0)) {
                f1.add(object0);
            }
        }
        return f1;
    }

    @Override  // F3.o
    public final Collection g(F3.f f0, I2.b b0) {
        j.f(f0, "kindFilter");
        return !f0.a(F3.f.n.b) ? x2.r.i : ((List)a.A(this.c, h.d[0]));
    }

    public abstract List h();
}

