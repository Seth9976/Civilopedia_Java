package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public class PendingResultUtil {
    @KeepForSdk
    public interface ResultConverter {
        @KeepForSdk
        Object convert(Result arg1);
    }

    static {
    }

    @KeepForSdk
    public static Task toResponseTask(PendingResult pendingResult0, Response response0) {
        return PendingResultUtil.toTask(pendingResult0, new d(response0));
    }

    @KeepForSdk
    public static Task toTask(PendingResult pendingResult0, ResultConverter pendingResultUtil$ResultConverter0) {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        pendingResult0.addStatusListener(new c(pendingResult0, taskCompletionSource0, pendingResultUtil$ResultConverter0));
        return taskCompletionSource0.getTask();
    }

    @KeepForSdk
    public static Task toVoidTask(PendingResult pendingResult0) {
        return PendingResultUtil.toTask(pendingResult0, new e());  // 初始化器: Ljava/lang/Object;-><init>()V
    }
}

