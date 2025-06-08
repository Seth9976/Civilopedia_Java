package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzcfi;

public final class zzek extends RemoteCreator {
    public zzek() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override  // com.google.android.gms.dynamic.RemoteCreator
    public final Object getRemoteCreator(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterface0 instanceof zzcn ? ((zzcn)iInterface0) : new zzcn(iBinder0);
    }

    public final zzcm zza(Context context0) {
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
            IBinder iBinder0 = ((zzcn)this.a(context0)).zze(iObjectWrapper0, 221908000);
            if(iBinder0 != null) {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return iInterface0 instanceof zzcm ? ((zzcm)iInterface0) : new zzck(iBinder0);
            }
            return null;
        }
        catch(RemoteException | RemoteCreatorException remoteException0) {
        }
        zzcfi.zzk("Could not get remote MobileAdsSettingManager.", remoteException0);
        return null;
    }
}

