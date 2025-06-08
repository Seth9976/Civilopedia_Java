package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

public final class zzk extends RemoteCreator {
    public zzbza c;

    @VisibleForTesting
    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override  // com.google.android.gms.dynamic.RemoteCreator
    public final Object getRemoteCreator(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterface0 instanceof zzbt ? ((zzbt)iInterface0) : new zzbt(iBinder0);
    }

    public final zzbs zza(Context context0, zzq zzq0, String s, zzbua zzbua0, int v) {
        zzbhz.zzc(context0);
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzif)).booleanValue()) {
            try {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
                IBinder iBinder0 = ((zzbt)zzcfm.zzb(context0, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", zzj.zza)).zze(iObjectWrapper0, zzq0, s, zzbua0, 221908000, v);
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return iInterface0 instanceof zzbs ? ((zzbs)iInterface0) : new zzbq(iBinder0);
                }
            }
            catch(zzcfl | RemoteException | NullPointerException zzcfl0) {
                zzbza zzbza0 = zzbyy.zza(context0);
                this.c = zzbza0;
                zzbza0.zzd(zzcfl0, "AdManagerCreator.newAdManagerByDynamiteLoader");
                zzcfi.zzl("#007 Could not call remote method.", zzcfl0);
            }
            return null;
        }
        try {
            IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(context0);
            IBinder iBinder1 = ((zzbt)this.a(context0)).zze(iObjectWrapper1, zzq0, s, zzbua0, 221908000, v);
            if(iBinder1 != null) {
                IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return iInterface1 instanceof zzbs ? ((zzbs)iInterface1) : new zzbq(iBinder1);
            }
            return null;
        }
        catch(RemoteException | RemoteCreatorException remoteException0) {
        }
        zzcfi.zzf("Could not create remote AdManager.", remoteException0);
        return null;
    }
}

