package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;

public abstract class zzbq extends zzaqx implements zzbr {
    public zzbq() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                zzaqy.zzc(parcel0);
                boolean z = this.zzf(iObjectWrapper0, s, s1);
                parcel1.writeNoException();
                zzaqy.zzd(parcel1, z);
                return true;
            }
            case 2: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                zzaqy.zzc(parcel0);
                this.zze(iObjectWrapper1);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

