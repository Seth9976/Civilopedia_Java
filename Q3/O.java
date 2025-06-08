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
import w3.v;

public final class o extends i implements v {
    public int j;
    public p k;
    public List l;
    public w m;
    public q n;

    @Override  // w3.i
    public final b c() {
        b b0 = this.f();
        if(!((r)b0).b()) {
            throw new UninitializedMessageException();
        }
        return b0;
    }

    @Override
    public final Object clone() {
        o o0 = o.g();
        o0.h(this.f());
        return o0;
    }

    @Override  // w3.i
    public final i d(Ra ra0, g g0) {
        r r1;
        r r0;
        try {
            try {
                r0 = null;
                r.r.getClass();
                r1 = new r(ra0, g0);
                goto label_14;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                r r2 = (r)invalidProtocolBufferException0.i;
                try {
                    throw invalidProtocolBufferException0;
                }
                catch(Throwable throwable0) {
                    r0 = r2;
                }
            }
        }
        catch(Throwable throwable0) {
        }
        if(r0 != null) {
            this.h(r0);
        }
        throw throwable0;
    label_14:
        this.h(r1);
        return this;
    }

    @Override  // w3.i
    public final i e(w3.o o0) {
        this.h(((r)o0));
        return this;
    }

    public final r f() {
        r r0 = new r(this);
        int v = this.j;
        int v1 = (v & 1) == 1 ? 1 : 0;
        r0.k = this.k;
        if((v & 2) == 2) {
            this.l = Collections.unmodifiableList(this.l);
            this.j &= -3;
        }
        r0.l = this.l;
        if((v & 4) == 4) {
            v1 |= 2;
        }
        r0.m = this.m;
        if((v & 8) == 8) {
            v1 |= 4;
        }
        r0.n = this.n;
        r0.j = v1;
        return r0;
    }

    public static o g() {
        o o0 = new o();  // 初始化器: Lw3/i;-><init>()V
        o0.k = p.j;
        o0.l = Collections.emptyList();
        o0.m = w.t;
        o0.n = q.j;
        return o0;
    }

    public final void h(r r0) {
        if(r0 == r.q) {
            return;
        }
        if((r0.j & 1) == 1) {
            p p0 = r0.k;
            p0.getClass();
            this.j |= 1;
            this.k = p0;
        }
        if(!r0.l.isEmpty()) {
            if(this.l.isEmpty()) {
                this.l = r0.l;
                this.j &= -3;
            }
            else {
                if((this.j & 2) != 2) {
                    this.l = new ArrayList(this.l);
                    this.j |= 2;
                }
                this.l.addAll(r0.l);
            }
        }
        if((r0.j & 2) == 2) {
            w w0 = r0.m;
            if((this.j & 4) == 4) {
                w w1 = this.m;
                if(w1 == w.t) {
                    this.m = w0;
                }
                else {
                    u u0 = u.g();
                    u0.h(w1);
                    u0.h(w0);
                    this.m = u0.f();
                }
            }
            else {
                this.m = w0;
            }
            this.j |= 4;
        }
        if((r0.j & 4) == 4) {
            q q0 = r0.n;
            q0.getClass();
            this.j |= 8;
            this.n = q0;
        }
        this.i = this.i.h(r0.i);
    }
}

