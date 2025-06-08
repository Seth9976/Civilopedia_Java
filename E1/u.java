package e1;

import android.location.Location;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzaz;

public final class u extends c {
    public final Location s;

    public u(GoogleApiClient googleApiClient0, Location location0) {
        this.s = location0;
        super(googleApiClient0, 1);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    public final void c(AnyClient api$AnyClient0) {
        ((zzaz)api$AnyClient0).zzJ(this.s);
        this.setResult(Status.RESULT_SUCCESS);
    }
}

