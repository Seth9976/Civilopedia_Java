package com.google.android.gms.internal.ads;

import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.internal.zzc;

public final class zzbps extends zzc {
    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return iInterface0 instanceof zzbpz ? ((zzbpz)iInterface0) : new zzbpz(iBinder0, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    public final String d() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    public final zzbpz zzp() throws DeadObjectException {
        return (zzbpz)this.getService();
    }
}

