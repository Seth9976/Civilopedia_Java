package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzcg extends zzbm implements zzci {
    public zzcg(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override  // com.google.android.gms.internal.measurement.zzci
    public final int zzd() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 2);
        int v = parcel0.readInt();
        parcel0.recycle();
        return v;
    }

    @Override  // com.google.android.gms.internal.measurement.zzci
    public final void zze(String s, String s1, Bundle bundle0, long v) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzbo.zze(parcel0, bundle0);
        parcel0.writeLong(v);
        this.c(parcel0, 1);
    }
}

