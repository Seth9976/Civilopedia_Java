package e1;

import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.location.zzbq;

public final class b extends c {
    public final zzbq s;

    public b(GoogleApiClient googleApiClient0, zzbq zzbq0) {
        this.s = zzbq0;
        super(googleApiClient0, 0);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    public final void c(AnyClient api$AnyClient0) {
        ((zzaz)api$AnyClient0).zzw(this.s, this);
    }
}

