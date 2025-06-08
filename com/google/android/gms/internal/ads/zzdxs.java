package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzdxs implements O4 {
    public final long a;
    public final zzemp b;

    public zzdxs(long v, Context context0, zzdxl zzdxl0, zzcnf zzcnf0, String s) {
        this.a = v;
        zzezq zzezq0 = zzcnf0.zzt();
        zzezq0.zzc(context0);
        zzezq0.zza(new zzq());
        zzezq0.zzb(s);
        zzemp zzemp0 = zzezq0.zzd().zza();
        this.b = zzemp0;
        zzemp0.zzD(new P4(this, zzdxl0));
    }

    @Override  // com.google.android.gms.internal.ads.O4
    public final void zza() {
        this.b.zzx();
    }

    @Override  // com.google.android.gms.internal.ads.O4
    public final void zzb(zzl zzl0) {
        this.b.zzaa(zzl0);
    }

    @Override  // com.google.android.gms.internal.ads.O4
    public final void zzc() {
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(null);
        this.b.zzW(iObjectWrapper0);
    }
}

