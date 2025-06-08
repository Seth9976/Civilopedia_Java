package M3;

public final class z extends o {
    public final int k;

    public z(A a0, int v) {
        this.k = v;
        super(a0);
    }

    @Override  // M3.n
    public final boolean I0() {
        return this.k != 0;
    }

    @Override  // M3.n
    public final n S0(A a0) {
        return this.k == 0 ? new z(a0, 0) : new z(a0, 1);
    }
}

