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
import w3.o;
import w3.v;

public final class u extends i implements v {
    public int j;
    public int k;
    public int l;
    public q3.v m;
    public Q n;
    public int o;
    public List p;
    public List q;

    @Override  // w3.i
    public final b c() {
        b b0 = this.f();
        if(!((w)b0).b()) {
            throw new UninitializedMessageException();
        }
        return b0;
    }

    @Override
    public final Object clone() {
        u u0 = u.g();
        u0.h(this.f());
        return u0;
    }

    @Override  // w3.i
    public final i d(Ra ra0, g g0) {
        w w1;
        w w0;
        try {
            try {
                w0 = null;
                w.u.getClass();
                w1 = new w(ra0, g0);
                goto label_14;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                w w2 = (w)invalidProtocolBufferException0.i;
                try {
                    throw invalidProtocolBufferException0;
                }
                catch(Throwable throwable0) {
                    w0 = w2;
                }
            }
        }
        catch(Throwable throwable0) {
        }
        if(w0 != null) {
            this.h(w0);
        }
        throw throwable0;
    label_14:
        this.h(w1);
        return this;
    }

    @Override  // w3.i
    public final i e(o o0) {
        this.h(((w)o0));
        return this;
    }

    public final w f() {
        w w0 = new w(this);
        int v = this.j;
        int v1 = (v & 1) == 1 ? 1 : 0;
        w0.k = this.k;
        if((v & 2) == 2) {
            v1 |= 2;
        }
        w0.l = this.l;
        if((v & 4) == 4) {
            v1 |= 4;
        }
        w0.m = this.m;
        if((v & 8) == 8) {
            v1 |= 8;
        }
        w0.n = this.n;
        if((v & 16) == 16) {
            v1 |= 16;
        }
        w0.o = this.o;
        if((v & 0x20) == 0x20) {
            this.p = Collections.unmodifiableList(this.p);
            this.j &= -33;
        }
        w0.p = this.p;
        if((this.j & 0x40) == 0x40) {
            this.q = Collections.unmodifiableList(this.q);
            this.j &= -65;
        }
        w0.q = this.q;
        w0.j = v1;
        return w0;
    }

    public static u g() {
        u u0 = new u();  // 初始化器: Lw3/i;-><init>()V
        u0.m = q3.v.j;
        u0.n = Q.B;
        u0.p = Collections.emptyList();
        u0.q = Collections.emptyList();
        return u0;
    }

    public final void h(w w0) {
        if(w0 == w.t) {
            return;
        }
        int v = w0.j;
        if((v & 1) == 1) {
            this.j |= 1;
            this.k = w0.k;
        }
        if((v & 2) == 2) {
            this.j |= 2;
            this.l = w0.l;
        }
        if((v & 4) == 4) {
            q3.v v1 = w0.m;
            v1.getClass();
            this.j |= 4;
            this.m = v1;
        }
        if((w0.j & 8) == 8) {
            Q q0 = w0.n;
            if((this.j & 8) == 8) {
                Q q1 = this.n;
                if(q1 == Q.B) {
                    this.n = q0;
                }
                else {
                    P p0 = Q.r(q1);
                    p0.i(q0);
                    this.n = p0.g();
                }
            }
            else {
                this.n = q0;
            }
            this.j |= 8;
        }
        if((w0.j & 16) == 16) {
            this.j |= 16;
            this.o = w0.o;
        }
        if(!w0.p.isEmpty()) {
            if(this.p.isEmpty()) {
                this.p = w0.p;
                this.j &= -33;
            }
            else {
                if((this.j & 0x20) != 0x20) {
                    this.p = new ArrayList(this.p);
                    this.j |= 0x20;
                }
                this.p.addAll(w0.p);
            }
        }
        if(!w0.q.isEmpty()) {
            if(this.q.isEmpty()) {
                this.q = w0.q;
                this.j &= -65;
            }
            else {
                if((this.j & 0x40) != 0x40) {
                    this.q = new ArrayList(this.q);
                    this.j |= 0x40;
                }
                this.q.addAll(w0.q);
            }
        }
        this.i = this.i.h(w0.i);
    }
}

