package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;

public final class zzbg extends zzaqw implements zzbi {
    @Override  // com.google.android.gms.ads.internal.client.zzbi
    public final void zzb(zze zze0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zze0);
        this.c(parcel0, 2);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbi
    public final void zzc() throws RemoteException {
        this.c(this.a(), 1);
    }
}

