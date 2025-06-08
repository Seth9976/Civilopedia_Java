package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;

public final class zzebf implements zzgqu {
    public final zzgrh a;

    public zzebf(zzgrh zzgrh0) {
        this.a = zzgrh0;
    }

    public final zzebe zza() {
        Context context0 = ((zzcnl)this.a).zza();
        zzebe zzebe0 = new zzebe();  // 初始化器: Lcom/google/android/gms/internal/ads/zzeay;-><init>()V
        zzebe0.p = 1;
        zzebe0.n = new zzbzg(context0, zzt.zzt().zzb(), zzebe0, zzebe0);
        return zzebe0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }
}

