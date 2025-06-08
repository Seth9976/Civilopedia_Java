package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbxt extends zzaqw implements zzbxv {
    public zzbxt(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final boolean zzE() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 11);
        boolean z = zzaqy.zzh(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzg(int v, int v1, Intent intent0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(v);
        parcel0.writeInt(v1);
        zzaqy.zze(parcel0, intent0);
        this.c(parcel0, 12);
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzh() throws RemoteException {
        this.c(this.a(), 10);
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzj(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 13);
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzk(Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, bundle0);
        this.c(parcel0, 1);
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzl() throws RemoteException {
        this.c(this.a(), 8);
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzn() throws RemoteException {
        this.c(this.a(), 5);
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzo() throws RemoteException {
        this.c(this.a(), 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzp() throws RemoteException {
        this.c(this.a(), 4);
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzq(Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, bundle0);
        Parcel parcel1 = this.b(parcel0, 6);
        if(parcel1.readInt() != 0) {
            bundle0.readFromParcel(parcel1);
        }
        parcel1.recycle();
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzr() throws RemoteException {
        this.c(this.a(), 3);
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzs() throws RemoteException {
        this.c(this.a(), 7);
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzt() throws RemoteException {
        this.c(this.a(), 14);
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzv() throws RemoteException {
        this.c(this.a(), 9);
    }
}

