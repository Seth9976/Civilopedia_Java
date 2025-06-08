package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzcbj extends zzaqw implements zzcbl {
    public zzcbj(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzcbl
    public final void zze(int v) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(v);
        this.c(parcel0, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbl
    public final void zzf(zze zze0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zze0);
        this.c(parcel0, 3);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbl
    public final void zzg() throws RemoteException {
        this.c(this.a(), 1);
    }
}

