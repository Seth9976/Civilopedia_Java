package com.google.android.gms.ads.nativead;

import com.google.android.gms.ads.VideoOptions;

public final class NativeAdOptions {
    public @interface AdChoicesPlacement {
    }

    public static final class Builder {
        public boolean a;
        public int b;
        public boolean c;
        public VideoOptions d;
        public int e;
        public boolean f;

        public Builder() {
            this.a = false;
            this.b = 0;
            this.c = false;
            this.e = 1;
            this.f = false;
        }

        public NativeAdOptions build() {
            return new NativeAdOptions(this);
        }

        public Builder setAdChoicesPlacement(@AdChoicesPlacement int v) {
            this.e = v;
            return this;
        }

        public Builder setMediaAspectRatio(@NativeMediaAspectRatio int v) {
            this.b = v;
            return this;
        }

        public Builder setRequestCustomMuteThisAd(boolean z) {
            this.f = z;
            return this;
        }

        public Builder setRequestMultipleImages(boolean z) {
            this.c = z;
            return this;
        }

        public Builder setReturnUrlsForImageAssets(boolean z) {
            this.a = z;
            return this;
        }

        public Builder setVideoOptions(VideoOptions videoOptions0) {
            this.d = videoOptions0;
            return this;
        }
    }

    public @interface NativeMediaAspectRatio {
    }

    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_ANY = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_LANDSCAPE = 2;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_PORTRAIT = 3;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_SQUARE = 4;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_UNKNOWN;
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final VideoOptions e;
    public final boolean f;

    public NativeAdOptions(Builder nativeAdOptions$Builder0) {
        this.a = nativeAdOptions$Builder0.a;
        this.b = nativeAdOptions$Builder0.b;
        this.c = nativeAdOptions$Builder0.c;
        this.d = nativeAdOptions$Builder0.e;
        this.e = nativeAdOptions$Builder0.d;
        this.f = nativeAdOptions$Builder0.f;
    }

    public int getAdChoicesPlacement() {
        return this.d;
    }

    public int getMediaAspectRatio() {
        return this.b;
    }

    public VideoOptions getVideoOptions() {
        return this.e;
    }

    public boolean shouldRequestMultipleImages() {
        return this.c;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.a;
    }

    public final boolean zza() {
        return this.f;
    }
}

