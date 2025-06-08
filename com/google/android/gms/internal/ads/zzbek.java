package com.google.android.gms.internal.ads;

public enum zzbek implements zzgks {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);

    public final int i;

    public zzbek(int v1) {
        this.i = v1;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.i);
    }

    public final int zza() {
        return this.i;
    }

    public static zzbek zzb(int v) {
        switch(v) {
            case 0: {
                return zzbek.zza;
            }
            case 1: {
                return zzbek.zzb;
            }
            case 2: {
                return zzbek.zzc;
            }
            case 3: {
                return zzbek.zzd;
            }
            case 4: {
                return zzbek.zze;
            }
            case 5: {
                return zzbek.zzf;
            }
            case 6: {
                return zzbek.zzg;
            }
            case 7: {
                return zzbek.zzh;
            }
            case 8: {
                return zzbek.zzi;
            }
            case 9: {
                return zzbek.zzj;
            }
            case 10: {
                return zzbek.zzk;
            }
            default: {
                return null;
            }
        }
    }

    public static zzgku zzc() {
        return w0.l;
    }
}

