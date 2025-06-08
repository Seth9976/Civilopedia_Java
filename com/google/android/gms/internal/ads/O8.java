package com.google.android.gms.internal.ads;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

public final class o8 extends AbstractOwnableSynchronizer implements Runnable {
    public final p8 i;

    public o8(p8 p80) {
        this.i = p80;
    }

    public static void a(o8 o80, Thread thread0) {
        o80.setExclusiveOwnerThread(thread0);
    }

    @Override
    public final void run() {
    }

    @Override
    public final String toString() {
        return this.i.toString();
    }
}

