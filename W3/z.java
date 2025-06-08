package w3;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public final class z extends e {
    public final int j;
    public final e k;
    public final e l;
    public final int m;
    public final int n;
    public int o;
    public static final int[] p;

    static {
        ArrayList arrayList0 = new ArrayList();
        int v = 1;
        for(int v1 = 1; v1 > 0; v1 = v2) {
            arrayList0.add(v1);
            int v2 = v + v1;
            v = v1;
        }
        arrayList0.add(0x7FFFFFFF);
        z.p = new int[arrayList0.size()];
        for(int v3 = 0; true; ++v3) {
            int[] arr_v = z.p;
            if(v3 >= arr_v.length) {
                break;
            }
            arr_v[v3] = (int)(((Integer)arrayList0.get(v3)));
        }
    }

    public z(e e0, e e1) {
        this.o = 0;
        this.k = e0;
        this.l = e1;
        int v = e0.size();
        this.m = v;
        this.j = e1.size() + v;
        this.n = Math.max(e0.k(), e1.k()) + 1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof e)) {
            return false;
        }
        int v = this.j;
        if(v != ((e)object0).size()) {
            return false;
        }
        if(v == 0) {
            return true;
        }
        if(this.o != 0) {
            int v1 = ((e)object0).q();
            if(v1 != 0 && this.o != v1) {
                return false;
            }
        }
        x x0 = new x(this);
        u u0 = x0.a();
        x x1 = new x(((e)object0));
        u u1 = x1.a();
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        while(true) {
            int v5 = u0.j.length - v2;
            int v6 = u1.j.length - v3;
            int v7 = Math.min(v5, v6);
            if(!(v2 == 0 ? u0.u(u1, v3, v7) : u1.u(u0, v2, v7))) {
                return false;
            }
            v4 += v7;
            if(v4 >= v) {
                if(v4 != v) {
                    throw new IllegalStateException();
                }
                return true;
            }
            if(v7 == v5) {
                u0 = x0.a();
                v2 = 0;
            }
            else {
                v2 += v7;
            }
            if(v7 == v6) {
                u1 = x1.a();
                v3 = 0;
            }
            else {
                v3 += v7;
            }
        }
    }

    @Override
    public final int hashCode() {
        int v = this.o;
        if(v == 0) {
            v = this.o(this.j, 0, this.j);
            if(v == 0) {
                v = 1;
            }
            this.o = v;
        }
        return v;
    }

    @Override
    public final Iterator iterator() {
        return new y(this);
    }

    @Override  // w3.e
    public final void j(int v, int v1, int v2, byte[] arr_b) {
        e e0 = this.k;
        int v3 = this.m;
        if(v + v2 <= v3) {
            e0.j(v, v1, v2, arr_b);
            return;
        }
        e e1 = this.l;
        if(v >= v3) {
            e1.j(v - v3, v1, v2, arr_b);
            return;
        }
        int v4 = v3 - v;
        e0.j(v, v1, v4, arr_b);
        e1.j(0, v1 + v4, v2 - v4, arr_b);
    }

    @Override  // w3.e
    public final int k() {
        return this.n;
    }

    @Override  // w3.e
    public final boolean l() {
        return this.j >= z.p[this.n];
    }

    @Override  // w3.e
    public final boolean m() {
        int v = this.k.p(0, 0, this.m);
        return this.l.p(v, 0, this.l.size()) == 0;
    }

    @Override  // w3.e
    public final int o(int v, int v1, int v2) {
        e e0 = this.k;
        int v3 = this.m;
        if(v1 + v2 <= v3) {
            return e0.o(v, v1, v2);
        }
        return v1 < v3 ? this.l.o(e0.o(v, v1, v3 - v1), 0, v2 - (v3 - v1)) : this.l.o(v, v1 - v3, v2);
    }

    @Override  // w3.e
    public final int p(int v, int v1, int v2) {
        e e0 = this.k;
        int v3 = this.m;
        if(v1 + v2 <= v3) {
            return e0.p(v, v1, v2);
        }
        return v1 < v3 ? this.l.p(e0.p(v, v1, v3 - v1), 0, v2 - (v3 - v1)) : this.l.p(v, v1 - v3, v2);
    }

    @Override  // w3.e
    public final int q() {
        return this.o;
    }

    @Override  // w3.e
    public final String r() {
        int v = this.j;
        if(v == 0) {
            return "";
        }
        byte[] arr_b = new byte[v];
        this.j(0, 0, v, arr_b);
        return new String(arr_b, "UTF-8");
    }

    @Override  // w3.e
    public final int size() {
        return this.j;
    }

    @Override  // w3.e
    public final void t(OutputStream outputStream0, int v, int v1) {
        e e0 = this.k;
        int v2 = this.m;
        if(v + v1 <= v2) {
            e0.t(outputStream0, v, v1);
            return;
        }
        e e1 = this.l;
        if(v >= v2) {
            e1.t(outputStream0, v - v2, v1);
            return;
        }
        int v3 = v2 - v;
        e0.t(outputStream0, v, v3);
        e1.t(outputStream0, 0, v1 - v3);
    }
}

