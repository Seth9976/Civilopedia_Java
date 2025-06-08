package s1;

import N1.b;
import java.util.Collections;

public final class f implements b {
    public final int a;

    public f(int v) {
        this.a = v;
        super();
    }

    @Override  // N1.b
    public final Object get() {
        return this.a != 0 ? null : Collections.emptySet();
    }
}

