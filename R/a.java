package r;

import java.util.ArrayList;
import q.b;
import q.f;

public final class a extends d {
    public d[] i0;
    public int j0;
    public int k0;
    public ArrayList l0;
    public boolean m0;

    @Override  // r.d
    public final void a(q.d d0) {
        boolean z;
        c[] arr_c = this.A;
        c c0 = this.s;
        arr_c[0] = c0;
        c c1 = this.t;
        arr_c[2] = c1;
        c c2 = this.u;
        arr_c[1] = c2;
        c c3 = this.v;
        arr_c[3] = c3;
        for(int v = 0; v < arr_c.length; ++v) {
            c c4 = arr_c[v];
            c4.i = d0.j(c4);
        }
        int v1 = this.k0;
        if(v1 >= 0 && v1 < 4) {
            c c5 = arr_c[v1];
            for(int v2 = 0; true; ++v2) {
                z = false;
                if(v2 >= this.j0) {
                    break;
                }
                d d1 = this.i0[v2];
                if((this.m0 || d1.b()) && ((this.k0 == 0 || this.k0 == 1) && d1.h0[0] == 3 || (this.k0 == 2 || this.k0 == 3) && d1.h0[1] == 3)) {
                    z = true;
                    break;
                }
            }
            if(this.k0 == 0 || this.k0 == 1) {
                if(this.C.h0[0] == 2) {
                    z = false;
                }
            }
            else if(this.C.h0[1] == 2) {
                z = false;
            }
            for(int v3 = 0; v3 < this.j0; ++v3) {
                d d2 = this.i0[v3];
                if(this.m0 || d2.b()) {
                    f f0 = d0.j(d2.A[this.k0]);
                    int v4 = this.k0;
                    d2.A[v4].i = f0;
                    if(v4 == 0 || v4 == 2) {
                        f f5 = c5.i;
                        b b1 = d0.k();
                        f f6 = d0.l();
                        f6.c = 0;
                        b1.d(f5, f0, f6, 0);
                        if(z) {
                            float f7 = b1.c.c(f6);
                            f f8 = d0.i(1);
                            b1.c.g(f8, ((float)(((int)(f7 * -1.0f)))));
                        }
                        d0.c(b1);
                    }
                    else {
                        f f1 = c5.i;
                        b b0 = d0.k();
                        f f2 = d0.l();
                        f2.c = 0;
                        b0.c(f1, f0, f2, 0);
                        if(z) {
                            float f3 = b0.c.c(f2);
                            f f4 = d0.i(1);
                            b0.c.g(f4, ((float)(((int)(f3 * -1.0f)))));
                        }
                        d0.c(b0);
                    }
                }
            }
            int v5 = this.k0;
            if(v5 == 0) {
                d0.e(c2.i, c0.i, 0, 6);
                if(!z) {
                    d0.e(c0.i, this.C.u.i, 0, 5);
                }
            }
            else if(v5 == 1) {
                d0.e(c0.i, c2.i, 0, 6);
                if(!z) {
                    d0.e(c0.i, this.C.s.i, 0, 5);
                }
            }
            else {
                switch(v5) {
                    case 2: {
                        d0.e(c3.i, c1.i, 0, 6);
                        if(!z) {
                            d0.e(c1.i, this.C.v.i, 0, 5);
                            return;
                        }
                        break;
                    }
                    case 3: {
                        d0.e(c1.i, c3.i, 0, 6);
                        if(!z) {
                            d0.e(c1.i, this.C.t.i, 0, 5);
                        }
                        break;
                    }
                }
            }
        }
    }

    @Override  // r.d
    public final boolean b() {
        return true;
    }

    @Override  // r.d
    public final void c(int v) {
        i i1;
        i i0;
        d d0 = this.C;
        if(d0 == null) {
            return;
        }
        if(!((e)d0).D(2)) {
            return;
        }
        int v1 = this.k0;
        c c0 = this.s;
        c c1 = this.u;
        c c2 = this.t;
        c c3 = this.v;
        switch(v1) {
            case 0: {
                i0 = c0.a;
                break;
            }
            case 1: {
                i0 = c1.a;
                break;
            }
            case 2: {
                i0 = c2.a;
                break;
            }
            case 3: {
                i0 = c3.a;
                break;
            }
            default: {
                return;
            }
        }
        i0.h = 5;
        if(v1 == 0 || v1 == 1) {
            c2.a.k(null, 0.0f);
            c3.a.k(null, 0.0f);
        }
        else {
            c0.a.k(null, 0.0f);
            c1.a.k(null, 0.0f);
        }
        ArrayList arrayList0 = this.l0;
        arrayList0.clear();
        for(int v2 = 0; v2 < this.j0; ++v2) {
            d d1 = this.i0[v2];
            if(this.m0 || d1.b()) {
                switch(this.k0) {
                    case 0: {
                        i1 = d1.s.a;
                        break;
                    }
                    case 1: {
                        i1 = d1.u.a;
                        break;
                    }
                    case 2: {
                        i1 = d1.t.a;
                        break;
                    }
                    case 3: {
                        i1 = d1.v.a;
                        break;
                    }
                    default: {
                        i1 = null;
                    }
                }
                if(i1 != null) {
                    arrayList0.add(i1);
                    i1.a(i0);
                }
            }
        }
    }

    @Override  // r.d
    public final void p() {
        super.p();
        this.l0.clear();
    }

    @Override  // r.d
    public final void r() {
        float f1;
        i i0;
        int v = this.k0;
        c c0 = this.s;
        c c1 = this.u;
        c c2 = this.t;
        c c3 = this.v;
        float f = 3.402823E+38f;
        if(v == 0) {
            i0 = c0.a;
        }
        else {
            switch(v) {
                case 1: {
                    i0 = c1.a;
                    break;
                }
                case 2: {
                    i0 = c2.a;
                    goto label_17;
                }
                case 3: {
                    i0 = c3.a;
                    break;
                }
                default: {
                    return;
                }
            }
            f = 0.0f;
        }
    label_17:
        ArrayList arrayList0 = this.l0;
        int v1 = arrayList0.size();
        i i1 = null;
        for(int v2 = 0; v2 < v1; ++v2) {
            i i2 = (i)arrayList0.get(v2);
            if(i2.b != 1) {
                return;
            }
            if(this.k0 == 0 || this.k0 == 2) {
                f1 = i2.g;
                if(f1 < f) {
                    i1 = i2.f;
                    f = f1;
                }
            }
            else {
                f1 = i2.g;
                if(f1 > f) {
                    i1 = i2.f;
                    f = f1;
                }
            }
        }
        i0.f = i1;
        i0.g = f;
        i0.b();
        switch(this.k0) {
            case 0: {
                c1.a.k(i1, f);
                return;
            }
            case 1: {
                c0.a.k(i1, f);
                return;
            }
            case 2: {
                c3.a.k(i1, f);
                return;
            }
            case 3: {
                c2.a.k(i1, f);
            }
        }
    }
}

