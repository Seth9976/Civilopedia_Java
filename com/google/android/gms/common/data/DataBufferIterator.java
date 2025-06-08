package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

@KeepForSdk
public class DataBufferIterator implements Iterator {
    public final DataBuffer i;
    public int j;

    public DataBufferIterator(DataBuffer dataBuffer0) {
        this.i = (DataBuffer)Preconditions.checkNotNull(dataBuffer0);
        this.j = -1;
    }

    @Override
    public final boolean hasNext() {
        return this.j < this.i.getCount() - 1;
    }

    @Override
    public Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException("Cannot advance the iterator beyond " + this.j);
        }
        int v = this.j + 1;
        this.j = v;
        return this.i.get(v);
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}

