package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.Iterator;

public abstract class AbstractDataBuffer implements DataBuffer {
    public final DataHolder i;

    public AbstractDataBuffer(DataHolder dataHolder0) {
        this.i = dataHolder0;
    }

    @Override  // com.google.android.gms.common.data.DataBuffer
    public final void close() {
        this.release();
    }

    @Override  // com.google.android.gms.common.data.DataBuffer
    public abstract Object get(int arg1);

    @Override  // com.google.android.gms.common.data.DataBuffer
    public int getCount() {
        return this.i == null ? 0 : this.i.getCount();
    }

    @Override  // com.google.android.gms.common.data.DataBuffer
    public final Bundle getMetadata() {
        return this.i == null ? null : this.i.getMetadata();
    }

    @Override  // com.google.android.gms.common.data.DataBuffer
    @Deprecated
    public boolean isClosed() {
        return this.i == null || this.i.isClosed();
    }

    @Override  // com.google.android.gms.common.data.DataBuffer
    public Iterator iterator() {
        return new DataBufferIterator(this);
    }

    @Override  // com.google.android.gms.common.data.DataBuffer
    public void release() {
        DataHolder dataHolder0 = this.i;
        if(dataHolder0 != null) {
            dataHolder0.close();
        }
    }

    @Override  // com.google.android.gms.common.data.DataBuffer
    public Iterator singleRefIterator() {
        return new SingleRefDataBufferIterator(this);
    }
}

