package com.google.android.gms.ads;

import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class zzb {
    public static int zza(AdSize adSize0) {
        return adSize0.f;
    }

    public static int zzb(AdSize adSize0) {
        return adSize0.h;
    }

    public static AdSize zzc(int v, int v1, String s) {
        return new AdSize(v, v1, s);
    }

    public static AdSize zzd(int v, int v1) {
        AdSize adSize0 = new AdSize(v, v1);
        adSize0.e = true;
        adSize0.f = v1;
        return adSize0;
    }

    public static AdSize zze(int v, int v1) {
        AdSize adSize0 = new AdSize(v, v1);
        adSize0.g = true;
        adSize0.h = v1;
        return adSize0;
    }

    public static boolean zzf(AdSize adSize0) {
        return adSize0.d;
    }

    public static boolean zzg(AdSize adSize0) {
        return adSize0.e;
    }

    public static boolean zzh(AdSize adSize0) {
        return adSize0.g;
    }
}

