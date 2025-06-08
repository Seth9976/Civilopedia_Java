package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;

public final class zzcoe implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;

    public zzcoe(zzgrh zzgrh0, zzgrh zzgrh1) {
        this.a = zzgrh0;
        this.b = zzgrh1;
    }

    public final zzcag zza() {
        Context context0 = ((zzcnl)this.a).zza();
        zzfhu zzfhu0 = (zzfhu)this.b.zzb();
        zzt.zzf().zzb(context0, zzcfo.zza(), zzfhu0).zza("google.afma.request.getAdDictionary", zzbsx.zza, zzbsx.zza);
        return new zzcaf(context0, zzt.zzf().zzb(context0, zzcfo.zza(), zzfhu0).zza("google.afma.sdkConstants.getSdkConstants", zzbsx.zza, zzbsx.zza));
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }
}

