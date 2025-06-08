package androidx.lifecycle;

import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzq;
import i1.S;
import java.util.concurrent.atomic.AtomicReference;

public final class z implements Runnable {
    public final int i;
    public boolean j;
    public final Object k;
    public final Object l;

    public z(p p0, g g0) {
        this.i = 0;
        super();
        this.j = false;
        this.k = p0;
        this.l = g0;
    }

    public z(zzij zzij0, AtomicReference atomicReference0, boolean z) {
        this.i = 1;
        super();
        this.l = zzij0;
        this.k = atomicReference0;
        this.j = z;
    }

    @Override
    public final void run() {
        if(this.i != 0) {
            zzjy zzjy0 = ((zzij)this.l).a.zzt();
            zzjy0.zzg();
            zzjy0.zza();
            zzq zzq0 = zzjy0.g(false);
            zzjy0.j(new S(zzjy0, ((AtomicReference)this.k), zzq0, this.j));
            return;
        }
        if(!this.j) {
            ((p)this.k).e(((g)this.l));
            this.j = true;
        }
    }
}

