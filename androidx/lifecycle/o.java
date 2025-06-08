package androidx.lifecycle;

public final class o {
    public h a;
    public l b;

    public final void a(n n0, g g0) {
        h h0 = g0.a();
        this.a = h0.compareTo(this.a) >= 0 ? this.a : h0;
        this.b.a(n0, g0);
        this.a = h0;
    }
}

