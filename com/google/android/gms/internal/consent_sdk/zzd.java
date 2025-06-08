package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;

public abstract class zzd {
    public static zzaj a;

    public static zzd zza(Context context0) {
        synchronized(zzd.class) {
            if(zzd.a == null) {
                Application application0 = (Application)context0.getApplicationContext();
                application0.getClass();
                zzck.zzb(application0, Application.class);
                zzd.a = new zzaj(application0);
            }
            return zzd.a;
        }
    }

    public abstract zzk zzb();

    public abstract zzba zzc();
}

