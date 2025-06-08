package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public enum j8 implements Executor {
    INSTANCE;

    @Override
    public final void execute(Runnable runnable0) {
        runnable0.run();
    }

    @Override
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}

