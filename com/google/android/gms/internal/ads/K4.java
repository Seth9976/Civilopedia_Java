package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

public final class k4 implements zzdco, zzddh {
    public final zzfbl i;

    public k4(zzfbl zzfbl0) {
        this.i = zzfbl0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdco
    public final void zzbq(Context context0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdco
    public final void zzbs(Context context0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdco
    public final void zzbt(Context context0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzddh
    public final void zzn() {
        zzfbl zzfbl0 = this.i;
        if(zzfbl0.zzae != null && zzfbl0.zzae.zza) {
            ArrayList arrayList0 = new ArrayList();
            if(!zzfbl0.zzae.zzb.isEmpty()) {
                arrayList0.add(zzfbl0.zzae.zzb);
            }
        }
    }
}

