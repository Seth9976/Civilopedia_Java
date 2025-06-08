package y1;

import C1.d;

public final class c implements g {
    public final Object a;
    public Object b;
    public static final t1.c c;

    static {
        c.c = new t1.c(20);
    }

    public c(d d0) {
        this.a = d0;
        this.b = c.c;
    }

    public c(byte[] arr_b, int[] arr_v) {
        this.a = arr_b;
        this.b = arr_v;
    }

    @Override  // y1.g
    public void a(f f0, int v) {
        int[] arr_v = (int[])this.b;
        try(f0) {
            f0.read(((byte[])this.a), arr_v[0], v);
            arr_v[0] += v;
        }
    }
}

