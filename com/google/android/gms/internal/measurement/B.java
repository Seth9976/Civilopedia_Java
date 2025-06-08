package com.google.android.gms.internal.measurement;

import java.util.Iterator;

public final class b implements Iterator {
    public final Iterator i;

    public b(Iterator iterator0) {
        this.i = iterator0;
    }

    @Override
    public final boolean hasNext() {
        return this.i.hasNext();
    }

    @Override
    public final Object next() {
        Object object0 = this.i.next();
        return new zzat(((String)object0));
    }
}

