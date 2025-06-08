package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public abstract class DataHolderNotifier implements Notifier {
    public abstract void a();

    @Override  // com.google.android.gms.common.api.internal.ListenerHolder$Notifier
    @KeepForSdk
    public final void notifyListener(Object object0) {
        this.a();
    }

    @Override  // com.google.android.gms.common.api.internal.ListenerHolder$Notifier
    @KeepForSdk
    public void onNotifyListenerFailed() {
    }
}

