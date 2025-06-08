package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzq;

public final class zzcmx {
    public final int a;
    public final int zza;
    public final int zzb;

    public zzcmx(int v, int v1, int v2) {
        this.a = v;
        this.zzb = v1;
        this.zza = v2;
    }

    public static zzcmx zza() {
        return new zzcmx(0, 0, 0);
    }

    public static zzcmx zzb(int v, int v1) {
        return new zzcmx(1, v, v1);
    }

    public static zzcmx zzc(zzq zzq0) {
        if(zzq0.zzd) {
            return new zzcmx(3, 0, 0);
        }
        if(zzq0.zzi) {
            return new zzcmx(2, 0, 0);
        }
        return zzq0.zzh ? zzcmx.zza() : zzcmx.zzb(zzq0.zzf, zzq0.zzc);
    }

    public static zzcmx zzd() {
        return new zzcmx(5, 0, 0);
    }

    public static zzcmx zze() {
        return new zzcmx(4, 0, 0);
    }

    public final boolean zzf() {
        return this.a == 0;
    }

    public final boolean zzg() {
        return this.a == 2;
    }

    public final boolean zzh() {
        return this.a == 5;
    }

    public final boolean zzi() {
        return this.a == 3;
    }

    public final boolean zzj() {
        return this.a == 4;
    }
}

