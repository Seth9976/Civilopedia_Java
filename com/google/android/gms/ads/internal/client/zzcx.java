package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;

public abstract class zzcx extends zzaqx implements zzcy {
    public zzcx() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            zze zze0 = (zze)zzaqy.zza(parcel0, zze.CREATOR);
            zzaqy.zzc(parcel0);
            this.zze(zze0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

