package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.ExecutionException;

public final class zzebx {
    public final zzfvm a;
    public final zzebe b;
    public final zzgqo c;

    public zzebx(zzfvm zzfvm0, zzebe zzebe0, zzgqo zzgqo0) {
        this.a = zzfvm0;
        this.b = zzebe0;
        this.c = zzgqo0;
    }

    public final zzfvl a(zzbzv zzbzv0, a5 a50, a5 a51, zzfuj zzfuj0) {
        zzfvl zzfvl0 = zzfvc.zzn(zzfut.zzv((zzs.zzy(zzbzv0.zzd) ? zzfvc.zzh(new zzebn(1)) : zzfvc.zzg(a50.zza(zzbzv0), ExecutionException.class, zzebo.zza, this.a))), zzfuj0, this.a);
        zzebv zzebv0 = new zzebv(this, a51, zzbzv0, zzfuj0);
        return zzfvc.zzg(zzfvl0, zzebn.class, zzebv0, this.a);
    }

    public final zzfvl zza(zzbzv zzbzv0) {
        zzebs zzebs0 = new zzebs(zzbzv0);
        return this.a(zzbzv0, new zzebt(this.b), new zzebu(this), zzebs0);
    }

    // 去混淆评级： 低(20)
    public final zzfvl zzf(zzbzv zzbzv0) {
        return zzapf.zzg(zzbzv0.zzj) ? zzfvc.zzh(new zzdzl(2, "Pool key missing from removeUrl call.")) : this.a(zzbzv0, new zzebq(this), new zzebr(this), zzebp.zza);
    }
}

