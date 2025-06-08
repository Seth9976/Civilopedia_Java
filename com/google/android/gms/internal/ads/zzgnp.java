package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzgnp extends AbstractList implements zzgli, RandomAccess {
    public final zzgli i;

    public zzgnp(zzgli zzgli0) {
        this.i = zzgli0;
    }

    @Override
    public final Object get(int v) {
        return ((zzglh)this.i).zzg(v);
    }

    @Override
    public final Iterator iterator() {
        return new da(this);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return new ca(this, v);
    }

    @Override
    public final int size() {
        return this.i.size();
    }

    @Override  // com.google.android.gms.internal.ads.zzgli
    public final zzgli zze() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzgli
    public final Object zzf(int v) {
        return this.i.zzf(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgli
    public final List zzh() {
        return this.i.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzgli
    public final void zzi(zzgji zzgji0) {
        throw new UnsupportedOperationException();
    }
}

