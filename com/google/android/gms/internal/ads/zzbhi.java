package com.google.android.gms.internal.ads;

import android.os.Environment;
import java.util.concurrent.Callable;

public final class zzbhi implements Callable {
    public static final zzbhi zza;

    static {
        zzbhi.zza = new zzbhi();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final Object call() {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}

