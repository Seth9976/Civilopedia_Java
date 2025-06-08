package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzbpg extends zzaqx implements zzbph {
    public zzbpg() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            String s = parcel0.readString();
            zzaqy.zzc(parcel0);
            this.zzb(s);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }

    public static zzbph zzc(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        return iInterface0 instanceof zzbph ? ((zzbph)iInterface0) : new zzbpf(iBinder0, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

