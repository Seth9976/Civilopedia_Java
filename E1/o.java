package e1;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzaz;

public final class o extends q {
    public final long r;
    public final PendingIntent s;

    public o(GoogleApiClient googleApiClient0, long v, PendingIntent pendingIntent0) {
        this.r = v;
        this.s = pendingIntent0;
        super(googleApiClient0);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    public final void c(AnyClient api$AnyClient0) {
        ((zzaz)api$AnyClient0).zzq(this.r, this.s);
        this.setResult(Status.RESULT_SUCCESS);
    }
}

