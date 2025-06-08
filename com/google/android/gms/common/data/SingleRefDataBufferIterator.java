package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import i3.e;
import java.util.NoSuchElementException;

@KeepForSdk
public class SingleRefDataBufferIterator extends DataBufferIterator {
    public Object k;

    public SingleRefDataBufferIterator(DataBuffer dataBuffer0) {
        super(dataBuffer0);
    }

    @Override  // com.google.android.gms.common.data.DataBufferIterator
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException("Cannot advance the iterator beyond " + this.j);
        }
        boolean z = true;
        int v = this.j + 1;
        this.j = v;
        if(v == 0) {
            Object object0 = Preconditions.checkNotNull(this.i.get(0));
            this.k = object0;
            if(!(object0 instanceof DataBufferRef)) {
                throw new IllegalStateException(e.f("DataBuffer reference of type ", String.valueOf(object0.getClass()), " is not movable"));
            }
        }
        else {
            DataBufferRef dataBufferRef0 = (DataBufferRef)Preconditions.checkNotNull(this.k);
            int v1 = this.j;
            DataHolder dataHolder0 = dataBufferRef0.a;
            if(v1 < 0 || v1 >= dataHolder0.getCount()) {
                z = false;
            }
            Preconditions.checkState(z);
            dataBufferRef0.b = v1;
            dataBufferRef0.c = dataHolder0.getWindowIndex(v1);
        }
        return this.k;
    }
}

