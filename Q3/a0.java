package q3;

import com.google.android.gms.internal.ads.Ra;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import w3.b;
import w3.g;
import w3.i;
import w3.o;
import w3.v;

public final class a0 extends i implements v {
    public int j;
    public int k;
    public int l;
    public b0 m;
    public int n;
    public int o;
    public c0 p;

    @Override  // w3.i
    public final b c() {
        b b0 = this.f();
        if(!((d0)b0).b()) {
            throw new UninitializedMessageException();
        }
        return b0;
    }

    @Override
    public final Object clone() {
        a0 a00 = a0.g();
        a00.h(this.f());
        return a00;
    }

    @Override  // w3.i
    public final i d(Ra ra0, g g0) {
        d0 d01;
        d0 d00;
        try {
            try {
                d00 = null;
                d0.t.getClass();
                d01 = new d0(ra0);
                goto label_14;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                d0 d02 = (d0)invalidProtocolBufferException0.i;
                try {
                    throw invalidProtocolBufferException0;
                }
                catch(Throwable throwable0) {
                    d00 = d02;
                }
            }
        }
        catch(Throwable throwable0) {
        }
        if(d00 != null) {
            this.h(d00);
        }
        throw throwable0;
    label_14:
        this.h(d01);
        return this;
    }

    @Override  // w3.i
    public final i e(o o0) {
        this.h(((d0)o0));
        return this;
    }

    public final d0 f() {
        d0 d00 = new d0(this);
        int v = this.j;
        int v1 = (v & 1) == 1 ? 1 : 0;
        d00.k = this.k;
        if((v & 2) == 2) {
            v1 |= 2;
        }
        d00.l = this.l;
        if((v & 4) == 4) {
            v1 |= 4;
        }
        d00.m = this.m;
        if((v & 8) == 8) {
            v1 |= 8;
        }
        d00.n = this.n;
        if((v & 16) == 16) {
            v1 |= 16;
        }
        d00.o = this.o;
        if((v & 0x20) == 0x20) {
            v1 |= 0x20;
        }
        d00.p = this.p;
        d00.j = v1;
        return d00;
    }

    public static a0 g() {
        a0 a00 = new a0();  // 初始化器: Lw3/i;-><init>()V
        a00.m = b0.k;
        a00.p = c0.j;
        return a00;
    }

    public final void h(d0 d00) {
        if(d00 == d0.s) {
            return;
        }
        int v = d00.j;
        if((v & 1) == 1) {
            this.j |= 1;
            this.k = d00.k;
        }
        if((v & 2) == 2) {
            this.j |= 2;
            this.l = d00.l;
        }
        if((v & 4) == 4) {
            b0 b00 = d00.m;
            b00.getClass();
            this.j |= 4;
            this.m = b00;
        }
        int v1 = d00.j;
        if((v1 & 8) == 8) {
            this.j |= 8;
            this.n = d00.n;
        }
        if((v1 & 16) == 16) {
            this.j |= 16;
            this.o = d00.o;
        }
        if((v1 & 0x20) == 0x20) {
            c0 c00 = d00.p;
            c00.getClass();
            this.j |= 0x20;
            this.p = c00;
        }
        this.i = this.i.h(d00.i);
    }
}

