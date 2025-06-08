package com.google.android.gms.internal.ads;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;

public final class u0 extends FilterInputStream {
    public final long i;
    public long j;

    public u0(BufferedInputStream bufferedInputStream0, long v) {
        super(bufferedInputStream0);
        this.i = v;
    }

    @Override
    public final int read() {
        int v = super.read();
        if(v != -1) {
            ++this.j;
        }
        return v;
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) {
        int v2 = super.read(arr_b, v, v1);
        if(v2 != -1) {
            this.j += (long)v2;
        }
        return v2;
    }
}

