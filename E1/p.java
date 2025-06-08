package e1;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzaz;

public final class p extends q {
    public final PendingIntent r;

    public p(GoogleApiClient googleApiClient0, PendingIntent pendingIntent0) {
        this.r = pendingIntent0;
        super(googleApiClient0);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    public final void c(AnyClient api$AnyClient0) {
        ((zzaz)api$AnyClient0).zzt(this.r);
        this.setResult(Status.RESULT_SUCCESS);
    }
}

