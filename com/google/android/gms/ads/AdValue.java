package com.google.android.gms.ads;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class AdValue {
    @Retention(RetentionPolicy.SOURCE)
    public @interface PrecisionType {
        public static final int ESTIMATED = 1;
        public static final int PRECISE = 3;
        public static final int PUBLISHER_PROVIDED = 2;
        public static final int UNKNOWN;

    }

    public final int a;
    public final String b;
    public final long c;

    public AdValue(int v, long v1, String s) {
        this.a = v;
        this.b = s;
        this.c = v1;
    }

    public String getCurrencyCode() {
        return this.b;
    }

    public int getPrecisionType() {
        return this.a;
    }

    public long getValueMicros() {
        return this.c;
    }

    public static AdValue zza(int v, String s, long v1) {
        return new AdValue(v, v1, s);
    }
}

