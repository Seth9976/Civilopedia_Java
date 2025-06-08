package g1;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.tasks.TaskCompletionSource;
import f0.g;

public final class j extends i {
    public final g k;

    public j(TaskCompletionSource taskCompletionSource0, g g0) {
        super(1, taskCompletionSource0);
        this.k = g0;
    }

    @Override  // g1.i
    public final void zzc() {
        ((h)this.k.k).i = false;
        ((FusedLocationProviderClient)this.k.j).removeLocationUpdates(((LocationCallback)this.k.l));
        c c0 = (c)this.k.m;
        if(c0 != null) {
            c0.i.trySetResult(null);
        }
    }
}

