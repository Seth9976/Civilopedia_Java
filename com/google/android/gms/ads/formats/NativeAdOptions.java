package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoOptions;

@Deprecated
public final class NativeAdOptions {
    public @interface AdChoicesPlacement {
    }

    public static final class Builder {
        public boolean a;
        public int b;
        public int c;
        public boolean d;
        public VideoOptions e;
        public int f;
        public boolean g;

        public Builder() {
            this.a = false;
            this.b = -1;
            this.c = 0;
            this.d = false;
            this.f = 1;
            this.g = false;
        }

        public NativeAdOptions build() {
            return new NativeAdOptions(this);
        }

        public Builder setAdChoicesPlacement(@AdChoicesPlacement int v) {
            this.f = v;
            return this;
        }

        @Deprecated
        public Builder setImageOrientation(int v) {
            this.b = v;
            return this;
        }

        public Builder setMediaAspectRatio(@NativeMediaAspectRatio int v) {
            this.c = v;
            return this;
        }

        public Builder setRequestCustomMuteThisAd(boolean z) {
            this.g = z;
            return this;
        }

        public Builder setRequestMultipleImages(boolean z) {
            this.d = z;
            return this;
        }

        public Builder setReturnUrlsForImageAssets(boolean z) {
            this.a = z;
            return this;
        }

        public Builder setVideoOptions(VideoOptions videoOptions0) {
            this.e = videoOptions0;
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
    public static final int NATIVE_MEDIA_ASPECT_RATIO_UNKNOWN = 0;
    @Deprecated
    public static final int ORIENTATION_ANY = 0;
    @Deprecated
    public static final int ORIENTATION_LANDSCAPE = 2;
    @Deprecated
    public static final int ORIENTATION_PORTRAIT = 1;
    public final boolean a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;
    public final VideoOptions f;
    public final boolean g;

    public NativeAdOptions(Builder nativeAdOptions$Builder0) {
        this.a = nativeAdOptions$Builder0.a;
        this.b = nativeAdOptions$Builder0.b;
        this.c = nativeAdOptions$Builder0.c;
        this.d = nativeAdOptions$Builder0.d;
        this.e = nativeAdOptions$Builder0.f;
        this.f = nativeAdOptions$Builder0.e;
        this.g = nativeAdOptions$Builder0.g;
    }

    public int getAdChoicesPlacement() {
        return this.e;
    }

    @Deprecated
    public int getImageOrientation() {
        return this.b;
    }

    public int getMediaAspectRatio() {
        return this.c;
    }

    public VideoOptions getVideoOptions() {
        return this.f;
    }

    public boolean shouldRequestMultipleImages() {
        return this.d;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.a;
    }

    public final boolean zza() {
        return this.g;
    }
}

