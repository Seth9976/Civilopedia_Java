package com.google.android.gms.internal.ads;

public enum zzbdw implements zzgks {
    AD_INITIATER_UNSPECIFIED(0),
    BANNER(1),
    DFP_BANNER(2),
    INTERSTITIAL(3),
    DFP_INTERSTITIAL(4),
    NATIVE_EXPRESS(5),
    AD_LOADER(6),
    REWARD_BASED_VIDEO_AD(7),
    BANNER_SEARCH_ADS(8),
    GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
    APP_OPEN(10),
    REWARDED_INTERSTITIAL(11);

    public final int i;

    public zzbdw(int v1) {
        this.i = v1;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.i);
    }

    public final int zza() {
        return this.i;
    }

    public static zzbdw zzb(int v) {
        switch(v) {
            case 0: {
                return zzbdw.zza;
            }
            case 1: {
                return zzbdw.zzb;
            }
            case 2: {
                return zzbdw.zzc;
            }
            case 3: {
                return zzbdw.zzd;
            }
            case 4: {
                return zzbdw.zze;
            }
            case 5: {
                return zzbdw.zzf;
            }
            case 6: {
                return zzbdw.zzg;
            }
            case 7: {
                return zzbdw.zzh;
            }
            case 8: {
                return zzbdw.zzi;
            }
            case 9: {
                return zzbdw.zzj;
            }
            case 10: {
                return zzbdw.zzk;
            }
            case 11: {
                return zzbdw.zzl;
            }
            default: {
                return null;
            }
        }
    }

    public static zzgku zzc() {
        return w0.j;
    }
}

