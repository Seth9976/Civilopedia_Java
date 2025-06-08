package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzms extends AbstractList implements zzkt, RandomAccess {
    public final zzkt i;

    public zzms(zzkt zzkt0) {
        this.i = zzkt0;
    }

    @Override
    public final Object get(int v) {
        return ((zzks)this.i).zzg(v);
    }

    @Override
    public final Iterator iterator() {
        return new B0(this);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return new A0(this, v);
    }

    @Override
    public final int size() {
        return this.i.size();
    }

    @Override  // com.google.android.gms.internal.measurement.zzkt
    public final zzkt zze() {
        return this;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkt
    public final Object zzf(int v) {
        return this.i.zzf(v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzkt
    public final List zzh() {
        return this.i.zzh();
    }

    @Override  // com.google.android.gms.internal.measurement.zzkt
    public final void zzi(zzjd zzjd0) {
        throw new UnsupportedOperationException();
    }
}

