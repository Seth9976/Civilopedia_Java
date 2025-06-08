package i1;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzhf;

public final class i0 implements zzhf {
    public final zzci a;
    public final AppMeasurementDynamiteService b;

    public i0(AppMeasurementDynamiteService appMeasurementDynamiteService0, zzci zzci0) {
        this.b = appMeasurementDynamiteService0;
        this.a = zzci0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzhf
    public final void onEvent(String s, String s1, Bundle bundle0, long v) {
        try {
            this.a.zze(s, s1, bundle0, v);
        }
        catch(RemoteException remoteException0) {
            zzge zzge0 = this.b.i;
            if(zzge0 != null) {
                zzge0.zzay().zzk().zzb("Event listener threw exception", remoteException0);
            }
        }
    }
}

