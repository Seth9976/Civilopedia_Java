package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqw;

public final class zzcs extends zzaqw implements zzcu {
    @Override  // com.google.android.gms.ads.internal.client.zzcu
    public final String zze() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 1);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcu
    public final String zzf() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 2);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }
}

