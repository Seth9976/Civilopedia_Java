package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzejq implements zzdlg {
    public final zzefg zza;

    public zzejq(zzefg zzefg0) {
        this.zza = zzefg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdlg
    public final void zza(boolean z, Context context0, zzdcg zzdcg0) {
        try {
            ((zzfcy)this.zza.zzb).zzu(z);
            ((zzfcy)this.zza.zzb).zzy();
        }
        catch(zzfci zzfci0) {
            zzcfi.zzk("Cannot show rewarded video.", zzfci0);
            throw new zzdlf(zzfci0.getCause());
        }
    }
}

