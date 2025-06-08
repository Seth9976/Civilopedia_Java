package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
public abstract class DataBufferRef {
    public final DataHolder a;
    public int b;
    public int c;

    @KeepForSdk
    public DataBufferRef(DataHolder dataHolder0, int v) {
        DataHolder dataHolder1 = (DataHolder)Preconditions.checkNotNull(dataHolder0);
        this.a = dataHolder1;
        Preconditions.checkState(v >= 0 && v < dataHolder1.getCount());
        this.b = v;
        this.c = dataHolder1.getWindowIndex(v);
    }

    // 去混淆评级： 低(30)
    @Override
    @KeepForSdk
    public boolean equals(Object object0) {
        return object0 instanceof DataBufferRef && Objects.equal(((DataBufferRef)object0).b, this.b) && Objects.equal(((DataBufferRef)object0).c, this.c) && ((DataBufferRef)object0).a == this.a;
    }

    @KeepForSdk
    public boolean hasColumn(String s) {
        return this.a.hasColumn(s);
    }

    @Override
    @KeepForSdk
    public int hashCode() {
        return Objects.hashCode(new Object[]{this.b, this.c, this.a});
    }

    @KeepForSdk
    public boolean isDataValid() {
        return !this.a.isClosed();
    }
}

