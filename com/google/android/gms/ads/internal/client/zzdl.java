package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;

public final class zzdl extends zzaqw implements zzdn {
    public zzdl(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdn
    public final void zze() throws RemoteException {
        this.c(this.a(), 4);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdn
    public final void zzf(boolean z) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzd(parcel0, z);
        this.c(parcel0, 5);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdn
    public final void zzg() throws RemoteException {
        this.c(this.a(), 3);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdn
    public final void zzh() throws RemoteException {
        this.c(this.a(), 2);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdn
    public final void zzi() throws RemoteException {
        this.c(this.a(), 1);
    }
}

