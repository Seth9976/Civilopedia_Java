package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.zzd;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import com.google.android.gms.common.util.ArrayUtils;

public final class zzbcx extends zzc {
    public zzbcx(Context context0, Looper looper0, BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks0, BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener0) {
        super(zzcaj.zza(context0), looper0, baseGmsClient$BaseConnectionCallbacks0, baseGmsClient$BaseOnConnectionFailedListener0, 0x7B);
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return iInterface0 instanceof zzbda ? ((zzbda)iInterface0) : new zzbda(iBinder0, "com.google.android.gms.ads.internal.cache.ICacheService");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    public final String d() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return zzd.zzb;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean zzp() {
        Feature[] arr_feature = this.getAvailableFeatures();
        return ((Boolean)zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() && ArrayUtils.contains(arr_feature, zzd.zza);
    }

    public final zzbda zzq() throws DeadObjectException {
        return (zzbda)this.getService();
    }
}

