package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.TimeUnit;

public final class zzdzv implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;

    public zzdzv(zzgrh zzgrh0, zzgrh zzgrh1) {
        this.a = zzgrh0;
        this.b = zzgrh1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzfgf zzfgf0 = (zzfgf)this.a.zzb();
        zzffw zzffw0 = zzffp.zza(new zzdzs(zzt.zzq().zzb(((Context)this.b.zzb()))), zzffz.zzs, zzfgf0).zzi(1L, TimeUnit.SECONDS);
        zzffs zzffs0 = new zzffs(zzdzt.zza);
        return zzffw0.zzc(Exception.class, zzffs0).zza();
    }
}

