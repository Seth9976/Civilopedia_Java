package e1;

import android.os.Looper;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.location.zzbj;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

public final class x extends c {
    public final LocationRequest s;
    public final LocationListener t;
    public final Looper u;

    public x(GoogleApiClient googleApiClient0, LocationRequest locationRequest0, LocationListener locationListener0, Looper looper0) {
        this.s = locationRequest0;
        this.t = locationListener0;
        this.u = looper0;
        super(googleApiClient0, 1);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    public final void c(AnyClient api$AnyClient0) {
        C c0 = new C(this);
        Looper looper0 = zzbj.zza(this.u);
        ListenerHolder listenerHolder0 = ListenerHolders.createListenerHolder(this.t, looper0, "LocationListener");
        ((zzaz)api$AnyClient0).zzC(this.s, listenerHolder0, c0);
    }
}

