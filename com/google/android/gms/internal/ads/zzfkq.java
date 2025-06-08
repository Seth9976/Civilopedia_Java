package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzfkq implements Runnable {
    public final Context zza;
    public final TaskCompletionSource zzb;

    public zzfkq(Context context0, TaskCompletionSource taskCompletionSource0) {
        this.zza = context0;
        this.zzb = taskCompletionSource0;
    }

    @Override
    public final void run() {
        zzfmw zzfmw0 = zzfmw.zzb(this.zza, "GLAS", null);
        this.zzb.setResult(zzfmw0);
    }
}

