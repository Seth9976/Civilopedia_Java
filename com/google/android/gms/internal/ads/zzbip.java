package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbip extends zzbiq {
    public final zzf i;
    public final String j;
    public final String k;

    public zzbip(zzf zzf0, String s, String s1) {
        this.i = zzf0;
        this.j = s;
        this.k = s1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final String zzb() {
        return this.j;
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final String zzc() {
        return this.k;
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zzd(IObjectWrapper iObjectWrapper0) {
        if(iObjectWrapper0 == null) {
            return;
        }
        View view0 = (View)ObjectWrapper.unwrap(iObjectWrapper0);
        this.i.zza(view0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zze() {
        this.i.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zzf() {
        this.i.zzc();
    }
}

