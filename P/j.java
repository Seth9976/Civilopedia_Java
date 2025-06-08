package p;

import I3.v;
import java.util.Collection;
import java.util.Iterator;

public final class j implements Collection {
    public final v i;

    public j(v v0) {
        this.i = v0;
    }

    @Override
    public final boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        this.i.a();
    }

    @Override
    public final boolean contains(Object object0) {
        return this.i.f(object0) >= 0;
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        for(Object object0: collection0) {
            if(!this.contains(object0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @Override
    public final boolean isEmpty() {
        return this.i.d() == 0;
    }

    @Override
    public final Iterator iterator() {
        return new g(this.i, 1);
    }

    @Override
    public final boolean remove(Object object0) {
        v v0 = this.i;
        int v1 = v0.f(object0);
        if(v1 >= 0) {
            v0.h(v1);
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        v v0 = this.i;
        int v1 = v0.d();
        boolean z = false;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(collection0.contains(v0.b(v2, 1))) {
                v0.h(v2);
                --v2;
                --v1;
                z = true;
            }
        }
        return z;
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        v v0 = this.i;
        int v1 = v0.d();
        boolean z = false;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(!collection0.contains(v0.b(v2, 1))) {
                v0.h(v2);
                --v2;
                --v1;
                z = true;
            }
        }
        return z;
    }

    @Override
    public final int size() {
        return this.i.d();
    }

    @Override
    public final Object[] toArray() {
        v v0 = this.i;
        int v1 = v0.d();
        Object[] arr_object = new Object[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_object[v2] = v0.b(v2, 1);
        }
        return arr_object;
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        return this.i.m(1, arr_object);
    }
}

