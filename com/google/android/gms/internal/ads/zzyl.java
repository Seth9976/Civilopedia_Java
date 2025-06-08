package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

public final class zzyl implements zzys {
    public final byte[] a;
    public final zzp b;
    public final long c;
    public long d;
    public byte[] e;
    public int f;
    public int g;

    static {
        zzbc.zzb("media3.extractor");
    }

    public zzyl(zzp zzp0, long v, long v1) {
        this.b = zzp0;
        this.d = v;
        this.c = v1;
        this.e = new byte[0x10000];
        this.a = new byte[0x1000];
    }

    public final int a(byte[] arr_b, int v, int v1, int v2, boolean z) {
        if(Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int v3 = this.b.zza(arr_b, v + v2, v1 - v2);
        if(v3 == -1) {
            if(v2 != 0 || !z) {
                throw new EOFException();
            }
            return -1;
        }
        return v2 + v3;
    }

    public final void b(int v) {
        int v1 = this.f + v;
        int v2 = this.e.length;
        if(v1 > v2) {
            this.e = Arrays.copyOf(this.e, zzeg.zzf(v2 + v2, v1 + 0x10000, v1 + 0x80000));
        }
    }

    public final void c(int v) {
        int v1 = this.g - v;
        this.g = v1;
        this.f = 0;
        byte[] arr_b = this.e;
        byte[] arr_b1 = v1 >= arr_b.length - 0x80000 ? arr_b : new byte[v1 + 0x10000];
        System.arraycopy(arr_b, v, arr_b1, 0, v1);
        this.e = arr_b1;
    }

    @Override  // com.google.android.gms.internal.ads.zzys
    public final int zza(byte[] arr_b, int v, int v1) throws IOException {
        int v2 = this.g;
        int v3 = 0;
        if(v2 != 0) {
            int v4 = Math.min(v2, v1);
            System.arraycopy(this.e, 0, arr_b, v, v4);
            this.c(v4);
            v3 = v4;
        }
        if(v3 == 0) {
            v3 = this.a(arr_b, v, v1, 0, true);
        }
        if(v3 != -1) {
            this.d += (long)v3;
        }
        return v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzys
    public final int zzb(byte[] arr_b, int v, int v1) throws IOException {
        int v4;
        this.b(v1);
        int v2 = this.f;
        int v3 = this.g - v2;
        if(v3 == 0) {
            v4 = this.a(this.e, v2, v1, 0, true);
            if(v4 == -1) {
                return -1;
            }
            this.g += v4;
        }
        else {
            v4 = Math.min(v1, v3);
        }
        System.arraycopy(this.e, this.f, arr_b, v, v4);
        this.f += v4;
        return v4;
    }

    @Override  // com.google.android.gms.internal.ads.zzys
    public final int zzc(int v) throws IOException {
        int v1 = Math.min(this.g, 1);
        this.c(v1);
        if(v1 == 0) {
            v1 = this.a(this.a, 0, 1, 0, true);
        }
        if(v1 != -1) {
            this.d += (long)v1;
        }
        return v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzys
    public final long zzd() {
        return this.c;
    }

    @Override  // com.google.android.gms.internal.ads.zzys
    public final long zze() {
        return this.d + ((long)this.f);
    }

    @Override  // com.google.android.gms.internal.ads.zzys
    public final long zzf() {
        return this.d;
    }

    @Override  // com.google.android.gms.internal.ads.zzys
    public final void zzg(int v) throws IOException {
        this.zzl(v, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzys
    public final void zzh(byte[] arr_b, int v, int v1) throws IOException {
        this.zzm(arr_b, v, v1, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzys
    public final void zzi(byte[] arr_b, int v, int v1) throws IOException {
        this.zzn(arr_b, v, v1, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzys
    public final void zzj() {
        this.f = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzys
    public final void zzk(int v) throws IOException {
        this.zzo(v, false);
    }

    public final boolean zzl(int v, boolean z) throws IOException {
        this.b(v);
        int v1 = this.g - this.f;
        while(v1 < v) {
            v1 = this.a(this.e, this.f, v, v1, z);
            if(v1 == -1) {
                return false;
            }
            this.g = this.f + v1;
        }
        this.f += v;
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzys
    public final boolean zzm(byte[] arr_b, int v, int v1, boolean z) throws IOException {
        if(!this.zzl(v1, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - v1, arr_b, v, v1);
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzys
    public final boolean zzn(byte[] arr_b, int v, int v1, boolean z) throws IOException {
        int v3;
        int v2 = this.g;
        if(v2 == 0) {
            v3 = 0;
        }
        else {
            v3 = Math.min(v2, v1);
            System.arraycopy(this.e, 0, arr_b, v, v3);
            this.c(v3);
        }
        int v4;
        for(v4 = v3; v4 < v1 && v4 != -1; v4 = this.a(arr_b, v, v1, v4, z)) {
        }
        if(v4 != -1) {
            this.d += (long)v4;
        }
        return v4 != -1;
    }

    public final boolean zzo(int v, boolean z) throws IOException {
        int v1 = Math.min(this.g, v);
        this.c(v1);
        int v2;
        for(v2 = v1; v2 < v && v2 != -1; v2 = this.a(this.a, -v2, Math.min(v, v2 + 0x1000), v2, false)) {
        }
        if(v2 != -1) {
            this.d += (long)v2;
        }
        return v2 != -1;
    }
}

