package q1;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import g1.n;
import java.util.concurrent.ConcurrentHashMap;
import r1.f;

public final class b implements a {
    public final AppMeasurementSdk a;
    public final ConcurrentHashMap b;
    public static volatile b c;

    public b(AppMeasurementSdk appMeasurementSdk0) {
        Preconditions.checkNotNull(appMeasurementSdk0);
        this.a = appMeasurementSdk0;
        this.b = new ConcurrentHashMap();
    }

    public final d a(n n0, String s) {
        r1.d d0;
        Preconditions.checkNotNull(n0);
        if(r1.b.c.contains(s)) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap0 = this.b;
        if(!s.isEmpty() && concurrentHashMap0.containsKey(s) && concurrentHashMap0.get(s) != null) {
            return null;
        }
        AppMeasurementSdk appMeasurementSdk0 = this.a;
        if("fiam".equals(s)) {
            d0 = new r1.d(appMeasurementSdk0, n0);
        }
        else if("crash".equals(s) || "clx".equals(s)) {
            d0 = new f(appMeasurementSdk0, n0);
        }
        else {
            d0 = null;
        }
        if(d0 != null) {
            concurrentHashMap0.put(s, d0);
            return new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        return null;
    }
}

