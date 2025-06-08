package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final class zzfks implements Continuation {
    public static final zzfks zza;

    static {
        zzfks.zza = new zzfks();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return Boolean.valueOf(task0.isSuccessful());
    }
}

