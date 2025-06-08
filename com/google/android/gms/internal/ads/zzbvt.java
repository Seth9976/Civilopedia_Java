package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzbvt extends IInterface {
    zzdk zze() throws RemoteException;

    zzbwg zzf() throws RemoteException;

    zzbwg zzg() throws RemoteException;

    void zzh(IObjectWrapper arg1, String arg2, Bundle arg3, Bundle arg4, zzq arg5, zzbvw arg6) throws RemoteException;

    void zzi(String arg1, String arg2, zzl arg3, IObjectWrapper arg4, zzbvh arg5, zzbug arg6, zzq arg7) throws RemoteException;

    void zzj(String arg1, String arg2, zzl arg3, IObjectWrapper arg4, zzbvh arg5, zzbug arg6, zzq arg7) throws RemoteException;

    void zzk(String arg1, String arg2, zzl arg3, IObjectWrapper arg4, zzbvk arg5, zzbug arg6) throws RemoteException;

    void zzl(String arg1, String arg2, zzl arg3, IObjectWrapper arg4, zzbvn arg5, zzbug arg6) throws RemoteException;

    void zzm(String arg1, String arg2, zzl arg3, IObjectWrapper arg4, zzbvn arg5, zzbug arg6, zzbkp arg7) throws RemoteException;

    void zzn(String arg1, String arg2, zzl arg3, IObjectWrapper arg4, zzbvq arg5, zzbug arg6) throws RemoteException;

    void zzo(String arg1, String arg2, zzl arg3, IObjectWrapper arg4, zzbvq arg5, zzbug arg6) throws RemoteException;

    void zzp(String arg1) throws RemoteException;

    boolean zzq(IObjectWrapper arg1) throws RemoteException;

    boolean zzr(IObjectWrapper arg1) throws RemoteException;
}

