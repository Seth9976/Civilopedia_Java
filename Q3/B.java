package q3;

import com.google.android.gms.internal.ads.Ra;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import w3.i;
import w3.o;
import w3.v;

public final class b extends i implements v {
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

    @Override  // w3.i
    public final w3.b c() {
        w3.b b0 = this.f();
        if(!((d)b0).b()) {
            throw new UninitializedMessageException();
        }
        return b0;
    }

    @Override
    public final Object clone() {
        b b0 = b.g();
        b0.h(this.f());
        return b0;
    }

    @Override  // w3.i
    public final i d(Ra ra0, w3.g g0) {
        d d1;
        d d0;
        try {
            try {
                d0 = null;
                d.y.getClass();
                d1 = new d(ra0, g0);
                goto label_14;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                d d2 = (d)invalidProtocolBufferException0.i;
                try {
                    throw invalidProtocolBufferException0;
                }
                catch(Throwable throwable0) {
                    d0 = d2;
                }
            }
        }
        catch(Throwable throwable0) {
        }
        if(d0 != null) {
            this.h(d0);
        }
        throw throwable0;
    label_14:
        this.h(d1);
        return this;
    }

    @Override  // w3.i
    public final i e(o o0) {
        this.h(((d)o0));
        return this;
    }

    public final d f() {
        d d0 = new d(this);
        int v = this.j;
        int v1 = (v & 1) == 1 ? 1 : 0;
        d0.k = this.k;
        if((v & 2) == 2) {
            v1 |= 2;
        }
        d0.l = this.l;
        if((v & 4) == 4) {
            v1 |= 4;
        }
        d0.m = this.m;
        if((v & 8) == 8) {
            v1 |= 8;
        }
        d0.n = this.n;
        if((v & 16) == 16) {
            v1 |= 16;
        }
        d0.o = this.o;
        if((v & 0x20) == 0x20) {
            v1 |= 0x20;
        }
        d0.p = this.p;
        if((v & 0x40) == 0x40) {
            v1 |= 0x40;
        }
        d0.q = this.q;
        if((v & 0x80) == 0x80) {
            v1 |= 0x80;
        }
        d0.r = this.r;
        if((v & 0x100) == 0x100) {
            this.s = Collections.unmodifiableList(this.s);
            this.j &= 0xFFFFFEFF;
        }
        d0.s = this.s;
        if((v & 0x200) == 0x200) {
            v1 |= 0x100;
        }
        d0.t = this.t;
        if((v & 0x400) == 0x400) {
            v1 |= 0x200;
        }
        d0.u = this.u;
        d0.j = v1;
        return d0;
    }

    public static b g() {
        b b0 = new b();  // 初始化器: Lw3/i;-><init>()V
        b0.k = c.j;
        b0.r = g.o;
        b0.s = Collections.emptyList();
        return b0;
    }

    public final void h(d d0) {
        if(d0 == d.x) {
            return;
        }
        if((d0.j & 1) == 1) {
            c c0 = d0.k;
            c0.getClass();
            this.j |= 1;
            this.k = c0;
        }
        int v = d0.j;
        if((v & 2) == 2) {
            this.j |= 2;
            this.l = d0.l;
        }
        if((v & 4) == 4) {
            this.j |= 4;
            this.m = d0.m;
        }
        if((v & 8) == 8) {
            this.j |= 8;
            this.n = d0.n;
        }
        if((v & 16) == 16) {
            this.j |= 16;
            this.o = d0.o;
        }
        if((v & 0x20) == 0x20) {
            this.j |= 0x20;
            this.p = d0.p;
        }
        if((v & 0x40) == 0x40) {
            this.j |= 0x40;
            this.q = d0.q;
        }
        if((v & 0x80) == 0x80) {
            g g0 = d0.r;
            if((this.j & 0x80) == 0x80) {
                g g1 = this.r;
                if(g1 == g.o) {
                    this.r = g0;
                }
                else {
                    f f0 = new f(0);
                    f0.l = Collections.emptyList();
                    f0.k(g1);
                    f0.k(g0);
                    this.r = f0.g();
                }
            }
            else {
                this.r = g0;
            }
            this.j |= 0x80;
        }
        if(!d0.s.isEmpty()) {
            if(this.s.isEmpty()) {
                this.s = d0.s;
                this.j &= 0xFFFFFEFF;
            }
            else {
                if((this.j & 0x100) != 0x100) {
                    this.s = new ArrayList(this.s);
                    this.j |= 0x100;
                }
                this.s.addAll(d0.s);
            }
        }
        int v1 = d0.j;
        if((v1 & 0x100) == 0x100) {
            this.j |= 0x200;
            this.t = d0.t;
        }
        if((v1 & 0x200) == 0x200) {
            this.j |= 0x400;
            this.u = d0.u;
        }
        this.i = this.i.h(d0.i);
    }
}

