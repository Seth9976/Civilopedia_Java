package com.google.android.gms.internal.appset;

import B.b;
import a1.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzl implements AppSetIdClient {
    public final Context a;
    public final ScheduledExecutorService b;
    public final ExecutorService c;
    public static zzl d;

    public zzl(Context context0) {
        ScheduledExecutorService scheduledExecutorService0 = Executors.newSingleThreadScheduledExecutor();
        this.b = scheduledExecutorService0;
        this.c = Executors.newSingleThreadExecutor();
        this.a = context0;
        scheduledExecutorService0.scheduleAtFixedRate(new b(this, 14), 0L, 86400L, TimeUnit.SECONDS);
    }

    public static final SharedPreferences a(Context context0) {
        return context0.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void b(Context context0) {
        SharedPreferences sharedPreferences0 = zzl.a(context0);
        long v = DefaultClock.getInstance().currentTimeMillis();
        if(!sharedPreferences0.edit().putLong("app_set_id_last_used_time", v).commit()) {
            Log.e("AppSet", "Failed to store app set ID last used time for App com.spears.civilopedia");
            throw new a("Failed to store the app set ID last used time.");  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
        }
    }

    @Override  // com.google.android.gms.appset.AppSetIdClient
    public final Task getAppSetIdInfo() {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        zzh zzh0 = new zzh(this, taskCompletionSource0);
        this.c.execute(zzh0);
        return taskCompletionSource0.getTask();
    }
}

