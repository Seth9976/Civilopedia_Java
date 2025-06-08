package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;

public final class zzebb implements zzgqu {
    public final zzgrh a;

    public zzebb(zzgrh zzgrh0) {
        this.a = zzgrh0;
    }

    public final zzeba zza() {
        Context context0 = ((zzcnl)this.a).zza();
        zzeba zzeba0 = new zzeba();  // 初始化器: Lcom/google/android/gms/internal/ads/zzeay;-><init>()V
        zzeba0.n = new zzbzg(context0, zzt.zzt().zzb(), zzeba0, zzeba0);
        return zzeba0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }
}

