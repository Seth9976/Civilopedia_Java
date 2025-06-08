package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import java.util.Collections;
import java.util.Set;

@KeepForSdk
public abstract class GmsClient extends BaseGmsClient implements Client, zaj {
    public final Set M;
    public final Account N;

    public GmsClient(Context context0, Looper looper0, int v, ClientSettings clientSettings0, ConnectionCallbacks connectionCallbacks0, OnConnectionFailedListener onConnectionFailedListener0) {
        GmsClientSupervisor gmsClientSupervisor0 = GmsClientSupervisor.getInstance(context0);
        ConnectionCallbacks connectionCallbacks1 = (ConnectionCallbacks)Preconditions.checkNotNull(connectionCallbacks0);
        OnConnectionFailedListener onConnectionFailedListener1 = (OnConnectionFailedListener)Preconditions.checkNotNull(onConnectionFailedListener0);
        super(context0, looper0, gmsClientSupervisor0, GoogleApiAvailability.getInstance(), v, (connectionCallbacks1 == null ? null : new a(connectionCallbacks1)), (onConnectionFailedListener1 == null ? null : new b(onConnectionFailedListener1)), clientSettings0.zac());
        this.N = clientSettings0.getAccount();
        Set set0 = clientSettings0.getAllRequestedScopes();
        for(Object object0: set0) {
            if(!set0.contains(((Scope)object0))) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
            if(false) {
                break;
            }
        }
        this.M = set0;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    public final Set c() {
        return this.M;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    public final Account getAccount() {
        return this.N;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @KeepForSdk
    public Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.common.api.Api$Client
    @KeepForSdk
    public Set getScopesForConnectionlessNonSignIn() {
        return this.requiresSignIn() ? this.M : Collections.emptySet();
    }
}

