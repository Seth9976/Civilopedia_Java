package i1;

import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zziy;

public final class i implements Runnable {
    public final int i;
    public final long j;
    public final j k;

    public i(j j0, long v, int v1) {
        this.i = v1;
        this.k = j0;
        this.j = v;
        super();
    }

    @Override
    public final void run() {
        if(this.i != 0) {
            ((zziy)this.k).a.zzd().zzf(this.j);
            ((zziy)this.k).e = null;
            return;
        }
        ((zzd)this.k).c(this.j);
    }
}

