package e1;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.location.GeofencingRequest;

public final class a extends c {
    public final GeofencingRequest s;
    public final PendingIntent t;

    public a(GoogleApiClient googleApiClient0, GeofencingRequest geofencingRequest0, PendingIntent pendingIntent0) {
        this.s = geofencingRequest0;
        this.t = pendingIntent0;
        super(googleApiClient0, 0);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    public final void c(AnyClient api$AnyClient0) {
        ((zzaz)api$AnyClient0).zzv(this.s, this.t, this);
    }
}

