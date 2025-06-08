package e1;

import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.zzbi;

public final class l extends zzbi {
    public final LocationSettingsRequest r;

    public l(GoogleApiClient googleApiClient0, LocationSettingsRequest locationSettingsRequest0) {
        this.r = locationSettingsRequest0;
        super(googleApiClient0);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    public final void c(AnyClient api$AnyClient0) {
        ((zzaz)api$AnyClient0).zzL(this.r, this, null);
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    public final Result createFailedResult(Status status0) {
        return new LocationSettingsResult(status0, null);
    }
}

