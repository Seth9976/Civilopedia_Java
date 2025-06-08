package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class zzcak extends zzaqx implements zzcal {
    public zzcak() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                String s = this.zzc();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 2: {
                int v1 = this.zzb();
                parcel1.writeNoException();
                parcel1.writeInt(v1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

