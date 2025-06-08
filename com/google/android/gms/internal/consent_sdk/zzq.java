package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import d1.j;
import m1.b;
import m1.c;
import m1.d;

public final class zzq implements Runnable {
    public final j zza;
    public final Activity zzb;
    public final d zzc;
    public final c zzd;
    public final b zze;

    public zzq(j j0, Activity activity0, d d0, c c0, b b0) {
        this.zza = j0;
        this.zzb = activity0;
    }

    @Override
    public final void run() {
        j j0 = this.zza;
        j0.getClass();
        try {
            throw null;
        }
        catch(RuntimeException runtimeException0) {
            String s = Log.getStackTraceString(runtimeException0);
            zzt zzt0 = new zzt(null, new zzj(1, (s.length() == 0 ? new String("Caught exception when trying to request consent info update: ") : "Caught exception when trying to request consent info update: " + s)));
            j0.a.post(zzt0);
        }
    }
}

