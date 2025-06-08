package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzff;

public final class VideoOptions {
    public static final class Builder {
        public boolean a;
        public boolean b;
        public boolean c;

        public Builder() {
            this.a = true;
            this.b = false;
            this.c = false;
        }

        public VideoOptions build() {
            return new VideoOptions(this);
        }

        public Builder setClickToExpandRequested(boolean z) {
            this.c = z;
            return this;
        }

        public Builder setCustomControlsRequested(boolean z) {
            this.b = z;
            return this;
        }

        public Builder setStartMuted(boolean z) {
            this.a = z;
            return this;
        }
    }

    public final boolean a;
    public final boolean b;
    public final boolean c;

    public VideoOptions(Builder videoOptions$Builder0) {
        this.a = videoOptions$Builder0.a;
        this.b = videoOptions$Builder0.b;
        this.c = videoOptions$Builder0.c;
    }

    public VideoOptions(zzff zzff0) {
        this.a = zzff0.zza;
        this.b = zzff0.zzb;
        this.c = zzff0.zzc;
    }

    public boolean getClickToExpandRequested() {
        return this.c;
    }

    public boolean getCustomControlsRequested() {
        return this.b;
    }

    public boolean getStartMuted() {
        return this.a;
    }
}

