package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;

public final class UnsupportedApiCallException extends UnsupportedOperationException {
    public final Feature i;

    @KeepForSdk
    public UnsupportedApiCallException(Feature feature0) {
        this.i = feature0;
    }

    @Override
    public String getMessage() {
        return "Missing " + this.i;
    }
}

