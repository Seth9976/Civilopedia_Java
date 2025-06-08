package e1;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder.Notifier;
import com.google.android.gms.location.LocationListener;

public final class g implements Notifier {
    public final Location a;

    public g(Location location0) {
        this.a = location0;
    }

    @Override  // com.google.android.gms.common.api.internal.ListenerHolder$Notifier
    public final void notifyListener(Object object0) {
        ((LocationListener)object0).onLocationChanged(this.a);
    }

    @Override  // com.google.android.gms.common.api.internal.ListenerHolder$Notifier
    public final void onNotifyListenerFailed() {
    }
}

