package c2;

import Z1.a;
import Z1.e;

public final class d {
    public final float a;
    public final boolean b;
    public final a c;
    public final e d;
    public final boolean e;
    public final boolean f;
    public final Float g;
    public final Float h;
    public final boolean i;
    public final boolean j;
    public static final int k;

    public d(float f, boolean z, a a0, e e0, boolean z1, boolean z2, Float float0, Float float1, boolean z3) {
        this.a = f;
        this.b = z;
        this.c = a0;
        this.d = e0;
        this.e = z1;
        this.f = z2;
        this.g = float0;
        this.h = float1;
        this.i = z3;
        if(a0 != null && e0 != null) {
            throw new IllegalStateException("Can only use either pan or scaledPan");
        }
        this.j = a0 != null || e0 != null;
    }
}

