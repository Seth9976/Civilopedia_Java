package q3;

import com.google.android.gms.internal.ads.Ra;
import com.google.android.gms.internal.ads.w;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import w3.g;
import w3.i;
import w3.o;

public final class e extends o {
    public final w3.e i;
    public int j;
    public int k;
    public d l;
    public byte m;
    public int n;
    public static final e o;
    public static final a p;

    static {
        e.p = new a(1);
        e e0 = new e();
        e.o = e0;
        e0.k = 0;
        e0.l = d.x;
    }

    public e() {
        this.m = -1;
        this.n = -1;
        this.i = w3.e.i;
    }

    public e(Ra ra0, g g0) {
        b b0;
        this.m = -1;
        this.n = -1;
        this.k = 0;
        this.l = d.x;
        w3.d d0 = new w3.d();
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
                        case 18: {
                            if((this.j & 2) == 2) {
                                d d1 = this.l;
                                d1.getClass();
                                b0 = b.g();
                                b0.h(d1);
                            }
                            else {
                                b0 = null;
                            }
                            d d2 = (d)ra0.g(d.y, g0);
                            this.l = d2;
                            if(b0 != null) {
                                b0.h(d2);
                                this.l = b0.f();
                            }
                            break;
                        }
                        default: {
                            if(!ra0.q(v, w0)) {
                                z = true;
                                continue;
                            }
                            continue;
                        }
                    }
                    this.j |= 2;
                    continue;
                }
                catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                }
                catch(IOException iOException0) {
                    goto label_38;
                }
                invalidProtocolBufferException0.i = this;
                throw invalidProtocolBufferException0;
            label_38:
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

    public e(f f0) {
        this.m = -1;
        this.n = -1;
        this.i = f0.i;
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
        int v1 = this.j;
        if((v1 & 1) == 1) {
            if((v1 & 2) == 2) {
                if(!this.l.b()) {
                    this.m = 0;
                    return false;
                }
                this.m = 1;
                return true;
            }
            this.m = 0;
            return false;
        }
        this.m = 0;
        return false;
    }

    @Override  // w3.b
    public final int c() {
        int v = this.n;
        if(v != -1) {
            return v;
        }
        int v1 = (this.j & 1) == 1 ? w.b(1, this.k) : 0;
        if((this.j & 2) == 2) {
            v1 += w.d(2, this.l);
        }
        int v2 = this.i.size() + v1;
        this.n = v2;
        return v2;
    }

    @Override  // w3.b
    public final i d() {
        i i0 = new f(2);
        i0.l = d.x;
        return i0;
    }

    @Override  // w3.b
    public final i e() {
        i i0 = new f(2);
        i0.l = d.x;
        ((f)i0).j(this);
        return i0;
    }

    @Override  // w3.b
    public final void f(w w0) {
        this.c();
        if((this.j & 1) == 1) {
            w0.m(1, this.k);
        }
        if((this.j & 2) == 2) {
            w0.o(2, this.l);
        }
        w0.r(this.i);
    }
}

