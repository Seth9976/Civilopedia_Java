package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzbcg extends IInterface {
    zzbs zze() throws RemoteException;

    zzdh zzf() throws RemoteException;

    void zzg(boolean arg1) throws RemoteException;

    void zzh(zzde arg1) throws RemoteException;

    void zzi(IObjectWrapper arg1, zzbcn arg2) throws RemoteException;

    void zzj(zzbck arg1) throws RemoteException;
}

