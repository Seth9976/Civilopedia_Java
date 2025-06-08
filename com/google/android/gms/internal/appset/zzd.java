package com.google.android.gms.internal.appset;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.appset.zze;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.GmsClient;

public final class zzd extends GmsClient {
    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterface0 instanceof zzg ? ((zzg)iInterface0) : new zzg(iBinder0);  // 初始化器: Lcom/google/android/gms/internal/appset/zza;-><init>(Landroid/os/IBinder;)V
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    public final String d() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean e() {
        return true;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return zze.zzb;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api$Client
    public final int getMinApkVersion() {
        return 212800000;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }
}

