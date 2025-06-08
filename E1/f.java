package e1;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzaz;

public final class f extends zzaz {
    public final ListenerHolder i;

    public f(ListenerHolder listenerHolder0) {
        this.i = listenerHolder0;
    }

    public final void zzc() {
        synchronized(this) {
            this.i.clear();
        }
    }

    @Override  // com.google.android.gms.location.zzba
    public final void zzd(LocationResult locationResult0) {
        d d0 = new d(locationResult0);
        this.i.notifyListener(d0);
    }

    @Override  // com.google.android.gms.location.zzba
    public final void zze(LocationAvailability locationAvailability0) {
        e e0 = new e(locationAvailability0);
        this.i.notifyListener(e0);
    }
}

