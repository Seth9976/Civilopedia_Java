package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzcap extends zzaqw implements zzcar {
    public zzcap(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzcar
    public final void zze(zzcal zzcal0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzcal0);
        this.c(parcel0, 5);
    }

    @Override  // com.google.android.gms.internal.ads.zzcar
    public final void zzf() throws RemoteException {
        this.c(this.a(), 4);
    }

    @Override  // com.google.android.gms.internal.ads.zzcar
    public final void zzg(int v) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(v);
        this.c(parcel0, 7);
    }

    @Override  // com.google.android.gms.internal.ads.zzcar
    public final void zzh() throws RemoteException {
        this.c(this.a(), 6);
    }

    @Override  // com.google.android.gms.internal.ads.zzcar
    public final void zzi() throws RemoteException {
        this.c(this.a(), 1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcar
    public final void zzj() throws RemoteException {
        this.c(this.a(), 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzcar
    public final void zzk() throws RemoteException {
        this.c(this.a(), 8);
    }

    @Override  // com.google.android.gms.internal.ads.zzcar
    public final void zzl() throws RemoteException {
        this.c(this.a(), 3);
    }
}

