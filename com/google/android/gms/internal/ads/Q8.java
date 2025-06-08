package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class q8 implements Executor {
    public final Executor i;
    public final k8 j;

    public q8(Executor executor0, k8 k80) {
        this.i = executor0;
        this.j = k80;
    }

    @Override
    public final void execute(Runnable runnable0) {
        try {
            this.i.execute(runnable0);
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            this.j.zze(rejectedExecutionException0);
        }
    }
}

