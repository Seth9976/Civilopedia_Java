package com.google.android.gms.internal.ads;

public final class zzzk {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public final boolean zza(int v) {
        if((v & 0xFFE00000) != 0xFFE00000) {
            return false;
        }
        int v1 = v >>> 19 & 3;
        if(v1 == 1) {
            return false;
        }
        int v2 = v >>> 17 & 3;
        if(v2 == 0) {
            return false;
        }
        int v3 = v >>> 12 & 15;
        if(v3 != 0 && v3 != 15) {
            int v4 = v >>> 10 & 3;
            if(v4 == 3) {
                return false;
            }
            this.zza = v1;
            this.zzb = zzzl.a[3 - v2];
            int v5 = zzzl.b[v4];
            this.zzd = v5;
            int v6 = 2;
            if(v1 == 2) {
                v5 /= 2;
                this.zzd = v5;
            }
            else if(v1 == 0) {
                v5 /= 4;
                this.zzd = v5;
            }
            int v7 = v >>> 9 & 1;
            int v8 = 0x480;
            if(v2 == 1) {
                if(v1 != 3) {
                    v8 = 0x240;
                }
            }
            else if(v2 != 2) {
                v8 = 0x180;
            }
            int v9 = 0x90;
            this.zzg = v8;
            if(v2 == 3) {
                int v10 = v1 == 3 ? zzzl.c[v3 - 1] : zzzl.d[v3 - 1];
                this.zzf = v10;
                this.zzc = (v10 * 12 / v5 + v7) * 4;
            }
            else if(v1 == 3) {
                int v11 = v2 == 2 ? zzzl.e[v3 - 1] : zzzl.f[v3 - 1];
                this.zzf = v11;
                this.zzc = v11 * 0x90 / v5 + v7;
            }
            else {
                int v12 = zzzl.g[v3 - 1];
                this.zzf = v12;
                if(v2 == 1) {
                    v9 = 72;
                }
                this.zzc = v9 * v12 / v5 + v7;
            }
            if((v >> 6 & 3) == 3) {
                v6 = 1;
            }
            this.zze = v6;
            return true;
        }
        return false;
    }
}

