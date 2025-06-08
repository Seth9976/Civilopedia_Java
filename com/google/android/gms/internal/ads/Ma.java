package com.google.android.gms.internal.ads;

import java.util.Iterator;

public final class ma implements Iterator {
    public int i;
    public final zzgql j;

    public ma(zzgql zzgql0) {
        this.j = zzgql0;
        this.i = 0;
    }

    @Override
    public final boolean hasNext() {
        return this.i < this.j.i.size() || this.j.j.hasNext();
    }

    @Override
    public final Object next() {
        zzgql zzgql0 = this.j;
        if(this.i < zzgql0.i.size()) {
            int v = this.i;
            this.i = v + 1;
            return zzgql0.i.get(v);
        }
        Object object0 = zzgql0.j.next();
        zzgql0.i.add(object0);
        return this.next();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

