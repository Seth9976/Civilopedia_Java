package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class zzege implements zzefd {
    public final zzcws a;
    public final Context b;
    public final zzdtp c;
    public final zzfcd d;
    public final Executor e;
    public final zzfok f;

    public zzege(zzcws zzcws0, Context context0, Executor executor0, zzdtp zzdtp0, zzfcd zzfcd0, zzfok zzfok0) {
        this.b = context0;
        this.a = zzcws0;
        this.e = executor0;
        this.c = zzdtp0;
        this.d = zzfcd0;
        this.f = zzfok0;
    }

    @Override  // com.google.android.gms.internal.ads.zzefd
    public final zzfvl zza(zzfbx zzfbx0, zzfbl zzfbl0) {
        return zzfvc.zzn(zzfvc.zzi(null), new zzefy(this, zzfbx0, zzfbl0), this.e);
    }

    @Override  // com.google.android.gms.internal.ads.zzefd
    public final boolean zzb(zzfbx zzfbx0, zzfbl zzfbl0) {
        return zzfbl0.zzt != null && zzfbl0.zzt.zza != null;
    }
}

