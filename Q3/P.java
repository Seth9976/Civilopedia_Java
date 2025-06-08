package q3;

public enum p implements w3.p {
    RETURNS_CONSTANT(0),
    CALLS(1),
    RETURNS_NOT_NULL(2);

    public final int i;

    public p(int v1) {
        this.i = v1;
    }

    @Override  // w3.p
    public final int a() {
        return this.i;
    }
}

