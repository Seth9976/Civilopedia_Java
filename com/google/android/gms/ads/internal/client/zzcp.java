package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaqx;

public abstract class zzcp extends zzaqx implements zzcq {
    public zzcp() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            this.zze();
            parcel1.writeNoException();
            return true;
        }
        return false;
    }

    public static zzcq zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return iInterface0 instanceof zzcq ? ((zzcq)iInterface0) : new zzco(iBinder0, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

