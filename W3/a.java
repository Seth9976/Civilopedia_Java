package w3;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;

public final class a extends FilterInputStream {
    public int i;

    public a(ByteArrayInputStream byteArrayInputStream0, int v) {
        super(byteArrayInputStream0);
        this.i = v;
    }

    @Override
    public final int available() {
        return Math.min(super.available(), this.i);
    }

    @Override
    public final int read() {
        if(this.i <= 0) {
            return -1;
        }
        int v = super.read();
        if(v >= 0) {
            --this.i;
        }
        return v;
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) {
        int v2 = this.i;
        if(v2 <= 0) {
            return -1;
        }
        int v3 = super.read(arr_b, v, Math.min(v1, v2));
        if(v3 >= 0) {
            this.i -= v3;
        }
        return v3;
    }

    @Override
    public final long skip(long v) {
        long v1 = super.skip(Math.min(v, this.i));
        if(v1 >= 0L) {
            this.i = (int)(((long)this.i) - v1);
        }
        return v1;
    }
}

