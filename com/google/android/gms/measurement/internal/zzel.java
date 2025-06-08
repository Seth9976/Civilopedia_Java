package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.ads.u9;
import i1.p;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class zzel extends p {
    public String c;
    public String d;
    public int e;
    public String f;
    public long g;
    public final long h;
    public List i;
    public String j;
    public int k;
    public String l;
    public String m;
    public String n;
    public long o;
    public String p;

    public zzel(zzge zzge0, long v) {
        super(zzge0);
        this.o = 0L;
        this.p = null;
        this.h = v;
    }

    @Override  // i1.p
    public final void a() {
        Integer integer0;
        zzge zzge0 = this.a;
        PackageManager packageManager0 = zzge0.zzau().getPackageManager();
        int v = 0x80000000;
        String s = "";
        String s1 = "unknown";
        String s2 = "Unknown";
        if(packageManager0 == null) {
            zzge0.zzay().zzd().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzeu.d("com.spears.civilopedia"));
        }
        else {
            try {
                s1 = packageManager0.getInstallerPackageName("com.spears.civilopedia");
            }
            catch(IllegalArgumentException unused_ex) {
                zzge0.zzay().zzd().zzb("Error retrieving app installer package name. appId", zzeu.d("com.spears.civilopedia"));
            }
            if(s1 == null) {
                s1 = "manual_install";
            }
            else if("com.android.vending".equals(s1)) {
                s1 = "";
            }
            try {
                PackageInfo packageInfo0 = packageManager0.getPackageInfo("com.spears.civilopedia", 0);
                if(packageInfo0 != null) {
                    CharSequence charSequence0 = packageManager0.getApplicationLabel(packageInfo0.applicationInfo);
                    if(!TextUtils.isEmpty(charSequence0)) {
                        charSequence0.toString();
                    }
                    s2 = packageInfo0.versionName;
                    v = packageInfo0.versionCode;
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                zzge0.zzay().zzd().zzc("Error retrieving package info. appId, appName", zzeu.d("com.spears.civilopedia"), "Unknown");
            }
        }
        this.c = "com.spears.civilopedia";
        this.f = s1;
        this.d = s2;
        this.e = v;
        this.g = 0L;
        boolean z = !TextUtils.isEmpty(zzge0.zzw()) && "am".equals(zzge0.zzx());
        int v1 = zzge0.zza();
        switch(v1) {
            case 0: {
                zzge0.zzay().zzj().zza("App measurement collection enabled");
                break;
            }
            case 1: {
                zzge0.zzay().zzi().zza("App measurement deactivated via the manifest");
                break;
            }
            case 2: {
                zzge0.zzay().zzj().zza("App measurement deactivated via the init parameters");
                break;
            }
            case 3: {
                zzge0.zzay().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                break;
            }
            case 4: {
                zzge0.zzay().zzi().zza("App measurement disabled via the manifest");
                break;
            }
            case 5: {
                zzge0.zzay().zzj().zza("App measurement disabled via the init parameters");
                break;
            }
            case 6: {
                zzge0.zzay().zzl().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                break;
            }
            case 7: {
                zzge0.zzay().zzi().zza("App measurement disabled via the global data collection setting");
                break;
            }
            default: {
                zzge0.zzay().zzi().zza("App measurement disabled due to denied storage consent");
            }
        }
        this.l = "";
        this.m = "";
        if(z) {
            this.m = zzge0.zzw();
        }
        try {
            String s3 = zzip.zzc(zzge0.zzau(), "google_app_id", zzge0.zzz());
            if(!TextUtils.isEmpty(s3)) {
                s = s3;
            }
            this.l = s;
            if(!TextUtils.isEmpty(s3)) {
                Context context0 = zzge0.zzau();
                String s4 = zzge0.zzz();
                Preconditions.checkNotNull(context0);
                Resources resources0 = context0.getResources();
                if(TextUtils.isEmpty(s4)) {
                    s4 = zzfw.zza(context0);
                }
                this.m = zzfw.zzb("admob_app_id", resources0, s4);
            }
            if(v1 == 0) {
                zzge0.zzay().zzj().zzc("App measurement enabled for app package, google app id", this.c, (TextUtils.isEmpty(this.l) ? this.m : this.l));
            }
        }
        catch(IllegalStateException illegalStateException0) {
            zzge0.zzay().zzd().zzc("Fetching Google App Id failed with exception. appId", zzeu.d("com.spears.civilopedia"), illegalStateException0);
        }
        List list0 = null;
        this.i = null;
        zzag zzag0 = zzge0.zzf();
        zzag0.getClass();
        new String("analytics.safelisted_events");
        Bundle bundle0 = zzag0.b();
        zzge zzge1 = zzag0.a;
        if(bundle0 == null) {
            u9.o(zzge1, "Failed to load metadata: Metadata bundle is null");
            integer0 = null;
        }
        else {
            integer0 = bundle0.containsKey("analytics.safelisted_events") ? bundle0.getInt("analytics.safelisted_events") : null;
        }
        if(integer0 != null) {
            try {
                String[] arr_s = zzge1.zzau().getResources().getStringArray(((int)integer0));
                if(arr_s != null) {
                    list0 = Arrays.asList(arr_s);
                }
            }
            catch(Resources.NotFoundException resources$NotFoundException0) {
                zzge1.zzay().zzd().zzb("Failed to load string array from metadata: resource not found", resources$NotFoundException0);
            }
        }
        if(list0 == null) {
            this.i = null;
        }
        else if(list0.isEmpty()) {
            zzge0.zzay().zzl().zza("Safelisted event list is empty. Ignoring");
        }
        else {
            for(Object object0: list0) {
                if(zzge0.zzv().t("safelisted event", ((String)object0))) {
                    continue;
                }
                goto label_103;
            }
            this.i = list0;
        }
    label_103:
        if(packageManager0 != null) {
            this.k = InstantApps.isInstantApp(zzge0.zzau());
            return;
        }
        this.k = 0;
    }

    @Override  // i1.p
    public final boolean b() {
        return true;
    }

    public final void c() {
        String s;
        this.zzg();
        zzge zzge0 = this.a;
        if(zzge0.zzm().e().zzi(zzah.zzb)) {
            byte[] arr_b = new byte[16];
            zzge0.zzv().g().nextBytes(arr_b);
            s = String.format(Locale.US, "%032x", new BigInteger(1, arr_b));
        }
        else {
            zzge0.zzay().zzc().zza("Analytics Storage consent is not granted");
            s = null;
        }
        zzge0.zzay().zzc().zza("Resetting session stitching token to " + (s == null ? "null" : "not null"));
        this.n = s;
        this.o = zzge0.zzav().currentTimeMillis();
    }

    public final String zzl() {
        this.zza();
        Preconditions.checkNotNull(this.c);
        return this.c;
    }

    public final String zzm() {
        this.zzg();
        this.zza();
        Preconditions.checkNotNull(this.l);
        return this.l;
    }
}

