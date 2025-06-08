package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbch extends zzaqw implements zzbcj {
    @Override  // com.google.android.gms.internal.ads.zzbcj
    public final void zzb(int v) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(v);
        this.c(parcel0, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzbcj
    public final void zzc(zze zze0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zze0);
        this.c(parcel0, 3);
    }

    @Override  // com.google.android.gms.internal.ads.zzbcj
    public final void zzd(zzbcg zzbcg0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzbcg0);
        this.c(parcel0, 1);
    }
}

