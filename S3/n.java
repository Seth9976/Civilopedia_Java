package S3;

import i3.f;
import o1.a;

public abstract class n implements e {
    public final int a;
    public final String b;

    public n(String s, int v) {
        this.a = v;
        this.b = s;
        super();
    }

    @Override  // S3.e
    public final String a(f f0) {
        return a.E(this, f0);
    }

    @Override  // S3.e
    public final String getDescription() {
        return this.b;
    }
}

