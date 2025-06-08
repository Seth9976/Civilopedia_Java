package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbui extends zzaqx implements zzbuj {
    public zzbui() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = this.zze();
                parcel1.writeNoException();
                zzaqy.zzg(parcel1, iObjectWrapper0);
                return true;
            }
            case 2: {
                boolean z = this.zzf();
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzbuj zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return iInterface0 instanceof zzbuj ? ((zzbuj)iInterface0) : new zzbuh(iBinder0);
    }
}

