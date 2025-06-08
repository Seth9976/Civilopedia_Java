package S3;

import I2.b;
import J2.j;
import J2.l;
import U2.h;
import i3.f;
import o1.a;

public abstract class w implements e {
    public final l a;
    public final String b;

    public w(String s, b b0) {
        this.a = (l)b0;
        this.b = "must return " + s;
    }

    @Override  // S3.e
    public final String a(f f0) {
        return a.E(this, f0);
    }

    @Override  // S3.e
    public final boolean b(f f0) {
        M3.w w0 = f0.o;
        h h0 = C3.e.e(f0);
        return j.a(w0, ((b)this.a).b(h0));
    }

    @Override  // S3.e
    public final String getDescription() {
        return this.b;
    }
}

