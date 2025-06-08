package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;
import java.util.List;

public final class zzdf extends zzaqw implements zzdh {
    public zzdf(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdh
    public final Bundle zze() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 5);
        Bundle bundle0 = (Bundle)zzaqy.zza(parcel0, Bundle.CREATOR);
        parcel0.recycle();
        return bundle0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdh
    public final zzu zzf() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 4);
        zzu zzu0 = (zzu)zzaqy.zza(parcel0, zzu.CREATOR);
        parcel0.recycle();
        return zzu0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdh
    public final String zzg() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 1);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdh
    public final String zzh() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 2);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdh
    public final List zzi() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 3);
        List list0 = parcel0.createTypedArrayList(zzu.CREATOR);
        parcel0.recycle();
        return list0;
    }
}

