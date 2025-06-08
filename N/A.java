package n;

import java.util.HashMap;

public final class a extends f {
    public HashMap m;

    @Override  // n.f
    public final c a(Object object0) {
        return (c)this.m.get(object0);
    }

    @Override  // n.f
    public final Object h(Object object0) {
        Object object1 = super.h(object0);
        this.m.remove(object0);
        return object1;
    }
}

