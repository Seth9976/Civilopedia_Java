package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzcfi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public class RequestConfiguration {
    public static class Builder {
        public int a;
        public int b;
        public String c;
        public final ArrayList d;

        public Builder() {
            this.a = -1;
            this.b = -1;
            this.c = null;
            this.d = new ArrayList();
        }

        public RequestConfiguration build() {
            return new RequestConfiguration(this.a, this.b, this.c, this.d);
        }

        public Builder setMaxAdContentRating(@Nullable String s) {
            if(s != null && !"".equals(s)) {
                if(!"G".equals(s) && !"PG".equals(s) && !"T".equals(s) && !"MA".equals(s)) {
                    zzcfi.zzj(("Invalid value passed to setMaxAdContentRating: " + s));
                    return this;
                }
                this.c = s;
                return this;
            }
            this.c = null;
            return this;
        }

        public Builder setTagForChildDirectedTreatment(int v) {
            if(v != -1 && v != 0 && v != 1) {
                zzcfi.zzj(("Invalid value passed to setTagForChildDirectedTreatment: " + v));
                return this;
            }
            this.a = v;
            return this;
        }

        public Builder setTagForUnderAgeOfConsent(int v) {
            if(v != -1 && v != 0 && v != 1) {
                zzcfi.zzj(("Invalid value passed to setTagForUnderAgeOfConsent: " + v));
                return this;
            }
            this.b = v;
            return this;
        }

        public Builder setTestDeviceIds(@Nullable List list0) {
            ArrayList arrayList0 = this.d;
            arrayList0.clear();
            if(list0 != null) {
                arrayList0.addAll(list0);
            }
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MaxAdContentRating {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TagForChildDirectedTreatment {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TagForUnderAgeOfConsent {
    }

    public static final String MAX_AD_CONTENT_RATING_G = "G";
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";
    public static final String MAX_AD_CONTENT_RATING_T = "T";
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
    public final int a;
    public final int b;
    public final String c;
    public final ArrayList d;
    public static final List zza;

    static {
        RequestConfiguration.zza = Arrays.asList(new String[]{"MA", "T", "PG", "G"});
    }

    public RequestConfiguration(int v, int v1, String s, ArrayList arrayList0) {
        this.a = v;
        this.b = v1;
        this.c = s;
        this.d = arrayList0;
    }

    public String getMaxAdContentRating() {
        return this.c == null ? "" : this.c;
    }

    public int getTagForChildDirectedTreatment() {
        return this.a;
    }

    public int getTagForUnderAgeOfConsent() {
        return this.b;
    }

    public List getTestDeviceIds() {
        return new ArrayList(this.d);
    }

    public Builder toBuilder() {
        Builder requestConfiguration$Builder0 = new Builder();
        requestConfiguration$Builder0.setTagForChildDirectedTreatment(this.a);
        requestConfiguration$Builder0.setTagForUnderAgeOfConsent(this.b);
        requestConfiguration$Builder0.setMaxAdContentRating(this.c);
        requestConfiguration$Builder0.setTestDeviceIds(this.d);
        return requestConfiguration$Builder0;
    }
}

