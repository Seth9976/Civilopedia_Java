package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class zzfvb {
    public final boolean a;
    public final zzfrj b;

    public zzfvb(boolean z, zzfrj zzfrj0) {
        this.a = z;
        this.b = zzfrj0;
    }

    public final zzfvl zza(Callable callable0, Executor executor0) {
        zzfvl zzfvl0 = new i8(this.b, this.a, false);  // 初始化器: Lcom/google/android/gms/internal/ads/b8;-><init>(Lcom/google/android/gms/internal/ads/zzfre;ZZ)V
        zzfvl0.x = new h8(((i8)zzfvl0), callable0, executor0);
        ((b8)zzfvl0).t();
        return zzfvl0;
    }
}

