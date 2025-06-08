package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class zzefw implements zzefd {
    public final zzcuy a;
    public final Context b;
    public final zzdtp c;
    public final Executor d;

    public zzefw(zzcuy zzcuy0, Context context0, Executor executor0, zzdtp zzdtp0) {
        this.b = context0;
        this.a = zzcuy0;
        this.d = executor0;
        this.c = zzdtp0;
    }

    @Override  // com.google.android.gms.internal.ads.zzefd
    public final zzfvl zza(zzfbx zzfbx0, zzfbl zzfbl0) {
        return zzfvc.zzn(zzfvc.zzi(null), new zzeft(this, zzfbx0, zzfbl0), this.d);
    }

    @Override  // com.google.android.gms.internal.ads.zzefd
    public final boolean zzb(zzfbx zzfbx0, zzfbl zzfbl0) {
        return zzfbl0.zzt != null && zzfbl0.zzt.zza != null;
    }
}

