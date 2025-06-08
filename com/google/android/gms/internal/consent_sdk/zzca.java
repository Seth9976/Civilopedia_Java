package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Set;

public final class zzca {
    public static zzby zza(Context context0, String s) {
        String s1;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        String[] arr_s = s.split("/", -1);
        if(arr_s.length == 1) {
            s1 = arr_s[0];
            return TextUtils.isEmpty("com.spears.civilopedia_preferences") || TextUtils.isEmpty(s1) ? null : new zzby("com.spears.civilopedia_preferences", s1);
        }
        if(arr_s.length == 2) {
            String s2 = arr_s[0];
            s1 = arr_s[1];
            return TextUtils.isEmpty(s2) || TextUtils.isEmpty(s1) ? null : new zzby(s2, s1);
        }
        return null;
    }

    public static void zzb(Context context0, Set set0) {
        zzbz zzbz0 = new zzbz(context0);
        for(Object object0: set0) {
            String s = (String)object0;
            zzby zzby0 = zzca.zza(context0, s);
            if(zzby0 == null) {
                String s1 = String.valueOf(s);
                Log.d("UserMessagingPlatform", (s1.length() == 0 ? new String("clearKeys: unable to process key: ") : "clearKeys: unable to process key: " + s1));
            }
            else {
                zzbz0.a(zzby0.zza).remove(zzby0.zzb);
            }
        }
        zzbz0.zzb();
    }
}

