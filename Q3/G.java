package q3;

import com.google.android.gms.internal.ads.Ra;
import com.google.android.gms.internal.ads.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import w3.b;
import w3.d;
import w3.e;
import w3.i;
import w3.o;

public final class g extends o {
    public final e i;
    public int j;
    public int k;
    public List l;
    public byte m;
    public int n;
    public static final g o;
    public static final a p;

    static {
        g.p = new a(0);
        g g0 = new g();
        g.o = g0;
        g0.k = 0;
        g0.l = Collections.emptyList();
    }

    public g() {
        this.m = -1;
        this.n = -1;
        this.i = e.i;
    }

    public g(Ra ra0, w3.g g0) {
        this.m = -1;
        this.n = -1;
        this.k = 0;
        this.l = Collections.emptyList();
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
                            z = true;
                            continue;
                        }
                        case 8: {
                            this.j |= 1;
                            this.k = ra0.k();
                            continue;
                        }
                        case 18: {
                            if((v & 2) != 2) {
                                this.l = new ArrayList();
                                v = 2;
                            }
                            break;
                        }
                        default: {
                            if(!ra0.q(v1, w0)) {
                                z = true;
                                continue;
                            }
                            continue;
                        }
                    }
                    this.l.add(ra0.g(q3.e.p, g0));
                    continue;
                }
                catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                }
                catch(IOException iOException0) {
                    goto label_30;
                }
                invalidProtocolBufferException0.i = this;
                throw invalidProtocolBufferException0;
            label_30:
                InvalidProtocolBufferException invalidProtocolBufferException1 = new InvalidProtocolBufferException(iOException0.getMessage());
                invalidProtocolBufferException1.i = this;
                throw invalidProtocolBufferException1;
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

    public g(f f0) {
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
        if((this.j & 1) == 1) {
            for(int v1 = 0; v1 < this.l.size(); ++v1) {
                if(!((q3.e)this.l.get(v1)).b()) {
                    this.m = 0;
                    return false;
                }
            }
            this.m = 1;
            return true;
        }
        this.m = 0;
        return false;
    }

    @Override  // w3.b
    public final int c() {
        int v1 = this.n;
        if(v1 != -1) {
            return v1;
        }
        int v2 = (this.j & 1) == 1 ? w.b(1, this.k) : 0;
        for(int v = 0; v < this.l.size(); ++v) {
            v2 += w.d(2, ((b)this.l.get(v)));
        }
        int v3 = this.i.size() + v2;
        this.n = v3;
        return v3;
    }

    @Override  // w3.b
    public final i d() {
        i i0 = new f(0);
        i0.l = Collections.emptyList();
        return i0;
    }

    @Override  // w3.b
    public final i e() {
        i i0 = new f(0);
        i0.l = Collections.emptyList();
        ((f)i0).k(this);
        return i0;
    }

    @Override  // w3.b
    public final void f(w w0) {
        this.c();
        if((this.j & 1) == 1) {
            w0.m(1, this.k);
        }
        for(int v = 0; v < this.l.size(); ++v) {
            w0.o(2, ((b)this.l.get(v)));
        }
        w0.r(this.i);
    }
}

