package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Map;

public final class zzdmy implements Runnable {
    public final zzdnc zza;
    public final boolean zzb;

    public zzdmy(zzdnc zzdnc0, boolean z) {
        this.zza = zzdnc0;
        this.zzb = z;
    }

    @Override
    public final void run() {
        View view0 = this.zza.t.zzf();
        Map map0 = this.zza.t.zzl();
        Map map1 = this.zza.t.zzm();
        this.zza.k.zzn(view0, map0, map1, this.zzb);
    }
}

