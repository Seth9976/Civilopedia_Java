package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;

@VisibleForTesting
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final AdSize BANNER = null;
    public static final AdSize FLUID = null;
    public static final AdSize FULL_BANNER = null;
    public static final int FULL_WIDTH = -1;
    public static final AdSize INVALID;
    public static final AdSize LARGE_BANNER;
    public static final AdSize LEADERBOARD;
    public static final AdSize MEDIUM_RECTANGLE;
    public static final AdSize SEARCH;
    @Deprecated
    public static final AdSize SMART_BANNER;
    public static final AdSize WIDE_SKYSCRAPER;
    public final int a;
    public final int b;
    public final String c;
    public boolean d;
    public boolean e;
    public int f;
    public boolean g;
    public int h;
    public static final AdSize zza;

    static {
        AdSize.BANNER = new AdSize(320, 50, "320x50_mb");
        AdSize.FULL_BANNER = new AdSize(468, 60, "468x60_as");
        AdSize.LARGE_BANNER = new AdSize(320, 100, "320x100_as");
        AdSize.LEADERBOARD = new AdSize(728, 90, "728x90_as");
        AdSize.MEDIUM_RECTANGLE = new AdSize(300, 0xFA, "300x250_as");
        AdSize.WIDE_SKYSCRAPER = new AdSize(0xA0, 600, "160x600_as");
        AdSize.SMART_BANNER = new AdSize(-1, -2, "smart_banner");
        AdSize.FLUID = new AdSize(-3, -4, "fluid");
        AdSize.INVALID = new AdSize(0, 0, "invalid");
        AdSize.zza = new AdSize(50, 50, "50x50_mb");
        AdSize.SEARCH = new AdSize(-3, 0, "search_v2");
    }

    public AdSize(int v, int v1) {
        this(v, v1, (v == -1 ? "FULL" : String.valueOf(v)) + "x" + (v1 == -2 ? "AUTO" : String.valueOf(v1)) + "_as");
    }

    public AdSize(int v, int v1, String s) {
        if(v < 0 && (v != -3 && v != -1)) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + v);
        }
        if(v1 < 0 && (v1 != -4 && v1 != -2)) {
            throw new IllegalArgumentException("Invalid height for AdSize: " + v1);
        }
        this.a = v;
        this.b = v1;
        this.c = s;
    }

    public static AdSize a(int v, int v1) {
        if(v1 == -1) {
            return AdSize.INVALID;
        }
        AdSize adSize0 = new AdSize(v, 0);
        adSize0.h = v1;
        adSize0.g = true;
        return adSize0;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(object0 == this) {
            return true;
        }
        return object0 instanceof AdSize ? this.a == ((AdSize)object0).a && this.b == ((AdSize)object0).b && this.c.equals(((AdSize)object0).c) : false;
    }

    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context0, int v) {
        AdSize adSize0 = zzcfb.zzc(context0, v, 50, 0);
        adSize0.d = true;
        return adSize0;
    }

    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context0, int v) {
        int v1 = zzcfb.zza(context0, 0);
        if(v1 == -1) {
            return AdSize.INVALID;
        }
        AdSize adSize0 = new AdSize(v, 0);
        adSize0.f = v1;
        adSize0.e = true;
        return adSize0;
    }

    public static AdSize getCurrentOrientationInterscrollerAdSize(Context context0, int v) {
        return AdSize.a(v, zzcfb.zza(context0, 0));
    }

    public int getHeight() {
        return this.b;
    }

    public int getHeightInPixels(Context context0) {
        int v = this.b;
        switch(v) {
            case -4: 
            case -3: {
                return -1;
            }
            case -2: {
                return zzq.zza(context0.getResources().getDisplayMetrics());
            }
            default: {
                return zzcfb.zzw(context0, v);
            }
        }
    }

    public static AdSize getInlineAdaptiveBannerAdSize(int v, int v1) {
        AdSize adSize0 = new AdSize(v, 0);
        adSize0.f = v1;
        adSize0.e = true;
        if(v1 < 0x20) {
            zzcfi.zzj(("The maximum height set for the inline adaptive ad size was " + v1 + " dp, which is below the minimum recommended value of 32 dp."));
        }
        return adSize0;
    }

    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(Context context0, int v) {
        AdSize adSize0 = zzcfb.zzc(context0, v, 50, 2);
        adSize0.d = true;
        return adSize0;
    }

    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(Context context0, int v) {
        int v1 = zzcfb.zza(context0, 2);
        AdSize adSize0 = new AdSize(v, 0);
        if(v1 == -1) {
            return AdSize.INVALID;
        }
        adSize0.f = v1;
        adSize0.e = true;
        return adSize0;
    }

    public static AdSize getLandscapeInterscrollerAdSize(Context context0, int v) {
        return AdSize.a(v, zzcfb.zza(context0, 2));
    }

    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(Context context0, int v) {
        AdSize adSize0 = zzcfb.zzc(context0, v, 50, 1);
        adSize0.d = true;
        return adSize0;
    }

    public static AdSize getPortraitInlineAdaptiveBannerAdSize(Context context0, int v) {
        int v1 = zzcfb.zza(context0, 1);
        AdSize adSize0 = new AdSize(v, 0);
        if(v1 == -1) {
            return AdSize.INVALID;
        }
        adSize0.f = v1;
        adSize0.e = true;
        return adSize0;
    }

    public static AdSize getPortraitInterscrollerAdSize(Context context0, int v) {
        return AdSize.a(v, zzcfb.zza(context0, 1));
    }

    public int getWidth() {
        return this.a;
    }

    public int getWidthInPixels(Context context0) {
        int v = this.a;
        switch(v) {
            case -3: {
                return -1;
            }
            case -1: {
                return context0.getResources().getDisplayMetrics().widthPixels;
            }
            default: {
                return zzcfb.zzw(context0, v);
            }
        }
    }

    @Override
    public int hashCode() {
        return this.c.hashCode();
    }

    public boolean isAutoHeight() {
        return this.b == -2;
    }

    public boolean isFluid() {
        return this.a == -3 && this.b == -4;
    }

    public boolean isFullWidth() {
        return this.a == -1;
    }

    @Override
    public String toString() {
        return this.c;
    }
}

