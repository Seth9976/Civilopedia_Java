package com.google.android.gms.tasks;

import A.c;
import java.util.concurrent.Executor;
import l1.h;

public final class TaskExecutors {
    public static final Executor MAIN_THREAD;
    public static final h a;

    static {
        TaskExecutors.MAIN_THREAD = new c();
        TaskExecutors.a = new h(0);
    }
}

