package com.google.android.gms.internal.ads;

import A.f;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public final class zzbul extends zzaqw implements IInterface {
    public final double zze() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 7);
        double f = parcel0.readDouble();
        parcel0.recycle();
        return f;
    }

    public final Bundle zzf() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 15);
        Bundle bundle0 = (Bundle)zzaqy.zza(parcel0, Bundle.CREATOR);
        parcel0.recycle();
        return bundle0;
    }

    public final zzdk zzg() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 17);
        zzdk zzdk0 = zzdj.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzdk0;
    }

    public final zzbkt zzh() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 19);
        zzbkt zzbkt0 = zzbks.zzj(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzbkt0;
    }

    public final zzblb zzi() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 5);
        zzblb zzblb0 = zzbla.zzg(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzblb0;
    }

    public final IObjectWrapper zzj() throws RemoteException {
        return f.c(this.b(this.a(), 18));
    }

    public final IObjectWrapper zzk() throws RemoteException {
        return f.c(this.b(this.a(), 20));
    }

    public final IObjectWrapper zzl() throws RemoteException {
        return f.c(this.b(this.a(), 21));
    }

    public final String zzm() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 4);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    public final String zzn() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 6);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    public final String zzo() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 2);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    public final String zzp() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 9);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    public final String zzq() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 8);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    public final List zzr() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 3);
        List list0 = zzaqy.zzb(parcel0);
        parcel0.recycle();
        return list0;
    }

    public final void zzs(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 11);
    }

    public final void zzt() throws RemoteException {
        this.c(this.a(), 10);
    }

    public final void zzu(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 12);
    }

    public final void zzv(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, iObjectWrapper1);
        zzaqy.zzg(parcel0, iObjectWrapper2);
        this.c(parcel0, 22);
    }

    public final void zzw(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 16);
    }

    public final boolean zzx() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 14);
        boolean z = zzaqy.zzh(parcel0);
        parcel0.recycle();
        return z;
    }

    public final boolean zzy() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 13);
        boolean z = zzaqy.zzh(parcel0);
        parcel0.recycle();
        return z;
    }
}

