package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Map;

public final class zzapv extends zzaqn {
    public final Map h;
    public final View i;

    public zzapv(zzapc zzapc0, String s, String s1, zzali zzali0, int v, int v1, Map map0, View view0) {
        super(zzapc0, "e6wNdaLD6UNhzFmw+sulW0Dd6tS/ZIj4VP2rchYxgmyyl8SG0R852+ZvHvO065lU", "4WajQiAzbn6P/4aXItZyiVPs318La/hzY2eQhgLxpjo=", zzali0, v, 85);
        this.h = map0;
        this.i = view0;
    }

    @Override  // com.google.android.gms.internal.ads.zzaqn
    public final void a() {
        long v = 0x8000000000000000L;
        long v1 = this.h.containsKey(1) ? ((long)(((Long)this.h.get(1)))) : 0x8000000000000000L;
        Map map0 = this.h;
        if(map0.containsKey(2)) {
            v = (long)(((Long)map0.get(2)));
        }
        long[] arr_v = (long[])this.e.invoke(null, new long[]{v1, v}, this.a.zzb(), this.i);
        long v2 = arr_v[0];
        this.h.put(1, ((long)arr_v[1]));
        long v3 = arr_v[2];
        this.h.put(2, ((long)arr_v[3]));
        synchronized(this.d) {
            this.d.zzu(v2);
            this.d.zzt(v3);
        }
    }
}

