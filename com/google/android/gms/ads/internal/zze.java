package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbsq;
import com.google.android.gms.internal.ads.zzbsx;
import com.google.android.gms.internal.ads.zzcel;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfhh;
import com.google.android.gms.internal.ads.zzfhu;
import com.google.android.gms.internal.ads.zzfvc;
import com.google.android.gms.internal.ads.zzfvl;
import com.google.android.gms.internal.ads.zzfvm;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
public final class zze {
    public Context a;
    public long b;

    public zze() {
        this.b = 0L;
    }

    public final void a(Context context0, zzcfo zzcfo0, boolean z, zzcel zzcel0, String s, String s1, Runnable runnable0, zzfhu zzfhu0) {
        if(zzt.zzA().elapsedRealtime() - this.b < 5000L) {
            zzcfi.zzj("Not retrying to fetch app settings");
            return;
        }
        this.b = zzt.zzA().elapsedRealtime();
        if(zzcel0 != null && zzt.zzA().currentTimeMillis() - zzcel0.zza() <= ((long)(((Long)zzay.zzc().zzb(zzbhz.zzde)))) && zzcel0.zzi()) {
            return;
        }
        if(context0 == null) {
            zzcfi.zzj("Context not provided to fetch application settings");
            return;
        }
        if(TextUtils.isEmpty(s) && TextUtils.isEmpty(s1)) {
            zzcfi.zzj("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context context1 = context0.getApplicationContext();
        if(context1 == null) {
            context1 = context0;
        }
        this.a = context1;
        zzfhh zzfhh0 = zzfhg.zza(context0, 4);
        zzfhh0.zzf();
        zzbsq zzbsq0 = zzt.zzf().zza(this.a, zzcfo0, zzfhu0).zza("google.afma.config.fetchAppSettings", zzbsx.zza, zzbsx.zza);
        try {
            JSONObject jSONObject0 = new JSONObject();
            if(!TextUtils.isEmpty(s)) {
                jSONObject0.put("app_id", s);
            }
            else if(!TextUtils.isEmpty(s1)) {
                jSONObject0.put("ad_unit_id", s1);
            }
            jSONObject0.put("is_init", z);
            jSONObject0.put("pn", "com.spears.civilopedia");
            jSONObject0.put("experiment_ids", TextUtils.join(",", zzbhz.zza()));
            try {
                ApplicationInfo applicationInfo0 = this.a.getApplicationInfo();
                if(applicationInfo0 != null) {
                    PackageInfo packageInfo0 = Wrappers.packageManager(context0).getPackageInfo(applicationInfo0.packageName, 0);
                    if(packageInfo0 != null) {
                        jSONObject0.put("version", packageInfo0.versionCode);
                    }
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            zzfvl zzfvl0 = zzbsq0.zzb(jSONObject0);
            zzd zzd0 = new zzd(zzfhu0, zzfhh0);
            zzfvm zzfvm0 = zzcfv.zzf;
            zzfvl zzfvl1 = zzfvc.zzn(zzfvl0, zzd0, zzfvm0);
            if(runnable0 != null) {
                zzfvl0.zzc(runnable0, zzfvm0);
            }
            zzcfy.zza(zzfvl1, "ConfigLoader.maybeFetchNewAppSettings");
            return;
        }
        catch(Exception exception0) {
        }
        zzcfi.zzh("Error requesting application settings", exception0);
        zzfhh0.zze(false);
        zzfhu0.zzb(zzfhh0.zzj());
    }

    public final void zza(Context context0, zzcfo zzcfo0, String s, Runnable runnable0, zzfhu zzfhu0) {
        this.a(context0, zzcfo0, true, null, s, null, runnable0, zzfhu0);
    }

    public final void zzc(Context context0, zzcfo zzcfo0, String s, zzcel zzcel0, zzfhu zzfhu0) {
        this.a(context0, zzcfo0, false, zzcel0, (zzcel0 == null ? null : zzcel0.zzb()), s, null, zzfhu0);
    }
}

