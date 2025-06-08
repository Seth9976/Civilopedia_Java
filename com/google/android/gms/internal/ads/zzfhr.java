package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.regex.Pattern;

public final class zzfhr {
    public static void zza(zzfvl zzfvl0, zzfhs zzfhs0, zzfhh zzfhh0) {
        if(((Boolean)zzbji.zzc.zze()).booleanValue()) {
            zzfvc.zzr(zzfut.zzv(zzfvl0), new v5(zzfhs0, zzfhh0, false), zzcfv.zzf);
        }
    }

    public static void zzb(zzfvl zzfvl0, zzfhs zzfhs0, zzfhh zzfhh0) {
        if(((Boolean)zzbji.zzc.zze()).booleanValue()) {
            zzfvc.zzr(zzfut.zzv(zzfvl0), new v5(zzfhs0, zzfhh0, true), zzcfv.zzf);
        }
    }

    public static void zzc(zzfvl zzfvl0, zzfhs zzfhs0, zzfhh zzfhh0) {
        if(!((Boolean)zzbji.zzc.zze()).booleanValue()) {
            return;
        }
        zzfvc.zzr(zzfut.zzv(zzfvl0), new Q(14, zzfhs0, zzfhh0), zzcfv.zzf);
    }

    public static void zzd(zzfvl zzfvl0, zzfhh zzfhh0) {
        if(!((Boolean)zzbji.zzc.zze()).booleanValue()) {
            return;
        }
        zzfvc.zzr(zzfut.zzv(zzfvl0), new J5(zzfhh0, 4), zzcfv.zzf);
    }

    // 去混淆评级： 低(20)
    public static boolean zze(String s) {
        return TextUtils.isEmpty(s) ? false : Pattern.matches(((String)zzay.zzc().zzb(zzbhz.zzhr)), s);
    }

    public static int zzf(zzfcd zzfcd0) {
        switch(zzf.zzd(zzfcd0) - 1) {
            case 0: 
            case 1: {
                return 7;
            }
            default: {
                return 23;
            }
        }
    }
}

