package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzaz;

public abstract class zzbzq extends zzaqx implements zzbzr {
    public zzbzq() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)zzaqy.zza(parcel0, ParcelFileDescriptor.CREATOR);
                zzaqy.zzc(parcel0);
                this.zzf(parcelFileDescriptor0);
                break;
            }
            case 2: {
                zzaz zzaz0 = (zzaz)zzaqy.zza(parcel0, zzaz.CREATOR);
                zzaqy.zzc(parcel0);
                this.zze(zzaz0);
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

