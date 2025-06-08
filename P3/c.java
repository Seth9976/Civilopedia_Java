package p3;

import o3.l;
import o3.m;
import v3.b;
import v3.f;

public final class c implements l {
    public final int i;
    public final e j;

    public c(e e0, int v) {
        this.i = v;
        this.j = e0;
        super();
    }

    private final void a(f f0, A3.f f1) {
    }

    private final void b(f f0, A3.f f1) {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e(f f0, b b0, f f1) {
    }

    private final void f(f f0, b b0, f f1) {
    }

    @Override  // o3.l
    public final void i() {
    }

    @Override  // o3.l
    public final void k(f f0, A3.f f1) {
    }

    @Override  // o3.l
    public final void l(f f0, Object object0) {
        if(this.i != 0) {
            String s = f0.b();
            e e0 = this.j;
            if("version".equals(s)) {
                if(object0 instanceof int[]) {
                    e0.a = (int[])object0;
                    return;
                }
            }
            else if("multifileClassName".equals(s)) {
                e0.b = object0 instanceof String ? ((String)object0) : null;
            }
            return;
        }
        String s1 = f0.b();
        e e1 = this.j;
        if("k".equals(s1)) {
            if(object0 instanceof Integer) {
                a.j.getClass();
                a a0 = (a)a.k.get(((Integer)object0));
                if(a0 == null) {
                    a0 = a.l;
                }
                e1.g = a0;
            }
        }
        else if("mv".equals(s1)) {
            if(object0 instanceof int[]) {
                e1.a = (int[])object0;
            }
        }
        else if("xs".equals(s1)) {
            if(object0 instanceof String && !((String)object0).isEmpty()) {
                e1.b = (String)object0;
            }
        }
        else if("xi".equals(s1)) {
            if(object0 instanceof Integer) {
                e1.c = (int)(((Integer)object0));
            }
        }
        else if("pn".equals(s1) && object0 instanceof String && !((String)object0).isEmpty()) {
            e1.getClass();
        }
    }

    @Override  // o3.l
    public final void n(f f0, b b0, f f1) {
    }

    @Override  // o3.l
    public final l o(b b0, f f0) {
        return null;
    }

    @Override  // o3.l
    public final m p(f f0) {
        if(this.i != 0) {
            String s = f0.b();
            if(!"data".equals(s) && !"filePartClassNames".equals(s)) {
                return "strings".equals(s) ? new d(this, 1) : null;
            }
            return new d(this, 0);
        }
        String s1 = f0.b();
        if("d1".equals(s1)) {
            return new p3.b(this, 0);
        }
        return "d2".equals(s1) ? new p3.b(this, 1) : null;
    }
}

