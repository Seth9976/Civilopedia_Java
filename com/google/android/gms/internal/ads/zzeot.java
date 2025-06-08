package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

public final class zzeot implements zzetg {
    public final zzfvm a;
    public final zzcer b;

    public zzeot(zzfvm zzfvm0, zzcer zzcer0) {
        this.a = zzfvm0;
        this.b = zzcer0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 10;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return ((Boolean)zzay.zzc().zzb(zzbhz.zzcj)).booleanValue() ? zzfvc.zzi(null) : zzfvc.zzm(this.b.zzj(), zzeor.zza, this.a);
    }
}

