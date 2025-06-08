package com.google.android.gms.common.api;

import L0.a;
import L0.b;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;

public final class PendingResults {
    public static PendingResult canceledPendingResult() {
        PendingResult pendingResult0 = new StatusPendingResult(Looper.getMainLooper());
        ((BasePendingResult)pendingResult0).cancel();
        return pendingResult0;
    }

    public static PendingResult canceledPendingResult(Result result0) {
        Preconditions.checkNotNull(result0, "Result must not be null");
        Preconditions.checkArgument(result0.getStatus().getStatusCode() == 16, "Status code must be CommonStatusCodes.CANCELED");
        PendingResult pendingResult0 = new a(result0);
        ((BasePendingResult)pendingResult0).cancel();
        return pendingResult0;
    }

    @KeepForSdk
    public static PendingResult immediateFailedResult(Result result0, GoogleApiClient googleApiClient0) {
        Preconditions.checkNotNull(result0, "Result must not be null");
        Preconditions.checkArgument(!result0.getStatus().isSuccess(), "Status code must not be SUCCESS");
        PendingResult pendingResult0 = new a(result0, googleApiClient0);
        ((BasePendingResult)pendingResult0).setResult(result0);
        return pendingResult0;
    }

    public static OptionalPendingResult immediatePendingResult(Result result0) {
        Preconditions.checkNotNull(result0, "Result must not be null");
        b b0 = new b(null);  // 初始化器: Lcom/google/android/gms/common/api/internal/BasePendingResult;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V
        b0.setResult(result0);
        return new OptionalPendingResultImpl(b0);
    }

    @KeepForSdk
    public static OptionalPendingResult immediatePendingResult(Result result0, GoogleApiClient googleApiClient0) {
        Preconditions.checkNotNull(result0, "Result must not be null");
        b b0 = new b(googleApiClient0);  // 初始化器: Lcom/google/android/gms/common/api/internal/BasePendingResult;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V
        b0.setResult(result0);
        return new OptionalPendingResultImpl(b0);
    }

    public static PendingResult immediatePendingResult(Status status0) {
        Preconditions.checkNotNull(status0, "Result must not be null");
        PendingResult pendingResult0 = new StatusPendingResult(Looper.getMainLooper());
        ((BasePendingResult)pendingResult0).setResult(status0);
        return pendingResult0;
    }

    @KeepForSdk
    public static PendingResult immediatePendingResult(Status status0, GoogleApiClient googleApiClient0) {
        Preconditions.checkNotNull(status0, "Result must not be null");
        PendingResult pendingResult0 = new StatusPendingResult(googleApiClient0);
        ((BasePendingResult)pendingResult0).setResult(status0);
        return pendingResult0;
    }
}

