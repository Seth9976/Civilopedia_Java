package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbcl extends zzaqw implements zzbcn {
    @Override  // com.google.android.gms.internal.ads.zzbcn
    public final void zzb() throws RemoteException {
        this.c(this.a(), 5);
    }

    @Override  // com.google.android.gms.internal.ads.zzbcn
    public final void zzc() throws RemoteException {
        this.c(this.a(), 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzbcn
    public final void zzd(zze zze0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zze0);
        this.c(parcel0, 3);
    }

    @Override  // com.google.android.gms.internal.ads.zzbcn
    public final void zze() throws RemoteException {
        this.c(this.a(), 4);
    }

    @Override  // com.google.android.gms.internal.ads.zzbcn
    public final void zzf() throws RemoteException {
        this.c(this.a(), 1);
    }
}

