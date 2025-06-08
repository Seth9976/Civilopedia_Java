package q3;

import com.google.android.gms.internal.ads.Ra;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import w3.b;
import w3.g;
import w3.i;
import w3.j;
import w3.o;

public final class s extends j {
    public int l;
    public int m;

    @Override  // w3.i
    public final b c() {
        b b0 = new t(this);
        int v = (this.l & 1) == 1 ? 1 : 0;
        b0.l = this.m;
        b0.k = v;
        if(!((t)b0).b()) {
            throw new UninitializedMessageException();
        }
        return b0;
    }

    @Override
    public final Object clone() {
        s s0 = new s();  // 初始化器: Lw3/j;-><init>()V
        t t0 = new t(this);
        int v = (this.l & 1) == 1 ? 1 : 0;
        t0.l = this.m;
        t0.k = v;
        s0.g(t0);
        return s0;
    }

    @Override  // w3.i
    public final i d(Ra ra0, g g0) {
        t t1;
        t t0;
        try {
            try {
                t0 = null;
                t.p.getClass();
                t1 = new t(ra0, g0);
                goto label_14;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                t t2 = (t)invalidProtocolBufferException0.i;
                try {
                    throw invalidProtocolBufferException0;
                }
                catch(Throwable throwable0) {
                    t0 = t2;
                }
            }
        }
        catch(Throwable throwable0) {
        }
        if(t0 != null) {
            this.g(t0);
        }
        throw throwable0;
    label_14:
        this.g(t1);
        return this;
    }

    @Override  // w3.i
    public final i e(o o0) {
        this.g(((t)o0));
        return this;
    }

    public final void g(t t0) {
        if(t0 == t.o) {
            return;
        }
        if((t0.k & 1) == 1) {
            int v = t0.l;
            this.l |= 1;
            this.m = v;
        }
        this.f(t0);
        this.i = this.i.h(t0.j);
    }
}

