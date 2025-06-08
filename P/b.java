package p;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class b extends k implements Map {
    public a p;

    public b() {
    }

    public b(int v) {
        if(v == 0) {
            this.i = d.a;
            this.j = d.b;
        }
        else {
            this.b(v);
        }
        this.k = 0;
    }

    @Override
    public final Set entrySet() {
        if(this.p == null) {
            this.p = new a(this, 0);
        }
        a a0 = this.p;
        if(((h)a0.b) == null) {
            a0.b = new h(a0, 0);
        }
        return (h)a0.b;
    }

    @Override
    public final Set keySet() {
        if(this.p == null) {
            this.p = new a(this, 0);
        }
        a a0 = this.p;
        if(((h)a0.c) == null) {
            a0.c = new h(a0, 1);
        }
        return (h)a0.c;
    }

    @Override
    public final void putAll(Map map0) {
        this.c(map0.size() + this.k);
        for(Object object0: map0.entrySet()) {
            this.put(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
    }

    @Override
    public final Collection values() {
        if(this.p == null) {
            this.p = new a(this, 0);
        }
        a a0 = this.p;
        if(((j)a0.d) == null) {
            a0.d = new j(a0);
        }
        return (j)a0.d;
    }
}

