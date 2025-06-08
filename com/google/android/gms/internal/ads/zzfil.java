package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzfil {
    public static final zzfim a;

    static {
        zzfil.a = new zzfim();
    }

    public static void zza(Context context0) {
        Context context1 = context0.getApplicationContext();
        zzfim zzfim0 = zzfil.a;
        zzfim0.getClass();
        zzfjv.zzb(context1, "Application Context cannot be null");
        if(!zzfim0.a) {
            zzfim0.a = true;
            zzfjj.zzb().zzc(context1);
            zzfje.zza().zzc(context1);
            zzfjt.zzf(context1);
            zzfjg.zzb().zzc(context1);
        }
    }

    public static boolean zzb() [...] // Potential decryptor
}

