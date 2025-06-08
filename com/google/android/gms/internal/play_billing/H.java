package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

public final class h extends zzdx {
    public final int i;
    public int j;
    public final zzco k;

    public h(zzco zzco0, int v) {
        int v1 = zzco0.size();
        super();
        zzbe.zzb(v, v1, "index");
        this.i = v1;
        this.j = v;
        this.k = zzco0;
    }

    public final Object a(int v) {
        return this.k.get(v);
    }

    @Override
    public final boolean hasNext() {
        return this.j < this.i;
    }

    @Override
    public final boolean hasPrevious() {
        return this.j > 0;
    }

    @Override
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        int v = this.j;
        this.j = v + 1;
        return this.a(v);
    }

    @Override
    public final int nextIndex() {
        return this.j;
    }

    @Override
    public final Object previous() {
        if(!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        int v = this.j - 1;
        this.j = v;
        return this.a(v);
    }

    @Override
    public final int previousIndex() {
        return this.j - 1;
    }
}

