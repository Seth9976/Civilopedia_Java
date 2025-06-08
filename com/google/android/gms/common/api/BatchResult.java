package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.TimeUnit;

public final class BatchResult implements Result {
    public final Status i;
    public final PendingResult[] j;

    public BatchResult(Status status0, PendingResult[] arr_pendingResult) {
        this.i = status0;
        this.j = arr_pendingResult;
    }

    @Override  // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.i;
    }

    @ResultIgnorabilityUnspecified
    public Result take(BatchResultToken batchResultToken0) {
        Preconditions.checkArgument(batchResultToken0.a < this.j.length, "The result token does not belong to this batch");
        return this.j[batchResultToken0.a].await(0L, TimeUnit.MILLISECONDS);
    }
}

