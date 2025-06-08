package s1;

import L1.a;
import L1.b;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import o1.d;
import q1.c;

public final class k implements a, b {
    public final HashMap a;
    public ArrayDeque b;

    public k(d d0) {
        this.a = new HashMap();
        this.b = new ArrayDeque();
    }

    public final void a() {
        Class class0 = o1.a.class;
        c c0 = c.i;
        q1.d d0 = q1.d.a;
        synchronized(this) {
            if(!this.a.containsKey(class0)) {
                ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
                this.a.put(class0, concurrentHashMap0);
            }
            ((ConcurrentHashMap)this.a.get(class0)).put(d0, c0);
        }
    }
}

