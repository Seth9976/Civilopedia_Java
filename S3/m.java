package S3;

import i3.f;

public final class m extends n {
    public final int c;
    public static final m d;
    public static final m e;

    static {
        m.d = new m("must be a member function", 0);
        m.e = new m("must be a member or an extension function", 1);
    }

    public m(String s, int v) {
        this.c = v;
        super(s, 0);
    }

    @Override  // S3.e
    public final boolean b(f f0) {
        return this.c == 0 ? f0.r != null : f0.r != null || f0.q != null;
    }
}

