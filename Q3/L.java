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

public final class l extends w3.l {
    public final e j;
    public int k;
    public int l;
    public List m;
    public List n;
    public byte o;
    public int p;
    public static final l q;
    public static final a r;

    static {
        l.r = new a(4);
        l l0 = new l();
        l.q = l0;
        l0.l = 6;
        l0.m = Collections.emptyList();
        l0.n = Collections.emptyList();
    }

    public l() {
        this.o = -1;
        this.p = -1;
        this.j = e.i;
    }

    public l(Ra ra0, g g0) {
        this.o = -1;
        this.p = -1;
        this.l = 6;
        this.m = Collections.emptyList();
        this.n = Collections.emptyList();
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
                        label_14:
                            z = true;
                            continue;
                        }
                        case 8: {
                            this.k |= 1;
                            this.l = ra0.k();
                            continue;
                        }
                        case 18: {
                            if((v & 2) != 2) {
                                this.m = new ArrayList();
                                v |= 2;
                            }
                            this.m.add(ra0.g(Z.u, g0));
                            continue;
                        }
                        case 0xF8: {
                            if((v & 4) != 4) {
                                this.n = new ArrayList();
                                v |= 4;
                            }
                            this.n.add(ra0.k());
                            continue;
                        }
                        case 0xFA: {
                            int v2 = ra0.d(ra0.k());
                            if((v & 4) != 4 && ra0.b() > 0) {
                                this.n = new ArrayList();
                                v |= 4;
                            }
                            while(ra0.b() > 0) {
                                this.n.add(ra0.k());
                            }
                            ra0.c(v2);
                            continue;
                        }
                        default: {
                            if(!this.n(ra0, w0, g0, v1)) {
                                goto label_14;
                            }
                            continue;
                        }
                    }
                }
                catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                }
                catch(IOException iOException0) {
                    goto label_45;
                }
                invalidProtocolBufferException0.i = this;
                throw invalidProtocolBufferException0;
            label_45:
                InvalidProtocolBufferException invalidProtocolBufferException1 = new InvalidProtocolBufferException(iOException0.getMessage());
                invalidProtocolBufferException1.i = this;
                throw invalidProtocolBufferException1;
            }
            catch(Throwable throwable0) {
            }
            if((v & 2) == 2) {
                this.m = Collections.unmodifiableList(this.m);
            }
            if((v & 4) == 4) {
                this.n = Collections.unmodifiableList(this.n);
            }
            try {
                w0.i();
                goto label_57;
            }
            catch(IOException unused_ex) {
                goto label_57;
            }
            catch(Throwable throwable1) {
            }
            this.j = d0.c();
            throw throwable1;
        label_57:
            this.j = d0.c();
            this.m();
            throw throwable0;
        }
        if((v & 2) == 2) {
            this.m = Collections.unmodifiableList(this.m);
        }
        if((v & 4) == 4) {
            this.n = Collections.unmodifiableList(this.n);
        }
        try {
            w0.i();
            goto label_70;
        }
        catch(IOException unused_ex) {
            goto label_70;
        }
        catch(Throwable throwable2) {
        }
        this.j = d0.c();
        throw throwable2;
    label_70:
        this.j = d0.c();
        this.m();
    }

    public l(k k0) {
        super(k0);
        this.o = -1;
        this.p = -1;
        this.j = k0.i;
    }

    @Override  // w3.v
    public final b a() {
        return l.q;
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
        for(int v1 = 0; v1 < this.m.size(); ++v1) {
            if(!((Z)this.m.get(v1)).b()) {
                this.o = 0;
                return false;
            }
        }
        if(!this.i()) {
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
        int v2 = (this.k & 1) == 1 ? w.b(1, this.l) : 0;
        for(int v3 = 0; v3 < this.m.size(); ++v3) {
            v2 += w.d(2, ((b)this.m.get(v3)));
        }
        int v4 = 0;
        for(int v = 0; v < this.n.size(); ++v) {
            v4 += w.c(((int)(((Integer)this.n.get(v)))));
        }
        int v5 = this.n.size();
        int v6 = this.j();
        int v7 = this.j.size() + (v6 + (v5 * 2 + (v2 + v4)));
        this.p = v7;
        return v7;
    }

    @Override  // w3.b
    public final i d() {
        return k.h();
    }

    @Override  // w3.b
    public final i e() {
        i i0 = k.h();
        ((k)i0).i(this);
        return i0;
    }

    @Override  // w3.b
    public final void f(w w0) {
        this.c();
        w3.k k0 = new w3.k(this);
        if((this.k & 1) == 1) {
            w0.m(1, this.l);
        }
        for(int v1 = 0; v1 < this.m.size(); ++v1) {
            w0.o(2, ((b)this.m.get(v1)));
        }
        for(int v = 0; v < this.n.size(); ++v) {
            w0.m(0x1F, ((int)(((Integer)this.n.get(v)))));
        }
        k0.m0(19000, w0);
        w0.r(this.j);
    }
}

