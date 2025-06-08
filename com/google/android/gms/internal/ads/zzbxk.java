package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbxk extends zzaqx implements zzbxl {
    public zzbxk() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Intent intent0 = (Intent)zzaqy.zza(parcel0, Intent.CREATOR);
                zzaqy.zzc(parcel0);
                this.zze(intent0);
                break;
            }
            case 2: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                zzaqy.zzc(parcel0);
                this.zzg(iObjectWrapper0, s, s1);
                break;
            }
            case 3: {
                this.zzf();
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }

    public static zzbxl zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterface0 instanceof zzbxl ? ((zzbxl)iInterface0) : new zzbxj(iBinder0);
    }
}

