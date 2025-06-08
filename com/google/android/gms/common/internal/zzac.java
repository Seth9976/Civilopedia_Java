package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public abstract class zzac extends zzb implements IGmsCallbacks {
    public zzac() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override  // com.google.android.gms.internal.common.zzb
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                int v1 = parcel0.readInt();
                IBinder iBinder0 = parcel0.readStrongBinder();
                Bundle bundle0 = (Bundle)zzc.zza(parcel0, Bundle.CREATOR);
                zzc.zzb(parcel0);
                this.onPostInitComplete(v1, iBinder0, bundle0);
                break;
            }
            case 2: {
                int v2 = parcel0.readInt();
                Bundle bundle1 = (Bundle)zzc.zza(parcel0, Bundle.CREATOR);
                zzc.zzb(parcel0);
                this.zzb(v2, bundle1);
                break;
            }
            case 3: {
                int v3 = parcel0.readInt();
                IBinder iBinder1 = parcel0.readStrongBinder();
                zzk zzk0 = (zzk)zzc.zza(parcel0, zzk.CREATOR);
                zzc.zzb(parcel0);
                this.zzc(v3, iBinder1, zzk0);
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

