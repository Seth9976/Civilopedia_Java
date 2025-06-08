package androidx.fragment.app;

public final class u {
    public final boolean a;
    public final a b;
    public int c;

    public u(a a0, boolean z) {
        this.a = z;
        this.b = a0;
    }

    public final void a() {
        int v = this.c <= 0 ? 0 : 1;
        a a0 = this.b;
        v v1 = a0.q;
        int v2 = v1.n.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            h h0 = (h)v1.n.get(v3);
            h0.j(null);
            if(v != 0 && (h0.S == null ? false : h0.S.o)) {
                h0.startPostponedEnterTransition();
            }
        }
        v1.g(a0, this.a, ((boolean)(v ^ 1)), true);
    }
}

