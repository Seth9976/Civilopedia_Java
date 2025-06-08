package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public final class zzcdx extends zzaqw implements zzcdz {
    public zzcdx(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override  // com.google.android.gms.internal.ads.zzcdz
    public final void zze(IObjectWrapper iObjectWrapper0, zzced zzced0, zzcdw zzcdw0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zze(parcel0, zzced0);
        zzaqy.zzg(parcel0, zzcdw0);
        this.c(parcel0, 1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcdz
    public final void zzf(zzbyt zzbyt0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zzbyt0);
        this.c(parcel0, 7);
    }

    @Override  // com.google.android.gms.internal.ads.zzcdz
    public final void zzg(List list0, IObjectWrapper iObjectWrapper0, zzbyk zzbyk0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeTypedList(list0);
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, zzbyk0);
        this.c(parcel0, 10);
    }

    @Override  // com.google.android.gms.internal.ads.zzcdz
    public final void zzh(List list0, IObjectWrapper iObjectWrapper0, zzbyk zzbyk0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeTypedList(list0);
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, zzbyk0);
        this.c(parcel0, 9);
    }

    @Override  // com.google.android.gms.internal.ads.zzcdz
    public final void zzi(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 8);
    }

    @Override  // com.google.android.gms.internal.ads.zzcdz
    public final void zzj(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzcdz
    public final void zzk(List list0, IObjectWrapper iObjectWrapper0, zzbyk zzbyk0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeTypedList(list0);
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, zzbyk0);
        this.c(parcel0, 6);
    }

    @Override  // com.google.android.gms.internal.ads.zzcdz
    public final void zzl(List list0, IObjectWrapper iObjectWrapper0, zzbyk zzbyk0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeTypedList(list0);
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, zzbyk0);
        this.c(parcel0, 5);
    }
}

