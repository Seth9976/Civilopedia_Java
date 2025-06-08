package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class GooglePlayServicesManifestException extends IllegalStateException {
    public final int i;

    public GooglePlayServicesManifestException(int v, String s) {
        super(s);
        this.i = v;
    }

    public int getActualVersion() {
        return this.i;
    }

    public int getExpectedVersion() {
        return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
}

