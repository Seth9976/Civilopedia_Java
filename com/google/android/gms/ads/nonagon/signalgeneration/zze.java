package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzdwc;
import com.google.android.gms.internal.ads.zzdwm;
import java.util.Map;

public final class zze implements Runnable {
    public final zzdwm zza;
    public final zzdwc zzb;
    public final String zzc;
    public final Pair[] zzd;

    public zze(zzdwm zzdwm0, zzdwc zzdwc0, String s, Pair[] arr_pair) {
        this.zza = zzdwm0;
        this.zzb = zzdwc0;
        this.zzc = s;
        this.zzd = arr_pair;
    }

    @Override
    public final void run() {
        zzdwm zzdwm0 = this.zza;
        zzdwc zzdwc0 = this.zzb;
        String s = this.zzc;
        Pair[] arr_pair = this.zzd;
        Map map0 = zzdwc0 == null ? zzdwm0.zzc() : zzdwc0.zza();
        map0.put("action", s);
        for(int v = 0; v < arr_pair.length; ++v) {
            Pair pair0 = arr_pair[v];
            map0.put(((String)pair0.first), ((String)pair0.second));
        }
        zzdwm0.zze(map0);
    }
}

