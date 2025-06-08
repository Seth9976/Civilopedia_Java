package r1;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener;
import com.google.android.gms.measurement.internal.zzhb;

public final class c implements OnEventListener {
    public final d a;

    public c(d d0) {
        this.a = d0;
    }

    @Override  // com.google.android.gms.measurement.api.AppMeasurementSdk$OnEventListener
    public final void onEvent(String s, String s1, Bundle bundle0, long v) {
        d d0 = this.a;
        if(!d0.a.contains(s1)) {
            return;
        }
        Bundle bundle1 = new Bundle();
        String s2 = zzhb.zza(s1);
        if(s2 != null) {
            s1 = s2;
        }
        bundle1.putString("events", s1);
        d0.b.o(2, bundle1);
    }
}

