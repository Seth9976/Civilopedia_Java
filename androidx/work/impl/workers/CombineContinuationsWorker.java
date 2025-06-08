package androidx.work.impl.workers;

import Y.k;
import Y.l;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class CombineContinuationsWorker extends Worker {
    public CombineContinuationsWorker(Context context0, WorkerParameters workerParameters0) {
        super(context0, workerParameters0);
    }

    @Override  // androidx.work.Worker
    public final l doWork() {
        return new k(this.getInputData());
    }
}

