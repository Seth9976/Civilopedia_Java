package t3;

import com.google.android.gms.internal.ads.Ra;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import w3.b;
import w3.g;
import w3.i;
import w3.o;
import w3.v;

public final class a extends i implements v {
    public final int j;
    public int k;
    public int l;
    public int m;

    public a(int v) {
        this.j = v;
        super();
    }

    @Override  // w3.i
    public final b c() {
        if(this.j != 0) {
            b b0 = this.g();
            if(!((c)b0).b()) {
                throw new UninitializedMessageException();
            }
            return b0;
        }
        b b1 = this.f();
        if(!((t3.b)b1).b()) {
            throw new UninitializedMessageException();
        }
        return b1;
    }

    @Override
    public final Object clone() {
        if(this.j != 0) {
            a a0 = new a(1);
            a0.i(this.g());
            return a0;
        }
        a a1 = new a(0);
        a1.h(this.f());
        return a1;
    }

    @Override  // w3.i
    public final i d(Ra ra0, g g0) {
        t3.b b1;
        t3.b b0;
        c c1;
        c c0;
        if(this.j != 0) {
            try {
                try {
                    c0 = null;
                    c.p.getClass();
                    c1 = new c(ra0);
                    goto label_15;
                }
                catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                    c c2 = (c)invalidProtocolBufferException0.i;
                    try {
                        throw invalidProtocolBufferException0;
                    }
                    catch(Throwable throwable0) {
                        c0 = c2;
                    }
                }
            }
            catch(Throwable throwable0) {
            }
            if(c0 != null) {
                this.i(c0);
            }
            throw throwable0;
        label_15:
            this.i(c1);
            return this;
        }
        try {
            try {
                b0 = null;
                t3.b.p.getClass();
                b1 = new t3.b(ra0);
                goto label_31;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException1) {
                t3.b b2 = (t3.b)invalidProtocolBufferException1.i;
                try {
                    throw invalidProtocolBufferException1;
                }
                catch(Throwable throwable1) {
                    b0 = b2;
                }
            }
        }
        catch(Throwable throwable1) {
        }
        if(b0 != null) {
            this.h(b0);
        }
        throw throwable1;
    label_31:
        this.h(b1);
        return this;
    }

    @Override  // w3.i
    public final i e(o o0) {
        if(this.j != 0) {
            this.i(((c)o0));
            return this;
        }
        this.h(((t3.b)o0));
        return this;
    }

    public t3.b f() {
        t3.b b0 = new t3.b(this);
        int v = this.k;
        int v1 = (v & 1) == 1 ? 1 : 0;
        b0.k = this.l;
        if((v & 2) == 2) {
            v1 |= 2;
        }
        b0.l = this.m;
        b0.j = v1;
        return b0;
    }

    public c g() {
        c c0 = new c(this);
        int v = this.k;
        int v1 = (v & 1) == 1 ? 1 : 0;
        c0.k = this.l;
        if((v & 2) == 2) {
            v1 |= 2;
        }
        c0.l = this.m;
        c0.j = v1;
        return c0;
    }

    public void h(t3.b b0) {
        if(b0 == t3.b.o) {
            return;
        }
        int v = b0.j;
        if((v & 1) == 1) {
            int v1 = b0.k;
            this.k |= 1;
            this.l = v1;
        }
        if((v & 2) == 2) {
            this.k |= 2;
            this.m = b0.l;
        }
        this.i = this.i.h(b0.i);
    }

    public void i(c c0) {
        if(c0 == c.o) {
            return;
        }
        int v = c0.j;
        if((v & 1) == 1) {
            int v1 = c0.k;
            this.k |= 1;
            this.l = v1;
        }
        if((v & 2) == 2) {
            this.k |= 2;
            this.m = c0.l;
        }
        this.i = this.i.h(c0.i);
    }
}

