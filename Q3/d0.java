package q3;

import com.google.android.gms.internal.ads.Ra;
import com.google.android.gms.internal.ads.w;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import w3.d;
import w3.e;
import w3.i;
import w3.o;

public final class d0 extends o {
    public final e i;
    public int j;
    public int k;
    public int l;
    public b0 m;
    public int n;
    public int o;
    public c0 p;
    public byte q;
    public int r;
    public static final d0 s;
    public static final a t;

    static {
        d0.t = new a(22);
        d0 d00 = new d0();
        d0.s = d00;
        d00.k = 0;
        d00.l = 0;
        d00.m = b0.k;
        d00.n = 0;
        d00.o = 0;
        d00.p = c0.j;
    }

    public d0() {
        this.q = -1;
        this.r = -1;
        this.i = e.i;
    }

    public d0(Ra ra0) {
        this.q = -1;
        this.r = -1;
        this.k = 0;
        this.l = 0;
        b0 b00 = b0.k;
        this.m = b00;
        this.n = 0;
        this.o = 0;
        c0 c00 = c0.j;
        this.p = c00;
        d d0 = new d();
        w w0 = w.j(d0, 1);
        boolean z = false;
        while(!z) {
            try {
                b0 b01 = null;
                int v = ra0.n();
            alab1:
                switch(v) {
                    case 0: {
                        z = true;
                        break;
                    }
                    case 8: {
                        this.j |= 1;
                        this.k = ra0.k();
                        continue;
                    }
                    default: {
                        if(v == 16) {
                            this.j |= 2;
                            this.l = ra0.k();
                            break;
                        }
                        else {
                            switch(v) {
                                case 24: {
                                    int v1 = ra0.k();
                                    switch(v1) {
                                        case 0: {
                                            b01 = b0.j;
                                            break;
                                        }
                                        case 1: {
                                            b01 = b00;
                                            break;
                                        }
                                        case 2: {
                                            b01 = b0.l;
                                        }
                                    }
                                    if(b01 == null) {
                                        w0.v(24);
                                        w0.v(v1);
                                    }
                                    else {
                                        this.j |= 4;
                                        this.m = b01;
                                    }
                                    break alab1;
                                }
                                case 0x20: {
                                    this.j |= 8;
                                    this.n = ra0.k();
                                    break alab1;
                                }
                                case 40: {
                                    this.j |= 16;
                                    this.o = ra0.k();
                                    break alab1;
                                }
                                case 0x30: {
                                    int v2 = ra0.k();
                                    switch(v2) {
                                        case 0: {
                                            b01 = c00;
                                            break;
                                        }
                                        case 1: {
                                            b01 = c0.k;
                                            break;
                                        }
                                        case 2: {
                                            b01 = c0.l;
                                        }
                                    }
                                    if(b01 == null) {
                                        w0.v(0x30);
                                        w0.v(v2);
                                    }
                                    else {
                                        this.j |= 0x20;
                                        this.p = b01;
                                    }
                                    break alab1;
                                }
                                default: {
                                    if(ra0.q(v, w0)) {
                                        break alab1;
                                    }
                                }
                            }
                        }
                        z = true;
                        break;
                    }
                }
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                invalidProtocolBufferException0.i = this;
                throw invalidProtocolBufferException0;
            }
            catch(IOException iOException0) {
                goto label_78;
            }
            catch(Throwable throwable0) {
                goto label_81;
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
                    goto label_78;
                }
                invalidProtocolBufferException0.i = this;
                throw invalidProtocolBufferException0;
            label_78:
                InvalidProtocolBufferException invalidProtocolBufferException1 = new InvalidProtocolBufferException(iOException0.getMessage());
                invalidProtocolBufferException1.i = this;
                throw invalidProtocolBufferException1;
            }
            catch(Throwable throwable0) {
            }
            try {
            label_81:
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

    public d0(a0 a00) {
        this.q = -1;
        this.r = -1;
        this.i = a00.i;
    }

    @Override  // w3.v
    public final boolean b() {
        int v = this.q;
        if(v == 1) {
            return true;
        }
        if(v == 0) {
            return false;
        }
        this.q = 1;
        return true;
    }

    @Override  // w3.b
    public final int c() {
        int v = this.r;
        if(v != -1) {
            return v;
        }
        int v1 = (this.j & 1) == 1 ? w.b(1, this.k) : 0;
        if((this.j & 2) == 2) {
            v1 += w.b(2, this.l);
        }
        if((this.j & 4) == 4) {
            v1 += w.a(3, this.m.i);
        }
        if((this.j & 8) == 8) {
            v1 += w.b(4, this.n);
        }
        if((this.j & 16) == 16) {
            v1 += w.b(5, this.o);
        }
        if((this.j & 0x20) == 0x20) {
            v1 += w.a(6, this.p.i);
        }
        int v2 = this.i.size() + v1;
        this.r = v2;
        return v2;
    }

    @Override  // w3.b
    public final i d() {
        return a0.g();
    }

    @Override  // w3.b
    public final i e() {
        i i0 = a0.g();
        ((a0)i0).h(this);
        return i0;
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
        if((this.j & 4) == 4) {
            w0.l(3, this.m.i);
        }
        if((this.j & 8) == 8) {
            w0.m(4, this.n);
        }
        if((this.j & 16) == 16) {
            w0.m(5, this.o);
        }
        if((this.j & 0x20) == 0x20) {
            w0.l(6, this.p.i);
        }
        w0.r(this.i);
    }
}

