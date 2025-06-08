package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqw;

public final class zzbu extends zzaqw implements zzbw {
    public zzbu(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbw
    public final void zze() throws RemoteException {
        this.c(this.a(), 1);
    }
}

