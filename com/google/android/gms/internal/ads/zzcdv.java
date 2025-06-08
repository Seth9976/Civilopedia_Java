package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

public abstract class zzcdv extends zzaqx implements zzcdw {
    public zzcdv() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                parcel0.readString();
                parcel0.readString();
                zzaqy.zzc(parcel0);
                break;
            }
            case 2: {
                String s = parcel0.readString();
                zzaqy.zzc(parcel0);
                this.zzb(s);
                break;
            }
            case 3: {
                String s1 = parcel0.readString();
                String s2 = parcel0.readString();
                Bundle bundle0 = (Bundle)zzaqy.zza(parcel0, Bundle.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzc(s1, s2, bundle0);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

