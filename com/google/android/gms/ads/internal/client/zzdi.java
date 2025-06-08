package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;

public final class zzdi extends zzaqw implements zzdk {
    public zzdi(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final float zze() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final float zzf() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final float zzg() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final int zzh() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 5);
        int v = parcel0.readInt();
        parcel0.recycle();
        return v;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final zzdn zzi() throws RemoteException {
        zzdn zzdn0;
        Parcel parcel0 = this.b(this.a(), 11);
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzdn0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzdn0 = iInterface0 instanceof zzdn ? ((zzdn)iInterface0) : new zzdl(iBinder0);
        }
        parcel0.recycle();
        return zzdn0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final void zzj(boolean z) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzd(parcel0, z);
        this.c(parcel0, 3);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final void zzk() throws RemoteException {
        this.c(this.a(), 2);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final void zzl() throws RemoteException {
        this.c(this.a(), 1);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final void zzm(zzdn zzdn0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzdn0);
        this.c(parcel0, 8);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final void zzn() throws RemoteException {
        this.c(this.a(), 13);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzo() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 12);
        boolean z = zzaqy.zzh(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzp() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 10);
        boolean z = zzaqy.zzh(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzq() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 4);
        boolean z = zzaqy.zzh(parcel0);
        parcel0.recycle();
        return z;
    }
}

