package com.google.android.gms.internal.ads;

public final class zzzq {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;

    public zzzq(byte[] arr_b, int v, int v1) {
        this.a = arr_b;
        this.c = v;
        this.b = v1;
        this.d = 0;
        this.a();
    }

    public final void a() {
        zzcw.zzf(this.c >= 0 && (this.c < this.b || this.c == this.b && this.d == 0));
    }

    public final boolean b(int v) {
        return v >= 2 && v < this.b && (this.a[v] == 3 && this.a[v - 2] == 0 && this.a[v - 1] == 0);
    }

    public final int zza(int v) {
        byte[] arr_b;
        int v3;
        int v2;
        this.d += v;
        int v1 = 0;
        while(true) {
            v2 = this.d;
            v3 = 2;
            arr_b = this.a;
            if(v2 <= 8) {
                break;
            }
            this.d = v2 - 8;
            int v4 = this.c;
            v1 |= (arr_b[v4] & 0xFF) << v2 - 8;
            if(!this.b(v4 + 1)) {
                v3 = 1;
            }
            this.c = v4 + v3;
        }
        int v5 = this.c;
        int v6 = -1 >>> 0x20 - v & (v1 | (arr_b[v5] & 0xFF) >> 8 - v2);
        if(v2 == 8) {
            this.d = 0;
            if(!this.b(v5 + 1)) {
                v3 = 1;
            }
            this.c = v5 + v3;
        }
        this.a();
        return v6;
    }

    public final int zzb() {
        int v2;
        int v = 0;
        int v1;
        for(v1 = 0; true; ++v1) {
            v2 = -1;
            if(this.zzf()) {
                break;
            }
        }
        if(v1 > 0) {
            v = this.zza(v1);
        }
        int v3 = (1 << v1) - 1 + v;
        if(v3 % 2 != 0) {
            v2 = 1;
        }
        return (v3 + 1) / 2 * v2;
    }

    public final int zzc() {
        int v = 0;
        int v1;
        for(v1 = 0; !this.zzf(); ++v1) {
        }
        if(v1 > 0) {
            v = this.zza(v1);
        }
        return (1 << v1) - 1 + v;
    }

    public final void zzd() {
        int v = 1;
        int v1 = this.d + 1;
        this.d = v1;
        if(v1 == 8) {
            this.d = 0;
            int v2 = this.c;
            if(this.b(v2 + 1)) {
                v = 2;
            }
            this.c = v2 + v;
        }
        this.a();
    }

    public final void zze(int v) {
        int v1 = this.c;
        int v2 = v1 + v / 8;
        this.c = v2;
        int v3 = v - v / 8 * 8 + this.d;
        this.d = v3;
        if(v3 > 7) {
            this.c = v2 + 1;
            this.d = v3 - 8;
        }
        while(true) {
            ++v1;
            if(v1 > this.c) {
                break;
            }
            if(this.b(v1)) {
                ++this.c;
                v1 += 2;
            }
        }
        this.a();
    }

    public final boolean zzf() {
        boolean z = (this.a[this.c] & 0x80 >> this.d) != 0;
        this.zzd();
        return z;
    }
}

