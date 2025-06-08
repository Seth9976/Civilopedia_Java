package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

public abstract class gb {
    public static void a(zzqb zzqb0, zzmu zzmu0) {
        LogSessionId logSessionId0 = zzmu0.zza();
        if(!logSessionId0.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            String s = logSessionId0.getStringId();
            zzqb0.zzb.setString("log-session-id", s);
        }
    }
}

