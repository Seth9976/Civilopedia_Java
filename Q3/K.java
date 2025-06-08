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

public final class k extends j {
    public int l;
    public int m;
    public List n;
    public List o;

    @Override  // w3.i
    public final b c() {
        b b0 = this.g();
        if(!((l)b0).b()) {
            throw new UninitializedMessageException();
        }
        return b0;
    }

    @Override
    public final Object clone() {
        k k0 = k.h();
        k0.i(this.g());
        return k0;
    }

    @Override  // w3.i
    public final i d(Ra ra0, g g0) {
        l l1;
        l l0;
        try {
            try {
                l0 = null;
                l.r.getClass();
                l1 = new l(ra0, g0);
                goto label_14;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                l l2 = (l)invalidProtocolBufferException0.i;
                try {
                    throw invalidProtocolBufferException0;
                }
                catch(Throwable throwable0) {
                    l0 = l2;
                }
            }
        }
        catch(Throwable throwable0) {
        }
        if(l0 != null) {
            this.i(l0);
        }
        throw throwable0;
    label_14:
        this.i(l1);
        return this;
    }

    @Override  // w3.i
    public final i e(o o0) {
        this.i(((l)o0));
        return this;
    }

    public final l g() {
        l l0 = new l(this);
        int v = this.l;
        l0.l = this.m;
        if((v & 2) == 2) {
            this.n = Collections.unmodifiableList(this.n);
            this.l &= -3;
        }
        l0.m = this.n;
        if((this.l & 4) == 4) {
            this.o = Collections.unmodifiableList(this.o);
            this.l &= -5;
        }
        l0.n = this.o;
        l0.k = (v & 1) == 1 ? 1 : 0;
        return l0;
    }

    public static k h() {
        k k0 = new k();  // 初始化器: Lw3/j;-><init>()V
        k0.m = 6;
        k0.n = Collections.emptyList();
        k0.o = Collections.emptyList();
        return k0;
    }

    public final void i(l l0) {
        if(l0 == l.q) {
            return;
        }
        if((l0.k & 1) == 1) {
            int v = l0.l;
            this.l |= 1;
            this.m = v;
        }
        if(!l0.m.isEmpty()) {
            if(this.n.isEmpty()) {
                this.n = l0.m;
                this.l &= -3;
            }
            else {
                if((this.l & 2) != 2) {
                    this.n = new ArrayList(this.n);
                    this.l |= 2;
                }
                this.n.addAll(l0.m);
            }
        }
        if(!l0.n.isEmpty()) {
            if(this.o.isEmpty()) {
                this.o = l0.n;
                this.l &= -5;
            }
            else {
                if((this.l & 4) != 4) {
                    this.o = new ArrayList(this.o);
                    this.l |= 4;
                }
                this.o.addAll(l0.n);
            }
        }
        this.f(l0);
        this.i = this.i.h(l0.j);
    }
}

