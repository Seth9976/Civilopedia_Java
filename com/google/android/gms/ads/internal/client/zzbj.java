package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;

public final class zzbj extends zzaqw implements zzbl {
    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final String zzf() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg(zzl zzl0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zzl0);
        this.c(parcel0, 1);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh(zzl zzl0, int v) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zzl0);
        parcel0.writeInt(v);
        this.c(parcel0, 5);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final boolean zzi() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 3);
        boolean z = zzaqy.zzh(parcel0);
        parcel0.recycle();
        return z;
    }
}

