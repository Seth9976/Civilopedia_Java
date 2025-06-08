package i1;

import com.google.android.gms.internal.measurement.zzpi;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzeh;
import com.google.android.gms.measurement.internal.zzij;

public final class J implements Runnable {
    public final zzai i;
    public final long j;
    public final int k;
    public final long l;
    public final boolean m;
    public final zzai n;
    public final zzij o;

    public J(zzij zzij0, zzai zzai0, long v, int v1, long v2, boolean z, zzai zzai1) {
        this.o = zzij0;
        this.i = zzai0;
        this.j = v;
        this.k = v1;
        this.l = v2;
        this.m = z;
        this.n = zzai1;
    }

    @Override
    public final void run() {
        zzij zzij0 = this.o;
        zzai zzai0 = this.i;
        zzij0.g(zzai0);
        zzij0.f(this.j, false);
        zzij.l(this.o, this.i, this.k, this.l, true, this.m);
        zzpi.zzc();
        if(zzij0.a.zzf().zzs(null, zzeh.zzaz)) {
            zzij.k(zzij0, zzai0, this.n);
        }
    }
}

