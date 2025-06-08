package g1;

import android.location.Location;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class g extends LocationCallback {
    public final TaskCompletionSource a;
    public final FusedLocationProviderClient b;

    public g(FusedLocationProviderClient fusedLocationProviderClient0, TaskCompletionSource taskCompletionSource0) {
        this.b = fusedLocationProviderClient0;
        this.a = taskCompletionSource0;
        super();
    }

    @Override  // com.google.android.gms.location.LocationCallback
    public final void onLocationAvailability(LocationAvailability locationAvailability0) {
    }

    @Override  // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult0) {
        Location location0 = locationResult0.getLastLocation();
        this.a.trySetResult(location0);
        this.b.removeLocationUpdates(this);
    }
}

