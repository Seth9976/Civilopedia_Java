package r1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import g1.n;

public final class f {
    public final n a;

    public f(AppMeasurementSdk appMeasurementSdk0, n n0) {
        this.a = n0;
        appMeasurementSdk0.registerOnMeasurementEventListener(new e(this));
    }
}

