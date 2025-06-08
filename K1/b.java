package K1;

import java.io.OutputStream;

public final class b extends OutputStream {
    public long i;

    @Override
    public final void write(int v) {
        ++this.i;
    }

    @Override
    public final void write(byte[] arr_b) {
        this.i += (long)arr_b.length;
    }

    @Override
    public final void write(byte[] arr_b, int v, int v1) {
        if(v < 0 || v > arr_b.length || v1 < 0 || (v + v1 > arr_b.length || v + v1 < 0)) {
            throw new IndexOutOfBoundsException();
        }
        this.i += (long)v1;
    }
}

