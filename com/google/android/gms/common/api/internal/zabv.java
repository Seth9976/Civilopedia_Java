package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApi;

public final class zabv extends zaag {
    public final GoogleApi k;

    public zabv(GoogleApi googleApi0) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.k = googleApi0;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final ApiMethodImpl enqueue(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        return this.k.doRead(baseImplementation$ApiMethodImpl0);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final ApiMethodImpl execute(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        return this.k.doWrite(baseImplementation$ApiMethodImpl0);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final Context getContext() {
        return this.k.getApplicationContext();
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final Looper getLooper() {
        return this.k.getLooper();
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void zao(zada zada0) {
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void zap(zada zada0) {
    }
}

