package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;

public final class Batch extends BasePendingResult {
    public static final class Builder {
        public final ArrayList a;
        public final GoogleApiClient b;

        public Builder(GoogleApiClient googleApiClient0) {
            this.a = new ArrayList();
            this.b = googleApiClient0;
        }

        @ResultIgnorabilityUnspecified
        public BatchResultToken add(PendingResult pendingResult0) {
            BatchResultToken batchResultToken0 = new BatchResultToken(this.a.size());
            this.a.add(pendingResult0);
            return batchResultToken0;
        }

        public Batch build() {
            return new Batch(this.a, this.b);
        }
    }

    public int p;
    public boolean q;
    public boolean r;
    public final PendingResult[] s;
    public final Object t;

    public Batch(ArrayList arrayList0, GoogleApiClient googleApiClient0) {
        super(googleApiClient0);
        this.t = new Object();
        int v = arrayList0.size();
        this.p = v;
        PendingResult[] arr_pendingResult = new PendingResult[v];
        this.s = arr_pendingResult;
        if(!arrayList0.isEmpty()) {
            for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                PendingResult pendingResult0 = (PendingResult)arrayList0.get(v1);
                this.s[v1] = pendingResult0;
                pendingResult0.addStatusListener(new a(this));
            }
            return;
        }
        this.setResult(new BatchResult(Status.RESULT_SUCCESS, arr_pendingResult));
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    public void cancel() {
        super.cancel();
        for(int v = 0; true; ++v) {
            PendingResult[] arr_pendingResult = this.s;
            if(v >= arr_pendingResult.length) {
                break;
            }
            arr_pendingResult[v].cancel();
        }
    }

    public BatchResult createFailedResult(Status status0) {
        return new BatchResult(status0, this.s);
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    public final Result createFailedResult(Status status0) {
        return this.createFailedResult(status0);
    }
}

