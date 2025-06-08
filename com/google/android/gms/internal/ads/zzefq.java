package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;

public final class zzefq implements zzefd {
    public final zzcvj a;
    public final Context b;
    public final zzdtp c;
    public final zzfcd d;
    public final Executor e;
    public final zzcfo f;
    public final zzbop g;
    public final boolean h;

    public zzefq(zzcvj zzcvj0, Context context0, Executor executor0, zzdtp zzdtp0, zzfcd zzfcd0, zzcfo zzcfo0, zzbop zzbop0) {
        this.b = context0;
        this.a = zzcvj0;
        this.e = executor0;
        this.c = zzdtp0;
        this.d = zzfcd0;
        this.f = zzcfo0;
        this.g = zzbop0;
        this.h = ((Boolean)zzay.zzc().zzb(zzbhz.zzhu)).booleanValue();
    }

    @Override  // com.google.android.gms.internal.ads.zzefd
    public final zzfvl zza(zzfbx zzfbx0, zzfbl zzfbl0) {
        zzdtt zzdtt0 = new zzdtt();
        zzfvl zzfvl0 = zzfvc.zzn(zzfvc.zzi(null), new zzefo(this, zzfbl0, zzfbx0, zzdtt0), this.e);
        zzfvl0.zzc(new zzefp(zzdtt0), this.e);
        return zzfvl0;
    }

    @Override  // com.google.android.gms.internal.ads.zzefd
    public final boolean zzb(zzfbx zzfbx0, zzfbl zzfbl0) {
        return zzfbl0.zzt != null && zzfbl0.zzt.zza != null;
    }
}

