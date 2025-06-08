package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo;
import java.util.ArrayList;
import java.util.List;

public final class zzbku extends AdChoicesInfo {
    public final zzbkt a;
    public final ArrayList b;
    public final String c;

    public zzbku(zzbkt zzbkt0) {
        this.b = new ArrayList();
        this.a = zzbkt0;
        try {
            this.c = zzbkt0.zzg();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            this.c = "";
        }
        try {
            for(Object object0: zzbkt0.zzh()) {
                zzblb zzblb0 = null;
                if(object0 instanceof IBinder && ((IBinder)object0) != null) {
                    IInterface iInterface0 = ((IBinder)object0).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzblb0 = iInterface0 instanceof zzblb ? ((zzblb)iInterface0) : new zzbkz(((IBinder)object0));
                }
                if(zzblb0 != null) {
                    zzblc zzblc0 = new zzblc(zzblb0);
                    this.b.add(zzblc0);
                }
            }
            return;
        }
        catch(RemoteException remoteException1) {
        }
        zzcfi.zzh("", remoteException1);
    }

    @Override  // com.google.android.gms.ads.formats.NativeAd$AdChoicesInfo
    public final List getImages() {
        return this.b;
    }

    @Override  // com.google.android.gms.ads.formats.NativeAd$AdChoicesInfo
    public final CharSequence getText() {
        return this.c;
    }
}

