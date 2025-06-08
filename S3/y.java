package S3;

import i3.f;

public final class y extends n {
    public final int c;
    public static final y d;
    public static final y e;

    static {
        y.d = new y("must have no value parameters", 0);
        y.e = new y("must have a single value parameter", 1);
    }

    public y(String s, int v) {
        this.c = v;
        super(s, 1);
    }

    @Override  // S3.e
    public final boolean b(f f0) {
        return this.c == 0 ? f0.z0().isEmpty() : f0.z0().size() == 1;
    }
}

