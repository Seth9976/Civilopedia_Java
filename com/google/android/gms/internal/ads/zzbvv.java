package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

public abstract class zzbvv extends zzaqx implements zzbvw {
    public zzbvv() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                zzaqy.zzc(parcel0);
                this.zze(s);
                break;
            }
            case 2: {
                String s1 = parcel0.readString();
                zzaqy.zzc(parcel0);
                this.zzf(s1);
                break;
            }
            case 3: {
                zze zze0 = (zze)zzaqy.zza(parcel0, zze.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzg(zze0);
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

