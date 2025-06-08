package com.google.android.gms.common.internal;

import P0.c;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class zzf extends c {
    public final BaseGmsClient e;
    public final IBinder zze;

    public zzf(BaseGmsClient baseGmsClient0, int v, IBinder iBinder0, Bundle bundle0) {
        this.e = baseGmsClient0;
        super(baseGmsClient0, v, bundle0);
        this.zze = iBinder0;
    }

    @Override  // P0.c
    public final void b(ConnectionResult connectionResult0) {
        BaseGmsClient baseGmsClient0 = this.e;
        BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener0 = baseGmsClient0.D;
        if(baseGmsClient$BaseOnConnectionFailedListener0 != null) {
            baseGmsClient$BaseOnConnectionFailedListener0.onConnectionFailed(connectionResult0);
        }
        baseGmsClient0.f(connectionResult0);
    }

    @Override  // P0.c
    public final boolean c() {
        String s;
        try {
            Preconditions.checkNotNull(this.zze);
            s = this.zze.getInterfaceDescriptor();
        }
        catch(RemoteException unused_ex) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
        BaseGmsClient baseGmsClient0 = this.e;
        if(!baseGmsClient0.d().equals(s)) {
            Log.w("GmsClient", "service descriptor mismatch: " + baseGmsClient0.d() + " vs. " + s);
            return false;
        }
        IInterface iInterface0 = baseGmsClient0.createServiceInterface(this.zze);
        if(iInterface0 != null && (BaseGmsClient.h(baseGmsClient0, 2, 4, iInterface0) || BaseGmsClient.h(baseGmsClient0, 3, 4, iInterface0))) {
            baseGmsClient0.H = null;
            BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks0 = baseGmsClient0.C;
            if(baseGmsClient$BaseConnectionCallbacks0 != null) {
                baseGmsClient$BaseConnectionCallbacks0.onConnected(null);
            }
            return true;
        }
        return false;
    }
}

