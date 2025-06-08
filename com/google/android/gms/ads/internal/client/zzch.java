package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbua;

public final class zzch extends zzaqw implements zzcj {
    @Override  // com.google.android.gms.ads.internal.client.zzcj
    public final zzbua getAdapterCreator() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 2);
        zzbua zzbua0 = zzbtz.zzf(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzbua0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcj
    public final zzeh getLiteSdkVersion() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 1);
        zzeh zzeh0 = (zzeh)zzaqy.zza(parcel0, zzeh.CREATOR);
        parcel0.recycle();
        return zzeh0;
    }
}

