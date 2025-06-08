package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzcau extends zzaqw implements zzcaw {
    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zze(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 8);
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzf(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 6);
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzg(IObjectWrapper iObjectWrapper0, int v) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        parcel0.writeInt(v);
        this.c(parcel0, 9);
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzh(IObjectWrapper iObjectWrapper0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzi(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 3);
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzj(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 4);
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzk(IObjectWrapper iObjectWrapper0, int v) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzl(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzm(IObjectWrapper iObjectWrapper0, zzcax zzcax0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zze(parcel0, zzcax0);
        this.c(parcel0, 7);
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzn(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 11);
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzo(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 5);
    }
}

