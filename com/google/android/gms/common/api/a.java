package com.google.android.gms.common.api;

public final class a implements StatusListener {
    public final Batch a;

    public a(Batch batch0) {
        this.a = batch0;
    }

    @Override  // com.google.android.gms.common.api.PendingResult$StatusListener
    public final void onComplete(Status status0) {
        synchronized(this.a.t) {
            if(this.a.isCanceled()) {
                return;
            }
            if(status0.isCanceled()) {
                this.a.r = true;
            }
            else if(!status0.isSuccess()) {
                this.a.q = true;
            }
            Batch batch0 = this.a;
            int v1 = batch0.p - 1;
            batch0.p = v1;
            if(v1 == 0) {
                if(batch0.r) {
                    batch0.cancel();
                }
                else {
                    BatchResult batchResult0 = new BatchResult((batch0.q ? new Status(13) : Status.RESULT_SUCCESS), this.a.s);
                    this.a.setResult(batchResult0);
                }
            }
        }
    }
}

