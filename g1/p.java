package g1;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback.Stub;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class p extends Stub {
    public final TaskCompletionSource i;

    public p(TaskCompletionSource taskCompletionSource0) {
        this.i = taskCompletionSource0;
        super();
    }

    @Override  // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status0) {
        TaskUtil.setResultOrApiException(status0, this.i);
    }
}

