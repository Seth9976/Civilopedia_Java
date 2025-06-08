package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;

public final class zzbd extends zzaqw implements zzbf {
    public zzbd(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbf
    public final void zzc() throws RemoteException {
        this.c(this.a(), 6);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbf
    public final void zzd() throws RemoteException {
        this.c(this.a(), 1);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbf
    public final void zze(int v) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(v);
        this.c(parcel0, 2);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbf
    public final void zzf(zze zze0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zze0);
        this.c(parcel0, 8);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbf
    public final void zzg() throws RemoteException {
        this.c(this.a(), 7);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbf
    public final void zzh() throws RemoteException {
        this.c(this.a(), 3);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbf
    public final void zzi() throws RemoteException {
        this.c(this.a(), 4);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbf
    public final void zzj() throws RemoteException {
        this.c(this.a(), 5);
    }
}

