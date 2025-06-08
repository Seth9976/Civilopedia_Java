package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;

public final class zzejo implements zzefd {
    public final Context a;
    public final zzdtp b;
    public final zzdsy c;
    public final zzfcd d;
    public final Executor e;
    public final zzcfo f;
    public final zzbop g;
    public final boolean h;

    public zzejo(Context context0, zzcfo zzcfo0, zzfcd zzfcd0, Executor executor0, zzdsy zzdsy0, zzdtp zzdtp0, zzbop zzbop0) {
        this.a = context0;
        this.d = zzfcd0;
        this.c = zzdsy0;
        this.e = executor0;
        this.f = zzcfo0;
        this.b = zzdtp0;
        this.g = zzbop0;
        this.h = ((Boolean)zzay.zzc().zzb(zzbhz.zzhu)).booleanValue();
    }

    @Override  // com.google.android.gms.internal.ads.zzefd
    public final zzfvl zza(zzfbx zzfbx0, zzfbl zzfbl0) {
        zzdtt zzdtt0 = new zzdtt();
        zzfvl zzfvl0 = zzfvc.zzn(zzfvc.zzi(null), new zzejh(this, zzfbl0, zzfbx0, zzdtt0), this.e);
        zzfvl0.zzc(new zzeji(zzdtt0), this.e);
        return zzfvl0;
    }

    @Override  // com.google.android.gms.internal.ads.zzefd
    public final boolean zzb(zzfbx zzfbx0, zzfbl zzfbl0) {
        return zzfbl0.zzt != null && zzfbl0.zzt.zza != null;
    }
}

