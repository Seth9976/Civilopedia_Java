package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.u9;
import i1.A;
import i1.c;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class zzag extends A {
    public Boolean b;
    public c c;
    public Boolean d;

    public final String a(String s) {
        zzge zzge0;
        try {
            zzge0 = this.a;
            String s1 = (String)Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, s, "");
            Preconditions.checkNotNull(s1);
            return s1;
        }
        catch(ClassNotFoundException classNotFoundException0) {
            zzge0.zzay().zzd().zzb("Could not find SystemProperties class", classNotFoundException0);
            return "";
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            zzge0.zzay().zzd().zzb("Could not find SystemProperties.get() method", noSuchMethodException0);
            return "";
        }
        catch(IllegalAccessException illegalAccessException0) {
            zzge0.zzay().zzd().zzb("Could not access SystemProperties.get()", illegalAccessException0);
            return "";
        }
        catch(InvocationTargetException invocationTargetException0) {
            zzge0.zzay().zzd().zzb("SystemProperties.get() threw an exception", invocationTargetException0);
            return "";
        }
    }

    public final Bundle b() {
        zzge zzge0;
        try {
            zzge0 = this.a;
            if(zzge0.zzau().getPackageManager() == null) {
                zzge0.zzay().zzd().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo0 = Wrappers.packageManager(zzge0.zzau()).getApplicationInfo("com.spears.civilopedia", 0x80);
            if(applicationInfo0 == null) {
                zzge0.zzay().zzd().zza("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return applicationInfo0.metaData;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
        }
        zzge0.zzay().zzd().zzb("Failed to load metadata: Package name not found", packageManager$NameNotFoundException0);
        return null;
    }

    public final Boolean c(String s) {
        Preconditions.checkNotEmpty(s);
        Bundle bundle0 = this.b();
        if(bundle0 == null) {
            u9.o(this.a, "Failed to load metadata: Metadata bundle is null");
            return null;
        }
        return bundle0.containsKey(s) ? Boolean.valueOf(bundle0.getBoolean(s)) : null;
    }

    public final boolean d() {
        if(this.b == null) {
            Boolean boolean0 = this.c("app_measurement_lite");
            this.b = boolean0;
            if(boolean0 == null) {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue() || !this.a.zzN();
    }

    public static final long zzA() {
        return (long)(((Long)zzeh.zzC.zza(null)));
    }

    public final double zza(String s, zzeg zzeg0) {
        if(s == null) {
            return (double)(((Double)zzeg0.zza(null)));
        }
        String s1 = this.c.zza(s, zzeg0.zzb());
        if(TextUtils.isEmpty(s1)) {
            return (double)(((Double)zzeg0.zza(null)));
        }
        try {
            return (double)(((Double)zzeg0.zza(Double.parseDouble(s1))));
        }
        catch(NumberFormatException unused_ex) {
            return (double)(((Double)zzeg0.zza(null)));
        }
    }

    public final int zzc() {
        zzln zzln0 = this.a.zzv();
        Boolean boolean0 = zzln0.a.zzt().e;
        return zzln0.zzm() >= 201500 || boolean0 != null && !boolean0.booleanValue() ? 100 : 25;
    }

    public final int zzd(String s) {
        return this.zzf(s, zzeh.zzH, 25, 100);
    }

    public final int zze(String s, zzeg zzeg0) {
        if(s == null) {
            return (int)(((Integer)zzeg0.zza(null)));
        }
        String s1 = this.c.zza(s, zzeg0.zzb());
        if(TextUtils.isEmpty(s1)) {
            return (int)(((Integer)zzeg0.zza(null)));
        }
        try {
            return (int)(((Integer)zzeg0.zza(Integer.parseInt(s1))));
        }
        catch(NumberFormatException unused_ex) {
            return (int)(((Integer)zzeg0.zza(null)));
        }
    }

    public final int zzf(String s, zzeg zzeg0, int v, int v1) {
        return Math.max(Math.min(this.zze(s, zzeg0), v1), v);
    }

    public final long zzh() {
        return 68000L;
    }

    public final long zzi(String s, zzeg zzeg0) {
        if(s == null) {
            return (long)(((Long)zzeg0.zza(null)));
        }
        String s1 = this.c.zza(s, zzeg0.zzb());
        if(TextUtils.isEmpty(s1)) {
            return (long)(((Long)zzeg0.zza(null)));
        }
        try {
            return (long)(((Long)zzeg0.zza(Long.parseLong(s1))));
        }
        catch(NumberFormatException unused_ex) {
            return (long)(((Long)zzeg0.zza(null)));
        }
    }

    public final String zzl() {
        return this.a("debug.firebase.analytics.app");
    }

    public final String zzm() {
        return this.a("debug.deferred.deeplink");
    }

    public final String zzo(String s, zzeg zzeg0) {
        return s == null ? ((String)zzeg0.zza(null)) : ((String)zzeg0.zza(this.c.zza(s, zzeg0.zzb())));
    }

    public final boolean zzr() {
        Boolean boolean0 = this.c("google_analytics_adid_collection_enabled");
        return boolean0 == null || boolean0.booleanValue();
    }

    public final boolean zzs(String s, zzeg zzeg0) {
        if(s == null) {
            return ((Boolean)zzeg0.zza(null)).booleanValue();
        }
        String s1 = this.c.zza(s, zzeg0.zzb());
        return TextUtils.isEmpty(s1) ? ((Boolean)zzeg0.zza(null)).booleanValue() : ((Boolean)zzeg0.zza(Boolean.valueOf("1".equals(s1)))).booleanValue();
    }

    public final boolean zzt(String s) {
        return "1".equals(this.c.zza(s, "gaia_collection_enabled"));
    }

    public final boolean zzu() {
        Boolean boolean0 = this.c("google_analytics_automatic_screen_reporting_enabled");
        return boolean0 == null || boolean0.booleanValue();
    }

    public final boolean zzv() {
        Boolean boolean0 = this.c("firebase_analytics_collection_deactivated");
        return boolean0 != null && boolean0.booleanValue();
    }

    public final boolean zzw(String s) {
        return "1".equals(this.c.zza(s, "measurement.event_sampling_enabled"));
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean zzy() {
        if(this.d == null) {
            synchronized(this) {
                if(this.d == null) {
                    boolean z = false;
                    ApplicationInfo applicationInfo0 = this.a.zzau().getApplicationInfo();
                    String s = ProcessUtils.getMyProcessName();
                    if(applicationInfo0 != null) {
                        if(applicationInfo0.processName != null && applicationInfo0.processName.equals(s)) {
                            z = true;
                        }
                        this.d = Boolean.valueOf(z);
                    }
                    if(this.d == null) {
                        this.d = Boolean.TRUE;
                        this.a.zzay().zzd().zza("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.d.booleanValue();
    }

    public static final long zzz() {
        return (long)(((Long)zzeh.zzc.zza(null)));
    }
}

