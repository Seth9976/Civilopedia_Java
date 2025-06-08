package com.google.gson.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class g implements Iterator {
    public i i;
    public i j;
    public int k;
    public final j l;
    public final int m;

    public g(j j0, int v) {
        this.m = v;
        super();
        this.l = j0;
        this.i = j0.m.l;
        this.j = null;
        this.k = j0.l;
    }

    public final Object a() {
        return this.b();
    }

    public final i b() {
        i i0 = this.i;
        j j0 = this.l;
        if(i0 == j0.m) {
            throw new NoSuchElementException();
        }
        if(j0.l != this.k) {
            throw new ConcurrentModificationException();
        }
        this.i = i0.l;
        this.j = i0;
        return i0;
    }

    @Override
    public final boolean hasNext() {
        return this.i != this.l.m;
    }

    @Override
    public Object next() {
        return this.m == 1 ? this.b().n : this.a();
    }

    @Override
    public final void remove() {
        i i0 = this.j;
        if(i0 == null) {
            throw new IllegalStateException();
        }
        this.l.d(i0, true);
        this.j = null;
        this.k = this.l.l;
    }
}

