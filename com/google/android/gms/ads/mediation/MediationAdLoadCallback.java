package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public interface MediationAdLoadCallback {
    void onFailure(AdError arg1);

    @Deprecated
    void onFailure(String arg1);

    Object onSuccess(Object arg1);
}

