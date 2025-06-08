package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import javax.annotation.concurrent.GuardedBy;

public final class zzfdf {
    public static Task a;
    public static final Object b;
    @VisibleForTesting
    @GuardedBy("lock")
    public static AppSetIdClient zzb;

    static {
        zzfdf.b = new Object();
    }

    public static Task zza(Context context0) {
        zzfdf.zzb(context0, false);
        synchronized(zzfdf.b) {
        }
        return zzfdf.a;
    }

    public static void zzb(Context context0, boolean z) {
        synchronized(zzfdf.b) {
            if(zzfdf.zzb == null) {
                zzfdf.zzb = AppSet.getClient(context0);
            }
            if(zzfdf.a == null || zzfdf.a.isComplete() && !zzfdf.a.isSuccessful() || z && zzfdf.a.isComplete()) {
                zzfdf.a = ((AppSetIdClient)Preconditions.checkNotNull(zzfdf.zzb, "the appSetIdClient shouldn\'t be null")).getAppSetIdInfo();
            }
        }
    }
}

