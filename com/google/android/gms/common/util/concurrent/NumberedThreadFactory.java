package com.google.android.gms.common.util.concurrent;

import A.f;
import V0.a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
public class NumberedThreadFactory implements ThreadFactory {
    public final String a;
    public final AtomicInteger b;
    public final ThreadFactory c;

    @KeepForSdk
    public NumberedThreadFactory(String s) {
        this.b = new AtomicInteger();
        this.c = Executors.defaultThreadFactory();
        Preconditions.checkNotNull(s, "Name must not be null");
        this.a = s;
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        a a0 = new a(0, runnable0);
        Thread thread0 = this.c.newThread(a0);
        int v = this.b.getAndIncrement();
        thread0.setName(f.l(new StringBuilder(), v, this.a, "[", "]"));
        return thread0;
    }
}

