package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class zzch extends zzbn implements zzci {
    public zzch() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override  // com.google.android.gms.internal.measurement.zzbn
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                Parcelable parcelable0 = zzbo.zza(parcel0, Bundle.CREATOR);
                long v1 = parcel0.readLong();
                zzbo.zzc(parcel0);
                this.zze(s, s1, ((Bundle)parcelable0), v1);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                int v2 = this.zzd();
                parcel1.writeNoException();
                parcel1.writeInt(v2);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

