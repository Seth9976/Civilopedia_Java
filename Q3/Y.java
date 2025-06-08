package q3;

import com.google.android.gms.internal.ads.Ra;
import com.google.android.gms.internal.ads.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import w3.b;
import w3.d;
import w3.e;
import w3.g;
import w3.i;
import w3.k;
import w3.l;

public final class y extends l {
    public byte A;
    public int B;
    public static final y C;
    public static final a D;
    public final e j;
    public int k;
    public int l;
    public int m;
    public int n;
    public Q o;
    public int p;
    public List q;
    public Q r;
    public int s;
    public List t;
    public List u;
    public int v;
    public List w;
    public X x;
    public List y;
    public n z;

    static {
        y.D = new a(9);
        y y0 = new y();
        y.C = y0;
        y0.q();
    }

    public y() {
        this.v = -1;
        this.A = -1;
        this.B = -1;
        this.j = e.i;
    }

    public y(Ra ra0, g g0) {
        this.v = -1;
        this.A = -1;
        this.B = -1;
        this.q();
        d d0 = new d();
        w w0 = w.j(d0, 1);
        int v = 0;
        boolean z = false;
        while(!z) {
            try {
                try {
                    int v1 = ra0.n();
                    P p0 = null;
                    switch(v1) {
                        case 0: {
                        label_14:
                            z = true;
                            continue;
                        }
                        case 8: {
                            this.k |= 2;
                            this.m = ra0.k();
                            continue;
                        }
                        case 16: {
                            this.k |= 4;
                            this.n = ra0.k();
                            continue;
                        }
                        case 26: {
                            if((this.k & 8) == 8) {
                                Q q0 = this.o;
                                q0.getClass();
                                p0 = Q.r(q0);
                            }
                            Q q1 = (Q)ra0.g(Q.C, g0);
                            this.o = q1;
                            if(p0 != null) {
                                p0.i(q1);
                                this.o = p0.g();
                            }
                            this.k |= 8;
                            continue;
                        }
                        case 34: {
                            if((v & 0x20) != 0x20) {
                                this.q = new ArrayList();
                                v |= 0x20;
                            }
                            this.q.add(ra0.g(W.v, g0));
                            continue;
                        }
                        case 42: {
                            if((this.k & 0x20) == 0x20) {
                                Q q2 = this.r;
                                q2.getClass();
                                p0 = Q.r(q2);
                            }
                            Q q3 = (Q)ra0.g(Q.C, g0);
                            this.r = q3;
                            if(p0 != null) {
                                p0.i(q3);
                                this.r = p0.g();
                            }
                            this.k |= 0x20;
                            continue;
                        }
                        case 50: {
                            if((v & 0x400) != 0x400) {
                                this.w = new ArrayList();
                                v |= 0x400;
                            }
                            this.w.add(ra0.g(Z.u, g0));
                            continue;
                        }
                        case 56: {
                            this.k |= 16;
                            this.p = ra0.k();
                            continue;
                        }
                        case 0x40: {
                            this.k |= 0x40;
                            this.s = ra0.k();
                            continue;
                        }
                        case 72: {
                            this.k |= 1;
                            this.l = ra0.k();
                            continue;
                        }
                        case 82: {
                            if((v & 0x100) != 0x100) {
                                this.t = new ArrayList();
                                v |= 0x100;
                            }
                            this.t.add(ra0.g(Q.C, g0));
                            continue;
                        }
                        case 88: {
                            if((v & 0x200) != 0x200) {
                                this.u = new ArrayList();
                                v |= 0x200;
                            }
                            this.u.add(ra0.k());
                            continue;
                        }
                        case 90: {
                            int v2 = ra0.d(ra0.k());
                            if((v & 0x200) != 0x200 && ra0.b() > 0) {
                                this.u = new ArrayList();
                                v |= 0x200;
                            }
                            while(ra0.b() > 0) {
                                this.u.add(ra0.k());
                            }
                            ra0.c(v2);
                            continue;
                        }
                        case 0xF2: {
                            if((this.k & 0x80) == 0x80) {
                                X x0 = this.x;
                                x0.getClass();
                                p0 = X.i(x0);
                            }
                            X x1 = (X)ra0.g(X.p, g0);
                            this.x = x1;
                            if(p0 != null) {
                                ((f)p0).l(x1);
                                this.x = ((f)p0).h();
                            }
                            this.k |= 0x80;
                            continue;
                        }
                        case 0xF8: {
                            if((v & 0x1000) != 0x1000) {
                                this.y = new ArrayList();
                                v |= 0x1000;
                            }
                            this.y.add(ra0.k());
                            continue;
                        }
                        case 0xFA: {
                            int v3 = ra0.d(ra0.k());
                            if((v & 0x1000) != 0x1000 && ra0.b() > 0) {
                                this.y = new ArrayList();
                                v |= 0x1000;
                            }
                            while(ra0.b() > 0) {
                                this.y.add(ra0.k());
                            }
                            ra0.c(v3);
                            continue;
                        }
                        case 0x102: {
                            if((this.k & 0x100) == 0x100) {
                                n n0 = this.z;
                                n0.getClass();
                                p0 = new m(0);
                                p0.l = Collections.emptyList();
                                ((m)p0).j(n0);
                            }
                            n n1 = (n)ra0.g(n.n, g0);
                            this.z = n1;
                            if(p0 != null) {
                                ((m)p0).j(n1);
                                this.z = ((m)p0).f();
                            }
                            break;
                        }
                        default: {
                            if(!this.n(ra0, w0, g0, v1)) {
                                goto label_14;
                            }
                            continue;
                        }
                    }
                    this.k |= 0x100;
                    continue;
                }
                catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                }
                catch(IOException iOException0) {
                    goto label_127;
                }
                invalidProtocolBufferException0.i = this;
                throw invalidProtocolBufferException0;
            label_127:
                InvalidProtocolBufferException invalidProtocolBufferException1 = new InvalidProtocolBufferException(iOException0.getMessage());
                invalidProtocolBufferException1.i = this;
                throw invalidProtocolBufferException1;
            }
            catch(Throwable throwable0) {
            }
            if((v & 0x20) == 0x20) {
                this.q = Collections.unmodifiableList(this.q);
            }
            if((v & 0x400) == 0x400) {
                this.w = Collections.unmodifiableList(this.w);
            }
            if((v & 0x100) == 0x100) {
                this.t = Collections.unmodifiableList(this.t);
            }
            if((v & 0x200) == 0x200) {
                this.u = Collections.unmodifiableList(this.u);
            }
            if((v & 0x1000) == 0x1000) {
                this.y = Collections.unmodifiableList(this.y);
            }
            try {
                w0.i();
                goto label_145;
            }
            catch(IOException unused_ex) {
                goto label_145;
            }
            catch(Throwable throwable1) {
            }
            this.j = d0.c();
            throw throwable1;
        label_145:
            this.j = d0.c();
            this.m();
            throw throwable0;
        }
        if((v & 0x20) == 0x20) {
            this.q = Collections.unmodifiableList(this.q);
        }
        if((v & 0x400) == 0x400) {
            this.w = Collections.unmodifiableList(this.w);
        }
        if((v & 0x100) == 0x100) {
            this.t = Collections.unmodifiableList(this.t);
        }
        if((v & 0x200) == 0x200) {
            this.u = Collections.unmodifiableList(this.u);
        }
        if((v & 0x1000) == 0x1000) {
            this.y = Collections.unmodifiableList(this.y);
        }
        try {
            w0.i();
            goto label_163;
        }
        catch(IOException unused_ex) {
            goto label_163;
        }
        catch(Throwable throwable2) {
        }
        this.j = d0.c();
        throw throwable2;
    label_163:
        this.j = d0.c();
        this.m();
    }

    public y(x x0) {
        super(x0);
        this.v = -1;
        this.A = -1;
        this.B = -1;
        this.j = x0.i;
    }

    @Override  // w3.v
    public final b a() {
        return y.C;
    }

    @Override  // w3.v
    public final boolean b() {
        int v = this.A;
        if(v == 1) {
            return true;
        }
        if(v == 0) {
            return false;
        }
        int v1 = this.k;
        if((v1 & 4) == 4) {
            if((v1 & 8) == 8 && !this.o.b()) {
                this.A = 0;
                return false;
            }
            for(int v2 = 0; v2 < this.q.size(); ++v2) {
                if(!((W)this.q.get(v2)).b()) {
                    this.A = 0;
                    return false;
                }
            }
            if(this.p() && !this.r.b()) {
                this.A = 0;
                return false;
            }
            for(int v3 = 0; v3 < this.t.size(); ++v3) {
                if(!((Q)this.t.get(v3)).b()) {
                    this.A = 0;
                    return false;
                }
            }
            for(int v4 = 0; v4 < this.w.size(); ++v4) {
                if(!((Z)this.w.get(v4)).b()) {
                    this.A = 0;
                    return false;
                }
            }
            if((this.k & 0x80) == 0x80 && !this.x.b()) {
                this.A = 0;
                return false;
            }
            if((this.k & 0x100) == 0x100 && !this.z.b()) {
                this.A = 0;
                return false;
            }
            if(!this.i()) {
                this.A = 0;
                return false;
            }
            this.A = 1;
            return true;
        }
        this.A = 0;
        return false;
    }

    @Override  // w3.b
    public final int c() {
        int v1 = this.B;
        if(v1 != -1) {
            return v1;
        }
        int v2 = (this.k & 2) == 2 ? w.b(1, this.m) : 0;
        if((this.k & 4) == 4) {
            v2 += w.b(2, this.n);
        }
        if((this.k & 8) == 8) {
            v2 += w.d(3, this.o);
        }
        for(int v3 = 0; v3 < this.q.size(); ++v3) {
            v2 += w.d(4, ((b)this.q.get(v3)));
        }
        if((this.k & 0x20) == 0x20) {
            v2 += w.d(5, this.r);
        }
        for(int v4 = 0; v4 < this.w.size(); ++v4) {
            v2 += w.d(6, ((b)this.w.get(v4)));
        }
        if((this.k & 16) == 16) {
            v2 += w.b(7, this.p);
        }
        if((this.k & 0x40) == 0x40) {
            v2 += w.b(8, this.s);
        }
        if((this.k & 1) == 1) {
            v2 += w.b(9, this.l);
        }
        for(int v5 = 0; v5 < this.t.size(); ++v5) {
            v2 += w.d(10, ((b)this.t.get(v5)));
        }
        int v7 = 0;
        for(int v6 = 0; v6 < this.u.size(); ++v6) {
            v7 += w.c(((int)(((Integer)this.u.get(v6)))));
        }
        int v8 = this.u.isEmpty() ? v2 + v7 : v2 + v7 + 1 + w.c(v7);
        this.v = v7;
        if((this.k & 0x80) == 0x80) {
            v8 += w.d(30, this.x);
        }
        int v9 = 0;
        for(int v = 0; v < this.y.size(); ++v) {
            v9 += w.c(((int)(((Integer)this.y.get(v)))));
        }
        int v10 = this.y.size() * 2 + (v8 + v9);
        if((this.k & 0x100) == 0x100) {
            v10 += w.d(0x20, this.z);
        }
        int v11 = this.j();
        int v12 = this.j.size() + (v11 + v10);
        this.B = v12;
        return v12;
    }

    @Override  // w3.b
    public final i d() {
        return x.h();
    }

    @Override  // w3.b
    public final i e() {
        i i0 = x.h();
        ((x)i0).i(this);
        return i0;
    }

    @Override  // w3.b
    public final void f(w w0) {
        this.c();
        k k0 = new k(this);
        if((this.k & 2) == 2) {
            w0.m(1, this.m);
        }
        if((this.k & 4) == 4) {
            w0.m(2, this.n);
        }
        if((this.k & 8) == 8) {
            w0.o(3, this.o);
        }
        for(int v1 = 0; v1 < this.q.size(); ++v1) {
            w0.o(4, ((b)this.q.get(v1)));
        }
        if((this.k & 0x20) == 0x20) {
            w0.o(5, this.r);
        }
        for(int v2 = 0; v2 < this.w.size(); ++v2) {
            w0.o(6, ((b)this.w.get(v2)));
        }
        if((this.k & 16) == 16) {
            w0.m(7, this.p);
        }
        if((this.k & 0x40) == 0x40) {
            w0.m(8, this.s);
        }
        if((this.k & 1) == 1) {
            w0.m(9, this.l);
        }
        for(int v3 = 0; v3 < this.t.size(); ++v3) {
            w0.o(10, ((b)this.t.get(v3)));
        }
        if(this.u.size() > 0) {
            w0.v(90);
            w0.v(this.v);
        }
        for(int v4 = 0; v4 < this.u.size(); ++v4) {
            w0.n(((int)(((Integer)this.u.get(v4)))));
        }
        if((this.k & 0x80) == 0x80) {
            w0.o(30, this.x);
        }
        for(int v = 0; v < this.y.size(); ++v) {
            w0.m(0x1F, ((int)(((Integer)this.y.get(v)))));
        }
        if((this.k & 0x100) == 0x100) {
            w0.o(0x20, this.z);
        }
        k0.m0(19000, w0);
        w0.r(this.j);
    }

    public final boolean p() {
        return (this.k & 0x20) == 0x20;
    }

    public final void q() {
        this.l = 6;
        this.m = 6;
        this.n = 0;
        this.o = Q.B;
        this.p = 0;
        this.q = Collections.emptyList();
        this.r = Q.B;
        this.s = 0;
        this.t = Collections.emptyList();
        this.u = Collections.emptyList();
        this.w = Collections.emptyList();
        this.x = X.o;
        this.y = Collections.emptyList();
        this.z = n.m;
    }
}

