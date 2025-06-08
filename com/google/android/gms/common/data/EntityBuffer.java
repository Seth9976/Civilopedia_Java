package com.google.android.gms.common.data;

import A.f;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

@KeepForSdk
public abstract class EntityBuffer extends AbstractDataBuffer {
    public abstract Object a();

    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public final Object get(int v) {
        if(v < 0) {
            throw new IllegalArgumentException(f.e(v, "Position ", " is out of bounds for this buffer"));
        }
        throw null;
    }

    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    @KeepForSdk
    public int getCount() {
        throw null;
    }

    public final void i() {
        synchronized(this) {
        }
    }
}

