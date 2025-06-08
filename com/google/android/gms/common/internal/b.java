package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;

public final class b implements BaseOnConnectionFailedListener {
    public final OnConnectionFailedListener i;

    public b(OnConnectionFailedListener onConnectionFailedListener0) {
        this.i = onConnectionFailedListener0;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        this.i.onConnectionFailed(connectionResult0);
    }
}

