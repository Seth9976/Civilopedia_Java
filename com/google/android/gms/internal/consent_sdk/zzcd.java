package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.os.Looper;
import d1.h;
import java.util.concurrent.Executor;

public final class zzcd {
    public static final Handler zza;
    public static final Executor zzb;

    static {
        zzcd.zza = new Handler(Looper.getMainLooper());
        zzcd.zzb = new h();
    }

    public static void zza() {
        if(Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Method must be call on main thread.");
        }
    }
}

