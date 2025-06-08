package q3;

import com.google.android.gms.internal.ads.Ra;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import w3.b;
import w3.g;
import w3.i;
import w3.j;
import w3.o;

public final class h extends j {
    public List A;
    public int B;
    public Q C;
    public int D;
    public List E;
    public List F;
    public List G;
    public X H;
    public List I;
    public e0 J;
    public int l;
    public int m;
    public int n;
    public int o;
    public List p;
    public List q;
    public List r;
    public List s;
    public List t;
    public List u;
    public List v;
    public List w;
    public List x;
    public List y;
    public List z;

    @Override  // w3.i
    public final b c() {
        b b0 = this.g();
        if(!((q3.j)b0).b()) {
            throw new UninitializedMessageException();
        }
        return b0;
    }

    @Override
    public final Object clone() {
        h h0 = h.h();
        h0.i(this.g());
        return h0;
    }

    @Override  // w3.i
    public final i d(Ra ra0, g g0) {
        q3.j j1;
        q3.j j0;
        try {
            try {
                j0 = null;
                q3.j.S.getClass();
                j1 = new q3.j(ra0, g0);
                goto label_14;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                q3.j j2 = (q3.j)invalidProtocolBufferException0.i;
                try {
                    throw invalidProtocolBufferException0;
                }
                catch(Throwable throwable0) {
                    j0 = j2;
                }
            }
        }
        catch(Throwable throwable0) {
        }
        if(j0 != null) {
            this.i(j0);
        }
        throw throwable0;
    label_14:
        this.i(j1);
        return this;
    }

    @Override  // w3.i
    public final i e(o o0) {
        this.i(((q3.j)o0));
        return this;
    }

    public final q3.j g() {
        q3.j j0 = new q3.j(this);
        int v = this.l;
        int v1 = (v & 1) == 1 ? 1 : 0;
        j0.l = this.m;
        if((v & 2) == 2) {
            v1 |= 2;
        }
        j0.m = this.n;
        if((v & 4) == 4) {
            v1 |= 4;
        }
        j0.n = this.o;
        if((v & 8) == 8) {
            this.p = Collections.unmodifiableList(this.p);
            this.l &= -9;
        }
        j0.o = this.p;
        if((this.l & 16) == 16) {
            this.q = Collections.unmodifiableList(this.q);
            this.l &= -17;
        }
        j0.p = this.q;
        if((this.l & 0x20) == 0x20) {
            this.r = Collections.unmodifiableList(this.r);
            this.l &= -33;
        }
        j0.q = this.r;
        if((this.l & 0x40) == 0x40) {
            this.s = Collections.unmodifiableList(this.s);
            this.l &= -65;
        }
        j0.s = this.s;
        if((this.l & 0x80) == 0x80) {
            this.t = Collections.unmodifiableList(this.t);
            this.l &= 0xFFFFFF7F;
        }
        j0.u = this.t;
        if((this.l & 0x100) == 0x100) {
            this.u = Collections.unmodifiableList(this.u);
            this.l &= 0xFFFFFEFF;
        }
        j0.v = this.u;
        if((this.l & 0x200) == 0x200) {
            this.v = Collections.unmodifiableList(this.v);
            this.l &= 0xFFFFFDFF;
        }
        j0.x = this.v;
        if((this.l & 0x400) == 0x400) {
            this.w = Collections.unmodifiableList(this.w);
            this.l &= 0xFFFFFBFF;
        }
        j0.y = this.w;
        if((this.l & 0x800) == 0x800) {
            this.x = Collections.unmodifiableList(this.x);
            this.l &= 0xFFFFF7FF;
        }
        j0.z = this.x;
        if((this.l & 0x1000) == 0x1000) {
            this.y = Collections.unmodifiableList(this.y);
            this.l &= 0xFFFFEFFF;
        }
        j0.A = this.y;
        if((this.l & 0x2000) == 0x2000) {
            this.z = Collections.unmodifiableList(this.z);
            this.l &= 0xFFFFDFFF;
        }
        j0.B = this.z;
        if((this.l & 0x4000) == 0x4000) {
            this.A = Collections.unmodifiableList(this.A);
            this.l &= 0xFFFFBFFF;
        }
        j0.C = this.A;
        if((v & 0x8000) == 0x8000) {
            v1 |= 8;
        }
        j0.E = this.B;
        if((v & 0x10000) == 0x10000) {
            v1 |= 16;
        }
        j0.F = this.C;
        if((v & 0x20000) == 0x20000) {
            v1 |= 0x20;
        }
        j0.G = this.D;
        if((this.l & 0x40000) == 0x40000) {
            this.E = Collections.unmodifiableList(this.E);
            this.l &= 0xFFFBFFFF;
        }
        j0.H = this.E;
        if((this.l & 0x80000) == 0x80000) {
            this.F = Collections.unmodifiableList(this.F);
            this.l &= 0xFFF7FFFF;
        }
        j0.J = this.F;
        if((this.l & 0x100000) == 0x100000) {
            this.G = Collections.unmodifiableList(this.G);
            this.l &= 0xFFEFFFFF;
        }
        j0.K = this.G;
        if((v & 0x200000) == 0x200000) {
            v1 |= 0x40;
        }
        j0.M = this.H;
        if((this.l & 0x400000) == 0x400000) {
            this.I = Collections.unmodifiableList(this.I);
            this.l &= 0xFFBFFFFF;
        }
        j0.N = this.I;
        if((v & 0x800000) == 0x800000) {
            v1 |= 0x80;
        }
        j0.O = this.J;
        j0.k = v1;
        return j0;
    }

    public static h h() {
        h h0 = new h();  // 初始化器: Lw3/j;-><init>()V
        h0.m = 6;
        h0.p = Collections.emptyList();
        h0.q = Collections.emptyList();
        h0.r = Collections.emptyList();
        h0.s = Collections.emptyList();
        h0.t = Collections.emptyList();
        h0.u = Collections.emptyList();
        h0.v = Collections.emptyList();
        h0.w = Collections.emptyList();
        h0.x = Collections.emptyList();
        h0.y = Collections.emptyList();
        h0.z = Collections.emptyList();
        h0.A = Collections.emptyList();
        h0.C = Q.B;
        h0.E = Collections.emptyList();
        h0.F = Collections.emptyList();
        h0.G = Collections.emptyList();
        h0.H = X.o;
        h0.I = Collections.emptyList();
        h0.J = e0.m;
        return h0;
    }

    public final void i(q3.j j0) {
        if(j0 == q3.j.R) {
            return;
        }
        int v = j0.k;
        if((v & 1) == 1) {
            int v1 = j0.l;
            this.l |= 1;
            this.m = v1;
        }
        if((v & 2) == 2) {
            this.l |= 2;
            this.n = j0.m;
        }
        if((v & 4) == 4) {
            this.l |= 4;
            this.o = j0.n;
        }
        if(!j0.o.isEmpty()) {
            if(this.p.isEmpty()) {
                this.p = j0.o;
                this.l &= -9;
            }
            else {
                if((this.l & 8) != 8) {
                    this.p = new ArrayList(this.p);
                    this.l |= 8;
                }
                this.p.addAll(j0.o);
            }
        }
        if(!j0.p.isEmpty()) {
            if(this.q.isEmpty()) {
                this.q = j0.p;
                this.l &= -17;
            }
            else {
                if((this.l & 16) != 16) {
                    this.q = new ArrayList(this.q);
                    this.l |= 16;
                }
                this.q.addAll(j0.p);
            }
        }
        if(!j0.q.isEmpty()) {
            if(this.r.isEmpty()) {
                this.r = j0.q;
                this.l &= -33;
            }
            else {
                if((this.l & 0x20) != 0x20) {
                    this.r = new ArrayList(this.r);
                    this.l |= 0x20;
                }
                this.r.addAll(j0.q);
            }
        }
        if(!j0.s.isEmpty()) {
            if(this.s.isEmpty()) {
                this.s = j0.s;
                this.l &= -65;
            }
            else {
                if((this.l & 0x40) != 0x40) {
                    this.s = new ArrayList(this.s);
                    this.l |= 0x40;
                }
                this.s.addAll(j0.s);
            }
        }
        if(!j0.u.isEmpty()) {
            if(this.t.isEmpty()) {
                this.t = j0.u;
                this.l &= 0xFFFFFF7F;
            }
            else {
                if((this.l & 0x80) != 0x80) {
                    this.t = new ArrayList(this.t);
                    this.l |= 0x80;
                }
                this.t.addAll(j0.u);
            }
        }
        if(!j0.v.isEmpty()) {
            if(this.u.isEmpty()) {
                this.u = j0.v;
                this.l &= 0xFFFFFEFF;
            }
            else {
                if((this.l & 0x100) != 0x100) {
                    this.u = new ArrayList(this.u);
                    this.l |= 0x100;
                }
                this.u.addAll(j0.v);
            }
        }
        if(!j0.x.isEmpty()) {
            if(this.v.isEmpty()) {
                this.v = j0.x;
                this.l &= 0xFFFFFDFF;
            }
            else {
                if((this.l & 0x200) != 0x200) {
                    this.v = new ArrayList(this.v);
                    this.l |= 0x200;
                }
                this.v.addAll(j0.x);
            }
        }
        if(!j0.y.isEmpty()) {
            if(this.w.isEmpty()) {
                this.w = j0.y;
                this.l &= 0xFFFFFBFF;
            }
            else {
                if((this.l & 0x400) != 0x400) {
                    this.w = new ArrayList(this.w);
                    this.l |= 0x400;
                }
                this.w.addAll(j0.y);
            }
        }
        if(!j0.z.isEmpty()) {
            if(this.x.isEmpty()) {
                this.x = j0.z;
                this.l &= 0xFFFFF7FF;
            }
            else {
                if((this.l & 0x800) != 0x800) {
                    this.x = new ArrayList(this.x);
                    this.l |= 0x800;
                }
                this.x.addAll(j0.z);
            }
        }
        if(!j0.A.isEmpty()) {
            if(this.y.isEmpty()) {
                this.y = j0.A;
                this.l &= 0xFFFFEFFF;
            }
            else {
                if((this.l & 0x1000) != 0x1000) {
                    this.y = new ArrayList(this.y);
                    this.l |= 0x1000;
                }
                this.y.addAll(j0.A);
            }
        }
        if(!j0.B.isEmpty()) {
            if(this.z.isEmpty()) {
                this.z = j0.B;
                this.l &= 0xFFFFDFFF;
            }
            else {
                if((this.l & 0x2000) != 0x2000) {
                    this.z = new ArrayList(this.z);
                    this.l |= 0x2000;
                }
                this.z.addAll(j0.B);
            }
        }
        if(!j0.C.isEmpty()) {
            if(this.A.isEmpty()) {
                this.A = j0.C;
                this.l &= 0xFFFFBFFF;
            }
            else {
                if((this.l & 0x4000) != 0x4000) {
                    this.A = new ArrayList(this.A);
                    this.l |= 0x4000;
                }
                this.A.addAll(j0.C);
            }
        }
        int v2 = j0.k;
        if((v2 & 8) == 8) {
            this.l |= 0x8000;
            this.B = j0.E;
        }
        if((v2 & 16) == 16) {
            Q q0 = j0.F;
            if((this.l & 0x10000) == 0x10000) {
                Q q1 = this.C;
                if(q1 == Q.B) {
                    this.C = q0;
                }
                else {
                    P p0 = Q.r(q1);
                    p0.i(q0);
                    this.C = p0.g();
                }
            }
            else {
                this.C = q0;
            }
            this.l |= 0x10000;
        }
        if((j0.k & 0x20) == 0x20) {
            this.l |= 0x20000;
            this.D = j0.G;
        }
        if(!j0.H.isEmpty()) {
            if(this.E.isEmpty()) {
                this.E = j0.H;
                this.l &= 0xFFFBFFFF;
            }
            else {
                if((this.l & 0x40000) != 0x40000) {
                    this.E = new ArrayList(this.E);
                    this.l |= 0x40000;
                }
                this.E.addAll(j0.H);
            }
        }
        if(!j0.J.isEmpty()) {
            if(this.F.isEmpty()) {
                this.F = j0.J;
                this.l &= 0xFFF7FFFF;
            }
            else {
                if((this.l & 0x80000) != 0x80000) {
                    this.F = new ArrayList(this.F);
                    this.l |= 0x80000;
                }
                this.F.addAll(j0.J);
            }
        }
        if(!j0.K.isEmpty()) {
            if(this.G.isEmpty()) {
                this.G = j0.K;
                this.l &= 0xFFEFFFFF;
            }
            else {
                if((this.l & 0x100000) != 0x100000) {
                    this.G = new ArrayList(this.G);
                    this.l |= 0x100000;
                }
                this.G.addAll(j0.K);
            }
        }
        if((j0.k & 0x40) == 0x40) {
            X x0 = j0.M;
            if((this.l & 0x200000) == 0x200000) {
                X x1 = this.H;
                if(x1 == X.o) {
                    this.H = x0;
                }
                else {
                    f f0 = X.i(x1);
                    f0.l(x0);
                    this.H = f0.h();
                }
            }
            else {
                this.H = x0;
            }
            this.l |= 0x200000;
        }
        if(!j0.N.isEmpty()) {
            if(this.I.isEmpty()) {
                this.I = j0.N;
                this.l &= 0xFFBFFFFF;
            }
            else {
                if((this.l & 0x400000) != 0x400000) {
                    this.I = new ArrayList(this.I);
                    this.l |= 0x400000;
                }
                this.I.addAll(j0.N);
            }
        }
        if((j0.k & 0x80) == 0x80) {
            e0 e00 = j0.O;
            if((this.l & 0x800000) == 0x800000) {
                e0 e01 = this.J;
                if(e01 == e0.m) {
                    this.J = e00;
                }
                else {
                    m m0 = new m(2);
                    m0.l = Collections.emptyList();
                    m0.m(e01);
                    m0.m(e00);
                    this.J = m0.i();
                }
            }
            else {
                this.J = e00;
            }
            this.l |= 0x800000;
        }
        this.f(j0);
        this.i = this.i.h(j0.j);
    }
}

