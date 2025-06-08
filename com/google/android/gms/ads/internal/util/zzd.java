package com.google.android.gms.ads.internal.util;

import F0.f;
import android.content.Context;
import com.google.android.gms.internal.ads.zzcfh;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzfvl;

public final class zzd {
    public static void zza(Context context0) {
        if(!zzcfh.zzk(context0)) {
            return;
        }
        if(!zzcfh.zzm()) {
            zzfvl zzfvl0 = new f(context0).zzb();
            zzcfi.zzi("Updating ad debug logging enablement.");
            zzcfy.zza(zzfvl0, "AdDebugLogUpdater.updateEnablement");
        }
    }
}

