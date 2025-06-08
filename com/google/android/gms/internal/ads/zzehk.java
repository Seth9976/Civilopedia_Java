package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbu;
import java.util.concurrent.Executor;

public final class zzehk implements zzefl {
    public final Context a;
    public final zzdky b;
    public final zzcfo c;
    public final Executor d;

    public zzehk(Context context0, zzcfo zzcfo0, zzdky zzdky0, Executor executor0) {
        this.a = context0;
        this.c = zzcfo0;
        this.b = zzdky0;
        this.d = executor0;
    }

    @Override  // com.google.android.gms.internal.ads.zzefl
    public final Object zza(zzfbx zzfbx0, zzfbl zzfbl0, zzefg zzefg0) throws zzfci, zzeit {
        zzcym zzcym0 = new zzcym(zzfbx0, zzfbl0, zzefg0.zza);
        zzdkd zzdkd0 = new zzdkd(new zzehj(this, zzefg0), null);
        zzdka zzdka0 = this.b.zze(zzcym0, zzdkd0);
        zzdka0.zzd().zzj(new zzctj(((zzfcy)zzefg0.zzb)), this.d);
        zzekf zzekf0 = zzdka0.zzi();
        ((zzegz)zzefg0.zzc).zzc(zzekf0);
        return zzdka0.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzefl
    public final void zzb(zzfbx zzfbx0, zzfbl zzfbl0, zzefg zzefg0) throws zzfci {
        String s = zzbu.zzl(zzfbl0.zzt);
        ((zzfcy)zzefg0.zzb).zzn(this.a, zzfbx0.zza.zza.zzd, zzfbl0.zzw.toString(), s, ((zzbug)zzefg0.zzc));
    }
}

