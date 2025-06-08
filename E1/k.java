package e1;

import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.internal.location.zzan;
import com.google.android.gms.location.LocationSettingsResult;

public final class k extends zzan {
    public ResultHolder i;

    @Override  // com.google.android.gms.internal.location.zzao
    public final void zzb(LocationSettingsResult locationSettingsResult0) {
        this.i.setResult(locationSettingsResult0);
        this.i = null;
    }
}

