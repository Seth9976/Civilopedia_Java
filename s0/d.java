package S0;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.zaa;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class d extends zaa {
    public final int i;
    public final TaskCompletionSource j;

    public d(int v, TaskCompletionSource taskCompletionSource0) {
        this.i = v;
        this.j = taskCompletionSource0;
        super();
    }

    @Override  // com.google.android.gms.common.moduleinstall.internal.zaa
    public void zab(Status status0) {
        if(this.i != 1) {
            super.zab(status0);
            return;
        }
        TaskUtil.trySetResultOrApiException(status0, null, this.j);
    }

    @Override  // com.google.android.gms.common.moduleinstall.internal.zaa
    public void zac(Status status0, ModuleInstallIntentResponse moduleInstallIntentResponse0) {
        if(this.i != 3) {
            super.zac(status0, moduleInstallIntentResponse0);
            return;
        }
        TaskUtil.trySetResultOrApiException(status0, moduleInstallIntentResponse0, this.j);
    }

    @Override  // com.google.android.gms.common.moduleinstall.internal.zaa
    public void zad(Status status0, ModuleInstallResponse moduleInstallResponse0) {
        if(this.i != 2) {
            super.zad(status0, moduleInstallResponse0);
            return;
        }
        TaskUtil.trySetResultOrApiException(status0, moduleInstallResponse0, this.j);
    }

    @Override  // com.google.android.gms.common.moduleinstall.internal.zaa
    public void zae(Status status0, ModuleAvailabilityResponse moduleAvailabilityResponse0) {
        if(this.i != 0) {
            super.zae(status0, moduleAvailabilityResponse0);
            return;
        }
        TaskUtil.trySetResultOrApiException(status0, moduleAvailabilityResponse0, this.j);
    }
}

