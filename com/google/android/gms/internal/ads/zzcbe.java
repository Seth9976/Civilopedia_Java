package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdb;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzcbe extends IInterface {
    Bundle zzb() throws RemoteException;

    zzdh zzc() throws RemoteException;

    zzcbb zzd() throws RemoteException;

    String zze() throws RemoteException;

    void zzf(zzl arg1, zzcbl arg2) throws RemoteException;

    void zzg(zzl arg1, zzcbl arg2) throws RemoteException;

    void zzh(boolean arg1) throws RemoteException;

    void zzi(zzdb arg1) throws RemoteException;

    void zzj(zzde arg1) throws RemoteException;

    void zzk(zzcbh arg1) throws RemoteException;

    void zzl(zzcbs arg1) throws RemoteException;

    void zzm(IObjectWrapper arg1) throws RemoteException;

    void zzn(IObjectWrapper arg1, boolean arg2) throws RemoteException;

    boolean zzo() throws RemoteException;

    void zzp(zzcbm arg1) throws RemoteException;
}

