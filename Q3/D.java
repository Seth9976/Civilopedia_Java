package q3;

import com.google.android.gms.internal.ads.Ra;
import com.google.android.gms.internal.ads.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import w3.e;
import w3.i;
import w3.o;

public final class d extends o {
    public final e i;
    public int j;
    public c k;
    public long l;
    public float m;
    public double n;
    public int o;
    public int p;
    public int q;
    public g r;
    public List s;
    public int t;
    public int u;
    public byte v;
    public int w;
    public static final d x;
    public static final a y;

    static {
        d.y = new a(2);
        d d0 = new d();
        d.x = d0;
        d0.i();
    }

    public d() {
        this.v = -1;
        this.w = -1;
        this.i = e.i;
    }

    public d(Ra ra0, w3.g g0) {
        f f0;
        this.v = -1;
        this.w = -1;
        this.i();
        w3.d d0 = new w3.d();
        w w0 = w.j(d0, 1);
        int v = 0;
        boolean z = false;
        while(!z) {
            try {
                try {
                    int v1 = ra0.n();
                    switch(v1) {
                        case 0: {
                            z = true;
                            continue;
                        }
                        case 8: {
                            int v2 = ra0.k();
                            c c0 = c.b(v2);
                            if(c0 == null) {
                                w0.v(8);
                                w0.v(v2);
                            }
                            else {
                                this.j |= 1;
                                this.k = c0;
                            }
                            continue;
                        }
                        case 16: {
                            this.j |= 2;
                            long v3 = ra0.l();
                            this.l = -(v3 & 1L) ^ v3 >>> 1;
                            continue;
                        }
                        case 29: {
                            this.j |= 4;
                            this.m = Float.intBitsToFloat(ra0.i());
                            continue;
                        }
                        case 33: {
                            this.j |= 8;
                            this.n = Double.longBitsToDouble(ra0.j());
                            continue;
                        }
                        case 40: {
                            this.j |= 16;
                            this.o = ra0.k();
                            continue;
                        }
                        case 0x30: {
                            this.j |= 0x20;
                            this.p = ra0.k();
                            continue;
                        }
                        case 56: {
                            this.j |= 0x40;
                            this.q = ra0.k();
                            continue;
                        }
                        case 66: {
                            if((this.j & 0x80) == 0x80) {
                                g g1 = this.r;
                                g1.getClass();
                                f0 = new f(0);
                                f0.l = Collections.emptyList();
                                f0.k(g1);
                            }
                            else {
                                f0 = null;
                            }
                            g g2 = (g)ra0.g(g.p, g0);
                            this.r = g2;
                            if(f0 != null) {
                                f0.k(g2);
                                this.r = f0.g();
                            }
                            this.j |= 0x80;
                            continue;
                        }
                        case 74: {
                            if((v & 0x100) != 0x100) {
                                this.s = new ArrayList();
                                v = 0x100;
                            }
                            this.s.add(ra0.g(d.y, g0));
                            continue;
                        }
                        case 80: {
                            this.j |= 0x200;
                            this.u = ra0.k();
                            continue;
                        }
                        case 88: {
                            this.j |= 0x100;
                            this.t = ra0.k();
                            continue;
                        }
                        default: {
                            if(!ra0.q(v1, w0)) {
                                z = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
                catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                }
                catch(IOException iOException0) {
                    goto label_75;
                }
                invalidProtocolBufferException0.i = this;
                throw invalidProtocolBufferException0;
            label_75:
                InvalidProtocolBufferException invalidProtocolBufferException1 = new InvalidProtocolBufferException(iOException0.getMessage());
                invalidProtocolBufferException1.i = this;
                throw invalidProtocolBufferException1;
            }
            catch(Throwable throwable0) {
            }
            if((v & 0x100) == 0x100) {
                this.s = Collections.unmodifiableList(this.s);
            }
            try {
                w0.i();
                this.i = d0.c();
                throw throwable0;
            }
            catch(IOException unused_ex) {
                this.i = d0.c();
                throw throwable0;
            }
            catch(Throwable throwable1) {
            }
            this.i = d0.c();
            throw throwable1;
        }
        if((v & 0x100) == 0x100) {
            this.s = Collections.unmodifiableList(this.s);
        }
        try {
            w0.i();
            this.i = d0.c();
            return;
        }
        catch(IOException unused_ex) {
            this.i = d0.c();
            return;
        }
        catch(Throwable throwable2) {
        }
        this.i = d0.c();
        throw throwable2;
    }

    public d(b b0) {
        this.v = -1;
        this.w = -1;
        this.i = b0.i;
    }

    @Override  // w3.v
    public final boolean b() {
        int v = this.v;
        if(v == 1) {
            return true;
        }
        if(v == 0) {
            return false;
        }
        if((this.j & 0x80) == 0x80 && !this.r.b()) {
            this.v = 0;
            return false;
        }
        for(int v1 = 0; v1 < this.s.size(); ++v1) {
            if(!((d)this.s.get(v1)).b()) {
                this.v = 0;
                return false;
            }
        }
        this.v = 1;
        return true;
    }

    @Override  // w3.b
    public final int c() {
        int v1 = this.w;
        if(v1 != -1) {
            return v1;
        }
        int v2 = (this.j & 1) == 1 ? w.a(1, this.k.i) : 0;
        if((this.j & 2) == 2) {
            v2 += w.g(this.l >> 0x3F ^ this.l << 1) + 1;
        }
        if((this.j & 4) == 4) {
            v2 += 5;
        }
        if((this.j & 8) == 8) {
            v2 += 9;
        }
        if((this.j & 16) == 16) {
            v2 += w.b(5, this.o);
        }
        if((this.j & 0x20) == 0x20) {
            v2 += w.b(6, this.p);
        }
        if((this.j & 0x40) == 0x40) {
            v2 += w.b(7, this.q);
        }
        if((this.j & 0x80) == 0x80) {
            v2 += w.d(8, this.r);
        }
        for(int v = 0; v < this.s.size(); ++v) {
            v2 += w.d(9, ((w3.b)this.s.get(v)));
        }
        if((this.j & 0x200) == 0x200) {
            v2 += w.b(10, this.u);
        }
        if((this.j & 0x100) == 0x100) {
            v2 += w.b(11, this.t);
        }
        int v3 = this.i.size() + v2;
        this.w = v3;
        return v3;
    }

    @Override  // w3.b
    public final i d() {
        return b.g();
    }

    @Override  // w3.b
    public final i e() {
        i i0 = b.g();
        ((b)i0).h(this);
        return i0;
    }

    @Override  // w3.b
    public final void f(w w0) {
        this.c();
        if((this.j & 1) == 1) {
            w0.l(1, this.k.i);
        }
        if((this.j & 2) == 2) {
            long v1 = this.l;
            w0.x(2, 0);
            w0.w(v1 >> 0x3F ^ v1 << 1);
        }
        if((this.j & 4) == 4) {
            float f = this.m;
            w0.x(3, 5);
            w0.t(Float.floatToRawIntBits(f));
        }
        if((this.j & 8) == 8) {
            double f1 = this.n;
            w0.x(4, 1);
            w0.u(Double.doubleToRawLongBits(f1));
        }
        if((this.j & 16) == 16) {
            w0.m(5, this.o);
        }
        if((this.j & 0x20) == 0x20) {
            w0.m(6, this.p);
        }
        if((this.j & 0x40) == 0x40) {
            w0.m(7, this.q);
        }
        if((this.j & 0x80) == 0x80) {
            w0.o(8, this.r);
        }
        for(int v = 0; v < this.s.size(); ++v) {
            w0.o(9, ((w3.b)this.s.get(v)));
        }
        if((this.j & 0x200) == 0x200) {
            w0.m(10, this.u);
        }
        if((this.j & 0x100) == 0x100) {
            w0.m(11, this.t);
        }
        w0.r(this.i);
    }

    public final void i() {
        this.k = c.j;
        this.l = 0L;
        this.m = 0.0f;
        this.n = 0.0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = g.o;
        this.s = Collections.emptyList();
        this.t = 0;
        this.u = 0;
    }
}

