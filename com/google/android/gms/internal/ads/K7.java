package com.google.android.gms.internal.ads;

import java.util.ListIterator;

public final class k7 extends G7 implements ListIterator {
    @Override  // com.google.android.gms.internal.ads.G7
    public final Object a(Object object0) {
        return ((zzbek)object0).name();
    }

    @Override
    public final void add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator)this.i).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator)this.i).nextIndex();
    }

    @Override
    public final Object previous() {
        return ((zzbek)((ListIterator)this.i).previous()).name();
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator)this.i).previousIndex();
    }

    @Override
    public final void set(Object object0) {
        throw new UnsupportedOperationException();
    }
}

