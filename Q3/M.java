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
import w3.r;
import w3.s;
import w3.v;

public final class m extends i implements v {
    public final int j;
    public int k;
    public List l;

    public m(int v) {
        this.j = v;
        super();
    }

    @Override  // w3.i
    public final b c() {
        switch(this.j) {
            case 0: {
                b b1 = this.f();
                if(!((n)b1).b()) {
                    throw new UninitializedMessageException();
                }
                return b1;
            }
            case 1: {
                b b2 = this.g();
                if(!((K)b2).b()) {
                    throw new UninitializedMessageException();
                }
                return b2;
            }
            case 2: {
                b b3 = this.i();
                if(!((e0)b3).b()) {
                    throw new UninitializedMessageException();
                }
                return b3;
            }
            default: {
                b b0 = this.h();
                if(!((L)b0).b()) {
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
                m m1 = new m(0);
                m1.l = Collections.emptyList();
                m1.j(this.f());
                return m1;
            }
            case 1: {
                m m2 = new m(1);
                m2.l = Collections.emptyList();
                m2.k(this.g());
                return m2;
            }
            case 2: {
                m m3 = new m(2);
                m3.l = Collections.emptyList();
                m3.m(this.i());
                return m3;
            }
            default: {
                m m0 = new m(3);
                m0.l = r.j;
                m0.l(this.h());
                return m0;
            }
        }
    }

    @Override  // w3.i
    public final i d(Ra ra0, g g0) {
        L l1;
        L l0;
        e0 e01;
        e0 e00;
        K k1;
        K k0;
        n n1;
        n n0;
        switch(this.j) {
            case 0: {
                try {
                    try {
                        n0 = null;
                        n.n.getClass();
                        n1 = new n(ra0, g0);
                        goto label_31;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException1) {
                        n n2 = (n)invalidProtocolBufferException1.i;
                        try {
                            throw invalidProtocolBufferException1;
                        }
                        catch(Throwable throwable1) {
                            n0 = n2;
                        }
                    }
                }
                catch(Throwable throwable1) {
                }
                if(n0 != null) {
                    this.j(n0);
                }
                throw throwable1;
            label_31:
                this.j(n1);
                return this;
            }
            case 1: {
                try {
                    try {
                        k0 = null;
                        K.n.getClass();
                        k1 = new K(ra0, g0);
                        goto label_47;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException2) {
                        K k2 = (K)invalidProtocolBufferException2.i;
                        try {
                            throw invalidProtocolBufferException2;
                        }
                        catch(Throwable throwable2) {
                            k0 = k2;
                        }
                    }
                }
                catch(Throwable throwable2) {
                }
                if(k0 != null) {
                    this.k(k0);
                }
                throw throwable2;
            label_47:
                this.k(k1);
                return this;
            }
            case 2: {
                try {
                    try {
                        e00 = null;
                        e0.n.getClass();
                        e01 = new e0(ra0, g0);
                        goto label_63;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException3) {
                        e0 e02 = (e0)invalidProtocolBufferException3.i;
                        try {
                            throw invalidProtocolBufferException3;
                        }
                        catch(Throwable throwable3) {
                            e00 = e02;
                        }
                    }
                }
                catch(Throwable throwable3) {
                }
                if(e00 != null) {
                    this.m(e00);
                }
                throw throwable3;
            label_63:
                this.m(e01);
                return this;
            }
            default: {
                try {
                    try {
                        l0 = null;
                        L.n.getClass();
                        l1 = new L(ra0);
                        goto label_15;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                        L l2 = (L)invalidProtocolBufferException0.i;
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
                    this.l(l0);
                }
                throw throwable0;
            label_15:
                this.l(l1);
                return this;
            }
        }
    }

    @Override  // w3.i
    public final i e(o o0) {
        switch(this.j) {
            case 0: {
                this.j(((n)o0));
                return this;
            }
            case 1: {
                this.k(((K)o0));
                return this;
            }
            case 2: {
                this.m(((e0)o0));
                return this;
            }
            default: {
                this.l(((L)o0));
                return this;
            }
        }
    }

    public n f() {
        n n0 = new n(this);
        if((this.k & 1) == 1) {
            this.l = Collections.unmodifiableList(this.l);
            this.k &= -2;
        }
        n0.j = this.l;
        return n0;
    }

    public K g() {
        K k0 = new K(this);
        if((this.k & 1) == 1) {
            this.l = Collections.unmodifiableList(this.l);
            this.k &= -2;
        }
        k0.j = this.l;
        return k0;
    }

    public L h() {
        L l0 = new L(this);
        if((this.k & 1) == 1) {
            this.l = ((s)this.l).d();
            this.k &= -2;
        }
        l0.j = (s)this.l;
        return l0;
    }

    public e0 i() {
        e0 e00 = new e0(this);
        if((this.k & 1) == 1) {
            this.l = Collections.unmodifiableList(this.l);
            this.k &= -2;
        }
        e00.j = this.l;
        return e00;
    }

    public void j(n n0) {
        if(n0 == n.m) {
            return;
        }
        if(!n0.j.isEmpty()) {
            if(this.l.isEmpty()) {
                this.l = n0.j;
                this.k &= -2;
            }
            else {
                if((this.k & 1) != 1) {
                    this.l = new ArrayList(this.l);
                    this.k |= 1;
                }
                this.l.addAll(n0.j);
            }
        }
        this.i = this.i.h(n0.i);
    }

    public void k(K k0) {
        if(k0 == K.m) {
            return;
        }
        if(!k0.j.isEmpty()) {
            if(this.l.isEmpty()) {
                this.l = k0.j;
                this.k &= -2;
            }
            else {
                if((this.k & 1) != 1) {
                    this.l = new ArrayList(this.l);
                    this.k |= 1;
                }
                this.l.addAll(k0.j);
            }
        }
        this.i = this.i.h(k0.i);
    }

    public void l(L l0) {
        if(l0 == L.m) {
            return;
        }
        if(!l0.j.isEmpty()) {
            if(((s)this.l).isEmpty()) {
                this.l = l0.j;
                this.k &= -2;
            }
            else {
                if((this.k & 1) != 1) {
                    this.l = new r(((s)this.l));
                    this.k |= 1;
                }
                ((s)this.l).addAll(l0.j);
            }
        }
        this.i = this.i.h(l0.i);
    }

    public void m(e0 e00) {
        if(e00 == e0.m) {
            return;
        }
        if(!e00.j.isEmpty()) {
            if(this.l.isEmpty()) {
                this.l = e00.j;
                this.k &= -2;
            }
            else {
                if((this.k & 1) != 1) {
                    this.l = new ArrayList(this.l);
                    this.k |= 1;
                }
                this.l.addAll(e00.j);
            }
        }
        this.i = this.i.h(e00.i);
    }
}

