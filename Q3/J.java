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

public final class j extends l {
    public List A;
    public List B;
    public List C;
    public int D;
    public int E;
    public Q F;
    public int G;
    public List H;
    public int I;
    public List J;
    public List K;
    public int L;
    public X M;
    public List N;
    public e0 O;
    public byte P;
    public int Q;
    public static final j R;
    public static final a S;
    public final e j;
    public int k;
    public int l;
    public int m;
    public int n;
    public List o;
    public List p;
    public List q;
    public int r;
    public List s;
    public int t;
    public List u;
    public List v;
    public int w;
    public List x;
    public List y;
    public List z;

    static {
        j.S = new a(3);
        j j0 = new j();
        j.R = j0;
        j0.p();
    }

    public j() {
        this.r = -1;
        this.t = -1;
        this.w = -1;
        this.D = -1;
        this.I = -1;
        this.L = -1;
        this.P = -1;
        this.Q = -1;
        this.j = e.i;
    }

    public j(Ra ra0, g g0) {
        InvalidProtocolBufferException invalidProtocolBufferException1;
        IOException iOException1;
        Throwable throwable1;
        P p0;
        this.r = -1;
        this.t = -1;
        this.w = -1;
        this.D = -1;
        this.I = -1;
        this.L = -1;
        this.P = -1;
        this.Q = -1;
        this.p();
        d d0 = e.n();
        w w0 = w.j(d0, 1);
        int v = 0;
        boolean z = false;
        while(!z) {
            try {
                int v1 = ra0.n();
                p0 = null;
                switch(v1) {
                    case 0: {
                        break;
                    }
                    case 8: {
                        this.k |= 1;
                        this.l = ra0.f();
                        continue;
                    }
                    case 16: {
                        goto label_26;
                    }
                    case 18: {
                        goto label_31;
                    }
                    case 24: {
                        this.k |= 2;
                        this.m = ra0.f();
                        continue;
                    }
                    case 0x20: {
                        this.k |= 4;
                        this.n = ra0.f();
                        continue;
                    }
                    case 42: {
                        goto label_46;
                    }
                    case 50: {
                        goto label_51;
                    }
                    case 56: {
                        goto label_56;
                    }
                    case 58: {
                        goto label_61;
                    }
                    case 66: {
                        goto label_70;
                    }
                    case 74: {
                        goto label_75;
                    }
                    case 82: {
                        goto label_80;
                    }
                    case 90: {
                        goto label_85;
                    }
                    case 106: {
                        goto label_90;
                    }
                    case 0x80: {
                        goto label_95;
                    }
                    case 130: {
                        goto label_100;
                    }
                    case 0x88: {
                        this.k |= 8;
                        this.E = ra0.f();
                        continue;
                    }
                    case 0x92: {
                        goto label_112;
                    }
                    case 0x98: {
                        this.k |= 0x20;
                        this.G = ra0.f();
                        continue;
                    }
                    case 0xA2: {
                        goto label_124;
                    }
                    case 0xA8: {
                        goto label_129;
                    }
                    case 170: {
                        goto label_134;
                    }
                    case 0xB0: {
                        goto label_143;
                    }
                    case 0xB2: {
                        goto label_148;
                    }
                    case 0xBA: {
                        goto label_157;
                    }
                    case 0xC0: {
                        goto label_162;
                    }
                    case 0xC2: {
                        goto label_167;
                    }
                    case 0xF2: {
                        goto label_176;
                    }
                    case 0xF8: {
                        goto label_185;
                    }
                    case 0xFA: {
                        goto label_190;
                    }
                    case 0x102: {
                        goto label_199;
                    }
                    default: {
                        if(this.n(ra0, w0, g0, v1)) {
                            continue;
                        }
                        z = true;
                        continue;
                    }
                }
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                invalidProtocolBufferException1 = invalidProtocolBufferException0;
                invalidProtocolBufferException1.i = this;
                throw invalidProtocolBufferException1;
            }
            catch(IOException iOException0) {
                iOException1 = iOException0;
                goto label_218;
            }
            catch(Throwable throwable0) {
                throwable1 = throwable0;
                goto label_221;
            }
            z = true;
            continue;
            try {
                try {
                    this.k |= 1;
                    this.l = ra0.f();
                    continue;
                label_26:
                    if((v & 0x20) != 0x20) {
                        this.q = new ArrayList();
                        v |= 0x20;
                    }
                    this.q.add(ra0.f());
                    continue;
                label_31:
                    int v2 = ra0.d(ra0.k());
                    if((v & 0x20) != 0x20 && ra0.b() > 0) {
                        this.q = new ArrayList();
                        v |= 0x20;
                    }
                    while(ra0.b() > 0) {
                        this.q.add(ra0.f());
                    }
                    ra0.c(v2);
                    continue;
                label_46:
                    if((v & 8) != 8) {
                        this.o = new ArrayList();
                        v |= 8;
                    }
                    this.o.add(ra0.g(W.v, g0));
                    continue;
                label_51:
                    if((v & 16) != 16) {
                        this.p = new ArrayList();
                        v |= 16;
                    }
                    this.p.add(ra0.g(Q.C, g0));
                    continue;
                label_56:
                    if((v & 0x40) != 0x40) {
                        this.s = new ArrayList();
                        v |= 0x40;
                    }
                    this.s.add(ra0.f());
                    continue;
                label_61:
                    int v3 = ra0.d(ra0.k());
                    if((v & 0x40) != 0x40 && ra0.b() > 0) {
                        this.s = new ArrayList();
                        v |= 0x40;
                    }
                    while(ra0.b() > 0) {
                        this.s.add(ra0.f());
                    }
                    ra0.c(v3);
                    continue;
                label_70:
                    if((v & 0x200) != 0x200) {
                        this.x = new ArrayList();
                        v |= 0x200;
                    }
                    this.x.add(ra0.g(q3.l.r, g0));
                    continue;
                label_75:
                    if((v & 0x400) != 0x400) {
                        this.y = new ArrayList();
                        v |= 0x400;
                    }
                    this.y.add(ra0.g(y.D, g0));
                    continue;
                label_80:
                    if((v & 0x800) != 0x800) {
                        this.z = new ArrayList();
                        v |= 0x800;
                    }
                    this.z.add(ra0.g(G.D, g0));
                    continue;
                label_85:
                    if((v & 0x1000) != 0x1000) {
                        this.A = new ArrayList();
                        v |= 0x1000;
                    }
                    this.A.add(ra0.g(T.x, g0));
                    continue;
                label_90:
                    if((v & 0x2000) != 0x2000) {
                        this.B = new ArrayList();
                        v |= 0x2000;
                    }
                    this.B.add(ra0.g(t.p, g0));
                    continue;
                label_95:
                    if((v & 0x4000) != 0x4000) {
                        this.C = new ArrayList();
                        v |= 0x4000;
                    }
                    this.C.add(ra0.f());
                    continue;
                label_100:
                    int v4 = ra0.d(ra0.k());
                    if((v & 0x4000) != 0x4000 && ra0.b() > 0) {
                        this.C = new ArrayList();
                        v |= 0x4000;
                    }
                    while(ra0.b() > 0) {
                        this.C.add(ra0.f());
                    }
                    ra0.c(v4);
                    continue;
                label_112:
                    if((this.k & 16) == 16) {
                        p0 = this.F.s();
                    }
                    Q q0 = (Q)ra0.g(Q.C, g0);
                    this.F = q0;
                    if(p0 != null) {
                        p0.i(q0);
                        this.F = p0.g();
                    }
                    this.k |= 16;
                    continue;
                label_124:
                    if((v & 0x80) != 0x80) {
                        this.u = new ArrayList();
                        v |= 0x80;
                    }
                    this.u.add(ra0.g(Q.C, g0));
                    continue;
                label_129:
                    if((v & 0x100) != 0x100) {
                        this.v = new ArrayList();
                        v |= 0x100;
                    }
                    this.v.add(ra0.f());
                    continue;
                label_134:
                    int v5 = ra0.d(ra0.k());
                    if((v & 0x100) != 0x100 && ra0.b() > 0) {
                        this.v = new ArrayList();
                        v |= 0x100;
                    }
                    while(ra0.b() > 0) {
                        this.v.add(ra0.f());
                    }
                    ra0.c(v5);
                    continue;
                label_143:
                    if((v & 0x40000) != 0x40000) {
                        this.H = new ArrayList();
                        v |= 0x40000;
                    }
                    this.H.add(ra0.f());
                    continue;
                label_148:
                    int v6 = ra0.d(ra0.k());
                    if((v & 0x40000) != 0x40000 && ra0.b() > 0) {
                        this.H = new ArrayList();
                        v |= 0x40000;
                    }
                    while(ra0.b() > 0) {
                        this.H.add(ra0.f());
                    }
                    ra0.c(v6);
                    continue;
                label_157:
                    if((v & 0x80000) != 0x80000) {
                        this.J = new ArrayList();
                        v |= 0x80000;
                    }
                    this.J.add(ra0.g(Q.C, g0));
                    continue;
                label_162:
                    if((v & 0x100000) != 0x100000) {
                        this.K = new ArrayList();
                        v |= 0x100000;
                    }
                    this.K.add(ra0.f());
                    continue;
                label_167:
                    int v7 = ra0.d(ra0.k());
                    if((v & 0x100000) != 0x100000 && ra0.b() > 0) {
                        this.K = new ArrayList();
                        v |= 0x100000;
                    }
                    while(ra0.b() > 0) {
                        this.K.add(ra0.f());
                    }
                    ra0.c(v7);
                    continue;
                label_176:
                    if((this.k & 0x40) == 0x40) {
                        p0 = this.M.j();
                    }
                    X x0 = (X)ra0.g(X.p, g0);
                    this.M = x0;
                    if(p0 != null) {
                        ((f)p0).l(x0);
                        this.M = ((f)p0).h();
                    }
                    this.k |= 0x40;
                    continue;
                label_185:
                    if((v & 0x400000) != 0x400000) {
                        this.N = new ArrayList();
                        v |= 0x400000;
                    }
                    this.N.add(ra0.f());
                    continue;
                label_190:
                    int v8 = ra0.d(ra0.k());
                    if((v & 0x400000) != 0x400000 && ra0.b() > 0) {
                        this.N = new ArrayList();
                        v |= 0x400000;
                    }
                    while(ra0.b() > 0) {
                        this.N.add(ra0.f());
                    }
                    ra0.c(v8);
                    continue;
                label_199:
                    if((this.k & 0x80) == 0x80) {
                        p0 = this.O.i();
                    }
                    e0 e00 = (e0)ra0.g(e0.n, g0);
                    this.O = e00;
                    if(p0 != null) {
                        ((m)p0).m(e00);
                        this.O = ((m)p0).i();
                    }
                    this.k |= 0x80;
                    continue;
                }
                catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                    invalidProtocolBufferException1 = invalidProtocolBufferException0;
                    invalidProtocolBufferException1.i = this;
                    throw invalidProtocolBufferException1;
                }
                catch(IOException iOException0) {
                    iOException1 = iOException0;
                    goto label_218;
                }
                invalidProtocolBufferException1.i = this;
                throw invalidProtocolBufferException1;
            label_218:
                InvalidProtocolBufferException invalidProtocolBufferException2 = new InvalidProtocolBufferException(iOException1.getMessage());
                invalidProtocolBufferException2.i = this;
                throw invalidProtocolBufferException2;
            }
            catch(Throwable throwable0) {
                throwable1 = throwable0;
            }
        label_221:
            if((v & 0x20) == 0x20) {
                this.q = Collections.unmodifiableList(this.q);
            }
            if((v & 8) == 8) {
                this.o = Collections.unmodifiableList(this.o);
            }
            if((v & 16) == 16) {
                this.p = Collections.unmodifiableList(this.p);
            }
            if((v & 0x40) == 0x40) {
                this.s = Collections.unmodifiableList(this.s);
            }
            if((v & 0x200) == 0x200) {
                this.x = Collections.unmodifiableList(this.x);
            }
            if((v & 0x400) == 0x400) {
                this.y = Collections.unmodifiableList(this.y);
            }
            if((v & 0x800) == 0x800) {
                this.z = Collections.unmodifiableList(this.z);
            }
            if((v & 0x1000) == 0x1000) {
                this.A = Collections.unmodifiableList(this.A);
            }
            if((v & 0x2000) == 0x2000) {
                this.B = Collections.unmodifiableList(this.B);
            }
            if((v & 0x4000) == 0x4000) {
                this.C = Collections.unmodifiableList(this.C);
            }
            if((v & 0x80) == 0x80) {
                this.u = Collections.unmodifiableList(this.u);
            }
            if((v & 0x100) == 0x100) {
                this.v = Collections.unmodifiableList(this.v);
            }
            if((v & 0x40000) == 0x40000) {
                this.H = Collections.unmodifiableList(this.H);
            }
            if((v & 0x80000) == 0x80000) {
                this.J = Collections.unmodifiableList(this.J);
            }
            if((v & 0x100000) == 0x100000) {
                this.K = Collections.unmodifiableList(this.K);
            }
            if((v & 0x400000) == 0x400000) {
                this.N = Collections.unmodifiableList(this.N);
            }
            try {
                w0.i();
                goto label_258;
            }
            catch(IOException unused_ex) {
                goto label_258;
            }
            catch(Throwable throwable2) {
            }
            this.j = d0.c();
            throw throwable2;
        label_258:
            this.j = d0.c();
            this.m();
            throw throwable1;
        }
        if((v & 0x20) == 0x20) {
            this.q = Collections.unmodifiableList(this.q);
        }
        if((v & 8) == 8) {
            this.o = Collections.unmodifiableList(this.o);
        }
        if((v & 16) == 16) {
            this.p = Collections.unmodifiableList(this.p);
        }
        if((v & 0x40) == 0x40) {
            this.s = Collections.unmodifiableList(this.s);
        }
        if((v & 0x200) == 0x200) {
            this.x = Collections.unmodifiableList(this.x);
        }
        if((v & 0x400) == 0x400) {
            this.y = Collections.unmodifiableList(this.y);
        }
        if((v & 0x800) == 0x800) {
            this.z = Collections.unmodifiableList(this.z);
        }
        if((v & 0x1000) == 0x1000) {
            this.A = Collections.unmodifiableList(this.A);
        }
        if((v & 0x2000) == 0x2000) {
            this.B = Collections.unmodifiableList(this.B);
        }
        if((v & 0x4000) == 0x4000) {
            this.C = Collections.unmodifiableList(this.C);
        }
        if((v & 0x80) == 0x80) {
            this.u = Collections.unmodifiableList(this.u);
        }
        if((v & 0x100) == 0x100) {
            this.v = Collections.unmodifiableList(this.v);
        }
        if((v & 0x40000) == 0x40000) {
            this.H = Collections.unmodifiableList(this.H);
        }
        if((v & 0x80000) == 0x80000) {
            this.J = Collections.unmodifiableList(this.J);
        }
        if((v & 0x100000) == 0x100000) {
            this.K = Collections.unmodifiableList(this.K);
        }
        if((v & 0x400000) == 0x400000) {
            this.N = Collections.unmodifiableList(this.N);
        }
        try {
            w0.i();
            goto label_298;
        }
        catch(IOException unused_ex) {
            goto label_298;
        }
        catch(Throwable throwable3) {
        }
        this.j = d0.c();
        throw throwable3;
    label_298:
        this.j = d0.c();
        this.m();
    }

    public j(h h0) {
        super(h0);
        this.r = -1;
        this.t = -1;
        this.w = -1;
        this.D = -1;
        this.I = -1;
        this.L = -1;
        this.P = -1;
        this.Q = -1;
        this.j = h0.i;
    }

    @Override  // w3.v
    public final b a() {
        return j.R;
    }

    @Override  // w3.v
    public final boolean b() {
        int v = this.P;
        if(v == 1) {
            return true;
        }
        if(v == 0) {
            return false;
        }
        if((this.k & 2) == 2) {
            for(int v1 = 0; v1 < this.o.size(); ++v1) {
                if(!((W)this.o.get(v1)).b()) {
                    this.P = 0;
                    return false;
                }
            }
            for(int v2 = 0; v2 < this.p.size(); ++v2) {
                if(!((Q)this.p.get(v2)).b()) {
                    this.P = 0;
                    return false;
                }
            }
            for(int v3 = 0; v3 < this.u.size(); ++v3) {
                if(!((Q)this.u.get(v3)).b()) {
                    this.P = 0;
                    return false;
                }
            }
            for(int v4 = 0; v4 < this.x.size(); ++v4) {
                if(!((q3.l)this.x.get(v4)).b()) {
                    this.P = 0;
                    return false;
                }
            }
            for(int v5 = 0; v5 < this.y.size(); ++v5) {
                if(!((y)this.y.get(v5)).b()) {
                    this.P = 0;
                    return false;
                }
            }
            for(int v6 = 0; v6 < this.z.size(); ++v6) {
                if(!((G)this.z.get(v6)).b()) {
                    this.P = 0;
                    return false;
                }
            }
            for(int v7 = 0; v7 < this.A.size(); ++v7) {
                if(!((T)this.A.get(v7)).b()) {
                    this.P = 0;
                    return false;
                }
            }
            for(int v8 = 0; v8 < this.B.size(); ++v8) {
                if(!((t)this.B.get(v8)).b()) {
                    this.P = 0;
                    return false;
                }
            }
            if((this.k & 16) == 16 && !this.F.b()) {
                this.P = 0;
                return false;
            }
            for(int v9 = 0; v9 < this.J.size(); ++v9) {
                if(!((Q)this.J.get(v9)).b()) {
                    this.P = 0;
                    return false;
                }
            }
            if((this.k & 0x40) == 0x40 && !this.M.b()) {
                this.P = 0;
                return false;
            }
            if(!this.i()) {
                this.P = 0;
                return false;
            }
            this.P = 1;
            return true;
        }
        this.P = 0;
        return false;
    }

    @Override  // w3.b
    public final int c() {
        int v1 = this.Q;
        if(v1 != -1) {
            return v1;
        }
        int v2 = (this.k & 1) == 1 ? w.b(1, this.l) : 0;
        int v4 = 0;
        for(int v3 = 0; v3 < this.q.size(); ++v3) {
            v4 += w.c(((int)(((Integer)this.q.get(v3)))));
        }
        int v5 = this.q.isEmpty() ? v2 + v4 : v2 + v4 + 1 + w.c(v4);
        this.r = v4;
        if((this.k & 2) == 2) {
            v5 += w.b(3, this.m);
        }
        if((this.k & 4) == 4) {
            v5 += w.b(4, this.n);
        }
        for(int v6 = 0; v6 < this.o.size(); ++v6) {
            v5 += w.d(5, ((b)this.o.get(v6)));
        }
        for(int v7 = 0; v7 < this.p.size(); ++v7) {
            v5 += w.d(6, ((b)this.p.get(v7)));
        }
        int v9 = 0;
        for(int v8 = 0; v8 < this.s.size(); ++v8) {
            v9 += w.c(((int)(((Integer)this.s.get(v8)))));
        }
        int v10 = this.s.isEmpty() ? v5 + v9 : v5 + v9 + 1 + w.c(v9);
        this.t = v9;
        for(int v11 = 0; v11 < this.x.size(); ++v11) {
            v10 += w.d(8, ((b)this.x.get(v11)));
        }
        for(int v12 = 0; v12 < this.y.size(); ++v12) {
            v10 += w.d(9, ((b)this.y.get(v12)));
        }
        for(int v13 = 0; v13 < this.z.size(); ++v13) {
            v10 += w.d(10, ((b)this.z.get(v13)));
        }
        for(int v14 = 0; v14 < this.A.size(); ++v14) {
            v10 += w.d(11, ((b)this.A.get(v14)));
        }
        for(int v15 = 0; v15 < this.B.size(); ++v15) {
            v10 += w.d(13, ((b)this.B.get(v15)));
        }
        int v17 = 0;
        for(int v16 = 0; v16 < this.C.size(); ++v16) {
            v17 += w.c(((int)(((Integer)this.C.get(v16)))));
        }
        int v18 = this.C.isEmpty() ? v10 + v17 : v10 + v17 + 2 + w.c(v17);
        this.D = v17;
        if((this.k & 8) == 8) {
            v18 += w.b(17, this.E);
        }
        if((this.k & 16) == 16) {
            v18 += w.d(18, this.F);
        }
        if((this.k & 0x20) == 0x20) {
            v18 += w.b(19, this.G);
        }
        for(int v19 = 0; v19 < this.u.size(); ++v19) {
            v18 += w.d(20, ((b)this.u.get(v19)));
        }
        int v21 = 0;
        for(int v20 = 0; v20 < this.v.size(); ++v20) {
            v21 += w.c(((int)(((Integer)this.v.get(v20)))));
        }
        int v22 = this.v.isEmpty() ? v18 + v21 : v18 + v21 + 2 + w.c(v21);
        this.w = v21;
        int v24 = 0;
        for(int v23 = 0; v23 < this.H.size(); ++v23) {
            v24 += w.c(((int)(((Integer)this.H.get(v23)))));
        }
        int v25 = this.H.isEmpty() ? v22 + v24 : v22 + v24 + 2 + w.c(v24);
        this.I = v24;
        for(int v26 = 0; v26 < this.J.size(); ++v26) {
            v25 += w.d(23, ((b)this.J.get(v26)));
        }
        int v28 = 0;
        for(int v27 = 0; v27 < this.K.size(); ++v27) {
            v28 += w.c(((int)(((Integer)this.K.get(v27)))));
        }
        int v29 = this.K.isEmpty() ? v25 + v28 : v25 + v28 + 2 + w.c(v28);
        this.L = v28;
        if((this.k & 0x40) == 0x40) {
            v29 += w.d(30, this.M);
        }
        int v30 = 0;
        for(int v = 0; v < this.N.size(); ++v) {
            v30 += w.c(((int)(((Integer)this.N.get(v)))));
        }
        int v31 = this.N.size() * 2 + (v29 + v30);
        if((this.k & 0x80) == 0x80) {
            v31 += w.d(0x20, this.O);
        }
        int v32 = this.j();
        int v33 = this.j.size() + (v32 + v31);
        this.Q = v33;
        return v33;
    }

    @Override  // w3.b
    public final i d() {
        return h.h();
    }

    @Override  // w3.b
    public final i e() {
        i i0 = h.h();
        ((h)i0).i(this);
        return i0;
    }

    @Override  // w3.b
    public final void f(w w0) {
        this.c();
        k k0 = new k(this);
        if((this.k & 1) == 1) {
            w0.m(1, this.l);
        }
        if(this.q.size() > 0) {
            w0.v(18);
            w0.v(this.r);
        }
        for(int v1 = 0; v1 < this.q.size(); ++v1) {
            w0.n(((int)(((Integer)this.q.get(v1)))));
        }
        if((this.k & 2) == 2) {
            w0.m(3, this.m);
        }
        if((this.k & 4) == 4) {
            w0.m(4, this.n);
        }
        for(int v2 = 0; v2 < this.o.size(); ++v2) {
            w0.o(5, ((b)this.o.get(v2)));
        }
        for(int v3 = 0; v3 < this.p.size(); ++v3) {
            w0.o(6, ((b)this.p.get(v3)));
        }
        if(this.s.size() > 0) {
            w0.v(58);
            w0.v(this.t);
        }
        for(int v4 = 0; v4 < this.s.size(); ++v4) {
            w0.n(((int)(((Integer)this.s.get(v4)))));
        }
        for(int v5 = 0; v5 < this.x.size(); ++v5) {
            w0.o(8, ((b)this.x.get(v5)));
        }
        for(int v6 = 0; v6 < this.y.size(); ++v6) {
            w0.o(9, ((b)this.y.get(v6)));
        }
        for(int v7 = 0; v7 < this.z.size(); ++v7) {
            w0.o(10, ((b)this.z.get(v7)));
        }
        for(int v8 = 0; v8 < this.A.size(); ++v8) {
            w0.o(11, ((b)this.A.get(v8)));
        }
        for(int v9 = 0; v9 < this.B.size(); ++v9) {
            w0.o(13, ((b)this.B.get(v9)));
        }
        if(this.C.size() > 0) {
            w0.v(130);
            w0.v(this.D);
        }
        for(int v10 = 0; v10 < this.C.size(); ++v10) {
            w0.n(((int)(((Integer)this.C.get(v10)))));
        }
        if((this.k & 8) == 8) {
            w0.m(17, this.E);
        }
        if((this.k & 16) == 16) {
            w0.o(18, this.F);
        }
        if((this.k & 0x20) == 0x20) {
            w0.m(19, this.G);
        }
        for(int v11 = 0; v11 < this.u.size(); ++v11) {
            w0.o(20, ((b)this.u.get(v11)));
        }
        if(this.v.size() > 0) {
            w0.v(170);
            w0.v(this.w);
        }
        for(int v12 = 0; v12 < this.v.size(); ++v12) {
            w0.n(((int)(((Integer)this.v.get(v12)))));
        }
        if(this.H.size() > 0) {
            w0.v(0xB2);
            w0.v(this.I);
        }
        for(int v13 = 0; v13 < this.H.size(); ++v13) {
            w0.n(((int)(((Integer)this.H.get(v13)))));
        }
        for(int v14 = 0; v14 < this.J.size(); ++v14) {
            w0.o(23, ((b)this.J.get(v14)));
        }
        if(this.K.size() > 0) {
            w0.v(0xC2);
            w0.v(this.L);
        }
        for(int v15 = 0; v15 < this.K.size(); ++v15) {
            w0.n(((int)(((Integer)this.K.get(v15)))));
        }
        if((this.k & 0x40) == 0x40) {
            w0.o(30, this.M);
        }
        for(int v = 0; v < this.N.size(); ++v) {
            w0.m(0x1F, ((int)(((Integer)this.N.get(v)))));
        }
        if((this.k & 0x80) == 0x80) {
            w0.o(0x20, this.O);
        }
        k0.m0(19000, w0);
        w0.r(this.j);
    }

    public final void p() {
        this.l = 6;
        this.m = 0;
        this.n = 0;
        this.o = Collections.emptyList();
        this.p = Collections.emptyList();
        this.q = Collections.emptyList();
        this.s = Collections.emptyList();
        this.u = Collections.emptyList();
        this.v = Collections.emptyList();
        this.x = Collections.emptyList();
        this.y = Collections.emptyList();
        this.z = Collections.emptyList();
        this.A = Collections.emptyList();
        this.B = Collections.emptyList();
        this.C = Collections.emptyList();
        this.E = 0;
        this.F = Q.B;
        this.G = 0;
        this.H = Collections.emptyList();
        this.J = Collections.emptyList();
        this.K = Collections.emptyList();
        this.M = X.o;
        this.N = Collections.emptyList();
        this.O = e0.m;
    }
}

