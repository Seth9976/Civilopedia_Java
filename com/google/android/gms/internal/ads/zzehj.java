package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;

public final class zzehj implements zzdlg {
    public final zzehk zza;
    public final zzefg zzb;

    public zzehj(zzehk zzehk0, zzefg zzefg0) {
        this.zza = zzehk0;
        this.zzb = zzefg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdlg
    public final void zza(boolean z, Context context0, zzdcg zzdcg0) {
        zzefg zzefg0 = this.zzb;
        this.zza.getClass();
        try {
            ((zzfcy)zzefg0.zzb).zzu(z);
            if(this.zza.c.zzc < ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzaB))))) {
                ((zzfcy)zzefg0.zzb).zzv();
                return;
            }
            ((zzfcy)zzefg0.zzb).zzw(context0);
            return;
        }
        catch(zzfci zzfci0) {
        }
        zzcfi.zzi("Cannot show interstitial.");
        throw new zzdlf(zzfci0.getCause());
    }
}

