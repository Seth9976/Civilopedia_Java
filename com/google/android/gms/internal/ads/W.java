package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.OutOfSpaceException;
import w3.b;
import w3.e;

public final class w {
    public int a;
    public int b;
    public final Object c;
    public Object d;

    public w(int v, int v1) {
        if(v1 != 2) {
            super();
            this.c = new zzaeu[v];
            this.b = 0;
            return;
        }
        super();
        this.c = new zzavm[v];
        this.b = 0;
    }

    public w(OutputStream outputStream0, byte[] arr_b) {
        this.c = outputStream0;
        this.d = arr_b;
        this.b = 0;
        this.a = arr_b.length;
    }

    public w(String s, byte[] arr_b, int v, int v1) {
        this.c = s;
        this.d = arr_b;
        this.a = v;
        this.b = v1;
    }

    public static int a(int v, int v1) {
        return w.c(v1) + w.h(v);
    }

    public static int b(int v, int v1) {
        return w.c(v1) + w.h(v);
    }

    public static int c(int v) {
        return v < 0 ? 10 : w.f(v);
    }

    public static int d(int v, b b0) {
        return w.e(b0) + w.h(v);
    }

    public static int e(b b0) {
        int v = b0.c();
        return w.f(v) + v;
    }

    public static int f(int v) {
        if((v & 0xFFFFFF80) == 0) {
            return 1;
        }
        if((v & 0xFFFFC000) == 0) {
            return 2;
        }
        if((0xFFE00000 & v) == 0) {
            return 3;
        }
        return (v & 0xF0000000) == 0 ? 4 : 5;
    }

    public static int g(long v) {
        if((0xFFFFFFFFFFFFFF80L & v) == 0L) {
            return 1;
        }
        if((0xFFFFFFFFFFFFC000L & v) == 0L) {
            return 2;
        }
        if((0xFFFFFFFFFFE00000L & v) == 0L) {
            return 3;
        }
        if((0xFFFFFFFFF0000000L & v) == 0L) {
            return 4;
        }
        if((0xFFFFFFF800000000L & v) == 0L) {
            return 5;
        }
        if((0xFFFFFC0000000000L & v) == 0L) {
            return 6;
        }
        if((0xFFFE000000000000L & v) == 0L) {
            return 7;
        }
        if((0xFF00000000000000L & v) == 0L) {
            return 8;
        }
        return (v & 0x8000000000000000L) == 0L ? 9 : 10;
    }

    public static int h(int v) [...] // Potential decryptor

    public void i() {
        if(((OutputStream)this.c) != null) {
            this.k();
        }
    }

    public static w j(OutputStream outputStream0, int v) {
        return new w(outputStream0, new byte[v]);
    }

    public void k() {
        OutputStream outputStream0 = (OutputStream)this.c;
        if(outputStream0 == null) {
            throw new CodedOutputStream.OutOfSpaceException();
        }
        outputStream0.write(((byte[])this.d), 0, this.b);
        this.b = 0;
    }

    public void l(int v, int v1) {
        this.x(v, 0);
        this.n(v1);
    }

    public void m(int v, int v1) {
        this.x(v, 0);
        this.n(v1);
    }

    public void n(int v) {
        if(v >= 0) {
            this.v(v);
            return;
        }
        this.w(((long)v));
    }

    public void o(int v, b b0) {
        this.x(v, 2);
        this.p(b0);
    }

    public void p(b b0) {
        this.v(b0.c());
        b0.f(this);
    }

    public void q(int v) {
        if(this.b == this.a) {
            this.k();
        }
        int v1 = this.b;
        this.b = v1 + 1;
        ((byte[])this.d)[v1] = (byte)v;
    }

    public void r(e e0) {
        int v = e0.size();
        int v1 = this.b;
        int v2 = this.a;
        int v3 = v2 - v1;
        byte[] arr_b = (byte[])this.d;
        if(v3 >= v) {
            e0.i(0, v1, v, arr_b);
            this.b += v;
            return;
        }
        e0.i(0, v1, v3, arr_b);
        int v4 = v - v3;
        this.b = v2;
        this.k();
        if(v4 <= v2) {
            e0.i(v3, 0, v4, arr_b);
            this.b = v4;
            return;
        }
        if(v3 < 0) {
            throw new IndexOutOfBoundsException("Source offset < 0: " + v3);
        }
        if(v4 < 0) {
            throw new IndexOutOfBoundsException("Length < 0: " + v4);
        }
        int v5 = v3 + v4;
        if(v5 > e0.size()) {
            throw new IndexOutOfBoundsException("Source end offset exceeded: " + v5);
        }
        if(v4 > 0) {
            e0.t(((OutputStream)this.c), v3, v4);
        }
    }

    public void s(byte[] arr_b) {
        int v = this.b;
        int v1 = this.a;
        int v2 = v1 - v;
        byte[] arr_b1 = (byte[])this.d;
        if(v2 >= arr_b.length) {
            System.arraycopy(arr_b, 0, arr_b1, v, arr_b.length);
            this.b += arr_b.length;
            return;
        }
        System.arraycopy(arr_b, 0, arr_b1, v, v2);
        int v3 = arr_b.length - v2;
        this.b = v1;
        this.k();
        if(v3 <= v1) {
            System.arraycopy(arr_b, v2, arr_b1, 0, v3);
            this.b = v3;
            return;
        }
        ((OutputStream)this.c).write(arr_b, v2, v3);
    }

    public void t(int v) {
        this.q(v & 0xFF);
        this.q(v >> 8 & 0xFF);
        this.q(v >> 16 & 0xFF);
        this.q(v >> 24 & 0xFF);
    }

    public void u(long v) {
        this.q(((int)v) & 0xFF);
        this.q(((int)(v >> 8)) & 0xFF);
        this.q(((int)(v >> 16)) & 0xFF);
        this.q(((int)(v >> 24)) & 0xFF);
        this.q(((int)(v >> 0x20)) & 0xFF);
        this.q(((int)(v >> 40)) & 0xFF);
        this.q(((int)(v >> 0x30)) & 0xFF);
        this.q(((int)(v >> 56)) & 0xFF);
    }

    public void v(int v) {
        while((v & 0xFFFFFF80) != 0) {
            this.q(v & 0x7F | 0x80);
            v >>>= 7;
        }
        this.q(v);
    }

    public void w(long v) {
        while((0xFFFFFFFFFFFFFF80L & v) != 0L) {
            this.q(((int)v) & 0x7F | 0x80);
            v >>>= 7;
        }
        this.q(((int)v));
    }

    public void x(int v, int v1) {
        this.v(v << 3 | v1);
    }
}

