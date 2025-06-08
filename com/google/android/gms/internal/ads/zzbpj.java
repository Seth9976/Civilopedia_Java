package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzbpj extends zzaqx implements zzbpk {
    public zzbpj() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                zzaqy.zzc(parcel0);
                this.zzf(s);
                break;
            }
            case 2: {
                this.zze();
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }

    public static zzbpk zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
        return iInterface0 instanceof zzbpk ? ((zzbpk)iInterface0) : new zzbpi(iBinder0);
    }
}

