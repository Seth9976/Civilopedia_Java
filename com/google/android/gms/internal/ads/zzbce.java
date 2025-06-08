package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbce extends zzaqw implements zzbcg {
    @Override  // com.google.android.gms.internal.ads.zzbcg
    public final zzbs zze() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbcg
    public final zzdh zzf() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 5);
        zzdh zzdh0 = zzdg.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzdh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbcg
    public final void zzg(boolean z) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzd(parcel0, z);
        this.c(parcel0, 6);
    }

    @Override  // com.google.android.gms.internal.ads.zzbcg
    public final void zzh(zzde zzde0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzde0);
        this.c(parcel0, 7);
    }

    @Override  // com.google.android.gms.internal.ads.zzbcg
    public final void zzi(IObjectWrapper iObjectWrapper0, zzbcn zzbcn0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, zzbcn0);
        this.c(parcel0, 4);
    }

    @Override  // com.google.android.gms.internal.ads.zzbcg
    public final void zzj(zzbck zzbck0) throws RemoteException {
        throw null;
    }
}

