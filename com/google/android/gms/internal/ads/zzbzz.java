package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;

public final class zzbzz {
    public String a;
    public int b;
    public int c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final String m;
    public final float n;
    public final int o;
    public final int p;
    public final String q;

    public zzbzz(Context context0) {
        String s1;
        PackageManager packageManager0 = context0.getPackageManager();
        this.b(context0);
        this.d(context0);
        this.c(context0);
        Locale locale0 = Locale.getDefault();
        boolean z = true;
        this.f = zzbzz.a(packageManager0, "geo:0,0?q=donuts") != null;
        if(zzbzz.a(packageManager0, "http://www.google.com") == null) {
            z = false;
        }
        this.g = z;
        this.h = locale0.getCountry();
        this.i = false;
        this.j = DeviceProperties.isLatchsky(context0);
        this.k = DeviceProperties.isSidewinder(context0);
        this.l = locale0.getLanguage();
        ResolveInfo resolveInfo0 = zzbzz.a(packageManager0, "market://details?id=com.google.android.gms.ads");
        String s = null;
        if(resolveInfo0 == null) {
            s1 = null;
        }
        else {
            ActivityInfo activityInfo0 = resolveInfo0.activityInfo;
            if(activityInfo0 == null) {
                s1 = null;
            }
            else {
                try {
                    PackageInfo packageInfo0 = Wrappers.packageManager(context0).getPackageInfo(activityInfo0.packageName, 0);
                    s1 = packageInfo0 == null ? null : packageInfo0.versionCode + "." + activityInfo0.packageName;
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    s1 = null;
                }
            }
        }
        try {
            this.m = s1;
            PackageInfo packageInfo1 = Wrappers.packageManager(context0).getPackageInfo("com.android.vending", 0x80);
            if(packageInfo1 != null) {
                s = packageInfo1.versionCode + "." + packageInfo1.packageName;
            }
        }
        catch(Exception unused_ex) {
        }
        this.q = s;
        Resources resources0 = context0.getResources();
        if(resources0 == null) {
            return;
        }
        DisplayMetrics displayMetrics0 = resources0.getDisplayMetrics();
        if(displayMetrics0 == null) {
            return;
        }
        this.n = displayMetrics0.density;
        this.o = displayMetrics0.widthPixels;
        this.p = displayMetrics0.heightPixels;
    }

    public zzbzz(Context context0, zzcaa zzcaa0) {
        this.b(context0);
        this.d(context0);
        this.c(context0);
        this.d = "google/sunfish/sunfish:13/TQ2A.230405.003/9719927:user/release-keys";
        this.e = Build.DEVICE;
        zzbix.zzg(context0);
        this.f = zzcaa0.zza;
        this.g = zzcaa0.zzb;
        this.h = zzcaa0.zzd;
        this.i = zzcaa0.zze;
        this.j = zzcaa0.zzf;
        this.k = zzcaa0.zzg;
        this.l = zzcaa0.zzh;
        this.m = zzcaa0.zzi;
        this.q = zzcaa0.zzj;
        this.n = zzcaa0.zzm;
        this.o = zzcaa0.zzn;
        this.p = zzcaa0.zzo;
    }

    public static ResolveInfo a(PackageManager packageManager0, String s) {
        try {
            return packageManager0.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)), 0x10000);
        }
        catch(Throwable throwable0) {
            zzt.zzo().zzt(throwable0, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    public final void b(Context context0) {
        AudioManager audioManager0 = (AudioManager)context0.getSystemService("audio");
        if(audioManager0 != null) {
            try {
                audioManager0.getMode();
                audioManager0.isMusicActive();
                audioManager0.isSpeakerphoneOn();
                audioManager0.getStreamVolume(3);
                audioManager0.getRingerMode();
                audioManager0.getStreamVolume(2);
            }
            catch(Throwable throwable0) {
                zzt.zzo().zzt(throwable0, "DeviceInfo.gatherAudioInfo");
            }
        }
    }

    public final void c(Context context0) {
        Intent intent0 = context0.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if(intent0 != null) {
            intent0.getIntExtra("status", -1);
            intent0.getIntExtra("level", -1);
            intent0.getIntExtra("scale", -1);
        }
    }

    public final void d(Context context0) {
        TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService("phone");
        ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
        this.a = telephonyManager0.getNetworkOperator();
        this.c = ((Boolean)zzay.zzc().zzb(zzbhz.zzhe)).booleanValue() ? 0 : telephonyManager0.getNetworkType();
        telephonyManager0.getPhoneType();
        this.b = -2;
        if(zzs.zzx(context0, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
            if(networkInfo0 == null) {
                this.b = -1;
            }
            else {
                this.b = networkInfo0.getType();
                networkInfo0.getDetailedState().ordinal();
            }
            connectivityManager0.isActiveNetworkMetered();
        }
    }

    public final zzcaa zza() {
        return new zzcaa(this.f, this.g, this.a, this.h, this.i, this.j, this.k, this.l, this.m, this.q, this.b, this.c, this.n, this.o, this.p, this.d, this.e);
    }
}

