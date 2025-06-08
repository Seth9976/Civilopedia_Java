package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

public final class f3 implements zzeq {
    public final zzel a;
    public final long b;
    public final zzeq c;
    public long d;
    public Uri e;

    public f3(zzel zzel0, int v, zzeq zzeq0) {
        this.a = zzel0;
        this.b = (long)v;
        this.c = zzeq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] arr_b, int v, int v1) {
        int v6;
        long v2 = this.d;
        long v3 = this.b;
        if(v2 < v3) {
            int v4 = this.a.zza(arr_b, v, ((int)Math.min(v1, v3 - v2)));
            long v5 = this.d + ((long)v4);
            this.d = v5;
            v6 = v4;
            v2 = v5;
        }
        else {
            v6 = 0;
        }
        if(v2 >= v3) {
            int v7 = this.c.zza(arr_b, v + v6, v1 - v6);
            this.d += (long)v7;
            return v6 + v7;
        }
        return v6;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzev0) {
        long v4;
        long v2;
        zzev zzev2;
        this.e = zzev0.zza;
        long v = zzev0.zzf;
        zzev zzev1 = null;
        long v1 = this.b;
        if(v >= v1) {
            zzev2 = null;
            v2 = v1;
        }
        else {
            v2 = v1;
            zzev2 = new zzev(zzev0.zza, null, v, v, (zzev0.zzg == -1L ? v1 - v : Math.min(zzev0.zzg, v1 - v)), null, 0);
        }
        long v3 = zzev0.zzg;
        if(v3 == -1L) {
            v4 = Math.max(v2, zzev0.zzf);
            zzev1 = new zzev(zzev0.zza, null, v4, v4, (zzev0.zzg == -1L ? -1L : Math.min(zzev0.zzg, zzev0.zzf + zzev0.zzg - v2)), null, 0);
        }
        else if(zzev0.zzf + v3 > v2) {
            v4 = Math.max(v2, zzev0.zzf);
            zzev1 = new zzev(zzev0.zza, null, v4, v4, (zzev0.zzg == -1L ? -1L : Math.min(zzev0.zzg, zzev0.zzf + zzev0.zzg - v2)), null, 0);
        }
        long v5 = 0L;
        long v6 = zzev2 == null ? 0L : this.a.zzb(zzev2);
        if(zzev1 != null) {
            v5 = this.c.zzb(zzev1);
        }
        this.d = zzev0.zzf;
        return v6 == -1L || v5 == -1L ? -1L : v6 + v5;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        return this.e;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final void zzd() {
        this.a.zzd();
        this.c.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final Map zze() {
        return zzfrm.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final void zzf(zzfs zzfs0) {
    }
}

