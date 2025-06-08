package S3;

import i3.f;

public final class x extends n {
    public final int c;
    public final int d;

    public x() {
        this.c = 1;
        super("must have exactly 2 value parameters", 1);
        this.d = 2;
    }

    public x(int v) {
        this.c = 0;
        super("must have at least " + v + " value parameter" + (v <= 1 ? "" : "s"), 1);
        this.d = v;
    }

    @Override  // S3.e
    public final boolean b(f f0) {
        return this.c == 0 ? f0.z0().size() >= this.d : f0.z0().size() == this.d;
    }
}

