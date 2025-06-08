package e1;

import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzaz;

public final class t extends c {
    public final boolean s;

    public t(GoogleApiClient googleApiClient0, boolean z) {
        this.s = z;
        super(googleApiClient0, 1);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    public final void c(AnyClient api$AnyClient0) {
        ((zzaz)api$AnyClient0).zzI(this.s);
        this.setResult(Status.RESULT_SUCCESS);
    }
}

