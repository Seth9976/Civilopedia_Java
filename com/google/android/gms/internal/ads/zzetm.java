package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

public final class zzetm implements Callable {
    public final E5 zza;

    public zzetm(E5 e50) {
        this.zza = e50;
    }

    @Override
    public final Object call() {
        String s3;
        String s2;
        Context context0 = this.zza.b;
        PackageManager packageManager0 = context0.getPackageManager();
        Locale locale0 = Locale.getDefault();
        boolean z = packageManager0.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=donuts")), 0x10000) != null;
        boolean z1 = packageManager0.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), 0x10000) != null;
        String s = locale0.getCountry();
        boolean z2 = DeviceProperties.isLatchsky(context0);
        boolean z3 = DeviceProperties.isSidewinder(context0);
        String s1 = locale0.getLanguage();
        ArrayList arrayList0 = new ArrayList();
        if(Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList0 = LocaleList.getDefault();
            for(int v = 0; v < localeList0.size(); ++v) {
                arrayList0.add(localeList0.get(v).getLanguage());
            }
        }
        ResolveInfo resolveInfo0 = packageManager0.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.gms.ads")), 0x10000);
        if(resolveInfo0 == null) {
            s2 = null;
        }
        else {
            ActivityInfo activityInfo0 = resolveInfo0.activityInfo;
            if(activityInfo0 == null) {
                s2 = null;
            }
            else {
                try {
                    PackageInfo packageInfo0 = Wrappers.packageManager(context0).getPackageInfo(activityInfo0.packageName, 0);
                    s2 = packageInfo0 == null ? null : packageInfo0.versionCode + "." + activityInfo0.packageName;
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    s2 = null;
                }
            }
        }
        try {
            PackageInfo packageInfo1 = Wrappers.packageManager(context0).getPackageInfo("com.android.vending", 0x80);
            s3 = null;
            if(packageInfo1 != null) {
                s3 = packageInfo1.versionCode + "." + packageInfo1.packageName;
            }
        }
        catch(Exception unused_ex) {
        }
        boolean z4 = false;
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfo1 = packageManager0.resolveActivity(intent0, 0);
        List list0 = packageManager0.queryIntentActivities(intent0, 0x10000);
        if(list0 != null && resolveInfo1 != null) {
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                ResolveInfo resolveInfo2 = (ResolveInfo)list0.get(v1);
                if(resolveInfo1.activityInfo.name.equals(resolveInfo2.activityInfo.name)) {
                    z4 = resolveInfo1.activityInfo.packageName.equals(zzgri.zza(context0));
                    break;
                }
            }
        }
        long v2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes();
        return !((Boolean)zzay.zzc().zzb(zzbhz.zziy)).booleanValue() || !DeviceProperties.isBstar(context0) ? new zzetl(z, z1, s, false, z2, z3, s1, arrayList0, s2, s3, "google/sunfish/sunfish:13/TQ2A.230405.003/9719927:user/release-keys", z4, Build.MODEL, v2 / 0x400L, false) : new zzetl(z, z1, s, false, z2, z3, s1, arrayList0, s2, s3, "google/sunfish/sunfish:13/TQ2A.230405.003/9719927:user/release-keys", z4, Build.MODEL, v2 / 0x400L, true);
    }
}

