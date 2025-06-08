package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class zzbqx extends zzaqx implements zzbqy {
    public zzbqx() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        if(v != 1) {
            if(v != 2) {
                return false;
            }
            parcel0.readInt();
            zzaqy.zzc(parcel0);
        }
        parcel1.writeNoException();
        return true;
    }
}

