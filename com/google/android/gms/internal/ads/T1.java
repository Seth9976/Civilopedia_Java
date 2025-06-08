package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

public final class t1 implements ThreadFactory {
    @Override
    public final Thread newThread(Runnable runnable0) {
        return new Thread(runnable0, "Loader:ExtractorMediaPeriod");
    }
}

