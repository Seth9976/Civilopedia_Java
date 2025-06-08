package com.google.android.gms.ads.rewarded;

public class ServerSideVerificationOptions {
    public static final class Builder {
        public String a;
        public String b;

        public Builder() {
            this.a = "";
            this.b = "";
        }

        public ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this);
        }

        public Builder setCustomData(String s) {
            this.b = s;
            return this;
        }

        public Builder setUserId(String s) {
            this.a = s;
            return this;
        }
    }

    public final String a;
    public final String b;

    public ServerSideVerificationOptions(Builder serverSideVerificationOptions$Builder0) {
        this.a = serverSideVerificationOptions$Builder0.a;
        this.b = serverSideVerificationOptions$Builder0.b;
    }

    public String getCustomData() {
        return this.b;
    }

    public String getUserId() {
        return this.a;
    }
}

