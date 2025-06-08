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
import w3.g;
import w3.i;
import w3.o;

public final class n extends o {
    public final e i;
    public List j;
    public byte k;
    public int l;
    public static final n m;
    public static final a n;

    static {
        n.n = new a(5);
        n n0 = new n();
        n.m = n0;
        n0.j = Collections.emptyList();
    }

    public n() {
        this.k = -1;
        this.l = -1;
        this.i = e.i;
    }

    public n(Ra ra0, g g0) {
        this.k = -1;
        this.l = -1;
        this.j = Collections.emptyList();
        d d0 = new d();
        w w0 = w.j(d0, 1);
        boolean z = false;
        boolean z1 = false;
        while(!z1) {
            try {
                try {
                    int v = ra0.n();
                    switch(v) {
                        case 0: {
                            z1 = true;
                            continue;
                        }
                        case 10: {
                            break;
                        }
                        default: {
                            if(!ra0.q(v, w0)) {
                                z1 = true;
                                continue;
                            }
                            continue;
                        }
                    }
                    if(!z) {
                        this.j = new ArrayList();
                        z = true;
                    }
                    this.j.add(ra0.g(r.r, g0));
                    continue;
                }
                catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                }
                catch(IOException iOException0) {
                    goto label_26;
                }
                invalidProtocolBufferException0.i = this;
                throw invalidProtocolBufferException0;
            label_26:
                InvalidProtocolBufferException invalidProtocolBufferException1 = new InvalidProtocolBufferException(iOException0.getMessage());
                invalidProtocolBufferException1.i = this;
                throw invalidProtocolBufferException1;
            }
            catch(Throwable throwable0) {
            }
            if(z) {
                this.j = Collections.unmodifiableList(this.j);
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
        if(z) {
            this.j = Collections.unmodifiableList(this.j);
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

    public n(m m0) {
        this.k = -1;
        this.l = -1;
        this.i = m0.i;
    }

    @Override  // w3.v
    public final boolean b() {
        int v = this.k;
        if(v == 1) {
            return true;
        }
        if(v == 0) {
            return false;
        }
        for(int v1 = 0; v1 < this.j.size(); ++v1) {
            if(!((r)this.j.get(v1)).b()) {
                this.k = 0;
                return false;
            }
        }
        this.k = 1;
        return true;
    }

    @Override  // w3.b
    public final int c() {
        int v = this.l;
        if(v != -1) {
            return v;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < this.j.size(); ++v1) {
            v2 += w.d(1, ((b)this.j.get(v1)));
        }
        int v3 = this.i.size() + v2;
        this.l = v3;
        return v3;
    }

    @Override  // w3.b
    public final i d() {
        i i0 = new m(0);
        i0.l = Collections.emptyList();
        return i0;
    }

    @Override  // w3.b
    public final i e() {
        i i0 = new m(0);
        i0.l = Collections.emptyList();
        ((m)i0).j(this);
        return i0;
    }

    @Override  // w3.b
    public final void f(w w0) {
        this.c();
        for(int v = 0; v < this.j.size(); ++v) {
            w0.o(1, ((b)this.j.get(v)));
        }
        w0.r(this.i);
    }
}

