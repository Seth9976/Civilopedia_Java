package q3;

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

public final class f extends i implements v {
    public final int j;
    public int k;
    public Object l;
    public int m;

    public f(int v) {
        this.j = v;
        super();
    }

    @Override  // w3.i
    public final b c() {
        switch(this.j) {
            case 0: {
                b b1 = this.g();
                if(!((g)b1).b()) {
                    throw new UninitializedMessageException();
                }
                return b1;
            }
            case 1: {
                b b2 = this.h();
                if(!((X)b2).b()) {
                    throw new UninitializedMessageException();
                }
                return b2;
            }
            default: {
                b b0 = this.f();
                if(!((e)b0).b()) {
                    throw new UninitializedMessageException();
                }
                return b0;
            }
        }
    }

    @Override
    public final Object clone() {
        switch(this.j) {
            case 0: {
                f f1 = new f(0);
                f1.l = Collections.emptyList();
                f1.k(this.g());
                return f1;
            }
            case 1: {
                f f2 = f.i();
                f2.l(this.h());
                return f2;
            }
            default: {
                f f0 = new f(2);
                f0.l = d.x;
                f0.j(this.f());
                return f0;
            }
        }
    }

    @Override  // w3.i
    public final i d(Ra ra0, w3.g g0) {
        e e1;
        e e0;
        X x1;
        X x0;
        g g2;
        g g1;
        switch(this.j) {
            case 0: {
                try {
                    try {
                        g1 = null;
                        g2 = (g)g.p.a(ra0, g0);
                        goto label_30;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException1) {
                        g g3 = (g)invalidProtocolBufferException1.i;
                        try {
                            throw invalidProtocolBufferException1;
                        }
                        catch(Throwable throwable1) {
                            g1 = g3;
                        }
                    }
                }
                catch(Throwable throwable1) {
                }
                if(g1 != null) {
                    this.k(g1);
                }
                throw throwable1;
            label_30:
                this.k(g2);
                return this;
            }
            case 1: {
                try {
                    try {
                        x0 = null;
                        X.p.getClass();
                        x1 = new X(ra0, g0);
                        goto label_46;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException2) {
                        X x2 = (X)invalidProtocolBufferException2.i;
                        try {
                            throw invalidProtocolBufferException2;
                        }
                        catch(Throwable throwable2) {
                            x0 = x2;
                        }
                    }
                }
                catch(Throwable throwable2) {
                }
                if(x0 != null) {
                    this.l(x0);
                }
                throw throwable2;
            label_46:
                this.l(x1);
                return this;
            }
            default: {
                try {
                    try {
                        e0 = null;
                        e.p.getClass();
                        e1 = new e(ra0, g0);
                        goto label_15;
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
                    this.j(e0);
                }
                throw throwable0;
            label_15:
                this.j(e1);
                return this;
            }
        }
    }

    @Override  // w3.i
    public final i e(o o0) {
        switch(this.j) {
            case 0: {
                this.k(((g)o0));
                return this;
            }
            case 1: {
                this.l(((X)o0));
                return this;
            }
            default: {
                this.j(((e)o0));
                return this;
            }
        }
    }

    public e f() {
        e e0 = new e(this);
        int v = this.k;
        int v1 = (v & 1) == 1 ? 1 : 0;
        e0.k = this.m;
        if((v & 2) == 2) {
            v1 |= 2;
        }
        e0.l = (d)this.l;
        e0.j = v1;
        return e0;
    }

    public g g() {
        g g0 = new g(this);
        int v = this.k;
        g0.k = this.m;
        if((v & 2) == 2) {
            this.l = Collections.unmodifiableList(((List)this.l));
            this.k &= -3;
        }
        g0.l = (List)this.l;
        g0.j = (v & 1) == 1 ? 1 : 0;
        return g0;
    }

    public X h() {
        X x0 = new X(this);
        int v = this.k;
        int v1 = 1;
        if((v & 1) == 1) {
            this.l = Collections.unmodifiableList(((List)this.l));
            this.k &= -2;
        }
        x0.k = (List)this.l;
        if((v & 2) != 2) {
            v1 = 0;
        }
        x0.l = this.m;
        x0.j = v1;
        return x0;
    }

    public static f i() {
        f f0 = new f(1);
        f0.l = Collections.emptyList();
        f0.m = -1;
        return f0;
    }

    public void j(e e0) {
        if(e0 == e.o) {
            return;
        }
        int v = e0.j;
        if((v & 1) == 1) {
            int v1 = e0.k;
            this.k |= 1;
            this.m = v1;
        }
        if((v & 2) == 2) {
            d d0 = e0.l;
            if((this.k & 2) == 2) {
                d d1 = (d)this.l;
                if(d1 == d.x) {
                    this.l = d0;
                }
                else {
                    q3.b b0 = q3.b.g();
                    b0.h(d1);
                    b0.h(d0);
                    this.l = b0.f();
                }
            }
            else {
                this.l = d0;
            }
            this.k |= 2;
        }
        this.i = this.i.h(e0.i);
    }

    public void k(g g0) {
        if(g0 == g.o) {
            return;
        }
        if((g0.j & 1) == 1) {
            int v = g0.k;
            this.k |= 1;
            this.m = v;
        }
        if(!g0.l.isEmpty()) {
            if(((List)this.l).isEmpty()) {
                this.l = g0.l;
                this.k &= -3;
            }
            else {
                if((this.k & 2) != 2) {
                    this.l = new ArrayList(((List)this.l));
                    this.k |= 2;
                }
                ((List)this.l).addAll(g0.l);
            }
        }
        this.i = this.i.h(g0.i);
    }

    public void l(X x0) {
        if(x0 == X.o) {
            return;
        }
        if(!x0.k.isEmpty()) {
            if(((List)this.l).isEmpty()) {
                this.l = x0.k;
                this.k &= -2;
            }
            else {
                if((this.k & 1) != 1) {
                    this.l = new ArrayList(((List)this.l));
                    this.k |= 1;
                }
                ((List)this.l).addAll(x0.k);
            }
        }
        if((x0.j & 1) == 1) {
            this.k |= 2;
            this.m = x0.l;
        }
        this.i = this.i.h(x0.i);
    }
}

