package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

public final class g0 implements zzgg {
    public int i;
    public final int j;
    public final zzgk k;

    public g0(zzgk zzgk0) {
        this.k = zzgk0;
        this.i = 0;
        this.j = zzgk0.zzd();
    }

    @Override
    public final boolean hasNext() {
        return this.i < this.j;
    }

    @Override
    public final Object next() {
        return this.zza();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgg
    public final byte zza() {
        int v = this.i;
        if(v >= this.j) {
            throw new NoSuchElementException();
        }
        this.i = v + 1;
        return this.k.a(v);
    }
}

