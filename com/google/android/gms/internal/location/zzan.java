package com.google.android.gms.internal.location;

import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsResult;

public abstract class zzan extends zzb implements zzao {
    public zzan() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override  // com.google.android.gms.internal.location.zzb
    public final boolean a(Parcel parcel0, int v) {
        if(v == 1) {
            this.zzb(((LocationSettingsResult)zzc.zzb(parcel0, LocationSettingsResult.CREATOR)));
            return true;
        }
        return false;
    }
}

