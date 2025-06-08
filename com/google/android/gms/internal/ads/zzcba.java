package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzcba extends zzaqx implements zzcbb {
    public zzcba() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                String s = this.zzf();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 2: {
                int v1 = this.zze();
                parcel1.writeNoException();
                parcel1.writeInt(v1);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzcbb zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        return iInterface0 instanceof zzcbb ? ((zzcbb)iInterface0) : new zzcaz(iBinder0);
    }
}

