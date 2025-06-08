package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbvr extends zzaqw implements zzbvt {
    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final zzdk zze() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 5);
        zzdk zzdk0 = zzdj.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzdk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final zzbwg zzf() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 2);
        zzbwg zzbwg0 = (zzbwg)zzaqy.zza(parcel0, zzbwg.CREATOR);
        parcel0.recycle();
        return zzbwg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final zzbwg zzg() throws RemoteException {
        Parcel parcel0 = this.b(this.a(), 3);
        zzbwg zzbwg0 = (zzbwg)zzaqy.zza(parcel0, zzbwg.CREATOR);
        parcel0.recycle();
        return zzbwg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final void zzh(IObjectWrapper iObjectWrapper0, String s, Bundle bundle0, Bundle bundle1, zzq zzq0, zzbvw zzbvw0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        zzaqy.zze(parcel0, bundle0);
        zzaqy.zze(parcel0, bundle1);
        zzaqy.zze(parcel0, zzq0);
        zzaqy.zzg(parcel0, zzbvw0);
        this.c(parcel0, 1);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final void zzi(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbvh zzbvh0, zzbug zzbug0, zzq zzq0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzaqy.zze(parcel0, zzl0);
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, zzbvh0);
        zzaqy.zzg(parcel0, zzbug0);
        zzaqy.zze(parcel0, zzq0);
        this.c(parcel0, 13);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final void zzj(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbvh zzbvh0, zzbug zzbug0, zzq zzq0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzaqy.zze(parcel0, zzl0);
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, zzbvh0);
        zzaqy.zzg(parcel0, zzbug0);
        zzaqy.zze(parcel0, zzq0);
        this.c(parcel0, 21);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final void zzk(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbvk zzbvk0, zzbug zzbug0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzaqy.zze(parcel0, zzl0);
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, zzbvk0);
        zzaqy.zzg(parcel0, zzbug0);
        this.c(parcel0, 14);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final void zzl(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbvn zzbvn0, zzbug zzbug0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzaqy.zze(parcel0, zzl0);
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, zzbvn0);
        zzaqy.zzg(parcel0, zzbug0);
        this.c(parcel0, 18);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final void zzm(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbvn zzbvn0, zzbug zzbug0, zzbkp zzbkp0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzaqy.zze(parcel0, zzl0);
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, zzbvn0);
        zzaqy.zzg(parcel0, zzbug0);
        zzaqy.zze(parcel0, zzbkp0);
        this.c(parcel0, 22);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final void zzn(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbvq zzbvq0, zzbug zzbug0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzaqy.zze(parcel0, zzl0);
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, zzbvq0);
        zzaqy.zzg(parcel0, zzbug0);
        this.c(parcel0, 20);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final void zzo(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbvq zzbvq0, zzbug zzbug0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzaqy.zze(parcel0, zzl0);
        zzaqy.zzg(parcel0, iObjectWrapper0);
        zzaqy.zzg(parcel0, zzbvq0);
        zzaqy.zzg(parcel0, zzbug0);
        this.c(parcel0, 16);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final void zzp(String s) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        this.c(parcel0, 19);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final boolean zzq(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        Parcel parcel1 = this.b(parcel0, 15);
        boolean z = zzaqy.zzh(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final boolean zzr(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, iObjectWrapper0);
        Parcel parcel1 = this.b(parcel0, 17);
        boolean z = zzaqy.zzh(parcel1);
        parcel1.recycle();
        return z;
    }
}

