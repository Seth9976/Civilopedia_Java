package com.google.android.gms.dynamite;

import A.f;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzq extends zza implements IInterface {
    public final int zze() throws RemoteException {
        Parcel parcel0 = this.a(this.b(), 6);
        int v = parcel0.readInt();
        parcel0.recycle();
        return v;
    }

    public final int zzf(IObjectWrapper iObjectWrapper0, String s, boolean z) throws RemoteException {
        Parcel parcel0 = this.b();
        zzc.zze(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        parcel0.writeInt(((int)z));
        Parcel parcel1 = this.a(parcel0, 3);
        int v = parcel1.readInt();
        parcel1.recycle();
        return v;
    }

    public final int zzg(IObjectWrapper iObjectWrapper0, String s, boolean z) throws RemoteException {
        Parcel parcel0 = this.b();
        zzc.zze(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        parcel0.writeInt(((int)z));
        Parcel parcel1 = this.a(parcel0, 5);
        int v = parcel1.readInt();
        parcel1.recycle();
        return v;
    }

    public final IObjectWrapper zzh(IObjectWrapper iObjectWrapper0, String s, int v) throws RemoteException {
        Parcel parcel0 = this.b();
        zzc.zze(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        parcel0.writeInt(v);
        return f.c(this.a(parcel0, 2));
    }

    public final IObjectWrapper zzi(IObjectWrapper iObjectWrapper0, String s, int v, IObjectWrapper iObjectWrapper1) throws RemoteException {
        Parcel parcel0 = this.b();
        zzc.zze(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        parcel0.writeInt(v);
        zzc.zze(parcel0, iObjectWrapper1);
        return f.c(this.a(parcel0, 8));
    }

    public final IObjectWrapper zzj(IObjectWrapper iObjectWrapper0, String s, int v) throws RemoteException {
        Parcel parcel0 = this.b();
        zzc.zze(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        parcel0.writeInt(v);
        return f.c(this.a(parcel0, 4));
    }

    public final IObjectWrapper zzk(IObjectWrapper iObjectWrapper0, String s, boolean z, long v) throws RemoteException {
        Parcel parcel0 = this.b();
        zzc.zze(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        parcel0.writeInt(((int)z));
        parcel0.writeLong(v);
        return f.c(this.a(parcel0, 7));
    }
}

