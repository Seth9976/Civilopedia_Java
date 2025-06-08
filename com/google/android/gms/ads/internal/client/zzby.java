package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;

public abstract class zzby extends zzaqx implements zzbz {
    public zzby() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            String s = parcel0.readString();
            String s1 = parcel0.readString();
            zzaqy.zzc(parcel0);
            this.zzc(s, s1);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }

    public static zzbz zzd(IBinder iBinder0) {
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return iInterface0 instanceof zzbz ? ((zzbz)iInterface0) : new zzbx(iBinder0);
    }
}

