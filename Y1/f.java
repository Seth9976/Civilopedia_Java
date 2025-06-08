package y1;

import java.io.InputStream;

public final class f extends InputStream {
    public int i;
    public int j;
    public final h k;

    public f(h h0, e e0) {
        this.k = h0;
        super();
        this.i = h0.m(e0.a + 4);
        this.j = e0.b;
    }

    @Override
    public final int read() {
        if(this.j == 0) {
            return -1;
        }
        this.k.i.seek(((long)this.i));
        int v = this.k.i.read();
        this.i = this.k.m(this.i + 1);
        --this.j;
        return v;
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) {
        if(arr_b == null) {
            throw new NullPointerException("buffer");
        }
        if((v | v1) < 0 || v1 > arr_b.length - v) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int v2 = this.j;
        if(v2 > 0) {
            if(v1 > v2) {
                v1 = v2;
            }
            this.k.j(this.i, v, v1, arr_b);
            this.i = this.k.m(this.i + v1);
            this.j -= v1;
            return v1;
        }
        return -1;
    }
}

