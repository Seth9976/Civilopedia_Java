package i1;

import com.google.android.gms.internal.measurement.zzpi;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzeh;
import com.google.android.gms.measurement.internal.zzij;

public final class K implements Runnable {
    public final zzai i;
    public final int j;
    public final long k;
    public final boolean l;
    public final zzai m;
    public final zzij n;

    public K(zzij zzij0, zzai zzai0, int v, long v1, boolean z, zzai zzai1) {
        this.n = zzij0;
        this.i = zzai0;
        this.j = v;
        this.k = v1;
        this.l = z;
        this.m = zzai1;
    }

    @Override
    public final void run() {
        zzij zzij0 = this.n;
        zzai zzai0 = this.i;
        zzij0.g(zzai0);
        zzij.l(this.n, this.i, this.j, this.k, false, this.l);
        zzpi.zzc();
        if(zzij0.a.zzf().zzs(null, zzeh.zzaz)) {
            zzij.k(zzij0, zzai0, this.m);
        }
    }
}

