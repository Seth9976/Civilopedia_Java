package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzbmo extends zzaqx implements zzbmp {
    public zzbmo() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzaqx
    public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
        zzbmy zzbmy0;
        if(v == 1) {
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                zzbmy0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
                zzbmy0 = iInterface0 instanceof zzbmy ? ((zzbmy)iInterface0) : new zzbmw(iBinder0, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
            }
            zzaqy.zzc(parcel0);
            this.zze(zzbmy0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }

    public static zzbmp zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        return iInterface0 instanceof zzbmp ? ((zzbmp)iInterface0) : new zzbmn(iBinder0, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }
}

