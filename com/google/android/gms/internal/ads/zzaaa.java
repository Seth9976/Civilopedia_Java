package com.google.android.gms.internal.ads;

public final class zzaaa {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;

    public zzaaa(byte[] arr_b) {
        this.a = arr_b;
        this.b = arr_b.length;
    }

    public final int zza() {
        return this.c * 8 + this.d;
    }

    public final int zzb(int v) {
        int v1 = Math.min(v, 8 - this.d);
        int v2 = this.c + 1;
        byte[] arr_b = this.a;
        int v3 = (arr_b[this.c] & 0xFF) >> this.d & 0xFF >> 8 - v1;
        while(v1 < v) {
            v3 |= (arr_b[v2] & 0xFF) << v1;
            v1 += 8;
            ++v2;
        }
        this.zzc(v);
        return -1 >>> 0x20 - v & v3;
    }

    public final void zzc(int v) {
        int v1 = this.c + v / 8;
        this.c = v1;
        int v2 = v - v / 8 * 8 + this.d;
        this.d = v2;
        if(v2 > 7) {
            ++v1;
            this.c = v1;
            v2 += -8;
            this.d = v2;
        }
        zzcw.zzf(v1 >= 0 && (v1 < this.b || v1 == this.b && v2 == 0));
    }

    public final boolean zzd() {
        int v = this.a[this.c];
        int v1 = this.d;
        this.zzc(1);
        return 1 == ((v & 0xFF) >> v1 & 1);
    }
}

