package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo;
import java.util.ArrayList;
import java.util.List;

public final class zzbwx extends AdChoicesInfo {
    public final ArrayList a;
    public final String b;

    public zzbwx(zzbkt zzbkt0) {
        this.a = new ArrayList();
        try {
            this.b = zzbkt0.zzg();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            this.b = "";
        }
        try {
            for(Object object0: zzbkt0.zzh()) {
                zzblb zzblb0 = object0 instanceof IBinder ? zzbla.zzg(((IBinder)object0)) : null;
                if(zzblb0 != null) {
                    zzbwz zzbwz0 = new zzbwz(zzblb0);
                    this.a.add(zzbwz0);
                }
            }
            return;
        }
        catch(RemoteException remoteException1) {
        }
        zzcfi.zzh("", remoteException1);
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd$AdChoicesInfo
    public final List getImages() {
        return this.a;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd$AdChoicesInfo
    public final CharSequence getText() {
        return this.b;
    }
}

