package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;

public final class zzdy {
    public byte[] a;
    public int b;
    public int c;

    public zzdy() {
        this.a = zzeg.zzf;
    }

    public zzdy(int v) {
        this.a = new byte[v];
        this.c = v;
    }

    public zzdy(byte[] arr_b) {
        this.a = arr_b;
        this.c = arr_b.length;
    }

    public zzdy(byte[] arr_b, int v) {
        this.a = arr_b;
        this.c = v;
    }

    public final void zzA(zzdx zzdx0, int v) {
        this.zzB(zzdx0.zza, 0, v);
        zzdx0.zzh(0);
    }

    public final void zzB(byte[] arr_b, int v, int v1) {
        System.arraycopy(this.a, this.b, arr_b, v, v1);
        this.b += v1;
    }

    public final void zzC(int v) {
        this.zzD((this.a.length >= v ? this.a : new byte[v]), v);
    }

    public final void zzD(byte[] arr_b, int v) {
        this.a = arr_b;
        this.c = v;
        this.b = 0;
    }

    public final void zzE(int v) {
        zzcw.zzd(v >= 0 && v <= this.a.length);
        this.c = v;
    }

    public final void zzF(int v) {
        zzcw.zzd(v >= 0 && v <= this.c);
        this.b = v;
    }

    public final void zzG(int v) {
        this.zzF(this.b + v);
    }

    public final byte[] zzH() {
        return this.a;
    }

    public final int zza() {
        return this.c - this.b;
    }

    public final int zzb() {
        return this.a.length;
    }

    public final int zzc() {
        return this.b;
    }

    public final int zzd() {
        return this.c;
    }

    public final int zze() {
        int v = this.b;
        this.b = v + 4;
        return this.a[v + 3] & 0xFF | ((this.a[v] & 0xFF) << 24 | (this.a[v + 1] & 0xFF) << 16 | (this.a[v + 2] & 0xFF) << 8);
    }

    public final int zzf() {
        int v = this.b;
        this.b = v + 3;
        return this.a[v + 2] & 0xFF | ((this.a[v] & 0xFF) << 24 >> 8 | (this.a[v + 1] & 0xFF) << 8);
    }

    public final int zzg() {
        int v = this.b;
        this.b = v + 4;
        return (this.a[v + 3] & 0xFF) << 24 | (this.a[v] & 0xFF | (this.a[v + 1] & 0xFF) << 8 | (this.a[v + 2] & 0xFF) << 16);
    }

    public final int zzh() {
        int v = this.zzg();
        if(v < 0) {
            throw new IllegalStateException("Top bit not zero: " + v);
        }
        return v;
    }

    public final int zzi() {
        int v = this.b;
        this.b = v + 2;
        return (this.a[v + 1] & 0xFF) << 8 | this.a[v] & 0xFF;
    }

    public final int zzj() {
        return this.zzk() << 21 | this.zzk() << 14 | this.zzk() << 7 | this.zzk();
    }

    public final int zzk() {
        int v = this.b;
        this.b = v + 1;
        return this.a[v] & 0xFF;
    }

    public final int zzl() {
        int v = this.b;
        this.b = v + 4;
        return this.a[v + 1] & 0xFF | (this.a[v] & 0xFF) << 8;
    }

    public final int zzm() {
        int v = this.b;
        this.b = v + 3;
        return this.a[v + 2] & 0xFF | ((this.a[v] & 0xFF) << 16 | (this.a[v + 1] & 0xFF) << 8);
    }

    public final int zzn() {
        int v = this.zze();
        if(v < 0) {
            throw new IllegalStateException("Top bit not zero: " + v);
        }
        return v;
    }

    public final int zzo() {
        int v = this.b;
        this.b = v + 2;
        return this.a[v + 1] & 0xFF | (this.a[v] & 0xFF) << 8;
    }

    public final long zzp() {
        int v = this.b;
        this.b = v + 8;
        return (((long)this.a[v + 1]) & 0xFFL) << 8 | ((long)this.a[v]) & 0xFFL | (((long)this.a[v + 2]) & 0xFFL) << 16 | (((long)this.a[v + 3]) & 0xFFL) << 24 | (((long)this.a[v + 4]) & 0xFFL) << 0x20 | (((long)this.a[v + 5]) & 0xFFL) << 40 | (((long)this.a[v + 6]) & 0xFFL) << 0x30 | (((long)this.a[v + 7]) & 0xFFL) << 56;
    }

    public final long zzq() {
        int v = this.b;
        this.b = v + 4;
        return (((long)this.a[v + 1]) & 0xFFL) << 8 | ((long)this.a[v]) & 0xFFL | (((long)this.a[v + 2]) & 0xFFL) << 16 | (((long)this.a[v + 3]) & 0xFFL) << 24;
    }

    public final long zzr() {
        int v = this.b;
        this.b = v + 8;
        return (((long)this.a[v + 1]) & 0xFFL) << 0x30 | (((long)this.a[v]) & 0xFFL) << 56 | (((long)this.a[v + 2]) & 0xFFL) << 40 | (((long)this.a[v + 3]) & 0xFFL) << 0x20 | (((long)this.a[v + 4]) & 0xFFL) << 24 | (((long)this.a[v + 5]) & 0xFFL) << 16 | (((long)this.a[v + 6]) & 0xFFL) << 8 | ((long)this.a[v + 7]) & 0xFFL;
    }

    public final long zzs() {
        int v = this.b;
        this.b = v + 4;
        return (((long)this.a[v + 1]) & 0xFFL) << 16 | (((long)this.a[v]) & 0xFFL) << 24 | (((long)this.a[v + 2]) & 0xFFL) << 8 | ((long)this.a[v + 3]) & 0xFFL;
    }

    public final long zzt() {
        long v = this.zzr();
        if(v < 0L) {
            throw new IllegalStateException("Top bit not zero: " + v);
        }
        return v;
    }

    public final long zzu() {
        int v3;
        int v2;
        long v = (long)this.a[this.b];
        for(int v1 = 7; true; --v1) {
            v2 = 0;
            v3 = 1;
            if(v1 < 0) {
                break;
            }
            if((((long)(1 << v1)) & v) == 0L) {
                if(v1 < 6) {
                    v &= (long)((1 << v1) - 1);
                    v2 = 7 - v1;
                    break;
                }
                if(v1 != 7) {
                    break;
                }
                v2 = 1;
                break;
            }
        }
        if(v2 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + v);
        }
        while(v3 < v2) {
            int v4 = this.a[this.b + v3];
            if((v4 & 0xC0) != 0x80) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + v);
            }
            v = v << 6 | ((long)(v4 & 0x3F));
            ++v3;
        }
        this.b += v2;
        return v;
    }

    public final String zzv(char c) {
        int v = this.b;
        if(this.c - v != 0) {
            while(v < this.c && this.a[v] != 0) {
                ++v;
            }
            String s = zzeg.zzI(this.a, this.b, v - this.b);
            this.b = v;
            if(v < this.c) {
                this.b = v + 1;
            }
            return s;
        }
        return null;
    }

    public final String zzw(int v) {
        if(v == 0) {
            return "";
        }
        int v1 = this.b + v - 1;
        String s = zzeg.zzI(this.a, this.b, (v1 >= this.c || this.a[v1] != 0 ? v : v - 1));
        this.b += v;
        return s;
    }

    public final String zzx(int v, Charset charset0) {
        int v1 = this.b;
        String s = new String(this.a, v1, v, charset0);
        this.b = v1 + v;
        return s;
    }

    public final short zzy() {
        int v = this.b;
        this.b = v + 2;
        return (short)(this.a[v + 1] & 0xFF | (this.a[v] & 0xFF) << 8);
    }

    public final void zzz(int v) {
        byte[] arr_b = this.a;
        if(v > arr_b.length) {
            this.a = Arrays.copyOf(arr_b, v);
        }
    }
}

