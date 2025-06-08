package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzbqn;
import com.google.android.gms.internal.ads.zzbua;
import java.util.List;

public final class zzck extends zzaqw implements zzcm {
    public zzck(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final float zze() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 7);
        float f = parcel0.readFloat();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final String zzf() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 9);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final List zzg() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 13);
        List list0 = parcel0.createTypedArrayList(zzbqg.CREATOR);
        parcel0.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzh(String s) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        this.c(parcel0, 10);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzi() throws RemoteException {
        this.c(this.a(), 15);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzj() throws RemoteException {
        this.c(this.a(), 1);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzk(String s, IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(null);
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 6);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzl(zzcy zzcy0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzcy0);
        this.c(parcel0, 16);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzm(IObjectWrapper iObjectWrapper0, String s) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        this.c(parcel0, 5);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzn(zzbua zzbua0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzbua0);
        this.c(parcel0, 11);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzo(boolean z) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzd(parcel0, z);
        this.c(parcel0, 4);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzp(float f) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeFloat(f);
        this.c(parcel0, 2);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzq(String s) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzr(zzbqn zzbqn0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzbqn0);
        this.c(parcel0, 12);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzs(zzez zzez0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zzez0);
        this.c(parcel0, 14);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final boolean zzt() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 8);
        boolean z = zzaqy.zzh(parcel0);
        parcel0.recycle();
        return z;
    }
}

