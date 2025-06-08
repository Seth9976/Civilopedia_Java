package r;

import q.e;
import q.f;

public final class c {
    public final i a;
    public final d b;
    public final int c;
    public c d;
    public int e;
    public int f;
    public int g;
    public int h;
    public f i;

    public c(d d0, int v) {
        i i0 = new i();  // 初始化器: Lr/k;-><init>()V
        i0.h = 0;
        i0.j = null;
        i0.k = 1;
        i0.l = null;
        i0.c = this;
        this.a = i0;
        this.e = 0;
        this.f = -1;
        this.g = 1;
        this.h = 0;
        this.b = d0;
        this.c = v;
    }

    public final boolean a(c c0, int v, int v1, int v2, int v3, boolean z) {
        boolean z1;
        if(c0 == null) {
            this.d = null;
            this.e = 0;
            this.f = -1;
            this.g = 1;
            this.h = 2;
            return true;
        }
        if(!z) {
            int v4 = this.c;
            d d0 = c0.b;
            int v5 = c0.c;
            if(v5 != v4) {
                switch(e.c(v4)) {
                    case 1: 
                    case 3: {
                        z1 = v5 == 2 || v5 == 4;
                        if(d0 instanceof g) {
                            z1 = !z1 && v5 != 8 ? false : true;
                        }
                        break;
                    }
                    case 2: 
                    case 4: {
                        z1 = v5 == 3 || v5 == 5;
                        if(d0 instanceof g) {
                            z1 = !z1 && v5 != 9 ? false : true;
                        }
                        break;
                    }
                    case 6: {
                        z1 = v5 != 6 && v5 != 8 && v5 != 9;
                        break;
                    }
                    case 0: 
                    case 5: 
                    case 7: 
                    case 8: {
                        z1 = false;
                        break;
                    }
                    default: {
                        throw new AssertionError(i3.e.n(v4));
                    }
                }
            }
            else if(v4 != 6 || d0.P > 0 && this.b.P > 0) {
                z1 = true;
            }
            else {
                z1 = false;
            }
            if(!z1) {
                return false;
            }
        }
        this.d = c0;
        this.e = v > 0 ? v : 0;
        this.f = v1;
        this.g = v2;
        this.h = v3;
        return true;
    }

    public final int b() {
        if(this.b.X == 8) {
            return 0;
        }
        return this.f <= -1 || (this.d == null || this.d.b.X != 8) ? this.e : this.f;
    }

    public final boolean c() {
        return this.d != null;
    }

    public final void d() {
        this.d = null;
        this.e = 0;
        this.f = -1;
        this.g = 2;
        this.h = 0;
        this.a.j();
    }

    public final void e() {
        f f0 = this.i;
        if(f0 == null) {
            this.i = new f(1);
            return;
        }
        f0.c();
    }

    @Override
    public final String toString() {
        return this.b.Y + ":" + i3.e.n(this.c);
    }
}

