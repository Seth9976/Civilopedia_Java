package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class MediationAdConfiguration {
    @Retention(RetentionPolicy.SOURCE)
    public @interface TagForChildDirectedTreatment {
    }

    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    public final String a;
    public final Bundle b;
    public final Bundle c;
    public final Context d;
    public final boolean e;
    public final int f;
    public final int g;
    public final String h;
    public final String i;

    public MediationAdConfiguration(Context context0, String s, Bundle bundle0, Bundle bundle1, boolean z, Location location0, int v, int v1, String s1, String s2) {
        this.a = s;
        this.b = bundle0;
        this.c = bundle1;
        this.d = context0;
        this.e = z;
        this.f = v;
        this.g = v1;
        this.h = s1;
        this.i = s2;
    }

    public String getBidResponse() {
        return this.a;
    }

    public Context getContext() {
        return this.d;
    }

    public String getMaxAdContentRating() {
        return this.h;
    }

    public Bundle getMediationExtras() {
        return this.c;
    }

    public Bundle getServerParameters() {
        return this.b;
    }

    public String getWatermark() {
        return this.i;
    }

    public boolean isTestRequest() {
        return this.e;
    }

    public int taggedForChildDirectedTreatment() {
        return this.f;
    }

    public int taggedForUnderAgeTreatment() {
        return this.g;
    }
}

