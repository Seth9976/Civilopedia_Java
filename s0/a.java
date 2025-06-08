package s0;

public final class a implements v2.a {
    public volatile b i;
    public volatile Object j;
    public static final Object k;

    static {
        a.k = new Object();
    }

    public static v2.a a(b b0) {
        if(b0 instanceof a) {
            return b0;
        }
        v2.a a0 = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        a0.j = a.k;
        a0.i = b0;
        return a0;
    }

    @Override  // v2.a
    public final Object get() {
        Object object0 = this.j;
        Object object1 = a.k;
        if(object0 == object1) {
            synchronized(this) {
                object0 = this.j;
                if(object0 == object1) {
                    object0 = this.i.get();
                    Object object2 = this.j;
                    if(object2 != object1 && object2 != object0) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + object2 + " & " + object0 + ". This is likely due to a circular dependency.");
                    }
                    this.j = object0;
                    this.i = null;
                }
            }
        }
        return object0;
    }
}

