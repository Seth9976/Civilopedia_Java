package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nonagon.signalgeneration.zzac;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzesn implements zzetg {
    public final String a;
    public final zzfvm b;
    public final ScheduledExecutorService c;
    public final Context d;
    public final zzfcd e;
    public final zzcnf f;

    public zzesn(zzfvm zzfvm0, ScheduledExecutorService scheduledExecutorService0, String s, Context context0, zzfcd zzfcd0, zzcnf zzcnf0) {
        this.b = zzfvm0;
        this.c = scheduledExecutorService0;
        this.a = s;
        this.d = context0;
        this.e = zzfcd0;
        this.f = zzcnf0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 33;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return !((Boolean)zzay.zzc().zzb(zzbhz.zzgc)).booleanValue() || "adUnitId".equals(this.e.zzf) ? this.b.zzb(zzesj.zza) : zzfvc.zzl(() -> {
            String s = ((Boolean)zzay.zzc().zzb(zzbhz.zzgd)).booleanValue() ? AdFormat.UNKNOWN.name() : this.a;
            zzg zzg0 = this.f.zzn();
            zzdbd zzdbd0 = new zzdbd();
            zzdbd0.zzc(this.d);
            zzfcb zzfcb0 = new zzfcb();
            zzfcb0.zzs("adUnitId");
            zzfcb0.zzE(this.e.zzd);
            zzfcb0.zzr(new zzq());
            zzdbd0.zzf(zzfcb0.zzG());
            zzg0.zza(zzdbd0.zzg());
            zzac zzac0 = new zzac();
            zzac0.zza(s);
            zzg0.zzb(zzac0.zzb());
            new zzdhd();
            return zzfvc.zzf(zzfvc.zzm(((zzfut)zzfvc.zzo(zzfut.zzv(zzg0.zzc().zzc()), ((long)(((Long)zzay.zzc().zzb(zzbhz.zzge)))), TimeUnit.MILLISECONDS, this.c)), zzesl.zza, this.b), Exception.class, zzesm.zza, this.b);
        }, this.b);
    }
}

