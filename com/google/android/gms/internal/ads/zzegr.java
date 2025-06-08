package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;

public final class zzegr implements zzdlg {
    public final zzcga zza;

    public zzegr(zzcga zzcga0) {
        this.zza = zzcga0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdlg
    public final void zza(boolean z, Context context0, zzdcg zzdcg0) {
        try {
            zzm.zza(context0, ((AdOverlayInfoParcel)this.zza.get()), true);
        }
        catch(Exception unused_ex) {
        }
    }
}

