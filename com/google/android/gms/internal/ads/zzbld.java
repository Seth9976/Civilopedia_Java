package com.google.android.gms.internal.ads;

import A.f;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbld extends zzaqw implements zzblf {
    public zzbld(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override  // com.google.android.gms.internal.ads.zzblf
    public final IObjectWrapper zzb(String s) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        return f.c(this.b(parcel0, 2));
    }

    @Override  // com.google.android.gms.internal.ads.zzblf
    public final void zzbA(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 3);
    }

    @Override  // com.google.android.gms.internal.ads.zzblf
    public final void zzbw(String s, IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 1);
    }

    @Override  // com.google.android.gms.internal.ads.zzblf
    public final void zzbx(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 6);
    }

    @Override  // com.google.android.gms.internal.ads.zzblf
    public final void zzby(zzbky zzbky0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzbky0);
        this.c(parcel0, 8);
    }

    @Override  // com.google.android.gms.internal.ads.zzblf
    public final void zzbz(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 9);
    }

    @Override  // com.google.android.gms.internal.ads.zzblf
    public final void zzc() throws RemoteException {
        this.c(this.a(), 4);
    }

    @Override  // com.google.android.gms.internal.ads.zzblf
    public final void zzd(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 7);
    }

    @Override  // com.google.android.gms.internal.ads.zzblf
    public final void zze(IObjectWrapper iObjectWrapper0, int v) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        parcel0.writeInt(v);
        this.c(parcel0, 5);
    }
}

