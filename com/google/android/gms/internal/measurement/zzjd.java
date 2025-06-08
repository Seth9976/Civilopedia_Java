package com.google.android.gms.internal.measurement;

import A.f;
import i3.e;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

public abstract class zzjd implements Serializable, Iterable {
    public int i;
    public static final zzjd zzb;

    static {
        zzjd.zzb = new O(zzkm.zzd);
    }

    public abstract byte a(int arg1);

    @Override
    public abstract boolean equals(Object arg1);

    public abstract int h(int arg1, int arg2);

    @Override
    public final int hashCode() {
        int v = this.i;
        if(v == 0) {
            int v1 = this.zzd();
            v = this.h(v1, v1);
            if(v == 0) {
                v = 1;
            }
            this.i = v;
        }
        return v;
    }

    public abstract String i(Charset arg1);

    @Override
    public final Iterator iterator() {
        return new M(this);
    }

    public abstract void j(Q arg1);

    public static int k(int v, int v1, int v2) {
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
            s1 = j0.b(this);
            return e.h(f.m(v, "<ByteString@", s, " size=", " contents=\""), s1, "\">");
        }
        s1 = j0.b(this.zzf(0, 0x2F)) + "...";
        return e.h(f.m(v, "<ByteString@", s, " size=", " contents=\""), s1, "\">");
    }

    public abstract byte zza(int arg1);

    public abstract int zzd();

    public abstract zzjd zzf(int arg1, int arg2);

    public abstract boolean zzi();

    public static zzjd zzl(byte[] arr_b, int v, int v1) {
        zzjd.k(v, v + v1, arr_b.length);
        byte[] arr_b1 = new byte[v1];
        System.arraycopy(arr_b, v, arr_b1, 0, v1);
        return new O(arr_b1);
    }

    public static zzjd zzm(String s) {
        return new O(s.getBytes(zzkm.a));
    }

    public final String zzn(Charset charset0) {
        return this.zzd() == 0 ? "" : this.i(charset0);
    }
}

