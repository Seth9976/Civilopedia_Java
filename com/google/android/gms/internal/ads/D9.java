package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

public final class d9 extends f9 {
    public int i;
    public final int j;
    public final zzgji k;

    public d9(zzgji zzgji0) {
        this.k = zzgji0;
        this.i = 0;
        this.j = zzgji0.zzd();
    }

    @Override
    public final boolean hasNext() {
        return this.i < this.j;
    }

    @Override  // com.google.android.gms.internal.ads.zzgjc
    public final byte zza() {
        int v = this.i;
        if(v >= this.j) {
            throw new NoSuchElementException();
        }
        this.i = v + 1;
        return this.k.h(v);
    }
}

