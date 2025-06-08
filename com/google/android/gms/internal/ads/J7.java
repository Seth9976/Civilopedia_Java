package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

public enum j7 implements Iterator {
    INSTANCE;

    @Override
    public final boolean hasNext() {
        return false;
    }

    @Override
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        zzfou.zzi(false, "no calls to next() since the last call to remove()");
    }
}

