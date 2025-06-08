package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class e8 extends T7 {
    public volatile Set p;
    public volatile int q;
    public static final h r;
    public static final Logger s;

    static {
        c8 c80;
        e8.s = Logger.getLogger(e8.class.getName());
        try {
            c80 = new c8(AtomicReferenceFieldUpdater.newUpdater(e8.class, Set.class, "p"), AtomicIntegerFieldUpdater.newUpdater(e8.class, "q"));
            runtimeException0 = null;
        }
        catch(RuntimeException | Error runtimeException0) {
            c80 = new d8();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        e8.r = c80;
        if(runtimeException0 != null) {
            e8.s.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", runtimeException0);
        }
    }
}

