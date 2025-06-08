package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzblk;
import com.google.android.gms.internal.ads.zzbll;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbpj;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbxk;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzcao;
import com.google.android.gms.internal.ads.zzcbd;
import com.google.android.gms.internal.ads.zzcbe;
import com.google.android.gms.internal.ads.zzcdy;
import com.google.android.gms.internal.ads.zzcdz;

public final class zzca extends zzaqw implements zzcc {
    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzbo zzb(IObjectWrapper iObjectWrapper0, String s, zzbua zzbua0, int v) throws RemoteException {
        zzbo zzbo0;
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        zzaqy.zzg(parcel0, zzbua0);
        parcel0.writeInt(221908000);
        Parcel parcel1 = this.b(parcel0, 3);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzbo0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzbo0 = iInterface0 instanceof zzbo ? ((zzbo)iInterface0) : new zzbm(iBinder0);
        }
        parcel1.recycle();
        return zzbo0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzc(IObjectWrapper iObjectWrapper0, zzq zzq0, String s, zzbua zzbua0, int v) throws RemoteException {
        zzbs zzbs0;
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zze(parcel0, zzq0);
        parcel0.writeString(s);
        zzaqy.zzg(parcel0, zzbua0);
        parcel0.writeInt(221908000);
        Parcel parcel1 = this.b(parcel0, 13);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzbs0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbs0 = iInterface0 instanceof zzbs ? ((zzbs)iInterface0) : new zzbq(iBinder0);
        }
        parcel1.recycle();
        return zzbs0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzd(IObjectWrapper iObjectWrapper0, zzq zzq0, String s, zzbua zzbua0, int v) throws RemoteException {
        zzbs zzbs0;
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zze(parcel0, zzq0);
        parcel0.writeString(s);
        zzaqy.zzg(parcel0, zzbua0);
        parcel0.writeInt(221908000);
        Parcel parcel1 = this.b(parcel0, 1);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzbs0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbs0 = iInterface0 instanceof zzbs ? ((zzbs)iInterface0) : new zzbq(iBinder0);
        }
        parcel1.recycle();
        return zzbs0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zze(IObjectWrapper iObjectWrapper0, zzq zzq0, String s, zzbua zzbua0, int v) throws RemoteException {
        zzbs zzbs0;
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zze(parcel0, zzq0);
        parcel0.writeString(s);
        zzaqy.zzg(parcel0, zzbua0);
        parcel0.writeInt(221908000);
        Parcel parcel1 = this.b(parcel0, 2);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzbs0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbs0 = iInterface0 instanceof zzbs ? ((zzbs)iInterface0) : new zzbq(iBinder0);
        }
        parcel1.recycle();
        return zzbs0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzf(IObjectWrapper iObjectWrapper0, zzq zzq0, String s, int v) throws RemoteException {
        zzbs zzbs0;
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zze(parcel0, zzq0);
        parcel0.writeString(s);
        parcel0.writeInt(221908000);
        Parcel parcel1 = this.b(parcel0, 10);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzbs0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbs0 = iInterface0 instanceof zzbs ? ((zzbs)iInterface0) : new zzbq(iBinder0);
        }
        parcel1.recycle();
        return zzbs0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzcm zzg(IObjectWrapper iObjectWrapper0, int v) throws RemoteException {
        zzcm zzcm0;
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        parcel0.writeInt(221908000);
        Parcel parcel1 = this.b(parcel0, 9);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzcm0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcm0 = iInterface0 instanceof zzcm ? ((zzcm)iInterface0) : new zzck(iBinder0);
        }
        parcel1.recycle();
        return zzcm0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzblf zzh(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, iObjectWrapper1);
        Parcel parcel1 = this.b(parcel0, 5);
        zzblf zzblf0 = zzble.zzbB(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzblf0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzbll zzi(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, iObjectWrapper1);
        zzaqy.zzg(parcel0, iObjectWrapper2);
        Parcel parcel1 = this.b(parcel0, 11);
        zzbll zzbll0 = zzblk.zze(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzbll0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzbpk zzj(IObjectWrapper iObjectWrapper0, zzbua zzbua0, int v, zzbph zzbph0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, zzbua0);
        parcel0.writeInt(221908000);
        zzaqy.zzg(parcel0, zzbph0);
        Parcel parcel1 = this.b(parcel0, 16);
        zzbpk zzbpk0 = zzbpj.zzb(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzbpk0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzbxl zzk(IObjectWrapper iObjectWrapper0, zzbua zzbua0, int v) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, zzbua0);
        parcel0.writeInt(221908000);
        Parcel parcel1 = this.b(parcel0, 15);
        zzbxl zzbxl0 = zzbxk.zzb(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzbxl0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzbxv zzl(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        Parcel parcel1 = this.b(parcel0, 8);
        zzbxv zzbxv0 = zzbxu.zzF(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzbxv0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzcao zzm(IObjectWrapper iObjectWrapper0, zzbua zzbua0, int v) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzcbe zzn(IObjectWrapper iObjectWrapper0, String s, zzbua zzbua0, int v) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        zzaqy.zzg(parcel0, zzbua0);
        parcel0.writeInt(221908000);
        Parcel parcel1 = this.b(parcel0, 12);
        zzcbe zzcbe0 = zzcbd.zzq(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzcbe0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzcdz zzo(IObjectWrapper iObjectWrapper0, zzbua zzbua0, int v) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, zzbua0);
        parcel0.writeInt(221908000);
        Parcel parcel1 = this.b(parcel0, 14);
        zzcdz zzcdz0 = zzcdy.zzb(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzcdz0;
    }
}

