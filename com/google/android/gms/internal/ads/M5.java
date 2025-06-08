package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class m5 extends zzbvg {
    public final zzefg i;
    public final zzego j;

    public m5(zzego zzego0, zzefg zzefg0) {
        this.j = zzego0;
        super();
        this.i = zzefg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvh
    public final void zze(String s) {
        ((zzegz)this.i.zzc).zzi(0, s);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvh
    public final void zzf(zze zze0) {
        ((zzegz)this.i.zzc).zzh(zze0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvh
    public final void zzg(IObjectWrapper iObjectWrapper0) {
        this.j.c = (View)ObjectWrapper.unwrap(iObjectWrapper0);
        ((zzegz)this.i.zzc).zzo();
    }

    @Override  // com.google.android.gms.internal.ads.zzbvh
    public final void zzh(zzbuj zzbuj0) {
        this.j.d = zzbuj0;
        ((zzegz)this.i.zzc).zzo();
    }
}

