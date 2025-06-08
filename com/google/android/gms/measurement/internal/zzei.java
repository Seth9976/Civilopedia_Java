package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbo;
import java.util.List;

public final class zzei extends zzbm implements zzek {
    public zzei(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final String zzd(zzq zzq0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zze(parcel0, zzq0);
        Parcel parcel1 = this.b(parcel0, 11);
        String s = parcel1.readString();
        parcel1.recycle();
        return s;
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final List zze(zzq zzq0, boolean z) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zze(parcel0, zzq0);
        zzbo.zzd(parcel0, z);
        Parcel parcel1 = this.b(parcel0, 7);
        List list0 = parcel1.createTypedArrayList(zzli.CREATOR);
        parcel1.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final List zzf(String s, String s1, zzq zzq0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzbo.zze(parcel0, zzq0);
        Parcel parcel1 = this.b(parcel0, 16);
        List list0 = parcel1.createTypedArrayList(zzac.CREATOR);
        parcel1.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final List zzg(String s, String s1, String s2) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(null);
        parcel0.writeString(s1);
        parcel0.writeString(s2);
        Parcel parcel1 = this.b(parcel0, 17);
        List list0 = parcel1.createTypedArrayList(zzac.CREATOR);
        parcel1.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final List zzh(String s, String s1, boolean z, zzq zzq0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzbo.zzd(parcel0, z);
        zzbo.zze(parcel0, zzq0);
        Parcel parcel1 = this.b(parcel0, 14);
        List list0 = parcel1.createTypedArrayList(zzli.CREATOR);
        parcel1.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final List zzi(String s, String s1, String s2, boolean z) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(null);
        parcel0.writeString(s1);
        parcel0.writeString(s2);
        zzbo.zzd(parcel0, z);
        Parcel parcel1 = this.b(parcel0, 15);
        List list0 = parcel1.createTypedArrayList(zzli.CREATOR);
        parcel1.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final void zzj(zzq zzq0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zze(parcel0, zzq0);
        this.c(parcel0, 4);
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final void zzk(zzaw zzaw0, zzq zzq0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zze(parcel0, zzaw0);
        zzbo.zze(parcel0, zzq0);
        this.c(parcel0, 1);
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final void zzl(zzaw zzaw0, String s, String s1) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final void zzm(zzq zzq0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zze(parcel0, zzq0);
        this.c(parcel0, 18);
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final void zzn(zzac zzac0, zzq zzq0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zze(parcel0, zzac0);
        zzbo.zze(parcel0, zzq0);
        this.c(parcel0, 12);
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final void zzo(zzac zzac0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final void zzp(zzq zzq0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zze(parcel0, zzq0);
        this.c(parcel0, 20);
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final void zzq(long v, String s, String s1, String s2) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeLong(v);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        parcel0.writeString(s2);
        this.c(parcel0, 10);
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final void zzr(Bundle bundle0, zzq zzq0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zze(parcel0, bundle0);
        zzbo.zze(parcel0, zzq0);
        this.c(parcel0, 19);
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final void zzs(zzq zzq0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zze(parcel0, zzq0);
        this.c(parcel0, 6);
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final void zzt(zzli zzli0, zzq zzq0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zze(parcel0, zzli0);
        zzbo.zze(parcel0, zzq0);
        this.c(parcel0, 2);
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final byte[] zzu(zzaw zzaw0, String s) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zze(parcel0, zzaw0);
        parcel0.writeString(s);
        Parcel parcel1 = this.b(parcel0, 9);
        byte[] arr_b = parcel1.createByteArray();
        parcel1.recycle();
        return arr_b;
    }
}

