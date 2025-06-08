package com.google.android.gms.internal.ads;

public final class zzdx {
    public int a;
    public int b;
    public int c;
    public byte[] zza;

    public zzdx() {
        this.zza = zzeg.zzf;
    }

    public zzdx(byte[] arr_b, int v) {
        this.zza = arr_b;
        this.c = v;
    }

    public final void a() {
        zzcw.zzf(this.a >= 0 && (this.a < this.c || this.a == this.c && this.b == 0));
    }

    public final int zza() {
        return (this.c - this.a) * 8 - this.b;
    }

    public final int zzb() {
        return this.a * 8 + this.b;
    }

    public final int zzc(int v) {
        if(v == 0) {
            return 0;
        }
        this.b += v;
        int v1 = 0;
        int v2;
        while((v2 = this.b) > 8) {
            this.b = v2 - 8;
            int v3 = this.a;
            this.a = v3 + 1;
            v1 |= (this.zza[v3] & 0xFF) << v2 - 8;
        }
        int v4 = this.a;
        int v5 = -1 >>> 0x20 - v & (v1 | (this.zza[v4] & 0xFF) >> 8 - v2);
        if(v2 == 8) {
            this.b = 0;
            this.a = v4 + 1;
        }
        this.a();
        return v5;
    }

    public final void zzd() {
        if(this.b == 0) {
            return;
        }
        this.b = 0;
        ++this.a;
        this.a();
    }

    public final void zze(int v, int v1) {
        int v2 = Math.min(8 - this.b, 14);
        int v3 = 8 - this.b - v2;
        byte[] arr_b = this.zza;
        int v4 = this.a;
        byte b = (byte)((0xFF00 >> this.b | (1 << v3) - 1) & arr_b[v4]);
        arr_b[v4] = b;
        int v5 = 14 - v2;
        arr_b[v4] = (byte)(b | (v & 0x3FFF) >>> v5 << v3);
        int v6;
        for(v6 = v4 + 1; v5 > 8; ++v6) {
            v5 += -8;
            this.zza[v6] = (byte)((v & 0x3FFF) >>> v5);
        }
        byte[] arr_b1 = this.zza;
        byte b1 = (byte)(arr_b1[v6] & (1 << 8 - v5) - 1);
        arr_b1[v6] = b1;
        arr_b1[v6] = (byte)((v & 0x3FFF & (1 << v5) - 1) << 8 - v5 | b1);
        this.zzj(14);
        this.a();
    }

    public final void zzf(byte[] arr_b, int v, int v1) {
        for(int v2 = 0; v2 < v1 >> 3; ++v2) {
            byte[] arr_b1 = this.zza;
            int v3 = this.a;
            this.a = v3 + 1;
            int v4 = this.b;
            byte b = (byte)(arr_b1[v3] << v4);
            arr_b[v2] = b;
            arr_b[v2] = (byte)((0xFF & arr_b1[v3 + 1]) >> 8 - v4 | b);
        }
        if((v1 & 7) == 0) {
            return;
        }
        byte b1 = (byte)(arr_b[v1 >> 3] & 0xFF >> (v1 & 7));
        arr_b[v1 >> 3] = b1;
        int v5 = this.b;
        if(v5 + (v1 & 7) > 8) {
            int v6 = this.a;
            this.a = v6 + 1;
            b1 = (byte)(b1 | (this.zza[v6] & 0xFF) << v5);
            arr_b[v1 >> 3] = b1;
            v5 += -8;
        }
        int v7 = v5 + (v1 & 7);
        this.b = v7;
        int v8 = this.a;
        arr_b[v1 >> 3] = (byte)(((byte)((0xFF & this.zza[v8]) >> 8 - v7 << 8 - (v1 & 7))) | b1);
        if(v7 == 8) {
            this.b = 0;
            this.a = v8 + 1;
        }
        this.a();
    }

    public final void zzg(byte[] arr_b, int v) {
        this.zza = arr_b;
        this.a = 0;
        this.b = 0;
        this.c = v;
    }

    public final void zzh(int v) {
        this.a = v / 8;
        this.b = v - v / 8 * 8;
        this.a();
    }

    public final void zzi() {
        int v = this.b + 1;
        this.b = v;
        if(v == 8) {
            this.b = 0;
            ++this.a;
        }
        this.a();
    }

    public final void zzj(int v) {
        int v1 = this.a + v / 8;
        this.a = v1;
        int v2 = v - v / 8 * 8 + this.b;
        this.b = v2;
        if(v2 > 7) {
            this.a = v1 + 1;
            this.b = v2 - 8;
        }
        this.a();
    }

    public final void zzk(int v) {
        zzcw.zzf(this.b == 0);
        this.a += v;
        this.a();
    }

    public final boolean zzl() {
        boolean z = (this.zza[this.a] & 0x80 >> this.b) != 0;
        this.zzi();
        return z;
    }
}

