package com.google.android.gms.common.api.internal;

import B.a;
import B.b;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.signin.zad;
import com.google.android.gms.signin.zae;
import java.util.Set;

public final class zact extends zac implements ConnectionCallbacks, OnConnectionFailedListener {
    public final Context i;
    public final Handler j;
    public final AbstractClientBuilder k;
    public final Set l;
    public final ClientSettings m;
    public zae n;
    public zacs o;
    public static final AbstractClientBuilder p;

    static {
        zact.p = zad.zac;
    }

    public zact(Context context0, Handler handler0, ClientSettings clientSettings0) {
        this.i = context0;
        this.j = handler0;
        this.m = (ClientSettings)Preconditions.checkNotNull(clientSettings0, "ClientSettings must not be null");
        this.l = clientSettings0.getRequiredScopes();
        this.k = zact.p;
    }

    @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        this.n.zad(this);
    }

    @Override  // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        this.o.zae(connectionResult0);
    }

    @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int v) {
        this.o.zag(v);
    }

    @Override  // com.google.android.gms.signin.internal.zac
    public final void zab(zak zak0) {
        a a0 = new a(this, zak0, 2, false);
        this.j.post(a0);
    }

    public final void zae(zacs zacs0) {
        zae zae0 = this.n;
        if(zae0 != null) {
            zae0.disconnect();
        }
        this.m.zae(System.identityHashCode(this));
        Handler handler0 = this.j;
        Looper looper0 = handler0.getLooper();
        this.n = this.k.buildClient(this.i, looper0, this.m, this.m.zaa(), this, this);
        this.o = zacs0;
        if(this.l != null && !this.l.isEmpty()) {
            this.n.zab();
            return;
        }
        handler0.post(new b(this, 7));
    }

    public final void zaf() {
        zae zae0 = this.n;
        if(zae0 != null) {
            zae0.disconnect();
        }
    }
}

