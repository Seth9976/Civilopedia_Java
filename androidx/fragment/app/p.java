package androidx.fragment.app;

public final class p extends k {
    public final v b;

    public p(v v0) {
        this.b = v0;
    }

    @Override  // androidx.fragment.app.k
    public final h a(ClassLoader classLoader0, String s) {
        return h.instantiate(this.b.x.k, s, null);
    }
}

