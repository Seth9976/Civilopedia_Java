package e1;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.location.LocationRequest;

public final class z extends c {
    public final LocationRequest s;
    public final PendingIntent t;

    public z(GoogleApiClient googleApiClient0, LocationRequest locationRequest0, PendingIntent pendingIntent0) {
        this.s = locationRequest0;
        this.t = pendingIntent0;
        super(googleApiClient0, 1);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    public final void c(AnyClient api$AnyClient0) {
        C c0 = new C(this);
        ((zzaz)api$AnyClient0).zzE(this.s, this.t, c0);
    }
}

