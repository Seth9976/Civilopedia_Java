package t3;

import com.google.android.gms.internal.ads.Ra;
import com.google.android.gms.internal.ads.w;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import q3.a;
import w3.d;
import w3.e;
import w3.i;
import w3.o;

public final class c extends o {
    public final e i;
    public int j;
    public int k;
    public int l;
    public byte m;
    public int n;
    public static final c o;
    public static final a p;

    static {
        c.p = new a(25);
        c c0 = new c();
        c.o = c0;
        c0.k = 0;
        c0.l = 0;
    }

    public c() {
        this.m = -1;
        this.n = -1;
        this.i = e.i;
    }

    public c(Ra ra0) {
        this.m = -1;
        this.n = -1;
        this.k = 0;
        this.l = 0;
        d d0 = new d();
        w w0 = w.j(d0, 1);
        boolean z = false;
        while(!z) {
            try {
                try {
                    int v = ra0.n();
                    switch(v) {
                        case 0: {
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
                        default: {
                            if(!ra0.q(v, w0)) {
                                z = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
                catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                }
                catch(IOException iOException0) {
                    goto label_27;
                }
                invalidProtocolBufferException0.i = this;
                throw invalidProtocolBufferException0;
            label_27:
                InvalidProtocolBufferException invalidProtocolBufferException1 = new InvalidProtocolBufferException(iOException0.getMessage());
                invalidProtocolBufferException1.i = this;
                throw invalidProtocolBufferException1;
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

    public c(t3.a a0) {
        this.m = -1;
        this.n = -1;
        this.i = a0.i;
    }

    @Override  // w3.v
    public final boolean b() {
        int v = this.m;
        if(v == 1) {
            return true;
        }
        if(v == 0) {
            return false;
        }
        this.m = 1;
        return true;
    }

    @Override  // w3.b
    public final int c() {
        int v = this.n;
        if(v != -1) {
            return v;
        }
        int v1 = (this.j & 1) == 1 ? w.b(1, this.k) : 0;
        if((this.j & 2) == 2) {
            v1 += w.b(2, this.l);
        }
        int v2 = this.i.size() + v1;
        this.n = v2;
        return v2;
    }

    @Override  // w3.b
    public final i d() {
        return new t3.a(1);
    }

    @Override  // w3.b
    public final i e() {
        return c.i(this);
    }

    @Override  // w3.b
    public final void f(w w0) {
        this.c();
        if((this.j & 1) == 1) {
            w0.m(1, this.k);
        }
        if((this.j & 2) == 2) {
            w0.m(2, this.l);
        }
        w0.r(this.i);
    }

    public static t3.a i(c c0) {
        t3.a a0 = new t3.a(1);
        a0.i(c0);
        return a0;
    }
}

