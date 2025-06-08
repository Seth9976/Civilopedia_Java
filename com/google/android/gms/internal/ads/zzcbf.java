package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzcbf extends zzaqw implements zzcbh {
    @Override  // com.google.android.gms.internal.ads.zzcbh
    public final void zze() throws RemoteException {
        this.c(this.a(), 7);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbh
    public final void zzf() throws RemoteException {
        this.c(this.a(), 6);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbh
    public final void zzg() throws RemoteException {
        this.c(this.a(), 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbh
    public final void zzh(int v) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(v);
        this.c(parcel0, 4);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbh
    public final void zzi(zze zze0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zze0);
        this.c(parcel0, 5);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbh
    public final void zzj() throws RemoteException {
        this.c(this.a(), 1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbh
    public final void zzk(zzcbb zzcbb0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzcbb0);
        this.c(parcel0, 3);
    }
}

