package e1;

import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.location.LocationCallback;

public final class s extends c {
    public final LocationCallback s;

    public s(GoogleApiClient googleApiClient0, LocationCallback locationCallback0) {
        this.s = locationCallback0;
        super(googleApiClient0, 1);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    public final void c(AnyClient api$AnyClient0) {
        ((zzaz)api$AnyClient0).zzH(ListenerHolders.createListenerKey(this.s, "LocationCallback"), new C(this));
    }
}

