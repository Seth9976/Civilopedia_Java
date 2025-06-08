package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzfkr implements Runnable {
    public final TaskCompletionSource zza;

    public zzfkr(TaskCompletionSource taskCompletionSource0) {
        this.zza = taskCompletionSource0;
    }

    @Override
    public final void run() {
        zzfmw zzfmw0 = zzfmw.zzc();
        this.zza.setResult(zzfmw0);
    }
}

