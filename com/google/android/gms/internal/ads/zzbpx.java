package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

public abstract class zzbpx extends zzaqx implements zzbpy {
    public zzbpx() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)zzaqy.zza(parcel0, ParcelFileDescriptor.CREATOR);
            zzaqy.zzc(parcel0);
            this.zzb(parcelFileDescriptor0);
            return true;
        }
        return false;
    }
}

