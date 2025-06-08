package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbqz extends zzaqw implements zzbrb {
    @Override  // com.google.android.gms.internal.ads.zzbrb
    public final void zze(int v) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(v);
        this.c(parcel0, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrb
    public final void zzf(zze zze0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zze0);
        this.c(parcel0, 3);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrb
    public final void zzg(zzbqv zzbqv0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzbqv0);
        this.c(parcel0, 1);
    }
}

