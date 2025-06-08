package i1;

import com.google.android.gms.measurement.internal.zziy;

public final class P implements Runnable {
    public final int i;
    public final zziy j;

    public P(zziy zziy0, int v) {
        this.i = v;
        this.j = zziy0;
        super();
    }

    @Override
    public final void run() {
        if(this.i != 0) {
            this.j.j = null;
            return;
        }
        this.j.e = this.j.j;
    }
}

