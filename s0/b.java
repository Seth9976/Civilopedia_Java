package S0;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import com.google.android.gms.common.moduleinstall.internal.zag;

public final class b extends zag {
    public final ListenerHolder i;

    public b(ListenerHolder listenerHolder0) {
        this.i = listenerHolder0;
    }

    @Override  // com.google.android.gms.common.moduleinstall.internal.zah
    public final void zab(ModuleInstallStatusUpdate moduleInstallStatusUpdate0) {
        a a0 = new a(moduleInstallStatusUpdate0);
        this.i.notifyListener(a0);
    }
}

