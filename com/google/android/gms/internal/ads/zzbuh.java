package com.google.android.gms.internal.ads;

import A.f;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbuh extends zzaqw implements zzbuj {
    public zzbuh(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzbuj
    public final IObjectWrapper zze() throws RemoteException {
        return f.c(this.b(this.a(), 1));
    }

    @Override  // com.google.android.gms.internal.ads.zzbuj
    public final boolean zzf() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 2);
        boolean z = zzaqy.zzh(parcel0);
        parcel0.recycle();
        return z;
    }
}

