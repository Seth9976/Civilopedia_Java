package e1;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.internal.location.zzaj;
import com.google.android.gms.location.LocationStatusCodes;

public final class i extends zzaj {
    public ResultHolder i;

    @Override  // com.google.android.gms.internal.location.zzak
    public final void zzb(int v, String[] arr_s) {
        if(this.i == null) {
            Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times", new Exception());
            return;
        }
        Status status0 = LocationStatusCodes.zzb(LocationStatusCodes.zza(v));
        this.i.setResult(status0);
        this.i = null;
    }

    @Override  // com.google.android.gms.internal.location.zzak
    public final void zzc(int v, String[] arr_s) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult", new Exception());
    }

    @Override  // com.google.android.gms.internal.location.zzak
    public final void zzd(int v, PendingIntent pendingIntent0) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult", new Exception());
    }
}

