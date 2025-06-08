package P3;

public enum h {
    IN("in"),
    OUT("out"),
    INV("");

    public final String i;

    public h(String s1) {
        this.i = s1;
    }

    @Override
    public final String toString() {
        return this.i;
    }
}

