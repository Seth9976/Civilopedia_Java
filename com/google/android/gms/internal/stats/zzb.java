package com.google.android.gms.internal.stats;

import java.io.Closeable;

public final class zzb implements Closeable {
    public static final zzb i;

    static {
        zzb.i = new zzb();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final void close() {
    }

    public static zzb zza(boolean z, zzc zzc0) {
        return zzb.i;
    }
}

