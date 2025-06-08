package w3;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;
import o3.k;

public abstract class e implements Iterable {
    public static final u i;

    static {
        e.i = new u(new byte[0]);
    }

    public static e a(Iterator iterator0, int v) {
        return v == 1 ? iterator0.next() : e.a(iterator0, v >>> 1).h(e.a(iterator0, v - (v >>> 1)));
    }

    public final e h(e e0) {
        int v = this.size();
        int v1 = e0.size();
        if(((long)v) + ((long)v1) >= 0x7FFFFFFFL) {
            throw new IllegalArgumentException("ByteString would be too long: " + v + "+" + v1);
        }
        z z0 = this instanceof z ? ((z)this) : null;
        if(e0.size() == 0) {
            return this;
        }
        if(this.size() != 0) {
            int v2 = e0.size() + this.size();
            if(v2 < 0x80) {
                int v3 = this.size();
                int v4 = e0.size();
                byte[] arr_b = new byte[v3 + v4];
                this.i(0, 0, v3, arr_b);
                e0.i(0, v3, v4, arr_b);
                return new u(arr_b);
            }
            if(z0 != null) {
                e e1 = z0.l;
                if(e0.size() + e1.size() < 0x80) {
                    int v5 = e1.size();
                    int v6 = e0.size();
                    byte[] arr_b1 = new byte[v5 + v6];
                    e1.i(0, 0, v5, arr_b1);
                    e0.i(0, v5, v6, arr_b1);
                    u u0 = new u(arr_b1);
                    return new z(z0.k, u0);
                }
            }
            if(z0 != null) {
                e e2 = z0.k;
                int v7 = e2.k();
                e e3 = z0.l;
                if(v7 > e3.k()) {
                    int v8 = e0.k();
                    if(z0.n > v8) {
                        return new z(e2, new z(e3, e0));
                    }
                }
            }
            if(v2 >= z.p[Math.max(this.k(), e0.k()) + 1]) {
                return new z(this, e0);
            }
            k k0 = new k();  // 初始化器: Ljava/lang/Object;-><init>()V
            k0.i = new Stack();
            k0.c(this);
            k0.c(e0);
            Stack stack0 = (Stack)k0.i;
            e e4;
            for(e4 = (e)stack0.pop(); !stack0.isEmpty(); e4 = new z(((e)stack0.pop()), e4)) {
            }
            return e4;
        }
        return e0;
    }

    public final void i(int v, int v1, int v2, byte[] arr_b) {
        if(v < 0) {
            throw new IndexOutOfBoundsException("Source offset < 0: " + v);
        }
        if(v1 < 0) {
            throw new IndexOutOfBoundsException("Target offset < 0: " + v1);
        }
        if(v2 < 0) {
            throw new IndexOutOfBoundsException("Length < 0: " + v2);
        }
        int v3 = v + v2;
        if(v3 > this.size()) {
            throw new IndexOutOfBoundsException("Source end offset < 0: " + v3);
        }
        int v4 = v1 + v2;
        if(v4 > arr_b.length) {
            throw new IndexOutOfBoundsException("Target end offset < 0: " + v4);
        }
        if(v2 > 0) {
            this.j(v, v1, v2, arr_b);
        }
    }

    public abstract void j(int arg1, int arg2, int arg3, byte[] arg4);

    public abstract int k();

    public abstract boolean l();

    public abstract boolean m();

    public static d n() {
        return new d();
    }

    public abstract int o(int arg1, int arg2, int arg3);

    public abstract int p(int arg1, int arg2, int arg3);

    public abstract int q();

    public abstract String r();

    public final String s() {
        try {
            return this.r();
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException("UTF-8 not supported?", unsupportedEncodingException0);
        }
    }

    public abstract int size();

    public abstract void t(OutputStream arg1, int arg2, int arg3);

    @Override
    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), this.size());
    }
}

