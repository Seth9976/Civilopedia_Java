package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

public final class zzatv {
    public final zzayj a;
    public final long b;
    public long c;
    public byte[] d;
    public int e;
    public int f;
    public static final byte[] g;

    static {
        zzatv.g = new byte[0x1000];
    }

    public zzatv(zzayj zzayj0, long v, long v1) {
        this.a = zzayj0;
        this.c = v;
        this.b = v1;
        this.d = new byte[0x10000];
    }

    public final int a(byte[] arr_b, int v, int v1, int v2, boolean z) {
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        int v3 = this.a.zza(arr_b, v + v2, v1 - v2);
        if(v3 == -1) {
            if(v2 != 0 || !z) {
                throw new EOFException();
            }
            return -1;
        }
        return v2 + v3;
    }

    public final void b(int v) {
        int v1 = this.f - v;
        this.f = v1;
        this.e = 0;
        byte[] arr_b = this.d;
        byte[] arr_b1 = v1 >= arr_b.length - 0x80000 ? arr_b : new byte[v1 + 0x10000];
        System.arraycopy(arr_b, v, arr_b1, 0, v1);
        this.d = arr_b1;
    }

    public final int zza(byte[] arr_b, int v, int v1) throws IOException, InterruptedException {
        int v2 = this.f;
        int v3 = 0;
        if(v2 != 0) {
            int v4 = Math.min(v2, v1);
            System.arraycopy(this.d, 0, arr_b, v, v4);
            this.b(v4);
            v3 = v4;
        }
        if(v3 == 0) {
            v3 = this.a(arr_b, v, v1, 0, true);
        }
        if(v3 != -1) {
            this.c += (long)v3;
        }
        return v3;
    }

    public final int zzb(int v) throws IOException, InterruptedException {
        int v1 = Math.min(this.f, v);
        this.b(v1);
        if(v1 == 0) {
            v1 = this.a(zzatv.g, 0, Math.min(v, 0x1000), 0, true);
        }
        if(v1 != -1) {
            this.c += (long)v1;
        }
        return v1;
    }

    public final long zzc() {
        return this.b;
    }

    public final long zzd() {
        return this.c;
    }

    public final void zze() {
        this.e = 0;
    }

    public final boolean zzf(int v, boolean z) throws IOException, InterruptedException {
        int v1 = this.e + v;
        int v2 = this.d.length;
        if(v1 > v2) {
            this.d = Arrays.copyOf(this.d, zzazo.zze(v2 + v2, v1 + 0x10000, v1 + 0x80000));
        }
        int v3 = Math.min(this.f - this.e, v);
        while(v3 < v) {
            v3 = this.a(this.d, this.e, v, v3, false);
            if(v3 == -1) {
                return false;
            }
            if(false) {
                break;
            }
        }
        int v4 = this.e + v;
        this.e = v4;
        this.f = Math.max(this.f, v4);
        return true;
    }

    public final boolean zzg(byte[] arr_b, int v, int v1, boolean z) throws IOException, InterruptedException {
        if(!this.zzf(v1, false)) {
            return false;
        }
        System.arraycopy(this.d, this.e - v1, arr_b, v, v1);
        return true;
    }

    public final boolean zzh(byte[] arr_b, int v, int v1, boolean z) throws IOException, InterruptedException {
        int v3;
        int v2 = this.f;
        if(v2 == 0) {
            v3 = 0;
        }
        else {
            v3 = Math.min(v2, v1);
            System.arraycopy(this.d, 0, arr_b, v, v3);
            this.b(v3);
        }
        int v4;
        for(v4 = v3; v4 < v1 && v4 != -1; v4 = this.a(arr_b, v, v1, v4, z)) {
        }
        if(v4 != -1) {
            this.c += (long)v4;
        }
        return v4 != -1;
    }

    public final boolean zzi(int v, boolean z) throws IOException, InterruptedException {
        int v1 = Math.min(this.f, v);
        this.b(v1);
        int v2;
        for(v2 = v1; v2 < v && v2 != -1; v2 = this.a(zzatv.g, -v2, Math.min(v, v2 + 0x1000), v2, false)) {
        }
        if(v2 != -1) {
            this.c += (long)v2;
        }
        return v2 != -1;
    }
}

