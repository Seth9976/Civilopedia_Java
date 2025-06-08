package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdb;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzcbc extends zzaqw implements zzcbe {
    public zzcbc(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final Bundle zzb() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 9);
        Bundle bundle0 = (Bundle)zzaqy.zza(parcel0, Bundle.CREATOR);
        parcel0.recycle();
        return bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final zzdh zzc() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 12);
        zzdh zzdh0 = zzdg.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzdh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final zzcbb zzd() throws RemoteException {
        zzcbb zzcbb0;
        Parcel parcel0 = this.b(this.a(), 11);
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzcbb0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzcbb0 = iInterface0 instanceof zzcbb ? ((zzcbb)iInterface0) : new zzcaz(iBinder0);
        }
        parcel0.recycle();
        return zzcbb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzf(zzl zzl0, zzcbl zzcbl0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zzl0);
        zzaqy.zzg(parcel0, zzcbl0);
        this.c(parcel0, 1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzg(zzl zzl0, zzcbl zzcbl0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zzl0);
        zzaqy.zzg(parcel0, zzcbl0);
        this.c(parcel0, 14);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzh(boolean z) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzd(parcel0, z);
        this.c(parcel0, 15);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzi(zzdb zzdb0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzdb0);
        this.c(parcel0, 8);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzj(zzde zzde0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzde0);
        this.c(parcel0, 13);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzk(zzcbh zzcbh0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzcbh0);
        this.c(parcel0, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzl(zzcbs zzcbs0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zzcbs0);
        this.c(parcel0, 7);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzm(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 5);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzn(IObjectWrapper iObjectWrapper0, boolean z) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final boolean zzo() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzp(zzcbm zzcbm0) throws RemoteException {
        throw null;
    }
}

