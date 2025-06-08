package e1;

import com.google.android.gms.common.api.internal.ListenerHolder.Notifier;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

public final class d implements Notifier {
    public final LocationResult a;

    public d(LocationResult locationResult0) {
        this.a = locationResult0;
    }

    @Override  // com.google.android.gms.common.api.internal.ListenerHolder$Notifier
    public final void notifyListener(Object object0) {
        ((LocationCallback)object0).onLocationResult(this.a);
    }

    @Override  // com.google.android.gms.common.api.internal.ListenerHolder$Notifier
    public final void onNotifyListenerFailed() {
    }
}

