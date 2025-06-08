package com.google.android.gms.internal.ads;

import java.util.ListIterator;

public final class ca implements ListIterator {
    public final ListIterator i;

    public ca(zzgnp zzgnp0, int v) {
        this.i = zzgnp0.i.listIterator(v);
    }

    @Override
    public final void add(Object object0) {
        String s = (String)object0;
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        return this.i.hasNext();
    }

    @Override
    public final boolean hasPrevious() {
        return this.i.hasPrevious();
    }

    @Override
    public final Object next() {
        return (String)this.i.next();
    }

    @Override
    public final int nextIndex() {
        return this.i.nextIndex();
    }

    @Override
    public final Object previous() {
        return (String)this.i.previous();
    }

    @Override
    public final int previousIndex() {
        return this.i.previousIndex();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void set(Object object0) {
        String s = (String)object0;
        throw new UnsupportedOperationException();
    }
}

