package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;

public abstract class zzdd extends zzaqx implements zzde {
    public zzdd() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            zzs zzs0 = (zzs)zzaqy.zza(parcel0, zzs.CREATOR);
            zzaqy.zzc(parcel0);
            this.zze(zzs0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }

    public static zzde zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterface0 instanceof zzde ? ((zzde)iInterface0) : new zzdc(iBinder0);
    }
}

