package S0;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback.Stub;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class g extends Stub {
    public final TaskCompletionSource i;

    public g(TaskCompletionSource taskCompletionSource0) {
        this.i = taskCompletionSource0;
        super();
    }

    @Override  // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status0) {
        TaskUtil.trySetResultOrApiException(status0, null, this.i);
    }
}

