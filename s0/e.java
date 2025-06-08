package S0;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.zaa;
import com.google.android.gms.common.moduleinstall.internal.zay;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicReference;

public final class e extends zaa {
    public final AtomicReference i;
    public final TaskCompletionSource j;
    public final InstallStatusListener k;
    public final zay l;

    public e(zay zay0, AtomicReference atomicReference0, TaskCompletionSource taskCompletionSource0, InstallStatusListener installStatusListener0) {
        this.l = zay0;
        this.i = atomicReference0;
        this.j = taskCompletionSource0;
        this.k = installStatusListener0;
        super();
    }

    @Override  // com.google.android.gms.common.moduleinstall.internal.zaa
    public final void zad(Status status0, ModuleInstallResponse moduleInstallResponse0) {
        if(moduleInstallResponse0 != null) {
            this.i.set(moduleInstallResponse0);
        }
        TaskUtil.trySetResultOrApiException(status0, null, this.j);
        if(status0.isSuccess() && (moduleInstallResponse0 == null || !moduleInstallResponse0.zaa())) {
            return;
        }
        ListenerKey listenerHolder$ListenerKey0 = ListenerHolders.createListenerKey(this.k, "InstallStatusListener");
        this.l.doUnregisterEventListener(listenerHolder$ListenerKey0, 27306);
    }
}

