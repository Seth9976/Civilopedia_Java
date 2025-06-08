package com.google.ads;

import android.content.Context;

@Deprecated
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final AdSize BANNER = null;
    public static final int FULL_WIDTH = -1;
    public static final AdSize IAB_BANNER = null;
    public static final AdSize IAB_LEADERBOARD = null;
    public static final AdSize IAB_MRECT = null;
    public static final AdSize IAB_WIDE_SKYSCRAPER = null;
    public static final int LANDSCAPE_AD_HEIGHT = 0x20;
    public static final int LARGE_AD_HEIGHT = 90;
    public static final int PORTRAIT_AD_HEIGHT = 50;
    public static final AdSize SMART_BANNER;
    public final com.google.android.gms.ads.AdSize a;

    static {
        AdSize.SMART_BANNER = new AdSize(-1, -2, 0);
        AdSize.BANNER = new AdSize(320, 50, 0);
        AdSize.IAB_MRECT = new AdSize(300, 0xFA, 0);
        AdSize.IAB_BANNER = new AdSize(468, 60, 0);
        AdSize.IAB_LEADERBOARD = new AdSize(728, 90, 0);
        AdSize.IAB_WIDE_SKYSCRAPER = new AdSize(0xA0, 600, 0);
    }

    public AdSize(int v, int v1) {
        this(new com.google.android.gms.ads.AdSize(v, v1));
    }

    public AdSize(int v, int v1, int v2) {
        this(new com.google.android.gms.ads.AdSize(v, v1));
    }

    public AdSize(com.google.android.gms.ads.AdSize adSize0) {
        this.a = adSize0;
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof AdSize ? this.a.equals(((AdSize)object0).a) : false;
    }

    public AdSize findBestSize(AdSize[] arr_adSize) {
        AdSize adSize0 = null;
        if(arr_adSize == null) {
            return null;
        }
        int v = this.getWidth();
        int v1 = this.getHeight();
        float f = 0.0f;
        for(int v2 = 0; v2 < arr_adSize.length; ++v2) {
            AdSize adSize1 = arr_adSize[v2];
            int v3 = adSize1.getWidth();
            int v4 = adSize1.getHeight();
            if(this.isSizeAppropriate(v3, v4)) {
                float f1 = ((float)(v3 * v4)) / ((float)(v * v1));
                if(f1 > 1.0f) {
                    f1 = 1.0f / f1;
                }
                if(f1 > f) {
                    adSize0 = adSize1;
                    f = f1;
                }
            }
        }
        return adSize0;
    }

    public int getHeight() {
        return this.a.getHeight();
    }

    public int getHeightInPixels(Context context0) {
        return this.a.getHeightInPixels(context0);
    }

    public int getWidth() {
        return this.a.getWidth();
    }

    public int getWidthInPixels(Context context0) {
        return this.a.getWidthInPixels(context0);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean isAutoHeight() {
        return this.a.isAutoHeight();
    }

    public boolean isCustomAdSize() {
        return false;
    }

    public boolean isFullWidth() {
        return this.a.isFullWidth();
    }

    public boolean isSizeAppropriate(int v, int v1) {
        int v2 = this.getWidth();
        int v3 = this.getHeight();
        return ((float)v) <= ((float)v2) * 1.25f && ((float)v) >= ((float)v2) * 0.8f && ((float)v1) <= 1.25f * ((float)v3) && ((float)v1) >= ((float)v3) * 0.8f;
    }

    @Override
    public String toString() {
        return this.a.toString();
    }
}

