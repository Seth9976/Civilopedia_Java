package r;

import q.f;

public final class i extends k {
    public c c;
    public i d;
    public float e;
    public i f;
    public float g;
    public int h;
    public i i;
    public j j;
    public int k;
    public j l;

    @Override  // r.k
    public final void e() {
        float f4;
        float f3;
        float f1;
        float f;
        boolean z = true;
        if(this.b == 1) {
            return;
        }
        int v = this.h;
        if(v == 4) {
            return;
        }
        j j0 = this.j;
        if(j0 != null) {
            if(j0.b != 1) {
                return;
            }
            this.e = ((float)this.k) * j0.c;
        }
        if(this.l != null && this.l.b != 1) {
            return;
        }
        if(v == 1) {
            i i0 = this.d;
            if(i0 == null || i0.b == 1) {
                if(i0 == null) {
                    this.f = this;
                    this.g = this.e;
                }
                else {
                    this.f = i0.f;
                    this.g = i0.g + this.e;
                }
                this.b();
                return;
            }
        }
        c c0 = this.c;
        if(v == 2) {
            i i1 = this.d;
            if(i1 != null && i1.b == 1) {
                i i2 = this.i;
                if(i2 != null) {
                    i i3 = i2.d;
                    if(i3 != null && i3.b == 1) {
                        this.f = i1.f;
                        i2.f = i3.f;
                        int v1 = c0.c;
                        int v2 = 0;
                        if(v1 == 4 || v1 == 5) {
                            f = i1.g;
                            f1 = i3.g;
                        }
                        else {
                            z = false;
                            f = i3.g;
                            f1 = i1.g;
                        }
                        float f2 = f - f1;
                        d d0 = c0.b;
                        if(v1 == 2 || v1 == 4) {
                            f3 = f2 - ((float)d0.k());
                            f4 = d0.U;
                        }
                        else {
                            f3 = f2 - ((float)d0.g());
                            f4 = d0.V;
                        }
                        int v3 = c0.b();
                        int v4 = this.i.c.b();
                        i i4 = this.i;
                        if(c0.d == i4.c.d) {
                            f4 = 0.5f;
                            v4 = 0;
                        }
                        else {
                            v2 = v3;
                        }
                        float f5 = f3 - ((float)v2) - ((float)v4);
                        if(z) {
                            i4.g = f5 * f4 + (i4.d.g + ((float)v4));
                            this.g = this.d.g - ((float)v2) - (1.0f - f4) * f5;
                        }
                        else {
                            this.g = f5 * f4 + (this.d.g + ((float)v2));
                            i4.g = i4.d.g - ((float)v4) - (1.0f - f4) * f5;
                        }
                        this.b();
                        this.i.b();
                        return;
                    }
                }
            }
        }
        if(v == 3) {
            i i5 = this.d;
            if(i5 != null && i5.b == 1) {
                i i6 = this.i;
                if(i6 != null) {
                    i i7 = i6.d;
                    if(i7 != null && i7.b == 1) {
                        this.f = i5.f;
                        i6.f = i7.f;
                        this.g = i5.g + this.e;
                        i6.g = i7.g + i6.e;
                        this.b();
                        this.i.b();
                        return;
                    }
                }
            }
        }
        if(v == 5) {
            c0.b.r();
        }
    }

    public final void f(q.d d0) {
        f f0 = this.c.i;
        i i0 = this.f;
        if(i0 == null) {
            d0.d(f0, ((int)(this.g + 0.5f)));
            return;
        }
        d0.e(f0, d0.j(i0.c), ((int)(this.g + 0.5f)), 6);
    }

    public final void g(i i0, int v) {
        this.h = 1;
        this.d = i0;
        this.e = (float)v;
        i0.a(this);
    }

    public final void h(i i0, int v, j j0) {
        this.d = i0;
        i0.a(this);
        this.j = j0;
        this.k = v;
        j0.a(this);
    }

    public final void i(i i0, int v) {
        this.d = i0;
        this.e = (float)v;
        i0.a(this);
    }

    public final void j() {
        this.b = 0;
        this.a.clear();
        this.d = null;
        this.e = 0.0f;
        this.j = null;
        this.k = 1;
        this.l = null;
        this.f = null;
        this.g = 0.0f;
        this.i = null;
        this.h = 0;
    }

    public final void k(i i0, float f) {
        int v = this.b;
        if(v == 0 || this.f != i0 && this.g != f) {
            this.f = i0;
            this.g = f;
            if(v == 1) {
                this.c();
            }
            this.b();
        }
    }

    public static String l(int v) {
        switch(v) {
            case 1: {
                return "DIRECT";
            }
            case 2: {
                return "CENTER";
            }
            case 3: {
                return "MATCH";
            }
            case 4: {
                return "CHAIN";
            }
            case 5: {
                return "BARRIER";
            }
            default: {
                return "UNCONNECTED";
            }
        }
    }

    @Override
    public final String toString() {
        c c0 = this.c;
        if(this.b == 1) {
            return this.f == this ? "[" + c0 + ", RESOLVED: " + this.g + "]  type: " + i.l(this.h) : "[" + c0 + ", RESOLVED: " + this.f + ":" + this.g + "] type: " + i.l(this.h);
        }
        return "{ " + c0 + " UNRESOLVED} type: " + i.l(this.h);
    }
}

