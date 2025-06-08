package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbue extends zzaqw implements zzbug {
    public zzbue(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zze() throws RemoteException {
        this.c(this.a(), 1);
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzf() throws RemoteException {
        this.c(this.a(), 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzg(int v) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(v);
        this.c(parcel0, 3);
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzh(zze zze0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zze0);
        this.c(parcel0, 23);
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzi(int v, String s) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(v);
        parcel0.writeString(s);
        this.c(parcel0, 22);
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzj(int v) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzk(zze zze0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zze(parcel0, zze0);
        this.c(parcel0, 24);
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzl(String s) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        this.c(parcel0, 21);
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzm() throws RemoteException {
        this.c(this.a(), 8);
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzn() throws RemoteException {
        this.c(this.a(), 4);
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzo() throws RemoteException {
        this.c(this.a(), 6);
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzp() throws RemoteException {
        this.c(this.a(), 5);
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzq(String s, String s1) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        this.c(parcel0, 9);
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzr(zzblv zzblv0, String s) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzblv0);
        parcel0.writeString(s);
        this.c(parcel0, 10);
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzs(zzcax zzcax0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzt(zzcbb zzcbb0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzaqy.zzg(parcel0, zzcbb0);
        this.c(parcel0, 16);
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzu() throws RemoteException {
        this.c(this.a(), 18);
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzv() throws RemoteException {
        this.c(this.a(), 11);
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzw() throws RemoteException {
        this.c(this.a(), 15);
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzx() throws RemoteException {
        this.c(this.a(), 20);
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzy() throws RemoteException {
        this.c(this.a(), 13);
    }
}

