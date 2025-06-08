package t3;

import com.google.android.gms.internal.ads.Ra;
import com.google.android.gms.internal.ads.w;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import q3.a;
import w3.d;
import w3.e;
import w3.o;
import w3.u;

public final class i extends o {
    public final e i;
    public int j;
    public int k;
    public int l;
    public Object m;
    public h n;
    public List o;
    public int p;
    public List q;
    public int r;
    public byte s;
    public int t;
    public static final i u;
    public static final a v;

    static {
        i.v = new a(28);
        i i0 = new i();
        i.u = i0;
        i0.k = 1;
        i0.l = 0;
        i0.m = "";
        i0.n = h.j;
        i0.o = Collections.emptyList();
        i0.q = Collections.emptyList();
    }

    public i() {
        this.p = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.i = e.i;
    }

    public i(Ra ra0) {
        h h1;
        this.p = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.k = 1;
        this.l = 0;
        this.m = "";
        h h0 = h.j;
        this.n = h0;
        this.o = Collections.emptyList();
        this.q = Collections.emptyList();
        d d0 = new d();
        w w0 = w.j(d0, 1);
        int v = 0;
        boolean z = false;
        while(!z) {
            try {
                try {
                    int v1 = ra0.n();
                    switch(v1) {
                        case 0: {
                        label_20:
                            z = true;
                            continue;
                        }
                        case 8: {
                            this.j |= 1;
                            this.k = ra0.k();
                            continue;
                        }
                        case 16: {
                            this.j |= 2;
                            this.l = ra0.k();
                            continue;
                        }
                        case 24: {
                            int v2 = ra0.k();
                            switch(v2) {
                                case 0: {
                                    h1 = h0;
                                    break;
                                }
                                case 1: {
                                    h1 = h.k;
                                    break;
                                }
                                case 2: {
                                    h1 = h.l;
                                    break;
                                }
                                default: {
                                    h1 = null;
                                }
                            }
                            if(h1 == null) {
                                w0.v(24);
                                w0.v(v2);
                            }
                            else {
                                this.j |= 8;
                                this.n = h1;
                            }
                            continue;
                        }
                        case 0x20: {
                            if((v & 16) != 16) {
                                this.o = new ArrayList();
                                v |= 16;
                            }
                            this.o.add(ra0.k());
                            continue;
                        }
                        case 34: {
                            int v3 = ra0.d(ra0.k());
                            if((v & 16) != 16 && ra0.b() > 0) {
                                this.o = new ArrayList();
                                v |= 16;
                            }
                            while(ra0.b() > 0) {
                                this.o.add(ra0.k());
                            }
                            ra0.c(v3);
                            continue;
                        }
                        case 40: {
                            if((v & 0x20) != 0x20) {
                                this.q = new ArrayList();
                                v |= 0x20;
                            }
                            this.q.add(ra0.k());
                            continue;
                        }
                        case 42: {
                            int v4 = ra0.d(ra0.k());
                            if((v & 0x20) != 0x20 && ra0.b() > 0) {
                                this.q = new ArrayList();
                                v |= 0x20;
                            }
                            while(ra0.b() > 0) {
                                this.q.add(ra0.k());
                            }
                            ra0.c(v4);
                            continue;
                        }
                        case 50: {
                            u u0 = ra0.e();
                            this.j |= 4;
                            this.m = u0;
                            continue;
                        }
                        default: {
                            if(!ra0.q(v1, w0)) {
                                goto label_20;
                            }
                            continue;
                        }
                    }
                }
                catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                }
                catch(IOException iOException0) {
                    goto label_83;
                }
                invalidProtocolBufferException0.i = this;
                throw invalidProtocolBufferException0;
            label_83:
                InvalidProtocolBufferException invalidProtocolBufferException1 = new InvalidProtocolBufferException(iOException0.getMessage());
                invalidProtocolBufferException1.i = this;
                throw invalidProtocolBufferException1;
            }
            catch(Throwable throwable0) {
            }
            if((v & 16) == 16) {
                this.o = Collections.unmodifiableList(this.o);
            }
            if((v & 0x20) == 0x20) {
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
        if((v & 16) == 16) {
            this.o = Collections.unmodifiableList(this.o);
        }
        if((v & 0x20) == 0x20) {
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

    public i(g g0) {
        this.p = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.i = g0.i;
    }

    @Override  // w3.v
    public final boolean b() {
        int v = this.s;
        if(v == 1) {
            return true;
        }
        if(v == 0) {
            return false;
        }
        this.s = 1;
        return true;
    }

    @Override  // w3.b
    public final int c() {
        e e0;
        int v1 = this.t;
        if(v1 != -1) {
            return v1;
        }
        int v2 = (this.j & 1) == 1 ? w.b(1, this.k) : 0;
        if((this.j & 2) == 2) {
            v2 += w.b(2, this.l);
        }
        if((this.j & 8) == 8) {
            v2 += w.a(3, this.n.i);
        }
        int v4 = 0;
        for(int v3 = 0; v3 < this.o.size(); ++v3) {
            v4 += w.c(((int)(((Integer)this.o.get(v3)))));
        }
        int v5 = this.o.isEmpty() ? v2 + v4 : v2 + v4 + 1 + w.c(v4);
        this.p = v4;
        int v6 = 0;
        for(int v = 0; v < this.q.size(); ++v) {
            v6 += w.c(((int)(((Integer)this.q.get(v)))));
        }
        int v7 = this.q.isEmpty() ? v5 + v6 : v5 + v6 + 1 + w.c(v6);
        this.r = v6;
        if((this.j & 4) == 4) {
            Object object0 = this.m;
            if(object0 instanceof String) {
                String s = (String)object0;
                try {
                    e0 = new u(s.getBytes("UTF-8"));
                    this.m = e0;
                }
                catch(UnsupportedEncodingException unsupportedEncodingException0) {
                    throw new RuntimeException("UTF-8 not supported?", unsupportedEncodingException0);
                }
            }
            else {
                e0 = (e)object0;
            }
            v7 += e0.size() + w.f(e0.size()) + 1;
        }
        int v8 = this.i.size() + v7;
        this.t = v8;
        return v8;
    }

    @Override  // w3.b
    public final w3.i d() {
        return g.g();
    }

    @Override  // w3.b
    public final w3.i e() {
        w3.i i0 = g.g();
        ((g)i0).h(this);
        return i0;
    }

    @Override  // w3.b
    public final void f(w w0) {
        e e0;
        this.c();
        if((this.j & 1) == 1) {
            w0.m(1, this.k);
        }
        if((this.j & 2) == 2) {
            w0.m(2, this.l);
        }
        if((this.j & 8) == 8) {
            w0.l(3, this.n.i);
        }
        if(this.o.size() > 0) {
            w0.v(34);
            w0.v(this.p);
        }
        for(int v1 = 0; v1 < this.o.size(); ++v1) {
            w0.n(((int)(((Integer)this.o.get(v1)))));
        }
        if(this.q.size() > 0) {
            w0.v(42);
            w0.v(this.r);
        }
        for(int v = 0; v < this.q.size(); ++v) {
            w0.n(((int)(((Integer)this.q.get(v)))));
        }
        if((this.j & 4) == 4) {
            Object object0 = this.m;
            if(object0 instanceof String) {
                String s = (String)object0;
                try {
                    e0 = new u(s.getBytes("UTF-8"));
                    this.m = e0;
                }
                catch(UnsupportedEncodingException unsupportedEncodingException0) {
                    throw new RuntimeException("UTF-8 not supported?", unsupportedEncodingException0);
                }
            }
            else {
                e0 = (e)object0;
            }
            w0.x(6, 2);
            w0.v(e0.size());
            w0.r(e0);
        }
        w0.r(this.i);
    }
}

