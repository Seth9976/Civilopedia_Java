package S0;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback.Stub;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class f extends Stub {
    public final TaskCompletionSource i;

    public f(TaskCompletionSource taskCompletionSource0) {
        this.i = taskCompletionSource0;
        super();
    }

    @Override  // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status0) {
        TaskUtil.trySetResultOrApiException(status0, Boolean.TRUE, this.i);
    }
}

