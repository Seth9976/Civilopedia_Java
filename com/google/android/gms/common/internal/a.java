package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;

public final class a implements BaseConnectionCallbacks {
    public final ConnectionCallbacks i;

    public a(ConnectionCallbacks connectionCallbacks0) {
        this.i = connectionCallbacks0;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        this.i.onConnected(bundle0);
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnectionSuspended(int v) {
        this.i.onConnectionSuspended(v);
    }
}

