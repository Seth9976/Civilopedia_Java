package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import java.util.List;

public final class zzctk implements zzdbw {
    public final zzfbo i;
    public final zzfbx j;
    public final zzfie k;
    public final zzfii l;

    public zzctk(zzfbx zzfbx0, zzfii zzfii0, zzfie zzfie0) {
        this.j = zzfbx0;
        this.l = zzfii0;
        this.k = zzfie0;
        this.i = zzfbx0.zzb.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzdbw
    public final void zza(zze zze0) {
        List list0 = this.k.zza(this.j, null, this.i.zza);
        this.l.zzd(list0);
    }
}

