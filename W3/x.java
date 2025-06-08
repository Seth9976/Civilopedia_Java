package w3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public final class x implements Iterator {
    public final Stack i;
    public u j;

    public x(e e0) {
        this.i = new Stack();
        while(e0 instanceof z) {
            this.i.push(((z)e0));
            e0 = ((z)e0).k;
        }
        this.j = (u)e0;
    }

    public final u a() {
        u u1;
        u u0 = this.j;
        if(u0 == null) {
            throw new NoSuchElementException();
        }
        do {
            Stack stack0 = this.i;
            if(stack0.isEmpty()) {
                u1 = null;
                break;
            }
            e e0;
            for(e0 = ((z)stack0.pop()).l; e0 instanceof z; e0 = ((z)e0).k) {
                stack0.push(((z)e0));
            }
            u1 = (u)e0;
        }
        while(u1.j.length == 0);
        this.j = u1;
        return u0;
    }

    @Override
    public final boolean hasNext() {
        return this.j != null;
    }

    @Override
    public final Object next() {
        return this.a();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

