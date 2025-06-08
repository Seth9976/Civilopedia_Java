package com.google.android.gms.common.api.internal;

import androidx.fragment.app.j;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public class zaag extends GoogleApiClient {
    public final String j;

    public zaag(String s) {
        this.j = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect() {
        throw new UnsupportedOperationException(this.j);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect(long v, TimeUnit timeUnit0) {
        throw new UnsupportedOperationException(this.j);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final PendingResult clearDefaultAccountAndReconnect() {
        throw new UnsupportedOperationException(this.j);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        throw new UnsupportedOperationException(this.j);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        throw new UnsupportedOperationException(this.j);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        throw new UnsupportedOperationException(this.j);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult getConnectionResult(Api api0) {
        throw new UnsupportedOperationException(this.j);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasConnectedApi(Api api0) {
        throw new UnsupportedOperationException(this.j);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnected() {
        throw new UnsupportedOperationException(this.j);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnecting() {
        throw new UnsupportedOperationException(this.j);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionCallbacksRegistered(ConnectionCallbacks googleApiClient$ConnectionCallbacks0) {
        throw new UnsupportedOperationException(this.j);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        throw new UnsupportedOperationException(this.j);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void reconnect() {
        throw new UnsupportedOperationException(this.j);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionCallbacks(ConnectionCallbacks googleApiClient$ConnectionCallbacks0) {
        throw new UnsupportedOperationException(this.j);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionFailedListener(OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        throw new UnsupportedOperationException(this.j);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(j j0) {
        throw new UnsupportedOperationException(this.j);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionCallbacks(ConnectionCallbacks googleApiClient$ConnectionCallbacks0) {
        throw new UnsupportedOperationException(this.j);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionFailedListener(OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        throw new UnsupportedOperationException(this.j);
    }
}

