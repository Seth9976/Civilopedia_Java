package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzcfi;

public final class zza {
    public static final boolean zza(Context context0, Intent intent0, zzw zzw0, zzu zzu0, boolean z) {
        int v;
        if(z) {
            Uri uri0 = intent0.getData();
            try {
                v = zzt.zzp().zzk(context0, uri0);
                if(zzw0 != null) {
                    zzw0.zzg();
                }
            }
            catch(ActivityNotFoundException activityNotFoundException0) {
                zzcfi.zzj(activityNotFoundException0.getMessage());
                v = 6;
            }
            if(zzu0 != null) {
                zzu0.zzb(v);
            }
            return v == 5;
        }
        try {
            zze.zza(("Launching an intent: " + intent0.toURI()));
            zzs.zzI(context0, intent0);
            if(zzw0 != null) {
                zzw0.zzg();
            }
            if(zzu0 != null) {
                zzu0.zza(true);
            }
            return true;
        }
        catch(ActivityNotFoundException activityNotFoundException1) {
        }
        zzcfi.zzj(activityNotFoundException1.getMessage());
        if(zzu0 != null) {
            zzu0.zza(false);
        }
        return false;
    }

    public static final boolean zzb(Context context0, zzc zzc0, zzw zzw0, zzu zzu0) {
        int v = 0;
        if(zzc0 == null) {
            zzcfi.zzj("No intent data for launcher overlay.");
            return false;
        }
        zzbhz.zzc(context0);
        Intent intent0 = zzc0.zzh;
        if(intent0 != null) {
            return zza.zza(context0, intent0, zzw0, zzu0, zzc0.zzj);
        }
        Intent intent1 = new Intent();
        if(TextUtils.isEmpty(zzc0.zzb)) {
            zzcfi.zzj("Open GMSG did not contain a URL.");
            return false;
        }
        if(TextUtils.isEmpty(zzc0.zzc)) {
            intent1.setData(Uri.parse(zzc0.zzb));
        }
        else {
            intent1.setDataAndType(Uri.parse(zzc0.zzb), zzc0.zzc);
        }
        intent1.setAction("android.intent.action.VIEW");
        if(!TextUtils.isEmpty(zzc0.zzd)) {
            intent1.setPackage(zzc0.zzd);
        }
        if(!TextUtils.isEmpty(zzc0.zze)) {
            String[] arr_s = zzc0.zze.split("/", 2);
            if(arr_s.length < 2) {
                zzcfi.zzj(("Could not parse component name from open GMSG: " + zzc0.zze));
                return false;
            }
            intent1.setClassName(arr_s[0], arr_s[1]);
        }
        String s = zzc0.zzf;
        if(!TextUtils.isEmpty(s)) {
            try {
                v = Integer.parseInt(s);
            }
            catch(NumberFormatException unused_ex) {
                zzcfi.zzj("Could not parse intent flags.");
            }
            intent1.addFlags(v);
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzdB)).booleanValue()) {
            intent1.addFlags(0x10000000);
            intent1.putExtra("android.support.customtabs.extra.user_opt_out", true);
            return zza.zza(context0, intent1, zzw0, zzu0, zzc0.zzj);
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzdA)).booleanValue()) {
            zzs.zzm(context0, intent1);
        }
        return zza.zza(context0, intent1, zzw0, zzu0, zzc0.zzj);
    }
}

