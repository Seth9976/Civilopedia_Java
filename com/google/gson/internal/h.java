package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

public final class h extends AbstractSet {
    public final int i;
    public final j j;

    public h(j j0, int v) {
        this.i = v;
        this.j = j0;
        super();
    }

    @Override
    public final void clear() {
        if(this.i != 0) {
            this.j.clear();
            return;
        }
        this.j.clear();
    }

    @Override
    public final boolean contains(Object object0) {
        if(this.i != 0) {
            return this.j.containsKey(object0);
        }
        if(object0 instanceof Map.Entry) {
            j j0 = this.j;
            Object object1 = ((Map.Entry)object0).getKey();
            i i0 = null;
            i i1 = null;
            if(object1 != null) {
                try {
                    i1 = j0.b(object1, false);
                }
                catch(ClassCastException unused_ex) {
                }
            }
            if(i1 != null) {
                Object object2 = i1.o;
                Object object3 = ((Map.Entry)object0).getValue();
                if(object2 == object3 || object2 != null && object2.equals(object3)) {
                    i0 = i1;
                }
            }
            return i0 != null;
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        return this.i == 0 ? new g(this.j, 0) : new g(this.j, 1);
    }

    @Override
    public final boolean remove(Object object0) {
        boolean z = false;
        if(this.i != 0) {
            j j0 = this.j;
            i i0 = null;
            if(object0 != null) {
                try {
                    i0 = j0.b(object0, false);
                }
                catch(ClassCastException unused_ex) {
                }
            }
            if(i0 != null) {
                j0.d(i0, true);
            }
            return i0 != null;
        }
        if(object0 instanceof Map.Entry) {
            j j1 = this.j;
            Object object1 = ((Map.Entry)object0).getKey();
            i i1 = null;
            i i2 = null;
            if(object1 != null) {
                try {
                    i2 = j1.b(object1, false);
                }
                catch(ClassCastException unused_ex) {
                }
            }
            if(i2 != null) {
                Object object2 = i2.o;
                Object object3 = ((Map.Entry)object0).getValue();
                if(object2 == object3 || object2 != null && object2.equals(object3)) {
                    i1 = i2;
                }
            }
            if(i1 != null) {
                z = true;
                j1.d(i1, true);
            }
        }
        return z;
    }

    @Override
    public final int size() {
        return this.j.k;
    }
}

