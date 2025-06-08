package q3;

import com.google.android.gms.internal.ads.Ra;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import w3.b;
import w3.g;
import w3.i;
import w3.j;
import w3.o;

public final class x extends j {
    public int l;
    public int m;
    public int n;
    public int o;
    public Q p;
    public int q;
    public List r;
    public Q s;
    public int t;
    public List u;
    public List v;
    public List w;
    public X x;
    public List y;
    public n z;

    @Override  // w3.i
    public final b c() {
        b b0 = this.g();
        if(!((y)b0).b()) {
            throw new UninitializedMessageException();
        }
        return b0;
    }

    @Override
    public final Object clone() {
        x x0 = x.h();
        x0.i(this.g());
        return x0;
    }

    @Override  // w3.i
    public final i d(Ra ra0, g g0) {
        y y1;
        y y0;
        try {
            try {
                y0 = null;
                y.D.getClass();
                y1 = new y(ra0, g0);
                goto label_14;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                y y2 = (y)invalidProtocolBufferException0.i;
                try {
                    throw invalidProtocolBufferException0;
                }
                catch(Throwable throwable0) {
                    y0 = y2;
                }
            }
        }
        catch(Throwable throwable0) {
        }
        if(y0 != null) {
            this.i(y0);
        }
        throw throwable0;
    label_14:
        this.i(y1);
        return this;
    }

    @Override  // w3.i
    public final i e(o o0) {
        this.i(((y)o0));
        return this;
    }

    public final y g() {
        y y0 = new y(this);
        int v = this.l;
        int v1 = (v & 1) == 1 ? 1 : 0;
        y0.l = this.m;
        if((v & 2) == 2) {
            v1 |= 2;
        }
        y0.m = this.n;
        if((v & 4) == 4) {
            v1 |= 4;
        }
        y0.n = this.o;
        if((v & 8) == 8) {
            v1 |= 8;
        }
        y0.o = this.p;
        if((v & 16) == 16) {
            v1 |= 16;
        }
        y0.p = this.q;
        if((v & 0x20) == 0x20) {
            this.r = Collections.unmodifiableList(this.r);
            this.l &= -33;
        }
        y0.q = this.r;
        if((v & 0x40) == 0x40) {
            v1 |= 0x20;
        }
        y0.r = this.s;
        if((v & 0x80) == 0x80) {
            v1 |= 0x40;
        }
        y0.s = this.t;
        if((this.l & 0x100) == 0x100) {
            this.u = Collections.unmodifiableList(this.u);
            this.l &= 0xFFFFFEFF;
        }
        y0.t = this.u;
        if((this.l & 0x200) == 0x200) {
            this.v = Collections.unmodifiableList(this.v);
            this.l &= 0xFFFFFDFF;
        }
        y0.u = this.v;
        if((this.l & 0x400) == 0x400) {
            this.w = Collections.unmodifiableList(this.w);
            this.l &= 0xFFFFFBFF;
        }
        y0.w = this.w;
        if((v & 0x800) == 0x800) {
            v1 |= 0x80;
        }
        y0.x = this.x;
        if((this.l & 0x1000) == 0x1000) {
            this.y = Collections.unmodifiableList(this.y);
            this.l &= 0xFFFFEFFF;
        }
        y0.y = this.y;
        if((v & 0x2000) == 0x2000) {
            v1 |= 0x100;
        }
        y0.z = this.z;
        y0.k = v1;
        return y0;
    }

    public static x h() {
        x x0 = new x();  // 初始化器: Lw3/j;-><init>()V
        x0.m = 6;
        x0.n = 6;
        x0.p = Q.B;
        x0.r = Collections.emptyList();
        x0.s = Q.B;
        x0.u = Collections.emptyList();
        x0.v = Collections.emptyList();
        x0.w = Collections.emptyList();
        x0.x = X.o;
        x0.y = Collections.emptyList();
        x0.z = n.m;
        return x0;
    }

    public final void i(y y0) {
        if(y0 == y.C) {
            return;
        }
        int v = y0.k;
        if((v & 1) == 1) {
            int v1 = y0.l;
            this.l |= 1;
            this.m = v1;
        }
        if((v & 2) == 2) {
            this.l |= 2;
            this.n = y0.m;
        }
        if((v & 4) == 4) {
            this.l |= 4;
            this.o = y0.n;
        }
        if((v & 8) == 8) {
            Q q0 = y0.o;
            if((this.l & 8) == 8) {
                Q q1 = this.p;
                if(q1 == Q.B) {
                    this.p = q0;
                }
                else {
                    P p0 = Q.r(q1);
                    p0.i(q0);
                    this.p = p0.g();
                }
            }
            else {
                this.p = q0;
            }
            this.l |= 8;
        }
        if((y0.k & 16) == 16) {
            this.l |= 16;
            this.q = y0.p;
        }
        if(!y0.q.isEmpty()) {
            if(this.r.isEmpty()) {
                this.r = y0.q;
                this.l &= -33;
            }
            else {
                if((this.l & 0x20) != 0x20) {
                    this.r = new ArrayList(this.r);
                    this.l |= 0x20;
                }
                this.r.addAll(y0.q);
            }
        }
        if(y0.p()) {
            Q q2 = y0.r;
            if((this.l & 0x40) == 0x40) {
                Q q3 = this.s;
                if(q3 == Q.B) {
                    this.s = q2;
                }
                else {
                    P p1 = Q.r(q3);
                    p1.i(q2);
                    this.s = p1.g();
                }
            }
            else {
                this.s = q2;
            }
            this.l |= 0x40;
        }
        if((y0.k & 0x40) == 0x40) {
            this.l |= 0x80;
            this.t = y0.s;
        }
        if(!y0.t.isEmpty()) {
            if(this.u.isEmpty()) {
                this.u = y0.t;
                this.l &= 0xFFFFFEFF;
            }
            else {
                if((this.l & 0x100) != 0x100) {
                    this.u = new ArrayList(this.u);
                    this.l |= 0x100;
                }
                this.u.addAll(y0.t);
            }
        }
        if(!y0.u.isEmpty()) {
            if(this.v.isEmpty()) {
                this.v = y0.u;
                this.l &= 0xFFFFFDFF;
            }
            else {
                if((this.l & 0x200) != 0x200) {
                    this.v = new ArrayList(this.v);
                    this.l |= 0x200;
                }
                this.v.addAll(y0.u);
            }
        }
        if(!y0.w.isEmpty()) {
            if(this.w.isEmpty()) {
                this.w = y0.w;
                this.l &= 0xFFFFFBFF;
            }
            else {
                if((this.l & 0x400) != 0x400) {
                    this.w = new ArrayList(this.w);
                    this.l |= 0x400;
                }
                this.w.addAll(y0.w);
            }
        }
        if((y0.k & 0x80) == 0x80) {
            X x0 = y0.x;
            if((this.l & 0x800) == 0x800) {
                X x1 = this.x;
                if(x1 == X.o) {
                    this.x = x0;
                }
                else {
                    f f0 = X.i(x1);
                    f0.l(x0);
                    this.x = f0.h();
                }
            }
            else {
                this.x = x0;
            }
            this.l |= 0x800;
        }
        if(!y0.y.isEmpty()) {
            if(this.y.isEmpty()) {
                this.y = y0.y;
                this.l &= 0xFFFFEFFF;
            }
            else {
                if((this.l & 0x1000) != 0x1000) {
                    this.y = new ArrayList(this.y);
                    this.l |= 0x1000;
                }
                this.y.addAll(y0.y);
            }
        }
        if((y0.k & 0x100) == 0x100) {
            n n0 = y0.z;
            if((this.l & 0x2000) == 0x2000) {
                n n1 = this.z;
                if(n1 == n.m) {
                    this.z = n0;
                }
                else {
                    m m0 = new m(0);
                    m0.l = Collections.emptyList();
                    m0.j(n1);
                    m0.j(n0);
                    this.z = m0.f();
                }
            }
            else {
                this.z = n0;
            }
            this.l |= 0x2000;
        }
        this.f(y0);
        this.i = this.i.h(y0.j);
    }
}

