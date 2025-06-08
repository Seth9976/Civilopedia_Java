package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

public final class i7 extends zzfti {
    public boolean i;
    public final Object j;

    public i7(Object object0) {
        this.j = object0;
    }

    @Override
    public final boolean hasNext() {
        return !this.i;
    }

    @Override
    public final Object next() {
        if(this.i) {
            throw new NoSuchElementException();
        }
        this.i = true;
        return this.j;
    }
}

