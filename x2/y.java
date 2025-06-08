package X2;

public enum y {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;

    public static final P i;

    static {
        y.i = new P(5);
    }
}

