package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

public final class zzfln {
    public final Context a;
    public final Executor b;
    public final zzfku c;
    public Task d;
    public Task e;

    public zzfln(Context context0, Executor executor0, zzfku zzfku0, zzfkw zzfkw0, u6 u60, v6 v60) {
        this.a = context0;
        this.b = executor0;
        this.c = zzfku0;
    }

    public final zzaly zza() {
        Task task0 = this.d;
        return task0.isSuccessful() ? ((zzaly)task0.getResult()) : u6.a;
    }

    public final zzaly zzb() {
        Task task0 = this.e;
        return task0.isSuccessful() ? ((zzaly)task0.getResult()) : v6.a;
    }

    public static zzfln zze(Context context0, Executor executor0, zzfku zzfku0, zzfkw zzfkw0) {
        zzfln zzfln0 = new zzfln(context0, executor0, zzfku0, zzfkw0, new u6(), new v6());  // 初始化器: Ljava/lang/Object;-><init>()V / 初始化器: Ljava/lang/Object;-><init>()V
        zzfln0.d = zzfkw0.zzd() ? Tasks.call(executor0, new zzflh(zzfln0)).addOnFailureListener(executor0, new zzflj(zzfln0)) : Tasks.forResult(u6.a);
        zzfln0.e = Tasks.call(executor0, new zzfli(zzfln0)).addOnFailureListener(executor0, new zzflj(zzfln0));
        return zzfln0;
    }
}

