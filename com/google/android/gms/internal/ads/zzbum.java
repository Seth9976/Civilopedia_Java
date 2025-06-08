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

public final class zzbum extends zzaqw implements IInterface {
    public final Bundle zze() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 13);
        Bundle bundle0 = (Bundle)zzaqy.zza(parcel0, Bundle.CREATOR);
        parcel0.recycle();
        return bundle0;
    }

    public final zzdk zzf() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 16);
        zzdk zzdk0 = zzdj.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzdk0;
    }

    public final zzbkt zzg() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 19);
        zzbkt zzbkt0 = zzbks.zzj(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzbkt0;
    }

    public final zzblb zzh() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 5);
        zzblb zzblb0 = zzbla.zzg(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzblb0;
    }

    public final IObjectWrapper zzi() throws RemoteException {
        return f.c(this.b(this.a(), 15));
    }

    public final IObjectWrapper zzj() throws RemoteException {
        return f.c(this.b(this.a(), 20));
    }

    public final IObjectWrapper zzk() throws RemoteException {
        return f.c(this.b(this.a(), 21));
    }

    public final String zzl() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 7);
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
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

    public final List zzp() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 3);
        List list0 = zzaqy.zzb(parcel0);
        parcel0.recycle();
        return list0;
    }

    public final void zzq(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 9);
    }

    public final void zzr() throws RemoteException {
        this.c(this.a(), 8);
    }

    public final void zzs(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 10);
    }

    public final void zzt(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, iObjectWrapper1);
        zzaqy.zzg(parcel0, iObjectWrapper2);
        this.c(parcel0, 22);
    }

    public final void zzu(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        this.c(parcel0, 14);
    }

    public final boolean zzv() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 12);
        boolean z = zzaqy.zzh(parcel0);
        parcel0.recycle();
        return z;
    }

    public final boolean zzw() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 11);
        boolean z = zzaqy.zzh(parcel0);
        parcel0.recycle();
        return z;
    }
}

