package com.google.android.gms.common.api;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import java.util.Iterator;

@KeepForSdk
public class DataBufferResponse extends Response implements DataBuffer {
    @KeepForSdk
    public DataBufferResponse() {
    }

    @KeepForSdk
    public DataBufferResponse(AbstractDataBuffer abstractDataBuffer0) {
        super(((Result)abstractDataBuffer0));
    }

    @Override  // com.google.android.gms.common.data.DataBuffer
    public final void close() {
        ((AbstractDataBuffer)this.i).close();
    }

    @Override  // com.google.android.gms.common.data.DataBuffer
    public final Object get(int v) {
        return ((AbstractDataBuffer)this.i).get(v);
    }

    @Override  // com.google.android.gms.common.data.DataBuffer
    public final int getCount() {
        return ((AbstractDataBuffer)this.i).getCount();
    }

    @Override  // com.google.android.gms.common.data.DataBuffer
    public final Bundle getMetadata() {
        return ((AbstractDataBuffer)this.i).getMetadata();
    }

    @Override  // com.google.android.gms.common.data.DataBuffer
    public final boolean isClosed() {
        return ((AbstractDataBuffer)this.i).isClosed();
    }

    @Override  // com.google.android.gms.common.data.DataBuffer
    public final Iterator iterator() {
        return ((AbstractDataBuffer)this.i).iterator();
    }

    @Override  // com.google.android.gms.common.data.DataBuffer
    public final void release() {
        ((AbstractDataBuffer)this.i).release();
    }

    @Override  // com.google.android.gms.common.data.DataBuffer
    public final Iterator singleRefIterator() {
        return ((AbstractDataBuffer)this.i).singleRefIterator();
    }
}

