package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;

public final class zzce extends zzaqw implements zzcg {
    @Override  // com.google.android.gms.ads.internal.client.zzcg
    public final void zzb() throws RemoteException {
        this.c(this.a(), 5);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcg
    public final void zzc() throws RemoteException {
        this.c(this.a(), 3);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcg
    public final void zzd(zze zze0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zze0);
        this.c(parcel0, 1);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcg
    public final void zze() throws RemoteException {
        this.c(this.a(), 4);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcg
    public final void zzf() throws RemoteException {
        this.c(this.a(), 2);
    }
}

