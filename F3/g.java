package F3;

import J2.j;
import X2.c;
import java.util.ArrayList;
import y3.k;
import y3.l;

public final class g extends l {
    public final ArrayList c;
    public final h d;

    public g(ArrayList arrayList0, h h0) {
        this.c = arrayList0;
        this.d = h0;
    }

    @Override  // y3.l
    public final void b(c c0) {
        j.f(c0, "fakeOverride");
        k.r(c0, null);
        this.c.add(c0);
    }

    @Override  // y3.l
    public final void d(c c0, c c1) {
        j.f(c1, "fromCurrent");
        throw new IllegalStateException(("Conflict in scope of " + this.d.b + ": " + c0 + " vs " + c1).toString());
    }
}

