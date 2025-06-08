package com.google.android.gms.internal.ads;

public final class zzazi {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;

    public zzazi(byte[] arr_b, int v, int v1) {
        this.a = arr_b;
        this.c = v;
        this.b = v1;
        this.d = 0;
        this.a();
    }

    public final void a() {
        zzayz.zze(this.c >= 0 && (this.d >= 0 && this.d < 8 && (this.c < this.b || this.c == this.b && this.d == 0)));
    }

    public final boolean b(int v) {
        return v >= 2 && v < this.b && (this.a[v] == 3 && this.a[v - 2] == 0 && this.a[v - 1] == 0);
    }

    public final int zza(int v) {
        int v10;
        byte[] arr_b;
        int v1 = v >> 3;
        int v3 = 0;
        for(int v2 = 0; true; ++v2) {
            arr_b = this.a;
            if(v2 >= v1) {
                break;
            }
            int v4 = this.b(this.c + 1) ? this.c + 2 : this.c + 1;
            int v5 = this.d;
            int v6 = v5 == 0 ? arr_b[this.c] : (arr_b[v4] & 0xFF) >>> 8 - v5 | (arr_b[this.c] & 0xFF) << v5;
            v += -8;
            v3 |= (v6 & 0xFF) << v;
            this.c = v4;
        }
        if(v > 0) {
            int v7 = this.d + v;
            int v8 = (byte)(0xFF >> 8 - v);
            int v9 = this.b(this.c + 1) ? this.c + 2 : this.c + 1;
            if(v7 > 8) {
                v10 = v8 & ((arr_b[v9] & 0xFF) >> 16 - v7 | (arr_b[this.c] & 0xFF) << v7 - 8) | v3;
                this.c = v9;
            }
            else {
                v10 = v8 & (arr_b[this.c] & 0xFF) >> 8 - v7 | v3;
                if(v7 == 8) {
                    this.c = v9;
                }
            }
            v3 = v10;
            this.d = v7 % 8;
        }
        this.a();
        return v3;
    }

    public final int zzb() {
        int v2;
        int v = 0;
        int v1;
        for(v1 = 0; true; ++v1) {
            v2 = -1;
            if(this.zze()) {
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
        for(v1 = 0; !this.zze(); ++v1) {
        }
        if(v1 > 0) {
            v = this.zza(v1);
        }
        return (1 << v1) - 1 + v;
    }

    public final void zzd(int v) {
        int v1 = this.c;
        int v2 = (v >> 3) + v1;
        this.c = v2;
        int v3 = this.d + (v & 7);
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

    public final boolean zze() {
        return this.zza(1) == 1;
    }
}

