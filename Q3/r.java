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

public final class r extends o {
    public final e i;
    public int j;
    public p k;
    public List l;
    public w m;
    public q n;
    public byte o;
    public int p;
    public static final r q;
    public static final a r;

    static {
        r.r = new a(6);
        r r0 = new r();
        r.q = r0;
        r0.k = p.j;
        r0.l = Collections.emptyList();
        r0.m = w.t;
        r0.n = q.j;
    }

    public r() {
        this.o = -1;
        this.p = -1;
        this.i = e.i;
    }

    public r(Ra ra0, g g0) {
        this.o = -1;
        this.p = -1;
        p p0 = p.j;
        this.k = p0;
        this.l = Collections.emptyList();
        this.m = w.t;
        q q0 = q.j;
        this.n = q0;
        d d0 = new d();
        com.google.android.gms.internal.ads.w w0 = com.google.android.gms.internal.ads.w.j(d0, 1);
        int v = 0;
        boolean z = false;
        while(!z) {
            try {
                p p1 = null;
                int v1 = ra0.n();
                if(v1 != 0) {
                    switch(v1) {
                        case 8: {
                            int v2 = ra0.k();
                            switch(v2) {
                                case 0: {
                                    p1 = p0;
                                    break;
                                }
                                case 1: {
                                    p1 = p.k;
                                    break;
                                }
                                case 2: {
                                    p1 = p.l;
                                }
                            }
                            if(p1 == null) {
                                w0.v(8);
                                w0.v(v2);
                            }
                            else {
                                this.j |= 1;
                                this.k = p1;
                            }
                            continue;
                        }
                        case 18: {
                            if((v & 2) != 2) {
                                this.l = new ArrayList();
                                v = 2;
                            }
                            this.l.add(ra0.g(w.u, g0));
                            continue;
                        }
                        case 26: {
                            if((this.j & 2) == 2) {
                                w w1 = this.m;
                                w1.getClass();
                                p1 = u.g();
                                ((u)p1).h(w1);
                            }
                            w w2 = (w)ra0.g(w.u, g0);
                            this.m = w2;
                            if(p1 != null) {
                                ((u)p1).h(w2);
                                this.m = ((u)p1).f();
                            }
                            this.j |= 2;
                            continue;
                        }
                        case 0x20: {
                            int v3 = ra0.k();
                            switch(v3) {
                                case 0: {
                                    p1 = q0;
                                    break;
                                }
                                case 1: {
                                    p1 = q.k;
                                    break;
                                }
                                case 2: {
                                    p1 = q.l;
                                }
                            }
                            if(p1 == null) {
                                w0.v(0x20);
                                w0.v(v3);
                            }
                            else {
                                this.j |= 4;
                                this.n = p1;
                            }
                            continue;
                        }
                        default: {
                            if(ra0.q(v1, w0)) {
                                continue;
                            }
                        }
                    }
                }
                try {
                    try {
                        z = true;
                        continue;
                    }
                    catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                    }
                    catch(IOException iOException0) {
                        goto label_80;
                    }
                    invalidProtocolBufferException0.i = this;
                    throw invalidProtocolBufferException0;
                label_80:
                    InvalidProtocolBufferException invalidProtocolBufferException1 = new InvalidProtocolBufferException(iOException0.getMessage());
                    invalidProtocolBufferException1.i = this;
                    throw invalidProtocolBufferException1;
                }
                catch(Throwable throwable0) {
                }
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                invalidProtocolBufferException0.i = this;
                throw invalidProtocolBufferException0;
            }
            catch(IOException iOException0) {
                goto label_80;
            }
            catch(Throwable throwable0) {
            }
            if((v & 2) == 2) {
                this.l = Collections.unmodifiableList(this.l);
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
        if((v & 2) == 2) {
            this.l = Collections.unmodifiableList(this.l);
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

    public r(q3.o o0) {
        this.o = -1;
        this.p = -1;
        this.i = o0.i;
    }

    @Override  // w3.v
    public final boolean b() {
        int v = this.o;
        if(v == 1) {
            return true;
        }
        if(v == 0) {
            return false;
        }
        for(int v1 = 0; v1 < this.l.size(); ++v1) {
            if(!((w)this.l.get(v1)).b()) {
                this.o = 0;
                return false;
            }
        }
        if((this.j & 2) == 2 && !this.m.b()) {
            this.o = 0;
            return false;
        }
        this.o = 1;
        return true;
    }

    @Override  // w3.b
    public final int c() {
        int v1 = this.p;
        if(v1 != -1) {
            return v1;
        }
        int v2 = (this.j & 1) == 1 ? com.google.android.gms.internal.ads.w.a(1, this.k.i) : 0;
        for(int v = 0; v < this.l.size(); ++v) {
            v2 += com.google.android.gms.internal.ads.w.d(2, ((b)this.l.get(v)));
        }
        if((this.j & 2) == 2) {
            v2 += com.google.android.gms.internal.ads.w.d(3, this.m);
        }
        if((this.j & 4) == 4) {
            v2 += com.google.android.gms.internal.ads.w.a(4, this.n.i);
        }
        int v3 = this.i.size() + v2;
        this.p = v3;
        return v3;
    }

    @Override  // w3.b
    public final i d() {
        return q3.o.g();
    }

    @Override  // w3.b
    public final i e() {
        i i0 = q3.o.g();
        ((q3.o)i0).h(this);
        return i0;
    }

    @Override  // w3.b
    public final void f(com.google.android.gms.internal.ads.w w0) {
        this.c();
        if((this.j & 1) == 1) {
            w0.l(1, this.k.i);
        }
        for(int v = 0; v < this.l.size(); ++v) {
            w0.o(2, ((b)this.l.get(v)));
        }
        if((this.j & 2) == 2) {
            w0.o(3, this.m);
        }
        if((this.j & 4) == 4) {
            w0.l(4, this.n.i);
        }
        w0.r(this.i);
    }
}

