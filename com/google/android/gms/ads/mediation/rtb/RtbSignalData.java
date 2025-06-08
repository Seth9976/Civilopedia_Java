package com.google.android.gms.ads.mediation.rtb;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.List;

public class RtbSignalData {
    public final Context a;
    public final List b;
    public final Bundle c;
    public final AdSize d;

    public RtbSignalData(Context context0, List list0, Bundle bundle0, AdSize adSize0) {
        this.a = context0;
        this.b = list0;
        this.c = bundle0;
        this.d = adSize0;
    }

    public AdSize getAdSize() {
        return this.d;
    }

    @Deprecated
    public MediationConfiguration getConfiguration() {
        return this.b == null || this.b.size() <= 0 ? null : ((MediationConfiguration)this.b.get(0));
    }

    public List getConfigurations() {
        return this.b;
    }

    public Context getContext() {
        return this.a;
    }

    public Bundle getNetworkExtras() {
        return this.c;
    }
}

