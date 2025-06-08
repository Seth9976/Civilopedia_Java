package com.google.android.gms.internal.ads;

import java.util.Iterator;

public final class da implements Iterator {
    public final Iterator i;

    public da(zzgnp zzgnp0) {
        this.i = zzgnp0.i.iterator();
    }

    @Override
    public final boolean hasNext() {
        return this.i.hasNext();
    }

    @Override
    public final Object next() {
        return this.i.next();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

