package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzcfb;

@TargetApi(24)
public class zzu extends zzt {
    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zze(Activity activity0, Configuration configuration0) {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzdR)).booleanValue()) {
            return false;
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzdT)).booleanValue()) {
            return activity0.isInMultiWindowMode();
        }
        int v = zzcfb.zzw(activity0, configuration0.screenHeightDp);
        int v1 = zzcfb.zzw(activity0, configuration0.screenWidthDp);
        DisplayMetrics displayMetrics0 = zzs.zzr(((WindowManager)activity0.getApplicationContext().getSystemService("window")));
        int v2 = displayMetrics0.heightPixels;
        int v3 = displayMetrics0.widthPixels;
        int v4 = activity0.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int v5 = v4 <= 0 ? 0 : activity0.getResources().getDimensionPixelSize(v4);
        int v6 = (int)Math.round(((double)activity0.getResources().getDisplayMetrics().density) + 0.5);
        int v7 = ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzdP)))) * v6;
        return Math.abs(v2 - (v + v5)) > v7 || Math.abs(v3 - v1) > v7;
    }
}

