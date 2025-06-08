package t3;

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

public final class f extends i implements v {
    public int j;
    public List k;
    public List l;

    @Override  // w3.i
    public final b c() {
        b b0 = this.f();
        if(!((j)b0).b()) {
            throw new UninitializedMessageException();
        }
        return b0;
    }

    @Override
    public final Object clone() {
        f f0 = f.g();
        f0.h(this.f());
        return f0;
    }

    @Override  // w3.i
    public final i d(Ra ra0, g g0) {
        j j1;
        j j0;
        try {
            try {
                j0 = null;
                j.p.getClass();
                j1 = new j(ra0, g0);
                goto label_14;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                j j2 = (j)invalidProtocolBufferException0.i;
                try {
                    throw invalidProtocolBufferException0;
                }
                catch(Throwable throwable0) {
                    j0 = j2;
                }
            }
        }
        catch(Throwable throwable0) {
        }
        if(j0 != null) {
            this.h(j0);
        }
        throw throwable0;
    label_14:
        this.h(j1);
        return this;
    }

    @Override  // w3.i
    public final i e(o o0) {
        this.h(((j)o0));
        return this;
    }

    public final j f() {
        j j0 = new j(this);
        if((this.j & 1) == 1) {
            this.k = Collections.unmodifiableList(this.k);
            this.j &= -2;
        }
        j0.j = this.k;
        if((this.j & 2) == 2) {
            this.l = Collections.unmodifiableList(this.l);
            this.j &= -3;
        }
        j0.k = this.l;
        return j0;
    }

    public static f g() {
        f f0 = new f();  // 初始化器: Lw3/i;-><init>()V
        f0.k = Collections.emptyList();
        f0.l = Collections.emptyList();
        return f0;
    }

    public final void h(j j0) {
        if(j0 == j.o) {
            return;
        }
        if(!j0.j.isEmpty()) {
            if(this.k.isEmpty()) {
                this.k = j0.j;
                this.j &= -2;
            }
            else {
                if((this.j & 1) != 1) {
                    this.k = new ArrayList(this.k);
                    this.j |= 1;
                }
                this.k.addAll(j0.j);
            }
        }
        if(!j0.k.isEmpty()) {
            if(this.l.isEmpty()) {
                this.l = j0.k;
                this.j &= -3;
            }
            else {
                if((this.j & 2) != 2) {
                    this.l = new ArrayList(this.l);
                    this.j |= 2;
                }
                this.l.addAll(j0.k);
            }
        }
        this.i = this.i.h(j0.i);
    }
}

