package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzdwc;
import com.google.android.gms.internal.ads.zzdwm;
import com.google.android.gms.internal.ads.zzfcd;

public final class zzf {
    public static String zza(String s) {
        if(TextUtils.isEmpty(s)) {
            return "unspecified";
        }
        switch(s) {
            case "requester_type_0": {
                return "0";
            }
            case "requester_type_1": {
                return "1";
            }
            case "requester_type_2": {
                return "2";
            }
            case "requester_type_3": {
                return "3";
            }
            case "requester_type_4": {
                return "4";
            }
            case "requester_type_5": {
                return "5";
            }
            case "requester_type_6": {
                return "6";
            }
            case "requester_type_7": {
                return "7";
            }
            default: {
                return s;
            }
        }
    }

    public static String zzb(zzl zzl0) {
        return zzl0.zzc == null ? "unspecified" : zzl0.zzc.getString("query_info_type");
    }

    public static void zzc(zzdwm zzdwm0, zzdwc zzdwc0, String s, Pair[] arr_pair) {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzfX)).booleanValue()) {
            return;
        }
        zze zze0 = new zze(zzdwm0, zzdwc0, s, arr_pair);
        zzcfv.zza.execute(zze0);
    }

    public static int zzd(zzfcd zzfcd0) {
        if(zzfcd0.zzq) {
            return 2;
        }
        zzl zzl0 = zzfcd0.zzd;
        zzc zzc0 = zzl0.zzs;
        if(zzc0 == null && zzl0.zzx == null) {
            return 1;
        }
        if(zzc0 != null && zzl0.zzx != null) {
            return 5;
        }
        return zzc0 == null ? 4 : 3;
    }
}

