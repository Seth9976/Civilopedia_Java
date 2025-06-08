package com.google.android.gms.internal.appset;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public abstract class zze extends zzb implements zzf {
    public zze() {
        this.attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override  // com.google.android.gms.internal.appset.zzb
    public final boolean a(Parcel parcel0, int v) {
        if(v == 1) {
            this.zzb(((Status)zzc.zza(parcel0, Status.CREATOR)), ((com.google.android.gms.appset.zzc)zzc.zza(parcel0, com.google.android.gms.appset.zzc.CREATOR)));
            return true;
        }
        return false;
    }
}

