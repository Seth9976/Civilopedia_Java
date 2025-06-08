package g1;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class k implements ResultHolder {
    public final TaskCompletionSource a;

    public k(TaskCompletionSource taskCompletionSource0) {
        this.a = taskCompletionSource0;
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder
    public final void setFailedResult(Status status0) {
        ApiException apiException0 = new ApiException(status0);
        this.a.setException(apiException0);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder
    public final void setResult(Object object0) {
        TaskUtil.setResultOrApiException(((Status)object0), null, this.a);
    }
}

