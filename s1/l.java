package s1;

import N1.b;

public final class l implements b {
    public volatile Object a;
    public volatile b b;
    public static final Object c;

    static {
        l.c = new Object();
    }

    public l(b b0) {
        this.a = l.c;
        this.b = b0;
    }

    @Override  // N1.b
    public final Object get() {
        Object object0 = this.a;
        Object object1 = l.c;
        if(object0 == object1) {
            synchronized(this) {
                object0 = this.a;
                if(object0 == object1) {
                    object0 = this.b.get();
                    this.a = object0;
                    this.b = null;
                }
            }
        }
        return object0;
    }
}

