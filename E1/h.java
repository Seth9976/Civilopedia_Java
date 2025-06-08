package e1;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.zzbc;

public final class h extends zzbc {
    public final ListenerHolder i;

    public h(ListenerHolder listenerHolder0) {
        this.i = listenerHolder0;
    }

    public final void zzc() {
        synchronized(this) {
            this.i.clear();
        }
    }

    @Override  // com.google.android.gms.location.zzbd
    public final void zzd(Location location0) {
        synchronized(this) {
            g g0 = new g(location0);
            this.i.notifyListener(g0);
        }
    }
}

