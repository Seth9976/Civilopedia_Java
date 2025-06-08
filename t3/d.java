package t3;

import com.google.android.gms.internal.ads.Ra;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import w3.g;
import w3.i;
import w3.o;
import w3.v;

public final class d extends i implements v {
    public int j;
    public b k;
    public c l;
    public c m;
    public c n;
    public c o;

    @Override  // w3.i
    public final w3.b c() {
        w3.b b0 = this.f();
        if(!((e)b0).b()) {
            throw new UninitializedMessageException();
        }
        return b0;
    }

    @Override
    public final Object clone() {
        d d0 = d.g();
        d0.h(this.f());
        return d0;
    }

    @Override  // w3.i
    public final i d(Ra ra0, g g0) {
        e e1;
        e e0;
        try {
            try {
                e0 = null;
                e.s.getClass();
                e1 = new e(ra0, g0);
                goto label_14;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                e e2 = (e)invalidProtocolBufferException0.i;
                try {
                    throw invalidProtocolBufferException0;
                }
                catch(Throwable throwable0) {
                    e0 = e2;
                }
            }
        }
        catch(Throwable throwable0) {
        }
        if(e0 != null) {
            this.h(e0);
        }
        throw throwable0;
    label_14:
        this.h(e1);
        return this;
    }

    @Override  // w3.i
    public final i e(o o0) {
        this.h(((e)o0));
        return this;
    }

    public final e f() {
        e e0 = new e(this);
        int v = this.j;
        int v1 = (v & 1) == 1 ? 1 : 0;
        e0.k = this.k;
        if((v & 2) == 2) {
            v1 |= 2;
        }
        e0.l = this.l;
        if((v & 4) == 4) {
            v1 |= 4;
        }
        e0.m = this.m;
        if((v & 8) == 8) {
            v1 |= 8;
        }
        e0.n = this.n;
        if((v & 16) == 16) {
            v1 |= 16;
        }
        e0.o = this.o;
        e0.j = v1;
        return e0;
    }

    public static d g() {
        d d0 = new d();  // 初始化器: Lw3/i;-><init>()V
        d0.k = b.o;
        d0.l = c.o;
        d0.m = c.o;
        d0.n = c.o;
        d0.o = c.o;
        return d0;
    }

    public final void h(e e0) {
        if(e0 == e.r) {
            return;
        }
        if((e0.j & 1) == 1) {
            b b0 = e0.k;
            if((this.j & 1) == 1) {
                b b1 = this.k;
                if(b1 == b.o) {
                    this.k = b0;
                }
                else {
                    a a0 = new a(0);
                    a0.h(b1);
                    a0.h(b0);
                    this.k = a0.f();
                }
            }
            else {
                this.k = b0;
            }
            this.j |= 1;
        }
        if((e0.j & 2) == 2) {
            c c0 = e0.l;
            if((this.j & 2) == 2) {
                c c1 = this.l;
                if(c1 == c.o) {
                    this.l = c0;
                }
                else {
                    a a1 = c.i(c1);
                    a1.i(c0);
                    this.l = a1.g();
                }
            }
            else {
                this.l = c0;
            }
            this.j |= 2;
        }
        if((e0.j & 4) == 4) {
            c c2 = e0.m;
            if((this.j & 4) == 4) {
                c c3 = this.m;
                if(c3 == c.o) {
                    this.m = c2;
                }
                else {
                    a a2 = c.i(c3);
                    a2.i(c2);
                    this.m = a2.g();
                }
            }
            else {
                this.m = c2;
            }
            this.j |= 4;
        }
        if((e0.j & 8) == 8) {
            c c4 = e0.n;
            if((this.j & 8) == 8) {
                c c5 = this.n;
                if(c5 == c.o) {
                    this.n = c4;
                }
                else {
                    a a3 = c.i(c5);
                    a3.i(c4);
                    this.n = a3.g();
                }
            }
            else {
                this.n = c4;
            }
            this.j |= 8;
        }
        if((e0.j & 16) == 16) {
            c c6 = e0.o;
            if((this.j & 16) == 16) {
                c c7 = this.o;
                if(c7 == c.o) {
                    this.o = c6;
                }
                else {
                    a a4 = c.i(c7);
                    a4.i(c6);
                    this.o = a4.g();
                }
            }
            else {
                this.o = c6;
            }
            this.j |= 16;
        }
        this.i = this.i.h(e0.i);
    }
}

