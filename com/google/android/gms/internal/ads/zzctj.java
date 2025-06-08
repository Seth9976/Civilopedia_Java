package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzctj implements zzdco {
    public final zzfcy i;

    public zzctj(zzfcy zzfcy0) {
        this.i = zzfcy0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdco
    public final void zzbq(Context context0) {
        try {
            this.i.zzg();
        }
        catch(zzfci zzfci0) {
            zzcfi.zzk("Cannot invoke onDestroy for the mediation adapter.", zzfci0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdco
    public final void zzbs(Context context0) {
        try {
            this.i.zzs();
        }
        catch(zzfci zzfci0) {
            zzcfi.zzk("Cannot invoke onPause for the mediation adapter.", zzfci0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdco
    public final void zzbt(Context context0) {
        try {
            zzfcy zzfcy0 = this.i;
            zzfcy0.zzt();
            if(context0 != null) {
                zzfcy0.zzr(context0);
            }
        }
        catch(zzfci zzfci0) {
            zzcfi.zzk("Cannot invoke onResume for the mediation adapter.", zzfci0);
        }
    }
}

