package com.google.android.gms.internal.ads;

public final class zzazg {
    public int a;
    public int b;
    public final int c;
    public byte[] zza;

    public zzazg() {
    }

    public zzazg(byte[] arr_b, int v) {
        this.zza = arr_b;
        this.c = v;
    }

    public final int zza(int v) {
        int v9;
        int v1 = v >> 3;
        boolean z = false;
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            int v4 = this.b;
            int v5 = v4 == 0 ? this.zza[this.a] : (this.zza[this.a + 1] & 0xFF) >>> 8 - v4 | (this.zza[this.a] & 0xFF) << v4;
            v += -8;
            v3 |= (0xFF & v5) << v;
            ++this.a;
        }
        if(v > 0) {
            int v6 = this.b + v;
            int v7 = (byte)(0xFF >> 8 - v);
            if(v6 > 8) {
                int v8 = this.a + 1;
                v9 = v7 & ((0xFF & this.zza[v8]) >> 16 - v6 | (this.zza[this.a] & 0xFF) << v6 - 8) | v3;
                this.a = v8;
            }
            else {
                int v10 = this.a;
                v9 = v7 & (0xFF & this.zza[v10]) >> 8 - v6 | v3;
                if(v6 == 8) {
                    this.a = v10 + 1;
                }
            }
            v3 = v9;
            this.b = v6 % 8;
        }
        if(this.a >= 0 && (this.b >= 0 && (this.a < this.c || this.a == this.c && this.b == 0))) {
            z = true;
        }
        zzayz.zze(z);
        return v3;
    }
}

