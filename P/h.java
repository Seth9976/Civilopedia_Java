package p;

import I3.v;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class h implements Set {
    public final int i;
    public final v j;

    public h(v v0, int v1) {
        this.i = v1;
        this.j = v0;
        super();
    }

    @Override
    public final boolean add(Object object0) {
        if(this.i != 0) {
            throw new UnsupportedOperationException();
        }
        Map.Entry map$Entry0 = (Map.Entry)object0;
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection collection0) {
        if(this.i != 0) {
            throw new UnsupportedOperationException();
        }
        v v0 = this.j;
        int v1 = v0.d();
        for(Object object0: collection0) {
            v0.g(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
        return v1 != v0.d();
    }

    @Override
    public final void clear() {
        if(this.i != 0) {
            this.j.a();
            return;
        }
        this.j.a();
    }

    @Override
    public final boolean contains(Object object0) {
        if(this.i != 0) {
            return this.j.e(object0) >= 0;
        }
        if(object0 instanceof Map.Entry) {
            Object object1 = ((Map.Entry)object0).getKey();
            v v0 = this.j;
            int v1 = v0.e(object1);
            if(v1 >= 0) {
                Object object2 = v0.b(v1, 1);
                Object object3 = ((Map.Entry)object0).getValue();
                return object2 == object3 || object2 != null && object2.equals(object3);
            }
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        if(this.i != 0) {
            Map map0 = this.j.c();
            for(Object object0: collection0) {
                if(!map0.containsKey(object0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }
        for(Object object1: collection0) {
            if(!this.contains(object1)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @Override
    public final boolean equals(Object object0) {
        return v.k(this, object0);
    }

    @Override
    public final int hashCode() {
        if(this.i != 0) {
            v v0 = this.j;
            int v1 = v0.d() - 1;
            int v2 = 0;
            while(v1 >= 0) {
                Object object0 = v0.b(v1, 0);
                v2 += (object0 == null ? 0 : object0.hashCode());
                --v1;
            }
            return v2;
        }
        v v3 = this.j;
        int v4 = v3.d() - 1;
        int v5 = 0;
        while(v4 >= 0) {
            Object object1 = v3.b(v4, 0);
            Object object2 = v3.b(v4, 1);
            v5 += (object1 == null ? 0 : object1.hashCode()) ^ (object2 == null ? 0 : object2.hashCode());
            --v4;
        }
        return v5;
    }

    @Override
    public final boolean isEmpty() {
        return this.j.d() == 0;
    }

    @Override
    public final Iterator iterator() {
        return this.i != 0 ? new g(this.j, 0) : new i(this.j);
    }

    @Override
    public final boolean remove(Object object0) {
        if(this.i == 0) {
            throw new UnsupportedOperationException();
        }
        v v0 = this.j;
        int v1 = v0.e(object0);
        if(v1 >= 0) {
            v0.h(v1);
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        if(this.i == 0) {
            throw new UnsupportedOperationException();
        }
        Map map0 = this.j.c();
        int v = map0.size();
        for(Object object0: collection0) {
            map0.remove(object0);
        }
        return v != map0.size();
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        if(this.i == 0) {
            throw new UnsupportedOperationException();
        }
        return v.l(this.j.c(), collection0);
    }

    @Override
    public final int size() {
        return this.j.d();
    }

    @Override
    public final Object[] toArray() {
        if(this.i == 0) {
            throw new UnsupportedOperationException();
        }
        v v0 = this.j;
        int v1 = v0.d();
        Object[] arr_object = new Object[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_object[v2] = v0.b(v2, 0);
        }
        return arr_object;
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        if(this.i == 0) {
            throw new UnsupportedOperationException();
        }
        return this.j.m(0, arr_object);
    }
}

