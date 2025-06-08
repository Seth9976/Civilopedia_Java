package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.Preconditions;

public final class zat implements ConnectionCallbacks, OnConnectionFailedListener {
    public final boolean i;
    public zau j;
    public final Api zaa;

    public zat(Api api0, boolean z) {
        this.zaa = api0;
        this.i = z;
    }

    @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        Preconditions.checkNotNull(this.j, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.j.onConnected(bundle0);
    }

    @Override  // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        Preconditions.checkNotNull(this.j, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.j.zaa(connectionResult0, this.zaa, this.i);
    }

    @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int v) {
        Preconditions.checkNotNull(this.j, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.j.onConnectionSuspended(v);
    }

    public final void zaa(zau zau0) {
        this.j = zau0;
    }
}

