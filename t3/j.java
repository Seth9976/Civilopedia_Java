package t3;

import com.google.android.gms.internal.ads.Ra;
import com.google.android.gms.internal.ads.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import q3.a;
import w3.b;
import w3.d;
import w3.e;
import w3.g;
import w3.o;

public final class j extends o {
    public final e i;
    public List j;
    public List k;
    public int l;
    public byte m;
    public int n;
    public static final j o;
    public static final a p;

    static {
        j.p = new a(27);
        j j0 = new j();
        j.o = j0;
        j0.j = Collections.emptyList();
        j0.k = Collections.emptyList();
    }

    public j() {
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.i = e.i;
    }

    public j(Ra ra0, g g0) {
        int v2;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.j = Collections.emptyList();
        this.k = Collections.emptyList();
        d d0 = new d();
        w w0 = w.j(d0, 1);
        int v = 0;
        boolean z = false;
        while(!z) {
            try {
                try {
                    int v1 = ra0.n();
                alab1:
                    switch(v1) {
                        case 0: {
                        label_14:
                            z = true;
                            continue;
                        }
                        case 10: {
                            if((v & 1) != 1) {
                                this.j = new ArrayList();
                                v |= 1;
                            }
                            this.j.add(ra0.g(i.v, g0));
                            continue;
                        }
                        case 40: {
                            if((v & 2) != 2) {
                                this.k = new ArrayList();
                                v |= 2;
                            }
                            this.k.add(ra0.k());
                            continue;
                        }
                        case 42: {
                            v2 = ra0.d(ra0.k());
                            if((v & 2) != 2 && ra0.b() > 0) {
                                this.k = new ArrayList();
                                v |= 2;
                            }
                            while(true) {
                                if(ra0.b() <= 0) {
                                    break alab1;
                                }
                                this.k.add(ra0.k());
                            }
                        }
                        default: {
                            if(!ra0.q(v1, w0)) {
                                goto label_14;
                            }
                            continue;
                        }
                    }
                    ra0.c(v2);
                    continue;
                }
                catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                }
                catch(IOException iOException0) {
                    goto label_42;
                }
                invalidProtocolBufferException0.i = this;
                throw invalidProtocolBufferException0;
            label_42:
                InvalidProtocolBufferException invalidProtocolBufferException1 = new InvalidProtocolBufferException(iOException0.getMessage());
                invalidProtocolBufferException1.i = this;
                throw invalidProtocolBufferException1;
            }
            catch(Throwable throwable0) {
            }
            if((v & 1) == 1) {
                this.j = Collections.unmodifiableList(this.j);
            }
            if((v & 2) == 2) {
                this.k = Collections.unmodifiableList(this.k);
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
        if((v & 1) == 1) {
            this.j = Collections.unmodifiableList(this.j);
        }
        if((v & 2) == 2) {
            this.k = Collections.unmodifiableList(this.k);
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

    public j(f f0) {
        this.l = -1;
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
        this.m = 1;
        return true;
    }

    @Override  // w3.b
    public final int c() {
        int v = this.n;
        if(v != -1) {
            return v;
        }
        int v3 = 0;
        for(int v2 = 0; v2 < this.j.size(); ++v2) {
            v3 += w.d(1, ((b)this.j.get(v2)));
        }
        int v4 = 0;
        for(int v1 = 0; v1 < this.k.size(); ++v1) {
            v4 += w.c(((int)(((Integer)this.k.get(v1)))));
        }
        int v5 = this.k.isEmpty() ? v3 + v4 : v3 + v4 + 1 + w.c(v4);
        this.l = v4;
        int v6 = this.i.size() + v5;
        this.n = v6;
        return v6;
    }

    @Override  // w3.b
    public final w3.i d() {
        return f.g();
    }

    @Override  // w3.b
    public final w3.i e() {
        w3.i i0 = f.g();
        ((f)i0).h(this);
        return i0;
    }

    @Override  // w3.b
    public final void f(w w0) {
        this.c();
        for(int v1 = 0; v1 < this.j.size(); ++v1) {
            w0.o(1, ((b)this.j.get(v1)));
        }
        if(this.k.size() > 0) {
            w0.v(42);
            w0.v(this.l);
        }
        for(int v = 0; v < this.k.size(); ++v) {
            w0.n(((int)(((Integer)this.k.get(v)))));
        }
        w0.r(this.i);
    }
}

