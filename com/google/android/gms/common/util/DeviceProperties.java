package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.os.Build;
import com.google.android.apps.common.proguard.SideEffectFree;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class DeviceProperties {
    public static Boolean a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;
    public static Boolean e;
    public static Boolean f;
    public static Boolean g;
    public static Boolean h;
    public static Boolean i;
    public static Boolean j;
    public static Boolean k;
    public static Boolean l;
    public static Boolean m;
    public static Boolean n;

    @KeepForSdk
    public static boolean isAuto(Context context0) {
        boolean z = false;
        PackageManager packageManager0 = context0.getPackageManager();
        if(DeviceProperties.j == null) {
            if(packageManager0.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            DeviceProperties.j = Boolean.valueOf(z);
        }
        return DeviceProperties.j.booleanValue();
    }

    @KeepForSdk
    public static boolean isBstar(Context context0) {
        boolean z = false;
        if(DeviceProperties.m == null) {
            if(context0.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z = true;
            }
            DeviceProperties.m = Boolean.valueOf(z);
        }
        return DeviceProperties.m.booleanValue();
    }

    @KeepForSdk
    public static boolean isFoldable(Context context0) {
        if(DeviceProperties.c == null) {
            SensorManager sensorManager0 = (SensorManager)context0.getSystemService("sensor");
            DeviceProperties.c = Boolean.valueOf(sensorManager0 != null && sensorManager0.getDefaultSensor(36) != null);
        }
        return DeviceProperties.c.booleanValue();
    }

    @KeepForSdk
    public static boolean isLatchsky(Context context0) {
        if(DeviceProperties.g == null) {
            PackageManager packageManager0 = context0.getPackageManager();
            DeviceProperties.g = Boolean.valueOf(packageManager0.hasSystemFeature("com.google.android.feature.services_updater") && packageManager0.hasSystemFeature("cn.google.services"));
        }
        return DeviceProperties.g.booleanValue();
    }

    @KeepForSdk
    public static boolean isPhone(Context context0) {
        boolean z = true;
        if(DeviceProperties.a == null) {
            if(!DeviceProperties.isFoldable(context0)) {
                if(DeviceProperties.isTablet(context0) || DeviceProperties.isWearable(context0) || DeviceProperties.zzb(context0)) {
                    z = false;
                }
                else {
                    if(DeviceProperties.i == null) {
                        DeviceProperties.i = Boolean.valueOf(context0.getPackageManager().hasSystemFeature("org.chromium.arc"));
                    }
                    if(DeviceProperties.i.booleanValue() || DeviceProperties.isAuto(context0) || DeviceProperties.isTv(context0)) {
                        z = false;
                    }
                    else {
                        if(DeviceProperties.l == null) {
                            DeviceProperties.l = Boolean.valueOf(context0.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"));
                        }
                        if(DeviceProperties.l.booleanValue() || DeviceProperties.isBstar(context0) || DeviceProperties.isXr(context0)) {
                            z = false;
                        }
                    }
                }
            }
            DeviceProperties.a = Boolean.valueOf(z);
        }
        return DeviceProperties.a.booleanValue();
    }

    @KeepForSdk
    public static boolean isSevenInchTablet(Context context0) {
        return DeviceProperties.zzc(context0.getResources());
    }

    @TargetApi(21)
    @KeepForSdk
    public static boolean isSidewinder(Context context0) {
        return DeviceProperties.zza(context0);
    }

    @KeepForSdk
    public static boolean isTablet(Context context0) {
        return DeviceProperties.isTablet(context0.getResources());
    }

    @KeepForSdk
    public static boolean isTablet(Resources resources0) {
        boolean z = false;
        if(resources0 == null) {
            return false;
        }
        if(DeviceProperties.b == null) {
            if((resources0.getConfiguration().screenLayout & 15) > 3) {
                z = true;
            }
            else if(DeviceProperties.zzc(resources0)) {
                z = true;
            }
            DeviceProperties.b = Boolean.valueOf(z);
        }
        return DeviceProperties.b.booleanValue();
    }

    @KeepForSdk
    public static boolean isTv(Context context0) {
        boolean z = true;
        PackageManager packageManager0 = context0.getPackageManager();
        if(DeviceProperties.k == null) {
            if(!packageManager0.hasSystemFeature("com.google.android.tv") && !packageManager0.hasSystemFeature("android.hardware.type.television") && !packageManager0.hasSystemFeature("android.software.leanback")) {
                z = false;
            }
            DeviceProperties.k = Boolean.valueOf(z);
        }
        return DeviceProperties.k.booleanValue();
    }

    @KeepForSdk
    public static boolean isUserBuild() {
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    @SideEffectFree
    @KeepForSdk
    public static boolean isWearable(Context context0) {
        return DeviceProperties.zzd(context0.getPackageManager());
    }

    // 去混淆评级： 中等(110)
    @TargetApi(26)
    @KeepForSdk
    public static boolean isWearableWithoutPlayStore(Context context0) {
        return DeviceProperties.isWearable(context0) && false || DeviceProperties.zza(context0);
    }

    @KeepForSdk
    public static boolean isXr(Context context0) {
        PackageManager packageManager0 = context0.getPackageManager();
        if(DeviceProperties.n == null) {
            DeviceProperties.n = Boolean.valueOf(packageManager0.hasSystemFeature("android.software.xr.immersive"));
        }
        return DeviceProperties.n.booleanValue();
    }

    @TargetApi(21)
    public static boolean zza(Context context0) {
        boolean z = false;
        if(DeviceProperties.f == null) {
            if(context0.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            DeviceProperties.f = Boolean.valueOf(z);
        }
        return DeviceProperties.f.booleanValue();
    }

    public static boolean zzb(Context context0) {
        boolean z = true;
        if(DeviceProperties.h == null) {
            if(!context0.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context0.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            DeviceProperties.h = Boolean.valueOf(z);
        }
        return DeviceProperties.h.booleanValue();
    }

    public static boolean zzc(Resources resources0) {
        boolean z = false;
        if(resources0 == null) {
            return false;
        }
        if(DeviceProperties.d == null) {
            Configuration configuration0 = resources0.getConfiguration();
            if((configuration0.screenLayout & 15) <= 3 && configuration0.smallestScreenWidthDp >= 600) {
                z = true;
            }
            DeviceProperties.d = Boolean.valueOf(z);
        }
        return DeviceProperties.d.booleanValue();
    }

    @TargetApi(20)
    @SideEffectFree
    public static boolean zzd(PackageManager packageManager0) {
        boolean z = false;
        if(DeviceProperties.e == null) {
            if(packageManager0.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            DeviceProperties.e = Boolean.valueOf(z);
        }
        return DeviceProperties.e.booleanValue();
    }
}

