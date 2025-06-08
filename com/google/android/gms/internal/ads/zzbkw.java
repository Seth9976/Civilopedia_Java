package com.google.android.gms.internal.ads;

import A.f;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbkw extends zzaqw implements zzbky {
    public zzbkw(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override  // com.google.android.gms.internal.ads.zzbky
    public final float zze() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 2);
        float f = parcel0.readFloat();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbky
    public final float zzf() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 6);
        float f = parcel0.readFloat();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbky
    public final float zzg() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 5);
        float f = parcel0.readFloat();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbky
    public final zzdk zzh() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 7);
        zzdk zzdk0 = zzdj.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzdk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbky
    public final IObjectWrapper zzi() throws RemoteException {
        return f.c(this.b(this.a(), 4));
    }

    @Override  // com.google.android.gms.internal.ads.zzbky
    public final void zzj(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 3);
    }

    @Override  // com.google.android.gms.internal.ads.zzbky
    public final boolean zzk() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 8);
        boolean z = zzaqy.zzh(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbky
    public final void zzl(zzbmj zzbmj0) throws RemoteException {
        throw null;
    }
}

