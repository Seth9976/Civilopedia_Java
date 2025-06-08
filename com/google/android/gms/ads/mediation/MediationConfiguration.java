package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;

public class MediationConfiguration {
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";
    public final AdFormat a;
    public final Bundle b;

    public MediationConfiguration(AdFormat adFormat0, Bundle bundle0) {
        this.a = adFormat0;
        this.b = bundle0;
    }

    public AdFormat getFormat() {
        return this.a;
    }

    public Bundle getServerParameters() {
        return this.b;
    }
}

