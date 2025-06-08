package com.google.android.gms.internal.ads_identifier;

import android.os.Parcel;
import android.os.RemoteException;

public final class zzd extends zza implements zzf {
    @Override  // com.google.android.gms.internal.ads_identifier.zzf
    public final String zzc() throws RemoteException {
        Parcel parcel0 = Parcel.obtain();
        parcel0.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcel1 = this.a(parcel0, 1);
        String s = parcel1.readString();
        parcel1.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zzd() throws RemoteException {
        Parcel parcel0 = Parcel.obtain();
        parcel0.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcel1 = this.a(parcel0, 6);
        boolean z = zzc.zzb(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zze(boolean z) throws RemoteException {
        Parcel parcel0 = Parcel.obtain();
        parcel0.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        zzc.zza(parcel0, true);
        Parcel parcel1 = this.a(parcel0, 2);
        boolean z1 = zzc.zzb(parcel1);
        parcel1.recycle();
        return z1;
    }
}

