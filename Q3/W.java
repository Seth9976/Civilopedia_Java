package q3;

import com.google.android.gms.internal.ads.Ra;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import w3.b;
import w3.d;
import w3.e;
import w3.g;
import w3.i;
import w3.o;

public final class w extends o {
    public final e i;
    public int j;
    public int k;
    public int l;
    public v m;
    public Q n;
    public int o;
    public List p;
    public List q;
    public byte r;
    public int s;
    public static final w t;
    public static final a u;

    static {
        w.u = new a(8);
        w w0 = new w();
        w.t = w0;
        w0.k = 0;
        w0.l = 0;
        w0.m = v.j;
        w0.n = Q.B;
        w0.o = 0;
        w0.p = Collections.emptyList();
        w0.q = Collections.emptyList();
    }

    public w() {
        this.r = -1;
        this.s = -1;
        this.i = e.i;
    }

    public w(Ra ra0, g g0) {
        v v4;
        this.r = -1;
        this.s = -1;
        this.k = 0;
        this.l = 0;
        v v0 = v.j;
        this.m = v0;
        this.n = Q.B;
        this.o = 0;
        this.p = Collections.emptyList();
        this.q = Collections.emptyList();
        d d0 = new d();
        com.google.android.gms.internal.ads.w w0 = com.google.android.gms.internal.ads.w.j(d0, 1);
        int v1 = 0;
        boolean z = false;
        while(!z) {
            try {
                int v2 = ra0.n();
                P p0 = null;
                switch(v2) {
                    case 0: {
                    label_71:
                        z = true;
                        break;
                    }
                    case 8: {
                        this.j |= 1;
                        this.k = ra0.k();
                        continue;
                    }
                    default: {
                        if(v2 == 16) {
                            this.j |= 2;
                            this.l = ra0.k();
                        }
                        else {
                            switch(v2) {
                                case 24: {
                                    int v3 = ra0.k();
                                    switch(v3) {
                                        case 0: {
                                            v4 = v0;
                                            break;
                                        }
                                        case 1: {
                                            v4 = v.k;
                                            break;
                                        }
                                        case 2: {
                                            v4 = v.l;
                                            break;
                                        }
                                        default: {
                                            v4 = null;
                                        }
                                    }
                                    if(v4 == null) {
                                        w0.v(24);
                                        w0.v(v3);
                                    }
                                    else {
                                        this.j |= 4;
                                        this.m = v4;
                                    }
                                    break;
                                }
                                case 34: {
                                    if((this.j & 8) == 8) {
                                        Q q0 = this.n;
                                        q0.getClass();
                                        p0 = Q.r(q0);
                                    }
                                    Q q1 = (Q)ra0.g(Q.C, g0);
                                    this.n = q1;
                                    if(p0 != null) {
                                        p0.i(q1);
                                        this.n = p0.g();
                                    }
                                    this.j |= 8;
                                    break;
                                }
                                case 40: {
                                    this.j |= 16;
                                    this.o = ra0.k();
                                    break;
                                }
                                default: {
                                    a a0 = w.u;
                                    switch(v2) {
                                        case 50: {
                                            if((v1 & 0x20) != 0x20) {
                                                this.p = new ArrayList();
                                                v1 |= 0x20;
                                            }
                                            this.p.add(ra0.g(a0, g0));
                                            break;
                                        }
                                        case 58: {
                                            if((v1 & 0x40) != 0x40) {
                                                this.q = new ArrayList();
                                                v1 |= 0x40;
                                            }
                                            this.q.add(ra0.g(a0, g0));
                                            break;
                                        }
                                        default: {
                                            if(ra0.q(v2, w0)) {
                                                break;
                                            }
                                            goto label_71;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    }
                }
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                invalidProtocolBufferException0.i = this;
                throw invalidProtocolBufferException0;
            }
            catch(IOException iOException0) {
                goto label_84;
            }
            catch(Throwable throwable0) {
                goto label_87;
            }
            continue;
            try {
                try {
                    this.j |= 1;
                    this.k = ra0.k();
                    continue;
                }
                catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                }
                catch(IOException iOException0) {
                    goto label_84;
                }
                invalidProtocolBufferException0.i = this;
                throw invalidProtocolBufferException0;
            label_84:
                InvalidProtocolBufferException invalidProtocolBufferException1 = new InvalidProtocolBufferException(iOException0.getMessage());
                invalidProtocolBufferException1.i = this;
                throw invalidProtocolBufferException1;
            }
            catch(Throwable throwable0) {
            }
        label_87:
            if((v1 & 0x20) == 0x20) {
                this.p = Collections.unmodifiableList(this.p);
            }
            if((v1 & 0x40) == 0x40) {
                this.q = Collections.unmodifiableList(this.q);
            }
            try {
                w0.i();
                this.i = d0.c();
                throw throwable0;
            }
            catch(IOException unused_ex) {
                this.i = d0.c();
                throw throwable0;
            }
            catch(Throwable throwable1) {
            }
            this.i = d0.c();
            throw throwable1;
        }
        if((v1 & 0x20) == 0x20) {
            this.p = Collections.unmodifiableList(this.p);
        }
        if((v1 & 0x40) == 0x40) {
            this.q = Collections.unmodifiableList(this.q);
        }
        try {
            w0.i();
            this.i = d0.c();
            return;
        }
        catch(IOException unused_ex) {
            this.i = d0.c();
            return;
        }
        catch(Throwable throwable2) {
        }
        this.i = d0.c();
        throw throwable2;
    }

    public w(u u0) {
        this.r = -1;
        this.s = -1;
        this.i = u0.i;
    }

    @Override  // w3.v
    public final boolean b() {
        int v = this.r;
        if(v == 1) {
            return true;
        }
        if(v == 0) {
            return false;
        }
        if((this.j & 8) == 8 && !this.n.b()) {
            this.r = 0;
            return false;
        }
        for(int v1 = 0; v1 < this.p.size(); ++v1) {
            if(!((w)this.p.get(v1)).b()) {
                this.r = 0;
                return false;
            }
        }
        for(int v2 = 0; v2 < this.q.size(); ++v2) {
            if(!((w)this.q.get(v2)).b()) {
                this.r = 0;
                return false;
            }
        }
        this.r = 1;
        return true;
    }

    @Override  // w3.b
    public final int c() {
        int v1 = this.s;
        if(v1 != -1) {
            return v1;
        }
        int v2 = (this.j & 1) == 1 ? com.google.android.gms.internal.ads.w.b(1, this.k) : 0;
        if((this.j & 2) == 2) {
            v2 += com.google.android.gms.internal.ads.w.b(2, this.l);
        }
        if((this.j & 4) == 4) {
            v2 += com.google.android.gms.internal.ads.w.a(3, this.m.i);
        }
        if((this.j & 8) == 8) {
            v2 += com.google.android.gms.internal.ads.w.d(4, this.n);
        }
        if((this.j & 16) == 16) {
            v2 += com.google.android.gms.internal.ads.w.b(5, this.o);
        }
        for(int v3 = 0; v3 < this.p.size(); ++v3) {
            v2 += com.google.android.gms.internal.ads.w.d(6, ((b)this.p.get(v3)));
        }
        for(int v = 0; v < this.q.size(); ++v) {
            v2 += com.google.android.gms.internal.ads.w.d(7, ((b)this.q.get(v)));
        }
        int v4 = this.i.size() + v2;
        this.s = v4;
        return v4;
    }

    @Override  // w3.b
    public final i d() {
        return u.g();
    }

    @Override  // w3.b
    public final i e() {
        i i0 = u.g();
        ((u)i0).h(this);
        return i0;
    }

    @Override  // w3.b
    public final void f(com.google.android.gms.internal.ads.w w0) {
        this.c();
        if((this.j & 1) == 1) {
            w0.m(1, this.k);
        }
        if((this.j & 2) == 2) {
            w0.m(2, this.l);
        }
        if((this.j & 4) == 4) {
            w0.l(3, this.m.i);
        }
        if((this.j & 8) == 8) {
            w0.o(4, this.n);
        }
        if((this.j & 16) == 16) {
            w0.m(5, this.o);
        }
        for(int v1 = 0; v1 < this.p.size(); ++v1) {
            w0.o(6, ((b)this.p.get(v1)));
        }
        for(int v = 0; v < this.q.size(); ++v) {
            w0.o(7, ((b)this.q.get(v)));
        }
        w0.r(this.i);
    }
}

