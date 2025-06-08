package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;

public final class zzgjf extends OutputStream {
    public final int i;
    public final ArrayList j;
    public int k;
    public byte[] l;
    public int m;
    public static final byte[] n;

    static {
        zzgjf.n = new byte[0];
    }

    public zzgjf() {
        this.i = 0x80;
        this.j = new ArrayList();
        this.l = new byte[0x80];
    }

    public final void a(int v) {
        h9 h90 = new h9(this.l);
        this.j.add(h90);
        int v1 = this.k + this.l.length;
        this.k = v1;
        this.l = new byte[Math.max(this.i, Math.max(v, v1 >>> 1))];
        this.m = 0;
    }

    @Override
    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), this.zza());
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
            int v4 = arr_b1.length - v3;
            if(v1 <= v4) {
                System.arraycopy(arr_b, v, arr_b1, v3, v1);
                this.m += v1;
                return;
            }
            System.arraycopy(arr_b, v, arr_b1, v3, v4);
            int v5 = v1 - v4;
            this.a(v5);
            System.arraycopy(arr_b, v + v4, this.l, 0, v5);
            this.m = v5;
        }
    }

    public final int zza() {
        synchronized(this) {
        }
        return this.k + this.m;
    }

    public final zzgji zzb() {
        synchronized(this) {
            int v1 = this.m;
            byte[] arr_b = this.l;
            if(v1 >= arr_b.length) {
                h9 h91 = new h9(this.l);
                this.j.add(h91);
                this.l = zzgjf.n;
            }
            else if(v1 > 0) {
                byte[] arr_b1 = new byte[v1];
                System.arraycopy(arr_b, 0, arr_b1, 0, Math.min(arr_b.length, v1));
                h9 h90 = new h9(arr_b1);
                this.j.add(h90);
            }
            this.k += this.m;
            this.m = 0;
            return zzgji.zzu(this.j);
        }
    }

    public final void zzc() {
        synchronized(this) {
            this.j.clear();
            this.k = 0;
            this.m = 0;
        }
    }
}

