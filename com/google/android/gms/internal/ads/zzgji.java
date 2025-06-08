package com.google.android.gms.internal.ads;

import A.f;
import i3.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public abstract class zzgji implements Serializable, Iterable {
    public int i;
    public static final zzgji zzb;

    static {
        zzgji.zzb = new h9(zzgla.zzd);
    }

    public zzgji() {
        this.i = 0;
    }

    public static void a(int v, int v1) {
        if((v1 - (v + 1) | v) < 0) {
            throw v >= 0 ? new ArrayIndexOutOfBoundsException(f.d(v, v1, "Index > length: ", ", ")) : new ArrayIndexOutOfBoundsException("Index < 0: " + v);
        }
    }

    @Override
    public abstract boolean equals(Object arg1);

    public abstract byte h(int arg1);

    @Override
    public final int hashCode() {
        int v = this.i;
        if(v == 0) {
            int v1 = this.zzd();
            v = this.m(v1, 0, v1);
            if(v == 0) {
                v = 1;
            }
            this.i = v;
        }
        return v;
    }

    public static zzgji i(Iterator iterator0, int v) {
        if(v <= 0) {
            throw new IllegalArgumentException(f.e(v, "length (", ") must be >= 1"));
        }
        if(v == 1) {
            return iterator0.next();
        }
        zzgji zzgji0 = zzgji.i(iterator0, v >>> 1);
        zzgji zzgji1 = zzgji.i(iterator0, v - (v >>> 1));
        if(0x7FFFFFFF - zzgji0.zzd() < zzgji1.zzd()) {
            throw new IllegalArgumentException(f.d(zzgji0.zzd(), zzgji1.zzd(), "ByteString would be too long: ", "+"));
        }
        if(zzgji1.zzd() == 0) {
            return zzgji0;
        }
        if(zzgji0.zzd() != 0) {
            int v1 = zzgji0.zzd();
            int v2 = zzgji1.zzd() + v1;
            if(v2 < 0x80) {
                int v3 = zzgji0.zzd();
                int v4 = zzgji1.zzd();
                byte[] arr_b = new byte[v3 + v4];
                zzgji0.zzC(arr_b, 0, 0, v3);
                zzgji1.zzC(arr_b, 0, v3, v4);
                return new h9(arr_b);
            }
            if(zzgji0 instanceof S9) {
                zzgji zzgji2 = ((S9)zzgji0).l;
                int v5 = zzgji2.zzd();
                int v6 = zzgji1.zzd();
                zzgji zzgji3 = ((S9)zzgji0).k;
                if(v6 + v5 < 0x80) {
                    int v7 = zzgji2.zzd();
                    int v8 = zzgji1.zzd();
                    byte[] arr_b1 = new byte[v7 + v8];
                    zzgji2.zzC(arr_b1, 0, 0, v7);
                    zzgji1.zzC(arr_b1, 0, v7, v8);
                    return new S9(zzgji3, new h9(arr_b1));
                }
                if(zzgji3.k() > zzgji2.k()) {
                    int v9 = zzgji1.k();
                    if(((S9)zzgji0).n > v9) {
                        return new S9(zzgji3, new S9(zzgji2, zzgji1));
                    }
                }
            }
            if(v2 >= S9.r(Math.max(zzgji0.k(), zzgji1.k()) + 1)) {
                return new S9(zzgji0, zzgji1);
            }
            J5 j50 = new J5();
            j50.f(zzgji0);
            j50.f(zzgji1);
            ArrayDeque arrayDeque0 = (ArrayDeque)j50.j;
            zzgji zzgji4;
            for(zzgji4 = (zzgji)arrayDeque0.pop(); !arrayDeque0.isEmpty(); zzgji4 = new S9(((zzgji)arrayDeque0.pop()), zzgji4)) {
            }
            return zzgji4;
        }
        return zzgji1;
    }

    @Override
    public Iterator iterator() {
        return this.zzs();
    }

    public abstract void j(int arg1, int arg2, int arg3, byte[] arg4);

    public abstract int k();

    public abstract boolean l();

    public abstract int m(int arg1, int arg2, int arg3);

    public abstract int n(int arg1, int arg2, int arg3);

    public abstract String o(Charset arg1);

    public abstract void p(zzgjx arg1);

    public static int q(int v, int v1, int v2) {
        int v3 = v1 - v;
        if((v | v1 | v3 | v2 - v1) < 0) {
            if(v < 0) {
                throw new IndexOutOfBoundsException(f.e(v, "Beginning index: ", " < 0"));
            }
            throw v1 >= v ? new IndexOutOfBoundsException(f.d(v1, v2, "End index: ", " >= ")) : new IndexOutOfBoundsException(f.d(v, v1, "Beginning index larger than ending index: ", ", "));
        }
        return v3;
    }

    @Override
    public final String toString() {
        String s1;
        String s = Integer.toHexString(System.identityHashCode(this));
        int v = this.zzd();
        if(this.zzd() <= 50) {
            s1 = h.f(this);
            return e.h(f.m(v, "<ByteString@", s, " size=", " contents=\""), s1, "\">");
        }
        s1 = h.f(this.zzk(0, 0x2F)) + "...";
        return e.h(f.m(v, "<ByteString@", s, " size=", " contents=\""), s1, "\">");
    }

    public final String zzA(Charset charset0) {
        return this.zzd() == 0 ? "" : this.o(charset0);
    }

    @Deprecated
    public final void zzC(byte[] arr_b, int v, int v1, int v2) {
        zzgji.q(0, v2, this.zzd());
        zzgji.q(v1, v1 + v2, arr_b.length);
        if(v2 > 0) {
            this.j(0, v1, v2, arr_b);
        }
    }

    public final boolean zzD() {
        return this.zzd() == 0;
    }

    public final byte[] zzE() {
        int v = this.zzd();
        if(v == 0) {
            return zzgla.zzd;
        }
        byte[] arr_b = new byte[v];
        this.j(0, 0, v, arr_b);
        return arr_b;
    }

    public abstract byte zza(int arg1);

    public abstract int zzd();

    public abstract zzgji zzk(int arg1, int arg2);

    public abstract zzgjq zzl();

    public abstract ByteBuffer zzn();

    public abstract boolean zzp();

    public zzgjc zzs() {
        return new d9(this);
    }

    public static zzgjf zzt() {
        return new zzgjf();
    }

    public static zzgji zzu(Iterable iterable0) {
        int v;
        if(!(iterable0 instanceof Collection)) {
            v = 0;
            Iterator iterator0 = iterable0.iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                ++v;
            }
            return v == 0 ? zzgji.zzb : zzgji.i(iterable0.iterator(), v);
        }
        v = ((Collection)iterable0).size();
        return v == 0 ? zzgji.zzb : zzgji.i(iterable0.iterator(), v);
    }

    public static zzgji zzv(byte[] arr_b) {
        return zzgji.zzw(arr_b, 0, arr_b.length);
    }

    public static zzgji zzw(byte[] arr_b, int v, int v1) {
        zzgji.q(v, v + v1, arr_b.length);
        byte[] arr_b1 = new byte[v1];
        System.arraycopy(arr_b, v, arr_b1, 0, v1);
        return new h9(arr_b1);
    }

    public static zzgji zzx(String s) {
        return new h9(s.getBytes(zzgla.a));
    }

    public static zzgji zzy(InputStream inputStream0) throws IOException {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0x100; true; v = Math.min(v + v, 0x2000)) {
            byte[] arr_b = new byte[v];
            int v1;
            for(v1 = 0; v1 < v; v1 += v2) {
                int v2 = inputStream0.read(arr_b, v1, v - v1);
                if(v2 == -1) {
                    break;
                }
            }
            zzgji zzgji0 = v1 == 0 ? null : zzgji.zzw(arr_b, 0, v1);
            if(zzgji0 == null) {
                break;
            }
            arrayList0.add(zzgji0);
        }
        return zzgji.zzu(arrayList0);
    }
}

