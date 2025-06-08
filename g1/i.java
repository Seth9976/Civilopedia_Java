package g1;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.internal.location.zzaa;
import com.google.android.gms.internal.location.zzah;
import com.google.android.gms.tasks.TaskCompletionSource;

public class i extends zzah {
    public final int i;
    public final TaskCompletionSource j;

    public i(int v, TaskCompletionSource taskCompletionSource0) {
        this.i = v;
        if(v != 1) {
            this.j = taskCompletionSource0;
            super();
            return;
        }
        super();
        this.j = taskCompletionSource0;
    }

    private final void b() {
    }

    private void c() {
    }

    @Override  // com.google.android.gms.internal.location.zzai
    public final void zzb(zzaa zzaa0) {
        if(this.i != 0) {
            TaskUtil.setResultOrApiException(zzaa0.getStatus(), this.j);
            return;
        }
        Status status0 = zzaa0.getStatus();
        TaskCompletionSource taskCompletionSource0 = this.j;
        if(status0 == null) {
            taskCompletionSource0.trySetException(new ApiException(new Status(8, "Got null status from location service")));
            return;
        }
        if(status0.getStatusCode() == 0) {
            taskCompletionSource0.setResult(Boolean.TRUE);
            return;
        }
        taskCompletionSource0.trySetException(ApiExceptionUtil.fromStatus(status0));
    }

    @Override  // com.google.android.gms.internal.location.zzai
    public void zzc() {
    }
}

