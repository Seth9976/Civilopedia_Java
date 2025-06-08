package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzbqj extends zzaqx implements zzbqk {
    public zzbqj() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 2: {
                this.zzf();
                break;
            }
            case 3: {
                String s = parcel0.readString();
                zzaqy.zzc(parcel0);
                this.zze(s);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }

    public static zzbqk zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return iInterface0 instanceof zzbqk ? ((zzbqk)iInterface0) : new zzbqi(iBinder0, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

