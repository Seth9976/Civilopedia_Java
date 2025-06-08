package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

public final class zzfzf {
    public static final Logger a;
    public static final AtomicBoolean b;

    static {
        zzfzf.a = Logger.getLogger(zzfzf.class.getName());
        zzfzf.b = new AtomicBoolean(false);
    }

    public static boolean zzb() {
        return zzfzf.b.get();
    }
}

