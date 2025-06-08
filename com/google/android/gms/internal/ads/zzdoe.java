package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import com.google.android.gms.ads.internal.util.zzg;

public final class zzdoe implements Runnable {
    public final zzdoh zza;
    public final ViewGroup zzb;

    public zzdoe(zzdoh zzdoh0, ViewGroup viewGroup0) {
        this.zza = zzdoh0;
        this.zzb = viewGroup0;
    }

    @Override
    public final void run() {
        zzdoh zzdoh0 = this.zza;
        zzdoh0.getClass();
        boolean z = this.zzb != null;
        zzdnh zzdnh0 = zzdoh0.d;
        if(zzdnh0.zzf() != null) {
            int v = zzdnh0.zzc();
            zzfcd zzfcd0 = zzdoh0.b;
            zzg zzg0 = zzdoh0.a;
            if(v != 2) {
                switch(zzdnh0.zzc()) {
                    case 1: {
                        break;
                    }
                    case 6: {
                        zzg0.zzI(zzfcd0.zzf, "2", z);
                        zzg0.zzI(zzfcd0.zzf, "1", z);
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            String s = String.valueOf(zzdnh0.zzc());
            zzg0.zzI(zzfcd0.zzf, s, z);
        }
    }
}

