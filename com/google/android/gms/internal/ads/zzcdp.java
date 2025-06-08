package com.google.android.gms.internal.ads;

import A.f;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

public final class zzcdp {
    public static Uri a(String s, String s1, String s2) {
        int v = s.indexOf("&adurl");
        if(v == -1) {
            v = s.indexOf("?adurl");
        }
        if(v != -1) {
            StringBuilder stringBuilder0 = new StringBuilder(s.substring(0, v + 1));
            f.t(stringBuilder0, s1, "=", s2, "&");
            stringBuilder0.append(s.substring(v + 1));
            return Uri.parse(stringBuilder0.toString());
        }
        return Uri.parse(s).buildUpon().appendQueryParameter(s1, s2).build();
    }

    public static String b(Context context0, String s) {
        String s1 = zzt.zzn().zze(context0);
        String s2 = zzt.zzn().zzc(context0);
        if(!s.contains("gmp_app_id") && !TextUtils.isEmpty(s1)) {
            s = zzcdp.a(s, "gmp_app_id", s1).toString();
        }
        return s.contains("fbs_aiid") || TextUtils.isEmpty(s2) ? s : zzcdp.a(s, "fbs_aiid", s2).toString();
    }

    public static String zzb(Uri uri0, Context context0) {
        if(!zzt.zzn().zzu(context0)) {
            return uri0.toString();
        }
        String s = zzt.zzn().zza(context0);
        if(s == null) {
            return uri0.toString();
        }
        String s1 = (String)zzay.zzc().zzb(zzbhz.zzac);
        String s2 = uri0.toString();
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzab)).booleanValue() && s2.contains(s1)) {
            zzt.zzn().zzm(context0, s);
            return zzcdp.b(context0, s2).replace(s1, s);
        }
        if(!TextUtils.isEmpty(uri0.getQueryParameter("fbs_aeid"))) {
            return s2;
        }
        String s3 = zzcdp.a(zzcdp.b(context0, s2), "fbs_aeid", s).toString();
        zzt.zzn().zzm(context0, s);
        return s3;
    }

    public static String zzc(String s, Context context0, boolean z) {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzaj)).booleanValue() && !z) {
            return s;
        }
        if(zzt.zzn().zzu(context0) && !TextUtils.isEmpty(s)) {
            String s1 = zzt.zzn().zza(context0);
            if(s1 == null) {
                return s;
            }
            String s2 = (String)zzay.zzc().zzb(zzbhz.zzac);
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzab)).booleanValue() && s.contains(s2)) {
                if(zzt.zzp().zzg(s)) {
                    zzt.zzn().zzm(context0, s1);
                    return zzcdp.b(context0, s).replace(s2, s1);
                }
                if(zzt.zzp().zzh(s)) {
                    zzt.zzn().zzn(context0, s1);
                    return zzcdp.b(context0, s).replace(s2, s1);
                }
            }
            else if(!s.contains("fbs_aeid")) {
                if(zzt.zzp().zzg(s)) {
                    zzt.zzn().zzm(context0, s1);
                    return zzcdp.a(zzcdp.b(context0, s), "fbs_aeid", s1).toString();
                }
                if(zzt.zzp().zzh(s)) {
                    zzt.zzn().zzn(context0, s1);
                    return zzcdp.a(zzcdp.b(context0, s), "fbs_aeid", s1).toString();
                }
            }
        }
        return s;
    }
}

