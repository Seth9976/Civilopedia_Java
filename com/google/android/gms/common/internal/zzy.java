package com.google.android.gms.common.internal;

import A.f;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;

public final class zzy extends zza implements zzaa {
    @Override  // com.google.android.gms.common.internal.zzaa
    public final int zzc() throws RemoteException {
        Parcel parcel0 = this.a(this.b(), 2);
        int v = parcel0.readInt();
        parcel0.recycle();
        return v;
    }

    @Override  // com.google.android.gms.common.internal.zzaa
    public final IObjectWrapper zzd() throws RemoteException {
        return f.c(this.a(this.b(), 1));
    }
}

