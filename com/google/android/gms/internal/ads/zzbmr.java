package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbmr extends zzaqx implements zzbms {
    public zzbmr() {
        super("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 2) {
            IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
            zzaqy.zzc(parcel0);
            boolean z = this.zzb(iObjectWrapper0);
            parcel1.writeNoException();
            zzaqy.zzd(parcel1, z);
            return true;
        }
        return false;
    }

    public static zzbms zzc(IBinder iBinder0) {
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return iInterface0 instanceof zzbms ? ((zzbms)iInterface0) : new zzbmq(iBinder0, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

