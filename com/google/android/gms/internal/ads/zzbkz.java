package com.google.android.gms.internal.ads;

import A.f;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbkz extends zzaqw implements zzblb {
    public zzbkz(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override  // com.google.android.gms.internal.ads.zzblb
    public final double zzb() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 3);
        double f = parcel0.readDouble();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.internal.ads.zzblb
    public final int zzc() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 5);
        int v = parcel0.readInt();
        parcel0.recycle();
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzblb
    public final int zzd() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 4);
        int v = parcel0.readInt();
        parcel0.recycle();
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzblb
    public final Uri zze() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 2);
        Uri uri0 = (Uri)zzaqy.zza(parcel0, Uri.CREATOR);
        parcel0.recycle();
        return uri0;
    }

    @Override  // com.google.android.gms.internal.ads.zzblb
    public final IObjectWrapper zzf() throws RemoteException {
        return f.c(this.b(this.a(), 1));
    }
}

