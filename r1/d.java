package r1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import g1.n;
import java.util.HashSet;

public final class d {
    public final HashSet a;
    public final n b;

    public d(AppMeasurementSdk appMeasurementSdk0, n n0) {
        this.b = n0;
        appMeasurementSdk0.registerOnMeasurementEventListener(new c(this));
        this.a = new HashSet();
    }
}

