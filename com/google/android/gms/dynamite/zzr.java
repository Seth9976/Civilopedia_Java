package com.google.android.gms.dynamite;

import A.f;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzr extends zza implements IInterface {
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper0, String s, int v, IObjectWrapper iObjectWrapper1) throws RemoteException {
        Parcel parcel0 = this.b();
        zzc.zze(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        parcel0.writeInt(v);
        zzc.zze(parcel0, iObjectWrapper1);
        return f.c(this.a(parcel0, 2));
    }

    public final IObjectWrapper zzf(IObjectWrapper iObjectWrapper0, String s, int v, IObjectWrapper iObjectWrapper1) throws RemoteException {
        Parcel parcel0 = this.b();
        zzc.zze(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        parcel0.writeInt(v);
        zzc.zze(parcel0, iObjectWrapper1);
        return f.c(this.a(parcel0, 3));
    }
}

