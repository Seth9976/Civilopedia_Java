package M3;

public enum a0 {
    INVARIANT("", true),
    IN_VARIANCE("in", false),
    OUT_VARIANCE("out", true);

    public final String i;
    public final boolean j;

    public a0(String s1, boolean z) {
        this.i = s1;
        this.j = z;
    }

    @Override
    public final String toString() {
        return this.i;
    }
}

