package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

public final class zzfcx {
    public static void zza(Context context0, boolean z) {
        if(z) {
            zzcfi.zzi("This request is sent from a test device.");
            return;
        }
        zzcfi.zzi(("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + zzcfb.zzx(context0) + "\")) to get test ads on this device."));
    }

    public static void zzb(int v, Throwable throwable0, String s) {
        zzcfi.zzi(("Ad failed to load : " + v));
        zze.zzb(s, throwable0);
        if(v == 3) {
            return;
        }
        zzt.zzo().zzs(throwable0, s);
    }
}

