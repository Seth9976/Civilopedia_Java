package q3;

import com.google.android.gms.internal.ads.Ra;
import com.google.android.gms.internal.ads.w;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import w3.b;
import w3.d;
import w3.e;
import w3.g;
import w3.i;
import w3.k;
import w3.l;

public final class t extends l {
    public final e j;
    public int k;
    public int l;
    public byte m;
    public int n;
    public static final t o;
    public static final a p;

    static {
        t.p = new a(7);
        t t0 = new t();
        t.o = t0;
        t0.l = 0;
    }

    public t() {
        this.m = -1;
        this.n = -1;
        this.j = e.i;
    }

    public t(Ra ra0, g g0) {
        this.m = -1;
        this.n = -1;
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
                            break;
                        }
                        default: {
                            if(!this.n(ra0, w0, g0, v)) {
                                z = true;
                                continue;
                            }
                            continue;
                        }
                    }
                    this.k |= 1;
                    this.l = ra0.k();
                    continue;
                }
                catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                }
                catch(IOException iOException0) {
                    goto label_23;
                }
                invalidProtocolBufferException0.i = this;
                throw invalidProtocolBufferException0;
            label_23:
                InvalidProtocolBufferException invalidProtocolBufferException1 = new InvalidProtocolBufferException(iOException0.getMessage());
                invalidProtocolBufferException1.i = this;
                throw invalidProtocolBufferException1;
            }
            catch(Throwable throwable0) {
            }
            try {
                w0.i();
                goto label_31;
            }
            catch(IOException unused_ex) {
                goto label_31;
            }
            catch(Throwable throwable1) {
            }
            this.j = d0.c();
            throw throwable1;
        label_31:
            this.j = d0.c();
            this.m();
            throw throwable0;
        }
        try {
            w0.i();
            goto label_39;
        }
        catch(IOException unused_ex) {
            goto label_39;
        }
        catch(Throwable throwable2) {
        }
        this.j = d0.c();
        throw throwable2;
    label_39:
        this.j = d0.c();
        this.m();
    }

    public t(s s0) {
        super(s0);
        this.m = -1;
        this.n = -1;
        this.j = s0.i;
    }

    @Override  // w3.v
    public final b a() {
        return t.o;
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
        if(!this.i()) {
            this.m = 0;
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
        int v1 = (this.k & 1) == 1 ? w.b(1, this.l) : 0;
        int v2 = this.j();
        int v3 = this.j.size() + (v2 + v1);
        this.n = v3;
        return v3;
    }

    @Override  // w3.b
    public final i d() {
        return new s();  // 初始化器: Lw3/j;-><init>()V
    }

    @Override  // w3.b
    public final i e() {
        i i0 = new s();  // 初始化器: Lw3/j;-><init>()V
        ((s)i0).g(this);
        return i0;
    }

    @Override  // w3.b
    public final void f(w w0) {
        this.c();
        k k0 = new k(this);
        if((this.k & 1) == 1) {
            w0.m(1, this.l);
        }
        k0.m0(200, w0);
        w0.r(this.j);
    }
}

