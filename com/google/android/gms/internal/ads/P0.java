package com.google.android.gms.internal.ads;

import B.a;
import com.google.android.gms.measurement.internal.zziq;
import com.google.android.gms.measurement.internal.zziy;
import com.google.android.gms.measurement.internal.zzjy;

public final class p0 implements Runnable {
    public final int i;
    public final long j;
    public final Object k;
    public final Object l;

    public p0(Object object0, Object object1, long v, int v1) {
        this.i = v1;
        this.l = object0;
        this.k = object1;
        this.j = v;
        super();
    }

    @Override
    public final void run() {
        if(this.i != 0) {
            ((zziy)this.l).e(((zziq)this.k), false, this.j);
            ((zziy)this.l).e = null;
            zzjy zzjy0 = ((zziy)this.l).a.zzt();
            zzjy0.zzg();
            zzjy0.zza();
            zzjy0.j(new a(zzjy0, null, 14, false));
            return;
        }
        ((zzajb)this.l).i.a(((String)this.k), this.j);
        ((zzajb)this.l).i.b(((zzajb)this.l).toString());
    }
}

