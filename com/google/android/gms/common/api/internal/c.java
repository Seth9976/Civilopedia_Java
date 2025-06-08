package com.google.android.gms.common.api.internal;

import android.os.Message;

public final class c implements BackgroundStateChangeListener {
    public final GoogleApiManager a;

    public c(GoogleApiManager googleApiManager0) {
        this.a = googleApiManager0;
    }

    @Override  // com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        Message message0 = this.a.v.obtainMessage(1, Boolean.valueOf(z));
        this.a.v.sendMessage(message0);
    }
}

