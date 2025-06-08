package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzcbq {
    public static final zzcbe zza(Context context0, String s, zzbua zzbua0) {
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
        try {
            IBinder iBinder0 = ((zzcbi)zzcfm.zzb(context0, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", zzcbp.zza)).zze(iObjectWrapper0, s, zzbua0, 221908000);
            if(iBinder0 != null) {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
                return iInterface0 instanceof zzcbe ? ((zzcbe)iInterface0) : new zzcbc(iBinder0);
            }
            return null;
        }
        catch(zzcfl | RemoteException zzcfl0) {
        }
        zzcfi.zzl("#007 Could not call remote method.", zzcfl0);
        return null;
    }
}

