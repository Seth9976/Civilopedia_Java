package com.google.android.gms.common.util;

import A.a;
import android.os.Build.VERSION;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class PlatformVersion {
    @KeepForSdk
    public static boolean isAtLeastHoneycomb() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastHoneycombMR1() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastIceCreamSandwich() [...] // Inlined contents

    @KeepForSdk
    public static boolean isAtLeastIceCreamSandwichMR1() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastJellyBean() [...] // Inlined contents

    @KeepForSdk
    public static boolean isAtLeastJellyBeanMR1() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastJellyBeanMR2() [...] // Inlined contents

    @KeepForSdk
    public static boolean isAtLeastKitKat() [...] // Inlined contents

    @KeepForSdk
    public static boolean isAtLeastKitKatWatch() [...] // Inlined contents

    @KeepForSdk
    public static boolean isAtLeastLollipop() [...] // Inlined contents

    @KeepForSdk
    public static boolean isAtLeastLollipopMR1() {
        return Build.VERSION.SDK_INT >= 22;
    }

    @KeepForSdk
    public static boolean isAtLeastM() [...] // Potential decryptor

    @KeepForSdk
    public static boolean isAtLeastN() [...] // Potential decryptor

    @KeepForSdk
    public static boolean isAtLeastO() [...] // Potential decryptor

    @KeepForSdk
    public static boolean isAtLeastP() [...] // Potential decryptor

    @KeepForSdk
    public static boolean isAtLeastQ() [...] // Potential decryptor

    @KeepForSdk
    public static boolean isAtLeastR() [...] // Potential decryptor

    @KeepForSdk
    public static boolean isAtLeastS() [...] // Potential decryptor

    @KeepForSdk
    public static boolean isAtLeastSv2() {
        return Build.VERSION.SDK_INT >= 0x20;
    }

    @KeepForSdk
    public static boolean isAtLeastT() [...] // Potential decryptor

    // 去混淆评级： 低(30)
    @KeepForSdk
    public static boolean isAtLeastU() {
        return a.isAtLeastU();
    }

    @KeepForSdk
    public static boolean isAtLeastV() {
        return PlatformVersion.isAtLeastU() ? a.isAtLeastV() : false;
    }
}

