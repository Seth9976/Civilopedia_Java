package s1;

import N1.b;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class m implements b {
    public volatile Set a;
    public volatile Set b;

    public final void a() {
        synchronized(this) {
            for(Object object0: this.a) {
                this.b.add(((b)object0).get());
            }
            this.a = null;
        }
    }

    @Override  // N1.b
    public final Object get() {
        if(this.b == null) {
            synchronized(this) {
                if(this.b == null) {
                    this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                    this.a();
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }
}

