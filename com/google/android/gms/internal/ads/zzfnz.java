package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Task;

public final class zzfnz {
    public static zzfvl zza(Task task0) {
        zzfvl zzfvl0 = new x6();  // 初始化器: Ljava/lang/Object;-><init>()V
        zzfvl0.p = task0;
        task0.addOnCompleteListener(zzfvs.zzb(), new zzfnx(((x6)zzfvl0)));
        return zzfvl0;
    }
}

