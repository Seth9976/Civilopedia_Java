package e1;

import com.google.android.gms.common.api.internal.ListenerHolder.Notifier;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;

public final class e implements Notifier {
    public final LocationAvailability a;

    public e(LocationAvailability locationAvailability0) {
        this.a = locationAvailability0;
    }

    @Override  // com.google.android.gms.common.api.internal.ListenerHolder$Notifier
    public final void notifyListener(Object object0) {
        ((LocationCallback)object0).onLocationAvailability(this.a);
    }

    @Override  // com.google.android.gms.common.api.internal.ListenerHolder$Notifier
    public final void onNotifyListenerFailed() {
    }
}

