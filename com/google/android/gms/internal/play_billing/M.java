package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

public final class m extends zzdw {
    public final Object i;
    public boolean j;

    public m(Object object0) {
        this.i = object0;
    }

    @Override
    public final boolean hasNext() {
        return !this.j;
    }

    @Override
    public final Object next() {
        if(this.j) {
            throw new NoSuchElementException();
        }
        this.j = true;
        return this.i;
    }
}

