package com.google.android.gms.common.util.concurrent;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zzi;
import java.util.concurrent.Executor;

@KeepForSdk
public class HandlerExecutor implements Executor {
    public final zzi i;

    @KeepForSdk
    public HandlerExecutor(Looper looper0) {
        this.i = new zzi(looper0);
    }

    @Override
    public final void execute(Runnable runnable0) {
        this.i.post(runnable0);
    }
}

