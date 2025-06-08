package r;

import B1.a;
import com.google.android.gms.internal.ads.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import q.f;

public final class e extends d {
    public ArrayList i0;
    public boolean j0;
    public q.d k0;
    public z l0;
    public int m0;
    public int n0;
    public b[] o0;
    public b[] p0;
    public ArrayList q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public int u0;
    public int v0;
    public int w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    public final void A(d d0, int v) {
        switch(v) {
            case 0: {
                b[] arr_b = this.p0;
                if(this.m0 + 1 >= arr_b.length) {
                    this.p0 = (b[])Arrays.copyOf(arr_b, arr_b.length * 2);
                }
                b[] arr_b1 = this.p0;
                int v1 = this.m0;
                arr_b1[v1] = new b(d0, 0, this.j0);
                this.m0 = v1 + 1;
                return;
            }
            case 1: {
                b[] arr_b2 = this.o0;
                if(this.n0 + 1 >= arr_b2.length) {
                    this.o0 = (b[])Arrays.copyOf(arr_b2, arr_b2.length * 2);
                }
                b[] arr_b3 = this.o0;
                int v2 = this.n0;
                arr_b3[v2] = new b(d0, 1, this.j0);
                this.n0 = v2 + 1;
            }
        }
    }

    public final void B(q.d d0) {
        this.a(d0);
        int v = this.i0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            d d1 = (d)this.i0.get(v1);
            if(d1 instanceof e) {
                int v2 = d1.h0[0];
                int v3 = d1.h0[1];
                if(v2 == 2) {
                    d1.t(1);
                }
                if(v3 == 2) {
                    d1.w(1);
                }
                d1.a(d0);
                if(v2 == 2) {
                    d1.t(2);
                }
                if(v3 == 2) {
                    d1.w(2);
                }
            }
            else {
                int[] arr_v = this.h0;
                if(arr_v[0] != 2 && d1.h0[0] == 4) {
                    int v4 = d1.s.e;
                    int v5 = this.k() - d1.u.e;
                    d1.s.i = d0.j(d1.s);
                    d1.u.i = d0.j(d1.u);
                    d0.d(d1.s.i, v4);
                    d0.d(d1.u.i, v5);
                    d1.a = 2;
                    d1.H = v4;
                    int v6 = v5 - v4;
                    d1.D = v6;
                    int v7 = d1.Q;
                    if(v6 < v7) {
                        d1.D = v7;
                    }
                }
                if(arr_v[1] != 2 && d1.h0[1] == 4) {
                    int v8 = d1.t.e;
                    int v9 = this.g() - d1.v.e;
                    d1.t.i = d0.j(d1.t);
                    d1.v.i = d0.j(d1.v);
                    d0.d(d1.t.i, v8);
                    d0.d(d1.v.i, v9);
                    if(d1.P > 0 || d1.X == 8) {
                        f f0 = d0.j(d1.w);
                        d1.w.i = f0;
                        d0.d(f0, d1.P + v8);
                    }
                    d1.b = 2;
                    d1.v(v8, v9);
                }
                d1.a(d0);
            }
        }
        if(this.m0 > 0) {
            h.a(this, d0, 0);
        }
        if(this.n0 > 0) {
            h.a(this, d0, 1);
        }
    }

    public final void C() {
        int v41;
        int v40;
        int v38;
        int v36;
        int v19;
        int v18;
        ArrayList arrayList6;
        int v17;
        int v = this.H;
        int v1 = this.I;
        int v2 = Math.max(0, this.k());
        int v3 = Math.max(0, this.g());
        this.y0 = false;
        this.z0 = false;
        q.d d0 = this.k0;
        if(this.C == null) {
            this.H = 0;
            this.I = 0;
        }
        else {
            if(this.l0 == null) {
                z z0 = new z(4);
                z0.f = new ArrayList();
                z0.b = this.H;
                z0.c = this.I;
                z0.d = this.k();
                z0.e = this.g();
                ArrayList arrayList0 = this.B;
                int v4 = arrayList0.size();
                for(int v5 = 0; v5 < v4; ++v5) {
                    c c0 = (c)arrayList0.get(v5);
                    ArrayList arrayList1 = (ArrayList)z0.f;
                    l l0 = new l();  // 初始化器: Ljava/lang/Object;-><init>()V
                    l0.a = c0;
                    l0.b = c0.d;
                    l0.c = c0.b();
                    l0.d = c0.g;
                    l0.e = c0.h;
                    arrayList1.add(l0);
                }
                this.l0 = z0;
            }
            z z1 = this.l0;
            z1.getClass();
            z1.b = this.H;
            z1.c = this.I;
            z1.d = this.k();
            z1.e = this.g();
            ArrayList arrayList2 = (ArrayList)z1.f;
            int v6 = arrayList2.size();
            for(int v7 = 0; v7 < v6; ++v7) {
                l l1 = (l)arrayList2.get(v7);
                c c1 = this.f(l1.a.c);
                l1.a = c1;
                if(c1 == null) {
                    l1.b = null;
                    l1.c = 0;
                    l1.d = 2;
                    l1.e = 0;
                }
                else {
                    l1.b = c1.d;
                    l1.c = c1.b();
                    l1.d = l1.a.g;
                    l1.e = l1.a.h;
                }
            }
            this.H = 0;
            this.I = 0;
            d d1 = this.C;
            if(d1 != null && d1 instanceof e) {
                e e0 = (e)d1;
            }
            ArrayList arrayList3 = this.B;
            int v8 = arrayList3.size();
            for(int v9 = 0; v9 < v8; ++v9) {
                ((c)arrayList3.get(v9)).d();
            }
            this.q(d0.k);
        }
        if(this.w0 == 0) {
            d0.f = false;
        }
        else {
            if(!this.D(8)) {
                int v10 = this.i0.size();
                this.p();
                for(int v11 = 0; v11 < v10; ++v11) {
                    ((d)this.i0.get(v11)).p();
                }
            }
            if(!this.D(0x20)) {
                if(!this.D(8)) {
                    this.c(this.w0);
                }
                this.E();
            }
            d0.f = true;
        }
        int[] arr_v = this.h0;
        int v12 = arr_v[1];
        int v13 = arr_v[0];
        this.m0 = 0;
        this.n0 = 0;
        ArrayList arrayList4 = this.q0;
        if(arrayList4.size() == 0) {
            arrayList4.clear();
            arrayList4.add(0, new r.f(this.i0));
        }
        int v14 = arrayList4.size();
        ArrayList arrayList5 = this.i0;
        boolean z2 = arr_v[0] == 2 || arr_v[1] == 2;
        int v15 = 0;
        int v16 = 0;
        while(v16 < v14 && !this.x0) {
            if(((r.f)arrayList4.get(v16)).b) {
                v17 = v16;
                arrayList6 = arrayList5;
                v18 = v14;
            }
            else {
                if(!this.D(0x20)) {
                    v19 = v15;
                    v18 = v14;
                }
                else if(arr_v[0] != 1 || arr_v[1] != 1) {
                    v19 = v15;
                    v18 = v14;
                    this.i0 = (ArrayList)((r.f)arrayList4.get(v16)).a;
                }
                else {
                    r.f f0 = (r.f)arrayList4.get(v16);
                    ArrayList arrayList7 = f0.h;
                    if(arrayList7.isEmpty()) {
                        v18 = v14;
                        List list0 = f0.a;
                        v19 = v15;
                        int v20 = list0.size();
                        for(int v21 = 0; v21 < v20; ++v21) {
                            d d2 = (d)list0.get(v21);
                            if(!d2.Z) {
                                r.f.b(arrayList7, d2);
                            }
                        }
                        f0.i.clear();
                        f0.i.addAll(list0);
                        f0.i.removeAll(arrayList7);
                    }
                    else {
                        v19 = v15;
                        v18 = v14;
                    }
                    this.i0 = arrayList7;
                }
                this.m0 = 0;
                this.n0 = 0;
                int v22 = this.i0.size();
                for(int v23 = 0; v23 < v22; ++v23) {
                    d d3 = (d)this.i0.get(v23);
                    if(d3 instanceof e) {
                        ((e)d3).C();
                    }
                }
                int v24 = 0;
                int v25 = 1;
                while(v25 != 0) {
                    try {
                        d0.q();
                        this.m0 = 0;
                        this.n0 = 0;
                        this.e(d0);
                        for(int v26 = 0; v26 < v22; ++v26) {
                            ((d)this.i0.get(v26)).e(d0);
                        }
                        this.B(d0);
                        q.c c2 = d0.b;
                        if(d0.f) {
                            int v27 = 0;
                            while(v27 < d0.i) {
                                if(d0.e[v27].d) {
                                    ++v27;
                                    continue;
                                }
                                d0.o(c2);
                                goto label_182;
                            }
                            for(int v28 = 0; v28 < d0.i; ++v28) {
                                q.b b0 = d0.e[v28];
                                b0.a.d = b0.b;
                            }
                        }
                        else {
                            d0.o(c2);
                        }
                    }
                    catch(Exception exception0) {
                        exception0.printStackTrace();
                        System.out.println("EXCEPTION : " + exception0);
                    }
                label_182:
                    boolean[] arr_z = h.a;
                    arr_z[2] = false;
                    this.z(d0);
                    int v29 = this.i0.size();
                    for(int v30 = 0; v30 < v29; ++v30) {
                        d d4 = (d)this.i0.get(v30);
                        d4.z(d0);
                        int[] arr_v1 = d4.h0;
                        if(arr_v1[0] == 3 && d4.k() < d4.S) {
                            arr_z[2] = true;
                        }
                        if(arr_v1[1] == 3 && d4.g() < d4.T) {
                            arr_z[2] = true;
                        }
                    }
                    if(!z2 || v24 + 1 >= 8 || !arr_z[2]) {
                        v36 = 0;
                    }
                    else {
                        int v32 = 0;
                        int v33 = 0;
                        for(int v31 = 0; v31 < v22; ++v31) {
                            d d5 = (d)this.i0.get(v31);
                            v32 = Math.max(v32, d5.k() + d5.H);
                            v33 = Math.max(v33, d5.g() + d5.I);
                        }
                        int v34 = Math.max(this.Q, v32);
                        int v35 = Math.max(this.R, v33);
                        if(v13 != 2 || this.k() >= v34) {
                            v36 = 0;
                        }
                        else {
                            this.x(v34);
                            arr_v[0] = 2;
                            v36 = 1;
                            v19 = 1;
                        }
                        if(v12 == 2 && this.g() < v35) {
                            this.s(v35);
                            arr_v[1] = 2;
                            v36 = 1;
                            v19 = 1;
                        }
                    }
                    int v37 = Math.max(this.Q, this.k());
                    if(v37 > this.k()) {
                        this.x(v37);
                        arr_v[0] = 1;
                        v36 = 1;
                        v38 = 1;
                    }
                    else {
                        v38 = v19;
                    }
                    int v39 = Math.max(this.R, this.g());
                    if(v39 > this.g()) {
                        this.s(v39);
                        arr_v[1] = 1;
                        v40 = 1;
                        v41 = 1;
                    }
                    else {
                        v41 = v36;
                        v40 = v38;
                    }
                    if(v40 == 0) {
                        if(arr_v[0] == 2 && v2 > 0 && this.k() > v2) {
                            this.y0 = true;
                            arr_v[0] = 1;
                            this.x(v2);
                            v40 = 1;
                            v41 = 1;
                        }
                        if(arr_v[1] == 2 && v3 > 0 && this.g() > v3) {
                            this.z0 = true;
                            arr_v[1] = 1;
                            this.s(v3);
                            v25 = 1;
                            v19 = 1;
                        }
                    }
                    else {
                        v19 = v40;
                        v25 = v41;
                    }
                    ++v24;
                }
                v17 = v16;
                arrayList6 = arrayList5;
                ArrayList arrayList8 = ((r.f)arrayList4.get(v17)).i;
                int v42 = arrayList8.size();
                for(int v43 = 0; v43 < v42; ++v43) {
                    r.f.c(((d)arrayList8.get(v43)));
                }
                v15 = v19;
            }
            v16 = v17 + 1;
            v14 = v18;
            arrayList5 = arrayList6;
        }
        this.i0 = arrayList5;
        if(this.C == null) {
            this.H = v;
            this.I = v1;
        }
        else {
            int v44 = Math.max(this.Q, this.k());
            int v45 = Math.max(this.R, this.g());
            z z3 = this.l0;
            this.H = z3.b;
            this.I = z3.c;
            this.x(z3.d);
            this.s(z3.e);
            ArrayList arrayList9 = (ArrayList)z3.f;
            int v46 = arrayList9.size();
            for(int v47 = 0; v47 < v46; ++v47) {
                l l2 = (l)arrayList9.get(v47);
                this.f(l2.a.c).a(l2.b, l2.c, -1, l2.d, l2.e, false);
            }
            this.x(v44);
            this.s(v45);
        }
        if(v15 != 0) {
            arr_v[0] = v13;
            arr_v[1] = v12;
        }
        this.q(d0.k);
        d d6 = this.C;
        e e1 = this;
        while(d6 != null) {
            d d7 = d6.C;
            if(d6 instanceof e) {
                e1 = (e)d6;
            }
            d6 = d7;
        }
        if(this == e1) {
            this.y();
        }
    }

    public final boolean D(int v) {
        return (this.w0 & v) == v;
    }

    public final void E() {
        c c0 = this.f(2);
        c c1 = this.f(3);
        c0.a.k(null, 0.0f);
        c1.a.k(null, 0.0f);
    }

    @Override  // r.d
    public final void c(int v) {
        super.c(v);
        int v1 = this.i0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            ((d)this.i0.get(v2)).c(v);
        }
    }

    @Override  // r.d
    public final void o() {
        this.k0.q();
        this.q0.clear();
        this.x0 = false;
        this.i0.clear();
        super.o();
    }

    @Override  // r.d
    public final void q(a a0) {
        super.q(a0);
        int v = this.i0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((d)this.i0.get(v1)).q(a0);
        }
    }

    @Override  // r.d
    public final void u(int v, int v1) {
        this.N = v;
        this.O = v1;
        int v2 = this.i0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            ((d)this.i0.get(v3)).u(this.H + this.N, this.I + this.O);
        }
    }

    @Override  // r.d
    public final void y() {
        super.y();
        ArrayList arrayList0 = this.i0;
        if(arrayList0 == null) {
            return;
        }
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            d d0 = (d)this.i0.get(v1);
            d0.u(this.L + this.N, this.M + this.O);
            if(!(d0 instanceof e)) {
                d0.y();
            }
        }
    }
}

