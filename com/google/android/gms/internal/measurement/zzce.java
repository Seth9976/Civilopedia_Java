package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

public abstract class zzce extends zzbn implements zzcf {
    public zzce() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override  // com.google.android.gms.internal.measurement.zzbn
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Bundle bundle0 = (Bundle)zzbo.zza(parcel0, Bundle.CREATOR);
            zzbo.zzc(parcel0);
            this.zzd(bundle0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

