package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbvu extends zzaqw implements zzbvw {
    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zze(String s) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        this.c(parcel0, 1);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzf(String s) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        this.c(parcel0, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzg(zze zze0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zze0);
        this.c(parcel0, 3);
    }
}

