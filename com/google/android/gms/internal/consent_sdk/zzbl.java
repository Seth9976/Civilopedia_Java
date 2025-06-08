package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class zzbl implements Executor {
    public final Handler zza;

    public zzbl(Handler handler0) {
        this.zza = handler0;
    }

    @Override
    public final void execute(Runnable runnable0) {
        this.zza.post(runnable0);
    }
}

