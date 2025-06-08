package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzeix implements zzdlg {
    public final zzefg zza;

    public zzeix(zzefg zzefg0) {
        this.zza = zzefg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdlg
    public final void zza(boolean z, Context context0, zzdcg zzdcg0) {
        try {
            ((zzfcy)this.zza.zzb).zzu(z);
            ((zzfcy)this.zza.zzb).zzx(context0);
        }
        catch(zzfci zzfci0) {
            throw new zzdlf(zzfci0.getCause());
        }
    }
}

