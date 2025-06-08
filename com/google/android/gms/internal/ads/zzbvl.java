package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbvl extends zzaqw implements zzbvn {
    public zzbvl(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzbvn
    public final void zze(String s) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString("Adapter returned null.");
        this.c(parcel0, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvn
    public final void zzf(zze zze0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zze0);
        this.c(parcel0, 3);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvn
    public final void zzg(zzbup zzbup0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzbup0);
        this.c(parcel0, 1);
    }
}

