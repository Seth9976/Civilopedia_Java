package com.google.android.gms.internal.appset;

import a1.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzh implements Runnable {
    public final zzl zza;
    public final TaskCompletionSource zzb;

    public zzh(zzl zzl0, TaskCompletionSource taskCompletionSource0) {
        this.zza = zzl0;
        this.zzb = taskCompletionSource0;
    }

    @Override
    public final void run() {
        TaskCompletionSource taskCompletionSource0 = this.zzb;
        Context context0 = this.zza.a;
        String s = zzl.a(context0).getString("app_set_id", null);
        long v = -1L;
        long v1 = zzl.a(this.zza.a).getLong("app_set_id_last_used_time", -1L);
        if(v1 != -1L) {
            v = v1 + 33696000000L;
        }
        if(s == null || DefaultClock.getInstance().currentTimeMillis() > v) {
            try {
                s = "4151e9c1-a14f-44b8-9399-fa74cf681501";
                if(!context0.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", "4151e9c1-a14f-44b8-9399-fa74cf681501").commit()) {
                    Log.e("AppSet", "Failed to store app set ID generated for App com.spears.civilopedia");
                    throw new a("Failed to store the app set ID.");  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                }
                zzl.b(context0);
                SharedPreferences sharedPreferences0 = context0.getSharedPreferences("app_set_id_storage", 0);
                long v2 = DefaultClock.getInstance().currentTimeMillis();
                if(!sharedPreferences0.edit().putLong("app_set_id_creation_time", v2).commit()) {
                    Log.e("AppSet", "Failed to store app set ID creation time for App com.spears.civilopedia");
                    throw new a("Failed to store the app set ID creation time.");  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                }
                goto label_26;
            }
            catch(a a1) {
            }
            taskCompletionSource0.setException(a1);
            return;
        }
        else {
            try {
                zzl.b(context0);
            }
            catch(a a0) {
                taskCompletionSource0.setException(a0);
                return;
            }
        }
    label_26:
        taskCompletionSource0.setResult(new AppSetIdInfo(s, 1));
    }
}

