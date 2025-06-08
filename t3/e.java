package t3;

import com.google.android.gms.internal.ads.Ra;
import com.google.android.gms.internal.ads.w;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import q3.a;
import w3.d;
import w3.g;
import w3.i;
import w3.o;

public final class e extends o {
    public final w3.e i;
    public int j;
    public b k;
    public c l;
    public c m;
    public c n;
    public c o;
    public byte p;
    public int q;
    public static final e r;
    public static final a s;

    static {
        e.s = new a(26);
        e e0 = new e();
        e.r = e0;
        e0.k = b.o;
        e0.l = c.o;
        e0.m = c.o;
        e0.n = c.o;
        e0.o = c.o;
    }

    public e() {
        this.p = -1;
        this.q = -1;
        this.i = w3.e.i;
    }

    public e(Ra ra0, g g0) {
        this.p = -1;
        this.q = -1;
        this.k = b.o;
        this.l = c.o;
        this.m = c.o;
        this.n = c.o;
        this.o = c.o;
        d d0 = new d();
        w w0 = w.j(d0, 1);
        boolean z = false;
        while(!z) {
            try {
                int v = ra0.n();
                if(v != 0) {
                    t3.a a0 = null;
                    switch(v) {
                        case 10: {
                            if((this.j & 1) == 1) {
                                b b0 = this.k;
                                b0.getClass();
                                a0 = new t3.a(0);
                                a0.h(b0);
                            }
                            b b1 = (b)ra0.g(b.p, g0);
                            this.k = b1;
                            if(a0 != null) {
                                a0.h(b1);
                                this.k = a0.f();
                            }
                            this.j |= 1;
                            continue;
                        }
                        case 18: {
                            if((this.j & 2) == 2) {
                                c c6 = this.l;
                                c6.getClass();
                                a0 = c.i(c6);
                            }
                            c c7 = (c)ra0.g(c.p, g0);
                            this.l = c7;
                            if(a0 != null) {
                                a0.i(c7);
                                this.l = a0.g();
                            }
                            this.j |= 2;
                            continue;
                        }
                        case 26: {
                            if((this.j & 4) == 4) {
                                c c4 = this.m;
                                c4.getClass();
                                a0 = c.i(c4);
                            }
                            c c5 = (c)ra0.g(c.p, g0);
                            this.m = c5;
                            if(a0 != null) {
                                a0.i(c5);
                                this.m = a0.g();
                            }
                            this.j |= 4;
                            continue;
                        }
                        case 34: {
                            if((this.j & 8) == 8) {
                                c c2 = this.n;
                                c2.getClass();
                                a0 = c.i(c2);
                            }
                            c c3 = (c)ra0.g(c.p, g0);
                            this.n = c3;
                            if(a0 != null) {
                                a0.i(c3);
                                this.n = a0.g();
                            }
                            this.j |= 8;
                            continue;
                        }
                        case 42: {
                            if((this.j & 16) == 16) {
                                c c0 = this.o;
                                c0.getClass();
                                a0 = c.i(c0);
                            }
                            c c1 = (c)ra0.g(c.p, g0);
                            this.o = c1;
                            if(a0 != null) {
                                a0.i(c1);
                                this.o = a0.g();
                            }
                            this.j |= 16;
                            continue;
                        }
                        default: {
                            if(ra0.q(v, w0)) {
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
                        goto label_88;
                    }
                    invalidProtocolBufferException0.i = this;
                    throw invalidProtocolBufferException0;
                label_88:
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
                goto label_88;
            }
            catch(Throwable throwable0) {
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

    public e(t3.d d0) {
        this.p = -1;
        this.q = -1;
        this.i = d0.i;
    }

    @Override  // w3.v
    public final boolean b() {
        int v = this.p;
        if(v == 1) {
            return true;
        }
        if(v == 0) {
            return false;
        }
        this.p = 1;
        return true;
    }

    @Override  // w3.b
    public final int c() {
        int v = this.q;
        if(v != -1) {
            return v;
        }
        int v1 = (this.j & 1) == 1 ? w.d(1, this.k) : 0;
        if((this.j & 2) == 2) {
            v1 += w.d(2, this.l);
        }
        if((this.j & 4) == 4) {
            v1 += w.d(3, this.m);
        }
        if((this.j & 8) == 8) {
            v1 += w.d(4, this.n);
        }
        if((this.j & 16) == 16) {
            v1 += w.d(5, this.o);
        }
        int v2 = this.i.size() + v1;
        this.q = v2;
        return v2;
    }

    @Override  // w3.b
    public final i d() {
        return t3.d.g();
    }

    @Override  // w3.b
    public final i e() {
        i i0 = t3.d.g();
        ((t3.d)i0).h(this);
        return i0;
    }

    @Override  // w3.b
    public final void f(w w0) {
        this.c();
        if((this.j & 1) == 1) {
            w0.o(1, this.k);
        }
        if((this.j & 2) == 2) {
            w0.o(2, this.l);
        }
        if((this.j & 4) == 4) {
            w0.o(3, this.m);
        }
        if((this.j & 8) == 8) {
            w0.o(4, this.n);
        }
        if((this.j & 16) == 16) {
            w0.o(5, this.o);
        }
        w0.r(this.i);
    }
}

