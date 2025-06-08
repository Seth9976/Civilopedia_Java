package t3;

import com.google.android.gms.internal.ads.Ra;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import w3.b;
import w3.i;
import w3.o;
import w3.v;

public final class g extends i implements v {
    public int j;
    public int k;
    public int l;
    public Object m;
    public h n;
    public List o;
    public List p;

    @Override  // w3.i
    public final b c() {
        b b0 = this.f();
        if(!((t3.i)b0).b()) {
            throw new UninitializedMessageException();
        }
        return b0;
    }

    @Override
    public final Object clone() {
        g g0 = g.g();
        g0.h(this.f());
        return g0;
    }

    @Override  // w3.i
    public final i d(Ra ra0, w3.g g0) {
        t3.i i1;
        t3.i i0;
        try {
            try {
                i0 = null;
                t3.i.v.getClass();
                i1 = new t3.i(ra0);
                goto label_14;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                t3.i i2 = (t3.i)invalidProtocolBufferException0.i;
                try {
                    throw invalidProtocolBufferException0;
                }
                catch(Throwable throwable0) {
                    i0 = i2;
                }
            }
        }
        catch(Throwable throwable0) {
        }
        if(i0 != null) {
            this.h(i0);
        }
        throw throwable0;
    label_14:
        this.h(i1);
        return this;
    }

    @Override  // w3.i
    public final i e(o o0) {
        this.h(((t3.i)o0));
        return this;
    }

    public final t3.i f() {
        t3.i i0 = new t3.i(this);
        int v = this.j;
        int v1 = (v & 1) == 1 ? 1 : 0;
        i0.k = this.k;
        if((v & 2) == 2) {
            v1 |= 2;
        }
        i0.l = this.l;
        if((v & 4) == 4) {
            v1 |= 4;
        }
        i0.m = this.m;
        if((v & 8) == 8) {
            v1 |= 8;
        }
        i0.n = this.n;
        if((v & 16) == 16) {
            this.o = Collections.unmodifiableList(this.o);
            this.j &= -17;
        }
        i0.o = this.o;
        if((this.j & 0x20) == 0x20) {
            this.p = Collections.unmodifiableList(this.p);
            this.j &= -33;
        }
        i0.q = this.p;
        i0.j = v1;
        return i0;
    }

    public static g g() {
        g g0 = new g();  // 初始化器: Lw3/i;-><init>()V
        g0.k = 1;
        g0.m = "";
        g0.n = h.j;
        g0.o = Collections.emptyList();
        g0.p = Collections.emptyList();
        return g0;
    }

    public final void h(t3.i i0) {
        if(i0 == t3.i.u) {
            return;
        }
        int v = i0.j;
        if((v & 1) == 1) {
            this.j |= 1;
            this.k = i0.k;
        }
        if((v & 2) == 2) {
            this.j |= 2;
            this.l = i0.l;
        }
        if((v & 4) == 4) {
            this.j |= 4;
            this.m = i0.m;
        }
        if((v & 8) == 8) {
            h h0 = i0.n;
            h0.getClass();
            this.j |= 8;
            this.n = h0;
        }
        if(!i0.o.isEmpty()) {
            if(this.o.isEmpty()) {
                this.o = i0.o;
                this.j &= -17;
            }
            else {
                if((this.j & 16) != 16) {
                    this.o = new ArrayList(this.o);
                    this.j |= 16;
                }
                this.o.addAll(i0.o);
            }
        }
        if(!i0.q.isEmpty()) {
            if(this.p.isEmpty()) {
                this.p = i0.q;
                this.j &= -33;
            }
            else {
                if((this.j & 0x20) != 0x20) {
                    this.p = new ArrayList(this.p);
                    this.j |= 0x20;
                }
                this.p.addAll(i0.q);
            }
        }
        this.i = this.i.h(i0.i);
    }
}

