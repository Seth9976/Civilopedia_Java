package w3;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

public final class d extends OutputStream {
    public final int i;
    public final ArrayList j;
    public int k;
    public byte[] l;
    public int m;
    public static final byte[] n;

    static {
        d.n = new byte[0];
    }

    public d() {
        this.i = 0x80;
        this.j = new ArrayList();
        this.l = new byte[0x80];
    }

    public final void a(int v) {
        u u0 = new u(this.l);
        this.j.add(u0);
        int v1 = this.k + this.l.length;
        this.k = v1;
        this.l = new byte[Math.max(this.i, Math.max(v, v1 >>> 1))];
        this.m = 0;
    }

    public final void b() {
        int v = this.m;
        byte[] arr_b = this.l;
        ArrayList arrayList0 = this.j;
        if(v >= arr_b.length) {
            arrayList0.add(new u(this.l));
            this.l = d.n;
        }
        else if(v > 0) {
            byte[] arr_b1 = new byte[v];
            System.arraycopy(arr_b, 0, arr_b1, 0, Math.min(arr_b.length, v));
            arrayList0.add(new u(arr_b1));
        }
        this.k += this.m;
        this.m = 0;
    }

    public final e c() {
        synchronized(this) {
            this.b();
            ArrayList arrayList0 = this.j;
            if(!(arrayList0 instanceof Collection)) {
                ArrayList arrayList1 = new ArrayList();
                for(Object object0: arrayList0) {
                    arrayList1.add(((e)object0));
                }
                arrayList0 = arrayList1;
            }
            return arrayList0.isEmpty() ? e.i : e.a(arrayList0.iterator(), arrayList0.size());
        }
    }

    @Override
    public final String toString() {
        synchronized(this) {
        }
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), ((int)(this.k + this.m)));
    }

    @Override
    public final void write(int v) {
        synchronized(this) {
            if(this.m == this.l.length) {
                this.a(1);
            }
            int v2 = this.m;
            this.m = v2 + 1;
            this.l[v2] = (byte)v;
        }
    }

    @Override
    public final void write(byte[] arr_b, int v, int v1) {
        synchronized(this) {
            byte[] arr_b1 = this.l;
            int v3 = this.m;
            if(v1 <= arr_b1.length - v3) {
                System.arraycopy(arr_b, v, arr_b1, v3, v1);
                this.m += v1;
            }
            else {
                int v4 = arr_b1.length - v3;
                System.arraycopy(arr_b, v, arr_b1, v3, v4);
                int v5 = v1 - v4;
                this.a(v5);
                System.arraycopy(arr_b, v + v4, this.l, 0, v5);
                this.m = v5;
            }
        }
    }
}

