package w3;

import java.io.OutputStream;
import java.util.Iterator;

public class u extends e {
    public final byte[] j;
    public int k;

    public u(byte[] arr_b) {
        this.k = 0;
        this.j = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof e)) {
            return false;
        }
        if(this.size() != ((e)object0).size()) {
            return false;
        }
        if(this.size() == 0) {
            return true;
        }
        if(object0 instanceof u) {
            return this.u(((u)object0), 0, this.size());
        }
        if(object0 instanceof z) {
            return object0.equals(this);
        }
        String s = String.valueOf(object0.getClass());
        throw new IllegalArgumentException(i3.e.h(new StringBuilder(s.length() + 49), "Has a new type of ByteString been created? Found ", s));
    }

    @Override
    public final int hashCode() {
        int v = this.k;
        if(v == 0) {
            int v1 = this.size();
            v = this.o(v1, 0, v1);
            if(v == 0) {
                v = 1;
            }
            this.k = v;
        }
        return v;
    }

    @Override
    public Iterator iterator() {
        return new t(this);
    }

    @Override  // w3.e
    public void j(int v, int v1, int v2, byte[] arr_b) {
        System.arraycopy(this.j, v, arr_b, v1, v2);
    }

    @Override  // w3.e
    public final int k() {
        return 0;
    }

    @Override  // w3.e
    public final boolean l() {
        return true;
    }

    @Override  // w3.e
    public final boolean m() {
        return D.c(this.j, 0, this.j.length) == 0;
    }

    @Override  // w3.e
    public final int o(int v, int v1, int v2) {
        for(int v3 = v1; v3 < v1 + v2; ++v3) {
            v = v * 0x1F + this.j[v3];
        }
        return v;
    }

    @Override  // w3.e
    public final int p(int v, int v1, int v2) {
        int v8;
        int v7;
        int v3 = v2 + v1;
        byte[] arr_b = this.j;
        if(v != 0) {
            if(v1 < v3) {
                if(((byte)v) < 0xFFFFFFE0) {
                    if(((byte)v) >= -62) {
                        return arr_b[v1] > -65 ? -1 : D.c(arr_b, v1 + 1, v3);
                    }
                }
                else if(((byte)v) < -16) {
                    int v4 = (byte)(~(v >> 8));
                    if(v4 == 0) {
                        int v5 = arr_b[v1];
                        if(v1 + 1 >= v3) {
                            return D.a(((byte)v), v5);
                        }
                        ++v1;
                        v4 = v5;
                    }
                    if(v4 <= -65 && (((byte)v) != 0xFFFFFFE0 || v4 >= 0xFFFFFFA0) && (((byte)v) != -19 || v4 < 0xFFFFFFA0)) {
                        return arr_b[v1] <= -65 ? D.c(arr_b, v1 + 1, v3) : -1;
                    }
                }
                else {
                    int v6 = (byte)(~(v >> 8));
                    if(v6 == 0) {
                        v7 = v1 + 1;
                        v6 = arr_b[v1];
                        if(v7 >= v3) {
                            return D.a(((byte)v), v6);
                        }
                        v8 = 0;
                    }
                    else {
                        v8 = (byte)(v >> 16);
                        v7 = v1;
                    }
                    if(v8 == 0) {
                        int v9 = arr_b[v7];
                        if(v7 + 1 >= v3) {
                            return ((byte)v) > -12 || v6 > -65 || v9 > -65 ? -1 : v9 << 16 ^ (v6 << 8 ^ ((byte)v));
                        }
                        v8 = v9;
                        ++v7;
                    }
                    if(v6 <= -65 && v6 + 0x70 + (((byte)v) << 28) >> 30 == 0 && v8 <= -65) {
                        return arr_b[v7] > -65 ? -1 : D.c(arr_b, v7 + 1, v3);
                    }
                }
                return -1;
            }
            return v;
        }
        return D.c(arr_b, v1, v3);
    }

    @Override  // w3.e
    public final int q() {
        return this.k;
    }

    @Override  // w3.e
    public final String r() {
        return new String(this.j, 0, this.j.length, "UTF-8");
    }

    @Override  // w3.e
    public int size() {
        return this.j.length;
    }

    @Override  // w3.e
    public final void t(OutputStream outputStream0, int v, int v1) {
        outputStream0.write(this.j, v, v1);
    }

    public final boolean u(u u0, int v, int v1) {
        byte[] arr_b = u0.j;
        byte[] arr_b1 = this.j;
        if(v1 > arr_b.length) {
            throw new IllegalArgumentException("Length too large: " + v1 + arr_b1.length);
        }
        byte[] arr_b2 = u0.j;
        if(v + v1 > arr_b.length) {
            throw new IllegalArgumentException("Ran off end of other: " + v + ", " + v1 + ", " + arr_b2.length);
        }
        int v2 = 0;
        while(v2 < v1) {
            if(arr_b1[v2] != arr_b2[v]) {
                return false;
            }
            ++v2;
            ++v;
        }
        return true;
    }
}

