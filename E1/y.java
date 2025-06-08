package e1;

import android.os.Looper;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.location.zzba;
import com.google.android.gms.internal.location.zzbj;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;

public final class y extends c {
    public final LocationRequest s;
    public final LocationCallback t;
    public final Looper u;

    public y(GoogleApiClient googleApiClient0, LocationRequest locationRequest0, LocationCallback locationCallback0, Looper looper0) {
        this.s = locationRequest0;
        this.t = locationCallback0;
        this.u = looper0;
        super(googleApiClient0, 1);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    public final void c(AnyClient api$AnyClient0) {
        C c0 = new C(this);
        zzba zzba0 = zzba.zza(null, this.s);
        Looper looper0 = zzbj.zza(this.u);
        ((zzaz)api$AnyClient0).zzB(zzba0, ListenerHolders.createListenerHolder(this.t, looper0, "LocationCallback"), c0);
    }
}

