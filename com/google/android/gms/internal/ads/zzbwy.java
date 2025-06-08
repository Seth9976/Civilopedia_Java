package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbwy implements DisplayOpenMeasurement {
    public final zzblv a;

    public zzbwy(zzblv zzblv0) {
        this.a = zzblv0;
        try {
            zzblv0.zzl();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd$DisplayOpenMeasurement
    public final void setView(View view0) {
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(view0);
            this.a.zzo(iObjectWrapper0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd$DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.a.zzr();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return false;
        }
    }
}

